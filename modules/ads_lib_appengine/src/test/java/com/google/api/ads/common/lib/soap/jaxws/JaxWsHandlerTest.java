// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.soap.jaxws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.SoapCall;
import com.google.api.ads.common.lib.soap.SoapCallReturn;
import com.google.api.ads.common.lib.soap.SoapServiceDescriptor;
import com.google.api.ads.common.lib.soap.jaxws.testing.mocks.CampaignServiceInterface;
import com.google.api.ads.common.lib.soap.jaxws.testing.mocks.CampaignServiceInterfaceImpl;
import com.google.api.ads.common.lib.soap.jaxws.testing.mocks.MockJaxWsCompatibleDescriptor;
import com.google.common.collect.Lists;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;

/**
 * SOAP Client Handler implementation for use with JAX-WS.
 *
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class JaxWsHandlerTest {

  private JaxWsHandler jaxWsHandler;

  @SuppressWarnings("rawtypes") // Needed to mock Binding.getHandlerChain(),
                                // which returns a list of raw Handlers.
  private List<Handler> handlerChain;
  private JaxWsSoapContextHandler contextHandler;
  @Mock private JaxWsSoapContextHandlerFactory handlerFactory;
  @Mock private BindingProvider mockSoapClient;
  @Mock private Binding mockBinding;
  @Mock private Map<String, Object> mockRequestContext;

  public JaxWsHandlerTest() {}

  @SuppressWarnings({"unchecked", "rawtypes"})
  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    contextHandler = new JaxWsSoapContextHandler();
    when(handlerFactory.getJaxWsSoapContextHandler()).thenReturn(contextHandler);
    handlerChain = new LinkedList<Handler>();
    handlerChain.add(contextHandler);
    jaxWsHandler = new JaxWsHandler(handlerFactory);
  }

  @Test
  public void testCreateSoapClient() {
    SoapServiceDescriptor serviceDescriptor = new MockJaxWsCompatibleDescriptor();
    BindingProvider provider = jaxWsHandler.createSoapClient(serviceDescriptor);

    assertTrue(provider instanceof CampaignServiceInterfaceImpl);
    assertTrue(provider.getBinding().getHandlerChain().get(0) instanceof JaxWsSoapContextHandler);
  }

  @Test(expected = ServiceException.class)
  public void testCreateSoapClient_notJaxWsCompatible() {
    jaxWsHandler.createSoapClient(Mockito.mock(SoapServiceDescriptor.class));
  }

  @Test
  public void testInvokeSoapCall() throws SecurityException, NoSuchMethodException {
    CampaignServiceInterface soapClient = new CampaignServiceInterfaceImpl();
    Method soapCallMethod = CampaignServiceInterface.class.getMethod(
        "getTestMessage", new Class<?>[0]);
    SoapCall<BindingProvider> soapCall = new SoapCall<BindingProvider>(
        soapCallMethod, soapClient, new Object[0]);

    SoapCallReturn returnedValue = jaxWsHandler.invokeSoapCall(soapCall);

    assertEquals("Here!", returnedValue.getReturnValue());
    assertEquals(null, returnedValue.getException());
    assertEquals(CampaignServiceInterfaceImpl.endpointAddress,
        returnedValue.getRequestInfo().getUrl());
  }

  @Test
  public void testClearHeaders() {
    SOAPElement header1 = Mockito.mock(SOAPElement.class);
    SOAPElement header2 = Mockito.mock(SOAPElement.class);
    contextHandler.addHeader(null, null, header1);
    contextHandler.addHeader(null, null, header2);
    assertFalse(new HashSet<SOAPElement>().equals(contextHandler.getAddedHeaders()));

    when(mockSoapClient.getBinding()).thenReturn(mockBinding);
    when(mockBinding.getHandlerChain()).thenReturn(handlerChain);
    when(mockSoapClient.getRequestContext()).thenReturn(mockRequestContext);

    jaxWsHandler.clearHeaders(mockSoapClient);
    assertEquals(new HashSet<SOAPElement>(), contextHandler.getAddedHeaders());

    verify(mockRequestContext).put(
        MessageContext.HTTP_REQUEST_HEADERS, new HashMap<String, List<String>>());
  }

  @Test
  public void testSetHeader() {
    String namespace = "namespace";
    String headerName = "headerName";
    final SOAPElement headerValue = Mockito.mock(SOAPElement.class);

    when(mockSoapClient.getBinding()).thenReturn(mockBinding);
    when(mockBinding.getHandlerChain()).thenReturn(handlerChain);

    jaxWsHandler.setHeader(mockSoapClient, namespace, headerName, headerValue);
    assertEquals(new HashSet<SOAPElement>() {{ add(headerValue); }},
        contextHandler.getAddedHeaders());
  }

  @Test(expected = ServiceException.class)
  public void testSetHeader_fail() {
    String namespace = "namespace";
    String headerName = "headerName";
    Object headerValue = new Object();

    jaxWsHandler.setHeader(mockSoapClient, namespace, headerName, headerValue);
  }

  @Test
  public void testSetCompression_true() {
    Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
    List<String> contentEncoding = new LinkedList<String>();
    contentEncoding.add("test");
    httpHeaders.put("Content-Encoding", contentEncoding);

    when(mockSoapClient.getRequestContext()).thenReturn(mockRequestContext);
    when(mockRequestContext.get(MessageContext.HTTP_REQUEST_HEADERS))
        .thenReturn(httpHeaders);
    when(mockRequestContext.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders))
        .thenReturn(null);

    jaxWsHandler.setCompression(mockSoapClient, true);

    assertEquals(Lists.newArrayList("gzip"), httpHeaders.get("Accept-Encoding"));
    assertEquals(Lists.newArrayList("gzip"), httpHeaders.get("Content-Encoding"));
  }

  @Test
  public void testSetCompression_false() {
    Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
    List<String> contentEncoding = new LinkedList<String>();
    contentEncoding.add("gzip");
    httpHeaders.put("Content-Encoding", contentEncoding);

    when(mockSoapClient.getRequestContext()).thenReturn(mockRequestContext);
    when(mockRequestContext.get(MessageContext.HTTP_REQUEST_HEADERS))
        .thenReturn(httpHeaders);

    jaxWsHandler.setCompression(mockSoapClient, false);

    assertEquals(null, httpHeaders.get("Accept-Encoding"));
    assertEquals(null, httpHeaders.get("Content-Encoding"));
  }

  @Test
  public void testSetHttpHeaders() {
    Map<String, String> newHttpHeaders = new HashMap<String, String>();

    when(mockSoapClient.getRequestContext()).thenReturn(mockRequestContext);

    jaxWsHandler.putAllHttpHeaders(mockSoapClient, newHttpHeaders);

    verify(mockRequestContext).put(MessageContext.HTTP_REQUEST_HEADERS, newHttpHeaders);
  }

  @Test
  public void testSetEndpointAddress() {
    String newEndpointAddress = "http://www.gibberish.com";

    when(mockSoapClient.getRequestContext()).thenReturn(mockRequestContext);

    jaxWsHandler.setEndpointAddress(mockSoapClient, newEndpointAddress);

    verify(mockRequestContext).put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
        newEndpointAddress);
  }

  @Test
  public void testGetEndpointAddress() {
    String existingEndpointAddress = "http://www.google.com";

    when(mockSoapClient.getRequestContext()).thenReturn(mockRequestContext);
    when(mockRequestContext.get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY))
        .thenReturn(existingEndpointAddress);

    assertEquals(existingEndpointAddress, jaxWsHandler.getEndpointAddress(mockSoapClient));
  }

  @Test
  public void testGetHeader() {
    String namespace = "namespace";
    String headerName = "headerName";
    SOAPElement headerValue = Mockito.mock(SOAPElement.class);

    when(mockSoapClient.getBinding()).thenReturn(mockBinding);
    when(mockBinding.getHandlerChain()).thenReturn(handlerChain);
    when(headerValue.getNodeName()).thenReturn(headerName);

    assertEquals(null, jaxWsHandler.getHeader(mockSoapClient, headerName));
    jaxWsHandler.setHeader(mockSoapClient, namespace, headerName, headerValue);
    assertEquals(headerValue, jaxWsHandler.getHeader(mockSoapClient, headerName));
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testCreateSoapHeaderElement() {
    jaxWsHandler.createSoapHeaderElement(new QName("website", "name"));
  }
}

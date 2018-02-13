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

import static org.apache.commons.lang.CharEncoding.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.client.RequestInfo;
import com.google.api.ads.common.lib.conf.AdsApiConfiguration;
import com.google.api.ads.common.lib.soap.RequestInfoXPathSet;
import com.google.api.ads.common.lib.soap.ResponseInfoXPathSet;
import com.google.api.ads.common.lib.utils.NodeExtractor;
import com.google.api.ads.common.lib.utils.Streams;
import com.google.common.base.Supplier;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.slf4j.Logger;

/**
 * Tests for the {@link JaxWsSoapContextHandler} class.
 */
@RunWith(JUnit4.class)
public class JaxWsSoapContextHandlerTest {

  private JaxWsSoapContextHandler jaxWsSoapContextHandler;

  private QName wsdlService;
  @Mock private SOAPMessage mockMessage;
  @Mock private SOAPMessageContext mockSoapMessageContext;
  @Mock private SOAPEnvelope mockEnvelope;
  @Mock private SOAPPart mockSoapPart;
  @Mock private SOAPHeader mockHeader;
  @Mock private SOAPBody mockSoapBody;
  @Mock private Node firstChild;
  @Mock private NodeExtractor mockNodeExtractor;
  @Mock private AdsApiConfiguration mockAdsApiConfiguration;
  @Mock private Supplier<Transformer> mockTransformerSupplier;
  @Mock private Transformer mockTransformer;
  @Mock private Logger mockLogger;
  private RequestInfoXPathSet requestInfoXPathSet;
  private ResponseInfoXPathSet responseInfoXPathSet;
  
  private static final String OPERATION_LOCAL_NAME = "saveAdvertiser";

  public JaxWsSoapContextHandlerTest() {}

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    wsdlService = new QName("http://www.example.com", "AdvertiserService");
    requestInfoXPathSet = new RequestInfoXPathSet(
        mockAdsApiConfiguration,
        mockNodeExtractor,
        mockTransformerSupplier,
        mockLogger);
    responseInfoXPathSet = new ResponseInfoXPathSet(mockAdsApiConfiguration, mockNodeExtractor);
    jaxWsSoapContextHandler =
        new JaxWsSoapContextHandler(requestInfoXPathSet, responseInfoXPathSet);
  }

  @Test
  public void testHandleMessage_inbound() throws Exception {
    final String mockSoapXml = "<Test>Xml Message</Test>";
    Answer<Object> writeXml = new Answer<Object>() {
      @Override
      public Object answer(InvocationOnMock invocation) throws Throwable {
        OutputStream stream = (OutputStream) invocation.getArguments()[0];
        Streams.write(mockSoapXml, stream, Charset.forName(UTF_8));
        return null;
      }
    };

    when(mockSoapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY))
        .thenReturn(Boolean.FALSE);
    when(mockSoapMessageContext.getMessage()).thenReturn(mockMessage);
    Mockito.doAnswer(writeXml).when(mockMessage).writeTo(any(OutputStream.class));

    assertTrue(jaxWsSoapContextHandler.handleMessage(mockSoapMessageContext));
    assertEquals(
        mockSoapXml, jaxWsSoapContextHandler.getLastResponseInfoBuilder().build().getPayload());
  }

  @Test
  public void testHandleMessage_outboundNoHeaders() throws Exception {
    final String mockSoapXml = "<Hi>Hello world!</Hi>";
    Answer<Object> transform = new Answer<Object>() {
      @Override
      public Object answer(InvocationOnMock invocation) throws Throwable {
        StreamResult stream = (StreamResult) invocation.getArguments()[1];
        Streams.write(mockSoapXml, stream.getOutputStream(), Charset.forName(UTF_8));
        return null;
      }
    };

    when(mockSoapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY))
        .thenReturn(Boolean.TRUE);
    when(mockSoapMessageContext.getMessage()).thenReturn(mockMessage);
    when(mockMessage.getSOAPPart()).thenReturn(mockSoapPart);
    when(mockSoapPart.getEnvelope()).thenReturn(mockEnvelope);
    when(mockEnvelope.addHeader()).thenReturn(mockHeader);

    // captureServiceAndOperationNames
    when(mockSoapMessageContext.get(MessageContext.WSDL_SERVICE))
        .thenReturn(wsdlService);
    when(mockSoapMessageContext.getMessage()).thenReturn(mockMessage);
    when(mockMessage.getSOAPBody()).thenReturn(mockSoapBody);
    when(mockMessage.getSOAPPart()).thenReturn(mockSoapPart);
    when(mockSoapBody.getFirstChild()).thenReturn(firstChild);
    when(firstChild.getLocalName()).thenReturn(OPERATION_LOCAL_NAME);

    // captureSoapXml
    when(mockSoapMessageContext.getMessage()).thenReturn(mockMessage);
    when(mockTransformerSupplier.get()).thenReturn(mockTransformer);
    Mockito.doAnswer(transform).when(mockTransformer)
        .transform(any(Source.class), any(StreamResult.class));

    assertTrue(jaxWsSoapContextHandler.handleMessage(mockSoapMessageContext));
    RequestInfo requestInfo = jaxWsSoapContextHandler.getLastRequestInfoBuilder().build();
    assertEquals(mockSoapXml, requestInfo.getPayload());
    assertEquals(wsdlService.getLocalPart(), requestInfo.getServiceName());
    assertEquals(OPERATION_LOCAL_NAME, requestInfo.getMethodName());
  }

  @Test
  public void testHandleMessage_outboundWithHeaders() throws Exception {
    final String mockSoapXml = "<Hi>Hello world!</Hi>";
    Answer<Object> transform = new Answer<Object>() {
      @Override
      public Object answer(InvocationOnMock invocation) throws Throwable {
        StreamResult stream = (StreamResult) invocation.getArguments()[1];
        Streams.write(mockSoapXml, stream.getOutputStream(), Charset.forName(UTF_8));
        return null;
      }
    };
    SOAPElement mockHeader1 = Mockito.mock(SOAPElement.class);
    SOAPElement mockHeader2 = Mockito.mock(SOAPElement.class);
    SOAPElement mockHeader3 = Mockito.mock(SOAPElement.class);
    jaxWsSoapContextHandler.addHeader(null, null, mockHeader1);
    jaxWsSoapContextHandler.addHeader(null, null, mockHeader2);
    jaxWsSoapContextHandler.addHeader(null, null, mockHeader3);

    when(mockSoapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY))
        .thenReturn(Boolean.TRUE);
    when(mockSoapMessageContext.getMessage()).thenReturn(mockMessage);
    when(mockMessage.getSOAPHeader()).thenReturn(mockHeader);

    // captureServiceAndOperationNames
    when(mockSoapMessageContext.get(MessageContext.WSDL_SERVICE))
        .thenReturn(wsdlService);
    when(mockSoapMessageContext.getMessage()).thenReturn(mockMessage);
    when(mockMessage.getSOAPBody()).thenReturn(mockSoapBody);
    when(mockMessage.getSOAPPart()).thenReturn(mockSoapPart);
    when(mockSoapBody.getFirstChild()).thenReturn(firstChild);
    when(firstChild.getLocalName()).thenReturn(OPERATION_LOCAL_NAME);

    // captureSoapXml
    when(mockSoapMessageContext.getMessage()).thenReturn(mockMessage);
    when(mockTransformerSupplier.get()).thenReturn(mockTransformer);
    Mockito.doAnswer(transform).when(mockTransformer)
        .transform(any(Source.class), any(StreamResult.class));

    assertTrue(jaxWsSoapContextHandler.handleMessage(mockSoapMessageContext));
    RequestInfo requestInfo = jaxWsSoapContextHandler.getLastRequestInfoBuilder().build();
    assertEquals(mockSoapXml, requestInfo.getPayload());
    assertEquals(wsdlService.getLocalPart(), requestInfo.getServiceName());
    assertEquals(OPERATION_LOCAL_NAME, requestInfo.getMethodName());

    verify(mockHeader).addChildElement(mockHeader1);
    verify(mockHeader).addChildElement(mockHeader2);
    verify(mockHeader).addChildElement(mockHeader3);
  }

  @Test
  public void testHandleFault() throws Exception {
    final String mockSoapXml = "<Fault>Xml Message</Fault>\n<Fault.Type>fatal</Fault.Type>";
    Answer<Object> writeXml = new Answer<Object>() {
      @Override
      public Object answer(InvocationOnMock invocation) throws Throwable {
        OutputStream stream = (OutputStream) invocation.getArguments()[0];
        Streams.write(mockSoapXml, stream, Charset.forName(UTF_8));
        return null;
      }
    };

    when(mockSoapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY))
        .thenReturn(Boolean.FALSE);
    when(mockSoapMessageContext.getMessage()).thenReturn(mockMessage);
    Mockito.doAnswer(writeXml).when(mockMessage).writeTo(any(OutputStream.class));

    assertTrue(jaxWsSoapContextHandler.handleFault(mockSoapMessageContext));
    assertEquals(
        mockSoapXml, jaxWsSoapContextHandler.getLastResponseInfoBuilder().build().getPayload());
  }

  @Test
  public void testCaptureServiceAndOperationNames() throws Exception {
    when(mockSoapMessageContext.get(MessageContext.WSDL_SERVICE))
        .thenReturn(wsdlService);
    when(mockSoapMessageContext.getMessage()).thenReturn(mockMessage);
    when(mockMessage.getSOAPBody()).thenReturn(mockSoapBody);
    when(mockSoapBody.getFirstChild()).thenReturn(firstChild);
    when(firstChild.getLocalName()).thenReturn(OPERATION_LOCAL_NAME);

    jaxWsSoapContextHandler.captureServiceAndOperationNames(mockSoapMessageContext);
    RequestInfo requestInfo = jaxWsSoapContextHandler.getLastRequestInfoBuilder().build();
    assertEquals(wsdlService.getLocalPart(), requestInfo.getServiceName());
    assertEquals(OPERATION_LOCAL_NAME, requestInfo.getMethodName());
  }

  @Test
  public void testCaptureServiceAndOperationNames_soapException() throws Exception {
    when(mockSoapMessageContext.get(MessageContext.WSDL_SERVICE))
        .thenReturn(wsdlService);
    when(mockSoapMessageContext.getMessage()).thenReturn(mockMessage);
    when(mockMessage.getSOAPBody()).thenThrow(new SOAPException());

    jaxWsSoapContextHandler.captureServiceAndOperationNames(mockSoapMessageContext);
    RequestInfo requestInfo = jaxWsSoapContextHandler.getLastRequestInfoBuilder().build();
    assertEquals(wsdlService.getLocalPart(), requestInfo.getServiceName());
    assertEquals("", requestInfo.getMethodName());
  }

  @Test
  public void testHeaderMethods() {
    SOAPElement mockHeader1 = Mockito.mock(SOAPElement.class);
    SOAPElement mockHeader2 = Mockito.mock(SOAPElement.class);
    SOAPElement mockHeader3 = Mockito.mock(SOAPElement.class);
    Set<SOAPElement> expectedSet = new HashSet<SOAPElement>();

    assertEquals(expectedSet, jaxWsSoapContextHandler.getAddedHeaders());

    jaxWsSoapContextHandler.addHeader(null, null, mockHeader1);
    expectedSet.add(mockHeader1);
    assertEquals(expectedSet, jaxWsSoapContextHandler.getAddedHeaders());

    jaxWsSoapContextHandler.addHeader(null, null, mockHeader2);
    jaxWsSoapContextHandler.addHeader(null, null, mockHeader3);
    expectedSet.add(mockHeader2);
    expectedSet.add(mockHeader3);
    assertEquals(expectedSet, jaxWsSoapContextHandler.getAddedHeaders());

    jaxWsSoapContextHandler.clearHeaders();
    expectedSet.clear();
    assertEquals(expectedSet, jaxWsSoapContextHandler.getAddedHeaders());
  }
}

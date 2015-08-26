// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.soap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.testing.MockSoapClient;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPHeaderElement;

/**
 * Tests for {@link SoapClientHandler}.
 */
@RunWith(JUnit4.class)
public class SoapClientHandlerTest {

  private SoapClientHandler<Object> soapClientHandler;

  private MockSoapClient soapClient;
  @Mock private SoapCall<Object> soapCall;

  @Rule public ExpectedException thrown = ExpectedException.none();

  @SuppressWarnings("unchecked")
  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    soapClient = new MockSoapClient();
    soapClientHandler = new SoapClientHandlerImpl();
  }

  @Test
  public void testProcessArgs() throws Exception {
    Object[] args =
        new Object[] {new Object[] {
            new Double(1.0), new String("2"), new Long(3)}, new String("4")};
    Object[] processedArgs =
        soapClientHandler.processSoapArguments(MockSoapClient.class.getMethod("lotsOfArgsCall",
            Object.class, Object[].class, Object.class, Object.class), args);

    assertEquals(args[0], processedArgs[0]);
    assertEquals(args[1], processedArgs[1]);
    assertNull(processedArgs[2]);
    assertNull(processedArgs[3]);
    assertEquals(4, processedArgs.length);
  }

  @Test
  public void testProcessArgs_emptyArgs() throws Exception {
    Object[] args = new Object[] {};
    Object[] processedArgs =
        soapClientHandler.processSoapArguments(MockSoapClient.class.getMethod("lotsOfArgsCall",
            Object.class, Object[].class, Object.class, Object.class), args);

    assertNull(processedArgs[0]);
    assertNull(processedArgs[1]);
    assertNull(processedArgs[2]);
    assertNull(processedArgs[3]);
    assertEquals(4, processedArgs.length);
  }

  @Test
  public void testProcessArgs_emptyMethod() throws Exception {
    Object[] args = new Object[] {};
    Object[] processedArgs =
        soapClientHandler.processSoapArguments(MockSoapClient.class.getMethod("emptyCall"), args);
    assertEquals(0, processedArgs.length);
  }

  @Test
  public void testProcessArgs_null() throws Exception {
    Object[] args = null;
    Object[] processedArgs =
        soapClientHandler.processSoapArguments(MockSoapClient.class.getMethod("emptyCall"), args);
    assertNull(processedArgs);
  }

  @Test
  public void testProcessArgs_tooMany() throws Exception {
    Object[] args =
      new Object[] {new Object[] {new Double(1.0), new String("2"), new Long(3)}, new String("4")};
    Object[] processedArgs =
        soapClientHandler.processSoapArguments(MockSoapClient.class.getMethod("emptyCall"), args);
    assertEquals(args[0], processedArgs[0]);
    assertEquals(args[1], processedArgs[1]);
    assertEquals(2, processedArgs.length);
  }

  @Test
  public void testGetSoapClientMethod() throws Exception {
    Method method =
        soapClientHandler.getSoapClientMethod(soapClient, SimilarMockSoapClient.class.getMethod(
            "identityCall", Object[].class, Object.class, Object.class));

    assertEquals(MockSoapClient.class.getMethod("identityCall", Object[].class), method);
  }

  @Test
  public void testGetSoapClientMethod_noMethod() throws Exception {
    thrown.expect(NoSuchMethodException.class);
    soapClientHandler.getSoapClientMethod(soapClient, SimilarMockSoapClient.class.getMethod(
        "noSuchMethod", Object[].class, Object.class, Object.class));
  }

  @Test
  public void testGetSoapClientMethod_incorrectReturnType() throws Exception {
    thrown.expect(NoSuchMethodException.class);
    soapClientHandler.getSoapClientMethod(soapClient,
        SimilarMockSoapClient.class.getMethod("voidCall", Object[].class));
  }

  @Test
  public void testCall_identityCall() throws Throwable {
    Object[] args = new Object[] {new Long(1), "2", new Double(3.0)};

    when(soapCall.getSoapClientMethod()).thenReturn(
        MockSoapClient.class.getMethod("identityCall", Object[].class));
    when(soapCall.getSoapClient()).thenReturn(new MockSoapClient());
    when(soapCall.getSoapArgs()).thenReturn(new Object[] {args});

    Object result = soapClientHandler.invoke(soapCall);

    assertSame(args, result);
  }

  @Test
  public void testInvoke_voidCall() throws Exception {
    Object[] args = new Object[] {"2", 1};

    when(soapCall.getSoapClientMethod()).thenReturn(
        MockSoapClient.class.getMethod("voidCall", Object[].class));
    when(soapCall.getSoapClient()).thenReturn(new MockSoapClient());
    when(soapCall.getSoapArgs()).thenReturn(new Object[] {args});

    Object result = soapClientHandler.invoke(soapCall);

    assertNull(result);
  }

  @Test
  public void testInvoke_emptyCall() throws Exception {
    Object[] args = null;

    when(soapCall.getSoapClientMethod()).thenReturn(
        MockSoapClient.class.getMethod("emptyCall"));
    when(soapCall.getSoapClient()).thenReturn(new MockSoapClient());
    when(soapCall.getSoapArgs()).thenReturn(args);

    Object result = soapClientHandler.invoke(soapCall);

    assertNull(result);
  }

  @Test
  public void testInvoke_lotsOfArgs() throws Exception {
    Object firstArg = new Object();
    Object[] args = new Object[] {firstArg, new Object[] {}, new Object(), new Object()};

    when(soapCall.getSoapClientMethod()).thenReturn(
        MockSoapClient.class.getMethod("lotsOfArgsCall",
            Object.class, Object[].class, Object.class, Object.class));
    when(soapCall.getSoapClient()).thenReturn(new MockSoapClient());
    when(soapCall.getSoapArgs()).thenReturn(args);

    Object result = soapClientHandler.invoke(soapCall);

    assertSame(firstArg, result);
  }

  @Test
  public void testInvoke_overloadedOneParam() throws Exception {
    Object[] args = new Object[] {1};

    when(soapCall.getSoapClientMethod()).thenReturn(
        MockSoapClient.class.getMethod("testOverloaded", int.class));
    when(soapCall.getSoapClient()).thenReturn(new MockSoapClient());
    when(soapCall.getSoapArgs()).thenReturn(args);

    Object result = soapClientHandler.invoke(soapCall);

    assertSame(1, result);
  }

  @Test
  public void testInvoke_overloadedTwoParams() throws Exception {
    Object[] args = new Object[] {"moo", "cow"};

    when(soapCall.getSoapClientMethod()).thenReturn(
        MockSoapClient.class.getMethod("testOverloaded", String.class, String.class));
    when(soapCall.getSoapClient()).thenReturn(new MockSoapClient());
    when(soapCall.getSoapArgs()).thenReturn(args);

    Object result = soapClientHandler.invoke(soapCall);

    assertSame("moo", result);
  }

  @Test
  public void testCall_exception() throws Throwable {
    Object[] args = new Object[] {new Long(1), "2", new Double(3.0)};
    MockSoapClient mockSoapClient = new MockSoapClient();

    when(soapCall.getSoapClientMethod()).thenReturn(
        MockSoapClient.class.getMethod("throwException", Object[].class));
    when(soapCall.getSoapClient()).thenReturn(mockSoapClient);
    when(soapCall.getSoapArgs()).thenReturn(new Object[] {args});

    thrown.expect(InvocationTargetException.class);
    thrown.expectCause(Matchers.<Exception>is(MockSoapClient.EXCEPTION));
    soapClientHandler.invoke(soapCall);
  }

  @Test
  public void testCall_null() throws Throwable {
    when(soapCall.getSoapClientMethod()).thenReturn(
        MockSoapClient.class.getMethod("identityCall", Object[].class));
    when(soapCall.getSoapClient()).thenReturn(new MockSoapClient());
    when(soapCall.getSoapArgs()).thenReturn(new Object[] {null});

    Object result = soapClientHandler.invoke(soapCall);

    assertNull(result);
  }

  /**
   * Mock class similar to {@link MockSoapClient}.
   */
  private static class SimilarMockSoapClient {

    /**
     * Returns the passed in {@code args} as a single {@code Object}.
     */
    @SuppressWarnings("unused") // Used in test.
    public Object identityCall(Object[] args, Object otherArg, Object otherArg2) {
      return args;
    }

    /**
     * Returns the passed in {@code args} as a single {@code Object}.
     */
    @SuppressWarnings("unused") // Used in test.
    public Object voidCall(Object[] args) {
      return args;
    }

    /**
     * Returns the passed in {@code args} as a single {@code Object}.
     */
    @SuppressWarnings("unused") // Used in test.
    public Object noSuchMethod(Object[] args, Object otherArg, Object otherArg2) {
      return args;
    }
  }

  /**
   * Bare-bones implementation of {@link SoapClientHandler} for testing.
   *
   */
  private static class SoapClientHandlerImpl extends SoapClientHandler<Object> {

    @Override
    public Object createSoapClient(SoapServiceDescriptor soapServiceDescriptor)
        throws ServiceException {
      throw new UnsupportedOperationException();
    }

    @Override
    public SoapCallReturn invokeSoapCall(SoapCall<Object> soapCall) {
      throw new UnsupportedOperationException();
    }

    @Override
    public void setEndpointAddress(Object soapClient, String endpointAddress) {
      throw new UnsupportedOperationException();
    }

    @Override
    public String getEndpointAddress(Object soapClient) {
      throw new UnsupportedOperationException();
    }

    @Override
    public void clearHeaders(Object soapClient) {
      throw new UnsupportedOperationException();
    }

    @Override
    public SOAPHeaderElement createSoapHeaderElement(QName qName) {
      throw new UnsupportedOperationException();
    }

    @Override
    public void setHeader(
        Object soapClient, String namespace, String headerName, Object headerValue)
        throws ServiceException {
      throw new UnsupportedOperationException();
    }

    @Override
    public void putAllHttpHeaders(Object soapClient, Map<String, String> headersMap) {
      throw new UnsupportedOperationException();
    }

    @Override
    public Object getHeader(Object soapClient, String headerName) {
      throw new UnsupportedOperationException();
    }

    @Override
    public void setCompression(Object soapClient, boolean compress) {
      throw new UnsupportedOperationException();
    }
  }
}

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
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.soap.testing.MockSoapClient;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Method;

/**
 * Tests for {@link SoapServiceClient}.
 *
 * @author Adam Rogal
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class SoapServiceClientTest {

  private TestSoapServiceClient soapServiceClient;

  @Mock private SoapClientHandler<Object> soapClientHandler;
  @Mock private MockSoapClient soapClient;

  public SoapServiceClientTest() {}

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    soapServiceClient = new TestSoapServiceClient(soapClientHandler, soapClient);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCallSoapClient() throws Throwable {
    SoapCallReturn expectedSoapCallReturn = new SoapCallReturn();
    SoapCall<Object> soapCall = Mockito.mock(SoapCall.class);

    when(soapClientHandler.invokeSoapCall(soapCall)).thenReturn(expectedSoapCallReturn);

    SoapCallReturn soapCallReturn = soapServiceClient.callSoapClient(soapCall);

    assertSame(expectedSoapCallReturn, soapCallReturn);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCallSoapClient_exception() {
    SoapCallReturn expectedSoapCallReturn =
        new SoapCallReturn.Builder().withException(MockSoapClient.EXCEPTION).build();

    SoapCall<Object> soapCall = Mockito.mock(SoapCall.class);

    when(soapClientHandler.invokeSoapCall(soapCall)).thenReturn(expectedSoapCallReturn);

    SoapCallReturn testSoapCallReturn = soapServiceClient.callSoapClient(soapCall);

    assertSame(MockSoapClient.EXCEPTION, testSoapCallReturn.getException());
  }

  @Test
  public void testInvoke_serviceClientMethod() throws Throwable {
    String endpointAddress = "http://test.com";

    soapServiceClient.invoke(null,
        SoapServiceClient.class.getMethod("setEndpointAddress", String.class),
        new Object[] {endpointAddress});

    verify(soapClientHandler).setEndpointAddress(soapClient, endpointAddress);
  }

  @Test
  public void testInvoke_serviceClientSubclassMethod() throws Throwable {
    soapServiceClient.invoke(null,
        TestSoapServiceClient.class.getMethod("doSomething", Object.class), new Object[] {""});
  }

  @Test
  public void testInvoke_soapClientMethod() throws Throwable {
    Object returnValue = new Object();
    SoapCallReturn callReturn =
        new SoapCallReturn.Builder().withReturnValue(returnValue).build();

    Method identityCallMethod = MockSoapClient.class.getMethod("identityCall", Object[].class);
    Object[] arg = new String[] {"arg1", "arg2"};
    Object[] args = new Object[] {arg};
    SoapCall<Object> soapCall = new SoapCall<Object>(identityCallMethod, soapClient, args);

    when(soapClientHandler.getSoapClientMethod(soapClient, identityCallMethod))
        .thenReturn(identityCallMethod);

    when(soapClientHandler.invokeSoapCall(soapCall)).thenReturn(callReturn);

    Object result = soapServiceClient.invoke(null, identityCallMethod, args);

    assertEquals(returnValue, result);
  }

  @Test(expected = Throwable.class)
  public void testInvoke_soapClientMethodAuthenticationException() throws Throwable {
    Method indentityCallMethod = MockSoapClient.class.getMethod("identityCall", Object[].class);
    Object[] args = new String[] {"arg1", "arg2"};

    soapServiceClient.throwAuthException = true;

    Object result = soapServiceClient.invoke(null, indentityCallMethod, args);
  }

  @Test(expected = NoSuchMethodException.class)
  public void testInvoke_soapClientMethodNoSuchmethodException() throws Throwable {
    Method indentityCallMethod = MockSoapClient.class.getMethod("identityCall", Object[].class);
    Object[] args = new String[] {"arg1", "arg2"};

    when(soapClientHandler.getSoapClientMethod(soapClient, indentityCallMethod))
        .thenThrow(new NoSuchMethodException());

    Object result = soapServiceClient.invoke(null, indentityCallMethod, args);
  }

  @Test
  public void testCreateSoapCall() throws SecurityException, NoSuchMethodException {
    Method indentityCallMethod = MockSoapClient.class.getMethod("identityCall", Object[].class);
    Object[] args = new String[] {"arg1", "arg2"};
    SoapCall<Object> expectedSoapCall =
        new SoapCall<Object>(indentityCallMethod, soapClient, args);

    SoapCall<Object> soapCall = soapServiceClient.createSoapCall(indentityCallMethod, args);

    assertEquals(expectedSoapCall, soapCall);
  }

  @Test
  public void testSetEndpointAddress() {
    String expectedEndpointAddress = "endpoint";

    soapServiceClient.setEndpointAddress(expectedEndpointAddress);

    verify(soapClientHandler).setEndpointAddress(soapClient, expectedEndpointAddress);
  }

  @Test
  public void testGetSoapClient() {
    assertEquals(soapClient, soapServiceClient.getSoapClient());
  }

  @Test
  public void testGetSoapClientHandler() {
    assertEquals(soapClientHandler, soapServiceClient.getSoapClientHandler());
  }

  @Test
  public void testHandleException() {
    Exception expectedException = new NoSuchMethodException();
    assertEquals(expectedException, soapServiceClient.handleException(expectedException));
  }

  @Test(expected = NoSuchMethodException.class)
  public void testUnwrapSoapCallReturn_exception() throws Throwable {
    SoapCallReturn soapCallReturn =
        new SoapCallReturn.Builder().withException(new NoSuchMethodException()).build();

    soapServiceClient.unwrapSoapCallReturn(soapCallReturn);
  }

  @Test
  public void testUnwrapSoapCallReturn_successful() throws Throwable {
    Object expectedReturnValue = "return";
    SoapCallReturn soapCallReturn =
        new SoapCallReturn.Builder().withReturnValue(expectedReturnValue).build();

    assertEquals(expectedReturnValue, soapServiceClient.unwrapSoapCallReturn(soapCallReturn));
  }

  /**
   * Sub-class of {@link SoapServiceClient} to test method invocation.
   */
  private static class TestSoapServiceClient extends SoapServiceClient<Object> {
    boolean throwAuthException = false;

    static final AuthenticationException AUTH_EXCEPTION =
        new AuthenticationException("auth", new RuntimeException()) {};

    /**
     * Protected constructor.
     *
     * @param soapClientHandler the SOAP client handler
     * @param soapClient the SOAP client
     */
    protected TestSoapServiceClient(SoapClientHandler<Object> soapClientHandler,
                                   Object soapClient) {
      super(soapClientHandler, soapClient);
    }

    /**
     * Dummy method used for testing.
     */
    @SuppressWarnings("unused")
    public String doSomething(Object anything) {
      return anything.toString();
    }

    @Override
    protected void logSoapCall(SoapCallReturn soapCallReturn) {}

    @Override
    protected void setHeaders() throws AuthenticationException  {
      if (throwAuthException) {
        throw AUTH_EXCEPTION;
      }
    }
  }
}

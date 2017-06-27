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

import com.google.api.ads.common.lib.client.RemoteCallReturn;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.soap.testing.MockSoapClient;
import java.lang.reflect.Method;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Tests for {@link SoapServiceClient}.
 */
@RunWith(JUnit4.class)
public class SoapServiceClientTest {

  private TestSoapServiceClient soapServiceClient;

  @Mock private SoapClientHandler<Object> soapClientHandler;
  @Mock private MockSoapClient soapClient;

  @Rule public ExpectedException thrown = ExpectedException.none();

  public SoapServiceClientTest() {}

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    soapServiceClient = new TestSoapServiceClient(soapClientHandler, soapClient);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCallSoapClient() throws Throwable {
    RemoteCallReturn expectedRemoteCallReturn = new RemoteCallReturn.Builder().build();
    SoapCall<Object> soapCall = Mockito.mock(SoapCall.class);

    when(soapClientHandler.invokeSoapCall(soapCall)).thenReturn(expectedRemoteCallReturn);

    RemoteCallReturn remoteCallReturn = soapServiceClient.callSoapClient(soapCall);

    assertSame(expectedRemoteCallReturn, remoteCallReturn);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCallSoapClient_exception() {
    RemoteCallReturn expectedRemoteCallReturn =
        new RemoteCallReturn.Builder().withException(MockSoapClient.EXCEPTION).build();

    SoapCall<Object> soapCall = Mockito.mock(SoapCall.class);

    when(soapClientHandler.invokeSoapCall(soapCall)).thenReturn(expectedRemoteCallReturn);

    RemoteCallReturn testRemoteCallReturn = soapServiceClient.callSoapClient(soapCall);

    assertSame(MockSoapClient.EXCEPTION, testRemoteCallReturn.getException());
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
    RemoteCallReturn callReturn =
        new RemoteCallReturn.Builder().withReturnValue(returnValue).build();

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

  @Test
  public void testInvoke_soapClientMethodAuthenticationException() throws Throwable {
    Method indentityCallMethod = MockSoapClient.class.getMethod("identityCall", Object[].class);
    Object[] args = new String[] {"arg1", "arg2"};

    soapServiceClient.throwAuthException = true;

    thrown.expect(Matchers.<Exception>equalTo(TestSoapServiceClient.AUTH_EXCEPTION));
    soapServiceClient.invoke(null, indentityCallMethod, args);
  }

  @Test
  public void testInvoke_soapClientMethodNoSuchmethodException() throws Throwable {
    Method indentityCallMethod = MockSoapClient.class.getMethod("identityCall", Object[].class);
    Object[] args = new String[] {"arg1", "arg2"};

    when(soapClientHandler.getSoapClientMethod(soapClient, indentityCallMethod))
        .thenThrow(new NoSuchMethodException());

    thrown.expect(NoSuchMethodException.class);
    soapServiceClient.invoke(null, indentityCallMethod, args);
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

  @Test
  public void testUnwrapRemoteCallReturn_exception() throws Throwable {
    RemoteCallReturn remoteCallReturn =
        new RemoteCallReturn.Builder().withException(new NoSuchMethodException()).build();

    thrown.expect(NoSuchMethodException.class);
    soapServiceClient.unwrapRemoteCallReturn(remoteCallReturn);
  }

  @Test
  public void testUnwrapRemoteCallReturn_successful() throws Throwable {
    Object expectedReturnValue = "return";
    RemoteCallReturn remoteCallReturn =
        new RemoteCallReturn.Builder().withReturnValue(expectedReturnValue).build();

    assertEquals(expectedReturnValue, soapServiceClient.unwrapRemoteCallReturn(remoteCallReturn));
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
    protected void logSoapCall(RemoteCallReturn remoteCallReturn) {}

    @Override
    protected void setHeaders() throws AuthenticationException  {
      if (throwAuthException) {
        throw AUTH_EXCEPTION;
      }
    }
  }
}

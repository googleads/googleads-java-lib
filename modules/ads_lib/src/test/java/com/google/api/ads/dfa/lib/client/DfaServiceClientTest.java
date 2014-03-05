// Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfa.lib.client;

import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.same;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.SoapCall;
import com.google.api.ads.common.lib.soap.SoapCallReturn;
import com.google.api.ads.common.lib.soap.SoapClientHandler;
import com.google.api.ads.common.lib.utils.logging.AdsServiceLoggers;
import com.google.api.ads.dfa.lib.auth.LoginTokenException;
import com.google.api.ads.dfa.lib.auth.LoginTokens;
import com.google.api.ads.dfa.lib.auth.TokenExpirationDetector;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Test for the {@link DfaServiceClient} class.
 *
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class DfaServiceClientTest {

  private DfaServiceClient dfaServiceClient;

  @Mock Object soapClient;
  @Mock DfaServiceDescriptor dfaServiceDescriptor;
  @Mock DfaSession dfaSession;
  @Mock SoapClientHandler<Object> soapClientHandler;
  @Mock HeaderHandler<DfaSession, DfaServiceDescriptor> dfaHeaderHandler;
  @Mock AdsServiceLoggers adsServiceLoggers;
  @Mock TokenExpirationDetector tokenExpirationDetector;
  @Mock LoginTokens loginTokens;
  @Mock SoapCallReturn soapCallReturn;
  @Mock SoapCall<Object> soapCall;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    dfaServiceClient = new DfaServiceClient(soapClient, dfaServiceDescriptor, dfaSession,
        soapClientHandler, dfaHeaderHandler, adsServiceLoggers, tokenExpirationDetector,
        loginTokens);
  }

  @Test
  public void testCallSoapCall_callSucceeded() throws Exception {
    when(soapClientHandler.invokeSoapCall(soapCall)).thenReturn(soapCallReturn);
    when(soapCallReturn.getException()).thenReturn(null);
    when(tokenExpirationDetector.isTokenExpiredException(null)).thenReturn(false);

    assertSame(soapCallReturn, dfaServiceClient.callSoapClient(soapCall));

    verify(soapClientHandler, times(1)).invokeSoapCall(soapCall);
  }

  @Test
  public void testCallSoapCall_callFailed_notTokenExpired() throws Exception {
    Exception apiException = new Exception();
    when(soapClientHandler.invokeSoapCall(soapCall)).thenReturn(soapCallReturn);
    when(soapCallReturn.getException()).thenReturn(apiException);
    when(tokenExpirationDetector.isTokenExpiredException(apiException)).thenReturn(false);

    assertSame(soapCallReturn, dfaServiceClient.callSoapClient(soapCall));

    verify(soapClientHandler, times(1)).invokeSoapCall(soapCall);
  }

  @SuppressWarnings({"unchecked", "rawtypes"}) // Using raw type for mocking.
  @Test
  public void testCallSoapCall_callFailed_tokenExpired() throws Exception {
    Exception apiException = new Exception();
    SoapCallReturn soapCallReturn2 = Mockito.mock(SoapCallReturn.class);

    when(soapClientHandler.invokeSoapCall(soapCall)).thenReturn(soapCallReturn)
        .thenReturn(soapCallReturn2);
    when(soapCallReturn.getException()).thenReturn(apiException);
    when(tokenExpirationDetector.isTokenExpiredException(apiException)).thenReturn(true);
    when(dfaServiceDescriptor.getInterfaceClass()).thenReturn((Class) getClass());

    assertSame(soapCallReturn2, dfaServiceClient.callSoapClient(soapCall));

    verify(loginTokens).generateToken(any(String.class), same(dfaSession));
    verify(soapClientHandler).clearHeaders(soapClient);
    verify(dfaHeaderHandler).setHeaders(soapClient, dfaSession, dfaServiceDescriptor);
    verify(soapClientHandler, times(2)).invokeSoapCall(soapCall);
  }

  @SuppressWarnings({"unchecked", "rawtypes"}) // Using raw type for mocking.
  @Test
  public void testCallSoapCall_callFailed_LoginTokenException() throws Exception {
    Exception apiException = new Exception();
    when(soapClientHandler.invokeSoapCall(soapCall)).thenReturn(soapCallReturn);
    when(soapCallReturn.getException()).thenReturn(apiException);
    when(tokenExpirationDetector.isTokenExpiredException(apiException)).thenReturn(true);
    when(dfaServiceDescriptor.getInterfaceClass()).thenReturn((Class) getClass());
    when(loginTokens.generateToken(any(String.class), same(dfaSession)))
        .thenThrow(new LoginTokenException(null, null));

    assertSame(soapCallReturn, dfaServiceClient.callSoapClient(soapCall));

    verify(soapClientHandler, times(1)).invokeSoapCall(soapCall);
  }

  @SuppressWarnings({"unchecked", "rawtypes"}) // Using raw type for mocking.
  @Test
  public void testCallSoapCall_callFailed_ServiceException() throws Exception {
    Exception apiException = new Exception();
    when(soapClientHandler.invokeSoapCall(soapCall)).thenReturn(soapCallReturn);
    when(soapCallReturn.getException()).thenReturn(apiException);
    when(tokenExpirationDetector.isTokenExpiredException(apiException)).thenReturn(true);
    when(dfaServiceDescriptor.getInterfaceClass()).thenReturn((Class) getClass());
    doThrow(new ServiceException(null, null))
        .when(dfaHeaderHandler).setHeaders(soapClient, dfaSession, dfaServiceDescriptor);

    assertSame(soapCallReturn, dfaServiceClient.callSoapClient(soapCall));

    verify(soapClientHandler, times(1)).invokeSoapCall(soapCall);
  }

  @SuppressWarnings({"unchecked", "rawtypes"}) // Using raw type for mocking.
  @Test
  public void testCallSoapCall_callFailed_AuthenticationException() throws Exception {
    Exception apiException = new Exception();
    when(soapClientHandler.invokeSoapCall(soapCall)).thenReturn(soapCallReturn);
    when(soapCallReturn.getException()).thenReturn(apiException);
    when(tokenExpirationDetector.isTokenExpiredException(apiException)).thenReturn(true);
    when(dfaServiceDescriptor.getInterfaceClass()).thenReturn((Class) getClass());
    doThrow(new AuthenticationException(null, null) {})
        .when(dfaHeaderHandler).setHeaders(soapClient, dfaSession, dfaServiceDescriptor);

    assertSame(soapCallReturn, dfaServiceClient.callSoapClient(soapCall));

    verify(soapClientHandler, times(1)).invokeSoapCall(soapCall);
  }
}

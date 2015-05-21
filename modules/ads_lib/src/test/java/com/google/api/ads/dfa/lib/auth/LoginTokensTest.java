// Copyright 2011 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfa.lib.auth;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.google.api.ads.dfa.lib.client.DfaSession;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.InvocationTargetException;

/**
 * Test for the {@link LoginTokens} class.
 *
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class LoginTokensTest {

  private LoginTokens loginTickets;

  @Mock private LoginTokensHelper loginTokensHelper;
  private DfaSession dfaSession;

  @Rule public ExpectedException thrown = ExpectedException.none();

  private static final String USERNAME = "username";
  private static final String PASSWORD = "password";
  private static final String TOKEN = "token";
  private static final long NETWORK_ID = 1000L;
  private static final String STUB_PACKAGE = "com.google.api.ads.dfa.lib.auth";

  private static final String AUTH_TOKEN = "123ABC";

  public LoginTokensTest() {}

  @SuppressWarnings("unchecked")
  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    dfaSession = new DfaSession.Builder()
        .withUsernameAndPassword(USERNAME, PASSWORD)
        .withEnvironment(DfaSession.Environment.TEST)
        .withApplicationName("applicationName")
        .build();

    loginTickets = new LoginTokens(loginTokensHelper);
  }

  @Test
  @SuppressWarnings({"rawtypes", "unchecked"})
  public void testGenerateToken() throws Exception {
    Class<?> loginRemote = LoginRemote.class;
    LoginSoapBindingStub loginService = new LoginSoapBindingStub();

    when(loginTokensHelper.getLoginClass(STUB_PACKAGE)).thenReturn((Class) LoginRemote.class);
    when(loginTokensHelper.getLoginService(dfaSession, loginRemote))
        .thenReturn(loginService);
    when(loginTokensHelper.authenticate(USERNAME, PASSWORD, loginRemote, loginService))
        .thenReturn(loginService);
    when(loginTokensHelper.retrieveToken(Mockito.anyObject()))
        .thenReturn(AUTH_TOKEN);

    assertEquals(AUTH_TOKEN, loginTickets.generateToken(STUB_PACKAGE, dfaSession));
  }

  @Test
  @SuppressWarnings({"rawtypes", "unchecked"})
  public void testGenerateToken_exception() throws Exception {
    InvocationTargetException exception =
        new InvocationTargetException(new RuntimeException("my exception"));
    Class<?> loginRemote = LoginRemote.class;
    LoginSoapBindingStub loginService = new LoginSoapBindingStub();

    when(loginTokensHelper.getLoginClass(STUB_PACKAGE))
        .thenReturn((Class) LoginRemote.class);
    when(loginTokensHelper.getLoginService(dfaSession, loginRemote))
        .thenReturn(loginService);
    when(loginTokensHelper.authenticate(USERNAME, PASSWORD, loginRemote, loginService))
        .thenThrow(exception);
    when(loginTokensHelper.retrieveToken(Mockito.anyObject()))
        .thenReturn(AUTH_TOKEN);

    thrown.expect(LoginTokenException.class);
    loginTickets.generateToken(STUB_PACKAGE, dfaSession);
  }

  private class LoginRemote {}
  private class LoginSoapBindingStub {}
}

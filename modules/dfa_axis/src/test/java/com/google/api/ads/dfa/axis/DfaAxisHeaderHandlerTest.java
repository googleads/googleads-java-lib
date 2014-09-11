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

package com.google.api.ads.dfa.axis;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.ads.dfa.axis.testing.mocks.v1_12.FunRemote;
import com.google.api.ads.dfa.axis.testing.mocks.v1_12.LoginRemote;
import com.google.api.ads.dfa.lib.auth.LoginTokens;
import com.google.api.ads.dfa.lib.client.DfaServiceDescriptor;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.ads.dfa.lib.conf.DfaApiConfiguration;
import com.google.api.client.auth.oauth2.Credential;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPHeaderElement;

/**
 * Test for the {@link DfaAxisHeaderHandler} class.
 *
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class DfaAxisHeaderHandlerTest {

  private DfaAxisHeaderHandler dfaHeaderHandler;

  private DfaServiceDescriptor loginDfaServiceDescriptor;
  private DfaServiceDescriptor nonLoginDfaServiceDescriptor;
  private DfaSession dfaSession;
  private QName wsseQName;
  private QName requestQName;
  @Mock private AuthorizationHeaderHandler authorizationHeaderHandler;
  @Mock private SoapClientHandlerInterface<Object> soapClientHandler;
  @Mock private DfaApiConfiguration dfaApiConfiguration;
  @Mock private AdsLibConfiguration adsLibConfiguration;
  @Mock private LoginTokens loginTokens;
  @Mock private UserAgentCombiner userAgentCombiner;
  @Mock private SOAPHeaderElement wsseHeaderElem;
  @Mock private SOAPHeaderElement requestHeaderElem;
  @Mock private SOAPElement usernameElem;
  @Mock private SOAPElement passwordElem;
  @Mock private Object soapClient;

  private static final String NAMESPACE_PREFIX = "www.example.com";
  private static final String USERNAME = "username";
  private static final String AUTH_TOKEN = "authToken";
  private static final String APP_NAME = "ads-java-lib";
  private static final String VERSION = "1.0.0";
  private static final String LIB_SIG = "DfaApi-Java-1.0.0";
  private static final long NETWORK_ID = 1500L;
  private static final String WSSE_NAMESPACE =
      "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
  private static final String VERSIONED_NAMESPACE = NAMESPACE_PREFIX + "/" + VERSION;

  /**
   * Constructor.
   */
  public DfaAxisHeaderHandlerTest() {}

  @SuppressWarnings("unchecked")
  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    dfaSession = new DfaSession.Builder()
        .withUsernameAndToken(USERNAME, AUTH_TOKEN)
        .withApplicationName(APP_NAME)
        .withEnvironment(DfaSession.Environment.TEST)
        .build();

    wsseQName = new QName(WSSE_NAMESPACE, "UsernameToken");
    requestQName = new QName(VERSIONED_NAMESPACE, "applicationName");

    loginDfaServiceDescriptor = new DfaServiceDescriptor(LoginRemote.class, VERSION);
    nonLoginDfaServiceDescriptor = new DfaServiceDescriptor(FunRemote.class, VERSION);

    dfaHeaderHandler = new DfaAxisHeaderHandler(soapClientHandler,
        dfaApiConfiguration,
        adsLibConfiguration,
        loginTokens,
        userAgentCombiner,
        authorizationHeaderHandler);
  }

  /**
   * Sets mocks to expect a call from
   * {@code DfaAxisHeaderHandler#setWsseSecurityHeader(Object, String, String)}.
   */
  private void setMocksToExpectSetWsseSecurityHeader() throws Exception {
    when(soapClientHandler.createSoapHeaderElement(eq(wsseQName)))
        .thenReturn(wsseHeaderElem);
    when(wsseHeaderElem.addChildElement("Username")).thenReturn(usernameElem);
    when(wsseHeaderElem.addChildElement("Password")).thenReturn(passwordElem);
  }

  /**
   * Sets mocks to expect a call from
   * {@code DfaAxisHeaderHandler#setRequestHeader(Object, DfaSession)}.
   */
  private void setMocksToExpectSetRequestHeader() throws Exception {
    when(dfaApiConfiguration.getNamespacePrefix())
        .thenReturn(NAMESPACE_PREFIX);
    when(soapClientHandler.createSoapHeaderElement(
        eq(requestQName))).thenReturn(requestHeaderElem);
    when(userAgentCombiner.getUserAgent(APP_NAME)).thenReturn(LIB_SIG);
  }

  /**
   * Verifies that the mocks representing the request header have been set
   * correctly.
   */
  private void verifyRequestHeader(String appName) throws Exception {
    verify(soapClientHandler).setHeader(
        eq(soapClient), eq(VERSIONED_NAMESPACE), eq("RequestHeader"),
        eq(requestHeaderElem));
    verify(requestHeaderElem).addTextNode(appName);
  }

  /**
   * Verifies that the mocks representing the WSSE security header have been set
   * correctly.
   */
  private void verifySecurityHeader(String username, String token) throws Exception {
    verify(soapClientHandler).setHeader(
        eq(soapClient), eq(WSSE_NAMESPACE), eq("Security"), eq(wsseHeaderElem));
    verify(usernameElem).addTextNode(username);
    verify(passwordElem).addTextNode(token);
  }

  @Test
  public void testSetHeaders_loginWithoutOAuth2() throws Exception {
    setMocksToExpectSetRequestHeader();

    dfaHeaderHandler.setHeaders(soapClient, dfaSession, loginDfaServiceDescriptor);
    verifyRequestHeader(LIB_SIG);
    verifyZeroInteractions(authorizationHeaderHandler);
  }

  @Test
  public void testSetHeaders_loginWithOAuth2() throws Exception {
    DfaSession dfaSession = new DfaSession.Builder()
        .withUsernameAndOAuth2Credential(USERNAME, mock(Credential.class))
        .withApplicationName(APP_NAME)
        .withEnvironment(DfaSession.Environment.TEST)
        .build();

    setMocksToExpectSetRequestHeader();

    dfaHeaderHandler.setHeaders(soapClient, dfaSession, loginDfaServiceDescriptor);

    verifyRequestHeader(LIB_SIG);
    verify(authorizationHeaderHandler).setAuthorization(soapClient, dfaSession);
  }

  @Test
  public void testSetHeaders_nonLogin_hasToken() throws Exception {
    setMocksToExpectSetWsseSecurityHeader();
    setMocksToExpectSetRequestHeader();

    dfaHeaderHandler.setHeaders(soapClient, dfaSession, nonLoginDfaServiceDescriptor);

    verifySecurityHeader(USERNAME, AUTH_TOKEN);
    verifyRequestHeader(LIB_SIG);
    verifyZeroInteractions(authorizationHeaderHandler);
  }

  @Test
  public void testSetHeaders_nonLogin_noToken() throws Exception {
    String stubPackage = nonLoginDfaServiceDescriptor.getInterfaceClass().getPackage().getName();
    dfaSession.setToken(null);

    when(loginTokens.generateToken(stubPackage, dfaSession)).thenReturn("new token");
    setMocksToExpectSetWsseSecurityHeader();
    setMocksToExpectSetRequestHeader();

    dfaHeaderHandler.setHeaders(soapClient, dfaSession, nonLoginDfaServiceDescriptor);

    verifySecurityHeader(USERNAME, "new token");
    verifyRequestHeader(LIB_SIG);
    verifyZeroInteractions(authorizationHeaderHandler);
  }

  @Test
  public void testGenerateAuthToken() throws Exception {
    String stubPackage = nonLoginDfaServiceDescriptor.getInterfaceClass().getPackage().getName();

    when(loginTokens.generateToken(stubPackage, dfaSession)).thenReturn(AUTH_TOKEN);

    assertEquals(AUTH_TOKEN,
        dfaHeaderHandler.generateAuthToken(nonLoginDfaServiceDescriptor, dfaSession));
  }
}

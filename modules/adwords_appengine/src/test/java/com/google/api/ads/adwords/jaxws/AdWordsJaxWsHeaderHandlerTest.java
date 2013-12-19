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

package com.google.api.ads.adwords.jaxws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.conf.AdWordsApiConfiguration;
import com.google.api.ads.adwords.lib.testing.mocks.o.MockAdWordsService;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.soap.SOAPElement;

/**
 * Tests for the {@link AdWordsJaxWsHeaderHandler} class.
 *
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class AdWordsJaxWsHeaderHandlerTest {

  private AdWordsJaxWsHeaderHandler adWordsJaxWsHeaderHandler;

  private AdWordsSession adWordsSession;
  private AdWordsServiceDescriptor adWordsServiceDescriptor;
  @Mock private SoapClientHandlerInterface<Object> soapClientHandler;
  @Mock private AdWordsApiConfiguration adWordsApiConfiguration;
  @Mock private AuthorizationHeaderHandler authorizationHeaderHandler;
  @Mock private UserAgentCombiner userAgentCombiner;

  private static final String DEVELOPER_TOKEN = "DEVELOPER_TOKEN";
  private static final String CLIENT_CUSTOMER_ID = "CLIENT_CUSTOMER_ID";
  private static final String CLIENT_LOGIN_TOKEN = "CLIENT_LOGIN_TOKEN";
  private static final String USER_AGENT = "USER_AGENT";
  private static final String VERSION = "v201101";

  /**
   * Constructor.
   */
  public AdWordsJaxWsHeaderHandlerTest() {}

  @Before
  @SuppressWarnings("unchecked")
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    adWordsJaxWsHeaderHandler =
        new AdWordsJaxWsHeaderHandler(soapClientHandler, adWordsApiConfiguration,
            authorizationHeaderHandler, userAgentCombiner);

    adWordsSession = new AdWordsSession.Builder()
        .withClientCustomerId(CLIENT_CUSTOMER_ID)
        .withClientLoginToken(CLIENT_LOGIN_TOKEN)
        .withDeveloperToken(DEVELOPER_TOKEN)
        .withUserAgent(USER_AGENT)
        .build();
    adWordsServiceDescriptor = new AdWordsServiceDescriptor(MockAdWordsService.class,
        VERSION, adWordsApiConfiguration);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testSetHeaders() throws ServiceException, AuthenticationException {
    Object soapClient = new Object();
    String namespacePrefix = "http://www.example.com";
    String topLevelNamespace = "http://www.example.com/o/v201101";
    String namespace = "http://www.example.com/cm/v201101";
    String libSig = "libSig";
    adWordsSession.setValidateOnly(true);
    Map<String, String> expectedHeaders = new HashMap<String, String>();
    expectedHeaders.put("developerToken", DEVELOPER_TOKEN);
    expectedHeaders.put("clientCustomerId", CLIENT_CUSTOMER_ID);
    expectedHeaders.put("validateOnly", "true");
    expectedHeaders.put("authToken", CLIENT_LOGIN_TOKEN);
    expectedHeaders.put("userAgent", libSig);

    when(adWordsApiConfiguration.getNamespacePrefix()).thenReturn(namespacePrefix);
    when(userAgentCombiner.getUserAgent(USER_AGENT)).thenReturn(libSig);

    adWordsJaxWsHeaderHandler.setHeaders(soapClient, adWordsSession,
        adWordsServiceDescriptor);

    ArgumentCaptor<Object> headerArg = ArgumentCaptor.forClass(Object.class);
    verify(soapClientHandler).setHeader(
        eq(soapClient), (String) eq(null), (String) eq(null), headerArg.capture());

    if (headerArg.getValue() instanceof SOAPElement) {
      SOAPElement soapValue = (SOAPElement) headerArg.getValue();
      assertEquals("RequestHeader", soapValue.getLocalName());
      assertEquals(topLevelNamespace, soapValue.getNamespaceURI());
      ArrayList<SOAPElement> children = Lists.newArrayList(soapValue.getChildElements());
      assertEquals(expectedHeaders.size(), children.size());
      for (SOAPElement child : children) {
        assertEquals(namespace, child.getNamespaceURI());
        assertTrue(child.getLocalName(), expectedHeaders.containsKey(child.getLocalName()));
        assertEquals(child.getLocalName(), expectedHeaders.get(child.getLocalName()),
            child.getFirstChild().getTextContent().toString());
      }
    } else {
      fail("Generated headerValue is not a SOAPElement.");
    }
  }

  @Test
  public void testSetAuthenticationHeaders_clientLogin() throws Exception {
    Object soapClient = new Object();
    Map<String, Object> headerElements = new HashMap<String, Object>();

    adWordsJaxWsHeaderHandler.setAuthenticationHeaders(soapClient, headerElements, adWordsSession);

    assertEquals(CLIENT_LOGIN_TOKEN, headerElements.get("authToken"));
  }

  @Test
  public void testSetAuthenticationHeaders() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    Object soapClient = new Object();
    Map<String, Object> headerElements = new HashMap<String, Object>();
    AdWordsSession adWordsSession = new AdWordsSession.Builder()
        .withOAuth2Credential(credential)
        .withDeveloperToken("developerToken")
        .withUserAgent("userAgent")
        .build();    
    String authHeader = "oAuTh2";
    Map<String, String> headersMap = new HashMap<String, String>();
    headersMap.put("Authorization", authHeader);

    adWordsJaxWsHeaderHandler.setAuthenticationHeaders(soapClient, headerElements, adWordsSession);

    verify(authorizationHeaderHandler).setAuthorization(soapClient, adWordsSession);
  }
}

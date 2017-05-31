// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
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

import com.google.api.ads.adwords.jaxws.v201609.billing.BudgetOrderServiceInterface;
import com.google.api.ads.adwords.jaxws.v201609.ch.CustomerSyncServiceInterface;
import com.google.api.ads.adwords.jaxws.v201609.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.jaxws.v201609.mcm.ManagedCustomerServiceInterface;
import com.google.api.ads.adwords.jaxws.v201609.o.TargetingIdeaServiceInterface;
import com.google.api.ads.adwords.jaxws.v201609.rm.AdwordsUserListServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.conf.AdWordsApiConfiguration;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.jaxws.JaxWsHandler;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;
import java.rmi.Remote;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.xml.soap.SOAPElement;
import javax.xml.ws.BindingProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Tests for the {@link AdWordsJaxWsHeaderHandler} class.
 */
@RunWith(Parameterized.class)
public class AdWordsJaxWsHeaderHandlerTest {

  private AdWordsJaxWsHeaderHandler headerHandler;

  /** type of the AdWords service interface */
  private final Class<? extends Remote> interfaceClass;

  /** namespace for request header elements */
  private final String headerElementsNamespace;

  private AdWordsSession adWordsSession;
  private AdWordsServiceDescriptor adWordsServiceDescriptor;

  @Mock
  private BindingProvider soapClient;
  @Mock
  private JaxWsHandler soapClientHandler;
  @Mock
  private AdWordsApiConfiguration adWordsApiConfiguration;
  @Mock
  private AdsLibConfiguration adsLibConfiguration;
  @Mock
  private AuthorizationHeaderHandler authorizationHeaderHandler;
  @Mock
  private UserAgentCombiner userAgentCombiner;

  private static final String DEVELOPER_TOKEN = "DEVELOPER_TOKEN";
  private static final String CLIENT_CUSTOMER_ID = "CLIENT_CUSTOMER_ID";
  private static final String USER_AGENT = "USER_AGENT";
  private static final String VERSION = "v201101";

  /**
   * Constructor.
   */
  public AdWordsJaxWsHeaderHandlerTest(Class<? extends Remote> interfaceClass,
      String headerElementsNamespace) {
    this.interfaceClass = interfaceClass;
    this.headerElementsNamespace = headerElementsNamespace;
  }

  @Parameters(name = "interface={0}, namespace={1}")
  public static Collection<Object[]> data() {
    Collection<Object[]> parameters = new ArrayList<Object[]>();
    // Test at least one standard interface for every subpackage of v201609
    parameters.add(
        new Object[] {BudgetOrderServiceInterface.class, "billing"});
    parameters.add(
        new Object[] {CustomerSyncServiceInterface.class, "ch"});
    parameters.add(new Object[] {CampaignServiceInterface.class, "cm"});
    parameters.add(
        new Object[] {ManagedCustomerServiceInterface.class, "mcm"});
    parameters.add(
        new Object[] {TargetingIdeaServiceInterface.class, "o"});
    parameters.add(
        new Object[] {AdwordsUserListServiceInterface.class, "rm"});
   return parameters;
  }

  @Before
  @SuppressWarnings("unchecked")
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    headerHandler = new AdWordsJaxWsHeaderHandler(soapClientHandler,
        adWordsApiConfiguration,
        adsLibConfiguration,
        authorizationHeaderHandler,
        userAgentCombiner);

    adWordsSession = new AdWordsSession.Builder()
        .withClientCustomerId(CLIENT_CUSTOMER_ID)
        .withOAuth2Credential(new Credential(BearerToken.authorizationHeaderAccessMethod()))
        .withDeveloperToken(DEVELOPER_TOKEN)
        .withUserAgent(USER_AGENT)
        .build();

    adWordsServiceDescriptor =
        new AdWordsServiceDescriptor(interfaceClass, VERSION, adWordsApiConfiguration);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testSetHeaders() throws ServiceException, AuthenticationException {
    String namespacePrefix = "http://www.example.com";
    String topLevelNamespace =
        String.format("http://www.example.com/%s/v201101", headerElementsNamespace);
    String namespace = "http://www.example.com/cm/v201101";
    Map<String, String> expectedHeaders = new HashMap<String, String>();

    String libSig = "libSig";
    adWordsSession.setValidateOnly(true);
    expectedHeaders.put("developerToken", DEVELOPER_TOKEN);
    expectedHeaders.put("clientCustomerId", CLIENT_CUSTOMER_ID);
    expectedHeaders.put("validateOnly", "true");
    expectedHeaders.put("userAgent", libSig);

    when(adWordsApiConfiguration.getNamespacePrefix()).thenReturn(namespacePrefix);
    when(userAgentCombiner.getUserAgent(USER_AGENT)).thenReturn(libSig);

    headerHandler.setHeaders(soapClient, adWordsSession, adWordsServiceDescriptor);

    ArgumentCaptor<Object> headerArg = ArgumentCaptor.forClass(Object.class);
    verify(soapClientHandler).setHeader(eq(soapClient), (String) eq(null), (String) eq(null),
        headerArg.capture());

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
      fail("Generated headerValue is not a SOAPElement: " + headerArg.getValue());
    }
  }

  @Test
  public void testSetAuthenticationHeaders() throws Exception {
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    Object soapClient = new Object();
    Map<String, Object> headerElements = new HashMap<String, Object>();
    AdWordsSession adWordsSession = new AdWordsSession.Builder().withOAuth2Credential(credential)
        .withDeveloperToken("developerToken").withUserAgent(USER_AGENT).build();
    String authHeader = "oAuTh2";
    Map<String, String> headersMap = new HashMap<String, String>();
    headersMap.put("Authorization", authHeader);

    headerHandler.setAuthenticationHeaders(soapClient, headerElements, adWordsSession);

    verify(authorizationHeaderHandler).setAuthorization(soapClient, adWordsSession);
  }
}

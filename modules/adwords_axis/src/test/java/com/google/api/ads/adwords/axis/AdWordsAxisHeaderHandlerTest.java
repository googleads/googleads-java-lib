// Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.conf.AdWordsApiConfiguration;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.axis.AxisHandler;
import com.google.api.ads.common.lib.soap.axis.AxisSoapHeaderFactory;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.axis.client.Stub;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Tests for the {@link AdWordsAxisHeaderHandler} class.
 */
@RunWith(JUnit4.class)
public class AdWordsAxisHeaderHandlerTest {

  private AdWordsAxisHeaderHandler headerHandler;

  private AdWordsSession adWordsSession;

  @Mock
  private AxisHandler soapClientHandler;

  @Mock
  private AxisSoapHeaderFactory<AdWordsServiceDescriptor> soapHeaderFactory;
  @Mock
  private Stub soapClient;
  @Mock
  private AdWordsApiConfiguration adWordsApiConfiguration;
  @Mock
  private AdsLibConfiguration adsLibConfiguration;
  @Mock
  private AuthorizationHeaderHandler authorizationHeaderHandler;
  @Mock
  private UserAgentCombiner userAgentCombiner;
  @Mock
  private Credential oAuth2Credential;
  @Mock
  private AdWordsServiceDescriptor adWordsServiceDescriptor;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    headerHandler = new AdWordsAxisHeaderHandler(soapClientHandler,
        adWordsApiConfiguration,
        adsLibConfiguration,
        authorizationHeaderHandler,
        userAgentCombiner,
        soapHeaderFactory);

    adWordsSession = new AdWordsSession.Builder()
        .withClientCustomerId("123-456-7890")
        .withDeveloperToken("DEV_TOKEN")
        .withEndpoint("http://www.example.com")
        .withUserAgent("Test User")
        .withOAuth2Credential(oAuth2Credential)
        .build();

    adWordsSession.setValidateOnly(true);
  }

  /**
   * Tests that setHeaders sets all values appropriately and on the proper SoapHeader type for this
   * test's interfaceClass
   */
  @Test
  public void testSetHeaders() throws Exception {

    // Set up the expected headers in a map.
    Map<String, Object> expectedHeaders = Maps.newHashMap();
    expectedHeaders.put("clientCustomerId", adWordsSession.getClientCustomerId());
    expectedHeaders.put("developerToken", adWordsSession.getDeveloperToken());
    expectedHeaders.put("validateOnly", adWordsSession.isValidateOnly());
    expectedHeaders.put("userAgent", "libSig");

    // Configure mocks to avoid relying on the underlying details of soapClientHandler.
    doNothing().when(soapClientHandler)
        .setHeader(eq(soapClient), anyString(), anyString(), any());

    when(soapClientHandler.getHeader(eq(soapClient), anyString())).thenReturn(Maps.newHashMap());

    when(soapHeaderFactory.createSoapHeader(adWordsServiceDescriptor)).thenReturn(
        Maps.newHashMap());

    when(userAgentCombiner.getUserAgent(anyString())).thenReturn(
        expectedHeaders.get("userAgent").toString());

    // Call the actual method being tested.
    headerHandler.setHeaders(soapClient, adWordsSession, adWordsServiceDescriptor);

    // Verify that setHeaderChild was invoked on each expected name/value pair.
    ArgumentCaptor<String> nameCaptor = ArgumentCaptor.forClass(String.class);
    ArgumentCaptor<Object> valueCaptor = ArgumentCaptor.forClass(Object.class);

    verify(soapClientHandler, atLeast(expectedHeaders.size())).setHeaderChild(eq(soapClient),
        anyString(), nameCaptor.capture(), valueCaptor.capture());

    List<String> capturedNames = nameCaptor.getAllValues();
    List<Object> capturedValues = valueCaptor.getAllValues();

    // Note that capturedNames.size() will be greater than expectedHeaders.size(),
    // but that's fine. This test just verifies that the key values in
    // expectedHeaders are all present.
    for (int i = 0; i < expectedHeaders.size(); i++) {
      String name = capturedNames.get(i);
      Object value = capturedValues.get(i);
      Object expectedValue = expectedHeaders.get(name);
      assertEquals("Captured value for " + name + " is incorrect", expectedValue, value);
    }
  }

}

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
import static org.junit.Assert.assertFalse;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor.AdWordsSubProduct;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.conf.AdWordsApiConfiguration;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.axis.AxisHandler;
import com.google.api.ads.common.lib.soap.axis.AxisSoapHeaderFactory;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Maps;

import org.apache.axis.client.Stub;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Tests for the {@link AdWordsAxisHeaderHandler} class.
 */
@RunWith(Parameterized.class)
public class AdWordsAxisHeaderHandlerTest {

  private AdWordsAxisHeaderHandler headerHandler;

  private AdWordsSession adWordsSession;

  private final AdWordsSubProduct subProduct;

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

  /**
   * Arguments for this constructor are provided by the {@link #data()} method
   *
   * @param subProduct the sub product for the service
   */
  public AdWordsAxisHeaderHandlerTest(AdWordsSubProduct subProduct) {
    this.subProduct = subProduct;
  }

  /**
   * Returns constructor args for each instance of the test
   *
   * @return a list of constructor args where the first element is a service 
   *         interface class and the second element is a boolean indicating if
   *         it is a standard (non-express) interface
   */
  @Parameters(name="subProduct={0}")
  public static Collection<Object[]> data() {
    Collection<Object[]> parameters = new ArrayList<Object[]>();

    parameters.add(new Object[] {AdWordsSubProduct.DEFAULT});
    parameters.add(new Object[] {AdWordsSubProduct.EXPRESS});

    return parameters;
  }

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  
    when(adWordsServiceDescriptor.getSubProduct()).thenReturn(subProduct);
  
    Map<AdWordsSubProduct, HeaderHandler<AdWordsSession, AdWordsServiceDescriptor>> handlerMap =
        Maps.newHashMap();
    handlerMap.put(AdWordsSubProduct.DEFAULT,
        new HeaderHandler.NoOpHeaderHandler<AdWordsSession, AdWordsServiceDescriptor>());
    handlerMap.put(AdWordsSubProduct.EXPRESS,
        new AdWordsAxisExpressHeaderHandler(soapClientHandler));
    
    headerHandler = new AdWordsAxisHeaderHandler(soapClientHandler,
        adWordsApiConfiguration,
        adsLibConfiguration,
        authorizationHeaderHandler,
        userAgentCombiner,
        handlerMap,
        soapHeaderFactory);
  
    adWordsSession = new AdWordsSession.Builder()
        .withClientCustomerId("123-456-7890")
        .withDeveloperToken("DEV_TOKEN")
        .withEndpoint("http://www.example.com")
        .withUserAgent("Test User")
        .withOAuth2Credential(oAuth2Credential)
        .build();
  
    adWordsSession.setExpressBusinessId(123456789L);
  
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
    if (subProduct == AdWordsSubProduct.EXPRESS) {
      expectedHeaders.put(AdWordsAxisExpressHeaderHandler.EXPRESS_BUSINESS_ID_LOCAL_PART,
          adWordsSession.getExpressBusinessId());
    }

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

    if (subProduct != AdWordsSubProduct.EXPRESS) {
      assertFalse("Express business ID found in header for non-express subproduct",
          capturedNames.contains(AdWordsAxisExpressHeaderHandler.EXPRESS_BUSINESS_ID_LOCAL_PART));
    }
  }

}

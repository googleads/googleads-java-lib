// Copyright 2012, Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.factory.helper;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.adwords.lib.client.AdWordsServiceClient;
import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.helper.testing.foobar.cm.BadPackageService;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Test for {@link AdWordsServiceClientFactoryHelper}.
 */
@RunWith(JUnit4.class)
public class AdWordsServiceClientFactoryHelperTest {

  @Mock
  private AdsServiceClientFactoryInterface<
      AdWordsServiceClient, AdWordsSession, AdWordsServiceDescriptor> adsServiceClientFactory;
  @Mock
  private AdsServiceDescriptorFactoryInterface<AdWordsServiceDescriptor>
      adsServiceDescriptorFactory;
  @Mock /* The type argument for SoapClientHandlerInterface does not matter for this test. */
  private SoapClientHandlerInterface<Object> soapClientHandler;
  @Mock
  private AdsLibConfiguration adsLibConfiguration;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testVersionedPackage() throws Exception {
    AdWordsServiceClientFactoryHelper helper = new AdWordsServiceClientFactoryHelper(
        adsServiceClientFactory, adsServiceDescriptorFactory, soapClientHandler,
        adsLibConfiguration);
    assertEquals("v201406", helper.determineVersion(
        com.google.api.ads.adwords.lib.factory.helper.testing.v201406.cm.TestService.class));
  }

  @Test
  public void testBadPackage() throws Exception {
    Mockito.when(adsLibConfiguration.getDuckTypedVersion()).thenReturn("BadPackage");
    AdWordsServiceClientFactoryHelper helper = new AdWordsServiceClientFactoryHelper(
        adsServiceClientFactory, adsServiceDescriptorFactory, soapClientHandler,
        adsLibConfiguration);
    assertEquals("BadPackage", helper.determineVersion(BadPackageService.class));
  }

  @Test
  public void testCheckServiceClientPreconditions_passOAuth2() throws Exception {
    AdWordsServiceClientFactoryHelper helper = new AdWordsServiceClientFactoryHelper(
        adsServiceClientFactory, adsServiceDescriptorFactory, soapClientHandler,
        adsLibConfiguration);

    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    AdWordsSession adWordsSession = new AdWordsSession.Builder()
        .withUserAgent("FooBar")
        .withEndpoint("https://www.google.com")
        .withOAuth2Credential(credential)
        .withDeveloperToken("developerToken")
        .build();

    helper.checkServiceClientPreconditions(adWordsSession,
        com.google.api.ads.adwords.lib.factory.helper.testing.v201406.cm.TestService.class);
  }
}

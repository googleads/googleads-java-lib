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

package com.google.api.ads.common.lib.factory;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.client.AdsServiceClient;
import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.soap.testing.MockSoapClient;
import com.google.api.ads.common.lib.soap.testing.MockSoapClientInterface;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Test for the {@link AdsServiceClientFactory} class.
 */
@RunWith(JUnit4.class)
public class BaseAdsServiceClientFactoryTest {

  private BaseAdsServiceClientFactory<AdsServiceClient<AdsSession,
                                                       AdsServiceDescriptor>,
                                      AdsSession,
                                      AdsServiceDescriptor> baseAdsServiceClientFactory;

  @Mock private AdsSession adsSession;
  @Mock private AdsServiceClientFactory<AdsServiceClient<AdsSession,
                                                         AdsServiceDescriptor>,
                                        AdsSession,
                                        AdsServiceDescriptor> adsServiceClientFactory;


  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    baseAdsServiceClientFactory =
        new BaseAdsServiceClientFactory<AdsServiceClient<AdsSession,
                                                         AdsServiceDescriptor>,
                                        AdsSession,
                                        AdsServiceDescriptor>(
        adsServiceClientFactory) {};
  }

  @Test
  public void testGetServiceClientAsInterface() {
    MockSoapClientInterface soapClient = new MockSoapClient();
    when(adsServiceClientFactory.getServiceClient(adsSession, MockSoapClientInterface.class))
        .thenReturn(soapClient);

    MockSoapClientInterface testSoapClient =
        baseAdsServiceClientFactory.getServiceClientAsInterface(adsSession,
            MockSoapClientInterface.class);

    assertSame(soapClient, testSoapClient);
  }
}

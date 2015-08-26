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

package com.google.api.ads.common.lib.factory.helper;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.client.AdsServiceClient;
import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.soap.testing.MockSoapClientInterface;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Tests for {@link BaseAdsServiceClientFactoryHelper}.
 */
@RunWith(JUnit4.class)
public class BaseAdsServiceClientFactoryHelperTest {

  private BaseAdsServiceClientFactoryHelper<AdsServiceClient<AdsSession,
                                                             AdsServiceDescriptor>,
                                            AdsSession,
                                            AdsServiceDescriptor>
      abstractAdsServiceClientFactoryHelper;

  @Mock private AdsServiceClientFactoryInterface<AdsServiceClient<AdsSession,
                                                                  AdsServiceDescriptor>,
                                                 AdsSession,
                                                 AdsServiceDescriptor> adsServiceClientFactory;
  @Mock private SoapClientHandlerInterface<Object> soapClientHandler;
  @Mock private AdsServiceClient<AdsSession, AdsServiceDescriptor> adsServiceClient;
  @Mock private AdsServiceDescriptor adsServiceDescriptor;
  @Mock
  private AdsServiceDescriptorFactoryInterface<AdsServiceDescriptor> adsServiceDescriptorFactory;
  @Mock private AdsSession adsSession;
  @Mock private Object soapClient;

  private static final String VERSION = "v201108";

  @SuppressWarnings("unchecked")
  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    abstractAdsServiceClientFactoryHelper = new BaseAdsServiceClientFactoryHelper<
        AdsServiceClient<AdsSession, AdsServiceDescriptor>, AdsSession, AdsServiceDescriptor>(
        adsServiceClientFactory, adsServiceDescriptorFactory, soapClientHandler) {
      @Override
      @SuppressWarnings("rawtypes")
      public String determineVersion(Class interfaceClass) {
        return VERSION;
      }
    };
  }

  @Test
  public void testCreateAdsServiceClient() {
    String endpointServer = "testServer";
    String endpointAddress = "testAddress";

    when(soapClientHandler.createSoapClient(adsServiceDescriptor)).thenReturn(soapClient);
    when(adsServiceClientFactory.create(soapClient, adsServiceDescriptor, adsSession))
        .thenReturn(adsServiceClient);

    AdsServiceClient<AdsSession, AdsServiceDescriptor> testAdsServiceClient =
        abstractAdsServiceClientFactoryHelper.createAdsServiceClient(adsServiceDescriptor,
            adsSession);

    assertSame(adsServiceClient, testAdsServiceClient);
  }

  @Test
  public void testCreateServiceClient() {
    when(adsServiceClientFactory.create(
        soapClient, adsServiceDescriptor, adsSession)).thenReturn(
            adsServiceClient);

    AdsServiceClient<AdsSession, AdsServiceDescriptor> testAdsServiceClient =
        abstractAdsServiceClientFactoryHelper.createServiceClient(soapClient,
            adsServiceDescriptor, adsSession);

    assertSame(adsServiceClient, testAdsServiceClient);
  }

  @Test
  public void testCreateSoapClient() {
    when(soapClientHandler.createSoapClient(adsServiceDescriptor))
        .thenReturn(soapClient);

    Object testSoapClient =
        abstractAdsServiceClientFactoryHelper.createSoapClient(adsServiceDescriptor);

    assertSame(soapClient, testSoapClient);
  }

  @Test
  public void testCreateServiceDescriptor() {
    Class<MockSoapClientInterface> interfaceClass = MockSoapClientInterface.class;
    when(adsServiceDescriptorFactory.create(interfaceClass, VERSION))
        .thenReturn(adsServiceDescriptor);

    AdsServiceDescriptor testAdsServiceDescriptor =
        abstractAdsServiceClientFactoryHelper.createServiceDescriptor(interfaceClass,
            VERSION);

    assertSame(adsServiceDescriptor, testAdsServiceDescriptor);
  }
}

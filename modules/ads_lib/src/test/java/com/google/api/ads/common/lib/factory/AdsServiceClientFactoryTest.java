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

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.client.AdsServiceClient;
import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.factory.helper.AdsServiceClientFactoryHelper;
import com.google.api.ads.common.lib.soap.SoapServiceClient;
import com.google.api.ads.common.lib.soap.testing.MockSoapClientInterface;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Test for the {@link AdsServiceClientFactory} class.
 */
@RunWith(JUnit4.class)
public class AdsServiceClientFactoryTest {
  private AdsServiceClientFactory<AdsServiceClient<AdsSession, AdsServiceDescriptor>, AdsSession,
      AdsServiceDescriptor> adsServiceClientFactory;

  @Mock
  private AdsServiceClient<AdsSession, AdsServiceDescriptor> adsServiceClient;

  @Mock
  private SoapServiceClient<Object> soapServiceClient;

  @Mock
  private AdsServiceDescriptor adsServiceDescriptor;

  @Mock
  private AdsServiceClientFactoryHelper<AdsServiceClient<AdsSession, AdsServiceDescriptor>,
      AdsSession, AdsServiceDescriptor> adsServiceClientFactoryHelper;

  @Mock
  private AdsSession adsSession;

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  public AdsServiceClientFactoryTest() {}

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    adsServiceClientFactory =
        new AdsServiceClientFactory<AdsServiceClient<AdsSession, AdsServiceDescriptor>, AdsSession,
            AdsServiceDescriptor>(adsServiceClientFactoryHelper);
  }

  /**
   * Test that verifies that an object implementing the requested interface is returned from a
   * valid call to getServiceClient.
   */
  @Test
  public void testGetServiceClient() {
    String version = "v1.1";

    when(adsServiceClientFactoryHelper.determineVersion(MockSoapClientInterface.class))
        .thenReturn(version);

    when(
        adsServiceClientFactoryHelper.createServiceDescriptor(
            MockSoapClientInterface.class, version)).thenReturn(adsServiceDescriptor);
    when(adsServiceClientFactoryHelper.createAdsServiceClient(adsServiceDescriptor, adsSession))
        .thenReturn(adsServiceClient);
    Mockito.<Class<?>>when(adsServiceDescriptor.getInterfaceClass())
        .thenReturn(MockSoapClientInterface.class);
    when(adsServiceClient.getSoapClient()).thenReturn(soapServiceClient);

    MockSoapClientInterface mockSoapClientInterface =
        adsServiceClientFactory.getServiceClient(adsSession, MockSoapClientInterface.class);
    assertNotNull("Null mock interface returned from getServiceClient", mockSoapClientInterface);
  }

  /**
   * Test to verify that a ServiceException is thrown if the preconditions check by the underlying
   * AdsServiceClientFactoryHelper fails.
   */
  @Test
  public void testGetServiceClient_failPreconditions() {
    String version = "v1.1";

    ServiceException serviceException = new ServiceException("A service exception");
    doThrow(serviceException)
        .when(adsServiceClientFactoryHelper)
        .checkServiceClientPreconditions(adsSession, MockSoapClientInterface.class);

    when(adsServiceClientFactoryHelper.determineVersion(MockSoapClientInterface.class))
        .thenReturn(version);

    when(
        adsServiceClientFactoryHelper.createServiceDescriptor(
            MockSoapClientInterface.class, version)).thenReturn(adsServiceDescriptor);
    when(adsServiceClientFactoryHelper.createAdsServiceClient(adsServiceDescriptor, adsSession))
        .thenReturn(adsServiceClient);
    Mockito.<Class<?>>when(adsServiceDescriptor.getInterfaceClass())
        .thenReturn(MockSoapClientInterface.class);
    when(adsServiceClient.getSoapClient()).thenReturn(soapServiceClient);

    thrown.expect(Matchers.<Exception>is(serviceException));
    adsServiceClientFactory.getServiceClient(adsSession, MockSoapClientInterface.class);
  }
}

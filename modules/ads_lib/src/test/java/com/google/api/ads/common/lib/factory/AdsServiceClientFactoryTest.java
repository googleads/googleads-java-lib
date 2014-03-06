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

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.client.AdsServiceClient;
import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.factory.helper.AdsServiceClientFactoryHelper;
import com.google.api.ads.common.lib.soap.testing.MockSoapClientInterface;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;

/**
 * Test for the {@link AdsServiceClientFactory} class.
 *
 * @author Joseph DiLallo
 * @author Adam Rogal
 */
@RunWith(JUnit4.class)
public class AdsServiceClientFactoryTest {

  private AdsServiceClientFactory<AdsServiceClient<AdsSession, AdsServiceDescriptor>,
                                  AdsSession,
                                  AdsServiceDescriptor> adsServiceClientFactory;

  @Mock private AdsServiceClient<AdsSession, AdsServiceDescriptor> adsServiceClient;
  @Mock private AdsServiceDescriptor adsServiceDescriptor;
  @Mock private AdsServiceClientFactoryHelper<AdsServiceClient<AdsSession,
                                                         AdsServiceDescriptor>,
                                        AdsSession,
                                        AdsServiceDescriptor> adsServiceClientFactoryHelper;
  @Mock private AdsSession adsSession;

  public AdsServiceClientFactoryTest() {}

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    adsServiceClientFactory = spy(new AdsServiceClientFactory<
        AdsServiceClient<AdsSession, AdsServiceDescriptor>, AdsSession, AdsServiceDescriptor>(
        adsServiceClientFactoryHelper));
  }

  @Test
  @SuppressWarnings({"unchecked", "rawtypes"})
  public void testGetServiceClient() {
    String version = "v1.1";
    ArgumentCaptor<Set> setArg = ArgumentCaptor.forClass(Set.class);

    when(adsServiceClientFactoryHelper.determineVersion(MockSoapClientInterface.class))
        .thenReturn(version);

    when(adsServiceClientFactoryHelper.createServiceDescriptor(
        MockSoapClientInterface.class, version)).thenReturn(adsServiceDescriptor);
    when(
        adsServiceClientFactoryHelper.createAdsServiceClient(adsServiceDescriptor, adsSession))
        .thenReturn(adsServiceClient);
    when((Class<MockSoapClientInterface>) adsServiceDescriptor.getInterfaceClass())
        .thenReturn(MockSoapClientInterface.class);
    doReturn(null).when(adsServiceClientFactory).createProxy(any(AdsServiceClient.class),
        any(Set.class));

    MockSoapClientInterface testAdsServiceClient =
        adsServiceClientFactory.getServiceClient(adsSession, MockSoapClientInterface.class);

    verify(adsServiceClientFactory).createProxy(eq(adsServiceClient), setArg.capture());
    assertTrue(setArg.getValue().contains(MockSoapClientInterface.class));
  }

  @Test(expected = ServiceException.class)
  @SuppressWarnings({"unchecked", "rawtypes"})
  public void testGetServiceClient_failPreconditions() {
    String version = "v1.1";
    ArgumentCaptor<Set> setArg = ArgumentCaptor.forClass(Set.class);

   doThrow(new ServiceException("")).when(adsServiceClientFactoryHelper)
       .checkServiceClientPreconditions(adsSession, MockSoapClientInterface.class);

    when(adsServiceClientFactoryHelper.determineVersion(MockSoapClientInterface.class))
        .thenReturn(version);

    when(adsServiceClientFactoryHelper.createServiceDescriptor(
        MockSoapClientInterface.class, version)).thenReturn(adsServiceDescriptor);
    when(
        adsServiceClientFactoryHelper.createAdsServiceClient(adsServiceDescriptor, adsSession))
        .thenReturn(adsServiceClient);
    when((Class<MockSoapClientInterface>) adsServiceDescriptor.getInterfaceClass())
        .thenReturn(MockSoapClientInterface.class);
    doReturn(null).when(adsServiceClientFactory).createProxy(any(AdsServiceClient.class),
        any(Set.class));

    MockSoapClientInterface testAdsServiceClient =
        adsServiceClientFactory.getServiceClient(adsSession, MockSoapClientInterface.class);

    verify(adsServiceClientFactory).createProxy(eq(adsServiceClient), setArg.capture());
    assertTrue(setArg.getValue().contains(MockSoapClientInterface.class));
  }
}

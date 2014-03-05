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

package com.google.api.ads.common.lib.client;

import static org.mockito.Mockito.verify;

import com.google.api.ads.common.lib.soap.SoapCallReturn;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.utils.logging.AdsServiceLoggers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Test for the {@link AdsServiceClient} class.
 *
 * @author Joseph DiLallo
 * @author Adam Rogal
 */
@RunWith(JUnit4.class)
public class AdsServiceClientTest {

  private AdsServiceClient<AdsSession, AdsServiceDescriptor> adsServiceClient;

  @Mock private AdsSession adsSession;
  @Mock private Object soapClient;
  @Mock private SoapClientHandlerInterface<Object> soapClientHandler;
  @Mock private AdsServiceLoggers adsServiceLoggers;
  @Mock private AdsServiceDescriptor adsServiceDescriptor;
  @Mock private HeaderHandler<AdsSession, AdsServiceDescriptor> headerHandler;

  public AdsServiceClientTest() {}

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    adsServiceClient =
        new AdsServiceClient<AdsSession, AdsServiceDescriptor>(soapClient, adsSession,
            adsServiceDescriptor, soapClientHandler, headerHandler, adsServiceLoggers) {};
  }

  @Test
  public void testLogSoapCall() {
    SoapCallReturn soapCallReturn = Mockito.mock(SoapCallReturn.class);

    adsServiceClient.logSoapCall(soapCallReturn);

    verify(adsServiceLoggers).logRequest(soapCallReturn);
    verify(adsServiceLoggers).logSoapXml(soapCallReturn);
  }

  @Test
  public void testSetHeaders() throws Exception {
    adsServiceClient.setHeaders();

    verify(soapClientHandler).clearHeaders(soapClient);
    verify(headerHandler).setHeaders(soapClient, adsSession, adsServiceDescriptor);
  }
}

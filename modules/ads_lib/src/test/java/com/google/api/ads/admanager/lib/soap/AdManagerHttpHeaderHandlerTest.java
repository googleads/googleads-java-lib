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

package com.google.api.ads.admanager.lib.soap;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/** Tests for {@link AdManagerHttpHeaderHandler}. */
@RunWith(JUnit4.class)
public class AdManagerHttpHeaderHandlerTest {

  private AdManagerHttpHeaderHandler adManagerHttpHeaderHandler;

  @Mock private SoapClientHandlerInterface<Object> soapClientHandler;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    adManagerHttpHeaderHandler = new AdManagerHttpHeaderHandler(soapClientHandler);
  }

  /**
   * Tests setting the headers.
   */
  @SuppressWarnings("unchecked")
  @Test
  public void testSetHeaders() throws Exception {
    Object soapClient = new Object();
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    AdManagerSession adManagerSession =
        new AdManagerSession.Builder()
            .withApplicationName("FooBar")
            .withOAuth2Credential(credential)
            .withEndpoint("https://ads.google.com")
            .withNetworkCode("networkCode")
            .build();

    adManagerHttpHeaderHandler.setHttpHeaders(soapClient, adManagerSession);

    verify(soapClientHandler).putAllHttpHeaders(eq(soapClient), any(Map.class));
  }
}

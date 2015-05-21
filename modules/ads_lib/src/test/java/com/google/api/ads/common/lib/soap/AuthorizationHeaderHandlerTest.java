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

package com.google.api.ads.common.lib.soap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.same;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.auth.AuthorizationHeaderProvider;
import com.google.api.ads.common.lib.client.AdsSession;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

/**
 * Tests for {@link AuthorizationHeaderHandler}.
 *
 * @author Adam Rogal
 */
@RunWith(JUnit4.class)
public class AuthorizationHeaderHandlerTest {

  private AuthorizationHeaderHandler authorizationHeaderHandler;

  @Mock private SoapClientHandlerInterface<Object> soapClientHandler;
  @Mock private AuthorizationHeaderProvider authorizationHeaderProvider;

  @SuppressWarnings("unchecked")
  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    authorizationHeaderHandler =
        new AuthorizationHeaderHandler(soapClientHandler, authorizationHeaderProvider);
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testSetAuthorization() throws Exception {
    String authorizationHeaderValue = "IAmAuthorized";
    final String endpoint = "endpoint";
    Object soapClient = new Object();
    AdsSession adsSession = new AdsSession() {
      @Override
      public String getEndpoint() {
        return endpoint;
      }
    };
    @SuppressWarnings("rawtypes")
    ArgumentCaptor<Map> headers = ArgumentCaptor.forClass(Map.class);

    when(soapClientHandler.getEndpointAddress(soapClient)).thenReturn(endpoint);
    when(authorizationHeaderProvider.getAuthorizationHeader(
        same(adsSession), eq(endpoint))).thenReturn(authorizationHeaderValue);

    authorizationHeaderHandler.setAuthorization(soapClient, adsSession);

    verify(soapClientHandler).putAllHttpHeaders(eq(soapClient), headers.capture());
    String actualAuthorizationHeaderValue = (String) headers.getValue().get("Authorization");
    assertEquals(authorizationHeaderValue, actualAuthorizationHeaderValue);
  }
}

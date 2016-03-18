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

package com.google.api.ads.common.lib.auth;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.GenericUrl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Tests for {@link AuthorizationHeaderProvider}.
 */
@RunWith(JUnit4.class)
public class AuthorizationHeaderProviderTest {

  private AuthorizationHeaderProvider authorizationHeaderProvider;

  @Mock private OAuth2AuthorizationHeaderProvider oAuth2AuthorizationHeaderProvider;
  @Mock private AdsLibConfiguration adsLibConfiguration;
  @Mock private OAuth2Helper oAuth2Helper;

  private static final GenericUrl ENDPOINT_URL = new GenericUrl("https://google.com/api/service");

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    authorizationHeaderProvider = new AuthorizationHeaderProvider(
        oAuth2AuthorizationHeaderProvider, adsLibConfiguration, oAuth2Helper);
  }

  @Test
  public void testGetAuthorizationHeader_oAuth2Refresh() throws Exception {
    final Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    AdsSession adsSession = new OAuth2Session() {
      @Override
      public Credential getOAuth2Credential() {
        return credential;
      }
    };

    when(oAuth2AuthorizationHeaderProvider.getOAuth2AuthorizationHeader(
        (OAuth2Compatible) adsSession)).thenReturn("OAuth2 Header");
    when(adsLibConfiguration.isAutoRefreshOAuth2TokenEnabled()).thenReturn(true);

    assertEquals("OAuth2 Header",
        authorizationHeaderProvider.getAuthorizationHeader(adsSession, ENDPOINT_URL.toString()));

    verify(oAuth2Helper).refreshCredential(credential);
  }

  @Test
  public void testGetAuthorizationHeader_oAuth2NoRefresh() throws Exception {
    final Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());
    AdsSession adsSession = new OAuth2Session() {
      @Override
      public Credential getOAuth2Credential() {
        return credential;
      }
    };

    when(oAuth2AuthorizationHeaderProvider.getOAuth2AuthorizationHeader(
        (OAuth2Compatible) adsSession)).thenReturn("OAuth2 Header");
    when(adsLibConfiguration.isAutoRefreshOAuth2TokenEnabled()).thenReturn(false);

    assertEquals("OAuth2 Header",
        authorizationHeaderProvider.getAuthorizationHeader(adsSession, ENDPOINT_URL.toString()));

    verify(oAuth2Helper, times(0)).refreshCredential(credential);
  }

  private abstract class BaseAdsSession implements AdsSession {

    @Override
    public String getEndpoint() {
      return null;
    }
  }

  private abstract class OAuth2Session extends BaseAdsSession implements OAuth2Compatible {}

}

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

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import java.io.IOException;

/**
 * Tests for {@link OAuth2Helper}.
 *
 * @author Adam Rogal
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class OAuth2HelperTest {

  private OAuth2Helper oAuth2Helper;

  @Mock private Logger libLogger;
  private Credential credential;

  @Rule public ExpectedException thrown = ExpectedException.none();
  
  private static final String ACCESS_TOKEN = "abc";
  private static final GenericUrl TOKEN_SERVER_URL = new GenericUrl("http://example.com/token");
  private static final String REFRESH_TOKEN = "refreshToken";
  private static final Long REFRESH_WINDOW_SECS = 60L;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    credential =
        new Credential.Builder(BearerToken.authorizationHeaderAccessMethod())
            .setTransport(new NetHttpTransport())
            .setJsonFactory(Mockito.mock(JsonFactory.class))
            .setClientAuthentication(Mockito.mock(HttpExecuteInterceptor.class))
            .setTokenServerUrl(TOKEN_SERVER_URL).build();
    oAuth2Helper = spy(new OAuth2Helper(libLogger, REFRESH_WINDOW_SECS));
  }

  @Test
  public void testRefreshCredential_noRefreshToken() throws Exception {
    credential.setAccessToken(ACCESS_TOKEN);
    credential.setRefreshToken(null);
    credential.setExpiresInSeconds(null);

    assertSame(credential, oAuth2Helper.refreshCredential(credential));
  }

  @Test
  public void testRefreshCredential_notSoonEnough() throws Exception {
    credential.setAccessToken(ACCESS_TOKEN);
    credential.setRefreshToken(REFRESH_TOKEN);
    credential.setExpiresInSeconds(REFRESH_WINDOW_SECS * 2L);

    assertSame(credential, oAuth2Helper.refreshCredential(credential));
  }

  @Test
  public void testRefreshCredential_refresh() throws Exception {
    credential.setAccessToken(ACCESS_TOKEN);
    credential.setRefreshToken(REFRESH_TOKEN);
    credential.setExpiresInSeconds(REFRESH_WINDOW_SECS - 10L);

    Mockito.doReturn(true).when(oAuth2Helper).callRefreshToken(credential);

    oAuth2Helper.refreshCredential(credential);

    verify(oAuth2Helper).callRefreshToken(credential);
  }

  @Test
  public void testRefreshCredential_refreshFailedNoException() throws Exception {
    credential.setAccessToken(ACCESS_TOKEN);
    credential.setRefreshToken(REFRESH_TOKEN);
    credential.setExpiresInSeconds(REFRESH_WINDOW_SECS - 10L);

    Mockito.doReturn(false).when(oAuth2Helper).callRefreshToken(credential);

    oAuth2Helper.refreshCredential(credential);
  }

  @Test
  public void testRefreshCredential_refreshFailedException() throws Exception {
    credential.setAccessToken(ACCESS_TOKEN);
    credential.setRefreshToken(REFRESH_TOKEN);
    credential.setExpiresInSeconds(REFRESH_WINDOW_SECS - 10L);

    Mockito.doThrow(new IOException("Failed")).when(oAuth2Helper).callRefreshToken(credential);

    thrown.expect(IOException.class);
    oAuth2Helper.refreshCredential(credential);
  }
}

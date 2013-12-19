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

import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;

import java.io.IOException;

import javax.annotation.Nullable;

/**
 * Authorization header provider that can delegate between different
 * authentication mechanisms depending on the {@link AdsSession}.
 *
 * @author Adam Rogal
 */
public class AuthorizationHeaderProvider {

  @VisibleForTesting
  static final String CLIENT_LOGIN_HEADER_PREFIX = "GoogleLogin auth=";
  private final OAuth2AuthorizationHeaderProvider oAuth2AuthorizationHeaderProvider;
  private final AdsLibConfiguration adsLibConfiguration;
  private final OAuth2Helper oAuth2Helper;

  /**
   * Constructor.
   *
   * @param oAuth2AuthorizationHeaderProvider the OAuth2 header provider
   * @param adsLibConfiguration the library configuration
   * @param oAuth2Helper the OAuth2 helper
   */
  @Inject
  public AuthorizationHeaderProvider(
      OAuth2AuthorizationHeaderProvider oAuth2AuthorizationHeaderProvider,
      AdsLibConfiguration adsLibConfiguration,
      OAuth2Helper oAuth2Helper) {
    this.oAuth2AuthorizationHeaderProvider = oAuth2AuthorizationHeaderProvider;
    this.adsLibConfiguration = adsLibConfiguration;
    this.oAuth2Helper = oAuth2Helper;
  }

  /**
   * Gets a header value that can be set to the {@code Authorization} HTTP
   * header. The endpoint URL can be {@code null} if it's not needed for the
   * authentication mechanism (i.e. OAuth2).
   *
   * @param adsSession the session to pull authentication information from
   * @param endpointUrl the endpoint URL used for authentication mechanisms like
   *        OAuth.
   * @return the authorization header
   * @throws AuthenticationException if the authorization header could not be
   *         created
   * @throws IllegalArgumentException if no valid authentication information
   *         exists within the session.
   */
  public String getAuthorizationHeader(AdsSession adsSession, @Nullable String endpointUrl)
      throws AuthenticationException {
    if (adsSession instanceof OAuth2Compatible
        && ((OAuth2Compatible) adsSession).getOAuth2Credential() != null) {
      return getOAuth2Header((OAuth2Compatible) adsSession);
    } else if (adsSession instanceof ClientLoginCompatible &&
        ((ClientLoginCompatible) adsSession).getClientLoginToken() != null) {
      return getClientLoginHeader((ClientLoginCompatible) adsSession);
    } else {
      throw new IllegalArgumentException(
          "Session does not have any valid authentication mechanisms");
    }
  }

  /**
   * Gets the ClientLogin header.
   */
  private String getClientLoginHeader(ClientLoginCompatible adsSession) {
    return CLIENT_LOGIN_HEADER_PREFIX + adsSession.getClientLoginToken();
  }

  /**
   * Gets the OAuth2 header.
   *
   * @throws OAuthException if the OAuth2 token could not be refreshed.
   */
  private String getOAuth2Header(OAuth2Compatible oAuth2Compatible) throws OAuthException {
    if (adsLibConfiguration.isAutoRefreshOAuth2TokenEnabled()) {
      try {
        oAuth2Helper.refreshCredential(oAuth2Compatible.getOAuth2Credential());
      } catch (IOException e) {
        throw new OAuthException("OAuth2 token could not be refreshed.", e);
      }
    }

    return oAuth2AuthorizationHeaderProvider.getOAuth2AuthorizationHeader(oAuth2Compatible);
  }
}

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

/**
 * OAuth2 authorization header provider.
 *
 * @author Adam Rogal
 */
public class OAuth2AuthorizationHeaderProvider {

  private static final String HEADER_PREFIX = "Bearer ";

  /**
   * Constructor.
   */
  public OAuth2AuthorizationHeaderProvider() {}

  /**
   * Gets the OAuth2 authorization header for the parameters and request URL.
   *
   * @param oAuth2Compatible exposes the OAuth2 credentials
   * @return the {@code Authorization} header value to set
   */
  public String getOAuth2AuthorizationHeader(OAuth2Compatible oAuth2Compatible) {
      return HEADER_PREFIX + oAuth2Compatible.getOAuth2Credential().getAccessToken();
  }
}

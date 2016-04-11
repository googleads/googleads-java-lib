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

package com.google.api.ads.common.lib.utils;

import com.google.api.ads.common.lib.auth.AuthorizationHeaderProvider;
import com.google.api.ads.common.lib.auth.OAuth2Helper;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.ads.common.lib.utils.logging.AdsServiceLoggers;
import com.google.api.client.http.HttpTransport;

import javax.inject.Inject;

/**
 * Provides access to internal utilities.
 */
public class Internals {

  private final UserAgentCombiner userAgentCombiner;
  private final AuthorizationHeaderProvider authorizationHeaderProvider;
  private final HttpTransport httpTransport;
  private final AdsServiceLoggers adsServiceLoggers;
  private final OAuth2Helper oAuth2Helper;
  private final AdsUtilityRegistry adsUtilityRegistry;

  /**
   * Constructor to be injected by guice.
   */
  @Inject
  public Internals(AuthorizationHeaderProvider authorizationHeaderProvider,
      UserAgentCombiner userAgentCombiner, HttpTransport httpTransport,
      AdsServiceLoggers adsServiceLoggers, OAuth2Helper oAuth2Helper,
      AdsUtilityRegistry adsUtilityRegistry) {
    this.authorizationHeaderProvider = authorizationHeaderProvider;
    this.userAgentCombiner = userAgentCombiner;
    this.httpTransport = httpTransport;
    this.adsServiceLoggers = adsServiceLoggers;
    this.oAuth2Helper = oAuth2Helper;
    this.adsUtilityRegistry = adsUtilityRegistry;
  }

  /**
   * Creates a verbose User-Agent header.
   */
  public UserAgentCombiner getUserAgentCombiner() {
    return userAgentCombiner;
  }

  /**
   * Obtains the Authorization header value.
   */
  public AuthorizationHeaderProvider getAuthorizationHeaderProvider() {
    return authorizationHeaderProvider;
  }

  /**
   * Returns an HttpTransport suitable for the java environment.
   */
  public HttpTransport getHttpTransport() {
    return httpTransport;
  }

  /**
   * Gets the loggers.
   */
  public AdsServiceLoggers getAdsServiceLoggers() {
    return adsServiceLoggers;
  }

  /**
   * Gets the OAuth2 helper.
   */
  public OAuth2Helper getOAuth2Helper() {
    return oAuth2Helper;
  }
  
  /**
   * Gets the ads utility registry.
   */
  public AdsUtilityRegistry getAdsUtilityRegistry() {
    return adsUtilityRegistry;
  }
}

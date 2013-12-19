// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utility.extension.util;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.client.AdWordsSession.Builder;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Helper class to copy the {@link AdWordsSession}.
 *
 * @author Julian Toledo
 */
public class AdWordsSessionUtil {

  static Logger log = LoggerFactory.getLogger(AdWordsSessionUtil.class);

  private static final String USER_AGENT = "AdWordsAxisUtilityExtension";

  /**
   * Creates a copy of the AdWordsSession.
   * 
   * @param adWordsSession to copy from
   * @return a new copy of the AdWordsSession
   */
  public static AdWordsSession copy(AdWordsSession adWordsSession) {
    return copy(adWordsSession, adWordsSession.getUserAgent());
  }

  /**
   * Copies the AdWordsSession and Adds USER_AGENT to the userAgent.
   * 
   * @param adWordsSession to copy from
   * @return a new copy of the AdWordsSession with the new userAgent
   */
  public static AdWordsSession copyWithUtilityUserAgent(AdWordsSession adWordsSession) {
    String userAgent = "";
    if (adWordsSession.getUserAgent() != null) {
      userAgent = adWordsSession.getUserAgent();
    }
    if (!userAgent.startsWith(USER_AGENT)) {
      return copy(adWordsSession, USER_AGENT + userAgent);
    } else {
      return copy(adWordsSession);
    }
  }

  /**
   * Copies (if needed) the AdWordsSession and Adds USER_AGENT to the userAgent.
   * 
   * @param adWordsSession to copy from
   * @return a new copy of the AdWordsSession with the new userAgent only if needed
   */
  public static AdWordsSession copyIfNeededWithUtilityUserAgent(AdWordsSession adWordsSession) {
    String userAgent = "";
    if (adWordsSession.getUserAgent() != null) {
      userAgent = adWordsSession.getUserAgent();
    }
    if (!userAgent.startsWith(USER_AGENT)) {
      return copy(adWordsSession, USER_AGENT + userAgent);
    } else {
      return adWordsSession;
    }
  }

  /**
   * Creates a copy of the AdWordsSession and changes the userAgent.
   * 
   * @param adWordsSession to copy from
   * @param userAgent the new User Agent for the session
   * @return a new copy of the AdWordsSession
   */
  @SuppressWarnings("deprecation")
  public static AdWordsSession copy(AdWordsSession adWordsSession, String userAgent) {
    AdWordsSession.Builder builder = new Builder();
    if (adWordsSession.getEndpoint() != null) {
      builder = builder.withEndpoint(adWordsSession.getEndpoint());
    }
    if (adWordsSession.getClientLoginToken() != null) {
      builder = builder.withClientLoginToken(adWordsSession.getClientLoginToken());
    }
    if (userAgent != null) {
      builder = builder.withUserAgent(userAgent);
    }
    if (adWordsSession.getDeveloperToken() != null) {
      builder = builder.withDeveloperToken(adWordsSession.getDeveloperToken());
    }
    if (adWordsSession.getClientCustomerId() != null) {
      builder = builder.withClientCustomerId(adWordsSession.getClientCustomerId());
    }
    if (adWordsSession.getOAuth2Credential() != null) {
      builder = builder.withOAuth2Credential(adWordsSession.getOAuth2Credential());
    }

    try {
      AdWordsSession newAdWordsSession;
      newAdWordsSession = builder.build();
      newAdWordsSession.setPartialFailure(adWordsSession.isPartialFailure());
      newAdWordsSession.setValidateOnly(adWordsSession.isValidateOnly());
      newAdWordsSession.setReportMoneyInMicros(adWordsSession.isReportMoneyInMicros());
      return newAdWordsSession;
    } catch (ValidationException e) {
      log.warn("Error @addUtilityUserAgent, returning unchanged AdWordsSession");
      return adWordsSession;
    }
  }

  /**
   * Creates a new AdWordsSession using the ads.properties file and using OAuth2.
   *
   * @return the AdWordsSession associated with the ads.properties file
   * @throws OAuthException if problem with OAuth2
   * @throws ConfigurationLoadException if problems loading the ad.properties file
   * @throws ValidationException if the {@code AdWordsSession} did not validate
   */
  public static AdWordsSession fromFileWithOAuth2()
      throws OAuthException, ValidationException, ConfigurationLoadException {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct and return an AdWordsSession.
    return new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();
  }
}
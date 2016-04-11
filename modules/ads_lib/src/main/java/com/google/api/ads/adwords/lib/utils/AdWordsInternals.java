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

package com.google.api.ads.adwords.lib.utils;

import com.google.api.ads.adwords.lib.AdWordsModule;
import com.google.api.ads.adwords.lib.conf.AdWordsLibConfiguration;
import com.google.api.ads.adwords.lib.utils.logging.AdWordsServiceLoggers;
import com.google.api.ads.common.lib.auth.AuthorizationHeaderProvider;
import com.google.api.ads.common.lib.auth.OAuth2Helper;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.ads.common.lib.utils.AdsUtilityRegistry;
import com.google.api.ads.common.lib.utils.Internals;
import com.google.api.client.http.HttpTransport;
import com.google.inject.Guice;

import javax.inject.Inject;

/**
 * Provides access to some internal guice-injected objects.
 */
public class AdWordsInternals extends Internals {

  private static final AdWordsInternals INSTANCE = Guice.createInjector(
      new AdWordsModule()).getInstance(AdWordsInternals.class);

  private final AdWordsLibConfiguration adWordsLibConfiguration;

  @Inject
  public AdWordsInternals(AuthorizationHeaderProvider authorizationHeaderProvider,
      UserAgentCombiner userAgentCombiner, HttpTransport httpTransport,
      AdWordsLibConfiguration adWordsLibConfiguration,
      AdWordsServiceLoggers adWordsServiceLoggers, OAuth2Helper oAuth2Helper,
      AdsUtilityRegistry adsUtilityRegistry) {
    super(authorizationHeaderProvider, userAgentCombiner, httpTransport, adWordsServiceLoggers,
        oAuth2Helper, adsUtilityRegistry);
    this.adWordsLibConfiguration = adWordsLibConfiguration;
  }

  /**
   * Returns the singleton instance.
   */
  public static AdWordsInternals getInstance() {
    return INSTANCE;
  }

  /**
   * Returns the AdWordsLibConfiguration.
   */
  public AdWordsLibConfiguration getAdWordsLibConfiguration() {
    return adWordsLibConfiguration;
  }
  
  /**
   * Returns the utility that provides access to additional AdWords-specific loggers.
   */
  public AdWordsServiceLoggers getAdWordsServiceLoggers() {
    return (AdWordsServiceLoggers) getAdsServiceLoggers();
  }
}

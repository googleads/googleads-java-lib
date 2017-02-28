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
import com.google.api.ads.adwords.lib.factory.DependencyBootstrapper;
import com.google.api.ads.adwords.lib.utils.logging.AdWordsServiceLoggers;
import com.google.api.ads.common.lib.auth.AuthorizationHeaderProvider;
import com.google.api.ads.common.lib.auth.OAuth2Helper;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.ads.common.lib.utils.AdsUtilityRegistry;
import com.google.api.ads.common.lib.utils.Internals;
import com.google.api.ads.common.lib.utils.XmlFieldExtractor;
import com.google.api.client.http.HttpTransport;
import com.google.inject.Guice;
import com.google.inject.Injector;
import javax.inject.Inject;

/**
 * Provides access to some internal guice-injected objects.
 */
public class AdWordsInternals extends Internals {

  private static final Injector DEFAULT_INJECTOR = Guice.createInjector(new AdWordsModule());

  private static final AdWordsInternals INSTANCE =
      DEFAULT_INJECTOR.getInstance(AdWordsInternals.class);

  private final AdWordsLibConfiguration adWordsLibConfiguration;

  private final Injector injector;

  /** Constructor used by Guice. */
  @Inject
  AdWordsInternals(AuthorizationHeaderProvider authorizationHeaderProvider,
      UserAgentCombiner userAgentCombiner, HttpTransport httpTransport,
      AdWordsLibConfiguration adWordsLibConfiguration,
      AdWordsServiceLoggers adWordsServiceLoggers, OAuth2Helper oAuth2Helper,
      AdsUtilityRegistry adsUtilityRegistry,
      XmlFieldExtractor xmlFieldExtractor,
      Injector injector) {
    super(authorizationHeaderProvider, userAgentCombiner, httpTransport, adWordsServiceLoggers,
        oAuth2Helper, adsUtilityRegistry, xmlFieldExtractor);
    this.adWordsLibConfiguration = adWordsLibConfiguration;
    this.injector = injector;
  }

  /**
   * Returns the singleton instance.
   */
  public static AdWordsInternals getInstance() {
    return INSTANCE;
  }
  
  /**
   * Returns a dependency bootstrapper based on the default instance of this class. This method
   * exists in order to support legacy constructors for various utilities.
   *
   * <p>To get an instance of a utility, use {@link
   * com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface#getUtility(com.google.api.ads.adwords.lib.client.AdWordsSession,
   * Class)} instead.
   *
   * @see
   *     com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface#getUtility(com.google.api.ads.adwords.lib.client.AdWordsSession,
   *     Class)
   */
  public static DependencyBootstrapper getBootstrapper() {
    return INSTANCE.injector.getInstance(DependencyBootstrapper.class);
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

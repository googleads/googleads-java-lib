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

package com.google.api.ads.adwords.jaxws.factory;

import com.google.api.ads.adwords.jaxws.AdWordsJaxWsModule;
import com.google.api.ads.adwords.lib.AdWordsPluginModule;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.factory.BaseAdWordsServices;
import com.google.api.ads.adwords.lib.factory.DependencyBootstrapper;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Utility class to create AdWords service clients. The session is stored
 * as a reference within the client so that the session may be altered to
 * affect the behavior of the client.
 * <p>
 * Usage example:
 * <pre><code>
 * AdWordsSession session = new AdWordsSession.Builder()...build();
 * CampaignServiceInterface campaignService =
 *    AdWordsServices.getInstance().get(session, CampaignServiceInterface.class);
 * campaignService.get(...);
 * ...
 * session.setClientCustomerId(...);
 * campaignService.get(...);
 * </code></pre>
 *
 * <p>
 * Implementation is thread-safe.
 * </p>
 */
public final class AdWordsServices extends BaseAdWordsServices {
  
  private static final Injector INJECTOR = Guice.createInjector(new AdWordsJaxWsModule());
  private static final AdWordsServices DEFAULT_INSTANCE = new AdWordsServices();

  private AdWordsServices(Injector injector) {
    super(injector);
  }
  
  public AdWordsServices() {
    this(INJECTOR);
  }

  @Override
  public AdWordsServicesInterface withPluginModule(AdWordsPluginModule pluginModule) {
    return new AdWordsServices(Guice.createInjector(new AdWordsJaxWsModule(), pluginModule));
  }
  
  /**
   * Returns the default instance, configured when this class was loaded. This is the preferred
   * mechanism for obtaining an instance of this class.
   */
  public static final AdWordsServicesInterface getInstance() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Returns a new instance, configured using the current set of configurations and system
   * properties.
   */
  public static final AdWordsServicesInterface newInstance() {
    return new AdWordsServices(Guice.createInjector(new AdWordsJaxWsModule()));
  }
  
  /**
   * Returns a dependency bootstrapper based on the default instance of this class. This method
   * exists in order to support legacy constructors for various utilities.
   *
   * <p>To get an instance of a utility, use {@link
   * #getUtility(com.google.api.ads.adwords.lib.client.AdWordsSession, Class)} instead.
   *
   * @see #getUtility(com.google.api.ads.adwords.lib.client.AdWordsSession, Class)
   */
  public static final DependencyBootstrapper getBootstrapper() {
    return DEFAULT_INSTANCE.createBootstrapper();
  }
}

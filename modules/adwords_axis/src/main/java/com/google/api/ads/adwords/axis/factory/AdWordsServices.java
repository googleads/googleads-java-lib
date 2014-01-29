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

package com.google.api.ads.adwords.axis.factory;

import com.google.api.ads.adwords.axis.AdWordsAxisModule;
import com.google.api.ads.adwords.lib.factory.BaseAdWordsServices;
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
 *    new AdWordsServices().get(session, CampaignServiceInterface.class);
 * campaignService.get(...);
 * ...
 * session.setClientCustomerId(...);
 * campaignService.get(...);
 * </code></pre>
 *
 * <p>
 * Implementation is thread-safe.
 * </p>
 *
 * @author Joseph DiLallo
 */
public final class AdWordsServices extends BaseAdWordsServices {

  private static final Injector INJECTOR = Guice.createInjector(new AdWordsAxisModule());

  public AdWordsServices() {
    super(INJECTOR);
  }
}

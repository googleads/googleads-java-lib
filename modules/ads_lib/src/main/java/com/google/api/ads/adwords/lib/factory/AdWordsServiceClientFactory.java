// Copyright 2011 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.factory;

import com.google.api.ads.adwords.lib.client.AdWordsServiceClient;
import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.factory.AdsServiceClientFactory;
import com.google.api.ads.common.lib.factory.BaseAdsServiceClientFactory;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Injector;

import javax.inject.Inject;

/**
 * Factory which creates AdWords service clients.
 */
public class AdWordsServiceClientFactory
    extends BaseAdsServiceClientFactory<AdWordsServiceClient,
                                        AdWordsSession,
                                        AdWordsServiceDescriptor> {

  /**
   * Constructor.
   *
   * @param injector an injector which binds all the necessary classes
   */
  public AdWordsServiceClientFactory(Injector injector) {
    super(injector);
  }

  /**
   * Constructor used for injection.
   *
   * @param adsServiceClientFactory the ads service client factory
   */
  @Inject
  @VisibleForTesting
  AdWordsServiceClientFactory(AdsServiceClientFactory<AdWordsServiceClient,
                                                      AdWordsSession,
                                                      AdWordsServiceDescriptor>
      adsServiceClientFactory) {
    super(adsServiceClientFactory);
  }
}

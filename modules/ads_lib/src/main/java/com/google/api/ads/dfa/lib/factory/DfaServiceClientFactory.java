// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfa.lib.factory;

import com.google.api.ads.common.lib.factory.AdsServiceClientFactory;
import com.google.api.ads.common.lib.factory.BaseAdsServiceClientFactory;
import com.google.api.ads.dfa.lib.client.DfaServiceClient;
import com.google.api.ads.dfa.lib.client.DfaServiceDescriptor;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Factory which creates DFA service clients.
 */
public class DfaServiceClientFactory extends BaseAdsServiceClientFactory<DfaServiceClient,
                                                                         DfaSession,
                                                                         DfaServiceDescriptor> {

  /**
   * Constructor.
   *
   * @param injector an injector which binds all the necessary classes
   */
  public DfaServiceClientFactory(Injector injector) {
    super(injector);
  }


  /**
   * Constructor.
   *
   * @param module the module used for binding.
   * @deprecated use {@link DfaServiceClientFactory#DfaServiceClientFactory(Injector)}
   */
  @Deprecated
  public DfaServiceClientFactory(AbstractModule module) {
    super(module);
  }

  /**
   * Constructor used for injection.
   *
   * @param adsServiceClientFactory the ads service client factory
   */
  @Inject
  @VisibleForTesting
  DfaServiceClientFactory(AdsServiceClientFactory<DfaServiceClient,
                                                  DfaSession,
                                                  DfaServiceDescriptor>
                          adsServiceClientFactory) {
    super(adsServiceClientFactory);
  }
}

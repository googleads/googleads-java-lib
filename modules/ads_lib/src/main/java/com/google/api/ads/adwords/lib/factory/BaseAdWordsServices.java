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

package com.google.api.ads.adwords.lib.factory;

import com.google.api.ads.adwords.lib.client.AdWordsServiceClient;
import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.factory.BaseServices;
import com.google.inject.Injector;

/** Base for a utility class which creates AdWords service clients. */
public abstract class BaseAdWordsServices
    extends BaseServices<AdWordsServiceClient, AdWordsSession, AdWordsServiceDescriptor>
    implements AdWordsServicesInterface {

  private final Injector injector;

  /**
   * @param injector an injector which binds all the necessary classes
   */
  protected BaseAdWordsServices(Injector injector) {
    super(new AdWordsServiceClientFactory(injector));
    this.injector = injector;
  }

  /**
   * Returns a new instance of the specified utility type, bound to the provided session.
   *
   * @param session an AdWords session
   * @param utilityClass a utility class annotated.
   */
  @Override
  public <UtilityT> UtilityT getUtility(AdWordsSession session, Class<UtilityT> utilityClass) {
    Injector childInjector = injector.createChildInjector(new AdWordsSessionModule(session));
    return childInjector.getInstance(utilityClass);
  }
}

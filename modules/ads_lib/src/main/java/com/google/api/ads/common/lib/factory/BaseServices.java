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

package com.google.api.ads.common.lib.factory;

import com.google.api.ads.common.lib.client.AdsServiceClient;
import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import com.google.api.ads.common.lib.client.AdsSession;

/**
 * Base for a utility class which creates service clients.
 *
 * @param <C> the type of {@link AdsServiceClient}
 * @param <S> the type of {@link AdsSession}
 * @param <D> the type of {@link AdsServiceDescriptor}
 */
public abstract class BaseServices<
        C extends AdsServiceClient<S, D>, S extends AdsSession, D extends AdsServiceDescriptor>
    implements AdsServicesInterface<S> {

  private final BaseAdsServiceClientFactory<C, S, D> factory;

  /**
   * Constructor.
   *
   * @param factory a factory capable of instantiating service clients
   */
  protected BaseServices(BaseAdsServiceClientFactory<C, S, D> factory) {
    this.factory = factory;
  }

  @Override
  public <T> T get(S session, Class<T> interfaceClass) {
    return factory.getServiceClientAsInterface(session, interfaceClass);
  }
}

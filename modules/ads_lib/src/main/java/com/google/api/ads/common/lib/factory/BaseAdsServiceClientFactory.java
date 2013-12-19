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

package com.google.api.ads.common.lib.factory;

import com.google.api.ads.common.lib.client.AdsServiceClient;
import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;

/**
 * Base factory which creates service clients.
 *
 * @param <C> the type of {@link AdsServiceClient}
 * @param <S> the type of {@link AdsSession}
 * @param <D> the type of {@link AdsServiceDescriptor}
 *
 * @author Adam Rogal
 */
public abstract class BaseAdsServiceClientFactory<C extends AdsServiceClient<S, D>,
                                                  S extends AdsSession,
                                                  D extends AdsServiceDescriptor> {

  private AdsServiceClientFactory<C, S, D> adsServiceClientFactory;

  /**
   * Constructor.
   *
   * @param adsServiceClientFactory the ads service client factory
   */
  protected BaseAdsServiceClientFactory(AdsServiceClientFactory<C, S, D> adsServiceClientFactory) {
    this.adsServiceClientFactory = adsServiceClientFactory;
  }

  /**
   * Constructor.
   *
   * @param module the module used for injection
   */
  protected BaseAdsServiceClientFactory(AbstractModule module) {
    this(Guice.createInjector(module));
  }

  /**
   * Constructor.
   *
   * @param injector the injector used for injection
   */
  protected BaseAdsServiceClientFactory(Injector injector) {
    this(injector.getInstance(Key.get(AdsServiceClientFactory.class)));
  }

  /**
   * Gets a client given a session and the class of the desired stub interface.
   *
   * @param adsSession the session associated with the desired
   *     client
   * @param interfaceClass the class type of the desired client
   * @return a client for the specified ads service
   */
  @SuppressWarnings("unchecked") // Service client is a proxy to the interface.
  public <T> T getServiceClientAsInterface(S adsSession, Class<T> interfaceClass)
      throws ServiceException {
    return adsServiceClientFactory.getServiceClient(adsSession, interfaceClass);
  }
}

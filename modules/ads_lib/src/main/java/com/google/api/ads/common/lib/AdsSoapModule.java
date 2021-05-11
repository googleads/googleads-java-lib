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

package com.google.api.ads.common.lib;

import com.google.api.ads.common.lib.client.AdsServiceClient;
import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import com.google.api.ads.common.lib.client.AdsSession;
import com.google.api.ads.common.lib.factory.BaseAdsServiceClientFactory;
import com.google.api.ads.common.lib.factory.FactoryModule;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.api.ads.common.lib.factory.helper.AdsServiceClientFactoryHelper;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;

/**
 * Guice module for common bindings.
 *
 * @param <C> the subclass of {@link AdsServiceClient}
 * @param <D> the subclass of {@link AdsServiceDescriptor}
 * @param <S> the subclass of {@link AdsSession}
 */
public class AdsSoapModule <C extends AdsServiceClient<S, D>,
                            D extends AdsServiceDescriptor,
                            S extends AdsSession> extends AbstractModule {

  public AdsSoapModule() {}

  @Override
  protected void configure() {}

  /**
   * Configures the factories.
   *
   * @param <H> the subclass of {@link AdsServiceClientFactoryHelper}
   * @param <F> the subclass of {@link BaseAdsServiceClientFactory}
   *
   * @param adsServiceClientFactoryTypeLiteral the factory type literal which
   *        contains a {@link AdsServiceClientFactoryInterface}
   * @param adsServiceDescriptorFactoryTypeLiteral the factory type literal
   *        which contains a {@link AdsServiceDescriptorFactoryInterface}
   * @param adsServiceClientTypeLiteral the ads service client literal which
   *        contains a {@link AdsServiceClient}
   * @param adsServiceDescriptorTypeLiteral the ads service descriptor literal
   *        which contains a {@link AdsServiceDescriptor}
   * @param adsServiceClientFactoryHelperClass the {@link AdsServiceClientFactoryHelper} class
   * @param baseAdsServiceClientFactoryClass the {@link BaseAdsServiceClientFactory} class
   */
  protected <H extends AdsServiceClientFactoryHelper<C, S, D>,
          F extends BaseAdsServiceClientFactory<C, S, D>>
      void configureFactories(
          TypeLiteral<AdsServiceClientFactoryInterface<C, S, D>> adsServiceClientFactoryTypeLiteral,
          TypeLiteral<AdsServiceDescriptorFactoryInterface<D>>
              adsServiceDescriptorFactoryTypeLiteral,
          TypeLiteral<C> adsServiceClientTypeLiteral,
          TypeLiteral<D> adsServiceDescriptorTypeLiteral,
          Class<H> adsServiceClientFactoryHelperClass,
          Class<F> baseAdsServiceClientFactoryClass) {
    install(
        new FactoryModule<C, D, S, H, F>(
            adsServiceClientFactoryTypeLiteral,
            adsServiceDescriptorFactoryTypeLiteral,
            adsServiceClientTypeLiteral,
            adsServiceDescriptorTypeLiteral,
            adsServiceClientFactoryHelperClass,
            baseAdsServiceClientFactoryClass));
  }
}

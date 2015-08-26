// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis;

import com.google.api.ads.adwords.lib.AdWordsModule;
import com.google.api.ads.adwords.lib.AdWordsProductFrameworkModule;
import com.google.api.ads.adwords.lib.AdWordsSoapModule;
import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor.AdWordsSubProduct;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.soap.ProductFrameworkModule;
import com.google.api.ads.common.lib.soap.axis.AxisModule;
import com.google.api.ads.common.lib.soap.axis.AxisSoapHeaderFactory;
import com.google.inject.TypeLiteral;
import com.google.inject.multibindings.MapBinder;

/**
 * Guice module to bind AdWord's library to an Axis-friendly implementation.
 */
@AdWordsProductFrameworkModule
public class AdWordsAxisModule extends ProductFrameworkModule {

  private static final String EXPRESS_HEADER_PARTIAL_NAME = "express.ExpressSoapHeader";

  private static final String DEFAULT_HEADER_PARTIAL_NAME = "cm.SoapHeader";

  @SuppressWarnings("rawtypes") /* Guice lacks support for template type literals. */
  @Override
  public void configure() {
    MapBinder<AdWordsSubProduct, HeaderHandler<AdWordsSession, AdWordsServiceDescriptor>>
        subProductHandlerMapBinder = MapBinder.newMapBinder(binder(),
        new TypeLiteral<AdWordsSubProduct>() {},
        new TypeLiteral<HeaderHandler<AdWordsSession, AdWordsServiceDescriptor>>() {});
    subProductHandlerMapBinder.addBinding(AdWordsSubProduct.DEFAULT).to(new TypeLiteral<
        HeaderHandler.NoOpHeaderHandler<AdWordsSession, AdWordsServiceDescriptor>>() {});
    subProductHandlerMapBinder.addBinding(AdWordsSubProduct.EXPRESS).to(
        AdWordsAxisExpressHeaderHandler.class);

    MapBinder<AdWordsSubProduct, String> subProductHeaderNameBinder =
        MapBinder.newMapBinder(binder(), AdWordsSubProduct.class, String.class);
    subProductHeaderNameBinder.addBinding(AdWordsSubProduct.DEFAULT)
        .toInstance(DEFAULT_HEADER_PARTIAL_NAME);
    subProductHeaderNameBinder.addBinding(AdWordsSubProduct.EXPRESS)
        .toInstance(EXPRESS_HEADER_PARTIAL_NAME);

    bind(new TypeLiteral<AxisSoapHeaderFactory<AdWordsServiceDescriptor>>() {}).to(
        new TypeLiteral<AdWordsAxisSoapHeaderFactory>() {});

    bind(new TypeLiteral<HeaderHandler>() {}).to(new TypeLiteral<AdWordsAxisHeaderHandler>() {});
    install(new AxisModule());
    install(new AdWordsModule());
    install(new AdWordsSoapModule());
    configureConfigurations(this.getClass().getResource("conf/props/build.properties"));
  }
}

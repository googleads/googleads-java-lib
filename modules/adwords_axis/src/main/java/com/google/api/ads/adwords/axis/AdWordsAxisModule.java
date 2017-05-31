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
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.soap.ProductFrameworkModule;
import com.google.api.ads.common.lib.soap.axis.AxisModule;
import com.google.api.ads.common.lib.soap.axis.AxisSoapHeaderFactory;
import com.google.inject.TypeLiteral;

/**
 * Guice module to bind AdWord's library to an Axis-friendly implementation.
 */
@AdWordsProductFrameworkModule
public class AdWordsAxisModule extends ProductFrameworkModule {

  @Override
  public void configure() {
    bind(new TypeLiteral<AxisSoapHeaderFactory<AdWordsServiceDescriptor>>() {}).to(
        new TypeLiteral<AdWordsAxisSoapHeaderFactory>() {});
    bind(new TypeLiteral<HeaderHandler<AdWordsSession, AdWordsServiceDescriptor>>() {})
        .to(new TypeLiteral<AdWordsAxisHeaderHandler>() {});
    install(new AxisModule());
    install(new AdWordsModule());
    install(new AdWordsSoapModule());
    configureConfigurations(this.getClass().getResource("conf/props/build.properties"));
  }
}

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

package com.google.api.ads.adwords.jaxws;

import com.google.api.ads.adwords.lib.AdWordsModule;
import com.google.api.ads.adwords.lib.AdWordsProductFrameworkModule;
import com.google.api.ads.adwords.lib.AdWordsSoapModule;
import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.soap.ProductFrameworkModule;
import com.google.api.ads.common.lib.soap.jaxws.JaxWsModule;
import com.google.inject.TypeLiteral;

/**
 * Guice module to bind AdWord's SOAP header handler to a JAX-WS-friendly
 * implementation.
 */
@AdWordsProductFrameworkModule
public class AdWordsJaxWsModule extends ProductFrameworkModule {

  @Override
  public void configure() {
    bind(new TypeLiteral<HeaderHandler<AdWordsSession, AdWordsServiceDescriptor>>() {})
        .to(new TypeLiteral<AdWordsJaxWsHeaderHandler>() {});
    install(new JaxWsModule());
    install(new AdWordsModule());
    install(new AdWordsSoapModule());
    configureConfigurations(this.getClass().getResource("conf/props/build.properties"));
  }
}

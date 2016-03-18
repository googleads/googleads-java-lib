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

package com.google.api.ads.adwords.lib;

import com.google.api.ads.adwords.lib.client.AdWordsServiceClient;
import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServiceClientFactory;
import com.google.api.ads.adwords.lib.factory.helper.AdWordsServiceClientFactoryHelper;
import com.google.api.ads.common.lib.AdsSoapModule;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.inject.TypeLiteral;

/**
 * Guice module for AdWords SOAP bindings.
 */
public class AdWordsSoapModule extends AdsSoapModule<AdWordsServiceClient,
                                                     AdWordsServiceDescriptor,
                                                     AdWordsSession> {

  public AdWordsSoapModule() {}

  @Override
  protected void configure() {
    super.configure();
    configureFactories(
        new TypeLiteral<AdsServiceClientFactoryInterface<AdWordsServiceClient,
            AdWordsSession, AdWordsServiceDescriptor>>() {},
        new TypeLiteral<AdsServiceDescriptorFactoryInterface<AdWordsServiceDescriptor>>() {},
        new TypeLiteral<AdWordsServiceClient>(){},
        new TypeLiteral<AdWordsServiceDescriptor>(){},
        AdWordsServiceClientFactoryHelper.class,
        AdWordsServiceClientFactory.class);
  }
}

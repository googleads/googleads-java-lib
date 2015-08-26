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

package com.google.api.ads.dfa.lib;

import com.google.api.ads.common.lib.AdsSoapModule;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.api.ads.dfa.lib.client.DfaServiceClient;
import com.google.api.ads.dfa.lib.client.DfaServiceDescriptor;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.ads.dfa.lib.factory.DfaServiceClientFactory;
import com.google.api.ads.dfa.lib.factory.helper.DfaServiceClientFactoryHelper;
import com.google.inject.TypeLiteral;

/**
 * Guice module for DFA SOAP bindings.
 */
public class DfaSoapModule extends AdsSoapModule<DfaServiceClient,
                                                 DfaServiceDescriptor,
                                                 DfaSession> {

  public DfaSoapModule() {}

  @Override
  protected void configure() {
    super.configure();
    configureFactories(
        new TypeLiteral<AdsServiceClientFactoryInterface<DfaServiceClient,
            DfaSession, DfaServiceDescriptor>>() {},
        new TypeLiteral<AdsServiceDescriptorFactoryInterface<DfaServiceDescriptor>>() {},
        new TypeLiteral<DfaServiceClient>() {},
        new TypeLiteral<DfaServiceDescriptor>() {},
        DfaServiceClientFactoryHelper.class,
        DfaServiceClientFactory.class);
  }
}

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

package com.google.api.ads.dfp.lib;

import com.google.api.ads.common.lib.AdsSoapModule;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.api.ads.dfp.lib.client.DfpServiceClient;
import com.google.api.ads.dfp.lib.client.DfpServiceDescriptor;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.factory.DfpServiceClientFactory;
import com.google.api.ads.dfp.lib.factory.helper.DfpServiceClientFactoryHelper;
import com.google.inject.TypeLiteral;

/**
 * Guice module for DFP SOAP bindings.
 */
public class DfpSoapModule extends AdsSoapModule<DfpServiceClient,
                                                 DfpServiceDescriptor,
                                                 DfpSession> {

  public DfpSoapModule() {}

  @Override
  protected void configure() {
    super.configure();
    configureFactories(
        new TypeLiteral<AdsServiceClientFactoryInterface<DfpServiceClient,
            DfpSession, DfpServiceDescriptor>>() {},
        new TypeLiteral<AdsServiceDescriptorFactoryInterface<DfpServiceDescriptor>>() {},
        new TypeLiteral<DfpServiceClient>() {},
        new TypeLiteral<DfpServiceDescriptor>() {},
        DfpServiceClientFactoryHelper.class,
        DfpServiceClientFactory.class);
  }
}

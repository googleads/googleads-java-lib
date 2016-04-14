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

package com.google.api.ads.ddp.lib;

import com.google.api.ads.common.lib.AdsSoapModule;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.api.ads.ddp.lib.client.DdpServiceClient;
import com.google.api.ads.ddp.lib.client.DdpServiceDescriptor;
import com.google.api.ads.ddp.lib.client.DdpSession;
import com.google.api.ads.ddp.lib.factory.DdpServiceClientFactory;
import com.google.api.ads.ddp.lib.factory.helper.DdpServiceClientFactoryHelper;
import com.google.inject.TypeLiteral;

/**
 * Guice module for DDP SOAP bindings.
 */
public class DdpSoapModule extends AdsSoapModule<DdpServiceClient,
                                                 DdpServiceDescriptor,
                                                 DdpSession> {

  public DdpSoapModule() {}

  @Override
  protected void configure() {
    super.configure();
    configureFactories(
        new TypeLiteral<AdsServiceClientFactoryInterface<DdpServiceClient,
            DdpSession, DdpServiceDescriptor>>() {},
        new TypeLiteral<AdsServiceDescriptorFactoryInterface<DdpServiceDescriptor>>() {},
        new TypeLiteral<DdpServiceClient>() {},
        new TypeLiteral<DdpServiceDescriptor>() {},
        DdpServiceClientFactoryHelper.class,
        DdpServiceClientFactory.class);
  }
}

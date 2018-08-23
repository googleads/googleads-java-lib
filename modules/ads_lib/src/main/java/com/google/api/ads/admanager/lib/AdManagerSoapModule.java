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

package com.google.api.ads.admanager.lib;

import com.google.api.ads.admanager.lib.client.AdManagerServiceClient;
import com.google.api.ads.admanager.lib.client.AdManagerServiceDescriptor;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.factory.AdManagerServiceClientFactory;
import com.google.api.ads.admanager.lib.factory.helper.AdManagerServiceClientFactoryHelper;
import com.google.api.ads.common.lib.AdsSoapModule;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.inject.TypeLiteral;

/** Guice module for Ad Manager SOAP bindings. */
public class AdManagerSoapModule
    extends AdsSoapModule<AdManagerServiceClient, AdManagerServiceDescriptor, AdManagerSession> {

  public AdManagerSoapModule() {}

  @Override
  protected void configure() {
    super.configure();
    configureFactories(
        new TypeLiteral<
            AdsServiceClientFactoryInterface<
                AdManagerServiceClient, AdManagerSession, AdManagerServiceDescriptor>>() {},
        new TypeLiteral<AdsServiceDescriptorFactoryInterface<AdManagerServiceDescriptor>>() {},
        new TypeLiteral<AdManagerServiceClient>() {},
        new TypeLiteral<AdManagerServiceDescriptor>() {},
        AdManagerServiceClientFactoryHelper.class,
        AdManagerServiceClientFactory.class);
  }
}

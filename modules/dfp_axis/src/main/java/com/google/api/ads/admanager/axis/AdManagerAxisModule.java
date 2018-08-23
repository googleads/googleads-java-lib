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

package com.google.api.ads.admanager.axis;

import com.google.api.ads.admanager.lib.AdManagerModule;
import com.google.api.ads.admanager.lib.AdManagerProductFrameworkModule;
import com.google.api.ads.admanager.lib.AdManagerSoapModule;
import com.google.api.ads.admanager.lib.client.AdManagerServiceDescriptor;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.soap.ProductFrameworkModule;
import com.google.api.ads.common.lib.soap.axis.AxisModule;
import com.google.inject.TypeLiteral;

/** Guice module to bind Ad Manager's SOAP header handler to an Axis-friendly implementation. */
@AdManagerProductFrameworkModule
public class AdManagerAxisModule extends ProductFrameworkModule {

  @Override
  public void configure() {
    bind(new TypeLiteral<HeaderHandler<AdManagerSession, AdManagerServiceDescriptor>>() {})
        .to(new TypeLiteral<AdManagerAxisHeaderHandler>() {});
    install(new AxisModule());
    install(new AdManagerModule());
    install(new AdManagerSoapModule());
    configureConfigurations(this.getClass().getResource("conf/props/build.properties"));
  }
}

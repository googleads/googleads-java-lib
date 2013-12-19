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

package com.google.api.ads.common.lib.soap.jaxws;

import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.useragent.FrameworkUserAgentProvider;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;

/**
 * Module for SOAP client handler.
 *
 * @author Joseph DiLallo
 */
public class JaxWsModule extends AbstractModule {

  @SuppressWarnings("rawtypes") // TypeLiteral of non-rawtypes does not work.
  @Override
  protected void configure() {
    bind(new TypeLiteral<SoapClientHandlerInterface>() {})
        .to(JaxWsHandler.class).asEagerSingleton();
    bind(new TypeLiteral<JaxWsSoapContextHandlerFactory>() {}).asEagerSingleton();
    bind(FrameworkUserAgentProvider.class).to(JaxWsFrameworkUserAgentProvider.class);
  }
}

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

package com.google.api.ads.dfa.axis;

import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.soap.ProductFrameworkModule;
import com.google.api.ads.common.lib.soap.axis.AxisModule;
import com.google.api.ads.dfa.axis.utils.DfaAxisLoginTokensHelper;
import com.google.api.ads.dfa.axis.utils.DfaAxisTokenExpirationDetector;
import com.google.api.ads.dfa.lib.DfaModule;
import com.google.api.ads.dfa.lib.DfaProductFrameworkModule;
import com.google.api.ads.dfa.lib.DfaSoapModule;
import com.google.api.ads.dfa.lib.auth.LoginTokensHelper;
import com.google.api.ads.dfa.lib.auth.TokenExpirationDetector;
import com.google.inject.TypeLiteral;

/**
 * Guice module to bind DFA's SOAP header handler to an Axis-friendly
 * implementation.
 *
 * @author Joseph DiLallo
 * @author Adam Rogal
 */
@DfaProductFrameworkModule
public class DfaAxisModule extends ProductFrameworkModule {

  @SuppressWarnings("rawtypes") /* Guice lacks support for template type literals.*/
  @Override
  public void configure() {
    bind(new TypeLiteral<HeaderHandler>() {}).to(new TypeLiteral<DfaAxisHeaderHandler>() {});
    install(new AxisModule());
    install(new DfaModule());
    install(new DfaSoapModule());
    configureConfigurations(this.getClass().getResource("conf/props/build.properties"));
    bind(LoginTokensHelper.class).to(DfaAxisLoginTokensHelper.class);
    bind(TokenExpirationDetector.class).to(DfaAxisTokenExpirationDetector.class);
  }
}

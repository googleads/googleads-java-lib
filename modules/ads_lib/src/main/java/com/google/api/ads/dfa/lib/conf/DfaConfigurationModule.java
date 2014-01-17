// Copyright 2011 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfa.lib.conf;

import com.google.api.ads.common.lib.conf.ConfigurationModule;
import com.google.common.collect.Lists;

import java.net.URL;

/**
 * Configuration for DFA configuration.
 *
 * @author Adam Rogal
 */
public class DfaConfigurationModule extends ConfigurationModule {

  @Override
  protected void configure() {
    super.configure();
    configureConfigurations(
        DfaApiConfiguration.class,
        Lists.<URL>newArrayList(DfaConfigurationModule.class
            .getResource("props/dfa-api.properties")),
        null,
        DfaLibConfiguration.class,
        null,
        null,
        Lists.<URL>newArrayList(DfaConfigurationModule.class
            .getResource("props/build.properties")));
  }
}

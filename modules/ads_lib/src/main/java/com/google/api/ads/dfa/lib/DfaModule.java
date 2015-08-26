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

import com.google.api.ads.common.lib.AdsModule;
import com.google.api.ads.dfa.lib.client.DfaServiceClient;
import com.google.api.ads.dfa.lib.conf.DfaConfigurationModule;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

/**
 * Guice module for DFA bindings.
 */
public class DfaModule extends AdsModule {

  public DfaModule() {}

  @Override
  protected void configure() {
    super.configure();
    configureLogging(DfaServiceClient.class.getName());
    install(new DfaConfigurationModule());
    bind(HttpTransport.class).to(NetHttpTransport.class);
  }
}

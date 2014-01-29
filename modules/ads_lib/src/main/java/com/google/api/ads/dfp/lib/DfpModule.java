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

import com.google.api.ads.common.lib.AdsModule;
import com.google.api.ads.dfp.lib.client.DfpServiceClient;
import com.google.api.ads.dfp.lib.conf.DfpConfigurationModule;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

/**
 * Guice module for DFP bindings.
 *
 * @author Adam Rogal
 * @author Joseph DiLallo
 */
public class DfpModule extends AdsModule {

  public DfpModule() {}

  @Override
  protected void configure() {
    super.configure();
    configureLogging(DfpServiceClient.class.getName());
    install(new DfpConfigurationModule());
    bind(HttpTransport.class).to(NetHttpTransport.class);
  }
}

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

package com.google.api.ads.ddp.lib.factory;

import com.google.api.ads.common.lib.factory.BaseServices;
import com.google.api.ads.ddp.lib.client.DdpServiceClient;
import com.google.api.ads.ddp.lib.client.DdpServiceDescriptor;
import com.google.api.ads.ddp.lib.client.DdpSession;
import com.google.inject.Injector;

/**
 * Base for a utility class which creates DDP service clients.
 */
public abstract class BaseDdpServices extends BaseServices<DdpServiceClient,
                                                           DdpSession,
                                                           DdpServiceDescriptor> {

  /**
   * Constructor.
   *
   * @param injector an injector which binds all the necessary classes
   */
  protected BaseDdpServices(Injector injector) {
    super(new DdpServiceClientFactory(injector));
  }
}

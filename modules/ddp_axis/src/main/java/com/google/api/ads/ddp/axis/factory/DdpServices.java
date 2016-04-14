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

package com.google.api.ads.ddp.axis.factory;

import com.google.api.ads.ddp.axis.DdpAxisModule;
import com.google.api.ads.ddp.lib.factory.BaseDdpServices;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Utility class to create DDP service clients. The session is stored
 * as a reference within the client so that the session may be altered to
 * affect the behavior of the client.
 * <p>
 * Usage example:
 * <pre><code>
 * DdpSession session = new DdpSession.Builder()...build();
 * InventoryServiceInterface inventoryService =
 *    new  DdpServices().get(session, InventoryServiceInterface.class);
 * campaignService.makeRequest(...);
 * ...
 * session.setNetworkCode(...);
 * campaignService.makeRequest(...);
 * </code></pre>
 *
 * <p>
 * Implementation is thread-safe.
 * </p>
 */
public final class DdpServices extends BaseDdpServices {

  private static final Injector INJECTOR = Guice.createInjector(new DdpAxisModule());

  public DdpServices() {
    super(INJECTOR);
  }
}

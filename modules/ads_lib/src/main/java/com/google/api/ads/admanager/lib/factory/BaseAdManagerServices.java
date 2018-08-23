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

package com.google.api.ads.admanager.lib.factory;

import com.google.api.ads.admanager.lib.client.AdManagerServiceClient;
import com.google.api.ads.admanager.lib.client.AdManagerServiceDescriptor;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.factory.BaseServices;
import com.google.inject.Injector;

/** Base for a utility class which creates Ad Manager service clients. */
public abstract class BaseAdManagerServices
    extends BaseServices<AdManagerServiceClient, AdManagerSession, AdManagerServiceDescriptor>
    implements AdManagerServicesInterface {

  /**
   * Constructor.
   *
   * @param injector an injector which binds all the necessary classes
   */
  protected BaseAdManagerServices(Injector injector) {
    super(new AdManagerServiceClientFactory(injector));
  }
}

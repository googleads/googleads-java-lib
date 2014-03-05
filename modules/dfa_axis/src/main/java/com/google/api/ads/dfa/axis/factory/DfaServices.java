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

package com.google.api.ads.dfa.axis.factory;

import com.google.api.ads.dfa.axis.DfaAxisModule;
import com.google.api.ads.dfa.lib.factory.BaseDfaServices;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Utility class to create DFA service clients. The session is stored
 * as a reference within the client so that the session may be altered to
 * affect the behavior of the client.
 * <p>
 * Usage example:
 * <pre><code>
 * DfaSession session = new DfaSession.Builder()...build();
 * CampaignRemote campaignService =
 *     new DfaServices().get(session, CampaignRemote.class);
 * campaignService.makeRequest(...);
 * ...
 * session.setToken(...);
 * campaignService.makeRequest(...);
 * </code></pre>
 *
 * <p>
 * Implementation is thread-safe.
 * </p>
 *
 * @author Joseph DiLallo
 */
public final class DfaServices extends BaseDfaServices {

  private static final Injector INJECTOR = Guice.createInjector(new DfaAxisModule());

  public DfaServices() {
    super(INJECTOR);
  }
}

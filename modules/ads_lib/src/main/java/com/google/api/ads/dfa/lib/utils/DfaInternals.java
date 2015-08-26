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

package com.google.api.ads.dfa.lib.utils;

import com.google.api.ads.common.lib.utils.Internals;
import com.google.api.ads.dfa.lib.DfaModule;
import com.google.inject.Guice;

/**
 * Provides access to some internal guice-injected objects.
 */
public class DfaInternals {

  private static final Internals INSTANCE = Guice.createInjector(
      new DfaModule()).getInstance(Internals.class);

  /**
   * Returns an {@link Internals} configured for DFA.
   */
  public static Internals getInstance() {
    return INSTANCE;
  }
}

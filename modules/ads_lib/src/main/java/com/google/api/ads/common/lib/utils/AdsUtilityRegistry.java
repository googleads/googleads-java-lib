// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.utils;

import com.google.common.base.Preconditions;
import com.google.inject.Singleton;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.ThreadSafe;

/** A thread-safe registry for usage of {@link AdsUtility ads utilities}. */
@ThreadSafe
@Singleton
public final class AdsUtilityRegistry {

  private volatile Set<AdsUtility> adsUtilities =
      Collections.newSetFromMap(new ConcurrentHashMap<AdsUtility, Boolean>());

  private static final AdsUtilityRegistry INSTANCE = new AdsUtilityRegistry();

  /** Returns the singleton of this class. */
  public static AdsUtilityRegistry getInstance() {
    return INSTANCE;
  }

  // Private constructor to enforce singleton behavior.
  private AdsUtilityRegistry() { }

  /**
   * Adds the specified utility to the registry.
   *
   * <p>Add is performed on a <em>best efforts</em> basis. It is possible that another thread will
   * subsequently remove the utility immediately after the add.
   *
   * @throws NullPointerException if {@code adsUtility == null}
   */
  public void addUtility(final AdsUtility adsUtility) {
    Preconditions.checkNotNull(adsUtility, "Null ads utility");
    adsUtilities.add(adsUtility);
  }

  /** Returns all utilities in the registry and clears the registry. */
  public Set<AdsUtility> popRegisteredUtilities() {
    // Detach and return, so we don't have to make a copy.
    Set<AdsUtility> result = Collections.unmodifiableSet(adsUtilities);
    adsUtilities = Collections.newSetFromMap(new ConcurrentHashMap<AdsUtility, Boolean>());
    return result;
  }
}

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
import com.google.common.collect.Sets;
import com.google.inject.Singleton;

import java.util.Collection;
import java.util.Set;

import javax.annotation.concurrent.ThreadSafe;

/**
 * A thread-safe registry for usage of {@link AdsUtility ads utilities}.
 */
@ThreadSafe
@Singleton
public class AdsUtilityRegistry {

  private final Set<AdsUtility> adsUtilities = Sets.newConcurrentHashSet();

  /**
   * Adds the specified utility to the registry.
   *
   * <p>
   * Add is performed on a <em>best efforts</em> basis. It is possible that another thread will
   * subsequently remove the utility immediately after the add.
   *
   * @throws NullPointerException if {@code adsUtility == null}
   */
  public void addUtility(AdsUtility adsUtility) {
    adsUtilities.add(Preconditions.checkNotNull(adsUtility, "Null ads utility"));
  }

  /**
   * Returns all utilities in the registry.
   */
  public Set<AdsUtility> getRegisteredUtilities() {
    return Sets.<AdsUtility>newHashSet(adsUtilities);
  }

  /**
   * Removes the specified utilities from the registry.
   *
   * <p>
   * Removal is performed on a <em>best efforts</em> basis. It is possible that another thread will
   * subsequently add one or more of the utilities immediately after the remove.
   *
   * @throws NullPointerException if {@code utilities == null}
   */
  public void removeUtilities(Collection<AdsUtility> utilities) {
    adsUtilities.removeAll(Preconditions.checkNotNull(utilities, "Null utilities collection"));
  }
}

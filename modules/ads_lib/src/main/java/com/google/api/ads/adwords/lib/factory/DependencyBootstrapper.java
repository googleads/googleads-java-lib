// Copyright 2017 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.factory;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.inject.ImplementedBy;

/**
 * Utility for obtaining an instance of a given dependency type that's bound to an {@link
 * AdWordsSession}.
 */
@ImplementedBy(DependencyBootstrapperImpl.class)
public interface DependencyBootstrapper {
  /**
   * Returns an instance of {@code dependencyClass}, bound to the provided session.
   *
   * @throws IllegalArgumentException if {@code dependencyClass} is annotated with {@link
   *     com.google.api.ads.adwords.lib.utils.SessionUtility}. For types with that annotation, use
   *     {@link AdWordsServicesInterface#getUtility(AdWordsSession, Class)} instead.
   * @see AdWordsServicesInterface#getUtility(AdWordsSession, Class)
   */
  <T> T getInstanceOf(AdWordsSession session, Class<T> dependencyClass);
}

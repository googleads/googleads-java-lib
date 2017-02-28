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
import com.google.api.ads.adwords.lib.utils.SessionUtility;
import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * {@link DependencyBootstrapper} that uses a parent injector to obtain dependencies, and only
 * supports getting an instance of a type if it is <em>not</em> annotated with {@link
 * SessionUtility}.
 */
class DependencyBootstrapperImpl implements DependencyBootstrapper {

  private final Injector injector;

  /** Constructor used by Guice. */
  @Inject
  DependencyBootstrapperImpl(Injector injector) {
    this.injector = injector;
  }

  @Override
  public <T> T getInstanceOf(AdWordsSession session, Class<T> dependencyClass) {
    Preconditions.checkNotNull(session, "Null session");
    Preconditions.checkNotNull(dependencyClass, "Null dependency class");
    if (dependencyClass.getAnnotation(SessionUtility.class) != null) {
      String message =
          String.format(
              "%s is annotated with %s. Only types without that annotation can be obtained "
                  + " from this bootstrapper. Use AdWordsServicesInterface.getUtility instead.",
              dependencyClass, SessionUtility.class);
      throw new IllegalArgumentException(message);
    }
    Injector childInjector = injector.createChildInjector(new AdWordsSessionModule(session));
    return childInjector.getInstance(dependencyClass);
  }
}

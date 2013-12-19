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

package com.google.api.ads.common.lib.useragent;

import com.google.api.ads.common.lib.conf.AdsBuildConfiguration;
import com.google.inject.Inject;

/**
 * Provides the ads library user agent.
 *
 * @author Adam Rogal
 */
public class AdsLibraryUserAgentProvider implements UserAgentProvider {

  private final AdsBuildConfiguration buildConfiguration;

  /**
   * Constructor.
   *
   * @param buildConfiguration the build configuration
   */
  @Inject
  public AdsLibraryUserAgentProvider(AdsBuildConfiguration buildConfiguration) {
    this.buildConfiguration = buildConfiguration;
  }

  /**
   * Generates the library user agent such as Common-Java/1.4
   */
  public String getUserAgent() {
    return buildConfiguration.getLibName() + "/" + buildConfiguration.getLibVersion();
  }
}

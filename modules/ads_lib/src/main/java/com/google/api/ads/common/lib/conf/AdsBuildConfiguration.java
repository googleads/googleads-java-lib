// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.conf;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.apache.commons.configuration.Configuration;

/**
 * Configuration of lib properties.
 */
public class AdsBuildConfiguration extends BaseConfiguration {

  /**
   * Configuration keys.
   */
  public static final String LIB_NAME_KEY = "lib.name";
  public static final String LIB_VERSION_KEY = "lib.version";
  public static final String BUILD_TYPE_KEY = "build.type";

  /**
   * Constructor.
   *
   * @param config the build configuration
   */
  @Inject
  public AdsBuildConfiguration(@Named("build") Configuration config) {
    super(config);
  }

  /**
   * Gets the library name.
   */
  public String getLibName() {
    return getString(LIB_NAME_KEY);
  }

  /**
   * Gets the library name prefix.
   */
  public String getLibVersion() {
    return getString(LIB_VERSION_KEY);
  }

  /**
   * Gets the build type.
   */
  public String getBuildType() {
    return getString(BUILD_TYPE_KEY);
  }
}

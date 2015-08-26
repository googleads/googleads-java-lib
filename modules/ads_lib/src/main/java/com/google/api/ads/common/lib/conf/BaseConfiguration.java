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

import org.apache.commons.configuration.Configuration;

/**
 * Base configuration class.
 */
public abstract class BaseConfiguration {

  protected final Configuration config;

  /**
   * Constructor.
   */
  public BaseConfiguration(Configuration config) {
    this.config = config;
  }

  /**
   * Gets the boolean property from the configuration.
   *
   * @param property the property to fetch
   * @return the boolean property
   */
  protected Boolean getBoolean(String property) {
    return config.getBoolean(property);
  }

  /**
   * Gets the String property from the configuration.
   *
   * @param property the property to fetch
   * @return the String property
   */
  protected String getString(String property) {
    return config.getString(property);
  }
}

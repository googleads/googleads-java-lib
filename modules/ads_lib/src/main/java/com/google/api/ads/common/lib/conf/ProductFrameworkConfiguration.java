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

package com.google.api.ads.common.lib.conf;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.apache.commons.configuration.Configuration;

/**
 * Configuration of product/framework properties.
 */
public class ProductFrameworkConfiguration extends BaseConfiguration {

  /**
   * Configuration keys.
   */
  public static final String LIB_NAME_KEY = "product.framework.name";
  public static final String LIB_VERSION_KEY = "product.framework.version";

  /**
   * Constructor.
   *
   * @param configuration the product/framework configuration
   */
  @Inject
  public ProductFrameworkConfiguration(@Named("productFramework") Configuration configuration) {
    super(configuration);
  }

  /**
   * Gets the library name prefix.
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
}

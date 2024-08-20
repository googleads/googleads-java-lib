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

import com.google.api.ads.common.lib.conf.ProductFrameworkConfiguration;

import com.google.inject.Inject;

/**
 * Provides product/framework user agent.
 */
public class ProductFrameworkUserAgentProvider implements UserAgentProvider {

  private final ProductFrameworkConfiguration productFrameworkConfiguration;

  /**
   * Constructor.
   *
   * @param productFrameworkConfiguration the product/framework configuration.
   */
  @Inject
  public ProductFrameworkUserAgentProvider(
      ProductFrameworkConfiguration productFrameworkConfiguration) {
    this.productFrameworkConfiguration = productFrameworkConfiguration;
  }

  /**
   * Generates the framework user agent such as AdWords-Axis/1.4.
   */
  @Override
  public String getUserAgent() {
    return productFrameworkConfiguration.getLibName() + "/"
        + productFrameworkConfiguration.getLibVersion();
  }
}

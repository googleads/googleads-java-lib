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

import com.google.api.ads.common.lib.conf.ProductConfiguration;

import com.google.inject.Inject;

/**
 * Provides product user agent.
 */
public class ProductUserAgentProvider implements UserAgentProvider {

  private final ProductConfiguration productConfiguration;

  /**
   * Constructor.
   *
   * @param productConfiguration the product configuration.
   */
  @Inject
  public ProductUserAgentProvider(ProductConfiguration productConfiguration) {
    this.productConfiguration = productConfiguration;
  }

  /**
   * Generates the product user agent such as AwApi-Java.
   */
  @Override
  public String getUserAgent() {
    return productConfiguration.getProductNamePrefix() + "-"
        + productConfiguration.getProductNamePostfix();
  }
}

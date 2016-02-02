// Copyright 2011 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.lib.conf;

import com.google.api.ads.common.lib.conf.AdsApiConfiguration;
import com.google.inject.name.Named;

import org.apache.commons.configuration.Configuration;

import javax.inject.Inject;

/**
 * Configuration information for DFP library.
 */
public class DfpApiConfiguration extends AdsApiConfiguration {

  public static final String NAMESPACE_PREFIX_KEY = "api.dfp.namespace.prefix";

  /**
   * Constructor.
   *
   * @param config the backing configuration
   */
  @Inject
  public DfpApiConfiguration(@Named("api") Configuration config) {
    super(config);
  }

  /**
   * @see AdsApiConfiguration#getNamespacePrefix()
   */
  @Override
  public String getNamespacePrefix() {
    return getString(NAMESPACE_PREFIX_KEY);
  }
}

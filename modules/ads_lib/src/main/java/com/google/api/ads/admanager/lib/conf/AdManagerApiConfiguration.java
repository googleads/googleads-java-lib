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

package com.google.api.ads.admanager.lib.conf;

import com.google.api.ads.common.lib.conf.AdsApiConfiguration;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.apache.commons.configuration.Configuration;

/** Configuration information for Ad Manager library. */
public class AdManagerApiConfiguration extends AdsApiConfiguration {

  public static final String NAMESPACE_PREFIX_KEY = "api.admanager.namespace.prefix";
  private static final String KEY_PREFIX = "api.admanager";

  /**
   * Constructor.
   *
   * @param config the backing configuration
   */
  @Inject
  public AdManagerApiConfiguration(@Named("api") Configuration config) {
    super(config);
  }

  @Override
  public String getNamespacePrefix() {
    return getString(NAMESPACE_PREFIX_KEY);
  }

  @Override
  public String getRequestIdXPath() {
    return config.getString(String.format("%s.%s", KEY_PREFIX, REQUEST_ID_XPATH_POSTFIX));
  }

  @Override
  public String getRequestContextXPath() {
    return config.getString(String.format("%s.%s", KEY_PREFIX, REQUEST_CONTEXT_XPATH_POSTFIX));
  }

  @Override
  public String getResponseTimeXPath() {
    return config.getString(String.format("%s.%s", KEY_PREFIX, RESPONSE_TIME_XPATH_POSTFIX));
  }
}

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
 * Configuration which represents the API.
 */
public abstract class AdsApiConfiguration extends BaseConfiguration {

  protected static final String REQUEST_ID_XPATH_POSTFIX = "requestIdXPath";
  protected static final String SENSITIVE_XPATHS_POSTFIX = "sensitiveXPaths";
  protected static final String REQUEST_CONTEXT_XPATH_POSTFIX = "requestContextXPath";
  protected static final String RESPONSE_TIME_XPATH_POSTFIX = "responseTimeXPath";
  protected static final String RESPONSE_OPERATIONS_COUNT_XPATH_POSTFIX =
      "responseOperationsCountXPath";

  /**
   * Constructor.
   *
   * @param config the API configuration
   */
  public AdsApiConfiguration(Configuration config) {
    super(config);
  }

  /**
   * Gets the namespace prefix.
   */
  public abstract String getNamespacePrefix();
  
  public String getRequestIdXPath() {
    return null;
  }
  
  public String[] getSensitiveXPaths() {
    return new String[0];
  }
  
  public String getRequestContextXPath() {
    return null;
  }
  
  public String getResponseTimeXPath() {
    return null;
  }

  public String getResponseOperationsCountXPath() {
    return null;
  }
}

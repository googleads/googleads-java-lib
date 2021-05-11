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
 * Configuration of lib properties.
 */
public abstract class AdsLibConfiguration extends BaseConfiguration {

  /**
   * Configuration keys.
   */
  public static final String AUTO_SET_PROXY_KEY = "com.google.api.ads.common.lib.autosetproxy";
  public static final String REFETCH_STALE_TOKENS_KEY =
      "com.google.api.ads.common.lib.auth.refetchstaletokens";
  public static final String VERSION_KEY = "com.google.api.ads.version";
  public static final String AUTO_REFRESH_OAUTH2_TOKEN_POSTFIX = "refreshOAuth2Token";
  public static final String USE_COMPRESSION_POSTFIX = "useCompression";
  public static final String SOAP_REQUEST_TIMEOUT_POSTFIX = "soapRequestTimeout";
  public static final String INCLUDE_UTILITIES_IN_USER_AGENT_POSTFIX =
      "includeUtilitiesInUserAgent";
  
  public static final int DEFAULT_SOAP_REQUEST_TIMEOUT = 20 * 60 * 1000;

  /**
   * Constructor.
   *
   * @param config the lib configuration
   */
  public AdsLibConfiguration(Configuration config) {
    super(config);
  }

  /**
   * Gets the version for use with duck-typed jars.
   */
  public String getDuckTypedVersion() {
    return getString(VERSION_KEY);
  }

  /**
   * Is the proxy set automatically when making HTTP (non-SOAP) clients calls.
   */
  public boolean isAutoSetProxy() {
    return getBoolean(AUTO_SET_PROXY_KEY);
  }

  /**
   * Gets if OAuth2 token should be automatically refreshed. Default is
   * {@code true}.
   */
  public boolean isAutoRefreshOAuth2TokenEnabled() {
    return true;
  }
  
  /**
   * Returns if requests and responses should be compressed.
   */
  public boolean isCompressionEnabled() {
    return false;
  }
  
  /**
   * Gets the request timeout in milliseconds.
   */
  public int getSoapRequestTimeout() {
    return DEFAULT_SOAP_REQUEST_TIMEOUT;
  }
  
  /**
   * Returns if usage of ads utilities should be included in the user agent.
   */
  public boolean isIncludeAdsUtilitiesInUserAgent() {
    return true;
  }
}

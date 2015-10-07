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

package com.google.api.ads.adwords.lib.conf;

import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import org.apache.commons.configuration.Configuration;

/**
 * Configuration information for AdWords library.
 */
public class AdWordsLibConfiguration extends AdsLibConfiguration {

  private static final String KEY_PREFIX = "api.adwords";
  private static final String REPORT_DOWNLOAD_TIMEOUT_KEY = "reportDownloadTimeout";
  private static final int DEFAULT_REPORT_DOWNLOAD_TIMEOUT = 3 * 60 * 1000;

  /**
   * Constructor.
   *
   * @param config the backing configuration
   */
  @Inject
  public AdWordsLibConfiguration(@Named("lib") Configuration config) {
    super(config);
  }

  @Override
  public boolean isAutoRefreshOAuth2TokenEnabled() {
    return config.getBoolean(KEY_PREFIX + "." + AUTO_REFRESH_OAUTH2_TOKEN_POSTFIX, true);
  }

  /**
   * Returns the report download timeout as specified in ads.properties (default
   * 3 minutes).
   */
  public int getReportDownloadTimeout() {
    return config.getInt(
        KEY_PREFIX + "." + REPORT_DOWNLOAD_TIMEOUT_KEY, DEFAULT_REPORT_DOWNLOAD_TIMEOUT);
  }
  
  @Override
  public boolean isCompressionEnabled() {
    return config.getBoolean(KEY_PREFIX + "." + USE_COMPRESSION_POSTFIX, false);
  }
  
  @Override
  public int getSoapRequestTimeout() {
    return config.getInt(
        KEY_PREFIX + "." + SOAP_REQUEST_TIMEOUT_POSTFIX, DEFAULT_SOAP_REQUEST_TIMEOUT);
  }
  
}

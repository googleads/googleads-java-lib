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

import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.inject.name.Named;
import com.google.inject.Inject;
import org.apache.commons.configuration.Configuration;

/** Configuration information for Ad Manager library. */
public class AdManagerLibConfiguration extends AdsLibConfiguration {

  private static final String KEY_PREFIX = "api.admanager";

  /**
   * Constructor.
   *
   * @param config the backing configuration
   */
  @Inject
  public AdManagerLibConfiguration(@Named("lib") Configuration config) {
    super(config);
  }

  /** Gets if OAuth2 token should be automatically refreshed. Default is {@code true}. */
  @Override
  public boolean isAutoRefreshOAuth2TokenEnabled() {
    return config.getBoolean(KEY_PREFIX + "." + AUTO_REFRESH_OAUTH2_TOKEN_POSTFIX, true);
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

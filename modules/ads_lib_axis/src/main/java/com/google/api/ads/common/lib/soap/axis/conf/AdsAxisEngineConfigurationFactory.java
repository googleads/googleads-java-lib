// Copyright 2014 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.soap.axis.conf;

import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.inject.Inject;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.EngineConfigurationFactory;
import org.apache.axis.configuration.EngineConfigurationFactoryDefault;
import org.apache.axis.configuration.FileProvider;

/**
 * EngineConfigurationFactory implementation that configures Axis clients using a custom
 * configuration file if compression is enabled and no client customization has been specified
 * in the environment.
 */
public class AdsAxisEngineConfigurationFactory implements EngineConfigurationFactory {

  private final AdsLibConfiguration adsLibConfiguration;
  private final EngineConfigurationFactory wrappedFactory;
  
  @Inject
  public AdsAxisEngineConfigurationFactory(AdsLibConfiguration adsLibConfiguration) {
    this.adsLibConfiguration = adsLibConfiguration;
    // Wraps the default factory instead of extending it per the class comments on
    // EngineConfigurationFactoryDefault.
    this.wrappedFactory = EngineConfigurationFactoryDefault.newFactory(null);
  }

  @Override
  public EngineConfiguration getClientEngineConfig() {
    // Only return the custom configuration for compression if the client config has not
    // been overridden.
    if (System.getProperty(EngineConfigurationFactoryDefault.OPTION_CLIENT_CONFIG_FILE) == null
        && adsLibConfiguration.isCompressionEnabled()) {
      return new FileProvider(
          this.getClass().getResourceAsStream("wsdd/ads-axis-client-config.wsdd"));
    }
    return wrappedFactory.getClientEngineConfig();
  }

  @Override
  public EngineConfiguration getServerEngineConfig() {
    return wrappedFactory.getServerEngineConfig();
  }

}
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

import com.google.api.ads.common.lib.conf.ConfigurationHelper.ConfigurationInfo;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Provider;

import org.apache.commons.configuration.Configuration;

import java.net.URL;
import java.util.List;

import javax.annotation.Nullable;

/**
 * Provider for {@link Configuration}.
 */
public class ConfigurationProvider implements Provider<Configuration> {

  private final List<ConfigurationInfo<URL>> propertyUrls;
  private final List<ConfigurationInfo<String>> propertyFilePaths;
  private final ConfigurationHelper configurationHelper;

  /**
   * Constructor. Loads propertyUrls followed by propertyFilePaths.
   *
   * @param propertyUrls the file names of the properties.
   * @param propertyFileNames the property file names.
   */
  public ConfigurationProvider(@Nullable List<ConfigurationInfo<URL>> propertyUrls,
      @Nullable List<ConfigurationInfo<String>> propertyFileNames) {
    this(propertyUrls, propertyFileNames, new ConfigurationHelper());
  }

  /**
   * Constructor. Loads propertyUrls followed by propertyFilePaths.
   *
   * @param propertyUrls the file names of the properties.
   * @param propertyFileNames the property file names.
   * @param configurationHelper the configuration helper.
   */
  @VisibleForTesting
  ConfigurationProvider(@Nullable List<ConfigurationInfo<URL>> propertyUrls,
      @Nullable List<ConfigurationInfo<String>> propertyFileNames,
      ConfigurationHelper configurationHelper) {
    this.propertyUrls = propertyUrls;
    this.propertyFilePaths = propertyFileNames;
    this.configurationHelper = configurationHelper;
  }

  @Override
  public Configuration get() {
    try {
      return configurationHelper.createCombinedConfiguration(propertyFilePaths, propertyUrls);
    } catch (ConfigurationLoadException e) {
      throw new IllegalArgumentException("Configuration could be loaded.", e);
    }
  }
}

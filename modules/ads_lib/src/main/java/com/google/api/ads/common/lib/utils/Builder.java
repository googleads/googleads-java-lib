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

package com.google.api.ads.common.lib.utils;

import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.ValidationException;
import java.io.File;
import java.net.URL;
import org.apache.commons.configuration.Configuration;

/**
 * Builder interface.
 *
 * @param <T> the builder type
 */
public interface Builder<T> {

  /** The default configuration filename used when {@link #fromFile()} is called. */
  public static String DEFAULT_CONFIGURATION_FILENAME = "ads.properties";

  /**
   * Constructs this object.
   * @throws ValidationException if the provided data is not valid.
   */
  public T build() throws ValidationException;

  /**
   * Populates this builder from the specified Configuration.
   * @param config {@link Configuration} to load properties from
   * @return Builder populated from the Configuration
   * @throws ConfigurationLoadException if the configuration could not be
   *         loaded.
   */
  public Builder<T> from(Configuration config) throws ConfigurationLoadException;

  /**
   * Loads credentials from the {@value #DEFAULT_CONFIGURATION_FILENAME} file in one of the
   * following locations according to the following order: in the current directory, in
   * the user home directory, in the classpath
   * @throws ConfigurationLoadException if the configuration could not be
   *         loaded.
   */
  public Builder<T> fromFile() throws ConfigurationLoadException;

  /**
   * Populates this builder from a properties file from a specified path. If
   * not absolute, will look in user home directory, the current classpath and
   * the system classpath.
   *
   * @param path the path to try first as a resource, then as a file
   * @return Builder populated with properties.
   * @throws ConfigurationLoadException if the configuration could not be
   *         loaded.
   */
  public Builder<T> fromFile(String path) throws ConfigurationLoadException;

  /**
   * Populates this builder from a properties file from a specified path.
   *
   * @param path the path to load properties from
   * @return Builder populated with properties.
   * @throws ConfigurationLoadException if the configuration could not be
   *         loaded.
   */
  public Builder<T> fromFile(File path) throws ConfigurationLoadException;

  /**
   * Populates this builder from a properties file from a specified path. If
   * not absolute, will look in user home directory, the current classpath and
   * the system classpath.
   *
   * @param path the path to try first as a resource, then as a file
   * @return Builder populated with properties.
   * @throws ConfigurationLoadException if the configuration could not be
   *         loaded.
   */
  public Builder<T> fromFile(URL path) throws ConfigurationLoadException;
}

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

package com.google.api.ads.common.lib.soap.axis;

import com.google.api.ads.common.lib.conf.ConfigurationHelper;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.useragent.FrameworkUserAgentProvider;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;

import org.apache.axis.Version;
import org.apache.commons.configuration.Configuration;

/**
 * Module for SOAP client handler.
 *
 * @author Adam Rogal
 */
public class AxisModule extends AbstractModule {

  private final ConfigurationHelper configurationHelper;

  /**
   * Constructor.
   */
  public AxisModule() {
    this(new ConfigurationHelper());
  }

  /**
   * Constructor for testing.
   *
   * @param configurationHelper the configuration helper.
   */
  @VisibleForTesting
  AxisModule(ConfigurationHelper configurationHelper) {
    this.configurationHelper = configurationHelper;
  }

  @SuppressWarnings("rawtypes") // TypeLiteral of non-rawtypes does not work.
  @Override
  protected void configure() {
    bind(new TypeLiteral<SoapClientHandlerInterface>() {})
        .to(AxisHandler.class).asEagerSingleton();
    bind(FrameworkUserAgentProvider.class).to(AxisFrameworkUserAgentProvider.class);
    try {
      bind(Configuration.class).annotatedWith(Names.named("axisResources")).toInstance(
          configurationHelper.fromFile(Version.class
              .getResource("/org/apache/axis/i18n/resource.properties")));
    } catch (ConfigurationLoadException e) {
      throw new IllegalStateException("Could not not Axis resource properties.", e);
    }
  }
}

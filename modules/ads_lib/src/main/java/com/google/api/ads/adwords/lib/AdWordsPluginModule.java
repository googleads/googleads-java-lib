// Copyright 2017 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib;

import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.useragent.ExtensionUserAgentProvider;
import com.google.common.base.Preconditions;
import com.google.inject.AbstractModule;

/**
 * Module to allow extensions or apps to plug in additional behavior by passing an instance of this
 * class to {@link AdWordsServicesInterface#withPluginModule(AdWordsPluginModule)}.
 */
public class AdWordsPluginModule extends AbstractModule {

  private final ExtensionUserAgentProvider extensionUserAgentProvider;

  public AdWordsPluginModule(ExtensionUserAgentProvider extensionUserAgentProvider) {
    this.extensionUserAgentProvider = Preconditions.checkNotNull(extensionUserAgentProvider,
        "Null extension user agent provider");
  }

  @Override
  protected void configure() {
    bind(ExtensionUserAgentProvider.class).toInstance(extensionUserAgentProvider);
  }
}

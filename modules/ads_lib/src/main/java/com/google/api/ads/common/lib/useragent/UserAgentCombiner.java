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

package com.google.api.ads.common.lib.useragent;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Combines all user agents along with a user supplied string.
 *
 * @author Adam Rogal
 */
public class UserAgentCombiner {

  private List<UserAgentProvider> userAgentProviders;

  /**
   * Constructor.
   *
   * @param productUserAgentProvider the product user agent library user agent provider
   * @param productFrameworkProviderHolder holder for the product/framework user agent
   *        provider
   * @param adsLibraryUserAgentProvider the ads library user agent provider
   * @param frameworkProviderHolder holder for the framework user agent provider
   * @param runtimeUserAgentProvider the runtime user agent provider
   * @param buildTypeUserAgentProvider the build type user agent provider
   */
  @Inject
  public UserAgentCombiner(ProductUserAgentProvider productUserAgentProvider,
      ProductFrameworkProviderHolder productFrameworkProviderHolder,
      AdsLibraryUserAgentProvider adsLibraryUserAgentProvider,
      FrameworkProviderHolder frameworkProviderHolder,
      RuntimeUserAgentProvider runtimeUserAgentProvider,
      BuildTypeUserAgentProvider buildTypeUserAgentProvider) {
    this(Lists.newArrayList(productUserAgentProvider, productFrameworkProviderHolder.value,
        adsLibraryUserAgentProvider, frameworkProviderHolder.value, runtimeUserAgentProvider,
        buildTypeUserAgentProvider));
  }

  /**
   * Constructor used for testing.
   *
   * @param userAgentProviders the user agent providers
   */
  @VisibleForTesting
  UserAgentCombiner(List<UserAgentProvider> userAgentProviders) {
    this.userAgentProviders = userAgentProviders;
  }

  /**
   * Gets the full user agent in the form of
   * {@code "(UserAgent1,UserAgent2,UserAgent3,...)"}
   */
  public String getUserAgent(String nonLibraryUserAgent) {
    return nonLibraryUserAgent + " ("
        + Joiner.on(", ").skipNulls().join(
            Lists.transform(userAgentProviders, new Function<UserAgentProvider, String>() {
              @Override
              public String apply(@Nullable UserAgentProvider input) {
                return input == null ? null : input.getUserAgent();
              }}))
        + ")";
  }

  static class ProductFrameworkProviderHolder {
    @Inject(optional = true) ProductFrameworkUserAgentProvider value;
  }

  static class FrameworkProviderHolder {
    @Inject(optional = true) FrameworkUserAgentProvider value;
  }
}

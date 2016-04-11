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
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Combines all user agents along with a user supplied string.
 */
public class UserAgentCombiner {

  private ImmutableList<UserAgentProvider> userAgentProviders;
  
  /**
   * Constructor that builds an instance based on a list of underlying user agent
   * providers. The {@code xyzHolder} parameters are for user agent providers that
   * may be null in certain contexts.
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
      BuildTypeUserAgentProvider buildTypeUserAgentProvider,
      AdsUtilitiesUserAgentProvider adsUtilitiesUserAgentProvider) {
    this(Lists.newArrayList(productUserAgentProvider, productFrameworkProviderHolder.value,
        adsLibraryUserAgentProvider, frameworkProviderHolder.value, runtimeUserAgentProvider,
        buildTypeUserAgentProvider, adsUtilitiesUserAgentProvider));
  }

  /**
   * Constructor used for testing.
   *
   * @param userAgentProviders the user agent providers
   * utilities agent provider
   */
  @VisibleForTesting
  UserAgentCombiner(
      List<UserAgentProvider> userAgentProviders) {
    // Remove any nulls from the list, since ImmutableList does not support null entries.
    this.userAgentProviders = ImmutableList.<UserAgentProvider>copyOf(
        Collections2.filter(userAgentProviders, Predicates.notNull()));
  }

  /**
   * Gets the full user agent in the form of
   * {@code "(UserAgent1,UserAgent2,UserAgent3,...)"}
   */
  public String getUserAgent(String nonLibraryUserAgent) {
    StringBuilder agentStringBuilder = new StringBuilder();
    agentStringBuilder.append(nonLibraryUserAgent);
    agentStringBuilder.append(" (");
    agentStringBuilder.append(Joiner.on(", ").skipNulls().join(
        Iterables.transform(userAgentProviders, new Function<UserAgentProvider, String>() {
          @Override
          public String apply(@Nullable UserAgentProvider input) {
            return input == null ? null : input.getUserAgent();
          }})));
    agentStringBuilder.append(')');
    return agentStringBuilder.toString();
  }
  
  /**
   * Holder that allows for <em>optional</em> injection of a {@link
   * ProductFrameworkUserAgentProvider}.
   * This is necessary because UserAgentCombiner instances are used in multiple contexts, some of
   * which do not have an associated SOAP toolkit. In such cases, the {@code value} will be null.
   */
  static class ProductFrameworkProviderHolder {
    @Inject(optional = true) ProductFrameworkUserAgentProvider value;
  }

  /**
   * Holder that allows for <em>optional</em> injection of a {@link FrameworkUserAgentProvider}.
   * This is necessary because UserAgentCombiner instances are used in multiple contexts, some of
   * which do not have an associated SOAP toolkit. In such cases, the {@code value} will be null.
   */
  static class FrameworkProviderHolder {
    @Inject(optional = true) FrameworkUserAgentProvider value;
  }
}

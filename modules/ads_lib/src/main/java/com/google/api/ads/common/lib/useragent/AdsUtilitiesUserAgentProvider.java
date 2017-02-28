// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.useragent;

import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.utils.AdsUtility;
import com.google.api.ads.common.lib.utils.AdsUtilityRegistry;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import java.util.Set;
import javax.annotation.Nullable;

/**
 * Provides the ads utilities user agent.
 */
public class AdsUtilitiesUserAgentProvider implements UserAgentProvider {
  private final AdsUtilityRegistry adsUtilityRegistry;
  private final AdsLibConfiguration adsLibConfiguration;

  private static final Function<AdsUtility, String> ADS_UTILITY_FUNCTION =
      new Function<AdsUtility, String>() {
        @Override
        @Nullable
        public String apply(@Nullable AdsUtility input) {
          return input == null ? null : input.getUserAgentIdentifier();
        }
      };

  @Inject
  public AdsUtilitiesUserAgentProvider(
      AdsUtilityRegistry adsUtilityRegistry, AdsLibConfiguration adsLibConfiguration) {
    this.adsUtilityRegistry = adsUtilityRegistry;
    this.adsLibConfiguration = adsLibConfiguration;
  }

  @Override
  public String getUserAgent() {
    Set<AdsUtility> adsUtilities = adsUtilityRegistry.getRegisteredUtilities();
    
    // Always clear the registry, even if utilities will not be included in the user agent.
    adsUtilityRegistry.removeUtilities(adsUtilities);
    
    if (!adsLibConfiguration.isIncludeAdsUtilitiesInUserAgent() || adsUtilities.isEmpty()) {
      return null;
    }

    // Adheres to User-Agent product identifiers from RFC 7231.
    // https://tools.ietf.org/html/rfc7231#section-5.5.3
    // Sorts the collection of utilities so output is deterministic.
    return Joiner.on(", ").skipNulls().join(
        Sets.newTreeSet(Collections2.transform(adsUtilities, ADS_UTILITY_FUNCTION)));
  }
}

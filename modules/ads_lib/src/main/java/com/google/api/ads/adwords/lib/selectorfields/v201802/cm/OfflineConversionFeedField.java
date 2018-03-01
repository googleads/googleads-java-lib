// Copyright 2018 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.selectorfields.v201802.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code OfflineConversionFeed}.
 */
public enum OfflineConversionFeedField implements EntityField {

  // Fields constants definitions

  /**
   * The currency that the advertiser associates with the conversion value.
   * This is the ISO 4217 3-character currency code.
   * For example: USD, EUR.
   */
  @Filterable
  ConversionCurrencyCode(true),

  /**
   * The type associated with this conversion.
   * <p> It is valid to report multiple conversions for the same google click ID, since visitors may trigger multiple conversions for a click.
   * These conversions names are generated in the front end by advertisers.
   */
  @Filterable
  ConversionName(true),

  /**
   * The time that this conversion occurred at.
   * <p> This has to be after the click time.
   * A time in the future is not allowed.
   * A timezone is always required.
   * <p> When a conversion for the same google click ID, conversion name and conversion time is uploaded multiple times, the first one results in a conversion being recorded.
   * The duplicates are ignored and reported as successes, to indicate that a conversion for this combination has been recorded.
   */
  @Filterable
  ConversionTime(true),

  /**
   * This conversions value for the advertiser.
   */
  @Filterable
  ConversionValue(true),

  /**
   * The google click ID associated with this conversion, as captured from the landing page.
   * <p> If your account has auto-tagging turned on, the google click ID can be obtained from a query parameter called 'gclid'.
   */
  @Filterable
  GoogleClickId(true),

  ;

  private final boolean isFilterable;

  private OfflineConversionFeedField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}

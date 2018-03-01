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
 * A {@code Enum} to facilitate the selection of fields for {@code CustomerNegativeCriterion}.
 */
public enum CustomerNegativeCriterionField implements EntityField {

  // Fields constants definitions

  /**
   * A string that uniquely identifies a mobile application to AdWords API.
   * The format of this string is "<code>{platform}-{platform_native_id}</code>", where <code>platform</code> is "1" for iOS apps and "2" for Android apps, and where <code>platform_native_id</code> is the mobile application identifier native to the corresponding platform.
   * For iOS, this native identifier is the 9 digit string that appears at the end of an App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is http://itunes.apple.com/us/app/flood-it!-2/id476943146).
   * For Android, this native identifier is the application's package name (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
   * A well formed app id for AdWords API would thus be "1-476943146" for iOS and "2-com.labpixies.colordrips" for Android.
   */
  @Filterable
  AppId(true),

  /**
   * The YouTube uploader channel id or the channel code of a YouTube content channel.
   * <p>The uploader channel id can be obtained from the YouTube id-based URL.
   * For example, in <code>https://www.youtube.com/channel/UCEN58iXQg82TXgsDCjWqIkg</code> the channel id is <code>UCEN58iXQg82TXgsDCjWqIkg</code> <p>For more information see: https://support.google.com/youtube/answer/6180214
   */
  ChannelId(false),

  /**
   * The public name for a YouTube user channel.
   */
  ChannelName(false),

  /**
   * Content label type
   */
  @Filterable
  ContentLabelType(true),

  /**
   * 
   */
  @Filterable
  CriteriaType(true),

  /**
   * Title of this mobile application.
   */
  @Filterable
  DisplayName(true),

  /**
   * ID of this criterion.
   */
  @Filterable
  Id(true),

  /**
   * ID of this mobile app category.
   * A complete list of the available mobile app categories is available <a href="/adwords/api/docs/appendix/mobileappcategories">here</a>.
   */
  MobileAppCategoryId(false),

  /**
   * Url of the placement.
   * <p>For example, "http://www.domain.com".
   */
  @Filterable
  PlacementUrl(true),

  /**
   * YouTube video id as it appears on the YouTube watch page.
   */
  VideoId(false),

  /**
   * Name of the video.
   */
  VideoName(false),

  ;

  private final boolean isFilterable;

  private CustomerNegativeCriterionField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}

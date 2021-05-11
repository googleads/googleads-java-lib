// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.selectorfields.v201809.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code Asset}.
 */
public enum AssetField implements EntityField {

  // Fields constants definitions

  /**
   * Id of this asset.
   */
  @Filterable
  AssetId(true),

  /**
   * Optional name of the asset which can act as a unique identifier.
   */
  @Filterable
  AssetName(true),

  /**
   * Asset status.
   * This status does NOT affect serving, and is only meant to be a "library status." To stop an asset from serving, you need to remove the asset from the entity that is using it.
   */
  @Filterable
  AssetStatus(true),

  /**
   * Asset type.
   * Used for returning asset type and filtering by asset type in GET.
   */
  @Filterable
  AssetSubtype(true),

  /**
   * File size of the image.
   */
  @Filterable
  ImageFileSize(true),

  /**
   * URL pointing to the image in the specified height & width.
   */
  @Filterable
  ImageFullSizeUrl(true),

  /**
   * Height of the image.
   */
  @Filterable
  ImageHeight(true),

  /**
   * The mime type of the image.
   */
  @Filterable
  ImageMimeType(true),

  /**
   * Width of the image.
   */
  @Filterable
  ImageWidth(true),

  /**
   * YouTube video ID.
   * This is the 11 char string value used in the Youtube video URL.
   */
  @Filterable
  YouTubeVideoId(true),

  ;

  private final boolean isFilterable;

  private AssetField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}

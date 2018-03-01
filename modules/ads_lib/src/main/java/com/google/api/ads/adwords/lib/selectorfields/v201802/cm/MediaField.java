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
 * A {@code Enum} to facilitate the selection of fields for {@code Media}.
 */
public enum MediaField implements EntityField {

  // Fields constants definitions

  /**
   * The Advertising Digital Identification code for this media, as defined by the American Association of Advertising Agencies, used mainly for television commercials.
   */
  @Filterable
  AdvertisingId(true),

  /**
   * Media creation date in the format YYYY-MM-DD HH:MM:SS+TZ.
   * This is not updatable and not specifiable.
   */
  @Filterable
  CreationTime(true),

  /**
   * Various dimension sizes for the media.
   * Only applies to image media (and video media for video thumbnails).
   */
  Dimensions(false),

  /**
   * The duration of the associated audio, in milliseconds.
   */
  @Filterable
  DurationMillis(true),

  /**
   * The size of the media file in bytes.
   */
  @Filterable
  FileSize(true),

  /**
   * Height of the dimension
   */
  @Filterable
  Height(true),

  /**
   * The Industry Standard Commercial Identifier code for this media, used mainly for television commercials.
   */
  @Filterable
  IndustryStandardCommercialIdentifier(true),

  /**
   * ID of this media object.
   */
  @Filterable
  MediaId(true),

  /**
   * The mime type of the media.
   */
  @Filterable
  MimeType(true),

  /**
   * The name of the media.
   * The name can be used by clients to help identify previously uploaded media.
   */
  @Filterable
  Name(true),

  /**
   * Indicates whether the audio is ready to play on the web.
   */
  ReadyToPlayOnTheWeb(false),

  /**
   * Media reference ID key.
   */
  @Filterable
  ReferenceId(true),

  /**
   * The URL of where the original media was downloaded from (or a file name).
   */
  @Filterable
  SourceUrl(true),

  /**
   * The streaming URL of the audio.
   */
  StreamingUrl(false),

  /**
   * Type of media object.
   * Required when using {@code MediaService#upload} to upload a new media file.
   * MEDIA_BUNDLE, ICON, IMAGE, and DYNAMIC_IMAGE are the supported MediaTypes to upload.
   */
  @Filterable
  Type(true),

  /**
   * URLs pointing to the resized media for the given sizes.
   * Only applies to image media.
   */
  Urls(false),

  /**
   * Width of the dimension
   */
  @Filterable
  Width(true),

  /**
   * For YouTube-hosted videos, the YouTube video ID (as seen in YouTube URLs) may also be filled in.
   */
  @Filterable
  YouTubeVideoIdString(true),

  ;

  private final boolean isFilterable;

  private MediaField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}

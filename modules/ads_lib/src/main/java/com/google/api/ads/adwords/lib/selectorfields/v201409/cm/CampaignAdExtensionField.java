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

package com.google.api.ads.adwords.lib.selectorfields.v201409.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code CampaignAdExtension}.
 */
public enum CampaignAdExtensionField implements EntityField {

  // Fields constants definitions

  /**
   * ID of ad extension.
   * <p>Do <b>not</b> use this in a {@link CampaignAdExtension#mutate} ADD operation.</p>
   */
  @Filterable
  AdExtensionId(true),

  /**
   * Address of the location (as is populated in GeoLocation by GeoLocationService).
   * <b>Note:</b> When specifying both {@link Address#provinceCode provinceCode} and {@link Address#provinceName provinceName}, only provinceName is saved and returned.
   * If provinceName is empty and provinceCode is specified, the provinceCode value is saved as a provinceName, i.e.
   * provinceCode is ignored by the service.
   */
  Address(false),

  /**
   * Approval status.
   */
  @Filterable
  ApprovalStatus(true),

  /**
   * Campaign ID of the campaign to which the ad extension is connected.
   */
  @Filterable
  CampaignId(true),

  /**
   * The name of the company located at the given address
   */
  CompanyName(false),

  /**
   * Email associated with the LBC backend data
   */
  Email(false),

  /**
   * Byte data encoding address and geo point (as is populated in GeoLocation by GeoLocationService).
   * Input only.
   * Required on location extension creation.
   */
  EncodedLocation(false),

  /**
   * The lat/long point of the location (as is populated in GeoLocation by GeoLocationService).
   */
  GeoPoint(false),

  /**
   * The business icon to use with the extension
   */
  IconMediaId(false),

  /**
   * The store front image to use with the extension
   */
  ImageMediaId(false),

  /**
   * The source which generated the extension
   */
  @Filterable
  LocationExtensionSource(true),

  /**
   * The phone number for the location
   */
  PhoneNumber(false),

  /**
   * Whether we should copy homepage url from LBC entries as the destination url in location extension.
   */
  ShouldSyncUrl(false),

  /**
   * Status of ad extension in the campaign - defaults to {@code ACTIVE} on add if unspecified.
   */
  @Filterable
  Status(true),

  ;

  private final boolean isFilterable;

  private CampaignAdExtensionField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  public boolean isFilterable() {
    return this.isFilterable;
  }

}

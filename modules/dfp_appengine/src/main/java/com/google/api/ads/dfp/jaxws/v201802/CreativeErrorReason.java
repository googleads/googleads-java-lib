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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FLASH_AND_FALLBACK_URL_ARE_SAME"/>
 *     &lt;enumeration value="INVALID_INTERNAL_REDIRECT_URL"/>
 *     &lt;enumeration value="DESTINATION_URL_REQUIRED"/>
 *     &lt;enumeration value="DESTINATION_URL_NOT_EMPTY"/>
 *     &lt;enumeration value="DESTINATION_URL_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE"/>
 *     &lt;enumeration value="CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_MOBILE_CREATIVE"/>
 *     &lt;enumeration value="MISSING_FEATURE"/>
 *     &lt;enumeration value="INVALID_COMPANY_TYPE"/>
 *     &lt;enumeration value="INVALID_ADSENSE_CREATIVE_SIZE"/>
 *     &lt;enumeration value="INVALID_AD_EXCHANGE_CREATIVE_SIZE"/>
 *     &lt;enumeration value="DUPLICATE_ASSET_IN_CREATIVE"/>
 *     &lt;enumeration value="CREATIVE_ASSET_CANNOT_HAVE_ID_AND_BYTE_ARRAY"/>
 *     &lt;enumeration value="CANNOT_CREATE_OR_UPDATE_UNSUPPORTED_CREATIVE"/>
 *     &lt;enumeration value="CANNOT_CREATE_PROGRAMMATIC_CREATIVES"/>
 *     &lt;enumeration value="INVALID_SIZE_FOR_THIRD_PARTY_IMPRESSION_TRACKER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativeError.Reason")
@XmlEnum
public enum CreativeErrorReason {


    /**
     * 
     *                 {@link FlashRedirectCreative#flashUrl} and
     *                 {@link FlashRedirectCreative#fallbackUrl} are the same. The fallback URL
     *                 is used when the flash URL does not work and must be different from it.
     *               
     * 
     */
    FLASH_AND_FALLBACK_URL_ARE_SAME,

    /**
     * 
     *                 The internal redirect URL was invalid. The URL must have the following
     *                 syntax http://ad.doubleclick.net/ad/sitename/;sz=size.
     *               
     * 
     */
    INVALID_INTERNAL_REDIRECT_URL,

    /**
     * 
     *                 {@link HasDestinationUrlCreative#destinationUrl} is required.
     *               
     * 
     */
    DESTINATION_URL_REQUIRED,

    /**
     * 
     *                 {@link HasDestinationUrlCreative#destinationUrl} must be empty when its type is
     *                 {@link DestinationUrlType#NONE}.
     *               
     * 
     */
    DESTINATION_URL_NOT_EMPTY,

    /**
     * 
     *                 The provided {@link DestinationUrlType} is not supported for the creative type it is
     *                 being used on.
     *               
     * 
     */
    DESTINATION_URL_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 Cannot create or update legacy DART For Publishers creative.
     *               
     * 
     */
    CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_CREATIVE,

    /**
     * 
     *                 Cannot create or update legacy mobile creative.
     *               
     * 
     */
    CANNOT_CREATE_OR_UPDATE_LEGACY_DFP_MOBILE_CREATIVE,

    /**
     * 
     *                 The user is missing a necessary feature.
     *               
     * 
     */
    MISSING_FEATURE,

    /**
     * 
     *                 Company type should be one of Advertisers, House Advertisers and
     *                 Ad Networks.
     *               
     * 
     */
    INVALID_COMPANY_TYPE,

    /**
     * 
     *                 Invalid size for AdSense dynamic allocation creative.
     *                 Only valid AFC sizes are allowed.
     *               
     * 
     */
    INVALID_ADSENSE_CREATIVE_SIZE,

    /**
     * 
     *                 Invalid size for Ad Exchange dynamic allocation creative.
     *                 Only valid Ad Exchange sizes are allowed.
     *               
     * 
     */
    INVALID_AD_EXCHANGE_CREATIVE_SIZE,

    /**
     * 
     *                 Assets associated with the same creative must be unique.
     *               
     * 
     */
    DUPLICATE_ASSET_IN_CREATIVE,

    /**
     * 
     *                 A creative asset cannot contain an asset ID and a byte array.
     *               
     * 
     */
    CREATIVE_ASSET_CANNOT_HAVE_ID_AND_BYTE_ARRAY,

    /**
     * 
     *                 Cannot create or update unsupported creative.
     *               
     * 
     */
    CANNOT_CREATE_OR_UPDATE_UNSUPPORTED_CREATIVE,

    /**
     * 
     *                 Cannot create programmatic creatives.
     *               
     * 
     */
    CANNOT_CREATE_PROGRAMMATIC_CREATIVES,

    /**
     * 
     *                 A creative must have valid size to use the third-party impression tracker.
     *               
     * 
     */
    INVALID_SIZE_FOR_THIRD_PARTY_IMPRESSION_TRACKER,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CreativeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

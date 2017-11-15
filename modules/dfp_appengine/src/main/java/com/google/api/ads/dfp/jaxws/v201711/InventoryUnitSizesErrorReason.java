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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryUnitSizesError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryUnitSizesError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_SIZES"/>
 *     &lt;enumeration value="INVALID_SIZE_FOR_PLATFORM"/>
 *     &lt;enumeration value="VIDEO_FEATURE_MISSING"/>
 *     &lt;enumeration value="VIDEO_MOBILE_LINE_ITEM_FEATURE_MISSING"/>
 *     &lt;enumeration value="INVALID_SIZE_FOR_MASTER"/>
 *     &lt;enumeration value="INVALID_SIZE_FOR_COMPANION"/>
 *     &lt;enumeration value="DUPLICATE_MASTER_SIZES"/>
 *     &lt;enumeration value="ASPECT_RATIO_NOT_SUPPORTED"/>
 *     &lt;enumeration value="VIDEO_COMPANIONS_NOT_SUPPORTED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryUnitSizesError.Reason")
@XmlEnum
public enum InventoryUnitSizesErrorReason {


    /**
     * 
     *                 A size in the ad unit is too large or too small.
     *               
     * 
     */
    INVALID_SIZES,

    /**
     * 
     *                 A size is an aspect ratio, but the ad unit is not a mobile ad unit.
     *               
     * 
     */
    INVALID_SIZE_FOR_PLATFORM,

    /**
     * 
     *                 A size is video, but the video feature is not enabled.
     *               
     * 
     */
    VIDEO_FEATURE_MISSING,

    /**
     * 
     *                 A size is video in a mobile ad unit,
     *                 but the mobile video feature is not enabled.
     *               
     * 
     */
    VIDEO_MOBILE_LINE_ITEM_FEATURE_MISSING,

    /**
     * 
     *                 A size that has companions must have an environment of VIDEO_PLAYER.
     *               
     * 
     */
    INVALID_SIZE_FOR_MASTER,

    /**
     * 
     *                 A size that is a companion must have an environment of BROWSER.
     *               
     * 
     */
    INVALID_SIZE_FOR_COMPANION,

    /**
     * 
     *                 Duplicate video master sizes are not allowed.
     *               
     * 
     */
    DUPLICATE_MASTER_SIZES,

    /**
     * 
     *                 A size is an aspect ratio, but aspect ratio sizes are not enabled.
     *               
     * 
     */
    ASPECT_RATIO_NOT_SUPPORTED,

    /**
     * 
     *                 A video size has companions, but companions are not allowed for the network
     *               
     * 
     */
    VIDEO_COMPANIONS_NOT_SUPPORTED,

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

    public static InventoryUnitSizesErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

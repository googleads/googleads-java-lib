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
 * <p>Java class for CreativeSetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeSetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIDEO_FEATURE_REQUIRED"/>
 *     &lt;enumeration value="CANNOT_CREATE_OR_UPDATE_VIDEO_CREATIVES"/>
 *     &lt;enumeration value="ROADBLOCK_FEATURE_REQUIRED"/>
 *     &lt;enumeration value="MASTER_CREATIVE_CANNOT_BE_COMPANION"/>
 *     &lt;enumeration value="INVALID_ADVERTISER"/>
 *     &lt;enumeration value="UPDATE_MASTER_CREATIVE_NOT_ALLOWED"/>
 *     &lt;enumeration value="MASTER_CREATIVE_CANNOT_BELONG_TO_MULTIPLE_VIDEO_CREATIVE_SETS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativeSetError.Reason")
@XmlEnum
public enum CreativeSetErrorReason {


    /**
     * 
     *                 The 'video' feature is required but not enabled.
     *               
     * 
     */
    VIDEO_FEATURE_REQUIRED,

    /**
     * 
     *                 Video creatives (including overlays, VAST redirects, etc..) cannot be created
     *                 or updated through the API.
     *               
     * 
     */
    CANNOT_CREATE_OR_UPDATE_VIDEO_CREATIVES,

    /**
     * 
     *                 The 'roadblock' feature is required but not enabled.
     *               
     * 
     */
    ROADBLOCK_FEATURE_REQUIRED,

    /**
     * 
     *                 A master creative cannot be a companion creative in the same creative set.
     *               
     * 
     */
    MASTER_CREATIVE_CANNOT_BE_COMPANION,

    /**
     * 
     *                 Creatives in a creative set must be for the same advertiser.
     *               
     * 
     */
    INVALID_ADVERTISER,

    /**
     * 
     *                 Updating a master creative in a creative set is not allowed.
     *               
     * 
     */
    UPDATE_MASTER_CREATIVE_NOT_ALLOWED,

    /**
     * 
     *                 A master creative must belong to only one video creative set.
     *               
     * 
     */
    MASTER_CREATIVE_CANNOT_BELONG_TO_MULTIPLE_VIDEO_CREATIVE_SETS,

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

    public static CreativeSetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

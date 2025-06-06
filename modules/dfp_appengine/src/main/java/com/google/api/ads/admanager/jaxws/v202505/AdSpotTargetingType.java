// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdSpotTargetingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdSpotTargetingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_REQUIRED"/&gt;
 *     &lt;enumeration value="EXPLICITLY_TARGETED"/&gt;
 *     &lt;enumeration value="EXPLICITLY_TARGETED_EXCEPT_HOUSE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdSpotTargetingType")
@XmlEnum
public enum AdSpotTargetingType {


    /**
     * 
     *                 Line items not targeting this ad spot explicitly may serve in it.
     *               
     * 
     */
    NOT_REQUIRED,

    /**
     * 
     *                 Only line items targeting this ad spots explicitly may serve in it
     *               
     * 
     */
    EXPLICITLY_TARGETED,

    /**
     * 
     *                 If house ads are an allowed reservation type, they may serve in the ad spot regardless of
     *                 whether they explicitly target it. Ads of other reservation types (whose type is allowed in the
     *                 ad spot), may serve in the ad spot only if explicitly targeted.
     *               
     * 
     */
    EXPLICITLY_TARGETED_EXCEPT_HOUSE,

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

    public static AdSpotTargetingType fromValue(String v) {
        return valueOf(v);
    }

}

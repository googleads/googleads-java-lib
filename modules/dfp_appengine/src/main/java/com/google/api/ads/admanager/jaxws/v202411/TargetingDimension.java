// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetingDimension.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetingDimension"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOM_CRITERIA"/&gt;
 *     &lt;enumeration value="GEOGRAPHY"/&gt;
 *     &lt;enumeration value="BROWSER"/&gt;
 *     &lt;enumeration value="BROWSER_LANGUAGE"/&gt;
 *     &lt;enumeration value="BANDWIDTH_GROUP"/&gt;
 *     &lt;enumeration value="OPERATING_SYSTEM"/&gt;
 *     &lt;enumeration value="USER_DOMAIN"/&gt;
 *     &lt;enumeration value="CONTENT"/&gt;
 *     &lt;enumeration value="VIDEO_POSITION"/&gt;
 *     &lt;enumeration value="AD_SIZE"/&gt;
 *     &lt;enumeration value="AD_UNIT"/&gt;
 *     &lt;enumeration value="PLACEMENT"/&gt;
 *     &lt;enumeration value="MOBILE_CARRIER"/&gt;
 *     &lt;enumeration value="DEVICE_CAPABILITY"/&gt;
 *     &lt;enumeration value="DEVICE_CATEGORY"/&gt;
 *     &lt;enumeration value="DEVICE_MANUFACTURER"/&gt;
 *     &lt;enumeration value="MOBILE_APPLICATION"/&gt;
 *     &lt;enumeration value="FORECASTED_CREATIVE_RESTRICTION"/&gt;
 *     &lt;enumeration value="VERTICAL"/&gt;
 *     &lt;enumeration value="CONTENT_LABEL"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TargetingDimension")
@XmlEnum
public enum TargetingDimension {

    CUSTOM_CRITERIA,
    GEOGRAPHY,
    BROWSER,
    BROWSER_LANGUAGE,
    BANDWIDTH_GROUP,
    OPERATING_SYSTEM,
    USER_DOMAIN,
    CONTENT,
    VIDEO_POSITION,
    AD_SIZE,
    AD_UNIT,
    PLACEMENT,
    MOBILE_CARRIER,
    DEVICE_CAPABILITY,
    DEVICE_CATEGORY,
    DEVICE_MANUFACTURER,
    MOBILE_APPLICATION,
    FORECASTED_CREATIVE_RESTRICTION,
    VERTICAL,
    CONTENT_LABEL,

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

    public static TargetingDimension fromValue(String v) {
        return valueOf(v);
    }

}

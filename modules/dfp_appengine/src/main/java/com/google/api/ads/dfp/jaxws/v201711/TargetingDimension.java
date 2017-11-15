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
 * <p>Java class for TargetingDimension.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetingDimension">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOM_CRITERIA"/>
 *     &lt;enumeration value="GEOGRAPHY"/>
 *     &lt;enumeration value="BROWSER"/>
 *     &lt;enumeration value="BROWSER_LANGUAGE"/>
 *     &lt;enumeration value="BANDWIDTH_GROUP"/>
 *     &lt;enumeration value="OPERATING_SYSTEM"/>
 *     &lt;enumeration value="USER_DOMAIN"/>
 *     &lt;enumeration value="CONTENT"/>
 *     &lt;enumeration value="VIDEO_POSITION"/>
 *     &lt;enumeration value="AD_SIZE"/>
 *     &lt;enumeration value="AD_UNIT"/>
 *     &lt;enumeration value="PLACEMENT"/>
 *     &lt;enumeration value="MOBILE_CARRIER"/>
 *     &lt;enumeration value="DEVICE_CAPABILITY"/>
 *     &lt;enumeration value="DEVICE_CATEGORY"/>
 *     &lt;enumeration value="DEVICE_MANUFACTURER"/>
 *     &lt;enumeration value="MOBILE_APPLICATION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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

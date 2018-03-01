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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoTargetTypeSetting.PositiveGeoTargetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeoTargetTypeSetting.PositiveGeoTargetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DONT_CARE"/>
 *     &lt;enumeration value="AREA_OF_INTEREST"/>
 *     &lt;enumeration value="LOCATION_OF_PRESENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeoTargetTypeSetting.PositiveGeoTargetType")
@XmlEnum
public enum GeoTargetTypeSettingPositiveGeoTargetType {


    /**
     * 
     *                 Specifies that either AOI or LOP may trigger the ad.
     *               
     * 
     */
    DONT_CARE,

    /**
     * 
     *                 Specifies that the ad is triggered only if the user's AOI matches.
     *               
     * 
     */
    AREA_OF_INTEREST,

    /**
     * 
     *                 Specifies that the ad is triggered only if the user's LOP matches.
     *               
     * 
     */
    LOCATION_OF_PRESENCE;

    public String value() {
        return name();
    }

    public static GeoTargetTypeSettingPositiveGeoTargetType fromValue(String v) {
        return valueOf(v);
    }

}

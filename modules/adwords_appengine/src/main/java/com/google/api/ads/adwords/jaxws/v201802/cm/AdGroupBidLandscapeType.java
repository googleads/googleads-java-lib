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
 * <p>Java class for AdGroupBidLandscape.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupBidLandscape.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNIFORM"/>
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupBidLandscape.Type")
@XmlEnum
public enum AdGroupBidLandscapeType {


    /**
     * 
     *                 Signifies that the bid of this ad group was applied to all criteria under the ad group.
     *                 Criteria with bid overrides are <em>included</em>, but the overrides on these criteria
     *                 were ignored when generating the landscape.
     *               
     * 
     */
    UNIFORM,

    /**
     * 
     *                 Signifies that the bid of this ad group was only applied to the ad group itself.
     *                 Criteria with bid overrides are <em>excluded</em>.
     *               
     * 
     */
    DEFAULT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdGroupBidLandscapeType fromValue(String v) {
        return valueOf(v);
    }

}

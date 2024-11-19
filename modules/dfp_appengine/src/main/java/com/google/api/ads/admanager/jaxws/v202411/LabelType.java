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
 * <p>Java class for LabelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LabelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMPETITIVE_EXCLUSION"/&gt;
 *     &lt;enumeration value="AD_UNIT_FREQUENCY_CAP"/&gt;
 *     &lt;enumeration value="AD_EXCLUSION"/&gt;
 *     &lt;enumeration value="CREATIVE_WRAPPER"/&gt;
 *     &lt;enumeration value="CANONICAL_CATEGORY"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LabelType")
@XmlEnum
public enum LabelType {


    /**
     * 
     *                 Allows for the creation of labels to exclude competing ads from showing on
     *                 the same page.
     *               
     * 
     */
    COMPETITIVE_EXCLUSION,

    /**
     * 
     *                 Allows for the creation of limits on the frequency that a user sees a
     *                 particular type of creative over a portion of the inventory.
     *               
     * 
     */
    AD_UNIT_FREQUENCY_CAP,

    /**
     * 
     *                 Allows for the creation of labels to exclude ads from showing against a tag
     *                 that specifies the label as an exclusion.
     *               
     * 
     */
    AD_EXCLUSION,

    /**
     * 
     *                 Allows for the creation of labels that can be used to force the wrapping of
     *                 a delivering creative with header/footer creatives. These labels are
     *                 paired with a {@link CreativeWrapper}.
     *               
     * 
     */
    CREATIVE_WRAPPER,

    /**
     * 
     *                 Allows for the creation of labels mapped to a Google canonical ad category, which can be used
     *                 for competitive exclusions and blocking across Google systems.
     *               
     * 
     */
    CANONICAL_CATEGORY,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LabelType fromValue(String v) {
        return valueOf(v);
    }

}

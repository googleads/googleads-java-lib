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
 * <p>Java class for AttributionModelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributionModelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="LAST_CLICK"/>
 *     &lt;enumeration value="FIRST_CLICK"/>
 *     &lt;enumeration value="LINEAR"/>
 *     &lt;enumeration value="TIME_DECAY"/>
 *     &lt;enumeration value="U_SHAPED"/>
 *     &lt;enumeration value="DATA_DRIVEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributionModelType")
@XmlEnum
public enum AttributionModelType {

    UNKNOWN,

    /**
     * 
     *                 Attributes all credit for a conversion to its last click.
     *               
     * 
     */
    LAST_CLICK,

    /**
     * 
     *                 Attributes all credit for a conversion to its first click.
     *               
     * 
     */
    FIRST_CLICK,

    /**
     * 
     *                 Attributes credit for a conversion equally across all of its clicks.
     *               
     * 
     */
    LINEAR,

    /**
     * 
     *                 Attributes exponentially more credit for a conversion to its more recent clicks
     *                 (half-life is 1 week).
     *               
     * 
     */
    TIME_DECAY,

    /**
     * 
     *                 Attributes 40% of the credit for a conversion to its first and last clicks.
     *                 Remaining 20% is evenly distributed across all other clicks.
     *               
     * 
     */
    U_SHAPED,

    /**
     * 
     *                 Flexible model that uses machine learning to determine the appropriate
     *                 distribution of credit among clicks.
     *               
     * 
     */
    DATA_DRIVEN;

    public String value() {
        return name();
    }

    public static AttributionModelType fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for GrpAge.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrpAge">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="AGE_UNKNOWN"/>
 *     &lt;enumeration value="AGE_0_TO_17"/>
 *     &lt;enumeration value="AGE_18_TO_24"/>
 *     &lt;enumeration value="AGE_25_TO_34"/>
 *     &lt;enumeration value="AGE_35_TO_44"/>
 *     &lt;enumeration value="AGE_45_TO_54"/>
 *     &lt;enumeration value="AGE_55_TO_64"/>
 *     &lt;enumeration value="AGE_65_PLUS"/>
 *     &lt;enumeration value="AGE_18_TO_49"/>
 *     &lt;enumeration value="AGE_21_TO_34"/>
 *     &lt;enumeration value="AGE_21_TO_49"/>
 *     &lt;enumeration value="AGE_21_PLUS"/>
 *     &lt;enumeration value="AGE_25_TO_49"/>
 *     &lt;enumeration value="AGE_21_TO_44"/>
 *     &lt;enumeration value="AGE_21_TO_54"/>
 *     &lt;enumeration value="AGE_21_TO_64"/>
 *     &lt;enumeration value="AGE_35_TO_49"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrpAge")
@XmlEnum
public enum GrpAge {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 When the age range is not available due to low impression levels, GRP privacy thresholds are
     *                 activated and prevent us from specifying age.
     *               
     * 
     */
    AGE_UNKNOWN,
    AGE_0_TO_17,
    AGE_18_TO_24,
    AGE_25_TO_34,
    AGE_35_TO_44,
    AGE_45_TO_54,
    AGE_55_TO_64,
    AGE_65_PLUS,
    AGE_18_TO_49,
    AGE_21_TO_34,
    AGE_21_TO_49,
    AGE_21_PLUS,
    AGE_25_TO_49,
    AGE_21_TO_44,
    AGE_21_TO_54,
    AGE_21_TO_64,
    AGE_35_TO_49;

    public String value() {
        return name();
    }

    public static GrpAge fromValue(String v) {
        return valueOf(v);
    }

}

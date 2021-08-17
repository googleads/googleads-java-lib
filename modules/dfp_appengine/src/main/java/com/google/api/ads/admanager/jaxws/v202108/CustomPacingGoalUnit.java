// Copyright 2021 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202108;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomPacingGoalUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomPacingGoalUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSOLUTE"/>
 *     &lt;enumeration value="MILLI_PERCENT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomPacingGoalUnit")
@XmlEnum
public enum CustomPacingGoalUnit {


    /**
     * 
     *                 The custom pacing goal amounts represent absolute numbers corresponding to the line item's
     *                 {@link Goal#unitType}.
     *               
     * 
     */
    ABSOLUTE,

    /**
     * 
     *                 The custom pacing goal amounts represent a millipercent. For example, 15000 millipercent
     *                 equals 15%.
     *               
     * 
     */
    MILLI_PERCENT,

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

    public static CustomPacingGoalUnit fromValue(String v) {
        return valueOf(v);
    }

}

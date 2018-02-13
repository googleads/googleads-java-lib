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
 * <p>Java class for MidrollFrequencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MidrollFrequencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="EVERY_N_SECONDS"/>
 *     &lt;enumeration value="FIXED_TIME"/>
 *     &lt;enumeration value="EVERY_N_CUEPOINTS"/>
 *     &lt;enumeration value="FIXED_CUE_POINTS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MidrollFrequencyType")
@XmlEnum
public enum MidrollFrequencyType {


    /**
     * 
     *                 The ad rule slot is not a mid-roll and hence {@code MidrollFrequency}
     *                 should be ignored.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 {@code MidrollFrequency} is a time interval and mentioned as a single
     *                 numeric value in seconds. For example, "100" would mean "play a
     *                 mid-roll every 100 seconds".
     *               
     * 
     */
    EVERY_N_SECONDS,

    /**
     * 
     *                 {@code MidrollFrequency} is a comma-delimited list of points in time
     *                 (in seconds) when an ad should play. For example, "100,300" would mean
     *                 "play an ad at 100 seconds and 300 seconds".
     *               
     * 
     */
    FIXED_TIME,

    /**
     * 
     *                 {@code MidrollFrequency} is a cue point interval and is a single integer
     *                 value, such as "5", which means "play a mid-roll every 5th cue point".
     *               
     * 
     */
    EVERY_N_CUEPOINTS,

    /**
     * 
     *                 Same as {@link #FIXED_TIME}, except the values represent the ordinal cue
     *                 points ("1,3,5", for example).
     *               
     * 
     */
    FIXED_CUE_POINTS,

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

    public static MidrollFrequencyType fromValue(String v) {
        return valueOf(v);
    }

}

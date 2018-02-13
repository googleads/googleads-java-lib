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
 * <p>Java class for GeoTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeoTargetingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TARGETED_LOCATIONS_NOT_EXCLUDABLE"/>
 *     &lt;enumeration value="EXCLUDED_LOCATIONS_CANNOT_HAVE_CHILDREN_TARGETED"/>
 *     &lt;enumeration value="POSTAL_CODES_CANNOT_BE_EXCLUDED"/>
 *     &lt;enumeration value="UNTARGETABLE_LOCATION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeoTargetingError.Reason")
@XmlEnum
public enum GeoTargetingErrorReason {


    /**
     * 
     *                 A location that is targeted cannot also be excluded.
     *               
     * 
     */
    TARGETED_LOCATIONS_NOT_EXCLUDABLE,

    /**
     * 
     *                 Excluded locations cannot have any of their children targeted.
     *               
     * 
     */
    EXCLUDED_LOCATIONS_CANNOT_HAVE_CHILDREN_TARGETED,

    /**
     * 
     *                 Postal codes cannot be excluded.
     *               
     * 
     */
    POSTAL_CODES_CANNOT_BE_EXCLUDED,

    /**
     * 
     *                 Indicates that location targeting is not allowed.
     *               
     * 
     */
    UNTARGETABLE_LOCATION,

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

    public static GeoTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

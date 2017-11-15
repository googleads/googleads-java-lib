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
 * <p>Java class for CompanionDeliveryOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanionDeliveryOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPTIONAL"/>
 *     &lt;enumeration value="AT_LEAST_ONE"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanionDeliveryOption")
@XmlEnum
public enum CompanionDeliveryOption {


    /**
     * 
     *                 Companions are not required to serve a creative set. The creative set can
     *                 serve to inventory that has zero or more matching companions.
     *               
     * 
     */
    OPTIONAL,

    /**
     * 
     *                 At least one companion must be served in order for the creative set to be used.
     *               
     * 
     */
    AT_LEAST_ONE,

    /**
     * 
     *                 All companions in the set must be served in order for the creative set to
     *                 be used. This can still serve to inventory that has more companions
     *                 than can be filled.
     *               
     * 
     */
    ALL,

    /**
     * 
     *                 The delivery type is unknown.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CompanionDeliveryOption fromValue(String v) {
        return valueOf(v);
    }

}

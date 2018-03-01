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
 * <p>Java class for PromotionExtensionOccasion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionExtensionOccasion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NEW_YEARS"/>
 *     &lt;enumeration value="VALENTINES_DAY"/>
 *     &lt;enumeration value="EASTER"/>
 *     &lt;enumeration value="MOTHERS_DAY"/>
 *     &lt;enumeration value="FATHERS_DAY"/>
 *     &lt;enumeration value="LABOR_DAY"/>
 *     &lt;enumeration value="BACK_TO_SCHOOL"/>
 *     &lt;enumeration value="HALLOWEEN"/>
 *     &lt;enumeration value="BLACK_FRIDAY"/>
 *     &lt;enumeration value="CYBER_MONDAY"/>
 *     &lt;enumeration value="CHRISTMAS"/>
 *     &lt;enumeration value="BOXING_DAY"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionExtensionOccasion")
@XmlEnum
public enum PromotionExtensionOccasion {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 New Year's.
     *               
     * 
     */
    NEW_YEARS,

    /**
     * 
     *                 Valentine's Day.
     *               
     * 
     */
    VALENTINES_DAY,

    /**
     * 
     *                 Easter.
     *               
     * 
     */
    EASTER,

    /**
     * 
     *                 Mother's Day.
     *               
     * 
     */
    MOTHERS_DAY,

    /**
     * 
     *                 Father's Day.
     *               
     * 
     */
    FATHERS_DAY,

    /**
     * 
     *                 Labor Day.
     *               
     * 
     */
    LABOR_DAY,

    /**
     * 
     *                 Back To School.
     *               
     * 
     */
    BACK_TO_SCHOOL,

    /**
     * 
     *                 Halloween.
     *               
     * 
     */
    HALLOWEEN,

    /**
     * 
     *                 Black Friday.
     *               
     * 
     */
    BLACK_FRIDAY,

    /**
     * 
     *                 Cyber Monday.
     *               
     * 
     */
    CYBER_MONDAY,

    /**
     * 
     *                 Christmas.
     *               
     * 
     */
    CHRISTMAS,

    /**
     * 
     *                 Boxing Day.
     *               
     * 
     */
    BOXING_DAY,

    /**
     * 
     *                 None is used for clearing the occasion.
     *               
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static PromotionExtensionOccasion fromValue(String v) {
        return valueOf(v);
    }

}

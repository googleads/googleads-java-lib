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
 * <p>Java class for PriceExtensionPriceUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceExtensionPriceUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="PER_HOUR"/>
 *     &lt;enumeration value="PER_DAY"/>
 *     &lt;enumeration value="PER_WEEK"/>
 *     &lt;enumeration value="PER_MONTH"/>
 *     &lt;enumeration value="PER_YEAR"/>
 *     &lt;enumeration value="PER_NIGHT"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceExtensionPriceUnit")
@XmlEnum
public enum PriceExtensionPriceUnit {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Per hour.
     *               
     * 
     */
    PER_HOUR,

    /**
     * 
     *                 Per day.
     *               
     * 
     */
    PER_DAY,

    /**
     * 
     *                 Per week.
     *               
     * 
     */
    PER_WEEK,

    /**
     * 
     *                 Per month.
     *               
     * 
     */
    PER_MONTH,

    /**
     * 
     *                 Per year.
     *               
     * 
     */
    PER_YEAR,

    /**
     * 
     *                 Per night.
     *               
     * 
     */
    PER_NIGHT,

    /**
     * 
     *                 None is used for clearing the unit.
     *               
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static PriceExtensionPriceUnit fromValue(String v) {
        return valueOf(v);
    }

}

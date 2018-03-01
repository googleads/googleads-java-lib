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
 * <p>Java class for IncomeRange.IncomeRangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncomeRange.IncomeRangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCOME_RANGE_UNDETERMINED"/>
 *     &lt;enumeration value="INCOME_RANGE_0_50"/>
 *     &lt;enumeration value="INCOME_RANGE_50_60"/>
 *     &lt;enumeration value="INCOME_RANGE_60_70"/>
 *     &lt;enumeration value="INCOME_RANGE_70_80"/>
 *     &lt;enumeration value="INCOME_RANGE_80_90"/>
 *     &lt;enumeration value="INCOME_RANGE_90_UP"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncomeRange.IncomeRangeType")
@XmlEnum
public enum IncomeRangeIncomeRangeType {


    /**
     * 
     *                 Users for which income range is undetermined.
     *               
     * 
     */
    INCOME_RANGE_UNDETERMINED,

    /**
     * 
     *                 Users in [0%, 50%) income percentile range.
     *               
     * 
     */
    INCOME_RANGE_0_50,

    /**
     * 
     *                 Users in [50%, 60%) income percentile range.
     *               
     * 
     */
    INCOME_RANGE_50_60,

    /**
     * 
     *                 Users in [60%, 70%) income percentile range.
     *               
     * 
     */
    INCOME_RANGE_60_70,

    /**
     * 
     *                 Users in [70%, 80%) income percentile range.
     *               
     * 
     */
    INCOME_RANGE_70_80,

    /**
     * 
     *                 Users in [80%, 90%) income percentile range.
     *               
     * 
     */
    INCOME_RANGE_80_90,

    /**
     * 
     *                 Users in [90%, 100%] income percentile range.
     *               
     * 
     */
    INCOME_RANGE_90_UP,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static IncomeRangeIncomeRangeType fromValue(String v) {
        return valueOf(v);
    }

}

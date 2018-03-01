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
 * <p>Java class for MultiplierError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MultiplierError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MULTIPLIER_TOO_HIGH"/>
 *     &lt;enumeration value="MULTIPLIER_TOO_LOW"/>
 *     &lt;enumeration value="TOO_MANY_FRACTIONAL_DIGITS"/>
 *     &lt;enumeration value="MULTIPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="MULTIPLIER_NOT_ALLOWED_WHEN_BASE_BID_IS_MISSING"/>
 *     &lt;enumeration value="NO_MULTIPLIER_SPECIFIED"/>
 *     &lt;enumeration value="MULTIPLIER_CAUSES_BID_TO_EXCEED_DAILY_BUDGET"/>
 *     &lt;enumeration value="MULTIPLIER_CAUSES_BID_TO_EXCEED_MONTHLY_BUDGET"/>
 *     &lt;enumeration value="MULTIPLIER_CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET"/>
 *     &lt;enumeration value="MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_ALLOWED_BID"/>
 *     &lt;enumeration value="BID_LESS_THAN_MIN_ALLOWED_BID_WITH_MULTIPLIER"/>
 *     &lt;enumeration value="MULTIPLIER_AND_BIDDING_STRATEGY_TYPE_MISMATCH"/>
 *     &lt;enumeration value="MULTIPLIER_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MultiplierError.Reason")
@XmlEnum
public enum MultiplierErrorReason {


    /**
     * 
     *                 Multiplier value is too high
     *               
     * 
     */
    MULTIPLIER_TOO_HIGH,

    /**
     * 
     *                 Multiplier value is too low
     *               
     * 
     */
    MULTIPLIER_TOO_LOW,

    /**
     * 
     *                 Too many fractional digits
     *               
     * 
     */
    TOO_MANY_FRACTIONAL_DIGITS,

    /**
     * 
     *                 A multiplier cannot be set for this bidding strategy
     *               
     * 
     */
    MULTIPLIER_NOT_ALLOWED_FOR_BIDDING_STRATEGY,

    /**
     * 
     *                 A multiplier cannot be set when there is no base bid (e.g., content max cpc)
     *               
     * 
     */
    MULTIPLIER_NOT_ALLOWED_WHEN_BASE_BID_IS_MISSING,

    /**
     * 
     *                 A bid multiplier must be specified
     *               
     * 
     */
    NO_MULTIPLIER_SPECIFIED,

    /**
     * 
     *                 Multiplier causes bid to exceed daily budget
     *               
     * 
     */
    MULTIPLIER_CAUSES_BID_TO_EXCEED_DAILY_BUDGET,

    /**
     * 
     *                 Multiplier causes bid to exceed monthly budget
     *               
     * 
     */
    MULTIPLIER_CAUSES_BID_TO_EXCEED_MONTHLY_BUDGET,

    /**
     * 
     *                 Multiplier causes bid to exceed custom budget
     *               
     * 
     */
    MULTIPLIER_CAUSES_BID_TO_EXCEED_CUSTOM_BUDGET,

    /**
     * 
     *                 Multiplier causes bid to exceed maximum allowed bid
     *               
     * 
     */
    MULTIPLIER_CAUSES_BID_TO_EXCEED_MAX_ALLOWED_BID,

    /**
     * 
     *                 Multiplier causes bid to become less than the minimum bid allowed
     *               
     * 
     */
    BID_LESS_THAN_MIN_ALLOWED_BID_WITH_MULTIPLIER,

    /**
     * 
     *                 Multiplier type (cpc vs. cpm) needs to match campaign's bidding strategy
     *               
     * 
     */
    MULTIPLIER_AND_BIDDING_STRATEGY_TYPE_MISMATCH,
    MULTIPLIER_ERROR;

    public String value() {
        return name();
    }

    public static MultiplierErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

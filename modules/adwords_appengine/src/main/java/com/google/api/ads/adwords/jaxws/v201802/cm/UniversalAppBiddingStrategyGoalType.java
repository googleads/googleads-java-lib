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
 * <p>Java class for UniversalAppBiddingStrategyGoalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UniversalAppBiddingStrategyGoalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="OPTIMIZE_FOR_INSTALL_CONVERSION_VOLUME"/>
 *     &lt;enumeration value="OPTIMIZE_FOR_IN_APP_CONVERSION_VOLUME"/>
 *     &lt;enumeration value="OPTIMIZE_FOR_TOTAL_CONVERSION_VALUE"/>
 *     &lt;enumeration value="OPTIMIZE_FOR_TARGET_IN_APP_CONVERSION"/>
 *     &lt;enumeration value="OPTIMIZE_FOR_RETURN_ON_ADVERTISING_SPEND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UniversalAppBiddingStrategyGoalType")
@XmlEnum
public enum UniversalAppBiddingStrategyGoalType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The bidding strategy of the universal app campaign should aim to maximize
     *                 installation of the app.
     *               
     * 
     */
    OPTIMIZE_FOR_INSTALL_CONVERSION_VOLUME,

    /**
     * 
     *                 The bidding strategy of the universal app campaign should aim to maximize the
     *                 selected in-app conversions' volume.
     *               
     * 
     */
    OPTIMIZE_FOR_IN_APP_CONVERSION_VOLUME,

    /**
     * 
     *                 The bidding strategy of the universal app campaign should aim to maximize all
     *                 conversions' value, i.e., install + selected in-app conversions. NOTE: This
     *                 value cannot be set by external clients, but it can be retrieved using get.
     *               
     * 
     */
    OPTIMIZE_FOR_TOTAL_CONVERSION_VALUE,

    /**
     * 
     *                 The bidding strategy of the universal app campaign should aim to maximize just
     *                 the selected in-app conversion's volume, while achieving or exceeding target
     *                 cost per in-app conversion.
     *               
     * 
     */
    OPTIMIZE_FOR_TARGET_IN_APP_CONVERSION,

    /**
     * 
     *                 The bidding strategy of the universal app campaign should aim to maximize all
     *                 conversions' value, i.e., install + selected in-app conversions while achieving
     *                 or exceeding target return on advertising spend.
     *               
     * 
     */
    OPTIMIZE_FOR_RETURN_ON_ADVERTISING_SPEND;

    public String value() {
        return name();
    }

    public static UniversalAppBiddingStrategyGoalType fromValue(String v) {
        return valueOf(v);
    }

}

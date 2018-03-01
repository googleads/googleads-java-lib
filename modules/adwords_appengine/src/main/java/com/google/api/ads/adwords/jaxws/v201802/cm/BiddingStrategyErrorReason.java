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
 * <p>Java class for BiddingStrategyError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiddingStrategyError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUPLICATE_NAME"/>
 *     &lt;enumeration value="CANNOT_CHANGE_BIDDING_STRATEGY_TYPE"/>
 *     &lt;enumeration value="CANNOT_REMOVE_ASSOCIATED_STRATEGY"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_SUPPORTED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiddingStrategyError.Reason")
@XmlEnum
public enum BiddingStrategyErrorReason {


    /**
     * 
     *                 Each bidding strategy must have a unique name.
     *               
     * 
     */
    DUPLICATE_NAME,

    /**
     * 
     *                 Bidding strategy type is immutable.
     *               
     * 
     */
    CANNOT_CHANGE_BIDDING_STRATEGY_TYPE,

    /**
     * 
     *                 Only bidding strategies not linked to campaigns, adgroups or adgroup criteria can be
     *                 removed.
     *               
     * 
     */
    CANNOT_REMOVE_ASSOCIATED_STRATEGY,

    /**
     * 
     *                 The specified bidding strategy is not supported.
     *               
     * 
     */
    BIDDING_STRATEGY_NOT_SUPPORTED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BiddingStrategyErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

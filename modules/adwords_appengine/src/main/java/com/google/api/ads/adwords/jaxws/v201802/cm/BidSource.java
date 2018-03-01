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
 * <p>Java class for BidSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADGROUP"/>
 *     &lt;enumeration value="CRITERION"/>
 *     &lt;enumeration value="ADGROUP_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="CAMPAIGN_BIDDING_STRATEGY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BidSource")
@XmlEnum
public enum BidSource {


    /**
     * 
     *                 Effective Bid is Adgroup level bid
     *               
     * 
     */
    ADGROUP,

    /**
     * 
     *                 Effective Bid is Keyword level bid
     *               
     * 
     */
    CRITERION,

    /**
     * 
     *                 Effective Bid is inherited from Adgroup Bidding Strategy
     *               
     * 
     */
    ADGROUP_BIDDING_STRATEGY,

    /**
     * 
     *                 Effective Bid is inherited from Campaign Bidding Strategy
     *               
     * 
     */
    CAMPAIGN_BIDDING_STRATEGY;

    public String value() {
        return name();
    }

    public static BidSource fromValue(String v) {
        return valueOf(v);
    }

}

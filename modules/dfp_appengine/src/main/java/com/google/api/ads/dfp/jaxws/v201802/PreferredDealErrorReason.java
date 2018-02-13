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
 * <p>Java class for PreferredDealError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreferredDealError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_PRIORITY"/>
 *     &lt;enumeration value="INVALID_RATE_TYPE"/>
 *     &lt;enumeration value="INVALID_FREQUENCY_CAPS"/>
 *     &lt;enumeration value="INVALID_ROADBLOCKING_TYPE"/>
 *     &lt;enumeration value="INVALID_DELIVERY_RATE_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreferredDealError.Reason")
@XmlEnum
public enum PreferredDealErrorReason {

    INVALID_PRIORITY,

    /**
     * 
     *                 Preferred deal {@link ProposalLineItem proposal line items} only support
     *                 {@link RateType#CPM}.
     *               
     * 
     */
    INVALID_RATE_TYPE,

    /**
     * 
     *                 Preferred deal {@link ProposalLineItem proposal line items} do not support frequency caps.
     *               
     * 
     */
    INVALID_FREQUENCY_CAPS,

    /**
     * 
     *                 Preferred deal {@link ProposalLineItem proposal line items} only support
     *                 {@link RoadblockingType#ONE_OR_MORE}.
     *               
     * 
     */
    INVALID_ROADBLOCKING_TYPE,

    /**
     * 
     *                 Preferred deal {@link ProposalLineItem proposal line items} only support
     *                 {@link DeliveryRateType#FRONTLOADED}.
     *               
     * 
     */
    INVALID_DELIVERY_RATE_TYPE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static PreferredDealErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

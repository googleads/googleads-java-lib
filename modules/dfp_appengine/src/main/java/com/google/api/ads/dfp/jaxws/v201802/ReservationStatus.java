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
 * <p>Java class for ReservationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESERVED"/>
 *     &lt;enumeration value="NOT_RESERVED"/>
 *     &lt;enumeration value="RELEASED"/>
 *     &lt;enumeration value="CHECK_LINE_ITEM_RESERVATION_STATUS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReservationStatus")
@XmlEnum
public enum ReservationStatus {


    /**
     * 
     *                 The inventory is reserved.
     *               
     * 
     */
    RESERVED,

    /**
     * 
     *                 The proposal line item's inventory is never reserved.
     *               
     * 
     */
    NOT_RESERVED,

    /**
     * 
     *                 The inventory is once reserved and now released.
     *               
     * 
     */
    RELEASED,

    /**
     * 
     *                 The reservation status of the corresponding {@link LineItem} should be used
     *                 for this {@link ProposalLineItem}.
     *               
     * 
     */
    CHECK_LINE_ITEM_RESERVATION_STATUS,

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

    public static ReservationStatus fromValue(String v) {
        return valueOf(v);
    }

}

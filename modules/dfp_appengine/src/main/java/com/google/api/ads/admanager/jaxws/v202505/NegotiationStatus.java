// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NegotiationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NegotiationStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SELLER_INITIATED"/&gt;
 *     &lt;enumeration value="BUYER_INITIATED"/&gt;
 *     &lt;enumeration value="AWAITING_SELLER_REVIEW"/&gt;
 *     &lt;enumeration value="AWAITING_BUYER_REVIEW"/&gt;
 *     &lt;enumeration value="ONLY_SELLER_ACCEPTED"/&gt;
 *     &lt;enumeration value="FINALIZED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NegotiationStatus")
@XmlEnum
public enum NegotiationStatus {


    /**
     * 
     *                 Indicates that a new {@link Proposal} has been created by the seller and has not been sent to
     *                 Marketplace yet.
     *               
     * 
     */
    SELLER_INITIATED,

    /**
     * 
     *                 Indicates that a new {@link Proposal} has been created by the buyer and is awaiting seller
     *                 action.
     *               
     * 
     */
    BUYER_INITIATED,

    /**
     * 
     *                 Indicates that a {@link Proposal} has been updated by the buyer and is awaiting seller
     *                 approval.
     *               
     * 
     */
    AWAITING_SELLER_REVIEW,

    /**
     * 
     *                 Indicates that a {@link Proposal} has been updated by the seller and is awaiting buyer
     *                 approval.
     *               
     * 
     */
    AWAITING_BUYER_REVIEW,

    /**
     * 
     *                 Indicates that the seller has accepted the {@link Proposal} and is awaiting the buyer's
     *                 acceptance.
     *               
     * 
     */
    ONLY_SELLER_ACCEPTED,

    /**
     * 
     *                 Indicates that the {@link Proposal} has been accepted by both the buyer and the seller.
     *               
     * 
     */
    FINALIZED,

    /**
     * 
     *                 Indicates that negotiations for the {@link Proposal} have been cancelled.
     *               
     * 
     */
    CANCELLED,

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

    public static NegotiationStatus fromValue(String v) {
        return valueOf(v);
    }

}

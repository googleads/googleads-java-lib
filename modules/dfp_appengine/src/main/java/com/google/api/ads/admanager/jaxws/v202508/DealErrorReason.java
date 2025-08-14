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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DealError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANNOT_ADD_LINE_ITEM_WHEN_SOLD"/&gt;
 *     &lt;enumeration value="CANNOT_ARCHIVE_LINE_ITEM_WHEN_SOLD"/&gt;
 *     &lt;enumeration value="CANNOT_ARCHIVE_PROPOSAL_WHEN_SOLD"/&gt;
 *     &lt;enumeration value="CANNOT_CHANGE_FIELD_REQUIRING_BUYER_APPROVAL"/&gt;
 *     &lt;enumeration value="CANNOT_GET_SELLER_ID"/&gt;
 *     &lt;enumeration value="CAN_ONLY_EXECUTE_IF_LOCAL_EDITS"/&gt;
 *     &lt;enumeration value="MISSING_PROPOSAL_LINE_ITEMS"/&gt;
 *     &lt;enumeration value="MISSING_ENVIRONMENT"/&gt;
 *     &lt;enumeration value="MISSING_AD_EXCHANGE_PROPERTY"/&gt;
 *     &lt;enumeration value="CANNOT_FIND_PROPOSAL_IN_MARKETPLACE"/&gt;
 *     &lt;enumeration value="CANNOT_GET_PRODUCT"/&gt;
 *     &lt;enumeration value="NEW_VERSION_FROM_BUYER"/&gt;
 *     &lt;enumeration value="PROPOSAL_OUT_OF_SYNC_WITH_MARKETPLACE"/&gt;
 *     &lt;enumeration value="NO_PROPOSAL_CHANGES_FOUND"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DealError.Reason")
@XmlEnum
public enum DealErrorReason {


    /**
     * 
     *                 Cannot add new {@link ProposalLineItem proposal line items} to a {@link Proposal} when
     *                 {@link Proposal#isSold} is {@code true}.
     *               
     * 
     */
    CANNOT_ADD_LINE_ITEM_WHEN_SOLD,

    /**
     * 
     *                 Cannot archive {@link ProposalLineItem proposal line items} from a {@link Proposal} when
     *                 {@link Proposal#isSold} is {@code true}.
     *               
     * 
     */
    CANNOT_ARCHIVE_LINE_ITEM_WHEN_SOLD,

    /**
     * 
     *                 Cannot archive a {@link Proposal} when {@link Proposal#isSold} is {@code true}.
     *               
     * 
     */
    CANNOT_ARCHIVE_PROPOSAL_WHEN_SOLD,

    /**
     * 
     *                 Cannot change a field that requires buyer approval during the current operation.
     *               
     * 
     */
    CANNOT_CHANGE_FIELD_REQUIRING_BUYER_APPROVAL,

    /**
     * 
     *                 Cannot find seller ID for the {@link Proposal}.
     *               
     * 
     */
    CANNOT_GET_SELLER_ID,

    /**
     * 
     *                 {@link Proposal} must be marked as editable by {@link EditProposalsForNegotiation} before
     *                 performing requested action.
     *               
     * 
     */
    CAN_ONLY_EXECUTE_IF_LOCAL_EDITS,

    /**
     * 
     *                 {@link Proposal} contains no {@link ProposalLineItem proposal line items}.
     *               
     * 
     */
    MISSING_PROPOSAL_LINE_ITEMS,

    /**
     * 
     *                 No environment set for {@link Proposal}.
     *               
     * 
     */
    MISSING_ENVIRONMENT,

    /**
     * 
     *                 The Ad Exchange property is not associated with the current network.
     *               
     * 
     */
    MISSING_AD_EXCHANGE_PROPERTY,

    /**
     * 
     *                 Cannot find {@link Proposal} in Marketplace.
     *               
     * 
     */
    CANNOT_FIND_PROPOSAL_IN_MARKETPLACE,

    /**
     * 
     *                 No {@link Product} exists for buyer-initiated programmatic {@link Proposal proposals}.
     *               
     * 
     */
    CANNOT_GET_PRODUCT,

    /**
     * 
     *                 A new version of the {@link Proposal} was sent from buyer, cannot execute the requested
     *                 action before performing {@link DiscardLocalVersionEdits}.
     *               
     * 
     */
    NEW_VERSION_FROM_BUYER,

    /**
     * 
     *                 A new version of the {@link Proposal} exists in Marketplace, cannot execute the requested
     *                 action before the proposal is synced to newest revision.
     *               
     * 
     */
    PROPOSAL_OUT_OF_SYNC_WITH_MARKETPLACE,

    /**
     * 
     *                 No {@link Proposal} changes were found.
     *               
     * 
     */
    NO_PROPOSAL_CHANGES_FOUND,

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

    public static DealErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for ProposalError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AD_SERVER_UNKNOWN_ERROR"/&gt;
 *     &lt;enumeration value="AD_SERVER_API_ERROR"/&gt;
 *     &lt;enumeration value="UPDATE_ADVERTISER_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UPDATE_PROPOSAL_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="CONTACT_UNSUPPORTED_FOR_ADVERTISER"/&gt;
 *     &lt;enumeration value="INVALID_CONTACT"/&gt;
 *     &lt;enumeration value="DUPLICATED_CONTACT"/&gt;
 *     &lt;enumeration value="UNACCEPTABLE_COMPANY_CREDIT_STATUS"/&gt;
 *     &lt;enumeration value="COMPANY_CREDIT_STATUS_NOT_ACTIVE"/&gt;
 *     &lt;enumeration value="PRIMARY_AGENCY_REQUIRED"/&gt;
 *     &lt;enumeration value="PRIMARY_AGENCY_NOT_UNIQUE"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_COMPANY_ASSOCIATION_TYPE_FOR_PROGRAMMATIC_PROPOSAL"/&gt;
 *     &lt;enumeration value="DUPLICATED_COMPANY_ASSOCIATION"/&gt;
 *     &lt;enumeration value="DUPLICATED_SALESPERSON"/&gt;
 *     &lt;enumeration value="DUPLICATED_SALES_PLANNER"/&gt;
 *     &lt;enumeration value="DUPLICATED_TRAFFICKER"/&gt;
 *     &lt;enumeration value="HAS_NO_UNARCHIVED_PROPOSAL_LINEITEMS"/&gt;
 *     &lt;enumeration value="DUPLICATE_TERMS_AND_CONDITIONS"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_PROPOSAL_CURRENCY_CODE"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_BUYER_CURRENCY_CODE"/&gt;
 *     &lt;enumeration value="INVALID_POC"/&gt;
 *     &lt;enumeration value="UPDATE_CURRENCY_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UPDATE_TIME_ZONE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProposalError.Reason")
@XmlEnum
public enum ProposalErrorReason {


    /**
     * 
     *                 Unknown error from ad-server
     *               
     * 
     */
    AD_SERVER_UNKNOWN_ERROR,

    /**
     * 
     *                 Ad-server reports an api error for the operation.
     *               
     * 
     */
    AD_SERVER_API_ERROR,

    /**
     * 
     *                 Advertiser cannot be updated once the proposal has been reserved.
     *               
     * 
     */
    UPDATE_ADVERTISER_NOT_ALLOWED,

    /**
     * 
     *                 Proposal cannot be updated when its status is not {@code DRAFT} or it is archived.
     *               
     * 
     */
    UPDATE_PROPOSAL_NOT_ALLOWED,

    /**
     * 
     *                 {@link Contact Contacts} are not supported for {@link Company.Type#ADVERTISER advertisers}
     *                 in a programmatic {@link Proposal}.
     *               
     * 
     */
    CONTACT_UNSUPPORTED_FOR_ADVERTISER,

    /**
     * 
     *                 Contact associated with a proposal does not belong to the specific company.
     *               
     * 
     */
    INVALID_CONTACT,

    /**
     * 
     *                 Contact associated with a proposal's advertiser or agency is duplicated.
     *               
     * 
     */
    DUPLICATED_CONTACT,

    /**
     * 
     *                 A proposal cannot be created or updated because the company
     *                 it is associated with has {@link Company#creditStatus}
     *                 that is not {@code ACTIVE} or {@code ON_HOLD}.
     *               
     * 
     */
    UNACCEPTABLE_COMPANY_CREDIT_STATUS,

    /**
     * 
     *                 Advertiser or agency associated with the proposal has {@link Company#creditStatus} that is
     *                 not {@code ACTIVE}.
     *               
     * 
     */
    COMPANY_CREDIT_STATUS_NOT_ACTIVE,

    /**
     * 
     *                 Cannot have other agencies without a primary agency.
     *               
     * 
     */
    PRIMARY_AGENCY_REQUIRED,

    /**
     * 
     *                 Cannot have more than one primary agency.
     *               
     * 
     */
    PRIMARY_AGENCY_NOT_UNIQUE,

    /**
     * 
     *                 The {@link Company} association type is not supported for programmatic
     *                 {@link Proposal proposals}.
     *               
     * 
     */
    UNSUPPORTED_COMPANY_ASSOCIATION_TYPE_FOR_PROGRAMMATIC_PROPOSAL,

    /**
     * 
     *                 Advertiser or agency associated with a proposal is duplicated.
     *               
     * 
     */
    DUPLICATED_COMPANY_ASSOCIATION,

    /**
     * 
     *                 Found duplicated primary or secondary sales person.
     *               
     * 
     */
    DUPLICATED_SALESPERSON,

    /**
     * 
     *                 Found duplicated sales planner.
     *               
     * 
     */
    DUPLICATED_SALES_PLANNER,

    /**
     * 
     *                 Found duplicated primary or secondary trafficker.
     *               
     * 
     */
    DUPLICATED_TRAFFICKER,

    /**
     * 
     *                 The proposal has no unarchived proposal line items.
     *               
     * 
     */
    HAS_NO_UNARCHIVED_PROPOSAL_LINEITEMS,

    /**
     * 
     *                 One or more of the terms and conditions being added already exists on the proposal.
     *               
     * 
     */
    DUPLICATE_TERMS_AND_CONDITIONS,

    /**
     * 
     *                 The currency code of the proposal is not supported by the current network. All supported
     *                 currencies can be found in the union of {@link Network#currencyCode} and
     *                 {@link Network#secondaryCurrencyCodes}.
     *               
     * 
     */
    UNSUPPORTED_PROPOSAL_CURRENCY_CODE,

    /**
     * 
     *                 The currency code of the proposal is not supported by the selected buyer.
     *               
     * 
     */
    UNSUPPORTED_BUYER_CURRENCY_CODE,

    /**
     * 
     *                 The POC value of the proposal is invalid.
     *               
     * 
     */
    INVALID_POC,

    /**
     * 
     *                 Currency cannot be updated once the proposal has been reserved.
     *               
     * 
     */
    UPDATE_CURRENCY_NOT_ALLOWED,

    /**
     * 
     *                 Time zone cannot be updated once the proposal has been sold.
     *               
     * 
     */
    UPDATE_TIME_ZONE_NOT_ALLOWED,

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

    public static ProposalErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

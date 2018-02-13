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
 * <p>Java class for ProposalLineItemActionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalLineItemActionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="PROPOSAL_NOT_EDITABLE"/>
 *     &lt;enumeration value="CANNOT_SELECTIVELY_ARCHIVE_PROPOSAL_LINE_ITEMS_FROM_MANDATORY_PRODUCTS"/>
 *     &lt;enumeration value="CANNOT_SELECTIVELY_UNARCHIVE_PROPOSAL_LINE_ITEMS_FROM_MANDATORY_PRODUCTS"/>
 *     &lt;enumeration value="CANNOT_UNARCHIVE_SOLD_PROGRAMMATIC_PROPOSAL_LINE_ITEM"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProposalLineItemActionError.Reason")
@XmlEnum
public enum ProposalLineItemActionErrorReason {


    /**
     * 
     *                 The operation is not applicable to the current state.
     *               
     * 
     */
    NOT_APPLICABLE,

    /**
     * 
     *                 The operation is not applicable because the containing proposal is not editable.
     *               
     * 
     */
    PROPOSAL_NOT_EDITABLE,

    /**
     * 
     *                 The archive operation is not applicable because it would cause some mandatory products
     *                 to have no unarchived proposal line items in the package.
     *               
     * 
     */
    CANNOT_SELECTIVELY_ARCHIVE_PROPOSAL_LINE_ITEMS_FROM_MANDATORY_PRODUCTS,

    /**
     * 
     *                 The unarchive operation is not applicable because it would cause some mandatory products
     *                 to have no unarchived proposal line items in the package.
     *               
     * 
     */
    CANNOT_SELECTIVELY_UNARCHIVE_PROPOSAL_LINE_ITEMS_FROM_MANDATORY_PRODUCTS,

    /**
     * 
     *                 Sold programmatic {@link ProposalLineItem} cannot be unarchived.
     *               
     * 
     */
    CANNOT_UNARCHIVE_SOLD_PROGRAMMATIC_PROPOSAL_LINE_ITEM,

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

    public static ProposalLineItemActionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

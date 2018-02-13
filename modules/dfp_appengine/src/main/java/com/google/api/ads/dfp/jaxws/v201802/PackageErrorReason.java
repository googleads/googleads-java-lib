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
 * <p>Java class for PackageError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackageError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVAILD_PRODUCT_PACKAGE"/>
 *     &lt;enumeration value="INACTIVE_RATE_CARD"/>
 *     &lt;enumeration value="PRODUCT_PACKAGE_NOT_IN_RATE_CARD"/>
 *     &lt;enumeration value="HAS_NO_UNARCHIVED_PRODUCT_PACKAGE_ITEM"/>
 *     &lt;enumeration value="NOT_SAME_RATE_CARD"/>
 *     &lt;enumeration value="NOT_SAME_RATE_CARD_PRICING_MODEL"/>
 *     &lt;enumeration value="NOT_SAME_RATE_CARD_WORKFLOW"/>
 *     &lt;enumeration value="PACKAGES_NOT_ALLOWED_IN_PROGRAMMATIC_PROPOSALS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackageError.Reason")
@XmlEnum
public enum PackageErrorReason {


    /**
     * 
     *                 Package cannot be created from an inactive or archived product package.
     *               
     * 
     */
    INVAILD_PRODUCT_PACKAGE,

    /**
     * 
     *                 The rate card is inactive.
     *               
     * 
     */
    INACTIVE_RATE_CARD,

    /**
     * 
     *                 There is no association between the product package and the rate card.
     *               
     * 
     */
    PRODUCT_PACKAGE_NOT_IN_RATE_CARD,

    /**
     * 
     *                 There are no unarchived product package items in this product package.
     *               
     * 
     */
    HAS_NO_UNARCHIVED_PRODUCT_PACKAGE_ITEM,

    /**
     * 
     *                 The package's rate card is not the same as other packages or proposal line items
     *                 in the proposal.
     *               
     * 
     */
    NOT_SAME_RATE_CARD,

    /**
     * 
     *                 The {@link RateCard} pricing model for this {@link Package} is not the same as the pricing
     *                 models for the other {@link ProposalLineItem proposalLineItems} or {@link Package packages}
     *                 in the {@link Proposal}.
     *               
     * 
     */
    NOT_SAME_RATE_CARD_PRICING_MODEL,

    /**
     * 
     *                 The {@link RateCard} workflow for this {@link Package} is not the same as the workflows for
     *                 the other {@link ProposalLineItem proposalLineItems} or {@link Package packages} in the
     *                 {@link Proposal}.
     *               
     * 
     */
    NOT_SAME_RATE_CARD_WORKFLOW,

    /**
     * 
     *                 Package cannot be created in a programmatic proposal.
     *               
     * 
     */
    PACKAGES_NOT_ALLOWED_IN_PROGRAMMATIC_PROPOSALS,

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

    public static PackageErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

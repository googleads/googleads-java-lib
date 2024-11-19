// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalLineItemMakegoodError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalLineItemMakegoodError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ORIGINAL_ALREADY_HAS_MAKEGOOD"/&gt;
 *     &lt;enumeration value="ORIGINAL_IS_MAKEGOOD"/&gt;
 *     &lt;enumeration value="ORIGINAL_NOT_YET_SOLD"/&gt;
 *     &lt;enumeration value="LINE_ITEM_IS_NOT_STANDARD"/&gt;
 *     &lt;enumeration value="LINE_ITEM_IS_NOT_CPM"/&gt;
 *     &lt;enumeration value="MAKEGOODS_NOT_SUPPORTED_FOR_COST_TYPE"/&gt;
 *     &lt;enumeration value="ORIGINAL_TOO_FAR_IN_PAST"/&gt;
 *     &lt;enumeration value="RATE_DIFFERENT_THAN_ORIGINAL"/&gt;
 *     &lt;enumeration value="UNITS_MORE_THAN_ORIGINAL"/&gt;
 *     &lt;enumeration value="MAKEGOODS_NOT_SUPPORTED_FOR_NON_DV360_BUYERS"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProposalLineItemMakegoodError.Reason")
@XmlEnum
public enum ProposalLineItemMakegoodErrorReason {


    /**
     * 
     *                 The original proposal line item for this makegood already has a makegood.
     *               
     * 
     */
    ORIGINAL_ALREADY_HAS_MAKEGOOD("ORIGINAL_ALREADY_HAS_MAKEGOOD"),

    /**
     * 
     *                 The original proposal line item for this makegood is itself a makegood.
     *               
     * 
     */
    ORIGINAL_IS_MAKEGOOD("ORIGINAL_IS_MAKEGOOD"),

    /**
     * 
     *                 The original proposal line item for this makegood has not been sold.
     *               
     * 
     */
    ORIGINAL_NOT_YET_SOLD("ORIGINAL_NOT_YET_SOLD"),

    /**
     * 
     *                 This makegood or its original is not a standard line item.
     *               
     * 
     */
    LINE_ITEM_IS_NOT_STANDARD("LINE_ITEM_IS_NOT_STANDARD"),

    /**
     * 
     *                 This makegood or its original is not a CPM line item.
     *               
     * 
     */
    LINE_ITEM_IS_NOT_CPM("LINE_ITEM_IS_NOT_CPM"),

    /**
     * 
     *                 This makegood or its original has a cost type not supported on makegoods.
     *               
     * 
     */
    MAKEGOODS_NOT_SUPPORTED_FOR_COST_TYPE("MAKEGOODS_NOT_SUPPORTED_FOR_COST_TYPE"),

    /**
     * 
     *                 The original proposal line item for this makegood is too far in the past.
     *               
     * 
     */
    ORIGINAL_TOO_FAR_IN_PAST("ORIGINAL_TOO_FAR_IN_PAST"),

    /**
     * 
     *                 This makegood has a rate that's different from the original proposal line item.
     *               
     * 
     */
    RATE_DIFFERENT_THAN_ORIGINAL("RATE_DIFFERENT_THAN_ORIGINAL"),

    /**
     * 
     *                 This makegood has an impression goal greater than the original proposal line item.
     *               
     * 
     */
    UNITS_MORE_THAN_ORIGINAL("UNITS_MORE_THAN_ORIGINAL"),

    /**
     * 
     *                 Makegoods are not supported for non-DV360 buyers.
     *               
     * 
     */
    @XmlEnumValue("MAKEGOODS_NOT_SUPPORTED_FOR_NON_DV360_BUYERS")
    MAKEGOODS_NOT_SUPPORTED_FOR_NON_DV_360_BUYERS("MAKEGOODS_NOT_SUPPORTED_FOR_NON_DV360_BUYERS"),

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    ProposalLineItemMakegoodErrorReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProposalLineItemMakegoodErrorReason fromValue(String v) {
        for (ProposalLineItemMakegoodErrorReason c: ProposalLineItemMakegoodErrorReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

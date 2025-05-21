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
 * <p>Java class for LineItemOperationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemOperationError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="NOT_APPLICABLE"/&gt;
 *     &lt;enumeration value="HAS_COMPLETED"/&gt;
 *     &lt;enumeration value="HAS_NO_ACTIVE_CREATIVES"/&gt;
 *     &lt;enumeration value="CANNOT_ACTIVATE_LEGACY_DFP_LINE_ITEM"/&gt;
 *     &lt;enumeration value="CANNOT_ACTIVATE_UNCONFIGURED_LINE_ITEM"/&gt;
 *     &lt;enumeration value="CANNOT_DELETE_DELIVERED_LINE_ITEM"/&gt;
 *     &lt;enumeration value="CANNOT_RESERVE_COMPANY_CREDIT_STATUS_NOT_ACTIVE"/&gt;
 *     &lt;enumeration value="CANNOT_ACTIVATE_INVALID_COMPANY_CREDIT_STATUS"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LineItemOperationError.Reason")
@XmlEnum
public enum LineItemOperationErrorReason {


    /**
     * 
     *                 The operation is not allowed due to lack of permissions.
     *               
     * 
     */
    NOT_ALLOWED,

    /**
     * 
     *                 The operation is not applicable for the current state of the
     *                 {@link LineItem}.
     *               
     * 
     */
    NOT_APPLICABLE,

    /**
     * 
     *                 The {@link LineItem} is completed. A {@link LineItemAction} cannot
     *                 be applied to a line item that is completed.
     *               
     * 
     */
    HAS_COMPLETED,

    /**
     * 
     *                 The {@link LineItem} has no active creatives. A line item cannot be
     *                 activated with no active creatives.
     *               
     * 
     */
    HAS_NO_ACTIVE_CREATIVES,

    /**
     * 
     *                 A {@link LineItem} of type {@link LineItemType#LEGACY_DFP} cannot be
     *                 Activated.
     *               
     * 
     */
    CANNOT_ACTIVATE_LEGACY_DFP_LINE_ITEM,

    /**
     * 
     *                 A {@link LineItem} with publisher creative source cannot be activated if the corresponding
     *                 deal is not yet configured by the buyer.
     *               
     * 
     */
    CANNOT_ACTIVATE_UNCONFIGURED_LINE_ITEM,

    /**
     * 
     *                 Deleting an {@link LineItem} that has delivered is not allowed
     *               
     * 
     */
    CANNOT_DELETE_DELIVERED_LINE_ITEM,

    /**
     * 
     *                 Reservation cannot be made for line item because the
     *                 {@link LineItem#advertiserId} it is associated with has
     *                 {@link Company#creditStatus} that is not {@code ACTIVE}
     *                 or {@code ON_HOLD}.
     *               
     * 
     */
    CANNOT_RESERVE_COMPANY_CREDIT_STATUS_NOT_ACTIVE,

    /**
     * 
     *                 Cannot activate line item  because the {@link LineItem#advertiserId}
     *                 it is associated with has {@link Company#creditStatus} that is not
     *                 {@code ACTIVE}, {@code INACTIVE}, or {@code ON_HOLD}.
     *               
     * 
     */
    CANNOT_ACTIVATE_INVALID_COMPANY_CREDIT_STATUS,

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

    public static LineItemOperationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

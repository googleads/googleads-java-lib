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


package com.google.api.ads.admanager.jaxws.v202502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderActionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderActionError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PERMISSION_DENIED"/&gt;
 *     &lt;enumeration value="NOT_APPLICABLE"/&gt;
 *     &lt;enumeration value="IS_ARCHIVED"/&gt;
 *     &lt;enumeration value="HAS_ENDED"/&gt;
 *     &lt;enumeration value="CANNOT_APPROVE_WITH_UNRESERVED_LINE_ITEMS"/&gt;
 *     &lt;enumeration value="CANNOT_DELETE_ORDER_WITH_DELIVERED_LINEITEMS"/&gt;
 *     &lt;enumeration value="CANNOT_APPROVE_COMPANY_CREDIT_STATUS_NOT_ACTIVE"/&gt;
 *     &lt;enumeration value="CANNOT_UPDATE_ORDER_OVER_LINE_ITEM_LIMIT"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderActionError.Reason")
@XmlEnum
public enum OrderActionErrorReason {


    /**
     * 
     *                 The operation is not allowed due to lack of permissions.
     *               
     * 
     */
    PERMISSION_DENIED,

    /**
     * 
     *                 The operation is not applicable for the current state of the
     *                 {@link Order}.
     *               
     * 
     */
    NOT_APPLICABLE,

    /**
     * 
     *                 The {@link Order} is archived, an {@link OrderAction} cannot be applied
     *                 to an archived order.
     *               
     * 
     */
    IS_ARCHIVED,

    /**
     * 
     *                 The {@link Order} is past its end date, An {@link OrderAction} cannot
     *                 be applied to a order that has ended.
     *               
     * 
     */
    HAS_ENDED,

    /**
     * 
     *                 A {@link Order} cannot be approved if it contains reservable
     *                 {@link LineItem}s that are unreserved.
     *               
     * 
     */
    CANNOT_APPROVE_WITH_UNRESERVED_LINE_ITEMS,

    /**
     * 
     *                 Deleting an {@link Order} with delivered line items is not allowed
     *               
     * 
     */
    CANNOT_DELETE_ORDER_WITH_DELIVERED_LINEITEMS,

    /**
     * 
     *                 Cannot approve because company credit status is not active.
     *               
     * 
     */
    CANNOT_APPROVE_COMPANY_CREDIT_STATUS_NOT_ACTIVE,

    /**
     * 
     *                 Cannot update (archive, pause, resume) an {@link Order} because it has more than the allowed
     *                 number of {@link LineItem}s.
     *               
     * 
     */
    CANNOT_UPDATE_ORDER_OVER_LINE_ITEM_LIMIT,

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

    public static OrderActionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

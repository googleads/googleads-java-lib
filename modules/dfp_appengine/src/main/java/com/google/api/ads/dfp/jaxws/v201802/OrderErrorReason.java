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
 * <p>Java class for OrderError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UPDATE_CANCELED_ORDER_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_PENDING_APPROVAL_ORDER_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_ARCHIVED_ORDER_NOT_ALLOWED"/>
 *     &lt;enumeration value="CANNOT_MODIFY_PROPOSAL_ID"/>
 *     &lt;enumeration value="PRIMARY_USER_REQUIRED"/>
 *     &lt;enumeration value="PRIMARY_USER_CANNOT_BE_SECONDARY"/>
 *     &lt;enumeration value="ORDER_TEAM_NOT_ASSOCIATED_WITH_ADVERTISER"/>
 *     &lt;enumeration value="USER_NOT_ON_ORDERS_TEAMS"/>
 *     &lt;enumeration value="AGENCY_NOT_ON_ORDERS_TEAMS"/>
 *     &lt;enumeration value="INVALID_FIELDS_SET_FOR_NON_PROGRAMMATIC_ORDER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderError.Reason")
@XmlEnum
public enum OrderErrorReason {


    /**
     * 
     *                 Updating a canceled order is not allowed.
     *               
     * 
     */
    UPDATE_CANCELED_ORDER_NOT_ALLOWED,

    /**
     * 
     *                 Updating an order that has its approval pending is not allowed.
     *               
     * 
     */
    UPDATE_PENDING_APPROVAL_ORDER_NOT_ALLOWED,

    /**
     * 
     *                 Updating an archived order is not allowed.
     *               
     * 
     */
    UPDATE_ARCHIVED_ORDER_NOT_ALLOWED,

    /**
     * 
     *                 DSM can set the proposal ID only at the time of creation of order.
     *                 Setting or changing proposal ID at the time of order update is not
     *                 allowed.
     *               
     * 
     */
    CANNOT_MODIFY_PROPOSAL_ID,

    /**
     * 
     *                 Cannot have secondary user without a primary user.
     *               
     * 
     */
    PRIMARY_USER_REQUIRED,

    /**
     * 
     *                 Primary user cannot be added as a secondary user too.
     *               
     * 
     */
    PRIMARY_USER_CANNOT_BE_SECONDARY,

    /**
     * 
     *                 A team associated with the order must also be associated with the
     *                 advertiser.
     *               
     * 
     */
    ORDER_TEAM_NOT_ASSOCIATED_WITH_ADVERTISER,

    /**
     * 
     *                 The user assigned to the order, like salesperson or trafficker, must
     *                 be on one of the order's teams.
     *               
     * 
     */
    USER_NOT_ON_ORDERS_TEAMS,

    /**
     * 
     *                 The agency assigned to the order must belong to one of the order's teams.
     *               
     * 
     */
    AGENCY_NOT_ON_ORDERS_TEAMS,

    /**
     * 
     *                 Programmatic info fields should not be set for a non-programmatic order.
     *               
     * 
     */
    INVALID_FIELDS_SET_FOR_NON_PROGRAMMATIC_ORDER,

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

    public static OrderErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

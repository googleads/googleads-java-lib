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
 * <p>Java class for McmError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="McmError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="REVENUE_SHARE_PERCENT_OUTSIDE_RANGE"/&gt;
 *     &lt;enumeration value="RESELLER_PARENT_REVENUE_SHARE_IS_NOT_100_PERCENT"/&gt;
 *     &lt;enumeration value="MI_PARENT_REVENUE_SHARE_IS_NOT_100_PERCENT"/&gt;
 *     &lt;enumeration value="DUPLICATE_CHILD_PUBLISHER_NETWORK_CODE"/&gt;
 *     &lt;enumeration value="DUPLICATE_CHILD_PUBLISHER_ACTIVE_EMAIL"/&gt;
 *     &lt;enumeration value="CHILD_NETWORK_DISAPPROVED"/&gt;
 *     &lt;enumeration value="MANAGE_INVENTORY_UNSUPPORTED_IN_RESELLER_NETWORK"/&gt;
 *     &lt;enumeration value="CANNOT_SEND_INVITATION_TO_MCM_PARENT"/&gt;
 *     &lt;enumeration value="CANNOT_SEND_INVITATION_TO_NETWORK_WITH_RESELLER_PARENT"/&gt;
 *     &lt;enumeration value="CANNOT_SEND_INVITATION_TO_SELF"/&gt;
 *     &lt;enumeration value="CANNOT_CLOSE_MCM_WITH_ACTIVE_CHILDREN"/&gt;
 *     &lt;enumeration value="CANNOT_TURN_CHILD_INTO_PARENT_WITH_ACTIVE_INVITATION"/&gt;
 *     &lt;enumeration value="MISSING_NETWORK_EXCHANGE_ACCOUNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "McmError.Reason")
@XmlEnum
public enum McmErrorReason {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 An MCM parent revenue share must be between 0 to 100_000L in millis.
     *               
     * 
     */
    REVENUE_SHARE_PERCENT_OUTSIDE_RANGE,

    /**
     * 
     *                 An MCM reseller parent revenue share must be 100_000L in millis.
     *               
     * 
     */
    RESELLER_PARENT_REVENUE_SHARE_IS_NOT_100_PERCENT,

    /**
     * 
     *                 An MCM Manage Inventory parent revenue share must be 100_000L in millis.
     *               
     * 
     */
    MI_PARENT_REVENUE_SHARE_IS_NOT_100_PERCENT,

    /**
     * 
     *                 The network code is used by another child publisher.
     *               
     * 
     */
    DUPLICATE_CHILD_PUBLISHER_NETWORK_CODE,

    /**
     * 
     *                 The email is used by another active child publisher.
     *               
     * 
     */
    DUPLICATE_CHILD_PUBLISHER_ACTIVE_EMAIL,

    /**
     * 
     *                 The MCM child network has been disapproved by Google.
     *               
     * 
     */
    CHILD_NETWORK_DISAPPROVED,

    /**
     * 
     *                 Manage inventory is not supported in reseller network.
     *               
     * 
     */
    MANAGE_INVENTORY_UNSUPPORTED_IN_RESELLER_NETWORK,

    /**
     * 
     *                 Cannot send MCM invitation to a MCM parent.
     *               
     * 
     */
    CANNOT_SEND_INVITATION_TO_MCM_PARENT,

    /**
     * 
     *                 A non-reseller MCM parent cannot send invitation to child which has another reseller parent.
     *               
     * 
     */
    CANNOT_SEND_INVITATION_TO_NETWORK_WITH_RESELLER_PARENT,

    /**
     * 
     *                 Cannot send MCM invitation to self.
     *               
     * 
     */
    CANNOT_SEND_INVITATION_TO_SELF,

    /**
     * 
     *                 An MCM parent network cannot be disabled as parent with active children.
     *               
     * 
     */
    CANNOT_CLOSE_MCM_WITH_ACTIVE_CHILDREN,

    /**
     * 
     *                 Cannot turn on MCM feature flag on a MCM Child network with active invitations.
     *               
     * 
     */
    CANNOT_TURN_CHILD_INTO_PARENT_WITH_ACTIVE_INVITATION,

    /**
     * 
     *                 An Ad Exchange account is required for an MCM parent network.
     *               
     * 
     */
    MISSING_NETWORK_EXCHANGE_ACCOUNT;

    public String value() {
        return name();
    }

    public static McmErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

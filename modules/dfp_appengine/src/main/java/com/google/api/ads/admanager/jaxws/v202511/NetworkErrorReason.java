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


package com.google.api.ads.admanager.jaxws.v202511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="MULTI_CURRENCY_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_CURRENCY"/&gt;
 *     &lt;enumeration value="NETWORK_CURRENCY_CANNOT_BE_SAME_AS_SECONDARY"/&gt;
 *     &lt;enumeration value="DEPRECATED_DATA_TRANSFER_CONFIG_EVENT_TYPE"/&gt;
 *     &lt;enumeration value="DELEGATION_CHILD_NETWORK_CANNOT_BECOME_A_PARENT"/&gt;
 *     &lt;enumeration value="DELEGATION_PARENT_NETWORK_CANNOT_BECOME_A_CHILD"/&gt;
 *     &lt;enumeration value="CANNOT_ADD_SAME_NETWORK_AS_DELEGATION_CHILD"/&gt;
 *     &lt;enumeration value="MAX_APPROVED_DELEGATION_CHILD_NETWORKS_EXCEEDED"/&gt;
 *     &lt;enumeration value="MAX_PENDING_DELEGATION_CHILD_NETWORKS_EXCEEDED"/&gt;
 *     &lt;enumeration value="CHILD_NETWORK_ALREADY_EXISTS"/&gt;
 *     &lt;enumeration value="CHILD_NETWORK_CANNOT_BE_DISAPPROVED"/&gt;
 *     &lt;enumeration value="IN_PARENT_DELEGATION_UNSUPPORTED_FOR_NETWORK"/&gt;
 *     &lt;enumeration value="ERROR_REENABLING_AD_EXCHANGE_ON_MCM_CHILD"/&gt;
 *     &lt;enumeration value="ERROR_SETTING_SITE_SERVING_MODE_ON_MCM_CHILD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkError.Reason")
@XmlEnum
public enum NetworkErrorReason {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Multi-currency support is not enabled for this network. This is an Ad Manager 360 feature.
     *               
     * 
     */
    MULTI_CURRENCY_NOT_SUPPORTED,

    /**
     * 
     *                 Currency provided is not supported.
     *               
     * 
     */
    UNSUPPORTED_CURRENCY,

    /**
     * 
     *                 The network currency cannot also be specified as a secondary currency.
     *               
     * 
     */
    NETWORK_CURRENCY_CANNOT_BE_SAME_AS_SECONDARY,

    /**
     * 
     *                 The data transfer config cannot have a deprecated event type.
     *               
     * 
     */
    DEPRECATED_DATA_TRANSFER_CONFIG_EVENT_TYPE,

    /**
     * 
     *                 An MCM child network cannot become a parent network.
     *               
     * 
     */
    DELEGATION_CHILD_NETWORK_CANNOT_BECOME_A_PARENT,

    /**
     * 
     *                 An MCM parent network cannot become a child of another network.
     *               
     * 
     */
    DELEGATION_PARENT_NETWORK_CANNOT_BECOME_A_CHILD,

    /**
     * 
     *                 In MCM, a network cannot become a parent of itself.
     *               
     * 
     */
    CANNOT_ADD_SAME_NETWORK_AS_DELEGATION_CHILD,

    /**
     * 
     *                 The MCM parent network has exceeded the system limit of child networks.
     *               
     * 
     */
    MAX_APPROVED_DELEGATION_CHILD_NETWORKS_EXCEEDED,

    /**
     * 
     *                 The MCM parent network has exceeded the system limit of child networks pending approval.
     *               
     * 
     */
    MAX_PENDING_DELEGATION_CHILD_NETWORKS_EXCEEDED,

    /**
     * 
     *                 The network is already being managed by the parent network for MCM.
     *               
     * 
     */
    CHILD_NETWORK_ALREADY_EXISTS,

    /**
     * 
     *                 A child network must not be disapproved.
     *               
     * 
     */
    CHILD_NETWORK_CANNOT_BE_DISAPPROVED,

    /**
     * 
     *                 Only Ad Manager 360 networks are allowed to manage the inventory of other networks.
     *               
     * 
     */
    IN_PARENT_DELEGATION_UNSUPPORTED_FOR_NETWORK,

    /**
     * 
     *                 When an MCM child network self-signsup for ad exchange but disconnects from the parent, then
     *                 tries to re-enable again, this indicates that there was an error in re-enabling ad exchange.
     *               
     * 
     */
    ERROR_REENABLING_AD_EXCHANGE_ON_MCM_CHILD,

    /**
     * 
     *                 The error shown when there is an issue setting the approved site serving field when
     *                 re-enabling or disabling ad exchange on an MCM child.
     *               
     * 
     */
    ERROR_SETTING_SITE_SERVING_MODE_ON_MCM_CHILD;

    public String value() {
        return name();
    }

    public static NetworkErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

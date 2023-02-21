// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="MULTI_CURRENCY_NOT_SUPPORTED"/>
 *     &lt;enumeration value="UNSUPPORTED_CURRENCY"/>
 *     &lt;enumeration value="NETWORK_CURRENCY_CANNOT_BE_SAME_AS_SECONDARY"/>
 *     &lt;enumeration value="CANNOT_DELETE_CURRENCY_WITH_ACTIVE_RATE_CARDS"/>
 *     &lt;enumeration value="DELEGATION_CHILD_NETWORK_CANNOT_BECOME_A_PARENT"/>
 *     &lt;enumeration value="DELEGATION_PARENT_NETWORK_CANNOT_BECOME_A_CHILD"/>
 *     &lt;enumeration value="CANNOT_ADD_SAME_NETWORK_AS_DELEGATION_CHILD"/>
 *     &lt;enumeration value="MAX_APPROVED_DELEGATION_CHILD_NETWORKS_EXCEEDED"/>
 *     &lt;enumeration value="MAX_PENDING_DELEGATION_CHILD_NETWORKS_EXCEEDED"/>
 *     &lt;enumeration value="CHILD_NETWORK_ALREADY_EXISTS"/>
 *     &lt;enumeration value="CHILD_NETWORK_CANNOT_BE_DISAPPROVED"/>
 *     &lt;enumeration value="IN_PARENT_DELEGATION_UNSUPPORTED_FOR_NETWORK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
     *                 The currency cannot be deleted as it is still being used by active rate cards.
     *               
     * 
     */
    CANNOT_DELETE_CURRENCY_WITH_ACTIVE_RATE_CARDS,

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
    IN_PARENT_DELEGATION_UNSUPPORTED_FOR_NETWORK;

    public String value() {
        return name();
    }

    public static NetworkErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

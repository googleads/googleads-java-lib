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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DRAFT"/&gt;
 *     &lt;enumeration value="PENDING_APPROVAL"/&gt;
 *     &lt;enumeration value="APPROVED"/&gt;
 *     &lt;enumeration value="DISAPPROVED"/&gt;
 *     &lt;enumeration value="PAUSED"/&gt;
 *     &lt;enumeration value="CANCELED"/&gt;
 *     &lt;enumeration value="DELETED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus")
@XmlEnum
public enum OrderStatus {


    /**
     * 
     *                 Indicates that the {@link Order} has just been created but no approval has
     *                 been requested yet.
     *               
     * 
     */
    DRAFT,

    /**
     * 
     *                 Indicates that a request for approval for the {@link Order} has been made.
     *               
     * 
     */
    PENDING_APPROVAL,

    /**
     * 
     *                 Indicates that the {@link Order} has been approved and is ready to serve.
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 Indicates that the {@link Order} has been disapproved and is not eligible
     *                 to serve.
     *               
     * 
     */
    DISAPPROVED,

    /**
     * 
     *                 This is a legacy state.  Paused status should be checked on {@link LineItems}s within the
     *                 order.
     *               
     * 
     */
    PAUSED,

    /**
     * 
     *                 Indicates that the {@link Order} has been canceled and cannot serve.
     *               
     * 
     */
    CANCELED,

    /**
     * 
     *                 Indicates that the {@link Order} has been deleted by DSM.
     *               
     * 
     */
    DELETED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static OrderStatus fromValue(String v) {
        return valueOf(v);
    }

}

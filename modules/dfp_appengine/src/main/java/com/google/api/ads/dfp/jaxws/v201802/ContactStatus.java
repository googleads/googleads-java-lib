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
 * <p>Java class for Contact.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Contact.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNINVITED"/>
 *     &lt;enumeration value="INVITE_PENDNG"/>
 *     &lt;enumeration value="INVITE_EXPIRED"/>
 *     &lt;enumeration value="INVITE_CANCELED"/>
 *     &lt;enumeration value="USER_ACTIVE"/>
 *     &lt;enumeration value="USER_DISABLED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Contact.Status")
@XmlEnum
public enum ContactStatus {


    /**
     * 
     *                 The contact has not been invited to see their orders.
     *               
     * 
     */
    UNINVITED,

    /**
     * 
     *                 The contact has been invited to see their orders, but has not yet
     *                 accepted the invitation.
     *               
     * 
     */
    INVITE_PENDNG,

    /**
     * 
     *                 The contact has been invited to see their orders, but the invitation
     *                 has already expired.
     *               
     * 
     */
    INVITE_EXPIRED,

    /**
     * 
     *                 The contact was invited to see their orders, but the invitation was
     *                 cancelled.
     *               
     * 
     */
    INVITE_CANCELED,

    /**
     * 
     *                 The contact has access to login and view their orders.
     *               
     * 
     */
    USER_ACTIVE,

    /**
     * 
     *                 The contact accepted an invitation to see their orders, but their
     *                 access was later revoked.
     *               
     * 
     */
    USER_DISABLED,

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

    public static ContactStatus fromValue(String v) {
        return valueOf(v);
    }

}

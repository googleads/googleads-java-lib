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
 * <p>Java class for InvitationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvitationStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="ACCEPTED"/&gt;
 *     &lt;enumeration value="EXPIRED"/&gt;
 *     &lt;enumeration value="PENDING"/&gt;
 *     &lt;enumeration value="REJECTED"/&gt;
 *     &lt;enumeration value="WITHDRAWN"/&gt;
 *     &lt;enumeration value="DEACTIVATED_BY_AD_MANAGER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvitationStatus")
@XmlEnum
public enum InvitationStatus {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The association request from the parent network has been accepted by the child network.
     *               
     * 
     */
    ACCEPTED,

    /**
     * 
     *                 The invitation has expired. An invitation is valid for 90 days. Expired invitations can be
     *                 resent.
     *               
     * 
     */
    EXPIRED,

    /**
     * 
     *                 The child publisher has not acted on the invite from the parent.
     *               
     * 
     */
    PENDING,

    /**
     * 
     *                 The child publisher has declined the invite.
     *               
     * 
     */
    REJECTED,

    /**
     * 
     *                 The parent network withdrew the invite.
     *               
     * 
     */
    WITHDRAWN,

    /**
     * 
     *                 The invitation was disapproved by Google.
     *               
     * 
     */
    DEACTIVATED_BY_AD_MANAGER;

    public String value() {
        return name();
    }

    public static InvitationStatus fromValue(String v) {
        return valueOf(v);
    }

}

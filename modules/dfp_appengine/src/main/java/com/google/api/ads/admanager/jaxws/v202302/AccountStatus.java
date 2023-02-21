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
 * <p>Java class for AccountStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="INVITED"/>
 *     &lt;enumeration value="DECLINED"/>
 *     &lt;enumeration value="PENDING_GOOGLE_APPROVAL"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="CLOSED_POLICY_VIOLATION"/>
 *     &lt;enumeration value="CLOSED_INVALID_ACTIVITY"/>
 *     &lt;enumeration value="CLOSED_BY_PUBLISHER"/>
 *     &lt;enumeration value="DISAPPROVED_INELIGIBLE"/>
 *     &lt;enumeration value="DISAPPROVED_DUPLICATE_ACCOUNT"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="DEACTIVATED_BY_AD_MANAGER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountStatus")
@XmlEnum
public enum AccountStatus {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The child publisher has not acted on the invite from the parent.
     *               
     * 
     */
    INVITED,

    /**
     * 
     *                 The child publisher has declined the invite.
     *               
     * 
     */
    DECLINED,

    /**
     * 
     *                 The child publisher has accepted the invite, and is awaiting Google's policy compliance
     *                 verifications.
     *               
     * 
     */
    PENDING_GOOGLE_APPROVAL,

    /**
     * 
     *                 The child publisher accepted the invite, and Google found it to be compliant with its policies,
     *                 i.e. no policy violations were found, and the child publisher can be served ads.
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 The child publisher accepted the invite, but was disapproved by Google for violating its
     *                 policies.
     *               
     * 
     */
    CLOSED_POLICY_VIOLATION,

    /**
     * 
     *                 The child publisher accepted the invite, but was disapproved by Google for invalid activity.
     *               
     * 
     */
    CLOSED_INVALID_ACTIVITY,

    /**
     * 
     *                 The child publisher has closed their own account.
     *               
     * 
     */
    CLOSED_BY_PUBLISHER,

    /**
     * 
     *                 The child publisher accepted the invite, but was disapproved as ineligible by Google.
     *               
     * 
     */
    DISAPPROVED_INELIGIBLE,

    /**
     * 
     *                 The child publisher accepted the invite, but was disapproved by Google for being a duplicate of
     *                 another account.
     *               
     * 
     */
    DISAPPROVED_DUPLICATE_ACCOUNT,

    /**
     * 
     *                 The invite was sent to the child publisher more than 90 days ago, due to which it has been
     *                 deactivated.
     *               
     * 
     */
    EXPIRED,

    /**
     * 
     *                 Either the child publisher disconnected from the parent network, or the parent network withdrew
     *                 the invite.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 The association between the parent and child publishers was deactivated by Google Ad Manager.
     *               
     * 
     */
    DEACTIVATED_BY_AD_MANAGER;

    public String value() {
        return name();
    }

    public static AccountStatus fromValue(String v) {
        return valueOf(v);
    }

}

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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaCheckError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotaCheckError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_TOKEN_HEADER"/>
 *     &lt;enumeration value="ACCOUNT_DELINQUENT"/>
 *     &lt;enumeration value="ACCOUNT_INACCESSIBLE"/>
 *     &lt;enumeration value="ACCOUNT_INACTIVE"/>
 *     &lt;enumeration value="INCOMPLETE_SIGNUP"/>
 *     &lt;enumeration value="DEVELOPER_TOKEN_NOT_APPROVED"/>
 *     &lt;enumeration value="TERMS_AND_CONDITIONS_NOT_SIGNED"/>
 *     &lt;enumeration value="MONTHLY_BUDGET_REACHED"/>
 *     &lt;enumeration value="QUOTA_EXCEEDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuotaCheckError.Reason")
@XmlEnum
public enum QuotaCheckErrorReason {


    /**
     * 
     *                 Customer passed in an invalid token in the header.
     *               
     * 
     */
    INVALID_TOKEN_HEADER,

    /**
     * 
     *                 Customer is marked delinquent.
     *               
     * 
     */
    ACCOUNT_DELINQUENT,

    /**
     * 
     *                 Customer is a fraudulent.
     *               
     * 
     */
    ACCOUNT_INACCESSIBLE,

    /**
     * 
     *                 Inactive Account.
     *               
     * 
     */
    ACCOUNT_INACTIVE,

    /**
     * 
     *                 Signup not complete
     *               
     * 
     */
    INCOMPLETE_SIGNUP,

    /**
     * 
     *                 Developer token is not approved for production access, and the customer
     *                 is attempting to access a production account.
     *               
     * 
     */
    DEVELOPER_TOKEN_NOT_APPROVED,

    /**
     * 
     *                 Terms and conditions are not signed.
     *               
     * 
     */
    TERMS_AND_CONDITIONS_NOT_SIGNED,

    /**
     * 
     *                 Monthly budget quota reached.
     *               
     * 
     */
    MONTHLY_BUDGET_REACHED,

    /**
     * 
     *                 Monthly budget quota exceeded.
     *               
     * 
     */
    QUOTA_EXCEEDED;

    public String value() {
        return name();
    }

    public static QuotaCheckErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

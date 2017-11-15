// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyCreditStatusError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyCreditStatusError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPANY_CREDIT_STATUS_CHANGE_NOT_ALLOWED"/>
 *     &lt;enumeration value="CANNOT_USE_CREDIT_STATUS_SETTING"/>
 *     &lt;enumeration value="CANNOT_USE_ADVANCED_CREDIT_STATUS_SETTING"/>
 *     &lt;enumeration value="UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_ORDER"/>
 *     &lt;enumeration value="UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_LINE_ITEM"/>
 *     &lt;enumeration value="CANNOT_BLOCK_COMPANY_TOO_MANY_APPROVED_ORDERS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanyCreditStatusError.Reason")
@XmlEnum
public enum CompanyCreditStatusErrorReason {


    /**
     * 
     *                 The user's role does not have permission to change
     *                 {@link Company#creditStatus} from the default value. The default value is
     *                 {@link Company.CreditStatus#ACTIVE} for the Basic credit status setting
     *                 and {@link Company.CreditStatus#ON_HOLD} for the Advanced credit status
     *                 setting.
     *               
     * 
     */
    COMPANY_CREDIT_STATUS_CHANGE_NOT_ALLOWED,

    /**
     * 
     *                 The network has not been enabled for editing credit status settings for
     *                 companies.
     *               
     * 
     */
    CANNOT_USE_CREDIT_STATUS_SETTING,

    /**
     * 
     *                 The network has not been enabled for the Advanced credit status
     *                 settings for companies. {@link Company#creditStatus} must be either
     *                 {@code ACTIVE} or {@code INACTIVE}.
     *               
     * 
     */
    CANNOT_USE_ADVANCED_CREDIT_STATUS_SETTING,

    /**
     * 
     *                 An order cannot be created or updated because the
     *                 {@link Order#advertiserId} or the {@link Order#agencyId} it is associated
     *                 with has {@link Company#creditStatus} that is not {@code ACTIVE} or
     *                 {@code ON_HOLD}.
     *               
     * 
     */
    UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_ORDER,

    /**
     * 
     *                 A line item cannot be created for the order because the
     *                 {@link Order#advertiserId} or {Order#agencyId} it is associated with has
     *                 {@link Company#creditStatus} that is not {@code ACTIVE} or
     *                 {@code ON_HOLD}.
     *               
     * 
     */
    UNACCEPTABLE_COMPANY_CREDIT_STATUS_FOR_LINE_ITEM,

    /**
     * 
     *                 The company cannot be blocked because there are more than 200 approved
     *                 orders of the company. Archive some, so that there are less than 200 of
     *                 them.
     *               
     * 
     */
    CANNOT_BLOCK_COMPANY_TOO_MANY_APPROVED_ORDERS,

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

    public static CompanyCreditStatusErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

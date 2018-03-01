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


package com.google.api.ads.adwords.jaxws.v201802.billing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetOrderError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BudgetOrderError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUDGET_APPROVAL_IN_PROGRESS"/>
 *     &lt;enumeration value="SERVICE_UNAVAILABLE"/>
 *     &lt;enumeration value="INVALID_BILLING_ACCOUNT"/>
 *     &lt;enumeration value="GENERIC_BILLING_ERROR"/>
 *     &lt;enumeration value="INVALID_BILLING_ACCOUNT_ID_FORMAT"/>
 *     &lt;enumeration value="INVALID_BUDGET_DATE_RANGE"/>
 *     &lt;enumeration value="BUDGET_UPDATE_DENIED"/>
 *     &lt;enumeration value="BUDGET_ALREADY_STARTED"/>
 *     &lt;enumeration value="BUDGET_ALREADY_ENDED"/>
 *     &lt;enumeration value="INVALID_CONSTRAINT"/>
 *     &lt;enumeration value="INVALID_BID_TOO_LARGE"/>
 *     &lt;enumeration value="NO_SUCH_BUDGET_FOUND"/>
 *     &lt;enumeration value="INVALID_BUDGET_ALREADY_SPENT"/>
 *     &lt;enumeration value="INVALID_TIMEZONE_IN_DATE"/>
 *     &lt;enumeration value="ACCOUNT_BUDGET_ID_SET_IN_ADD"/>
 *     &lt;enumeration value="MORE_THAN_ONE_OPERATIONS"/>
 *     &lt;enumeration value="INVALID_MANAGER_ACCOUNT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BudgetOrderError.Reason")
@XmlEnum
public enum BudgetOrderErrorReason {


    /**
     * 
     *                 Existing pending request is being approved.
     *               
     * 
     */
    BUDGET_APPROVAL_IN_PROGRESS,

    /**
     * 
     *                 A server backend was not available.
     *               
     * 
     */
    SERVICE_UNAVAILABLE,

    /**
     * 
     *                 The billing account was invalid.
     *               
     * 
     */
    INVALID_BILLING_ACCOUNT,

    /**
     * 
     *                 Unspecified billing service error.
     *               
     * 
     */
    GENERIC_BILLING_ERROR,

    /**
     * 
     *                 The billing account ID format was invalid.
     *               
     * 
     */
    INVALID_BILLING_ACCOUNT_ID_FORMAT,

    /**
     * 
     *                 Budget date range was invalid.
     *               
     * 
     */
    INVALID_BUDGET_DATE_RANGE,

    /**
     * 
     *                 User does not have permission to update this budget.
     *               
     * 
     */
    BUDGET_UPDATE_DENIED,

    /**
     * 
     *                 User attempted to cancel a started budget.
     *               
     * 
     */
    BUDGET_ALREADY_STARTED,

    /**
     * 
     *                 User attempted to change an ended budget.
     *               
     * 
     */
    BUDGET_ALREADY_ENDED,

    /**
     * 
     *                 Invalid amount, start date or end date specified.
     *               
     * 
     */
    INVALID_CONSTRAINT,

    /**
     * 
     *                 The bid is too high.
     *               
     * 
     */
    INVALID_BID_TOO_LARGE,

    /**
     * 
     *                 Budget was not found.
     *               
     * 
     */
    NO_SUCH_BUDGET_FOUND,

    /**
     * 
     *                 The budget cannot be lowered below the amount which has already been spent.
     *               
     * 
     */
    INVALID_BUDGET_ALREADY_SPENT,

    /**
     * 
     *                 Time zone from user input is different from user's account time zone.
     *               
     * 
     */
    INVALID_TIMEZONE_IN_DATE,

    /**
     * 
     *                 The BudgetOrder's ID was set in an add operation.
     *               
     * 
     */
    ACCOUNT_BUDGET_ID_SET_IN_ADD,

    /**
     * 
     *                 We don't support more than one operation per mutate call.
     *               
     * 
     */
    MORE_THAN_ONE_OPERATIONS,

    /**
     * 
     *                 Manager account not found.
     *               
     * 
     */
    INVALID_MANAGER_ACCOUNT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BudgetOrderErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

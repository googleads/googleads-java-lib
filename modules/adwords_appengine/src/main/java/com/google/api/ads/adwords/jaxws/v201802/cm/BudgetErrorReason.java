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
 * <p>Java class for BudgetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BudgetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUDGET_REMOVED"/>
 *     &lt;enumeration value="BUDGET_ERROR"/>
 *     &lt;enumeration value="BUDGET_IN_USE"/>
 *     &lt;enumeration value="BUDGET_PERIOD_NOT_AVAILABLE"/>
 *     &lt;enumeration value="CANNOT_EDIT_SHARED_BUDGET"/>
 *     &lt;enumeration value="CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_BUDGET"/>
 *     &lt;enumeration value="CANNOT_UPDATE_BUDGET_TO_IMPLICITLY_SHARED"/>
 *     &lt;enumeration value="CANNOT_UPDATE_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME"/>
 *     &lt;enumeration value="CANNOT_UPDATE_BUDGET_TO_EXPLICITLY_SHARED"/>
 *     &lt;enumeration value="CANNOT_USE_IMPLICITLY_SHARED_BUDGET_WITH_MULTIPLE_CAMPAIGNS"/>
 *     &lt;enumeration value="DUPLICATE_NAME"/>
 *     &lt;enumeration value="MONEY_AMOUNT_IN_WRONG_CURRENCY"/>
 *     &lt;enumeration value="MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC"/>
 *     &lt;enumeration value="MONEY_AMOUNT_TOO_LARGE"/>
 *     &lt;enumeration value="NEGATIVE_MONEY_AMOUNT"/>
 *     &lt;enumeration value="NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BudgetError.Reason")
@XmlEnum
public enum BudgetErrorReason {


    /**
     * 
     *                 The requested budget no longer exists.
     *               
     * 
     */
    BUDGET_REMOVED,

    /**
     * 
     *                 Default budget error.
     *               
     * 
     */
    BUDGET_ERROR,

    /**
     * 
     *                 The budget is associated with at least one campaign, and so the budget cannot be removed.
     *               
     * 
     */
    BUDGET_IN_USE,

    /**
     * 
     *                 Customer is not whitelisted for this budget period.
     *               
     * 
     */
    BUDGET_PERIOD_NOT_AVAILABLE,

    /**
     * 
     *                 Customer cannot use CampaignService to edit a shared budget.
     *               
     * 
     */
    CANNOT_EDIT_SHARED_BUDGET,

    /**
     * 
     *                 This field is not mutable on implicitly shared budgets
     *               
     * 
     */
    CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_BUDGET,

    /**
     * 
     *                 Cannot change explicitly shared budgets back to implicitly shared ones.
     *               
     * 
     */
    CANNOT_UPDATE_BUDGET_TO_IMPLICITLY_SHARED,

    /**
     * 
     *                 An implicit budget without a name cannot be changed to explicitly shared budget.
     *               
     * 
     */
    CANNOT_UPDATE_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME,

    /**
     * 
     *                 Cannot change an implicitly shared budget to an explicitly shared one.
     *               
     * 
     */
    CANNOT_UPDATE_BUDGET_TO_EXPLICITLY_SHARED,

    /**
     * 
     *                 Only explicitly shared budgets can be used with multiple campaigns.
     *               
     * 
     */
    CANNOT_USE_IMPLICITLY_SHARED_BUDGET_WITH_MULTIPLE_CAMPAIGNS,

    /**
     * 
     *                 A budget with this name already exists.
     *               
     * 
     */
    DUPLICATE_NAME,

    /**
     * 
     *                 A money amount was not in the expected currency.
     *               
     * 
     */
    MONEY_AMOUNT_IN_WRONG_CURRENCY,

    /**
     * 
     *                 A money amount was less than the minimum CPC for currency.
     *               
     * 
     */
    MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC,

    /**
     * 
     *                 A money amount was greater than the maximum allowed.
     *               
     * 
     */
    MONEY_AMOUNT_TOO_LARGE,

    /**
     * 
     *                 A money amount was negative.
     *               
     * 
     */
    NEGATIVE_MONEY_AMOUNT,

    /**
     * 
     *                 A money amount was not a multiple of a minimum unit.
     *               
     * 
     */
    NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT;

    public String value() {
        return name();
    }

    public static BudgetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

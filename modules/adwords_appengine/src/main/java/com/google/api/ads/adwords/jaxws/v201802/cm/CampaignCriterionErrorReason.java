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
 * <p>Java class for CampaignCriterionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignCriterionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONCRETE_TYPE_REQUIRED"/>
 *     &lt;enumeration value="INVALID_PLACEMENT_URL"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_CRITERIA_TYPE"/>
 *     &lt;enumeration value="CANNOT_SET_STATUS_FOR_CRITERIA_TYPE"/>
 *     &lt;enumeration value="CANNOT_SET_STATUS_FOR_EXCLUDED_CRITERIA"/>
 *     &lt;enumeration value="CANNOT_TARGET_AND_EXCLUDE"/>
 *     &lt;enumeration value="TOO_MANY_OPERATIONS"/>
 *     &lt;enumeration value="OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE"/>
 *     &lt;enumeration value="SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CANNOT_ADD_EXISTING_FIELD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignCriterionError.Reason")
@XmlEnum
public enum CampaignCriterionErrorReason {


    /**
     * 
     *                 Concrete type of criterion (keyword v.s. placement) is required for
     *                 ADD and SET operations.
     *               
     * 
     */
    CONCRETE_TYPE_REQUIRED,

    /**
     * 
     *                 Invalid placement URL.
     *               
     * 
     */
    INVALID_PLACEMENT_URL,

    /**
     * 
     *                 Criteria type can not be excluded for the campaign by the customer.
     *                 like AOL account type cannot target site type criteria
     *               
     * 
     */
    CANNOT_EXCLUDE_CRITERIA_TYPE,

    /**
     * 
     *                 Cannot set the campaign criterion status for this criteria type.
     *               
     * 
     */
    CANNOT_SET_STATUS_FOR_CRITERIA_TYPE,

    /**
     * 
     *                 Cannot set the campaign criterion status for an excluded criteria.
     *               
     * 
     */
    CANNOT_SET_STATUS_FOR_EXCLUDED_CRITERIA,

    /**
     * 
     *                 Cannot target and exclude the same criterion.
     *               
     * 
     */
    CANNOT_TARGET_AND_EXCLUDE,

    /**
     * 
     *                 The #mutate operation contained too many operations.
     *               
     * 
     */
    TOO_MANY_OPERATIONS,

    /**
     * 
     *                 This operator cannot be applied to a criterion of this type.
     *               
     * 
     */
    OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE,

    /**
     * 
     *                 The Shopping campaign sales country is not supported for ProductSalesChannel targeting.
     *               
     * 
     */
    SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL,
    UNKNOWN,

    /**
     * 
     *                 The existing field can't be updated with ADD operation. It can be updated with
     *                 SET operation only.
     *               
     * 
     */
    CANNOT_ADD_EXISTING_FIELD;

    public String value() {
        return name();
    }

    public static CampaignCriterionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201609.express;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MISSING_BUSINESS_NAME"/>
 *     &lt;enumeration value="BUSINESS_DELETED"/>
 *     &lt;enumeration value="NOT_BUSINESS_OWNER"/>
 *     &lt;enumeration value="BUSINESS_OWNER_NOT_FOUND"/>
 *     &lt;enumeration value="BUSINESS_OWNER_ACCOUNT_NOT_MATCHED"/>
 *     &lt;enumeration value="BUSINESS_PROMOTED_BY_ANOTHER_ACCOUNT"/>
 *     &lt;enumeration value="BUSINESS_COUNTRY_NOT_SUPPORTED"/>
 *     &lt;enumeration value="BUSINESS_LANGUAGE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="CURRENCY_NOT_SUPPORTED"/>
 *     &lt;enumeration value="AOL_ACCOUNT"/>
 *     &lt;enumeration value="MANAGER_ACCOUNT"/>
 *     &lt;enumeration value="INVALID_DESTINATION_URL"/>
 *     &lt;enumeration value="CALL_TRACKING_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_PHONE_NUMBER"/>
 *     &lt;enumeration value="PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED"/>
 *     &lt;enumeration value="NON_LOCAL_BUSINESS"/>
 *     &lt;enumeration value="ALREADY_MIGRATED"/>
 *     &lt;enumeration value="BUSINESS_ACCESS_DENIED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionError.Reason")
@XmlEnum
public enum PromotionErrorReason {


    /**
     * 
     *                 The specified business does not have a public name.
     *               
     * 
     */
    MISSING_BUSINESS_NAME,

    /**
     * 
     *                 The specified business is deleted.
     *               
     * 
     */
    BUSINESS_DELETED,

    /**
     * 
     *                 The specified business is not owned by the current user.
     *               
     * 
     */
    NOT_BUSINESS_OWNER,

    /**
     * 
     *                 No owner found for business.
     *               
     * 
     */
    BUSINESS_OWNER_NOT_FOUND,

    /**
     * 
     *                 Business owner's account doesn't match effective account.
     *               
     * 
     */
    BUSINESS_OWNER_ACCOUNT_NOT_MATCHED,

    /**
     * 
     *                 Business is promoted by another account.
     *               
     * 
     */
    BUSINESS_PROMOTED_BY_ANOTHER_ACCOUNT,

    /**
     * 
     *                 The business address is in an unsupported country.
     *               
     * 
     */
    BUSINESS_COUNTRY_NOT_SUPPORTED,

    /**
     * 
     *                 The plus page uses an unsupported language.
     *               
     * 
     */
    BUSINESS_LANGUAGE_NOT_SUPPORTED,

    /**
     * 
     *                 Not supported currency.
     *               
     * 
     */
    CURRENCY_NOT_SUPPORTED,

    /**
     * 
     *                 AOL account.
     *               
     * 
     */
    AOL_ACCOUNT,

    /**
     * 
     *                 The requested action is not supported for a manager account.
     *               
     * 
     */
    MANAGER_ACCOUNT,

    /**
     * 
     *                 The specified destination URL is invalid.
     *               
     * 
     */
    INVALID_DESTINATION_URL,

    /**
     * 
     *                 Call tracking is not supported.
     *               
     * 
     */
    CALL_TRACKING_NOT_SUPPORTED,

    /**
     * 
     *                 Phone number is invalid.
     *               
     * 
     */
    INVALID_PHONE_NUMBER,

    /**
     * 
     *                 Premium rate phone numbers e.g. 1-900 numbers not allowed.
     *               
     * 
     */
    PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED,

    /**
     * 
     *                 Non-local +Pages are not supported.
     *               
     * 
     */
    NON_LOCAL_BUSINESS,

    /**
     * 
     *                 Promotion is already migrated to AdWords.
     *               
     * 
     */
    ALREADY_MIGRATED,

    /**
     * 
     *                 Account is no longer linked to Google My Business account.
     *               
     * 
     */
    BUSINESS_ACCESS_DENIED,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static PromotionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

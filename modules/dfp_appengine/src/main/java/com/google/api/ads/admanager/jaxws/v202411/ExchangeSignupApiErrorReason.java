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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeSignupApiError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeSignupApiError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADSENSE_ACCOUNT_CREATION_ERROR"/&gt;
 *     &lt;enumeration value="ADSENSE_ACCOUNT_ALREADY_HAS_EXCHANGE"/&gt;
 *     &lt;enumeration value="FAILED_TO_ADD_WEBSITE_TO_PROPERTY"/&gt;
 *     &lt;enumeration value="FAILED_TO_CREATE_LINK_FOR_NEW_ACCOUNT"/&gt;
 *     &lt;enumeration value="CANNOT_CREATE_NEW_ACCOUNT_FOR_MAPPED_CUSTOMER"/&gt;
 *     &lt;enumeration value="FAILED_TO_CREATE_EXCHANGE_SETTINGS"/&gt;
 *     &lt;enumeration value="DUPLICATE_PRODUCT_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_SIGNUP_PRODUCT"/&gt;
 *     &lt;enumeration value="UNKNOWN_PRODUCT"/&gt;
 *     &lt;enumeration value="BAD_SITE_VERIFICATION_UPDATE_REQUEST"/&gt;
 *     &lt;enumeration value="NO_EXCHANGE_ACCOUNT"/&gt;
 *     &lt;enumeration value="SINGLE_SYNDICATION_PRODUCT"/&gt;
 *     &lt;enumeration value="ACCOUNT_NOT_YET_READY"/&gt;
 *     &lt;enumeration value="MULTIPLE_ADSENSE_ACCOUNTS_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="MISSING_LEGAL_ENTITY_NAME"/&gt;
 *     &lt;enumeration value="MISSING_ACTIVE_BILLING_PROFILE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchangeSignupApiError.Reason")
@XmlEnum
public enum ExchangeSignupApiErrorReason {

    ADSENSE_ACCOUNT_CREATION_ERROR,
    ADSENSE_ACCOUNT_ALREADY_HAS_EXCHANGE,
    FAILED_TO_ADD_WEBSITE_TO_PROPERTY,
    FAILED_TO_CREATE_LINK_FOR_NEW_ACCOUNT,
    CANNOT_CREATE_NEW_ACCOUNT_FOR_MAPPED_CUSTOMER,
    FAILED_TO_CREATE_EXCHANGE_SETTINGS,
    DUPLICATE_PRODUCT_TYPE,
    INVALID_SIGNUP_PRODUCT,
    UNKNOWN_PRODUCT,
    BAD_SITE_VERIFICATION_UPDATE_REQUEST,
    NO_EXCHANGE_ACCOUNT,
    SINGLE_SYNDICATION_PRODUCT,
    ACCOUNT_NOT_YET_READY,
    MULTIPLE_ADSENSE_ACCOUNTS_NOT_ALLOWED,
    MISSING_LEGAL_ENTITY_NAME,
    MISSING_ACTIVE_BILLING_PROFILE,

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

    public static ExchangeSignupApiErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for AuthenticationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTHENTICATION_FAILED"/>
 *     &lt;enumeration value="CLIENT_CUSTOMER_ID_IS_REQUIRED"/>
 *     &lt;enumeration value="CLIENT_EMAIL_REQUIRED"/>
 *     &lt;enumeration value="CLIENT_CUSTOMER_ID_INVALID"/>
 *     &lt;enumeration value="CLIENT_EMAIL_INVALID"/>
 *     &lt;enumeration value="CLIENT_EMAIL_FAILED_TO_AUTHENTICATE"/>
 *     &lt;enumeration value="CUSTOMER_NOT_FOUND"/>
 *     &lt;enumeration value="GOOGLE_ACCOUNT_DELETED"/>
 *     &lt;enumeration value="GOOGLE_ACCOUNT_COOKIE_INVALID"/>
 *     &lt;enumeration value="FAILED_TO_AUTHENTICATE_GOOGLE_ACCOUNT"/>
 *     &lt;enumeration value="GOOGLE_ACCOUNT_USER_AND_ADS_USER_MISMATCH"/>
 *     &lt;enumeration value="LOGIN_COOKIE_REQUIRED"/>
 *     &lt;enumeration value="NOT_ADS_USER"/>
 *     &lt;enumeration value="OAUTH_TOKEN_INVALID"/>
 *     &lt;enumeration value="OAUTH_TOKEN_EXPIRED"/>
 *     &lt;enumeration value="OAUTH_TOKEN_DISABLED"/>
 *     &lt;enumeration value="OAUTH_TOKEN_REVOKED"/>
 *     &lt;enumeration value="OAUTH_TOKEN_HEADER_INVALID"/>
 *     &lt;enumeration value="LOGIN_COOKIE_INVALID"/>
 *     &lt;enumeration value="FAILED_TO_RETRIEVE_LOGIN_COOKIE"/>
 *     &lt;enumeration value="USER_ID_INVALID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationError.Reason")
@XmlEnum
public enum AuthenticationErrorReason {


    /**
     * 
     *                 Authentication of the request failed.
     *               
     * 
     */
    AUTHENTICATION_FAILED,

    /**
     * 
     *                 Client Customer Id is required if CustomerIdMode is set to CLIENT_EXTERNAL_CUSTOMER_ID.
     *                 Starting version V201409 ClientCustomerId will be required for all requests except
     *                 for {@link CustomerService#get}
     *               
     * 
     */
    CLIENT_CUSTOMER_ID_IS_REQUIRED,

    /**
     * 
     *                 Client Email is required if CustomerIdMode is set to CLIENT_EXTERNAL_EMAIL_FIELD.
     *               
     * 
     */
    CLIENT_EMAIL_REQUIRED,

    /**
     * 
     *                 Client customer Id is not a number.
     *               
     * 
     */
    CLIENT_CUSTOMER_ID_INVALID,

    /**
     * 
     *                 Client customer Id is not a number.
     *               
     * 
     */
    CLIENT_EMAIL_INVALID,

    /**
     * 
     *                 Client email is not a valid customer email.
     *               
     * 
     */
    CLIENT_EMAIL_FAILED_TO_AUTHENTICATE,

    /**
     * 
     *                 No customer found for the customer id provided in the header.
     *               
     * 
     */
    CUSTOMER_NOT_FOUND,

    /**
     * 
     *                 Client's Google Account is deleted.
     *               
     * 
     */
    GOOGLE_ACCOUNT_DELETED,

    /**
     * 
     *                 Google account login token in the cookie is invalid.
     *               
     * 
     */
    GOOGLE_ACCOUNT_COOKIE_INVALID,

    /**
     * 
     *                 problem occurred during Google account authentication.
     *               
     * 
     */
    FAILED_TO_AUTHENTICATE_GOOGLE_ACCOUNT,

    /**
     * 
     *                 The user in the google account login token does not match the UserId in the cookie.
     *               
     * 
     */
    GOOGLE_ACCOUNT_USER_AND_ADS_USER_MISMATCH,

    /**
     * 
     *                 Login cookie is required for authentication.
     *               
     * 
     */
    LOGIN_COOKIE_REQUIRED,

    /**
     * 
     *                 User in the cookie is not a valid Ads user.
     *               
     * 
     */
    NOT_ADS_USER,

    /**
     * 
     *                 Oauth token in the header is not valid.
     *               
     * 
     */
    OAUTH_TOKEN_INVALID,

    /**
     * 
     *                 Oauth token in the header has expired.
     *               
     * 
     */
    OAUTH_TOKEN_EXPIRED,

    /**
     * 
     *                 Oauth token in the header has been disabled.
     *               
     * 
     */
    OAUTH_TOKEN_DISABLED,

    /**
     * 
     *                 Oauth token in the header has been revoked.
     *               
     * 
     */
    OAUTH_TOKEN_REVOKED,

    /**
     * 
     *                 Oauth token HTTP header is malformed.
     *               
     * 
     */
    OAUTH_TOKEN_HEADER_INVALID,

    /**
     * 
     *                 Login cookie is not valid.
     *               
     * 
     */
    LOGIN_COOKIE_INVALID,

    /**
     * 
     *                 Failed to decrypt the login cookie.
     *               
     * 
     */
    FAILED_TO_RETRIEVE_LOGIN_COOKIE,

    /**
     * 
     *                 User Id in the header is not a valid id.
     *               
     * 
     */
    USER_ID_INVALID;

    public String value() {
        return name();
    }

    public static AuthenticationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

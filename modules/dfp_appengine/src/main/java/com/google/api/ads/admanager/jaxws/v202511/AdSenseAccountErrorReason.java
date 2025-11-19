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


package com.google.api.ads.admanager.jaxws.v202511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdSenseAccountError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdSenseAccountError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASSOCIATE_ACCOUNT_API_ERROR"/&gt;
 *     &lt;enumeration value="CANNOT_ACCESS_INVALID_ACCOUNT"/&gt;
 *     &lt;enumeration value="ACCOUNT_ACCESS_DENIED"/&gt;
 *     &lt;enumeration value="GET_AD_SLOT_API_ERROR"/&gt;
 *     &lt;enumeration value="GET_CHANNEL_API_ERROR"/&gt;
 *     &lt;enumeration value="GET_BULK_ACCOUNT_STATUSES_API_ERROR"/&gt;
 *     &lt;enumeration value="RESEND_VERIFICATION_EMAIL_ERROR"/&gt;
 *     &lt;enumeration value="UNEXPECTED_API_RESPONSE_ERROR"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdSenseAccountError.Reason")
@XmlEnum
public enum AdSenseAccountErrorReason {


    /**
     * 
     *                 An error occurred while trying to associate an AdSense account with Ad Manager. Unable to
     *                 create an association with AdSense or Ad Exchange account.
     *               
     * 
     */
    ASSOCIATE_ACCOUNT_API_ERROR,

    /**
     * 
     *                 An error occurred while a user without a valid AdSense account trying to access an Ads
     *                 frontend.
     *               
     * 
     */
    CANNOT_ACCESS_INVALID_ACCOUNT,

    /**
     * 
     *                 An error occurred while AdSense denied access.
     *               
     * 
     */
    ACCOUNT_ACCESS_DENIED,

    /**
     * 
     *                 An error occurred while trying to get an associated web property's ad slots. Unable to
     *                 retrieve ad slot information from AdSense or Ad Exchange account.
     *               
     * 
     */
    GET_AD_SLOT_API_ERROR,

    /**
     * 
     *                 An error occurred while trying to get an associated web property's ad channels.
     *               
     * 
     */
    GET_CHANNEL_API_ERROR,

    /**
     * 
     *                 An error occurred while trying to retrieve account statues from AdSense API. Unable to
     *                 retrieve account status information. Please try again later.
     *               
     * 
     */
    GET_BULK_ACCOUNT_STATUSES_API_ERROR,

    /**
     * 
     *                 An error occurred while trying to resend the account association verification email. Error
     *                 resending verification email. Please try again.
     *               
     * 
     */
    RESEND_VERIFICATION_EMAIL_ERROR,

    /**
     * 
     *                 An error occurred while trying to retrieve a response from the AdSense API. There was a
     *                 problem processing your request. Please try again later.
     *               
     * 
     */
    UNEXPECTED_API_RESPONSE_ERROR,

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

    public static AdSenseAccountErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

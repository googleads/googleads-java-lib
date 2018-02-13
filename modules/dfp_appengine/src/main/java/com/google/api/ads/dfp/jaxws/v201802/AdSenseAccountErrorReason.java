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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdSenseAccountError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdSenseAccountError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSOCIATE_ACCOUNT_API_ERROR"/>
 *     &lt;enumeration value="GET_AD_SLOT_API_ERROR"/>
 *     &lt;enumeration value="GET_CHANNEL_API_ERROR"/>
 *     &lt;enumeration value="GET_BULK_ACCOUNT_STATUSES_API_ERROR"/>
 *     &lt;enumeration value="RESEND_VERIFICATION_EMAIL_ERROR"/>
 *     &lt;enumeration value="UNEXPECTED_API_RESPONSE_ERROR"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdSenseAccountError.Reason")
@XmlEnum
public enum AdSenseAccountErrorReason {


    /**
     * 
     *                 An error occured while trying to associate an AdSense account with DFP. Unable to create an
     *                 association with AdSense or Ad Exchange account.
     *               
     * 
     */
    ASSOCIATE_ACCOUNT_API_ERROR,

    /**
     * 
     *                 An error occured while trying to get an associated web property's ad slots. Unable to
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
     *                 An error occured while trying to retrieve account statues from AdSense API. Unable to
     *                 retrieve account status information. Please try again later.
     *               
     * 
     */
    GET_BULK_ACCOUNT_STATUSES_API_ERROR,

    /**
     * 
     *                 An error occured while trying to resend the account association verification email. Error
     *                 resending verification email.  Please try again.
     *               
     * 
     */
    RESEND_VERIFICATION_EMAIL_ERROR,

    /**
     * 
     *                 An error occured while trying to retrieve a response from the AdSense API. There was a
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

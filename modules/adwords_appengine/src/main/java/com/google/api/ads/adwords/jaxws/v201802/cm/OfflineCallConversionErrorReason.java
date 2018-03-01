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
 * <p>Java class for OfflineCallConversionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfflineCallConversionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONVERSION_PRECEDES_CALL"/>
 *     &lt;enumeration value="FUTURE_CALL_START_TIME"/>
 *     &lt;enumeration value="FUTURE_CONVERSION_TIME"/>
 *     &lt;enumeration value="EXPIRED_CALL"/>
 *     &lt;enumeration value="TOO_RECENT_CALL"/>
 *     &lt;enumeration value="UNPARSEABLE_CALLERS_PHONE_NUMBER"/>
 *     &lt;enumeration value="INVALID_CALL"/>
 *     &lt;enumeration value="UNAUTHORIZED_USER"/>
 *     &lt;enumeration value="INVALID_CONVERSION_TYPE"/>
 *     &lt;enumeration value="TOO_RECENT_CONVERSION_TYPE"/>
 *     &lt;enumeration value="CONVERSION_TRACKING_NOT_ENABLED_AT_CALL_TIME"/>
 *     &lt;enumeration value="DESKTOP_CALL_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfflineCallConversionError.Reason")
@XmlEnum
public enum OfflineCallConversionErrorReason {


    /**
     * 
     *                 The conversion time cannot precede the call time.
     *               
     * 
     */
    CONVERSION_PRECEDES_CALL,

    /**
     * 
     *                 You cannot set a future call start time.
     *               
     * 
     */
    FUTURE_CALL_START_TIME,

    /**
     * 
     *                 You cannot set a future conversion time.
     *               
     * 
     */
    FUTURE_CONVERSION_TIME,

    /**
     * 
     *                 The click that initiated the call is too old for this conversion to be imported.
     *               
     * 
     */
    EXPIRED_CALL,

    /**
     * 
     *                 We are still processing this call's information, please re-upload this conversion in 4-6
     *                 hours.
     *               
     * 
     */
    TOO_RECENT_CALL,

    /**
     * 
     *                 The caller?s phone number cannot be parsed. Please re-upload in one of the supported formats.
     *                 It should be formatted either as E.164 "+16502531234", International "+64 3-331 6005" or as
     *                 a US national number ?6502531234?.
     *               
     * 
     */
    UNPARSEABLE_CALLERS_PHONE_NUMBER,

    /**
     * 
     *                 We are unable to import a conversion for this call, since either this call or the click
     *                 leading to the call was not found in our system.
     *               
     * 
     */
    INVALID_CALL,

    /**
     * 
     *                 This call belongs to an account that you are not authorized to access.
     *               
     * 
     */
    UNAUTHORIZED_USER,

    /**
     * 
     *                 We cannot find an import conversion type with this name in the target account.
     *               
     * 
     */
    INVALID_CONVERSION_TYPE,

    /**
     * 
     *                 This conversion action was created too recently. Please wait for 4 hours and try uploading
     *                 again.
     *               
     * 
     */
    TOO_RECENT_CONVERSION_TYPE,

    /**
     * 
     *                 Unable to upload. No AdWords call import conversion types were defined when this call
     *                 occurred. Please make sure you create at least one such conversion type before uploading.
     *               
     * 
     */
    CONVERSION_TRACKING_NOT_ENABLED_AT_CALL_TIME,

    /**
     * 
     *                 We can't count calls from ads made by computer or tablet users as conversions.
     *               
     * 
     */
    DESKTOP_CALL_NOT_SUPPORTED,

    /**
     * 
     *                 An internal server error occurred, please try again.
     *               
     * 
     */
    INTERNAL_ERROR,

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

    public static OfflineCallConversionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

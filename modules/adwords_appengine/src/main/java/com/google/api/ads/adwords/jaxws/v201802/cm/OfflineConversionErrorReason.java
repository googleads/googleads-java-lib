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
 * <p>Java class for OfflineConversionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfflineConversionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNPARSEABLE_GCLID"/>
 *     &lt;enumeration value="CONVERSION_PRECEDES_CLICK"/>
 *     &lt;enumeration value="FUTURE_CONVERSION_TIME"/>
 *     &lt;enumeration value="EXPIRED_CLICK"/>
 *     &lt;enumeration value="TOO_RECENT_CLICK"/>
 *     &lt;enumeration value="INVALID_CLICK"/>
 *     &lt;enumeration value="UNAUTHORIZED_USER"/>
 *     &lt;enumeration value="INVALID_CONVERSION_TYPE"/>
 *     &lt;enumeration value="TOO_RECENT_CONVERSION_TYPE"/>
 *     &lt;enumeration value="CLICK_MISSING_CONVERSION_LABEL"/>
 *     &lt;enumeration value="ATTRIBUTED_CREDIT_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION"/>
 *     &lt;enumeration value="ATTRIBUTION_MODEL_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION"/>
 *     &lt;enumeration value="ATTRIBUTED_CREDIT_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION"/>
 *     &lt;enumeration value="ATTRIBUTED_CREDIT_ZERO_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION"/>
 *     &lt;enumeration value="ATTRIBUTION_MODEL_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION"/>
 *     &lt;enumeration value="ORDER_ID_NOT_PERMITTED_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfflineConversionError.Reason")
@XmlEnum
public enum OfflineConversionErrorReason {


    /**
     * 
     *                 This google click ID could not be decoded.
     *               
     * 
     */
    UNPARSEABLE_GCLID,

    /**
     * 
     *                 This conversion is reported to have happened before the click.
     *               
     * 
     */
    CONVERSION_PRECEDES_CLICK,

    /**
     * 
     *                 You cannot set a future conversion time.
     *               
     * 
     */
    FUTURE_CONVERSION_TIME,

    /**
     * 
     *                 This click is either too old to be imported or occurred before the conversion window for the
     *                 specified combination of conversion date and conversion name (default is 90 days).
     *               
     * 
     */
    EXPIRED_CLICK,

    /**
     * 
     *                 This click occurred less than 24 hours ago, please try again after a day or so.
     *               
     * 
     */
    TOO_RECENT_CLICK,

    /**
     * 
     *                 This click does not exist in the system. This can occur if google click ids are collected
     *                 for non AdWords clicks (e.g. dart search).
     *               
     * 
     */
    INVALID_CLICK,

    /**
     * 
     *                 This customer is trying to upload conversions for a different customer that it does not
     *                 manage.
     *               
     * 
     */
    UNAUTHORIZED_USER,

    /**
     * 
     *                 This customer does not have an import conversion with a name that matches the label
     *                 of this conversion.
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
     *                 Cannot process clicks that occurred when none of the effective conversion types in the
     *                 account were enabled, to generate conversions.
     *               
     * 
     */
    CLICK_MISSING_CONVERSION_LABEL,

    /**
     * 
     *                 This conversion action is not configured to use an external attribution model, but the
     *                 attributed credit is set to a non-zero value.
     *               
     * 
     */
    ATTRIBUTED_CREDIT_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION,

    /**
     * 
     *                 This conversion action is not configured to use an external attribution model, but the
     *                 attribution model name is set.
     *               
     * 
     */
    ATTRIBUTION_MODEL_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION,

    /**
     * 
     *                 This conversion action is using an external attribution model, but the attributed credit is
     *                 not set.
     *               
     * 
     */
    ATTRIBUTED_CREDIT_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION,

    /**
     * 
     *                 This conversion action is using an external attribution model, but the attributed credit is
     *                 set to 0.
     *               
     * 
     */
    ATTRIBUTED_CREDIT_ZERO_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION,

    /**
     * 
     *                 This conversion action is using an external attribution model, but the attribution model name
     *                 is not set.
     *               
     * 
     */
    ATTRIBUTION_MODEL_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION,

    /**
     * 
     *                 This conversion action is using an external attribution model, which does not accept order
     *                 ids.
     *               
     * 
     */
    ORDER_ID_NOT_PERMITTED_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION,

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

    public static OfflineConversionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

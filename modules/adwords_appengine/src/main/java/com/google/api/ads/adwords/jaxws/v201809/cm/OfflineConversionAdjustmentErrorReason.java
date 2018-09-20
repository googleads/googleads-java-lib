// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201809.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineConversionAdjustmentError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfflineConversionAdjustmentError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RETRACTION_WITH_VALUE_OR_CURRENCY"/>
 *     &lt;enumeration value="RESTATEMENT_WITHOUT_VALUE"/>
 *     &lt;enumeration value="FUTURE_CONVERSION_TIME"/>
 *     &lt;enumeration value="FUTURE_ADJUSTMENT_TIME"/>
 *     &lt;enumeration value="TOO_RECENT_CONVERSION_TYPE"/>
 *     &lt;enumeration value="INVALID_CONVERSION_TYPE"/>
 *     &lt;enumeration value="CONVERSION_ALREADY_CANCELED"/>
 *     &lt;enumeration value="CONVERSION_NOT_FOUND"/>
 *     &lt;enumeration value="CONVERSION_EXPIRED"/>
 *     &lt;enumeration value="ADJUSTMENT_PRECEDES_CONVERSION"/>
 *     &lt;enumeration value="MORE_RECENT_RESTATEMENT_FOUND"/>
 *     &lt;enumeration value="TOO_RECENT_CONVERSION"/>
 *     &lt;enumeration value="INVALID_ORDER_ID"/>
 *     &lt;enumeration value="CANNOT_RESTATE_CONVERSION_ACTION_THAT_ALWAYS_USES_DEFAULT_CONVERSION_VALUE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfflineConversionAdjustmentError.Reason")
@XmlEnum
public enum OfflineConversionAdjustmentErrorReason {


    /**
     * 
     *                 The retraction incorrectly contains adjusted value or currency.
     *                 Retractions are intended to nullify conversions and thus should not have
     *                 an adjusted value or currency.
     *               
     * 
     */
    RETRACTION_WITH_VALUE_OR_CURRENCY,

    /**
     * 
     *                 The restatement does not contain an adjusted value.
     *               
     * 
     */
    RESTATEMENT_WITHOUT_VALUE,

    /**
     * 
     *                 This conversion time is in the future.
     *                 This only occurs when the advertiser is reporting adjustments using gclid
     *                 and conversion time instead of using order id.
     *               
     * 
     */
    FUTURE_CONVERSION_TIME,

    /**
     * 
     *                 This adjustment time is in the future.
     *               
     * 
     */
    FUTURE_ADJUSTMENT_TIME,

    /**
     * 
     *                 The adjustment's conversion type was created too recently.
     *               
     * 
     */
    TOO_RECENT_CONVERSION_TYPE,

    /**
     * 
     *                 This uploading account does not have a conversion type that matches the conversion
     *                 type of this adjustment.
     *               
     * 
     */
    INVALID_CONVERSION_TYPE,

    /**
     * 
     *                 A retraction with a different adjustment occurrence timestamp was found
     *                 for this conversion.
     *               
     * 
     */
    CONVERSION_ALREADY_CANCELED,

    /**
     * 
     *                 A conversion for the given (order id, conversion name) or (gclid, conversion occurrence
     *                 time, conversion name) could not be found.
     *               
     * 
     */
    CONVERSION_NOT_FOUND,

    /**
     * 
     *                 An expired conversion was found for the given (order id, conversion name) or
     *                 (gclid, conversion occurrence time, conversion name).
     *                 Conversions expire after 90 days, after which adjustments cannot be reported against them.
     *               
     * 
     */
    CONVERSION_EXPIRED,

    /**
     * 
     *                 The given adjustment occurrence time precedes that of the original conversion.
     *               
     * 
     */
    ADJUSTMENT_PRECEDES_CONVERSION,

    /**
     * 
     *                 A restatement was found with a more recent adjustment occurrence timestamp for
     *                 the same conversion.
     *               
     * 
     */
    MORE_RECENT_RESTATEMENT_FOUND,

    /**
     * 
     *                 The conversion was created too recently.
     *               
     * 
     */
    TOO_RECENT_CONVERSION,

    /**
     * 
     *                 A conversion associated with this order id cannot be adjusted because the order id is less
     *                 than 2 characters or is a static value like "order_id" or "undefined".
     *               
     * 
     */
    INVALID_ORDER_ID,

    /**
     * 
     *                 Restatements cannot be reported for a conversion action that always uses the default value.
     *               
     * 
     */
    CANNOT_RESTATE_CONVERSION_ACTION_THAT_ALWAYS_USES_DEFAULT_CONVERSION_VALUE,

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

    public static OfflineConversionAdjustmentErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

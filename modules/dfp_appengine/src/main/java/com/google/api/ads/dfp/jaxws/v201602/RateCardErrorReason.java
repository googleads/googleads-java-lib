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


package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateCardError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateCardError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_CURRENCY_CODE"/>
 *     &lt;enumeration value="UNSUPPORTED_CURRENCY_CODE"/>
 *     &lt;enumeration value="UNCHANGEABLE_CURRENCY_CODE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateCardError.Reason")
@XmlEnum
public enum RateCardErrorReason {


    /**
     * 
     *                 The currency code is invalid and does not follow ISO 4217.
     *               
     * 
     */
    INVALID_CURRENCY_CODE,

    /**
     * 
     *                 The currency code is not supported by current network. A supported currency can be either
     *                 {@link Network#currencyCode} or one of {@link Network#secondaryCurrencyCodes}.
     *               
     * 
     */
    UNSUPPORTED_CURRENCY_CODE,

    /**
     * 
     *                 The currency code is unchangeable as long as there is any proposal line item created
     *                 with the rate card.
     *               
     * 
     */
    UNCHANGEABLE_CURRENCY_CODE,

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

    public static RateCardErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

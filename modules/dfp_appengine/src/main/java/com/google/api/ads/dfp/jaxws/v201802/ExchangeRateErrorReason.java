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
 * <p>Java class for ExchangeRateError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeRateError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_CURRENCY_CODE"/>
 *     &lt;enumeration value="UNSUPPORTED_CURRENCY_CODE"/>
 *     &lt;enumeration value="CURRENCY_CODE_ALREADY_EXISTS"/>
 *     &lt;enumeration value="INVALID_EXCHANGE_RATE"/>
 *     &lt;enumeration value="EXCHANGE_RATE_NOT_FOUND"/>
 *     &lt;enumeration value="CANNOT_DELETE_EXCHANGE_RATE_WITH_ACTIVE_RATE_CARDS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExchangeRateError.Reason")
@XmlEnum
public enum ExchangeRateErrorReason {


    /**
     * 
     *                 The currency code is invalid and does not follow ISO 4217.
     *               
     * 
     */
    INVALID_CURRENCY_CODE,

    /**
     * 
     *                 The currency code is not supported.
     *               
     * 
     */
    UNSUPPORTED_CURRENCY_CODE,

    /**
     * 
     *                 The currency code already exists. When creating an exchange rate, its currency should not be
     *                 associated with any existing exchange rate. When creating a list of exchange rates, there
     *                 should not be two exchange rates associated with same currency.
     *               
     * 
     */
    CURRENCY_CODE_ALREADY_EXISTS,

    /**
     * 
     *                 The exchange rate value is invalid. When the {@link ExchangeRate#refreshRate} is
     *                 {@link ExchangeRateRefreshRate#FIXED}, the {@link ExchangeRate#exchangeRate} should be larger
     *                 than 0. Otherwise it is invalid.
     *               
     * 
     */
    INVALID_EXCHANGE_RATE,

    /**
     * 
     *                 The exchange rate value is not found. When the {@link ExchangeRate#refreshRate} is
     *                 {@link ExchangeRateRefreshRate#DAILY} or {@link ExchangeRateRefreshRate#MONTHLY}, the
     *                 {@link ExchangeRate#exchangeRate} should be assigned by Google. It is not found if Google
     *                 cannot find such an exchange rate.
     *               
     * 
     */
    EXCHANGE_RATE_NOT_FOUND,

    /**
     * 
     *                 The exchange rate cannot be deleted as it is still being used by active rate cards.
     *               
     * 
     */
    CANNOT_DELETE_EXCHANGE_RATE_WITH_ACTIVE_RATE_CARDS,

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

    public static ExchangeRateErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCodeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyCodeError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVALID"/&gt;
 *     &lt;enumeration value="UNSUPPORTED"/&gt;
 *     &lt;enumeration value="DEPRECATED_CURRENCY_USED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCodeError.Reason")
@XmlEnum
public enum CurrencyCodeErrorReason {


    /**
     * 
     *                 The currency code is invalid and does not follow ISO 4217.
     *               
     * 
     */
    INVALID,

    /**
     * 
     *                 The currency code is valid, but is not supported.
     *               
     * 
     */
    UNSUPPORTED,

    /**
     * 
     *                 The currency has been used for entity creation after its deprecation
     *               
     * 
     */
    DEPRECATED_CURRENCY_USED;

    public String value() {
        return name();
    }

    public static CurrencyCodeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

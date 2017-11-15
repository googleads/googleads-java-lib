// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUM"/>
 *     &lt;enumeration value="HIGHEST"/>
 *     &lt;enumeration value="ANY_VALUE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PricingMethod")
@XmlEnum
public enum PricingMethod {


    /**
     * 
     *                 Applies sum of all matched {@link PremiumRateValue} objects in the
     *                 {@link PremiumRate}.
     *               
     * 
     */
    SUM,

    /**
     * 
     *                 Applies the matched {@link PremiumRateValue} with highest adjustment size.
     *               
     * 
     */
    HIGHEST,

    /**
     * 
     *                 Only {@link PremiumRateValue} objects with 'Any' matching value are
     *                 allowed to be added to this {@link PremiumRate}.
     *               
     * 
     */
    ANY_VALUE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static PricingMethod fromValue(String v) {
        return valueOf(v);
    }

}

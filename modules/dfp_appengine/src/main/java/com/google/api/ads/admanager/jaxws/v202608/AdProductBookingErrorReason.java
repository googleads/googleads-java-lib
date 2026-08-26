// Copyright 2026 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202608;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdProductBookingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdProductBookingError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AD_PRODUCT_NOT_FOUND"/&gt;
 *     &lt;enumeration value="AD_PRODUCT_NOT_ACTIVE"/&gt;
 *     &lt;enumeration value="AD_PRODUCT_PRICING_NOT_FOUND"/&gt;
 *     &lt;enumeration value="AD_PRODUCT_PRICING_MISMATCH"/&gt;
 *     &lt;enumeration value="AD_PRODUCT_ADD_ON_PRICING_NOT_FOUND"/&gt;
 *     &lt;enumeration value="AD_PRODUCT_ADD_ON_PRICING_RATE_CARD_MISMATCH"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdProductBookingError.Reason")
@XmlEnum
public enum AdProductBookingErrorReason {


    /**
     * 
     *                 Selected ad product does not exist.
     *               
     * 
     */
    AD_PRODUCT_NOT_FOUND,

    /**
     * 
     *                 Selected ad product is not active.
     *               
     * 
     */
    AD_PRODUCT_NOT_ACTIVE,

    /**
     * 
     *                 Selected ad product pricing does not exist.
     *               
     * 
     */
    AD_PRODUCT_PRICING_NOT_FOUND,

    /**
     * 
     *                 Selected ad product pricing does not belong to the selected product.
     *               
     * 
     */
    AD_PRODUCT_PRICING_MISMATCH,

    /**
     * 
     *                 Selected add-on pricing does not exist.
     *               
     * 
     */
    AD_PRODUCT_ADD_ON_PRICING_NOT_FOUND,

    /**
     * 
     *                 Selected add-on pricing rate card does not match the primary product pricing rate card.
     *               
     * 
     */
    AD_PRODUCT_ADD_ON_PRICING_RATE_CARD_MISMATCH,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdProductBookingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

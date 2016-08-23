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
 * <p>Java class for BaseRateError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BaseRateError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_QUERY_BOTH_PRODUCT_TEMPLATE_ID_AND_PRODUCT_ID"/>
 *     &lt;enumeration value="INVALID_CURRENCY_CODE"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE_ARCHIVED"/>
 *     &lt;enumeration value="UNSUPPORTED_OPERATION"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE_BASE_RATE_NOT_FOUND"/>
 *     &lt;enumeration value="PRODUCT_BASE_RATE_EXISTS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BaseRateError.Reason")
@XmlEnum
public enum BaseRateErrorReason {


    /**
     * 
     *                 The PQL statement contains both {@code productTemplateId} and
     *                 {@code productId} fields.
     *               
     * 
     */
    CANNOT_QUERY_BOTH_PRODUCT_TEMPLATE_ID_AND_PRODUCT_ID,

    /**
     * 
     *                 The currency code is invalid.
     *               
     * 
     */
    INVALID_CURRENCY_CODE,

    /**
     * 
     *                 Cannot create or activate a base rate if the product template is
     *                 archived.
     *               
     * 
     */
    PRODUCT_TEMPLATE_ARCHIVED,

    /**
     * 
     *                 Indicates that the requested operation is not supported.
     *               
     * 
     */
    UNSUPPORTED_OPERATION,

    /**
     * 
     *                 Cannot create a base rate to a product if its product template does not
     *                 have a base rate on this rate card.
     *               
     * 
     */
    PRODUCT_TEMPLATE_BASE_RATE_NOT_FOUND,

    /**
     * 
     *                 Cannot delete a base rate on a product template if its products still
     *                 have base rates on this rate card.
     *               
     * 
     */
    PRODUCT_BASE_RATE_EXISTS,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested
     *                 API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BaseRateErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

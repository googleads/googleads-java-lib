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
 * <p>Java class for ProductPackageRateCardAssociationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductPackageRateCardAssociationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_RATE_CARD_ID"/>
 *     &lt;enumeration value="INVALID_PRODUCT_PACKAGE_ID"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductPackageRateCardAssociationError.Reason")
@XmlEnum
public enum ProductPackageRateCardAssociationErrorReason {


    /**
     * 
     *                 The id of associated rate card is invalid or invisible to user.
     *               
     * 
     */
    INVALID_RATE_CARD_ID,

    /**
     * 
     *                 The id of associated package is invalid.
     *               
     * 
     */
    INVALID_PRODUCT_PACKAGE_ID,

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

    public static ProductPackageRateCardAssociationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

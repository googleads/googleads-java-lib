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
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductDimensionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductDimensionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="BIDDING_CATEGORY_L1"/>
 *     &lt;enumeration value="BIDDING_CATEGORY_L2"/>
 *     &lt;enumeration value="BIDDING_CATEGORY_L3"/>
 *     &lt;enumeration value="BIDDING_CATEGORY_L4"/>
 *     &lt;enumeration value="BIDDING_CATEGORY_L5"/>
 *     &lt;enumeration value="BRAND"/>
 *     &lt;enumeration value="CANONICAL_CONDITION"/>
 *     &lt;enumeration value="CUSTOM_ATTRIBUTE_0"/>
 *     &lt;enumeration value="CUSTOM_ATTRIBUTE_1"/>
 *     &lt;enumeration value="CUSTOM_ATTRIBUTE_2"/>
 *     &lt;enumeration value="CUSTOM_ATTRIBUTE_3"/>
 *     &lt;enumeration value="CUSTOM_ATTRIBUTE_4"/>
 *     &lt;enumeration value="OFFER_ID"/>
 *     &lt;enumeration value="PRODUCT_TYPE_L1"/>
 *     &lt;enumeration value="PRODUCT_TYPE_L2"/>
 *     &lt;enumeration value="PRODUCT_TYPE_L3"/>
 *     &lt;enumeration value="PRODUCT_TYPE_L4"/>
 *     &lt;enumeration value="PRODUCT_TYPE_L5"/>
 *     &lt;enumeration value="CHANNEL"/>
 *     &lt;enumeration value="CHANNEL_EXCLUSIVITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductDimensionType")
@XmlEnum
public enum ProductDimensionType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN("UNKNOWN"),
    @XmlEnumValue("BIDDING_CATEGORY_L1")
    BIDDING_CATEGORY_L_1("BIDDING_CATEGORY_L1"),
    @XmlEnumValue("BIDDING_CATEGORY_L2")
    BIDDING_CATEGORY_L_2("BIDDING_CATEGORY_L2"),
    @XmlEnumValue("BIDDING_CATEGORY_L3")
    BIDDING_CATEGORY_L_3("BIDDING_CATEGORY_L3"),
    @XmlEnumValue("BIDDING_CATEGORY_L4")
    BIDDING_CATEGORY_L_4("BIDDING_CATEGORY_L4"),
    @XmlEnumValue("BIDDING_CATEGORY_L5")
    BIDDING_CATEGORY_L_5("BIDDING_CATEGORY_L5"),
    BRAND("BRAND"),
    CANONICAL_CONDITION("CANONICAL_CONDITION"),
    CUSTOM_ATTRIBUTE_0("CUSTOM_ATTRIBUTE_0"),
    CUSTOM_ATTRIBUTE_1("CUSTOM_ATTRIBUTE_1"),
    CUSTOM_ATTRIBUTE_2("CUSTOM_ATTRIBUTE_2"),
    CUSTOM_ATTRIBUTE_3("CUSTOM_ATTRIBUTE_3"),
    CUSTOM_ATTRIBUTE_4("CUSTOM_ATTRIBUTE_4"),
    OFFER_ID("OFFER_ID"),
    @XmlEnumValue("PRODUCT_TYPE_L1")
    PRODUCT_TYPE_L_1("PRODUCT_TYPE_L1"),
    @XmlEnumValue("PRODUCT_TYPE_L2")
    PRODUCT_TYPE_L_2("PRODUCT_TYPE_L2"),
    @XmlEnumValue("PRODUCT_TYPE_L3")
    PRODUCT_TYPE_L_3("PRODUCT_TYPE_L3"),
    @XmlEnumValue("PRODUCT_TYPE_L4")
    PRODUCT_TYPE_L_4("PRODUCT_TYPE_L4"),
    @XmlEnumValue("PRODUCT_TYPE_L5")
    PRODUCT_TYPE_L_5("PRODUCT_TYPE_L5"),
    CHANNEL("CHANNEL"),
    CHANNEL_EXCLUSIVITY("CHANNEL_EXCLUSIVITY");
    private final String value;

    ProductDimensionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductDimensionType fromValue(String v) {
        for (ProductDimensionType c: ProductDimensionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

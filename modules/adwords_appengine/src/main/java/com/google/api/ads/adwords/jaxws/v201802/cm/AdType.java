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
 * <p>Java class for Ad.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Ad.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEPRECATED_AD"/>
 *     &lt;enumeration value="IMAGE_AD"/>
 *     &lt;enumeration value="PRODUCT_AD"/>
 *     &lt;enumeration value="TEMPLATE_AD"/>
 *     &lt;enumeration value="TEXT_AD"/>
 *     &lt;enumeration value="THIRD_PARTY_REDIRECT_AD"/>
 *     &lt;enumeration value="DYNAMIC_SEARCH_AD"/>
 *     &lt;enumeration value="CALL_ONLY_AD"/>
 *     &lt;enumeration value="EXPANDED_TEXT_AD"/>
 *     &lt;enumeration value="RESPONSIVE_DISPLAY_AD"/>
 *     &lt;enumeration value="SHOWCASE_AD"/>
 *     &lt;enumeration value="UNIVERSAL_SHOPPING_AD"/>
 *     &lt;enumeration value="EXPANDED_DYNAMIC_SEARCH_AD"/>
 *     &lt;enumeration value="GMAIL_AD"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Ad.Type")
@XmlEnum
public enum AdType {

    DEPRECATED_AD,
    IMAGE_AD,
    PRODUCT_AD,
    TEMPLATE_AD,
    TEXT_AD,
    THIRD_PARTY_REDIRECT_AD,
    DYNAMIC_SEARCH_AD,
    CALL_ONLY_AD,
    EXPANDED_TEXT_AD,
    RESPONSIVE_DISPLAY_AD,
    SHOWCASE_AD,
    UNIVERSAL_SHOPPING_AD,
    EXPANDED_DYNAMIC_SEARCH_AD,
    GMAIL_AD,

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

    public static AdType fromValue(String v) {
        return valueOf(v);
    }

}

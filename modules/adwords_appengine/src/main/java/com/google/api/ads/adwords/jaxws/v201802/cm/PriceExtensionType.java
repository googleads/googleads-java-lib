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
 * <p>Java class for PriceExtensionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceExtensionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="BRANDS"/>
 *     &lt;enumeration value="EVENTS"/>
 *     &lt;enumeration value="LOCATIONS"/>
 *     &lt;enumeration value="NEIGHBORHOODS"/>
 *     &lt;enumeration value="PRODUCT_CATEGORIES"/>
 *     &lt;enumeration value="PRODUCT_TIERS"/>
 *     &lt;enumeration value="SERVICES"/>
 *     &lt;enumeration value="SERVICE_CATEGORIES"/>
 *     &lt;enumeration value="SERVICE_TIERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceExtensionType")
@XmlEnum
public enum PriceExtensionType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The type for showing a list of brands.
     *               
     * 
     */
    BRANDS,

    /**
     * 
     *                 The type for showing a list of events.
     *               
     * 
     */
    EVENTS,

    /**
     * 
     *                 The type for showing locations relevant to your business.
     *               
     * 
     */
    LOCATIONS,

    /**
     * 
     *                 The type for showing sub-regions or districts within a city or region.
     *               
     * 
     */
    NEIGHBORHOODS,

    /**
     * 
     *                 The type for showing a collection of product categories.
     *               
     * 
     */
    PRODUCT_CATEGORIES,

    /**
     * 
     *                 The type for showing a collection of related product tiers.
     *               
     * 
     */
    PRODUCT_TIERS,

    /**
     * 
     *                 The type for showing a collection of services offered by your business.
     *               
     * 
     */
    SERVICES,

    /**
     * 
     *                 The type for showing a collection of service categories.
     *               
     * 
     */
    SERVICE_CATEGORIES,

    /**
     * 
     *                 The type for showing a collection of related service tiers.
     *               
     * 
     */
    SERVICE_TIERS;

    public String value() {
        return name();
    }

    public static PriceExtensionType fromValue(String v) {
        return valueOf(v);
    }

}

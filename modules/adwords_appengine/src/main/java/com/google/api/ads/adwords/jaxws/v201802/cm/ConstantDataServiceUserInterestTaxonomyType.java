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
 * <p>Java class for ConstantDataService.UserInterestTaxonomyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstantDataService.UserInterestTaxonomyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BRAND"/>
 *     &lt;enumeration value="IN_MARKET"/>
 *     &lt;enumeration value="MOBILE_APP_INSTALL_USER"/>
 *     &lt;enumeration value="VERTICAL_GEO"/>
 *     &lt;enumeration value="NEW_SMART_PHONE_USER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstantDataService.UserInterestTaxonomyType")
@XmlEnum
public enum ConstantDataServiceUserInterestTaxonomyType {


    /**
     * 
     *                 The brand for this user interest.
     *               
     * 
     */
    BRAND,

    /**
     * 
     *                 The market for this user interest.
     *               
     * 
     */
    IN_MARKET,

    /**
     * 
     *                 Users known to have installed applications in the specified categories.
     *               
     * 
     */
    MOBILE_APP_INSTALL_USER,

    /**
     * 
     *                 The geographical location of the interest-based vertical.
     *               
     * 
     */
    VERTICAL_GEO,

    /**
     * 
     *                 User interest criteria for new smart phone users.
     *               
     * 
     */
    NEW_SMART_PHONE_USER;

    public String value() {
        return name();
    }

    public static ConstantDataServiceUserInterestTaxonomyType fromValue(String v) {
        return valueOf(v);
    }

}

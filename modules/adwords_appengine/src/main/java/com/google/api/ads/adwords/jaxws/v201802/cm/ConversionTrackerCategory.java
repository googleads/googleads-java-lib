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
 * <p>Java class for ConversionTracker.Category.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionTracker.Category">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="PAGE_VIEW"/>
 *     &lt;enumeration value="PURCHASE"/>
 *     &lt;enumeration value="SIGNUP"/>
 *     &lt;enumeration value="LEAD"/>
 *     &lt;enumeration value="REMARKETING"/>
 *     &lt;enumeration value="DOWNLOAD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionTracker.Category")
@XmlEnum
public enum ConversionTrackerCategory {

    DEFAULT,
    PAGE_VIEW,
    PURCHASE,
    SIGNUP,
    LEAD,
    REMARKETING,

    /**
     * 
     *                 Download is applicable only to {@link AppConversion} types,
     *                 and is an error to use in conjunction with other types.
     *                 AppConversions must use download only if they also specify
     *                 {@link AppConversion#appConversionType} as DOWNLOAD or FIRST_OPEN.
     *                 If any other appConversionType is used, then some other category besides
     *                 DOWNLOAD must be used.
     *               
     * 
     */
    DOWNLOAD;

    public String value() {
        return name();
    }

    public static ConversionTrackerCategory fromValue(String v) {
        return valueOf(v);
    }

}

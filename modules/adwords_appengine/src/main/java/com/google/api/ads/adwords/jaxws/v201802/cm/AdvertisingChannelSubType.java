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
 * <p>Java class for AdvertisingChannelSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdvertisingChannelSubType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="SEARCH_MOBILE_APP"/>
 *     &lt;enumeration value="DISPLAY_MOBILE_APP"/>
 *     &lt;enumeration value="SEARCH_EXPRESS"/>
 *     &lt;enumeration value="DISPLAY_EXPRESS"/>
 *     &lt;enumeration value="UNIVERSAL_APP_CAMPAIGN"/>
 *     &lt;enumeration value="SHOPPING_UNIVERSAL_ADS"/>
 *     &lt;enumeration value="DISPLAY_GMAIL_AD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdvertisingChannelSubType")
@XmlEnum
public enum AdvertisingChannelSubType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Mobile App Campaigns for Search
     *               
     * 
     */
    SEARCH_MOBILE_APP,

    /**
     * 
     *                 Mobile App Campaigns for Display
     *               
     * 
     */
    DISPLAY_MOBILE_APP,

    /**
     * 
     *                 AdWords Express campaigns for search.
     *               
     * 
     */
    SEARCH_EXPRESS,

    /**
     * 
     *                 AdWords Express campaigns for display.
     *               
     * 
     */
    DISPLAY_EXPRESS,

    /**
     * 
     *                 Campaigns specialized for advertising mobile app installations, that targets
     *                 multiple advertising channels across search, display and youtube.  Google
     *                 manages the keywords and ads for these campaigns.
     *               
     * 
     */
    UNIVERSAL_APP_CAMPAIGN,

    /**
     * 
     *                 Campaign type for retail advertising, that targets multiple advertising channels
     *                 across Search, Google Display Network, and YouTube. It optimizes automatically
     *                 towards the retailer's business objectives.
     *               
     * 
     */
    SHOPPING_UNIVERSAL_ADS,

    /**
     * 
     *                 Gmail Ad Campaigns
     *               
     * 
     */
    DISPLAY_GMAIL_AD;

    public String value() {
        return name();
    }

    public static AdvertisingChannelSubType fromValue(String v) {
        return valueOf(v);
    }

}

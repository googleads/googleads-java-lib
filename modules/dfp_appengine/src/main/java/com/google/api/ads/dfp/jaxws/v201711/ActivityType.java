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
 * <p>Java class for Activity.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Activity.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAGE_VIEWS"/>
 *     &lt;enumeration value="DAILY_VISITS"/>
 *     &lt;enumeration value="CUSTOM"/>
 *     &lt;enumeration value="ITEMS_PURCHASED"/>
 *     &lt;enumeration value="TRANSACTIONS"/>
 *     &lt;enumeration value="IOS_APPLICATION_DOWNLOADS"/>
 *     &lt;enumeration value="ANDROID_APPLICATION_DOWNLOADS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Activity.Type")
@XmlEnum
public enum ActivityType {


    /**
     * 
     *                 Tracks conversions for each visit to a webpage. This is a counter type.
     *               
     * 
     */
    PAGE_VIEWS,

    /**
     * 
     *                 Tracks conversions for visits to a webpage, but only counts one conversion per user per day,
     *                 even if a user visits the page multiple times. This is a counter type.
     *               
     * 
     */
    DAILY_VISITS,

    /**
     * 
     *                 Tracks conversions for visits to a webpage, but only counts one conversion per user per user
     *                 session. Session length is set by the advertiser. This is a counter type.
     *               
     * 
     */
    CUSTOM,

    /**
     * 
     *                 Tracks conversions where the user has made a purchase, the monetary value of each purchase,
     *                 plus the number of items that were purchased and the order ID. This is a sales type.
     *               
     * 
     */
    ITEMS_PURCHASED,

    /**
     * 
     *                 Tracks conversions where the user has made a purchase, the monetary value of each purchase,
     *                 plus the order ID (but not the number of items purchased). This is a sales type.
     *               
     * 
     */
    TRANSACTIONS,

    /**
     * 
     *                 Tracks conversions where the user has installed an iOS application. This is a counter type.
     *               
     * 
     */
    IOS_APPLICATION_DOWNLOADS,

    /**
     * 
     *                 Tracks conversions where the user has installed an Android application. This is a counter
     *                 type.
     *               
     * 
     */
    ANDROID_APPLICATION_DOWNLOADS,

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

    public static ActivityType fromValue(String v) {
        return valueOf(v);
    }

}

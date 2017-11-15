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
 * <p>Java class for LineItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SPONSORSHIP"/>
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="NETWORK"/>
 *     &lt;enumeration value="BULK"/>
 *     &lt;enumeration value="PRICE_PRIORITY"/>
 *     &lt;enumeration value="HOUSE"/>
 *     &lt;enumeration value="LEGACY_DFP"/>
 *     &lt;enumeration value="CLICK_TRACKING"/>
 *     &lt;enumeration value="ADSENSE"/>
 *     &lt;enumeration value="AD_EXCHANGE"/>
 *     &lt;enumeration value="BUMPER"/>
 *     &lt;enumeration value="ADMOB"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemType")
@XmlEnum
public enum LineItemType {


    /**
     * 
     *                 The type of {@link LineItem} for which a percentage of all the impressions
     *                 that are being sold are reserved.
     *               
     * 
     */
    SPONSORSHIP,

    /**
     * 
     *                 The type of {@link LineItem} for which a fixed quantity of impressions or
     *                 clicks are reserved.
     *               
     * 
     */
    STANDARD,

    /**
     * 
     *                 The type of {@link LineItem} most commonly used to fill a site's unsold
     *                 inventory if not contractually obligated to deliver a requested number of
     *                 impressions. Users specify the daily percentage of unsold impressions or
     *                 clicks when creating this line item.
     *               
     * 
     */
    NETWORK,

    /**
     * 
     *                 The type of {@link LineItem} for which a fixed quantity of impressions or
     *                 clicks will be delivered at a priority lower than the
     *                 {@link LineItemType#STANDARD} type.
     *               
     * 
     */
    BULK,

    /**
     * 
     *                 The type of {@link LineItem} most commonly used to fill a site's unsold
     *                 inventory if not contractually obligated to deliver a requested number of
     *                 impressions. Users specify the fixed quantity of unsold impressions or
     *                 clicks when creating this line item.
     *               
     * 
     */
    PRICE_PRIORITY,

    /**
     * 
     *                 The type of {@link LineItem} typically used for ads that promote products
     *                 and services chosen by the publisher. These usually do not generate revenue
     *                 and have the lowest delivery priority.
     *               
     * 
     */
    HOUSE,

    /**
     * 
     *                 Represents a legacy {@link LineItem} that has been migrated from the DFP
     *                 system. Such line items cannot be created any more. Also, these line items
     *                 cannot be activated or resumed.
     *               
     * 
     */
    LEGACY_DFP,

    /**
     * 
     *                 The type of {@link LineItem} used for ads that track ads being served
     *                 externally of DFP, for example an email newsletter. The click through would
     *                 reference this ad, and the click would be tracked via this ad.
     *               
     * 
     */
    CLICK_TRACKING,

    /**
     * 
     *                 A {@link LineItem} using dynamic allocation backed by AdSense.
     *               
     * 
     */
    ADSENSE,

    /**
     * 
     *                 A {@link LineItem} using dynamic allocation backed by the Doubleclick Ad Exchange.
     *               
     * 
     */
    AD_EXCHANGE,

    /**
     * 
     *                 Represents a non-monetizable video {@link LineItem} that targets one or
     *                 more bumper positions, which are short house video messages used by
     *                 publishers to separate content from ad breaks.
     *               
     * 
     */
    BUMPER,

    /**
     * 
     *                 A {@link LineItem} using dynamic allocation backed by AdMob.
     *               
     * 
     */
    ADMOB,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LineItemType fromValue(String v) {
        return valueOf(v);
    }

}

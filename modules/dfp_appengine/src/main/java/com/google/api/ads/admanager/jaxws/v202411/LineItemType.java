// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SPONSORSHIP"/&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *     &lt;enumeration value="NETWORK"/&gt;
 *     &lt;enumeration value="BULK"/&gt;
 *     &lt;enumeration value="PRICE_PRIORITY"/&gt;
 *     &lt;enumeration value="HOUSE"/&gt;
 *     &lt;enumeration value="LEGACY_DFP"/&gt;
 *     &lt;enumeration value="CLICK_TRACKING"/&gt;
 *     &lt;enumeration value="ADSENSE"/&gt;
 *     &lt;enumeration value="AD_EXCHANGE"/&gt;
 *     &lt;enumeration value="BUMPER"/&gt;
 *     &lt;enumeration value="ADMOB"/&gt;
 *     &lt;enumeration value="PREFERRED_DEAL"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LineItemType")
@XmlEnum
public enum LineItemType {


    /**
     * 
     *                 The type of {@link LineItem} for which a percentage of all the impressions that are being sold
     *                 are reserved.
     *               
     * 
     */
    SPONSORSHIP,

    /**
     * 
     *                 The type of {@link LineItem} for which a fixed quantity of impressions or clicks are reserved.
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
     *                 externally of Ad Manager, for example an email newsletter. The click through would
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
     *                 A {@link LineItem} using dynamic allocation backed by the Google Ad Exchange.
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
     *                 The type of {@link LineItem} for which there are no impressions reserved, and will serve for a
     *                 second price bid. All {@link LineItem}s of type {@link LineItemType#PREFERRED_DEAL} should
     *                 be created via a {@link ProposalLineItem} with a matching  type. When creating a
     *                 {@link LineItem} of type {@link LineItemType#PREFERRED_DEAL}, the
     *                 {@link ProposalLineItem#estimatedMinimumImpressions} field is required.
     *               
     * 
     */
    PREFERRED_DEAL,

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

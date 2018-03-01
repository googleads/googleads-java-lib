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
 * <p>Java class for Criterion.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Criterion.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTENT_LABEL"/>
 *     &lt;enumeration value="KEYWORD"/>
 *     &lt;enumeration value="PLACEMENT"/>
 *     &lt;enumeration value="VERTICAL"/>
 *     &lt;enumeration value="USER_LIST"/>
 *     &lt;enumeration value="USER_INTEREST"/>
 *     &lt;enumeration value="MOBILE_APPLICATION"/>
 *     &lt;enumeration value="MOBILE_APP_CATEGORY"/>
 *     &lt;enumeration value="PRODUCT_PARTITION"/>
 *     &lt;enumeration value="IP_BLOCK"/>
 *     &lt;enumeration value="WEBPAGE"/>
 *     &lt;enumeration value="LANGUAGE"/>
 *     &lt;enumeration value="LOCATION"/>
 *     &lt;enumeration value="AGE_RANGE"/>
 *     &lt;enumeration value="CARRIER"/>
 *     &lt;enumeration value="OPERATING_SYSTEM_VERSION"/>
 *     &lt;enumeration value="MOBILE_DEVICE"/>
 *     &lt;enumeration value="GENDER"/>
 *     &lt;enumeration value="PARENT"/>
 *     &lt;enumeration value="PROXIMITY"/>
 *     &lt;enumeration value="PLATFORM"/>
 *     &lt;enumeration value="PREFERRED_CONTENT"/>
 *     &lt;enumeration value="AD_SCHEDULE"/>
 *     &lt;enumeration value="LOCATION_GROUPS"/>
 *     &lt;enumeration value="PRODUCT_SCOPE"/>
 *     &lt;enumeration value="YOUTUBE_VIDEO"/>
 *     &lt;enumeration value="YOUTUBE_CHANNEL"/>
 *     &lt;enumeration value="APP_PAYMENT_MODEL"/>
 *     &lt;enumeration value="INCOME_RANGE"/>
 *     &lt;enumeration value="INTERACTION_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Criterion.Type")
@XmlEnum
public enum CriterionType {


    /**
     * 
     *                 Content label for exclusion.
     *               
     * 
     */
    CONTENT_LABEL,

    /**
     * 
     *                 Keyword. e.g. 'mars cruise'
     *               
     * 
     */
    KEYWORD,

    /**
     * 
     *                 Placement. aka Website. e.g. 'www.flowers4sale.com'
     *               
     * 
     */
    PLACEMENT,

    /**
     * 
     *                 Vertical, e.g. 'category::Animals>Pets'  This is for vertical targeting on the content
     *                 network.
     *               
     * 
     */
    VERTICAL,

    /**
     * 
     *                 User lists, are links to sets of users defined by the advertiser.
     *               
     * 
     */
    USER_LIST,

    /**
     * 
     *                 User interests, categories of interests the user is interested in.
     *               
     * 
     */
    USER_INTEREST,

    /**
     * 
     *                 Mobile applications to target.
     *               
     * 
     */
    MOBILE_APPLICATION,

    /**
     * 
     *                 Mobile application categories to target.
     *               
     * 
     */
    MOBILE_APP_CATEGORY,

    /**
     * 
     *                 Product partition (product group) in a shopping campaign.
     *               
     * 
     */
    PRODUCT_PARTITION,

    /**
     * 
     *                 IP addresses to exclude.
     *               
     * 
     */
    IP_BLOCK,

    /**
     * 
     *                 Webpages of an advertiser's website to target.
     *               
     * 
     */
    WEBPAGE,

    /**
     * 
     *                 Languages to target.
     *               
     * 
     */
    LANGUAGE,

    /**
     * 
     *                 Geographic regions to target.
     *               
     * 
     */
    LOCATION,

    /**
     * 
     *                 Age Range to exclude.
     *               
     * 
     */
    AGE_RANGE,

    /**
     * 
     *                 Mobile carriers to target.
     *               
     * 
     */
    CARRIER,

    /**
     * 
     *                 Mobile operating system versions to target.
     *               
     * 
     */
    OPERATING_SYSTEM_VERSION,

    /**
     * 
     *                 Mobile devices to target.
     *               
     * 
     */
    MOBILE_DEVICE,

    /**
     * 
     *                 Gender to exclude.
     *               
     * 
     */
    GENDER,

    /**
     * 
     *                 Parent to target and exclude.
     *               
     * 
     */
    PARENT,

    /**
     * 
     *                 Proximity (area within a radius) to target.
     *               
     * 
     */
    PROXIMITY,

    /**
     * 
     *                 Platforms to target.
     *               
     * 
     */
    PLATFORM,

    /**
     * 
     *                 Representing preferred content bid modifier.
     *               
     * 
     */
    PREFERRED_CONTENT,

    /**
     * 
     *                 AdSchedule or specific days and time intervals to target.
     *               
     * 
     */
    AD_SCHEDULE,

    /**
     * 
     *                 Targeting based on location groups.
     *               
     * 
     */
    LOCATION_GROUPS,

    /**
     * 
     *                 Scope of products. Contains a list of product dimensions, all of which a product has to match
     *                 to be included in the campaign.
     *               
     * 
     */
    PRODUCT_SCOPE,

    /**
     * 
     *                 YouTube video to target.
     *               
     * 
     */
    YOUTUBE_VIDEO,

    /**
     * 
     *                 YouTube channel to target.
     *               
     * 
     */
    YOUTUBE_CHANNEL,

    /**
     * 
     *                 Enables advertisers to target paid apps.
     *               
     * 
     */
    APP_PAYMENT_MODEL,

    /**
     * 
     *                 Income range to target and exclude.
     *               
     * 
     */
    INCOME_RANGE,

    /**
     * 
     *                 Interaction type to bid modify.
     *               
     * 
     */
    INTERACTION_TYPE,

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

    public static CriterionType fromValue(String v) {
        return valueOf(v);
    }

}

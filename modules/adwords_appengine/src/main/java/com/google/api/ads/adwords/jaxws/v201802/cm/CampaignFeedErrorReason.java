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
 * <p>Java class for CampaignFeedError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignFeedError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="INVALID_ID"/>
 *     &lt;enumeration value="CANNOT_ADD_FOR_DELETED_FEED"/>
 *     &lt;enumeration value="CANNOT_ADD_ALREADY_EXISTING_CAMPAIGN_FEED"/>
 *     &lt;enumeration value="CANNOT_OPERATE_ON_REMOVED_CAMPAIGN_FEED"/>
 *     &lt;enumeration value="INVALID_PLACEHOLDER_TYPES"/>
 *     &lt;enumeration value="MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="NO_EXISTING_LOCATION_CUSTOMER_FEED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignFeedError.Reason")
@XmlEnum
public enum CampaignFeedErrorReason {


    /**
     * 
     *                 An active feed already exists for this campaign and place holder type.
     *               
     * 
     */
    FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE,

    /**
     * 
     *                 The specified id does not exist.
     *               
     * 
     */
    INVALID_ID,

    /**
     * 
     *                 The specified feed is deleted.
     *               
     * 
     */
    CANNOT_ADD_FOR_DELETED_FEED,

    /**
     * 
     *                 The CampaignFeed already exists. SET should be used to modify the existing CampaignFeed.
     *               
     * 
     */
    CANNOT_ADD_ALREADY_EXISTING_CAMPAIGN_FEED,

    /**
     * 
     *                 Cannot operate on deleted campaign feed.
     *               
     * 
     */
    CANNOT_OPERATE_ON_REMOVED_CAMPAIGN_FEED,

    /**
     * 
     *                 Invalid placeholder type ids.
     *               
     * 
     */
    INVALID_PLACEHOLDER_TYPES,

    /**
     * 
     *                 Feed mapping for this placeholder type does not exist.
     *               
     * 
     */
    MISSING_FEEDMAPPING_FOR_PLACEHOLDER_TYPE,

    /**
     * 
     *                 Location CampaignFeeds cannot be created unless there is a location CustomerFeed
     *                 for the specified feed.
     *               
     * 
     */
    NO_EXISTING_LOCATION_CUSTOMER_FEED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CampaignFeedErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

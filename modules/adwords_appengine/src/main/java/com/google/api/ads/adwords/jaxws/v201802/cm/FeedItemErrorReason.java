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
 * <p>Java class for FeedItemError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedItemError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAMPAIGN_TARGETING_MISMATCH"/>
 *     &lt;enumeration value="CANNOT_CONVERT_ATTRIBUTE_VALUE_FROM_STRING"/>
 *     &lt;enumeration value="CANNOT_OPERATE_ON_REMOVED_FEED_ITEM"/>
 *     &lt;enumeration value="DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE"/>
 *     &lt;enumeration value="KEY_ATTRIBUTES_NOT_FOUND"/>
 *     &lt;enumeration value="INVALID_DEVICE_PREFERENCE"/>
 *     &lt;enumeration value="INVALID_SCHEDULE_END"/>
 *     &lt;enumeration value="INVALID_URL"/>
 *     &lt;enumeration value="MISSING_KEY_ATTRIBUTES"/>
 *     &lt;enumeration value="KEY_ATTRIBUTES_NOT_UNIQUE"/>
 *     &lt;enumeration value="CANNOT_MODIFY_KEY_ATTRIBUTE_VALUE"/>
 *     &lt;enumeration value="OVERLAPPING_SCHEDULES"/>
 *     &lt;enumeration value="SCHEDULE_END_NOT_AFTER_START"/>
 *     &lt;enumeration value="TOO_MANY_SCHEDULES_PER_DAY"/>
 *     &lt;enumeration value="SIZE_TOO_LARGE_FOR_MULTI_VALUE_ATTRIBUTE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedItemError.Reason")
@XmlEnum
public enum FeedItemErrorReason {


    /**
     * 
     *                 Targeted adgroup's campaign does not match the targeted campaign.
     *               
     * 
     */
    CAMPAIGN_TARGETING_MISMATCH,

    /**
     * 
     *                 Cannot convert the feed attribute value from string to its real type.
     *               
     * 
     */
    CANNOT_CONVERT_ATTRIBUTE_VALUE_FROM_STRING,

    /**
     * 
     *                 Cannot operate on removed feed item.
     *               
     * 
     */
    CANNOT_OPERATE_ON_REMOVED_FEED_ITEM,

    /**
     * 
     *                 Date time zone does not match the account's time zone.
     *               
     * 
     */
    DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE,

    /**
     * 
     *                 Feed item with the key attributes could not be found.
     *               
     * 
     */
    KEY_ATTRIBUTES_NOT_FOUND,

    /**
     * 
     *                 Unknown or unsupported device preference.
     *               
     * 
     */
    INVALID_DEVICE_PREFERENCE,

    /**
     * 
     *                 Invalid feed item schedule end time (i.e., endHour = 24 and endMinute != 0).
     *               
     * 
     */
    INVALID_SCHEDULE_END,

    /**
     * 
     *                 Url feed attribute value is not valid.
     *               
     * 
     */
    INVALID_URL,

    /**
     * 
     *                 Some key attributes are missing.
     *               
     * 
     */
    MISSING_KEY_ATTRIBUTES,

    /**
     * 
     *                 Feed item has same key attributes as another feed item.
     *               
     * 
     */
    KEY_ATTRIBUTES_NOT_UNIQUE,

    /**
     * 
     *                 Cannot modify key attributes on an existing feed item.
     *               
     * 
     */
    CANNOT_MODIFY_KEY_ATTRIBUTE_VALUE,

    /**
     * 
     *                 Overlapping feed item schedule times (e.g., 7-10AM and 8-11AM) are not allowed.
     *               
     * 
     */
    OVERLAPPING_SCHEDULES,

    /**
     * 
     *                 Feed item schedule end time must be after start time.
     *               
     * 
     */
    SCHEDULE_END_NOT_AFTER_START,

    /**
     * 
     *                 There are too many feed item schedules per day.
     *               
     * 
     */
    TOO_MANY_SCHEDULES_PER_DAY,

    /**
     * 
     *                 The feed attribute value is too large.
     *               
     * 
     */
    SIZE_TOO_LARGE_FOR_MULTI_VALUE_ATTRIBUTE,

    /**
     * 
     *                 Unknown error.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static FeedItemErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

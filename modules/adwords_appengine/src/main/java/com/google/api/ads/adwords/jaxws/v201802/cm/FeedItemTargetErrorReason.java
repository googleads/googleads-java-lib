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
 * <p>Java class for FeedItemTargetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedItemTargetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CRITERION_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="FEED_ITEM_TARGET_ALREADY_EXISTS"/>
 *     &lt;enumeration value="NEGATIVE_TARGETING_NOT_SUPPORTED_FOR_CRITERION_TYPE"/>
 *     &lt;enumeration value="ONLY_MOBILE_TARGETING_IS_SUPPORTED_FOR_PLATFORM_CRITERION"/>
 *     &lt;enumeration value="FEED_ITEM_SCHEDULES_CANNOT_OVERLAP"/>
 *     &lt;enumeration value="CRITERION_ID_MUST_BE_SET_FOR_GIVEN_TYPE"/>
 *     &lt;enumeration value="TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE"/>
 *     &lt;enumeration value="TOO_MANY_SCHEDULES_PER_DAY"/>
 *     &lt;enumeration value="CANNOT_HAVE_ACTIVE_CAMPAIGN_AND_ACTIVE_AD_GROUP_TARGETS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedItemTargetError.Reason")
@XmlEnum
public enum FeedItemTargetErrorReason {


    /**
     * 
     *                 The criterion type given cannot be used for targeting.
     *               
     * 
     */
    CRITERION_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 The feed item target specified already exists, so it cannot be added.
     *               
     * 
     */
    FEED_ITEM_TARGET_ALREADY_EXISTS,

    /**
     * 
     *                 The type of criterion is not allowed to have negative targeting.
     *               
     * 
     */
    NEGATIVE_TARGETING_NOT_SUPPORTED_FOR_CRITERION_TYPE,

    /**
     * 
     *                 Only platform criterion with mobile targeting are supported.
     *               
     * 
     */
    ONLY_MOBILE_TARGETING_IS_SUPPORTED_FOR_PLATFORM_CRITERION,

    /**
     * 
     *                 The schedules for a given feed item cannot overlap
     *               
     * 
     */
    FEED_ITEM_SCHEDULES_CANNOT_OVERLAP,

    /**
     * 
     *                 The type of Criterion requires the criterion id to be set.
     *               
     * 
     */
    CRITERION_ID_MUST_BE_SET_FOR_GIVEN_TYPE,

    /**
     * 
     *                 Too many targets of a given type were added for a single feed item.
     *               
     * 
     */
    TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE,

    /**
     * 
     *                 Too many AdSchedules are active for the feed item for the given day.
     *               
     * 
     */
    TOO_MANY_SCHEDULES_PER_DAY,

    /**
     * 
     *                 A feed item may either have an active campaign target or an active ad group target.
     *               
     * 
     */
    CANNOT_HAVE_ACTIVE_CAMPAIGN_AND_ACTIVE_AD_GROUP_TARGETS,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static FeedItemTargetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

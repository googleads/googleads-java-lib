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


package com.google.api.ads.adwords.jaxws.v201802.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficEstimatorError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficEstimatorError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_CAMPAIGN_FOR_AD_GROUP_ESTIMATE_REQUEST"/>
 *     &lt;enumeration value="NO_AD_GROUP_FOR_KEYWORD_ESTIMATE_REQUEST"/>
 *     &lt;enumeration value="NO_MAX_CPC_FOR_KEYWORD_ESTIMATE_REQUEST"/>
 *     &lt;enumeration value="TOO_MANY_KEYWORD_ESTIMATE_REQUESTS"/>
 *     &lt;enumeration value="TOO_MANY_CAMPAIGN_ESTIMATE_REQUESTS"/>
 *     &lt;enumeration value="TOO_MANY_ADGROUP_ESTIMATE_REQUESTS"/>
 *     &lt;enumeration value="TOO_MANY_TARGETS"/>
 *     &lt;enumeration value="KEYWORD_TOO_LONG"/>
 *     &lt;enumeration value="KEYWORD_CONTAINS_BROAD_MATCH_MODIFIERS"/>
 *     &lt;enumeration value="INVALID_INPUT"/>
 *     &lt;enumeration value="SERVICE_UNAVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficEstimatorError.Reason")
@XmlEnum
public enum TrafficEstimatorErrorReason {


    /**
     * 
     *                 When the request with {@code null} campaign ID in {@link CampaignEstimateRequest} contains an
     *                 {@link AdGroupEstimateRequest} with an ID.
     *               
     * 
     */
    NO_CAMPAIGN_FOR_AD_GROUP_ESTIMATE_REQUEST,

    /**
     * 
     *                 When the request with {@code null} adgroup ID in {@link AdGroupEstimateRequest} contains a
     *                 {@link KeywordEstimateRequest} with an ID.
     *               
     * 
     */
    NO_AD_GROUP_FOR_KEYWORD_ESTIMATE_REQUEST,

    /**
     * 
     *                 All {@link KeywordEstimateRequest} items should have maxCpc associated with them.
     *               
     * 
     */
    NO_MAX_CPC_FOR_KEYWORD_ESTIMATE_REQUEST,

    /**
     * 
     *                 When there are more {@link KeywordEstimateRequest}s in the request than
     *                 TrafficEstimatorService allows.
     *               
     * 
     */
    TOO_MANY_KEYWORD_ESTIMATE_REQUESTS,

    /**
     * 
     *                 When there are more {@link CampaignEstimateRequest}s in the request than
     *                 TrafficEstimatorService allows.
     *               
     * 
     */
    TOO_MANY_CAMPAIGN_ESTIMATE_REQUESTS,

    /**
     * 
     *                 When there are more {@link AdGroupEstimateRequest}s in the request than
     *                 TrafficEstimatorService allows.
     *               
     * 
     */
    TOO_MANY_ADGROUP_ESTIMATE_REQUESTS,

    /**
     * 
     *                 When there are more targets in the request than TrafficEstimatorService allows. See
     *                 documentation on {@link CampaignEstimateRequest} for more information about this error.
     *               
     * 
     */
    TOO_MANY_TARGETS,

    /**
     * 
     *                 Request contains a keyword that is too long for backends to handle.
     *               
     * 
     */
    KEYWORD_TOO_LONG,

    /**
     * 
     *                 Request contains a keyword that contains broad match modifiers.
     *               
     * 
     */
    KEYWORD_CONTAINS_BROAD_MATCH_MODIFIERS,

    /**
     * 
     *                 When an unexpected error occurs.
     *               
     * 
     */
    INVALID_INPUT,

    /**
     * 
     *                 When backend service calls fail.
     *               
     * 
     */
    SERVICE_UNAVAILABLE;

    public String value() {
        return name();
    }

    public static TrafficEstimatorErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

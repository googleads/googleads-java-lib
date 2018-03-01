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
 * <p>Java class for EntityCountLimitExceeded.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityCountLimitExceeded.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCOUNT_LIMIT"/>
 *     &lt;enumeration value="CAMPAIGN_LIMIT"/>
 *     &lt;enumeration value="ADGROUP_LIMIT"/>
 *     &lt;enumeration value="AD_GROUP_AD_LIMIT"/>
 *     &lt;enumeration value="AD_GROUP_CRITERION_LIMIT"/>
 *     &lt;enumeration value="SHARED_SET_LIMIT"/>
 *     &lt;enumeration value="MATCHING_FUNCTION_LIMIT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityCountLimitExceeded.Reason")
@XmlEnum
public enum EntityCountLimitExceededReason {


    /**
     * 
     *                 Indicates that this request would exceed the number of allowed entities for the AdWords
     *                 account. The exact entity type and limit being checked can be inferred from
     *                 {@link #accountLimitType}.
     *               
     * 
     */
    ACCOUNT_LIMIT,

    /**
     * 
     *                 Indicates that this request would exceed the number of allowed entities in a Campaign.
     *                 The exact entity type and limit being checked can be inferred from
     *                 {@link #accountLimitType}, and the numeric id of the Campaign involved is given by
     *                 {@link #enclosingId}.
     *               
     * 
     */
    CAMPAIGN_LIMIT,

    /**
     * 
     *                 Indicates that this request would exceed the number of allowed entities in
     *                 an ad group.  The exact entity type and limit being checked can be
     *                 inferred from {@link #accountLimitType}, and the numeric id of the ad group
     *                 involved is given by {@link #enclosingId}.
     *               
     * 
     */
    ADGROUP_LIMIT,

    /**
     * 
     *                 Indicates that this request would exceed the number of allowed entities in an ad group ad.
     *                 The exact entity type and limit being checked can be inferred from {@link #accountLimitType},
     *                 and the {@link #enclosingId} contains the ad group id followed by the ad id, separated by a
     *                 single comma (,).
     *               
     * 
     */
    AD_GROUP_AD_LIMIT,

    /**
     * 
     *                 Indicates that this request would exceed the number of allowed entities in an ad group
     *                 criterion.  The exact entity type and limit being checked can be inferred from
     *                 {@link #accountLimitType}, and the {@link #enclosingId} contains the ad group id followed by
     *                 the criterion id, separated by a single comma (,).
     *               
     * 
     */
    AD_GROUP_CRITERION_LIMIT,

    /**
     * 
     *                 Indicates that this request would exceed the number of allowed entities in
     *                 this shared set.  The exact entity type and limit being checked can be
     *                 inferred from {@link #accountLimitType}, and the numeric id of the shared
     *                 set involved is given by {@link #enclosingId}.
     *               
     * 
     */
    SHARED_SET_LIMIT,

    /**
     * 
     *                 Exceeds a limit related to a matching function.
     *               
     * 
     */
    MATCHING_FUNCTION_LIMIT,

    /**
     * 
     *                 Specific limit that has been exceeded is unknown (the client may be of an
     *                 older version than the server).
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static EntityCountLimitExceededReason fromValue(String v) {
        return valueOf(v);
    }

}

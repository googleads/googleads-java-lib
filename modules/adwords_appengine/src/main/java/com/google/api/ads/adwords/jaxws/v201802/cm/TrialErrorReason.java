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
 * <p>Java class for TrialError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrialError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="INVALID_STATUS_TRANSITION"/>
 *     &lt;enumeration value="CANNOT_USE_TRIAL_WITH_SHARED_BUDGET"/>
 *     &lt;enumeration value="CANNOT_CREATE_TRIAL_WHEN_CAMPAIGN_HAS_ACTIVE_EXPERIMENTS"/>
 *     &lt;enumeration value="CANNOT_CREATE_TRIAL_FOR_DELETED_BASE_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_CREATE_TRIAL_FOR_NON_PROPOSED_DRAFT"/>
 *     &lt;enumeration value="CUSTOMER_CANNOT_CREATE_TRIAL"/>
 *     &lt;enumeration value="CAMPAIGN_CANNOT_CREATE_TRIAL"/>
 *     &lt;enumeration value="NAME_ALREADY_IN_USE"/>
 *     &lt;enumeration value="TRIAL_DURATIONS_MUST_NOT_OVERLAP"/>
 *     &lt;enumeration value="TRIAL_DURATION_MUST_BE_WITHIN_CAMPAIGN_DURATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrialError.Reason")
@XmlEnum
public enum TrialErrorReason {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Trial status cannot be updated from the current status to the requested target status.
     *               
     * 
     */
    INVALID_STATUS_TRANSITION,

    /**
     * 
     *                 Cannot create a trial from a campaign using an explicitly shared budget.
     *               
     * 
     */
    CANNOT_USE_TRIAL_WITH_SHARED_BUDGET,

    /**
     * 
     *                 Cannot create a trial as long as the campaign has a running or scheduled Advertiser Campaign
     *                 Experiment.
     *               
     * 
     */
    CANNOT_CREATE_TRIAL_WHEN_CAMPAIGN_HAS_ACTIVE_EXPERIMENTS,

    /**
     * 
     *                 Cannot create a trial for a base campaign, which is deleted.
     *               
     * 
     */
    CANNOT_CREATE_TRIAL_FOR_DELETED_BASE_CAMPAIGN,

    /**
     * 
     *                 Cannot create a trial from a draft, which has a status other than proposed.
     *               
     * 
     */
    CANNOT_CREATE_TRIAL_FOR_NON_PROPOSED_DRAFT,

    /**
     * 
     *                 This customer is not allowed to create a trial.
     *               
     * 
     */
    CUSTOMER_CANNOT_CREATE_TRIAL,

    /**
     * 
     *                 This campaign is not allowed to create a trial.
     *               
     * 
     */
    CAMPAIGN_CANNOT_CREATE_TRIAL,

    /**
     * 
     *                 Trying to use a trial name which is already assigned to another campaign or trial.
     *               
     * 
     */
    NAME_ALREADY_IN_USE,

    /**
     * 
     *                 Trying to set a trial duration which overlaps with another trial.
     *               
     * 
     */
    TRIAL_DURATIONS_MUST_NOT_OVERLAP,

    /**
     * 
     *                 All non-archived trials must start and end within their campaign's duration.
     *               
     * 
     */
    TRIAL_DURATION_MUST_BE_WITHIN_CAMPAIGN_DURATION;

    public String value() {
        return name();
    }

    public static TrialErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

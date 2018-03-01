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
 * <p>Java class for CampaignTrialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignTrialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="BASE"/>
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="TRIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignTrialType")
@XmlEnum
public enum CampaignTrialType {


    /**
     * 
     *                 Invalid type. Should not be used except for detecting values that are incorrect,
     *                 or values that are not yet known to the user.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 This is a regular campaign created by the advertiser.
     *               
     * 
     */
    BASE,

    /**
     * 
     *                 This is a draft version of a campaign. It has some modifications from a base
     *                 campaign, but it does not serve or accrue stats.
     *               
     * 
     */
    DRAFT,

    /**
     * 
     *                 This is a trial version of a campaign. It has some modifications from a base
     *                 campaign, and a percentage of traffic is being diverted from the BASE campaign
     *                 to this trial campaign.
     *               
     * 
     */
    TRIAL;

    public String value() {
        return name();
    }

    public static CampaignTrialType fromValue(String v) {
        return valueOf(v);
    }

}

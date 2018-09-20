// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201809.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignTrialTrafficSplitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignTrialTrafficSplitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="RANDOM_QUERY"/>
 *     &lt;enumeration value="COOKIE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignTrialTrafficSplitType")
@XmlEnum
public enum CampaignTrialTrafficSplitType {


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
     *                 The traffic is split using a coin toss for each query when running on the search
     *                 network.
     *               
     * 
     */
    RANDOM_QUERY,

    /**
     * 
     *                 The traffic is split using cookies to keep users in the same arm (base or trial)
     *                 of the experiment.
     *               
     * 
     */
    COOKIE;

    public String value() {
        return name();
    }

    public static CampaignTrialTrafficSplitType fromValue(String v) {
        return valueOf(v);
    }

}

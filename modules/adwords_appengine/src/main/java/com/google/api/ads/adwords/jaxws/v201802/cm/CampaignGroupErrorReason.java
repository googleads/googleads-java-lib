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
 * <p>Java class for CampaignGroupError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignGroupError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_DELETE_CAMPAIGN_GROUP_WITH_ACTIVE_OR_PAUSED_CAMPAIGNS"/>
 *     &lt;enumeration value="CANNOT_MODIFY_DELETED_CAMPAIGN_GROUP"/>
 *     &lt;enumeration value="DUPLICATE_NAME"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignGroupError.Reason")
@XmlEnum
public enum CampaignGroupErrorReason {


    /**
     * 
     *                 Cannot delete a campaign group which is associated with active or paused campaigns.
     *               
     * 
     */
    CANNOT_DELETE_CAMPAIGN_GROUP_WITH_ACTIVE_OR_PAUSED_CAMPAIGNS,

    /**
     * 
     *                 Cannot modify a deleted campaign group.
     *               
     * 
     */
    CANNOT_MODIFY_DELETED_CAMPAIGN_GROUP,

    /**
     * 
     *                 Trying to modify the name of an active or paused campaign group, where the name is already
     *                 assigned to another active or paused campaign group.
     *               
     * 
     */
    DUPLICATE_NAME,

    /**
     * 
     *                 Default error
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CampaignGroupErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

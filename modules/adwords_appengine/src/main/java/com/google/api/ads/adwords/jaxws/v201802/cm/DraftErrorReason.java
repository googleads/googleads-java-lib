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
 * <p>Java class for DraftError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DraftError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_CHANGE_ARCHIVED_DRAFT"/>
 *     &lt;enumeration value="CANNOT_CHANGE_PROMOTED_DRAFT"/>
 *     &lt;enumeration value="CANNOT_CHANGE_PROMOTE_FAILED_DRAFT"/>
 *     &lt;enumeration value="CUSTOMER_CANNOT_CREATE_DRAFT"/>
 *     &lt;enumeration value="CAMPAIGN_CANNOT_CREATE_DRAFT"/>
 *     &lt;enumeration value="DUPLICATE_DRAFT_NAME"/>
 *     &lt;enumeration value="INVALID_DRAFT_CHANGE"/>
 *     &lt;enumeration value="INVALID_STATUS_TRANSITION"/>
 *     &lt;enumeration value="MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED"/>
 *     &lt;enumeration value="DRAFT_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DraftError.Reason")
@XmlEnum
public enum DraftErrorReason {


    /**
     * 
     *                 The draft is archived and cannot be modified further.
     *               
     * 
     */
    CANNOT_CHANGE_ARCHIVED_DRAFT,

    /**
     * 
     *                 The draft has been promoted and cannot be modified further.
     *               
     * 
     */
    CANNOT_CHANGE_PROMOTED_DRAFT,

    /**
     * 
     *                 The draft has failed to be promoted and cannot be modified further.
     *               
     * 
     */
    CANNOT_CHANGE_PROMOTE_FAILED_DRAFT,

    /**
     * 
     *                 This customer is not allowed to create drafts.
     *               
     * 
     */
    CUSTOMER_CANNOT_CREATE_DRAFT,

    /**
     * 
     *                 This campaign is not allowed to create drafts.
     *               
     * 
     */
    CAMPAIGN_CANNOT_CREATE_DRAFT,

    /**
     * 
     *                 A draft with this name already exists.
     *               
     * 
     */
    DUPLICATE_DRAFT_NAME,

    /**
     * 
     *                 This modification cannot be made on a draft.
     *               
     * 
     */
    INVALID_DRAFT_CHANGE,

    /**
     * 
     *                 The draft cannot be transitioned to the specified status from the its current status.
     *               
     * 
     */
    INVALID_STATUS_TRANSITION,

    /**
     * 
     *                 The campaign has reached the maximum number of drafts that can be created for a campaign
     *                 throughout its lifetime. No additional drafts can be created for this campaign. Archived
     *                 drafts also count towards this limit.
     *               
     * 
     */
    MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED,
    DRAFT_ERROR;

    public String value() {
        return name();
    }

    public static DraftErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for TrialStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrialStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CREATING"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="PROMOTING"/>
 *     &lt;enumeration value="PROMOTED"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *     &lt;enumeration value="CREATION_FAILED"/>
 *     &lt;enumeration value="PROMOTE_FAILED"/>
 *     &lt;enumeration value="GRADUATED"/>
 *     &lt;enumeration value="HALTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrialStatus")
@XmlEnum
public enum TrialStatus {


    /**
     * 
     *                 Invalid status. Should not be used except for detecting values that are
     *                 incorrect, or values that are not yet known to the user.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The trial campaign is being created.
     *               
     * 
     */
    CREATING,

    /**
     * 
     *                 The trial campaign is fully created. The trial is currently running, scheduled
     *                 to run in the future or has ended based on its end date.The advertiser cannot
     *                 set this status directly. A trial with the status CREATING will be updated to
     *                 ACTIVE when it is fully created.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 The advertiser requested to merge changes in the trial back into the original
     *                 campaigns. The update to the original campaign will be kicked off asynchronously
     *                 and the status will be updated to PROMOTED or PROMOTE_FAILED upon completion.
     *               
     * 
     */
    PROMOTING,

    /**
     * 
     *                 The process to merge changes in the trial back to the original campaign has
     *                 completedly successfully. The advertiser cannot set this status directly. To
     *                 move the trial to this status, set the trial to status PROMOTING and the status
     *                 will be updated to PROMOTED when the changes are applied to the original
     *                 campaign.
     *               
     * 
     */
    PROMOTED,

    /**
     * 
     *                 The advertiser archived the campaign trial.
     *               
     * 
     */
    ARCHIVED,

    /**
     * 
     *                 The trial campaign failed to create. More details about the errors are available
     *                 through getErrors in the TrialService API.The advertiser cannot set this status
     *                 directly.
     *               
     * 
     */
    CREATION_FAILED,

    /**
     * 
     *                 The promotion failed after it was partially applied. Promote cannot be attempted
     *                 again safely, so the issue must be corrected in the original campaign. More
     *                 details about the errors are available through getErrors in the TrialService
     *                 API.The advertiser cannot set this status directly. To promote the trial, set
     *                 the trial in state PROMOTING and the status will be updated to PROMOTE_FAILED if
     *                 errors are encountered while applying changes to the original campaign.
     *               
     * 
     */
    PROMOTE_FAILED,

    /**
     * 
     *                 The advertiser has graduated the trial campaign to a standalone campaign,
     *                 existing independently of the trial.
     *               
     * 
     */
    GRADUATED,

    /**
     * 
     *                 The advertiser has halted the trial.
     *               
     * 
     */
    HALTED;

    public String value() {
        return name();
    }

    public static TrialStatus fromValue(String v) {
        return valueOf(v);
    }

}

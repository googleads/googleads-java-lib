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
 * <p>Java class for DraftStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DraftStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="PROPOSED"/>
 *     &lt;enumeration value="PROMOTED"/>
 *     &lt;enumeration value="PROMOTING"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *     &lt;enumeration value="PROMOTE_FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DraftStatus")
@XmlEnum
public enum DraftStatus {


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
     *                 Initial state of the draft, the advertiser can start adding changes with no
     *                 effect on serving.
     *               
     * 
     */
    PROPOSED,

    /**
     * 
     *                 The process to merge changes in the draft back to the original campaign has
     *                 completedly successfully. The advertiser cannot set this status directly. To
     *                 move the draft to this status, set the draft to status PROMOTING and the status
     *                 will be updated to PROMOTED when the changes are applied to the original
     *                 campaign.
     *               
     * 
     */
    PROMOTED,

    /**
     * 
     *                 The advertiser requested to merge changes in the draft back into the original
     *                 campaigns. The update to the original campaign will be kicked off asynchronously
     *                 and the status will be updated to PROMOTED or PROMOTE_FAILED upon completion.
     *               
     * 
     */
    PROMOTING,

    /**
     * 
     *                 The advertiser has archived the draft.
     *               
     * 
     */
    ARCHIVED,

    /**
     * 
     *                 The promotion failed after it was partially applied. Promote cannot be attempted
     *                 again safely, so the issue must be corrected in the original campaign. More
     *                 details about the errors are available through getErrors in the DraftService
     *                 API.The advertiser cannot set this status directly. To promote the draft, set
     *                 the draft in state PROMOTING and the status will be updated to PROMOTE_FAILED if
     *                 errors are encountered while applying changes to the original campaign.
     *               
     * 
     */
    PROMOTE_FAILED;

    public String value() {
        return name();
    }

    public static DraftStatus fromValue(String v) {
        return valueOf(v);
    }

}

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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowApprovalRequestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowApprovalRequestStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING_APPROVAL"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="RETRACTED"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowApprovalRequestStatus")
@XmlEnum
public enum WorkflowApprovalRequestStatus {


    /**
     * 
     *                 The request is pending approval.
     *               
     * 
     */
    PENDING_APPROVAL,

    /**
     * 
     *                 The workflow approval request has been approved.
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 The workflow approval request has been rejected.
     *               
     * 
     */
    REJECTED,

    /**
     * 
     *                 The workflow request was retracted because the proposal was retracted.
     *               
     * 
     */
    RETRACTED,

    /**
     * 
     *                 The entity might have a non-applicable status in several scenarios:
     *                 <li>The {@link User} is not an approver when querying the {@code ApprovalStatus} of an action.
     *                 <li>The {@link User} is not an approver of any actions within the
     *                 {@link Proposal#workflowProgress}.
     *                 <li>Querying for the {@code ApprovalStatus} for a {@link ProposalStatus#DRAFT}
     *                 {@link Proposal}.
     *               
     * 
     */
    NOT_APPLICABLE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static WorkflowApprovalRequestStatus fromValue(String v) {
        return valueOf(v);
    }

}

// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowActionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowActionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="WORKFLOW_DEFINITION_NOT_FOUND"/>
 *     &lt;enumeration value="EMPTY_ACTION_LIST"/>
 *     &lt;enumeration value="NOT_ACTION_APPROVER"/>
 *     &lt;enumeration value="WORKFLOW_ALREADY_COMPLETED"/>
 *     &lt;enumeration value="WORKFLOW_ALREADY_FAILED"/>
 *     &lt;enumeration value="WORKFLOW_ALREADY_CANCELED"/>
 *     &lt;enumeration value="ACTION_COMPLETED"/>
 *     &lt;enumeration value="ACTION_FAILED"/>
 *     &lt;enumeration value="ACTION_CANCELED"/>
 *     &lt;enumeration value="ACTION_NOT_ACTIVE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowActionError.Reason")
@XmlEnum
public enum WorkflowActionErrorReason {


    /**
     * 
     *                 The action does not exist or is not applicable to the current state.
     *               
     * 
     */
    NOT_APPLICABLE,

    /**
     * 
     *                 Means there's no workflow definition found for the entity.
     *               
     * 
     */
    WORKFLOW_DEFINITION_NOT_FOUND,

    /**
     * 
     *                 Means no action is given, when user approve/reject a proposal, the action id list cannot be
     *                 empty.
     *               
     * 
     */
    EMPTY_ACTION_LIST,

    /**
     * 
     *                 Means the user is not an approver of this action.
     *               
     * 
     */
    NOT_ACTION_APPROVER,

    /**
     * 
     *                 Means the workflow is already completed.
     *               
     * 
     */
    WORKFLOW_ALREADY_COMPLETED,

    /**
     * 
     *                 Means the workflow is already failed.
     *               
     * 
     */
    WORKFLOW_ALREADY_FAILED,

    /**
     * 
     *                 Means the workflow is already canceled.
     *               
     * 
     */
    WORKFLOW_ALREADY_CANCELED,

    /**
     * 
     *                 Means the action is already completed.
     *               
     * 
     */
    ACTION_COMPLETED,

    /**
     * 
     *                 Means the action is already failed.
     *               
     * 
     */
    ACTION_FAILED,

    /**
     * 
     *                 Means the action is already canceled.
     *               
     * 
     */
    ACTION_CANCELED,

    /**
     * 
     *                 Means the action currently is not active.
     *               
     * 
     */
    ACTION_NOT_ACTIVE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static WorkflowActionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

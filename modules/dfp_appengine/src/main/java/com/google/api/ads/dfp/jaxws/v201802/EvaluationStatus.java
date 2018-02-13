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
 * <p>Java class for EvaluationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EvaluationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANCELED"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="IN_PROGRESS"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="SKIPPED"/>
 *     &lt;enumeration value="INACTIVE_BUT_TRIGGERED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EvaluationStatus")
@XmlEnum
public enum EvaluationStatus {


    /**
     * 
     *                 When a {@link Proposal} is retracted the associated workflow is canceled.
     *                 Including the steps, rules and actions.
     *               
     * 
     */
    CANCELED,

    /**
     * 
     *                 The entity is in a completed state. If the entity is a workflow, it means that all steps have
     *                 been completed. If the entity is a step, it means all actions in the step have been completed.
     *                 If the entity is a workflow action, it means it has been done.
     *               
     * 
     */
    COMPLETED,

    /**
     * 
     *                 The entity is in a failed state. If the entity is a workflow, it means that some step has
     *                 failed. If the entity is a step, it means some actions in the step have failed. If the
     *                 entity is a workflow action, it means it has failed.
     *               
     * 
     */
    FAILED,

    /**
     * 
     *                 The entity is in progress. If the entity is a workflow, it means that some steps have yet to be
     *                 started. If the entity is a step, it means some actions in the step are still in a pending
     *                 state. If the entity is a workflow action, it means the action is ongoing.
     *               
     * 
     */
    IN_PROGRESS,

    /**
     * 
     *                 The entity has not been started. If the entity is a step, it has not been started by the
     *                 workflow execution process If the entity is a workflow action, it means that the step has not
     *                 been triggered.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 The action is skipped because the {@link Proposal} and/or {@link ProposalLineItem proposal line
     *                 items} do not trigger the conditions for the step. This value is only for actions.
     *               
     * 
     */
    SKIPPED,

    /**
     * 
     *                 The action is triggered because the {@link Proposal} and/or {@link ProposalLineItem proposal
     *                 line items} trigger the conditions for the step, but the step itself has not started yet.
     *               
     * 
     */
    INACTIVE_BUT_TRIGGERED,

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

    public static EvaluationStatus fromValue(String v) {
        return valueOf(v);
    }

}

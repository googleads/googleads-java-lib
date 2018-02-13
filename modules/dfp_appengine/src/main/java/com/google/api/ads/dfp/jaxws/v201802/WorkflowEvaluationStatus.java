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
 * <p>Java class for WorkflowEvaluationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowEvaluationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="TRIGGERED"/>
 *     &lt;enumeration value="NOT_TRIGGERED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowEvaluationStatus")
@XmlEnum
public enum WorkflowEvaluationStatus {


    /**
     * 
     *                 The workflow external condition is pending evaluation.
     *               
     * 
     */
    PENDING,

    /**
     * 
     *                 The workflow external condition has been triggered.
     *               
     * 
     */
    TRIGGERED,

    /**
     * 
     *                 The workflow external condition has not been triggered.
     *               
     * 
     */
    NOT_TRIGGERED,

    /**
     * 
     *                 The associated proposal was retracted, this rule is no longer valid.
     *               
     * 
     */
    CANCELLED,

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

    public static WorkflowEvaluationStatus fromValue(String v) {
        return valueOf(v);
    }

}

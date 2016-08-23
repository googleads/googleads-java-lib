// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExperimentDeltaStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExperimentDeltaStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXPERIMENT_ONLY"/>
 *     &lt;enumeration value="MODIFIED"/>
 *     &lt;enumeration value="CONTROL_ONLY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExperimentDeltaStatus")
@XmlEnum
public enum ExperimentDeltaStatus {


    /**
     * 
     *                 The entity is added only to the Experiment split.
     *               
     * 
     */
    EXPERIMENT_ONLY,

    /**
     * 
     *                 The entity is present in the Control split and is modified in the Experiment split.
     *               
     * 
     */
    MODIFIED,

    /**
     * 
     *                 The entity is present only in the Control split - it is suppressed from the Experiment split.
     *               
     * 
     */
    CONTROL_ONLY,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ExperimentDeltaStatus fromValue(String v) {
        return valueOf(v);
    }

}

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


package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExperimentServingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExperimentServingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RUNNING"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="ENDED"/>
 *     &lt;enumeration value="REMOVED"/>
 *     &lt;enumeration value="PROMOTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExperimentServingStatus")
@XmlEnum
public enum ExperimentServingStatus {


    /**
     * 
     *                 Experiment is currently active and receiving traffic
     *               
     * 
     */
    RUNNING,

    /**
     * 
     *                 Experiment has not started running yet i.e. start date has not reached yet
     *               
     * 
     */
    PENDING,

    /**
     * 
     *                 Experiment has already ended, but not promoted or removed.
     *               
     * 
     */
    ENDED,

    /**
     * 
     *                 Experiment has been removed.
     *               
     * 
     */
    REMOVED,

    /**
     * 
     *                 Changes from the experiment have been applied.
     *               
     * 
     */
    PROMOTED;

    public String value() {
        return name();
    }

    public static ExperimentServingStatus fromValue(String v) {
        return valueOf(v);
    }

}

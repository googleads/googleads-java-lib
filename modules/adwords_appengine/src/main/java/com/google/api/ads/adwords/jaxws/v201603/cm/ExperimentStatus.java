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
 * <p>Java class for ExperimentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExperimentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENABLED"/>
 *     &lt;enumeration value="REMOVED"/>
 *     &lt;enumeration value="PROMOTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExperimentStatus")
@XmlEnum
public enum ExperimentStatus {


    /**
     * 
     *                 Experiment is currently active and can get traffic.
     *               
     * 
     */
    ENABLED,

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

    public static ExperimentStatus fromValue(String v) {
        return valueOf(v);
    }

}

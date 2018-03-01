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
 * <p>Java class for EfficiencyTargetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EfficiencyTargetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="CPA_LESS_THAN_OR_EQUAL_TO"/>
 *     &lt;enumeration value="CPC_LESS_THAN_OR_EQUAL_TO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EfficiencyTargetType")
@XmlEnum
public enum EfficiencyTargetType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 A value that is used to clear an efficiency target when it has already been set.
     *                 This value will never be persisted.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 An efficiency target that aims for average CPA over the runtime of the
     *                 performance target to be less than or equal to some value.
     *               
     * 
     */
    CPA_LESS_THAN_OR_EQUAL_TO,

    /**
     * 
     *                 An efficiency target that aims for average CPC over the runtime of the
     *                 performance target to be less than or equal to some value.
     *               
     * 
     */
    CPC_LESS_THAN_OR_EQUAL_TO;

    public String value() {
        return name();
    }

    public static EfficiencyTargetType fromValue(String v) {
        return valueOf(v);
    }

}

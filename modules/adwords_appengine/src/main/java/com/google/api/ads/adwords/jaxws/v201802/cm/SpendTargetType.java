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
 * <p>Java class for SpendTargetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpendTargetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="MINIMUM"/>
 *     &lt;enumeration value="MAXIMUM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpendTargetType")
@XmlEnum
public enum SpendTargetType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 A value that is used to clear a spend target type when it has already been set.
     *                 This value will never be persisted.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 A spend target that indicates that over the course of the performance target at
     *                 least the specified amount of money should be spent.
     *               
     * 
     */
    MINIMUM,

    /**
     * 
     *                 A spend target that indicates that over the course of the performance target at
     *                 most the specified amount of money should be spent.
     *               
     * 
     */
    MAXIMUM;

    public String value() {
        return name();
    }

    public static SpendTargetType fromValue(String v) {
        return valueOf(v);
    }

}

// Copyright 2015 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgrammaticStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgrammaticStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRE_APPROVAL"/>
 *     &lt;enumeration value="PENDING_BUYER_APPROVAL"/>
 *     &lt;enumeration value="BUYER_APPROVED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgrammaticStatus")
@XmlEnum
public enum ProgrammaticStatus {


    /**
     * 
     *                 The associated status of the {@link Order} is not approved.
     *               
     * 
     */
    PRE_APPROVAL,

    /**
     * 
     *                 The {@link Order} has been submitted for buyer approval.
     *               
     * 
     */
    PENDING_BUYER_APPROVAL,

    /**
     * 
     *                 The {@link Order} has been approved by the buyer.
     *               
     * 
     */
    BUYER_APPROVED,

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

    public static ProgrammaticStatus fromValue(String v) {
        return valueOf(v);
    }

}

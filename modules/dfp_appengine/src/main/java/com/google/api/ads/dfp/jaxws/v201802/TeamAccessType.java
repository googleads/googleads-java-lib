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
 * <p>Java class for TeamAccessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TeamAccessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="READ_ONLY"/>
 *     &lt;enumeration value="READ_WRITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TeamAccessType")
@XmlEnum
public enum TeamAccessType {


    /**
     * 
     *                 The level of access in which team members cannot view or edit a team's
     *                 orders.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 The level of access in which team members can only view a team's orders.
     *               
     * 
     */
    READ_ONLY,

    /**
     * 
     *                 The level of access in which team members can view and edit a team's
     *                 orders.
     *               
     * 
     */
    READ_WRITE;

    public String value() {
        return name();
    }

    public static TeamAccessType fromValue(String v) {
        return valueOf(v);
    }

}

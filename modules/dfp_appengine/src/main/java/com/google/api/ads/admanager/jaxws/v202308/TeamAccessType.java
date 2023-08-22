// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202308;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamAccessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TeamAccessType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="READ_ONLY"/&gt;
 *     &lt;enumeration value="READ_WRITE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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

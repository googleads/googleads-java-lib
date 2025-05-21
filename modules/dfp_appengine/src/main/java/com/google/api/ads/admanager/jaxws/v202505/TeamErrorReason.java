// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeamError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TeamError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENTITY_NOT_ON_USERS_TEAMS"/&gt;
 *     &lt;enumeration value="AD_UNITS_NOT_ON_ORDER_TEAMS"/&gt;
 *     &lt;enumeration value="PLACEMENTS_NOT_ON_ORDER_TEAMS"/&gt;
 *     &lt;enumeration value="MISSING_USERS_TEAM"/&gt;
 *     &lt;enumeration value="ALL_TEAM_ASSOCIATION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="INVALID_TEAM_ASSIGNMENT"/&gt;
 *     &lt;enumeration value="CANNOT_UPDATE_INACTIVE_TEAM"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TeamError.Reason")
@XmlEnum
public enum TeamErrorReason {


    /**
     * 
     *                 User cannot use this entity because it is not on any of the user's teams.
     *               
     * 
     */
    ENTITY_NOT_ON_USERS_TEAMS,

    /**
     * 
     *                 The targeted or excluded ad unit must be on the order's teams.
     *               
     * 
     */
    AD_UNITS_NOT_ON_ORDER_TEAMS,

    /**
     * 
     *                 The targeted placement must be on the order's teams.
     *               
     * 
     */
    PLACEMENTS_NOT_ON_ORDER_TEAMS,

    /**
     * 
     *                 Entity cannot be created because it is not on any of the user's teams.
     *               
     * 
     */
    MISSING_USERS_TEAM,

    /**
     * 
     *                 A team that gives access to all entities of a given type cannot be
     *                 associated with an entity of that type.
     *               
     * 
     */
    ALL_TEAM_ASSOCIATION_NOT_ALLOWED,

    /**
     * 
     *                 The assignment of team to entities is invalid.
     *               
     * 
     */
    INVALID_TEAM_ASSIGNMENT,

    /**
     * 
     *                 Cannot modify or create a team with an inactive status.
     *               
     * 
     */
    CANNOT_UPDATE_INACTIVE_TEAM,

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

    public static TeamErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

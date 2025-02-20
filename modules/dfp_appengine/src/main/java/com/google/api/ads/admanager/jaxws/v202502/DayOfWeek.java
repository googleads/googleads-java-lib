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


package com.google.api.ads.admanager.jaxws.v202502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayOfWeek.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeek"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MONDAY"/&gt;
 *     &lt;enumeration value="TUESDAY"/&gt;
 *     &lt;enumeration value="WEDNESDAY"/&gt;
 *     &lt;enumeration value="THURSDAY"/&gt;
 *     &lt;enumeration value="FRIDAY"/&gt;
 *     &lt;enumeration value="SATURDAY"/&gt;
 *     &lt;enumeration value="SUNDAY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeek")
@XmlEnum
public enum DayOfWeek {


    /**
     * 
     *                 The day of week named Monday.
     *               
     * 
     */
    MONDAY,

    /**
     * 
     *                 The day of week named Tuesday.
     *               
     * 
     */
    TUESDAY,

    /**
     * 
     *                 The day of week named Wednesday.
     *               
     * 
     */
    WEDNESDAY,

    /**
     * 
     *                 The day of week named Thursday.
     *               
     * 
     */
    THURSDAY,

    /**
     * 
     *                 The day of week named Friday.
     *               
     * 
     */
    FRIDAY,

    /**
     * 
     *                 The day of week named Saturday.
     *               
     * 
     */
    SATURDAY,

    /**
     * 
     *                 The day of week named Sunday.
     *               
     * 
     */
    SUNDAY;

    public String value() {
        return name();
    }

    public static DayOfWeek fromValue(String v) {
        return valueOf(v);
    }

}

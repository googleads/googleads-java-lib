// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativePersistenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativePersistenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_PERSISTENT"/>
 *     &lt;enumeration value="PERSISTENT_AND_EXCLUDE_NONE"/>
 *     &lt;enumeration value="PERSISTENT_AND_EXCLUDE_DISPLAY"/>
 *     &lt;enumeration value="PERSISTENT_AND_EXCLUDE_VIDEO"/>
 *     &lt;enumeration value="PERSISTENT_AND_EXCLUDE_ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativePersistenceType")
@XmlEnum
public enum CreativePersistenceType {


    /**
     * 
     *                 Not persistent or exclusive.
     *               
     * 
     */
    NOT_PERSISTENT,

    /**
     * 
     *                 Persistent and does not exclude ads.
     *               
     * 
     */
    PERSISTENT_AND_EXCLUDE_NONE,

    /**
     * 
     *                 Persistent and excludes display ads only.
     *               
     * 
     */
    PERSISTENT_AND_EXCLUDE_DISPLAY,

    /**
     * 
     *                 Persistent and excludes video ads only.
     *               
     * 
     */
    PERSISTENT_AND_EXCLUDE_VIDEO,

    /**
     * 
     *                 Persistent and excludes all other ads.
     *               
     * 
     */
    PERSISTENT_AND_EXCLUDE_ALL;

    public String value() {
        return name();
    }

    public static CreativePersistenceType fromValue(String v) {
        return valueOf(v);
    }

}

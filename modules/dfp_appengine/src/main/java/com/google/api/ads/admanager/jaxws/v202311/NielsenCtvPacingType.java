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


package com.google.api.ads.admanager.jaxws.v202311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NielsenCtvPacingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NielsenCtvPacingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="COVIEW"/&gt;
 *     &lt;enumeration value="STRICT_COVIEW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NielsenCtvPacingType")
@XmlEnum
public enum NielsenCtvPacingType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The value returned if Nielsen measurement is disabled for connected devices.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 Indicates that Nielsen impressions on connected devices are included, and we apply coviewing in
     *                 pacing.
     *               
     * 
     */
    COVIEW,

    /**
     * 
     *                 Indicates that Nielsen impressions on connected devices are included, and we apply strict
     *                 coviewing in pacing.
     *               
     * 
     */
    STRICT_COVIEW;

    public String value() {
        return name();
    }

    public static NielsenCtvPacingType fromValue(String v) {
        return valueOf(v);
    }

}

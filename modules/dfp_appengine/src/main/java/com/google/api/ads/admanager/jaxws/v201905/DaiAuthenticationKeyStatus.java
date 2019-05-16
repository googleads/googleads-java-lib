// Copyright 2019 Google LLC
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


package com.google.api.ads.admanager.jaxws.v201905;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaiAuthenticationKeyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaiAuthenticationKeyStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DaiAuthenticationKeyStatus")
@XmlEnum
public enum DaiAuthenticationKeyStatus {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Indicates that the API key is actively in use and that the IMA SDK API should accept it as a
     *                 valid key in requests.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Indicates that the API key is no longer is use and that the IMA SDK API should not accept it
     *                 as a valid key in requests.
     *               
     * 
     */
    INACTIVE;

    public String value() {
        return name();
    }

    public static DaiAuthenticationKeyStatus fromValue(String v) {
        return valueOf(v);
    }

}

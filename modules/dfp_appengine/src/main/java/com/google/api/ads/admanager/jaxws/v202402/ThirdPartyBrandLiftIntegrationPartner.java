// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202402;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyBrandLiftIntegrationPartner.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThirdPartyBrandLiftIntegrationPartner"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="KANTAR_MILLWARD_BROWN"/&gt;
 *     &lt;enumeration value="DYNATA"/&gt;
 *     &lt;enumeration value="INTAGE"/&gt;
 *     &lt;enumeration value="MACROMILL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ThirdPartyBrandLiftIntegrationPartner")
@XmlEnum
public enum ThirdPartyBrandLiftIntegrationPartner {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Indicates there's no third-party brand lift integration partner.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 Indicates third-party brand lift integration partner Kantar.
     *               
     * 
     */
    KANTAR_MILLWARD_BROWN,

    /**
     * 
     *                 Indicates third-party brand lift integration partner Dynata.
     *               
     * 
     */
    DYNATA,

    /**
     * 
     *                 Indicates third-party brand lift integration partner Intage.
     *               
     * 
     */
    INTAGE,

    /**
     * 
     *                 Indicates third-party brand lift integration partner Macromill.
     *               
     * 
     */
    MACROMILL;

    public String value() {
        return name();
    }

    public static ThirdPartyBrandLiftIntegrationPartner fromValue(String v) {
        return valueOf(v);
    }

}

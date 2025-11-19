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


package com.google.api.ads.admanager.jaxws.v202511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyViewabilityIntegrationPartner.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThirdPartyViewabilityIntegrationPartner"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="MOAT"/&gt;
 *     &lt;enumeration value="DOUBLE_VERIFY"/&gt;
 *     &lt;enumeration value="INTEGRAL_AD_SCIENCE"/&gt;
 *     &lt;enumeration value="COMSCORE"/&gt;
 *     &lt;enumeration value="TELEMETRY"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ThirdPartyViewabilityIntegrationPartner")
@XmlEnum
public enum ThirdPartyViewabilityIntegrationPartner {


    /**
     * 
     *                 Indicates there's no third-party viewability integration partner.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 Indicates third-party viewability integration partner Oracle Moat.
     *               
     * 
     */
    MOAT,

    /**
     * 
     *                 Indicates third-party viewability integration partner Double Verify.
     *               
     * 
     */
    DOUBLE_VERIFY,

    /**
     * 
     *                 Indicates third-party viewability integration partner Integral Ad Science.
     *               
     * 
     */
    INTEGRAL_AD_SCIENCE,

    /**
     * 
     *                 Indicates third-party viewability integration partner Comscore.
     *               
     * 
     */
    COMSCORE,

    /**
     * 
     *                 Indicates third-party viewability integration partner Telemetry.
     *               
     * 
     */
    TELEMETRY,

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

    public static ThirdPartyViewabilityIntegrationPartner fromValue(String v) {
        return valueOf(v);
    }

}

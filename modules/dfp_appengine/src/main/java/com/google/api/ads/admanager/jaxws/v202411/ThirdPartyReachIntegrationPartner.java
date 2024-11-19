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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyReachIntegrationPartner.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThirdPartyReachIntegrationPartner"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="COMSCORE"/&gt;
 *     &lt;enumeration value="NIELSEN"/&gt;
 *     &lt;enumeration value="KANTAR_MILLWARD_BROWN"/&gt;
 *     &lt;enumeration value="VIDEO_RESEARCH"/&gt;
 *     &lt;enumeration value="GEMIUS"/&gt;
 *     &lt;enumeration value="VIDEO_AMP"/&gt;
 *     &lt;enumeration value="ISPOT_TV"/&gt;
 *     &lt;enumeration value="AUDIENCE_PROJECT"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ThirdPartyReachIntegrationPartner")
@XmlEnum
public enum ThirdPartyReachIntegrationPartner {


    /**
     * 
     *                 Indicates there's no third-party reach integration partner.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 Indicates third-party reach integration partner Comscore.
     *               
     * 
     */
    COMSCORE,

    /**
     * 
     *                 Indicates third-party reach integration partner Nielsen.
     *               
     * 
     */
    NIELSEN,

    /**
     * 
     *                 Indicates third-party reach integration partner Kantar.
     *               
     * 
     */
    KANTAR_MILLWARD_BROWN,

    /**
     * 
     *                 Indicates third-party reach integration partner Video Research.
     *               
     * 
     */
    VIDEO_RESEARCH,

    /**
     * 
     *                 Indicates third-party reach integration partner Gemius.
     *               
     * 
     */
    GEMIUS,

    /**
     * 
     *                 Indicates third-party reach integration partner VideoAmp
     *               
     * 
     */
    VIDEO_AMP,

    /**
     * 
     *                 Indicates third-party reach integration partner iSpot.TV
     *               
     * 
     */
    ISPOT_TV,

    /**
     * 
     *                 Indicates third-party reach integration partner Audience Project
     *               
     * 
     */
    AUDIENCE_PROJECT,

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

    public static ThirdPartyReachIntegrationPartner fromValue(String v) {
        return valueOf(v);
    }

}

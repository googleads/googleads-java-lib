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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniversalAppCampaignAsset.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UniversalAppCampaignAsset">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="COMBINATION"/>
 *     &lt;enumeration value="APP_DESTINATION"/>
 *     &lt;enumeration value="APP_ASSETS"/>
 *     &lt;enumeration value="DESCRIPTION_1"/>
 *     &lt;enumeration value="DESCRIPTION_2"/>
 *     &lt;enumeration value="DESCRIPTION_3"/>
 *     &lt;enumeration value="DESCRIPTION_4"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="IMAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UniversalAppCampaignAsset")
@XmlEnum
public enum UniversalAppCampaignAsset {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Identifies a combination of assets.
     *               
     * 
     */
    COMBINATION,

    /**
     * 
     *                 Identifies the app destination.
     *               
     * 
     */
    APP_DESTINATION,

    /**
     * 
     *                 Identifies the app related data, like app name, app icon, developer name
     *                 including translations of the content.
     *               
     * 
     */
    APP_ASSETS,

    /**
     * 
     *                 Identifies the campaign setting's description1 field.
     *               
     * 
     */
    DESCRIPTION_1,

    /**
     * 
     *                 Identifies the campaign setting's description2 field.
     *               
     * 
     */
    DESCRIPTION_2,

    /**
     * 
     *                 Identifies the campaign setting's description3 field.
     *               
     * 
     */
    DESCRIPTION_3,

    /**
     * 
     *                 Identifies the campaign setting's description4 field.
     *               
     * 
     */
    DESCRIPTION_4,

    /**
     * 
     *                 Identifies the campaign setting's video fields.
     *               
     * 
     */
    VIDEO,

    /**
     * 
     *                 Identifies the campaign setting's image fields.
     *               
     * 
     */
    IMAGE;

    public String value() {
        return name();
    }

    public static UniversalAppCampaignAsset fromValue(String v) {
        return valueOf(v);
    }

}

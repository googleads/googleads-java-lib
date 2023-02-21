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


package com.google.api.ads.admanager.jaxws.v202302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileApplicationPlatform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileApplicationPlatform">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ANDROID"/>
 *     &lt;enumeration value="IOS"/>
 *     &lt;enumeration value="ROKU"/>
 *     &lt;enumeration value="AMAZON_FIRETV"/>
 *     &lt;enumeration value="PLAYSTATION"/>
 *     &lt;enumeration value="XBOX"/>
 *     &lt;enumeration value="SAMSUNG_TV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobileApplicationPlatform")
@XmlEnum
public enum MobileApplicationPlatform {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,
    ANDROID,
    IOS,
    ROKU,
    AMAZON_FIRETV,
    PLAYSTATION,
    XBOX,
    SAMSUNG_TV;

    public String value() {
        return name();
    }

    public static MobileApplicationPlatform fromValue(String v) {
        return valueOf(v);
    }

}

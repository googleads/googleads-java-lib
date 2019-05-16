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
 * <p>Java class for RequestPlatform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestPlatform">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="BROWSER"/>
 *     &lt;enumeration value="MOBILE_APP"/>
 *     &lt;enumeration value="VIDEO_PLAYER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestPlatform")
@XmlEnum
public enum RequestPlatform {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Represents a request made from a web browser. This includes both desktop and mobile web.
     *               
     * 
     */
    BROWSER,

    /**
     * 
     *                 Represents a request made from a mobile application. This includes mobile app interstitial and
     *                 rewarded video requests.
     *               
     * 
     */
    MOBILE_APP,

    /**
     * 
     *                 Represents a request made from a video player that is playing publisher content. This includes
     *                 video players embedded in web pages and mobile applications, and connected TV screens.
     *               
     * 
     */
    VIDEO_PLAYER;

    public String value() {
        return name();
    }

    public static RequestPlatform fromValue(String v) {
        return valueOf(v);
    }

}

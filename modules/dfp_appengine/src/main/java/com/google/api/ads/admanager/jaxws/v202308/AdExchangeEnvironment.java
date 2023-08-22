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


package com.google.api.ads.admanager.jaxws.v202308;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExchangeEnvironment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdExchangeEnvironment"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISPLAY"/&gt;
 *     &lt;enumeration value="VIDEO"/&gt;
 *     &lt;enumeration value="GAMES"/&gt;
 *     &lt;enumeration value="MOBILE"/&gt;
 *     &lt;enumeration value="MOBILE_OUTSTREAM_VIDEO"/&gt;
 *     &lt;enumeration value="DISPLAY_OUTSTREAM_VIDEO"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdExchangeEnvironment")
@XmlEnum
public enum AdExchangeEnvironment {


    /**
     * 
     *                 Ads serve in a browser.
     *               
     * 
     */
    DISPLAY,

    /**
     * 
     *                 In-stream video ads serve in a video.
     *               
     * 
     */
    VIDEO,

    /**
     * 
     *                 In-stream video ads serve in a game.
     *               
     * 
     */
    GAMES,

    /**
     * 
     *                 Ads serve in a mobile app.
     *               
     * 
     */
    MOBILE,

    /**
     * 
     *                 Out-stream video ads serve in a mobile app. Examples include mobile app interstitials and
     *                 mobile app rewarded ads.
     *               
     * 
     */
    MOBILE_OUTSTREAM_VIDEO,

    /**
     * 
     *                 Out-stream video ads serve in a browser. Examples include in-feed and in-banner video ads.
     *               
     * 
     */
    DISPLAY_OUTSTREAM_VIDEO,

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

    public static AdExchangeEnvironment fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for VideoAdTagError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoAdTagError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MISSING_REQUIRED_FIELDS"/&gt;
 *     &lt;enumeration value="NO_LIVE_TRAFFIC"/&gt;
 *     &lt;enumeration value="NO_VOD_TRAFFIC"/&gt;
 *     &lt;enumeration value="INVALID_AD_TAG_HOST"/&gt;
 *     &lt;enumeration value="INVALID_SCHEME"/&gt;
 *     &lt;enumeration value="INVALID_AD_OUTPUT_FORMAT"/&gt;
 *     &lt;enumeration value="DUPLICATE_AD_TAG_PARAMETER"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VideoAdTagError.Reason")
@XmlEnum
public enum VideoAdTagErrorReason {


    /**
     * 
     *                 One or more required fields are not specified in the ad tag.
     *               
     * 
     */
    MISSING_REQUIRED_FIELDS,

    /**
     * 
     *                 Ad tag URL is not a live traffic URL. Url should start with:
     *                 https://pubads.g.doubleclick.net/gampad/live/ads,
     *                 not https://pubads.g.doubleclick.net/gampad/ads
     *               
     * 
     */
    NO_LIVE_TRAFFIC,

    /**
     * 
     *                 Ad tag URL is not a VOD traffic URL. Url should start with:
     *                 https://pubads.g.doubleclick.net/gampad/ads , not
     *                 https://pubads.g.doubleclick.net/gampad/live/ads
     *               
     * 
     */
    NO_VOD_TRAFFIC,

    /**
     * 
     *                 URL hostname is not a valid Google Publisher Tag or Freewheel Tag host name.
     *               
     * 
     */
    INVALID_AD_TAG_HOST,

    /**
     * 
     *                 Only HTTPS is supported.
     *               
     * 
     */
    INVALID_SCHEME,

    /**
     * 
     *                 Invalid ad output format. Settings for VAST and VMAP must be aligned.
     *               
     * 
     */
    INVALID_AD_OUTPUT_FORMAT,

    /**
     * 
     *                 The ad tag has a duplicate parameter. Only one is allowed.
     *               
     * 
     */
    DUPLICATE_AD_TAG_PARAMETER,

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

    public static VideoAdTagErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

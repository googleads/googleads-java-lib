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
 * <p>Java class for ThirdPartyRedirectAd.ExpandingDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThirdPartyRedirectAd.ExpandingDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="EXPANDING_UP"/>
 *     &lt;enumeration value="EXPANDING_DOWN"/>
 *     &lt;enumeration value="EXPANDING_LEFT"/>
 *     &lt;enumeration value="EXPANDING_RIGHT"/>
 *     &lt;enumeration value="EXPANDING_UPLEFT"/>
 *     &lt;enumeration value="EXPANDING_UPRIGHT"/>
 *     &lt;enumeration value="EXPANDING_DOWNLEFT"/>
 *     &lt;enumeration value="EXPANDING_DOWNRIGHT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThirdPartyRedirectAd.ExpandingDirection")
@XmlEnum
public enum ThirdPartyRedirectAdExpandingDirection {


    /**
     * 
     *                 Whether the ad can be expanded is unknown.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The ad is allowed to expand upward.
     *               
     * 
     */
    EXPANDING_UP,

    /**
     * 
     *                 The ad is allowed to expand downward.
     *               
     * 
     */
    EXPANDING_DOWN,

    /**
     * 
     *                 The ad is allowed to expand leftward.
     *               
     * 
     */
    EXPANDING_LEFT,

    /**
     * 
     *                 The ad is allowed to expand rightward.
     *               
     * 
     */
    EXPANDING_RIGHT,

    /**
     * 
     *                 The ad is allowed to expand toward the up-left corner.
     *               
     * 
     */
    EXPANDING_UPLEFT,

    /**
     * 
     *                 The ad is allowed to expand toward the up-right corner.
     *               
     * 
     */
    EXPANDING_UPRIGHT,

    /**
     * 
     *                 The ad is allowed to expand toward the down-left corner.
     *               
     * 
     */
    EXPANDING_DOWNLEFT,

    /**
     * 
     *                 The ad is allowed to expand toward the down-right corner.
     *               
     * 
     */
    EXPANDING_DOWNRIGHT;

    public String value() {
        return name();
    }

    public static ThirdPartyRedirectAdExpandingDirection fromValue(String v) {
        return valueOf(v);
    }

}

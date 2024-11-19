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
 * <p>Java class for YieldFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YieldFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="BANNER"/&gt;
 *     &lt;enumeration value="INTERSTITIAL"/&gt;
 *     &lt;enumeration value="NATIVE"/&gt;
 *     &lt;enumeration value="VIDEO_VAST"/&gt;
 *     &lt;enumeration value="REWARDED"/&gt;
 *     &lt;enumeration value="REWARDED_INTERSTITIAL"/&gt;
 *     &lt;enumeration value="APP_OPEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "YieldFormat")
@XmlEnum
public enum YieldFormat {

    UNKNOWN,
    BANNER,
    INTERSTITIAL,
    NATIVE,
    VIDEO_VAST,
    REWARDED,
    REWARDED_INTERSTITIAL,
    APP_OPEN;

    public String value() {
        return name();
    }

    public static YieldFormat fromValue(String v) {
        return valueOf(v);
    }

}

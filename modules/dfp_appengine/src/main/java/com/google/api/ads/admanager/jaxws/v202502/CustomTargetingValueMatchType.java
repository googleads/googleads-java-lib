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


package com.google.api.ads.admanager.jaxws.v202502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomTargetingValue.MatchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomTargetingValue.MatchType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXACT"/&gt;
 *     &lt;enumeration value="BROAD"/&gt;
 *     &lt;enumeration value="PREFIX"/&gt;
 *     &lt;enumeration value="BROAD_PREFIX"/&gt;
 *     &lt;enumeration value="SUFFIX"/&gt;
 *     &lt;enumeration value="CONTAINS"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomTargetingValue.MatchType")
@XmlEnum
public enum CustomTargetingValueMatchType {


    /**
     * 
     *                 Used for exact matching. For example, the targeting value {@code car=honda} will only match
     *                 to the ad request {@code car=honda}.
     *               
     * 
     */
    EXACT,

    /**
     * 
     *                 Used for lenient matching when at least one of the words in the ad request matches the
     *                 targeted value. The targeting value {@code car=honda} will match to ad requests containing
     *                 the word {@code honda}. So ad requests {@code car=honda} or {@code car=honda civic} or {@code
     *                 car=buy honda} or {@code car=how much does a honda cost} will all have the line item
     *                 delivered.
     *                 
     *                 <p>This match type can not be used within an audience segment rule.
     *               
     * 
     */
    BROAD,

    /**
     * 
     *                 Used for 'starts with' matching when the first few characters in the ad request match all of
     *                 the characters in the targeted value. The targeting value {@code car=honda} will match to ad
     *                 requests {@code car=honda} or {@code car=hondas for sale} but not to {@code car=I want a
     *                 honda}.
     *               
     * 
     */
    PREFIX,

    /**
     * 
     *                 This is a combination of {@code MatchType#BROAD} and {@code MatchType#PREFIX} matching. The
     *                 targeting value {@code car=honda} will match to ad requests that contain words that start
     *                 with the characters in the targeted value, for example with {@code car=civic hondas}.
     *                 
     *                 <p>This match type can not be used within an audience segment rule.
     *               
     * 
     */
    BROAD_PREFIX,

    /**
     * 
     *                 Used for 'ends with' matching when the last characters in the ad request match all of the
     *                 characters in the targeted value. The targeting value {@code car=honda} will match with ad
     *                 requests {@code car=honda} or {@code car=I want a honda} but not to {@code car=hondas for
     *                 sale}.
     *                 
     *                 <p>This match type can not be used within line item targeting.
     *               
     * 
     */
    SUFFIX,

    /**
     * 
     *                 Used for 'within' matching when the string in the ad request contains the string in the
     *                 targeted value. The targeting value {@code car=honda} will match with ad requests {@code
     *                 car=honda}, {@code car=I want a honda}, and also with {@code car=hondas for sale}, but not
     *                 with {@code car=misspelled hond a}.
     *                 
     *                 <p>This match type can not be used within line item targeting.
     *               
     * 
     */
    CONTAINS,

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

    public static CustomTargetingValueMatchType fromValue(String v) {
        return valueOf(v);
    }

}

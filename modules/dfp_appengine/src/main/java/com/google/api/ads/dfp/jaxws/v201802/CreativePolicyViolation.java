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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativePolicyViolation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativePolicyViolation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MALWARE_IN_CREATIVE"/>
 *     &lt;enumeration value="MALWARE_IN_LANDING_PAGE"/>
 *     &lt;enumeration value="LEGALLY_BLOCKED_REDIRECT_URL"/>
 *     &lt;enumeration value="MISREPRESENTATION_OF_PRODUCT"/>
 *     &lt;enumeration value="SELF_CLICKING_CREATIVE"/>
 *     &lt;enumeration value="GAMING_GOOGLE_NETWORK"/>
 *     &lt;enumeration value="DYNAMIC_DNS"/>
 *     &lt;enumeration value="PHISHING"/>
 *     &lt;enumeration value="DOWNLOAD_PROMPT_IN_CREATIVE"/>
 *     &lt;enumeration value="UNAUTHORIZED_COOKIE_DETECTED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativePolicyViolation")
@XmlEnum
public enum CreativePolicyViolation {


    /**
     * 
     *                 Malware was found in the creative.
     *                 
     *                 <p>For more information see
     *                 <a href="https://support.google.com/adwordspolicy/answer/1308246">here</a>.
     *               
     * 
     */
    MALWARE_IN_CREATIVE,

    /**
     * 
     *                 Malware was found in the landing page.
     *                 
     *                 <p>For more information see
     *                 <a href="https://support.google.com/adwordspolicy/answer/1308246">here</a>.
     *               
     * 
     */
    MALWARE_IN_LANDING_PAGE,

    /**
     * 
     *                 The redirect url contains legally objectionable content.
     *               
     * 
     */
    LEGALLY_BLOCKED_REDIRECT_URL,

    /**
     * 
     *                 The creative misrepresents the product or service being advertised.
     *                 
     *                 <p>For more information see
     *                 <a href="https://support.google.com/adwordspolicy/answer/6020955?hl=en#355">here</a>.
     *               
     * 
     */
    MISREPRESENTATION_OF_PRODUCT,

    /**
     * 
     *                 The creative has been determined to be self clicking.
     *               
     * 
     */
    SELF_CLICKING_CREATIVE,

    /**
     * 
     *                 The creative has been determined as attempting to game the Google network.
     *                 
     *                 <p>For more information see
     *                 <a href="https://support.google.com/adwordspolicy/answer/6020954?hl=en#319">here</a>.
     *               
     * 
     */
    GAMING_GOOGLE_NETWORK,

    /**
     * 
     *                 The landing page for the creative uses a dynamic DNS.
     *                 
     *                 <p>For more information see
     *                 <a href="https://support.google.com/adwordspolicy/answer/6020954?rd=1">here</a>.
     *               
     * 
     */
    DYNAMIC_DNS,

    /**
     * 
     *                 Phishing found in creative or landing page.
     *                 
     *                 <p>For more information see
     *                 <a href="https://support.google.com/adwordspolicy/answer/6020955">here</a>.
     *               
     * 
     */
    PHISHING,

    /**
     * 
     *                 The creative prompts the user to download a file.
     *                 
     *                 <p>For more information see
     *                 <a href="https://support.google.com/dfp_premium/answer/7513391">here</a>
     *               
     * 
     */
    DOWNLOAD_PROMPT_IN_CREATIVE,

    /**
     * 
     *                 The creative sets an unauthorized cookie on a Google domain.
     *                 
     *                 <p>For more information see <a
     *                 href="https://support.google.com/dfp_premium/answer/7513391">here</a>
     *               
     * 
     */
    UNAUTHORIZED_COOKIE_DETECTED,

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

    public static CreativePolicyViolation fromValue(String v) {
        return valueOf(v);
    }

}

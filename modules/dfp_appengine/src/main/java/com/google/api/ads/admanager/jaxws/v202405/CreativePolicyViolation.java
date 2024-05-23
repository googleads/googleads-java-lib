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


package com.google.api.ads.admanager.jaxws.v202405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativePolicyViolation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativePolicyViolation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MALWARE_IN_CREATIVE"/&gt;
 *     &lt;enumeration value="MALWARE_IN_LANDING_PAGE"/&gt;
 *     &lt;enumeration value="LEGALLY_BLOCKED_REDIRECT_URL"/&gt;
 *     &lt;enumeration value="MISREPRESENTATION_OF_PRODUCT"/&gt;
 *     &lt;enumeration value="SELF_CLICKING_CREATIVE"/&gt;
 *     &lt;enumeration value="GAMING_GOOGLE_NETWORK"/&gt;
 *     &lt;enumeration value="DYNAMIC_DNS"/&gt;
 *     &lt;enumeration value="CIRCUMVENTING_SYSTEMS"/&gt;
 *     &lt;enumeration value="PHISHING"/&gt;
 *     &lt;enumeration value="DOWNLOAD_PROMPT_IN_CREATIVE"/&gt;
 *     &lt;enumeration value="UNAUTHORIZED_COOKIE_DETECTED"/&gt;
 *     &lt;enumeration value="TEMPORARY_PAUSE_FOR_VENDOR_INVESTIGATION"/&gt;
 *     &lt;enumeration value="ABUSIVE_EXPERIENCE"/&gt;
 *     &lt;enumeration value="TRICK_TO_CLICK"/&gt;
 *     &lt;enumeration value="USE_OF_NON_ALLOWLISTED_OMID_VERIFICATION_SCRIPT"/&gt;
 *     &lt;enumeration value="MISUSE_OF_OMID_API"/&gt;
 *     &lt;enumeration value="UNACCEPTABLE_HTML_AD"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
     *                 <a href="https://support.google.com/adspolicy/answer/1308246">here</a>.
     *               
     * 
     */
    MALWARE_IN_CREATIVE,

    /**
     * 
     *                 Malware was found in the landing page.
     *                 
     *                 <p>For more information see
     *                 <a href="https://support.google.com/adspolicy/answer/1308246">here</a>.
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
     *                 <a href="https://support.google.com/adspolicy/answer/6020955">here</a>.
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
     *                 <a href="https://support.google.com/adspolicy/answer/6020954#319">here</a>.
     *               
     * 
     */
    GAMING_GOOGLE_NETWORK,

    /**
     * 
     *                 The landing page for the creative uses a dynamic DNS.
     *                 
     *                 <p>For more information see
     *                 <a href="https://support.google.com/adspolicy/answer/6020954">here</a>.
     *               
     * 
     */
    DYNAMIC_DNS,

    /**
     * 
     *                 The creative has been determined as attempting to circumvent Google advertising systems.
     *               
     * 
     */
    CIRCUMVENTING_SYSTEMS,

    /**
     * 
     *                 Phishing found in creative or landing page.
     *                 
     *                 <p>For more information see
     *                 <a href="https://support.google.com/adspolicy/answer/6020955">here</a>.
     *               
     * 
     */
    PHISHING,

    /**
     * 
     *                 The creative prompts the user to download a file.
     *                 
     *                 <p>For more information see
     *                 <a href="https://support.google.com/admanager/answer/7513391">here</a>
     *               
     * 
     */
    DOWNLOAD_PROMPT_IN_CREATIVE,

    /**
     * 
     *                 The creative sets an unauthorized cookie on a Google domain.
     *                 
     *                 <p>For more information see <a
     *                 href="https://support.google.com/admanager/answer/7513391">here</a>
     *               
     * 
     */
    UNAUTHORIZED_COOKIE_DETECTED,

    /**
     * 
     *                 The creative has been temporarily paused while we investigate.
     *               
     * 
     */
    TEMPORARY_PAUSE_FOR_VENDOR_INVESTIGATION,

    /**
     * 
     *                 The landing page contains an abusive experience.
     *                 
     *                 <p>For more information see <a
     *                 href="https://support.google.com/webtools/answer/7347327">here</a>.
     *               
     * 
     */
    ABUSIVE_EXPERIENCE,

    /**
     * 
     *                 The creative is designed to mislead or trick the user into interacting with it.
     *                 
     *                 <p>For more information see <a
     *                 href="https://support.google.com/adwordspolicy/answer/6020955#357">here</a>.
     *               
     * 
     */
    TRICK_TO_CLICK,

    /**
     * 
     *                 Non-allowlisted OMID verification script.
     *                 
     *                 <p>For more information see <a
     *                 href="https://support.google.com/authorizedbuyers/answer/9115752">here</a>.
     *               
     * 
     */
    USE_OF_NON_ALLOWLISTED_OMID_VERIFICATION_SCRIPT,

    /**
     * 
     *                 OMID sdk injected by creative.
     *                 
     *                 < p>For more information see <a
     *                 href="https://support.google.com/authorizedbuyers/answer/9115752">here</a>.
     *               
     * 
     */
    MISUSE_OF_OMID_API,

    /**
     * 
     *                 Unacceptable HTML5 ad.
     *                 
     *                 <p>For more information see <a
     *                 href="https://support.google.com/adspolicy/answer/6088505#266">here</a>.
     *               
     * 
     */
    UNACCEPTABLE_HTML_AD,

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

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
 * <p>Java class for OnboardingTask.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OnboardingTask"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="BILLING_PROFILE_CREATION"/&gt;
 *     &lt;enumeration value="PHONE_PIN_VERIFICATION"/&gt;
 *     &lt;enumeration value="AD_MANAGER_ACCOUNT_SETUP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnboardingTask")
@XmlEnum
public enum OnboardingTask {

    UNKNOWN,

    /**
     * 
     *                 Creation of the child publisher's payments billing profile.
     *               
     * 
     */
    BILLING_PROFILE_CREATION,

    /**
     * 
     *                 Verification of the child publisher's phone number.
     *               
     * 
     */
    PHONE_PIN_VERIFICATION,

    /**
     * 
     *                 Setup of the child publisher's Ad Manager account.
     *               
     * 
     */
    AD_MANAGER_ACCOUNT_SETUP;

    public String value() {
        return name();
    }

    public static OnboardingTask fromValue(String v) {
        return valueOf(v);
    }

}

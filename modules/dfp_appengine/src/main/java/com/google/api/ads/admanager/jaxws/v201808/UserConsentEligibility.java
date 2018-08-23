// Copyright 2018 Google LLC
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


package com.google.api.ads.admanager.jaxws.v201808;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserConsentEligibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserConsentEligibility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="CONSENTED_OR_NPA"/>
 *     &lt;enumeration value="CONSENTED_ONLY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserConsentEligibility")
@XmlEnum
public enum UserConsentEligibility {


    /**
     * 
     *                 Don't serve for any EEA ad request. This line item is not eligible to serve on any
     *                 requests that originate in the EEA regardless of the consent bit in request.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 Don't limit serving. The network has marked this line item as one that does not use any
     *                 personalized data. The line item is therefore eligible to serve on requests regardless of
     *                 users' consent designations (in other words, for requests that have <b>either</b> NPA=1 or no
     *                 NPA).
     *               
     * 
     */
    CONSENTED_OR_NPA,

    /**
     * 
     *                 Don't serve for non-personalized ad requests. The network has marked this line item as being
     *                 eligible to serve on any consented request (i.e., on requests that <b>do not</b> have NPA=1).
     *                 
     *                 The network therefore takes responsibility for gathering consent from the user for any data
     *                 sharing that may occur from third parties present on the creatives that are associated with
     *                 this line item.
     *                 
     *                 If a non-consented request (a request that <b>does</b> have NPA=1) is received, this line item
     *                 will <b>not</b> be eligible for match.
     *               
     * 
     */
    CONSENTED_ONLY,

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

    public static UserConsentEligibility fromValue(String v) {
        return valueOf(v);
    }

}

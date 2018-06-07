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


package com.google.api.ads.adwords.jaxws.v201806.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyTopicEvidenceDestinationMismatchUrlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyTopicEvidenceDestinationMismatchUrlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="DISPLAY_URL"/>
 *     &lt;enumeration value="FINAL_URL"/>
 *     &lt;enumeration value="FINAL_MOBILE_URL"/>
 *     &lt;enumeration value="TRACKING_URL"/>
 *     &lt;enumeration value="MOBILE_TRACKING_URL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PolicyTopicEvidenceDestinationMismatchUrlType")
@XmlEnum
public enum PolicyTopicEvidenceDestinationMismatchUrlType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,
    DISPLAY_URL,
    FINAL_URL,
    FINAL_MOBILE_URL,

    /**
     * 
     *                 Tracking template with substituted desktop url.
     *               
     * 
     */
    TRACKING_URL,

    /**
     * 
     *                 Tracking template with substituted mobile url.
     *               
     * 
     */
    MOBILE_TRACKING_URL;

    public String value() {
        return name();
    }

    public static PolicyTopicEvidenceDestinationMismatchUrlType fromValue(String v) {
        return valueOf(v);
    }

}

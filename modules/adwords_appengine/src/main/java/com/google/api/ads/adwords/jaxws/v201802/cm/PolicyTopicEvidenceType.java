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
 * <p>Java class for PolicyTopicEvidenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyTopicEvidenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="AD_TEXT"/>
 *     &lt;enumeration value="HTTP_CODE"/>
 *     &lt;enumeration value="WEBSITES"/>
 *     &lt;enumeration value="LANGUAGE"/>
 *     &lt;enumeration value="DESTINATION_TEXT_LIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PolicyTopicEvidenceType")
@XmlEnum
public enum PolicyTopicEvidenceType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Evidence found in the text of the ad.
     *               
     * 
     */
    AD_TEXT,

    /**
     * 
     *                 HTTP code returned when the final URL was crawled.
     *               
     * 
     */
    HTTP_CODE,

    /**
     * 
     *                 List of websites linked with this ad.
     *               
     * 
     */
    WEBSITES,

    /**
     * 
     *                 The language the ad was detected to be written in.
     *               
     * 
     */
    LANGUAGE,

    /**
     * 
     *                 The text in the destination of the ad that is causing a policy violation.
     *               
     * 
     */
    DESTINATION_TEXT_LIST;

    public String value() {
        return name();
    }

    public static PolicyTopicEvidenceType fromValue(String v) {
        return valueOf(v);
    }

}

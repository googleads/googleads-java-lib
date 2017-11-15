// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceSegment.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudienceSegment.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIRST_PARTY"/>
 *     &lt;enumeration value="SHARED"/>
 *     &lt;enumeration value="THIRD_PARTY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudienceSegment.Type")
@XmlEnum
public enum AudienceSegmentType {


    /**
     * 
     *                 First party segments created and owned by the publisher.
     *               
     * 
     */
    FIRST_PARTY,

    /**
     * 
     *                 First party segments shared by other clients.
     *               
     * 
     */
    SHARED,

    /**
     * 
     *                 Third party segments licensed by the publisher from data providers. This doesn't include
     *                 Google-provided licensed segments.
     *               
     * 
     */
    THIRD_PARTY,

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

    public static AudienceSegmentType fromValue(String v) {
        return valueOf(v);
    }

}

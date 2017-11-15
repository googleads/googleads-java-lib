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
 * <p>Java class for SkippableAdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SkippableAdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="DISABLED"/>
 *     &lt;enumeration value="ENABLED"/>
 *     &lt;enumeration value="INSTREAM_SELECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SkippableAdType")
@XmlEnum
public enum SkippableAdType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Skippable ad type is disabled.
     *               
     * 
     */
    DISABLED,

    /**
     * 
     *                 Skippable ad type is enabled.
     *               
     * 
     */
    ENABLED,

    /**
     * 
     *                 Skippable in-stream ad type.
     *               
     * 
     */
    INSTREAM_SELECT;

    public String value() {
        return name();
    }

    public static SkippableAdType fromValue(String v) {
        return valueOf(v);
    }

}

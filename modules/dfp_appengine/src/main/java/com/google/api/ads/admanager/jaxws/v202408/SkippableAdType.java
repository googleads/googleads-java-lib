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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SkippableAdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SkippableAdType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="DISABLED"/&gt;
 *     &lt;enumeration value="ENABLED"/&gt;
 *     &lt;enumeration value="INSTREAM_SELECT"/&gt;
 *     &lt;enumeration value="ANY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
    INSTREAM_SELECT,

    /**
     * 
     *                 Any skippable or not skippable. This is only for programmatic case when the creative
     *                 skippability is decided by the buyside.
     *               
     * 
     */
    ANY;

    public String value() {
        return name();
    }

    public static SkippableAdType fromValue(String v) {
        return valueOf(v);
    }

}

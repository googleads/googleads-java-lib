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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginForwardingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OriginForwardingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ORIGIN_PATH"/&gt;
 *     &lt;enumeration value="CONVENTIONAL"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OriginForwardingType")
@XmlEnum
public enum OriginForwardingType {


    /**
     * 
     *                 Indicates that origin forwarding is set up by passing an originpath query
     *                 string parameter (necessary for Akamai dynamic packaging to work)
     *               
     * 
     */
    ORIGIN_PATH,

    /**
     * 
     *                 Indicates that conventional origin forwarding is used.
     *               
     * 
     */
    CONVENTIONAL,

    /**
     * 
     *                 Indicates that origin forwarding is not being used.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static OriginForwardingType fromValue(String v) {
        return valueOf(v);
    }

}

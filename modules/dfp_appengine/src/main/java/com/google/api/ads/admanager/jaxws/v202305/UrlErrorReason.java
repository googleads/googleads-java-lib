// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202305;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrlError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UrlError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_USE_RESERVED_URL"/>
 *     &lt;enumeration value="CANNOT_USE_GOOGLE_URL"/>
 *     &lt;enumeration value="INVALID_URL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UrlError.Reason")
@XmlEnum
public enum UrlErrorReason {


    /**
     * 
     *                 The URL has been reserved, and not available for usage.
     *               
     * 
     */
    CANNOT_USE_RESERVED_URL,

    /**
     * 
     *                 The URL belongs to Google, and not available for usage.
     *               
     * 
     */
    CANNOT_USE_GOOGLE_URL,

    /**
     * 
     *                 The URL is invalid.
     *               
     * 
     */
    INVALID_URL,

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

    public static UrlErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

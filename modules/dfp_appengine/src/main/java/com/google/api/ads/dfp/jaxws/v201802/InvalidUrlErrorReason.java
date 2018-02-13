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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidUrlError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvalidUrlError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ILLEGAL_CHARACTERS"/>
 *     &lt;enumeration value="INVALID_FORMAT"/>
 *     &lt;enumeration value="INSECURE_SCHEME"/>
 *     &lt;enumeration value="NO_SCHEME"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvalidUrlError.Reason")
@XmlEnum
public enum InvalidUrlErrorReason {


    /**
     * 
     *                 The URL contains invalid characters.
     *               
     * 
     */
    ILLEGAL_CHARACTERS,

    /**
     * 
     *                 The format of the URL is not allowed. This could occur for a number of
     *                 reasons. For example, if an invalid scheme is specified (like "ftp://")
     *                 or if a port is specified when not required, or if a query was specified
     *                 when not required.
     *               
     * 
     */
    INVALID_FORMAT,

    /**
     * 
     *                 URL contains insecure scheme.
     *               
     * 
     */
    INSECURE_SCHEME,

    /**
     * 
     *                 The URL does not contain a scheme.
     *               
     * 
     */
    NO_SCHEME,

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

    public static InvalidUrlErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

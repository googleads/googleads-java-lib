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


package com.google.api.ads.admanager.jaxws.v202511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringFormatError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StringFormatError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="ILLEGAL_CHARS"/&gt;
 *     &lt;enumeration value="INVALID_FORMAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StringFormatError.Reason")
@XmlEnum
public enum StringFormatErrorReason {

    UNKNOWN,

    /**
     * 
     *                 The input string value contains disallowed characters.
     *               
     * 
     */
    ILLEGAL_CHARS,

    /**
     * 
     *                 The input string value is invalid for the associated field.
     *               
     * 
     */
    INVALID_FORMAT;

    public String value() {
        return name();
    }

    public static StringFormatErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

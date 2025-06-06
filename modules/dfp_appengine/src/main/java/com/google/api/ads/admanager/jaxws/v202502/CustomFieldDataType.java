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


package com.google.api.ads.admanager.jaxws.v202502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STRING"/&gt;
 *     &lt;enumeration value="NUMBER"/&gt;
 *     &lt;enumeration value="TOGGLE"/&gt;
 *     &lt;enumeration value="DROP_DOWN"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomFieldDataType")
@XmlEnum
public enum CustomFieldDataType {


    /**
     * 
     *                 A string field. The max length is 255 characters.
     *               
     * 
     */
    STRING,

    /**
     * 
     *                 A number field.
     *               
     * 
     */
    NUMBER,

    /**
     * 
     *                 A boolean field. Values may be "true", "false",
     *                 or empty.
     *               
     * 
     */
    TOGGLE,

    /**
     * 
     *                 A drop-down field. Values may only be the ids
     *                 of {@link CustomFieldOption} objects.
     *               
     * 
     */
    DROP_DOWN,

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

    public static CustomFieldDataType fromValue(String v) {
        return valueOf(v);
    }

}

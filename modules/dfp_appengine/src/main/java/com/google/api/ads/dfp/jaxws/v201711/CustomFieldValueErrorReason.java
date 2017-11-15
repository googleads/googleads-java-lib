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
 * <p>Java class for CustomFieldValueError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldValueError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOM_FIELD_NOT_FOUND"/>
 *     &lt;enumeration value="CUSTOM_FIELD_INACTIVE"/>
 *     &lt;enumeration value="CUSTOM_FIELD_OPTION_NOT_FOUND"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomFieldValueError.Reason")
@XmlEnum
public enum CustomFieldValueErrorReason {


    /**
     * 
     *                 An attempt was made to modify or create a {@link CustomFieldValue} for
     *                 a {@link CustomField} that does not exist.
     *               
     * 
     */
    CUSTOM_FIELD_NOT_FOUND,

    /**
     * 
     *                 An attempt was made to create a new value for a custom field
     *                 that is inactive.
     *               
     * 
     */
    CUSTOM_FIELD_INACTIVE,

    /**
     * 
     *                 An attempt was made to modify or create a {@link CustomFieldValue} corresponding
     *                 to a {@link CustomFieldOption} that could not be found.
     *               
     * 
     */
    CUSTOM_FIELD_OPTION_NOT_FOUND,

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

    public static CustomFieldValueErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

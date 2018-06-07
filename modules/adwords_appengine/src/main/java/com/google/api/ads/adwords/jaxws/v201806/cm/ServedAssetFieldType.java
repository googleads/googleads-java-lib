// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201806.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServedAssetFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServedAssetFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="HEADLINE_1"/>
 *     &lt;enumeration value="HEADLINE_2"/>
 *     &lt;enumeration value="HEADLINE_3"/>
 *     &lt;enumeration value="DESCRIPTION_1"/>
 *     &lt;enumeration value="DESCRIPTION_2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServedAssetFieldType")
@XmlEnum
public enum ServedAssetFieldType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The asset is not placed in a specific field. This can be used to clear a
     *                 pinnedField.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 The asset was used in headline 1.
     *               
     * 
     */
    HEADLINE_1,

    /**
     * 
     *                 The asset was used in headline 2.
     *               
     * 
     */
    HEADLINE_2,

    /**
     * 
     *                 The asset was used in headline 3.
     *               
     * 
     */
    HEADLINE_3,

    /**
     * 
     *                 The asset was used in description 1.
     *               
     * 
     */
    DESCRIPTION_1,

    /**
     * 
     *                 The asset was used in description 2.
     *               
     * 
     */
    DESCRIPTION_2;

    public String value() {
        return name();
    }

    public static ServedAssetFieldType fromValue(String v) {
        return valueOf(v);
    }

}

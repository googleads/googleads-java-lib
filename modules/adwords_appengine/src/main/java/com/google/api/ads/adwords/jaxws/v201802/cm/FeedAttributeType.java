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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedAttribute.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedAttribute.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INT64"/>
 *     &lt;enumeration value="FLOAT"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="URL"/>
 *     &lt;enumeration value="DATE_TIME"/>
 *     &lt;enumeration value="INT64_LIST"/>
 *     &lt;enumeration value="FLOAT_LIST"/>
 *     &lt;enumeration value="STRING_LIST"/>
 *     &lt;enumeration value="BOOLEAN_LIST"/>
 *     &lt;enumeration value="URL_LIST"/>
 *     &lt;enumeration value="DATE_TIME_LIST"/>
 *     &lt;enumeration value="PRICE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedAttribute.Type")
@XmlEnum
public enum FeedAttributeType {

    @XmlEnumValue("INT64")
    INT_64("INT64"),
    FLOAT("FLOAT"),
    STRING("STRING"),
    BOOLEAN("BOOLEAN"),
    URL("URL"),
    DATE_TIME("DATE_TIME"),
    @XmlEnumValue("INT64_LIST")
    INT_64_LIST("INT64_LIST"),
    FLOAT_LIST("FLOAT_LIST"),
    STRING_LIST("STRING_LIST"),
    BOOLEAN_LIST("BOOLEAN_LIST"),
    URL_LIST("URL_LIST"),
    DATE_TIME_LIST("DATE_TIME_LIST"),
    PRICE("PRICE"),

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    FeedAttributeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedAttributeType fromValue(String v) {
        for (FeedAttributeType c: FeedAttributeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

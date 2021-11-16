// Copyright 2021 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202111;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContainerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContainerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="FMP4"/>
 *     &lt;enumeration value="HLS_AUDIO"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContainerType")
@XmlEnum
public enum ContainerType {


    /**
     * 
     *                 Transport stream (TS) container.
     *               
     * 
     */
    TS("TS"),

    /**
     * 
     *                 Fragmented MPEG-4 (fMP4) output container.
     *               
     * 
     */
    @XmlEnumValue("FMP4")
    FMP_4("FMP4"),

    /**
     * 
     *                 HTTP live streaming (HLS) packed audio container.
     *               
     * 
     */
    HLS_AUDIO("HLS_AUDIO"),

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    ContainerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContainerType fromValue(String v) {
        for (ContainerType c: ContainerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

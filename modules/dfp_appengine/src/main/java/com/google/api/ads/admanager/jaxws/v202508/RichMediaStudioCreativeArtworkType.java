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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RichMediaStudioCreativeArtworkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RichMediaStudioCreativeArtworkType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FLASH"/&gt;
 *     &lt;enumeration value="HTML5"/&gt;
 *     &lt;enumeration value="MIXED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RichMediaStudioCreativeArtworkType")
@XmlEnum
public enum RichMediaStudioCreativeArtworkType {


    /**
     * 
     *                 The creative is a Flash creative.
     *               
     * 
     */
    FLASH("FLASH"),

    /**
     * 
     *                 The creative is HTML5.
     *               
     * 
     */
    @XmlEnumValue("HTML5")
    HTML_5("HTML5"),

    /**
     * 
     *                 The creative is Flash if available, and HTML5 otherwise.
     *               
     * 
     */
    MIXED("MIXED");
    private final String value;

    RichMediaStudioCreativeArtworkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RichMediaStudioCreativeArtworkType fromValue(String v) {
        for (RichMediaStudioCreativeArtworkType c: RichMediaStudioCreativeArtworkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

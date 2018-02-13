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
 * <p>Java class for Html5Feature.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Html5Feature">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASIC_SVG"/>
 *     &lt;enumeration value="SVG_FILTERS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Html5Feature")
@XmlEnum
public enum Html5Feature {


    /**
     * 
     *                 Requires a basic SVG animation.
     *               
     * 
     */
    BASIC_SVG,

    /**
     * 
     *                 Requires support for SVG filter based animation.
     *               
     * 
     */
    SVG_FILTERS,

    /**
     * 
     *                 The feature is not known or defined in newer versions.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static Html5Feature fromValue(String v) {
        return valueOf(v);
    }

}

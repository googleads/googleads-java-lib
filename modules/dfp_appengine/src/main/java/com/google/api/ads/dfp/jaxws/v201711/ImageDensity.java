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
 * <p>Java class for ImageDensity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageDensity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ONE_TO_ONE"/>
 *     &lt;enumeration value="THREE_TO_TWO"/>
 *     &lt;enumeration value="TWO_TO_ONE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageDensity")
@XmlEnum
public enum ImageDensity {


    /**
     * 
     *                 Indicates that there is a 1:1 ratio between the dimensions of the raw image and the dimensions
     *                 that it should be displayed at in device-independent pixels.
     *               
     * 
     */
    ONE_TO_ONE,

    /**
     * 
     *                 Indicates that there is a 3:2 ratio between the dimensions of the raw image and the dimensions
     *                 that it should be displayed at in device-independent pixels.
     *               
     * 
     */
    THREE_TO_TWO,

    /**
     * 
     *                 Indicates that there is a 2:1 ratio between the dimensions of the raw image and the dimensions
     *                 that it should be displayed at in device-independent pixels.
     *               
     * 
     */
    TWO_TO_ONE,

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

    public static ImageDensity fromValue(String v) {
        return valueOf(v);
    }

}

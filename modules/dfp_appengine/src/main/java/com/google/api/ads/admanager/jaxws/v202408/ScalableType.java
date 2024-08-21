// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScalableType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScalableType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="NOT_SCALABLE"/&gt;
 *     &lt;enumeration value="RATIO_SCALABLE"/&gt;
 *     &lt;enumeration value="STRETCH_SCALABLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScalableType")
@XmlEnum
public enum ScalableType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The creative should not be scaled.
     *               
     * 
     */
    NOT_SCALABLE,

    /**
     * 
     *                 The creative can be scaled and its aspect-ratio must be maintained.
     *               
     * 
     */
    RATIO_SCALABLE,

    /**
     * 
     *                 The creative can be scaled and its aspect-ratio can be distorted.
     *               
     * 
     */
    STRETCH_SCALABLE;

    public String value() {
        return name();
    }

    public static ScalableType fromValue(String v) {
        return valueOf(v);
    }

}

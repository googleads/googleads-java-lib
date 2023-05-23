// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202305;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoPosition.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoPosition.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="PREROLL"/>
 *     &lt;enumeration value="MIDROLL"/>
 *     &lt;enumeration value="POSTROLL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoPosition.Type")
@XmlEnum
public enum VideoPositionType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 This position targets all of the above video positions.
     *               
     * 
     */
    ALL,

    /**
     * 
     *                 The position defined as showing before the video starts playing.
     *               
     * 
     */
    PREROLL,

    /**
     * 
     *                 The position defined as showing within the middle of the playing video.
     *               
     * 
     */
    MIDROLL,

    /**
     * 
     *                 The position defined as showing after the video is completed.
     *               
     * 
     */
    POSTROLL;

    public String value() {
        return name();
    }

    public static VideoPositionType fromValue(String v) {
        return valueOf(v);
    }

}

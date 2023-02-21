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


package com.google.api.ads.admanager.jaxws.v202302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariantType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VariantType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MEDIA"/>
 *     &lt;enumeration value="IFRAME"/>
 *     &lt;enumeration value="SUBTITLES"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VariantType")
@XmlEnum
public enum VariantType {


    /**
     * 
     *                 Media variant playlist type. Media playlists may: contain audio only, video only, or audio and
     *                 video.
     *               
     * 
     */
    MEDIA,

    /**
     * 
     *                 iFrame variant playlist type. iFrame playlists may: contain video or contain audio and video
     *                 (i.e. video must be present).
     *               
     * 
     */
    IFRAME,

    /**
     * 
     *                 Subtitles variant playlist type.
     *               
     * 
     */
    SUBTITLES,

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

    public static VariantType fromValue(String v) {
        return valueOf(v);
    }

}

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


package com.google.api.ads.admanager.jaxws.v202105;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaiEncodingProfileVariantSettingsError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaiEncodingProfileVariantSettingsError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTAINER_TYPE_REQUIRED"/>
 *     &lt;enumeration value="VIDEO_SETTINGS_NOT_ALLOWED"/>
 *     &lt;enumeration value="AUDIO_SETTINGS_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DaiEncodingProfileVariantSettingsError.Reason")
@XmlEnum
public enum DaiEncodingProfileVariantSettingsErrorReason {


    /**
     * 
     *                 Container type is required for a {@code MEDIA} or {@code IFRAME} variant.
     *               
     * 
     */
    CONTAINER_TYPE_REQUIRED,

    /**
     * 
     *                 Video settings are only allowed for {@code MEDIA} or {@code IFRAME} variant types.
     *               
     * 
     */
    VIDEO_SETTINGS_NOT_ALLOWED,

    /**
     * 
     *                 Audio settings are only allowed for {@code MEDIA} or {@code IFRAME} variant types.
     *               
     * 
     */
    AUDIO_SETTINGS_NOT_ALLOWED,

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

    public static DaiEncodingProfileVariantSettingsErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

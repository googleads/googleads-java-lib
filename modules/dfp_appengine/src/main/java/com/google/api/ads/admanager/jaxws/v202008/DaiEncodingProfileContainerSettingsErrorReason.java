// Copyright 2020 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaiEncodingProfileContainerSettingsError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaiEncodingProfileContainerSettingsError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TS_MUST_HAVE_AUDIO_OR_VIDEO_SETTINGS"/>
 *     &lt;enumeration value="FMP4_MUST_HAVE_EITHER_AUDIO_OR_VIDEO_SETTINGS"/>
 *     &lt;enumeration value="HLS_AUDIO_MUST_HAVE_ONLY_AUDIO_SETTINGS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DaiEncodingProfileContainerSettingsError.Reason")
@XmlEnum
public enum DaiEncodingProfileContainerSettingsErrorReason {


    /**
     * 
     *                 Profiles with {@code TS} container type must have at least one of audio or video settings
     *                 present.
     *               
     * 
     */
    TS_MUST_HAVE_AUDIO_OR_VIDEO_SETTINGS("TS_MUST_HAVE_AUDIO_OR_VIDEO_SETTINGS"),

    /**
     * 
     *                 Profiles with {@code FMP4} container type must have at exactly one of audio or video settings
     *                 present.
     *               
     * 
     */
    @XmlEnumValue("FMP4_MUST_HAVE_EITHER_AUDIO_OR_VIDEO_SETTINGS")
    FMP_4_MUST_HAVE_EITHER_AUDIO_OR_VIDEO_SETTINGS("FMP4_MUST_HAVE_EITHER_AUDIO_OR_VIDEO_SETTINGS"),

    /**
     * 
     *                 Profiles with {@code HLS_AUDIO} container type must only have audio settings present.
     *               
     * 
     */
    HLS_AUDIO_MUST_HAVE_ONLY_AUDIO_SETTINGS("HLS_AUDIO_MUST_HAVE_ONLY_AUDIO_SETTINGS"),

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    DaiEncodingProfileContainerSettingsErrorReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DaiEncodingProfileContainerSettingsErrorReason fromValue(String v) {
        for (DaiEncodingProfileContainerSettingsErrorReason c: DaiEncodingProfileContainerSettingsErrorReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Java class for Media.MimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Media.MimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMAGE_JPEG"/>
 *     &lt;enumeration value="IMAGE_GIF"/>
 *     &lt;enumeration value="IMAGE_PNG"/>
 *     &lt;enumeration value="FLASH"/>
 *     &lt;enumeration value="TEXT_HTML"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="MSWORD"/>
 *     &lt;enumeration value="MSEXCEL"/>
 *     &lt;enumeration value="RTF"/>
 *     &lt;enumeration value="AUDIO_WAV"/>
 *     &lt;enumeration value="AUDIO_MP3"/>
 *     &lt;enumeration value="HTML5_AD_ZIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Media.MimeType")
@XmlEnum
public enum MediaMimeType {


    /**
     * 
     *                 MIME type of image/jpeg
     *               
     * 
     */
    IMAGE_JPEG("IMAGE_JPEG"),

    /**
     * 
     *                 MIME type of image/gif
     *               
     * 
     */
    IMAGE_GIF("IMAGE_GIF"),

    /**
     * 
     *                 MIME type of image/png
     *               
     * 
     */
    IMAGE_PNG("IMAGE_PNG"),

    /**
     * 
     *                 MIME type of application/x-shockwave-flash
     *               
     * 
     */
    FLASH("FLASH"),

    /**
     * 
     *                 MIME type of text/html
     *               
     * 
     */
    TEXT_HTML("TEXT_HTML"),

    /**
     * 
     *                 MIME type of application/pdf
     *               
     * 
     */
    PDF("PDF"),

    /**
     * 
     *                 MIME type of application/msword
     *               
     * 
     */
    MSWORD("MSWORD"),

    /**
     * 
     *                 MIME type of application/vnd.ms-excel
     *               
     * 
     */
    MSEXCEL("MSEXCEL"),

    /**
     * 
     *                 MIME type of application/rtf
     *               
     * 
     */
    RTF("RTF"),

    /**
     * 
     *                 MIME type of audio/wav
     *               
     * 
     */
    AUDIO_WAV("AUDIO_WAV"),

    /**
     * 
     *                 MIME type of audio/mp3
     *               
     * 
     */
    @XmlEnumValue("AUDIO_MP3")
    AUDIO_MP_3("AUDIO_MP3"),

    /**
     * 
     *                 MIME type of application/x-html5-ad-zip
     *               
     * 
     */
    @XmlEnumValue("HTML5_AD_ZIP")
    HTML_5_AD_ZIP("HTML5_AD_ZIP");
    private final String value;

    MediaMimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaMimeType fromValue(String v) {
        for (MediaMimeType c: MediaMimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

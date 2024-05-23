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


package com.google.api.ads.admanager.jaxws.v202405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MimeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="ASP"/&gt;
 *     &lt;enumeration value="AUDIO_AIFF"/&gt;
 *     &lt;enumeration value="AUDIO_BASIC"/&gt;
 *     &lt;enumeration value="AUDIO_FLAC"/&gt;
 *     &lt;enumeration value="AUDIO_MID"/&gt;
 *     &lt;enumeration value="AUDIO_MP3"/&gt;
 *     &lt;enumeration value="AUDIO_MP4"/&gt;
 *     &lt;enumeration value="AUDIO_MPEG_URL"/&gt;
 *     &lt;enumeration value="AUDIO_MS_WMA"/&gt;
 *     &lt;enumeration value="AUDIO_OGG"/&gt;
 *     &lt;enumeration value="AUDIO_REAL_AUDIO_PLUGIN"/&gt;
 *     &lt;enumeration value="AUDIO_WAV"/&gt;
 *     &lt;enumeration value="BINARY"/&gt;
 *     &lt;enumeration value="DASH"/&gt;
 *     &lt;enumeration value="DIRECTOR"/&gt;
 *     &lt;enumeration value="FLASH"/&gt;
 *     &lt;enumeration value="GRAPHIC_CONVERTER"/&gt;
 *     &lt;enumeration value="JAVASCRIPT"/&gt;
 *     &lt;enumeration value="JSON"/&gt;
 *     &lt;enumeration value="IMAGE_BITMAP"/&gt;
 *     &lt;enumeration value="IMAGE_BMP"/&gt;
 *     &lt;enumeration value="IMAGE_GIF"/&gt;
 *     &lt;enumeration value="IMAGE_JPEG"/&gt;
 *     &lt;enumeration value="IMAGE_PHOTOSHOP"/&gt;
 *     &lt;enumeration value="IMAGE_PNG"/&gt;
 *     &lt;enumeration value="IMAGE_TIFF"/&gt;
 *     &lt;enumeration value="IMAGE_WBMP"/&gt;
 *     &lt;enumeration value="M3U8"/&gt;
 *     &lt;enumeration value="MAC_BIN_HEX_40"/&gt;
 *     &lt;enumeration value="MS_EXCEL"/&gt;
 *     &lt;enumeration value="MS_POWERPOINT"/&gt;
 *     &lt;enumeration value="MS_WORD"/&gt;
 *     &lt;enumeration value="OCTET_STREAM"/&gt;
 *     &lt;enumeration value="PDF"/&gt;
 *     &lt;enumeration value="POSTSCRIPT"/&gt;
 *     &lt;enumeration value="RN_REAL_MEDIA"/&gt;
 *     &lt;enumeration value="RFC_822"/&gt;
 *     &lt;enumeration value="RTF"/&gt;
 *     &lt;enumeration value="TEXT_CALENDAR"/&gt;
 *     &lt;enumeration value="TEXT_CSS"/&gt;
 *     &lt;enumeration value="TEXT_CSV"/&gt;
 *     &lt;enumeration value="TEXT_HTML"/&gt;
 *     &lt;enumeration value="TEXT_JAVA"/&gt;
 *     &lt;enumeration value="TEXT_PLAIN"/&gt;
 *     &lt;enumeration value="VIDEO_3GPP"/&gt;
 *     &lt;enumeration value="VIDEO_3GPP2"/&gt;
 *     &lt;enumeration value="VIDEO_AVI"/&gt;
 *     &lt;enumeration value="VIDEO_FLV"/&gt;
 *     &lt;enumeration value="VIDEO_MP4"/&gt;
 *     &lt;enumeration value="VIDEO_MP4V_ES"/&gt;
 *     &lt;enumeration value="VIDEO_MPEG"/&gt;
 *     &lt;enumeration value="VIDEO_MS_ASF"/&gt;
 *     &lt;enumeration value="VIDEO_MS_WM"/&gt;
 *     &lt;enumeration value="VIDEO_MS_WMV"/&gt;
 *     &lt;enumeration value="VIDEO_MS_WVX"/&gt;
 *     &lt;enumeration value="VIDEO_OGG"/&gt;
 *     &lt;enumeration value="VIDEO_QUICKTIME"/&gt;
 *     &lt;enumeration value="VIDEO_WEBM"/&gt;
 *     &lt;enumeration value="XAML"/&gt;
 *     &lt;enumeration value="XHTML"/&gt;
 *     &lt;enumeration value="XML"/&gt;
 *     &lt;enumeration value="ZIP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MimeType")
@XmlEnum
public enum MimeType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN("UNKNOWN"),

    /**
     * 
     *                 application/x-asp
     *               
     * 
     */
    ASP("ASP"),

    /**
     * 
     *                 audio/aiff
     *               
     * 
     */
    AUDIO_AIFF("AUDIO_AIFF"),

    /**
     * 
     *                 audio/basic
     *               
     * 
     */
    AUDIO_BASIC("AUDIO_BASIC"),

    /**
     * 
     *                 audio/flac
     *               
     * 
     */
    AUDIO_FLAC("AUDIO_FLAC"),

    /**
     * 
     *                 audio/mid
     *               
     * 
     */
    AUDIO_MID("AUDIO_MID"),

    /**
     * 
     *                 audio/mpeg
     *               
     * 
     */
    @XmlEnumValue("AUDIO_MP3")
    AUDIO_MP_3("AUDIO_MP3"),

    /**
     * 
     *                 audio/mp4
     *               
     * 
     */
    @XmlEnumValue("AUDIO_MP4")
    AUDIO_MP_4("AUDIO_MP4"),

    /**
     * 
     *                 audio/x-mpegurl
     *               
     * 
     */
    AUDIO_MPEG_URL("AUDIO_MPEG_URL"),

    /**
     * 
     *                 audio/x-ms-wma
     *               
     * 
     */
    AUDIO_MS_WMA("AUDIO_MS_WMA"),

    /**
     * 
     *                 audio/ogg
     *               
     * 
     */
    AUDIO_OGG("AUDIO_OGG"),

    /**
     * 
     *                 audio/x-pn-realaudio-plugin
     *               
     * 
     */
    AUDIO_REAL_AUDIO_PLUGIN("AUDIO_REAL_AUDIO_PLUGIN"),

    /**
     * 
     *                 audio/x-wav
     *               
     * 
     */
    AUDIO_WAV("AUDIO_WAV"),

    /**
     * 
     *                 application/binary
     *               
     * 
     */
    BINARY("BINARY"),

    /**
     * 
     *                 application/dash+xml
     *               
     * 
     */
    DASH("DASH"),

    /**
     * 
     *                 application/x-director
     *               
     * 
     */
    DIRECTOR("DIRECTOR"),

    /**
     * 
     *                 application/x-shockwave-flash
     *               
     * 
     */
    FLASH("FLASH"),

    /**
     * 
     *                 application/graphicconverter
     *               
     * 
     */
    GRAPHIC_CONVERTER("GRAPHIC_CONVERTER"),

    /**
     * 
     *                 application/x-javascript
     *               
     * 
     */
    JAVASCRIPT("JAVASCRIPT"),

    /**
     * 
     *                 application/json
     *               
     * 
     */
    JSON("JSON"),

    /**
     * 
     *                 image/x-win-bitmap
     *               
     * 
     */
    IMAGE_BITMAP("IMAGE_BITMAP"),

    /**
     * 
     *                 image/bmp
     *               
     * 
     */
    IMAGE_BMP("IMAGE_BMP"),

    /**
     * 
     *                 image/gif
     *               
     * 
     */
    IMAGE_GIF("IMAGE_GIF"),

    /**
     * 
     *                 image/jpeg
     *               
     * 
     */
    IMAGE_JPEG("IMAGE_JPEG"),

    /**
     * 
     *                 image/photoshop
     *               
     * 
     */
    IMAGE_PHOTOSHOP("IMAGE_PHOTOSHOP"),

    /**
     * 
     *                 image/png
     *               
     * 
     */
    IMAGE_PNG("IMAGE_PNG"),

    /**
     * 
     *                 image/tiff
     *               
     * 
     */
    IMAGE_TIFF("IMAGE_TIFF"),

    /**
     * 
     *                 image/vnd.wap.wbmp
     *               
     * 
     */
    IMAGE_WBMP("IMAGE_WBMP"),

    /**
     * 
     *                 application/x-mpegURL
     *               
     * 
     */
    @XmlEnumValue("M3U8")
    M_3_U_8("M3U8"),

    /**
     * 
     *                 application/mac-binhex40
     *               
     * 
     */
    MAC_BIN_HEX_40("MAC_BIN_HEX_40"),

    /**
     * 
     *                 application/vnd.ms-excel
     *               
     * 
     */
    MS_EXCEL("MS_EXCEL"),

    /**
     * 
     *                 application/ms-powerpoint
     *               
     * 
     */
    MS_POWERPOINT("MS_POWERPOINT"),

    /**
     * 
     *                 application/msword
     *               
     * 
     */
    MS_WORD("MS_WORD"),

    /**
     * 
     *                 application/octet-stream
     *               
     * 
     */
    OCTET_STREAM("OCTET_STREAM"),

    /**
     * 
     *                 application/pdf
     *               
     * 
     */
    PDF("PDF"),

    /**
     * 
     *                 application/postscript
     *               
     * 
     */
    POSTSCRIPT("POSTSCRIPT"),

    /**
     * 
     *                 application/vnd.rn-realmedia
     *               
     * 
     */
    RN_REAL_MEDIA("RN_REAL_MEDIA"),

    /**
     * 
     *                 message/rfc822
     *               
     * 
     */
    RFC_822("RFC_822"),

    /**
     * 
     *                 application/rtf
     *               
     * 
     */
    RTF("RTF"),

    /**
     * 
     *                 text/calendar
     *               
     * 
     */
    TEXT_CALENDAR("TEXT_CALENDAR"),

    /**
     * 
     *                 text/css
     *               
     * 
     */
    TEXT_CSS("TEXT_CSS"),

    /**
     * 
     *                 text/csv
     *               
     * 
     */
    TEXT_CSV("TEXT_CSV"),

    /**
     * 
     *                 text/html
     *               
     * 
     */
    TEXT_HTML("TEXT_HTML"),

    /**
     * 
     *                 text/java
     *               
     * 
     */
    TEXT_JAVA("TEXT_JAVA"),

    /**
     * 
     *                 text/plain
     *               
     * 
     */
    TEXT_PLAIN("TEXT_PLAIN"),

    /**
     * 
     *                 video/3gpp
     *               
     * 
     */
    @XmlEnumValue("VIDEO_3GPP")
    VIDEO_3_GPP("VIDEO_3GPP"),

    /**
     * 
     *                 video/3gpp2
     *               
     * 
     */
    @XmlEnumValue("VIDEO_3GPP2")
    VIDEO_3_GPP_2("VIDEO_3GPP2"),

    /**
     * 
     *                 video/avi
     *               
     * 
     */
    VIDEO_AVI("VIDEO_AVI"),

    /**
     * 
     *                 video/x-flv
     *               
     * 
     */
    VIDEO_FLV("VIDEO_FLV"),

    /**
     * 
     *                 video/mp4
     *               
     * 
     */
    @XmlEnumValue("VIDEO_MP4")
    VIDEO_MP_4("VIDEO_MP4"),

    /**
     * 
     *                 video/mp4v-es
     *               
     * 
     */
    @XmlEnumValue("VIDEO_MP4V_ES")
    VIDEO_MP_4_V_ES("VIDEO_MP4V_ES"),

    /**
     * 
     *                 video/mpeg
     *               
     * 
     */
    VIDEO_MPEG("VIDEO_MPEG"),

    /**
     * 
     *                 video/x-ms-asf
     *               
     * 
     */
    VIDEO_MS_ASF("VIDEO_MS_ASF"),

    /**
     * 
     *                 video/x-ms-wm
     *               
     * 
     */
    VIDEO_MS_WM("VIDEO_MS_WM"),

    /**
     * 
     *                 video/x-ms-wmv
     *               
     * 
     */
    VIDEO_MS_WMV("VIDEO_MS_WMV"),

    /**
     * 
     *                 video/x-ms-wvx
     *               
     * 
     */
    VIDEO_MS_WVX("VIDEO_MS_WVX"),

    /**
     * 
     *                 video/ogg
     *               
     * 
     */
    VIDEO_OGG("VIDEO_OGG"),

    /**
     * 
     *                 video/x-quicktime
     *               
     * 
     */
    VIDEO_QUICKTIME("VIDEO_QUICKTIME"),

    /**
     * 
     *                 video/webm
     *               
     * 
     */
    VIDEO_WEBM("VIDEO_WEBM"),

    /**
     * 
     *                 application/xaml+xml
     *               
     * 
     */
    XAML("XAML"),

    /**
     * 
     *                 application/xhtml+xml
     *               
     * 
     */
    XHTML("XHTML"),

    /**
     * 
     *                 application/xml
     *               
     * 
     */
    XML("XML"),

    /**
     * 
     *                 application/zip
     *               
     * 
     */
    ZIP("ZIP");
    private final String value;

    MimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MimeType fromValue(String v) {
        for (MimeType c: MimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

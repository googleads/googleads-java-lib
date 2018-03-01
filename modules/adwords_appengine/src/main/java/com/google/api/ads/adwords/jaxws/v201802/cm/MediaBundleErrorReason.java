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
 * <p>Java class for MediaBundleError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediaBundleError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENTRY_POINT_CANNOT_BE_SET_USING_MEDIA_SERVICE"/>
 *     &lt;enumeration value="BAD_REQUEST"/>
 *     &lt;enumeration value="DOUBLECLICK_BUNDLE_NOT_ALLOWED"/>
 *     &lt;enumeration value="EXTERNAL_URL_NOT_ALLOWED"/>
 *     &lt;enumeration value="FILE_TOO_LARGE"/>
 *     &lt;enumeration value="GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED"/>
 *     &lt;enumeration value="INVALID_INPUT"/>
 *     &lt;enumeration value="INVALID_MEDIA_BUNDLE"/>
 *     &lt;enumeration value="INVALID_MEDIA_BUNDLE_ENTRY"/>
 *     &lt;enumeration value="INVALID_MIME_TYPE"/>
 *     &lt;enumeration value="INVALID_PATH"/>
 *     &lt;enumeration value="INVALID_URL_REFERENCE"/>
 *     &lt;enumeration value="MEDIA_DATA_TOO_LARGE"/>
 *     &lt;enumeration value="MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY"/>
 *     &lt;enumeration value="SERVER_ERROR"/>
 *     &lt;enumeration value="STORAGE_ERROR"/>
 *     &lt;enumeration value="SWIFFY_BUNDLE_NOT_ALLOWED"/>
 *     &lt;enumeration value="TOO_MANY_FILES"/>
 *     &lt;enumeration value="UNEXPECTED_SIZE"/>
 *     &lt;enumeration value="UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT"/>
 *     &lt;enumeration value="UNSUPPORTED_HTML5_FEATURE"/>
 *     &lt;enumeration value="URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MediaBundleError.Reason")
@XmlEnum
public enum MediaBundleErrorReason {


    /**
     * 
     *                 The entryPoint field cannot be set using the <code>MediaService</code>.
     *               
     * 
     */
    ENTRY_POINT_CANNOT_BE_SET_USING_MEDIA_SERVICE("ENTRY_POINT_CANNOT_BE_SET_USING_MEDIA_SERVICE"),

    /**
     * 
     *                 There was a problem with the request.
     *               
     * 
     */
    BAD_REQUEST("BAD_REQUEST"),

    /**
     * 
     *                 HTML5 ads using DoubleClick Studio created ZIP files are not supported.
     *               
     * 
     */
    DOUBLECLICK_BUNDLE_NOT_ALLOWED("DOUBLECLICK_BUNDLE_NOT_ALLOWED"),

    /**
     * 
     *                 Cannot reference URL external to the media bundle.
     *               
     * 
     */
    EXTERNAL_URL_NOT_ALLOWED("EXTERNAL_URL_NOT_ALLOWED"),

    /**
     * 
     *                 Media bundle file is too large.
     *               
     * 
     */
    FILE_TOO_LARGE("FILE_TOO_LARGE"),

    /**
     * 
     *                 ZIP file from Google Web Designer is not published.
     *               
     * 
     */
    GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED("GOOGLE_WEB_DESIGNER_ZIP_FILE_NOT_PUBLISHED"),

    /**
     * 
     *                 Input was invalid.
     *               
     * 
     */
    INVALID_INPUT("INVALID_INPUT"),

    /**
     * 
     *                 There was a problem with the media bundle.
     *               
     * 
     */
    INVALID_MEDIA_BUNDLE("INVALID_MEDIA_BUNDLE"),

    /**
     * 
     *                 There was a problem with one or more of the media bundle entries.
     *               
     * 
     */
    INVALID_MEDIA_BUNDLE_ENTRY("INVALID_MEDIA_BUNDLE_ENTRY"),

    /**
     * 
     *                 The media bundle contains a file with an unknown mime type
     *               
     * 
     */
    INVALID_MIME_TYPE("INVALID_MIME_TYPE"),

    /**
     * 
     *                 The media bundle contain an invalid asset path.
     *               
     * 
     */
    INVALID_PATH("INVALID_PATH"),

    /**
     * 
     *                 HTML5 ad is trying to reference an asset not in .ZIP file
     *               
     * 
     */
    INVALID_URL_REFERENCE("INVALID_URL_REFERENCE"),

    /**
     * 
     *                 Media data is too large.
     *               
     * 
     */
    MEDIA_DATA_TOO_LARGE("MEDIA_DATA_TOO_LARGE"),

    /**
     * 
     *                 The media bundle contains no primary entry.
     *               
     * 
     */
    MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY("MISSING_PRIMARY_MEDIA_BUNDLE_ENTRY"),

    /**
     * 
     *                 There was an error on the server.
     *               
     * 
     */
    SERVER_ERROR("SERVER_ERROR"),

    /**
     * 
     *                 The image could not be stored.
     *               
     * 
     */
    STORAGE_ERROR("STORAGE_ERROR"),

    /**
     * 
     *                 Media bundle created with the Swiffy tool is not allowed.
     *               
     * 
     */
    SWIFFY_BUNDLE_NOT_ALLOWED("SWIFFY_BUNDLE_NOT_ALLOWED"),

    /**
     * 
     *                 The media bundle contains too many files.
     *               
     * 
     */
    TOO_MANY_FILES("TOO_MANY_FILES"),

    /**
     * 
     *                 The media bundle is not of legal dimensions.
     *               
     * 
     */
    UNEXPECTED_SIZE("UNEXPECTED_SIZE"),

    /**
     * 
     *                 Google Web Designer not created for "AdWords" environment.
     *               
     * 
     */
    UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT("UNSUPPORTED_GOOGLE_WEB_DESIGNER_ENVIRONMENT"),

    /**
     * 
     *                 Unsupported HTML5 feature in HTML5 asset.
     *               
     * 
     */
    @XmlEnumValue("UNSUPPORTED_HTML5_FEATURE")
    UNSUPPORTED_HTML_5_FEATURE("UNSUPPORTED_HTML5_FEATURE"),

    /**
     * 
     *                 URL in HTML5 entry is not ssl compliant.
     *               
     * 
     */
    URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT("URL_IN_MEDIA_BUNDLE_NOT_SSL_COMPLIANT");
    private final String value;

    MediaBundleErrorReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaBundleErrorReason fromValue(String v) {
        for (MediaBundleErrorReason c: MediaBundleErrorReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

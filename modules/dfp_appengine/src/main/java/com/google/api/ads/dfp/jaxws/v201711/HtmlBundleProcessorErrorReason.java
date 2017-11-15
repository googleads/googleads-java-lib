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
 * <p>Java class for HtmlBundleProcessorError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HtmlBundleProcessorError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_EXTRACT_FILES_FROM_BUNDLE"/>
 *     &lt;enumeration value="CLICK_TAG_HARD_CODED"/>
 *     &lt;enumeration value="CLICK_TAG_IN_GWD_UNUPPORTED"/>
 *     &lt;enumeration value="CLICK_TAG_NOT_IN_PRIMARY_HTML"/>
 *     &lt;enumeration value="CLICK_TAG_INVALID"/>
 *     &lt;enumeration value="FILE_SIZE_TOO_LARGE"/>
 *     &lt;enumeration value="FILES_TOO_MANY"/>
 *     &lt;enumeration value="FLASH_UNSUPPORTED"/>
 *     &lt;enumeration value="GWD_COMPONENTS_UNSUPPORTED"/>
 *     &lt;enumeration value="GWD_ENABLER_METHODS_UNSUPPORTED"/>
 *     &lt;enumeration value="GWD_PROPERTIES_INVALID"/>
 *     &lt;enumeration value="LINKED_FILES_NOT_FOUND"/>
 *     &lt;enumeration value="PRIMARY_HTML_MISSING"/>
 *     &lt;enumeration value="PRIMARY_HTML_UNDETERMINED"/>
 *     &lt;enumeration value="SVG_BLOCK_INVALID"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HtmlBundleProcessorError.Reason")
@XmlEnum
public enum HtmlBundleProcessorErrorReason {


    /**
     * 
     *                 Cannot extract files from HTML5 bundle.
     *               
     * 
     */
    CANNOT_EXTRACT_FILES_FROM_BUNDLE,

    /**
     * 
     *                 Bundle cannot have hard-coded click tag url(s).
     *               
     * 
     */
    CLICK_TAG_HARD_CODED,

    /**
     * 
     *                 Bundles created using GWD (Google Web Designer) cannot have click tags. GWD-published
     *                 bundles should use exit events instead of defining var {@code clickTAG}.
     *               
     * 
     */
    CLICK_TAG_IN_GWD_UNUPPORTED,

    /**
     * 
     *                 Click tag detected outside of primary HTML file.
     *               
     * 
     */
    CLICK_TAG_NOT_IN_PRIMARY_HTML,

    /**
     * 
     *                 Click tag or exit function has invalid name or url.
     *               
     * 
     */
    CLICK_TAG_INVALID,

    /**
     * 
     *                 HTML5 bundle or total size of extracted files cannot be more than 1000 KB.
     *               
     * 
     */
    FILE_SIZE_TOO_LARGE,

    /**
     * 
     *                 HTML5 bundle cannot have more than 50 files.
     *               
     * 
     */
    FILES_TOO_MANY,

    /**
     * 
     *                 Flash files in HTML5 bundles are not supported. Any file with a .swf or .flv extension
     *                 causes this error.
     *               
     * 
     */
    FLASH_UNSUPPORTED,

    /**
     * 
     *                 The HTML5 bundle contains unsupported GWD component(s).
     *               
     * 
     */
    GWD_COMPONENTS_UNSUPPORTED,

    /**
     * 
     *                 The HTML5 bundle contains Unsupported GWD Enabler method(s).
     *               
     * 
     */
    GWD_ENABLER_METHODS_UNSUPPORTED,

    /**
     * 
     *                 GWD properties are invalid.
     *               
     * 
     */
    GWD_PROPERTIES_INVALID,

    /**
     * 
     *                 The HTML5 bundle contains broken relative file reference(s).
     *               
     * 
     */
    LINKED_FILES_NOT_FOUND,

    /**
     * 
     *                 No primary HTML file detected.
     *               
     * 
     */
    PRIMARY_HTML_MISSING,

    /**
     * 
     *                 Multiple HTML files are detected. One of them should be named as {@code index.html}
     *               
     * 
     */
    PRIMARY_HTML_UNDETERMINED,

    /**
     * 
     *                 An SVG block could not be parsed.
     *               
     * 
     */
    SVG_BLOCK_INVALID,

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

    public static HtmlBundleProcessorErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

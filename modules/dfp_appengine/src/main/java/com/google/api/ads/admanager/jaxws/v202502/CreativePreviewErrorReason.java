// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativePreviewError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativePreviewError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANNOT_GENERATE_PREVIEW_URL"/&gt;
 *     &lt;enumeration value="CANNOT_GENERATE_PREVIEW_URL_FOR_NATIVE_CREATIVES"/&gt;
 *     &lt;enumeration value="HTML_SNIPPET_REQUIRED_FOR_THIRD_PARTY_CREATIVE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreativePreviewError.Reason")
@XmlEnum
public enum CreativePreviewErrorReason {


    /**
     * 
     *                 The creative cannot be previewed on this page.
     *               
     * 
     */
    CANNOT_GENERATE_PREVIEW_URL,

    /**
     * 
     *                 Preview URLs for native creatives must be retrieved with {@link
     *                 LineItemCreativeAssociationService#getPreviewUrlsForNativeStyles}.
     *               
     * 
     */
    CANNOT_GENERATE_PREVIEW_URL_FOR_NATIVE_CREATIVES,

    /**
     * 
     *                 Third party creatives must have an html snippet set in order to obtain a preview URL.
     *               
     * 
     */
    HTML_SNIPPET_REQUIRED_FOR_THIRD_PARTY_CREATIVE,

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

    public static CreativePreviewErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for CustomCreativeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomCreativeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUPLICATE_MACRO_NAME_FOR_CREATIVE"/>
 *     &lt;enumeration value="SNIPPET_REFERENCES_MISSING_MACRO"/>
 *     &lt;enumeration value="UNRECOGNIZED_MACRO"/>
 *     &lt;enumeration value="CUSTOM_CREATIVE_NOT_ALLOWED"/>
 *     &lt;enumeration value="MISSING_INTERSTITIAL_MACRO"/>
 *     &lt;enumeration value="DUPLICATE_ASSET_IN_MACROS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomCreativeError.Reason")
@XmlEnum
public enum CustomCreativeErrorReason {


    /**
     * 
     *                 Macros associated with a single custom creative must have unique names.
     *               
     * 
     */
    DUPLICATE_MACRO_NAME_FOR_CREATIVE,

    /**
     * 
     *                 The file macro referenced in the snippet does not exist.
     *               
     * 
     */
    SNIPPET_REFERENCES_MISSING_MACRO,

    /**
     * 
     *                 The macro referenced in the snippet is not valid.
     *               
     * 
     */
    UNRECOGNIZED_MACRO,

    /**
     * 
     *                 Custom creatives are not allowed in this context.
     *               
     * 
     */
    CUSTOM_CREATIVE_NOT_ALLOWED,

    /**
     * 
     *                 The custom creative is an interstitial, but the snippet is missing an
     *                 interstitial macro.
     *               
     * 
     */
    MISSING_INTERSTITIAL_MACRO,

    /**
     * 
     *                 Macros associated with the same custom creative cannot share the same
     *                 asset.
     *               
     * 
     */
    DUPLICATE_ASSET_IN_MACROS,

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

    public static CustomCreativeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

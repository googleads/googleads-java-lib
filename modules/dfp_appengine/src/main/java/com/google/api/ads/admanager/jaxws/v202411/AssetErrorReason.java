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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NON_UNIQUE_NAME"/&gt;
 *     &lt;enumeration value="FILE_NAME_TOO_LONG"/&gt;
 *     &lt;enumeration value="FILE_SIZE_TOO_LARGE"/&gt;
 *     &lt;enumeration value="MISSING_REQUIRED_DYNAMIC_ALLOCATION_CLIENT"/&gt;
 *     &lt;enumeration value="MISSING_REQUIRED_DYNAMIC_ALLOCATION_HEIGHT"/&gt;
 *     &lt;enumeration value="MISSING_REQUIRED_DYNAMIC_ALLOCATION_WIDTH"/&gt;
 *     &lt;enumeration value="MISSING_REQUIRED_DYNAMIC_ALLOCATION_FORMAT"/&gt;
 *     &lt;enumeration value="INVALID_CODE_SNIPPET_PARAMETER_VALUE"/&gt;
 *     &lt;enumeration value="INVALID_ASSET_ID"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetError.Reason")
@XmlEnum
public enum AssetErrorReason {


    /**
     * 
     *                 An asset name must be unique across advertiser.
     *               
     * 
     */
    NON_UNIQUE_NAME,

    /**
     * 
     *                 The file name is too long.
     *               
     * 
     */
    FILE_NAME_TOO_LONG,

    /**
     * 
     *                 The file size is too large.
     *               
     * 
     */
    FILE_SIZE_TOO_LARGE,

    /**
     * 
     *                 Required client code is not present in the code snippet.
     *               
     * 
     */
    MISSING_REQUIRED_DYNAMIC_ALLOCATION_CLIENT,

    /**
     * 
     *                 Required height is not present in the code snippet.
     *               
     * 
     */
    MISSING_REQUIRED_DYNAMIC_ALLOCATION_HEIGHT,

    /**
     * 
     *                 Required width is not present in the code snippet.
     *               
     * 
     */
    MISSING_REQUIRED_DYNAMIC_ALLOCATION_WIDTH,

    /**
     * 
     *                 Required format is not present in the mobile code snippet.
     *               
     * 
     */
    MISSING_REQUIRED_DYNAMIC_ALLOCATION_FORMAT,

    /**
     * 
     *                 The parameter value in the code snippet is invalid.
     *               
     * 
     */
    INVALID_CODE_SNIPPET_PARAMETER_VALUE,

    /**
     * 
     *                 Invalid asset Id.
     *               
     * 
     */
    INVALID_ASSET_ID,

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

    public static AssetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

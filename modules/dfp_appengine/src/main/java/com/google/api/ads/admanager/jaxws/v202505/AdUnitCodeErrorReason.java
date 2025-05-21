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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdUnitCodeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdUnitCodeError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVALID_CHARACTERS"/&gt;
 *     &lt;enumeration value="INVALID_CHARACTERS_WHEN_UTF_CHARACTERS_ARE_ALLOWED"/&gt;
 *     &lt;enumeration value="INVALID_CHARACTERS_FOR_LEGACY_AD_EXCHANGE_TAG"/&gt;
 *     &lt;enumeration value="LEADING_FORWARD_SLASH"/&gt;
 *     &lt;enumeration value="RESERVED_CODE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdUnitCodeError.Reason")
@XmlEnum
public enum AdUnitCodeErrorReason {


    /**
     * 
     *                 For {@link AdUnit#adUnitCode}, only alpha-numeric characters,
     *                 underscores, hyphens, periods, asterisks, double quotes, back slashes,
     *                 forward slashes, exclamations, left angle brackets, colons and
     *                 parentheses are allowed.
     *               
     * 
     */
    INVALID_CHARACTERS,

    /**
     * 
     *                 For {@link AdUnit#adUnitCode}, only letters, numbers,
     *                 underscores, hyphens, periods, asterisks, double quotes, back slashes,
     *                 forward slashes, exclamations, left angle brackets, colons and
     *                 parentheses are allowed.
     *               
     * 
     */
    INVALID_CHARACTERS_WHEN_UTF_CHARACTERS_ARE_ALLOWED,

    /**
     * 
     *                 For {@link AdUnit#adUnitCode} representing slot codes, only alphanumeric characters,
     *                 underscores, hyphens, periods and colons are allowed.
     *               
     * 
     */
    INVALID_CHARACTERS_FOR_LEGACY_AD_EXCHANGE_TAG,

    /**
     * 
     *                 For {@link AdUnit#adUnitCode}, forward slashes are not allowed as
     *                 the first character.
     *               
     * 
     */
    LEADING_FORWARD_SLASH,

    /**
     * 
     *                 Specific codes matching ca-*pub-*-tag are reserved for "Web Property IUs"
     *                 generated as part of the SlotCode migration.
     *               
     * 
     */
    RESERVED_CODE,

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

    public static AdUnitCodeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

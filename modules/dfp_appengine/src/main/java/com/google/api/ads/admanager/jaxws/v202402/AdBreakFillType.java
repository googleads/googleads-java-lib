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


package com.google.api.ads.admanager.jaxws.v202402;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdBreakFillType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdBreakFillType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SLATE"/&gt;
 *     &lt;enumeration value="UNDERLYING_CONTENT"/&gt;
 *     &lt;enumeration value="MINIMIZE_SLATE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdBreakFillType")
@XmlEnum
public enum AdBreakFillType {


    /**
     * 
     *                 Ad break should be filled with slate.
     *               
     * 
     */
    SLATE,

    /**
     * 
     *                 Ad break should be filled with underlying content.
     *               
     * 
     */
    UNDERLYING_CONTENT,

    /**
     * 
     *                 Ad break should be filled with mostly underlying content. When ad content can't be aligned with
     *                 underlying content during transition, the gap will be bridged with slate to maintain the
     *                 timeline.
     *               
     * 
     */
    MINIMIZE_SLATE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdBreakFillType fromValue(String v) {
        return valueOf(v);
    }

}

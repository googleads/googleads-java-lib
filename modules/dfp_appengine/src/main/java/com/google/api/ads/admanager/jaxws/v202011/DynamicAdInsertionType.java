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


package com.google.api.ads.admanager.jaxws.v202011;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicAdInsertionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DynamicAdInsertionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LINEAR"/>
 *     &lt;enumeration value="POD_SERVING_REDIRECT"/>
 *     &lt;enumeration value="POD_SERVING_MANIFEST"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DynamicAdInsertionType")
@XmlEnum
public enum DynamicAdInsertionType {


    /**
     * 
     *                 Content and ads are stitched together into a unique video manifest per user.
     *               
     * 
     */
    LINEAR,

    /**
     * 
     *                 The same manifest is used for all users but the ad break segment URLs are redirected to unique
     *                 ad segments per user.
     *               
     * 
     */
    POD_SERVING_REDIRECT,

    /**
     * 
     *                 Provide unique ad pod segment manifests per user for the partner to stitch into the content
     *                 stream.
     *               
     * 
     */
    POD_SERVING_MANIFEST,

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

    public static DynamicAdInsertionType fromValue(String v) {
        return valueOf(v);
    }

}

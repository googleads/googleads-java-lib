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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestinationUrlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DestinationUrlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CLICK_TO_WEB"/>
 *     &lt;enumeration value="CLICK_TO_APP"/>
 *     &lt;enumeration value="CLICK_TO_CALL"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DestinationUrlType")
@XmlEnum
public enum DestinationUrlType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Navigate to a web page. (a.k.a. "Click-through URL").
     *               
     * 
     */
    CLICK_TO_WEB,

    /**
     * 
     *                 Start an application.
     *               
     * 
     */
    CLICK_TO_APP,

    /**
     * 
     *                 Make a phone call.
     *               
     * 
     */
    CLICK_TO_CALL,

    /**
     * 
     *                 Destination URL not present. Useful for video creatives where a landing page or a product
     *                 isn't necessarily applicable.
     *               
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static DestinationUrlType fromValue(String v) {
        return valueOf(v);
    }

}

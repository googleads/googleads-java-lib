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
 * <p>Java class for CreativeSizeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeSizeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PIXEL"/>
 *     &lt;enumeration value="ASPECT_RATIO"/>
 *     &lt;enumeration value="INTERSTITIAL"/>
 *     &lt;enumeration value="NATIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativeSizeType")
@XmlEnum
public enum CreativeSizeType {


    /**
     * 
     *                 Dimension based size, an actual height and width.
     *               
     * 
     */
    PIXEL,

    /**
     * 
     *                 Mobile size, that is expressed as a ratio of say 4 by 1, that could be
     *                 met by a 100 x 25 sized image.
     *               
     * 
     */
    ASPECT_RATIO,

    /**
     * 
     *                 Out-of-page size, that is not related to the slot it is served.  But rather
     *                 is a function of the snippet, and the values set. This must be used with
     *                 1x1 size.
     *               
     * 
     */
    INTERSTITIAL,

    /**
     * 
     *                 Native size, which is a function of the how the client renders the creative.
     *                 This must be used with 1x1 size.
     *               
     * 
     */
    NATIVE;

    public String value() {
        return name();
    }

    public static CreativeSizeType fromValue(String v) {
        return valueOf(v);
    }

}

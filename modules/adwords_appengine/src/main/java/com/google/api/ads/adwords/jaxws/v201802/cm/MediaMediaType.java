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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Media.MediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Media.MediaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUDIO"/>
 *     &lt;enumeration value="DYNAMIC_IMAGE"/>
 *     &lt;enumeration value="ICON"/>
 *     &lt;enumeration value="IMAGE"/>
 *     &lt;enumeration value="STANDARD_ICON"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="MEDIA_BUNDLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Media.MediaType")
@XmlEnum
public enum MediaMediaType {


    /**
     * 
     *                 Audio file.
     *               
     * 
     */
    AUDIO,

    /**
     * 
     *                 Animated image, such as animated GIF.
     *               
     * 
     */
    DYNAMIC_IMAGE,

    /**
     * 
     *                 Small image; used for map ad.
     *               
     * 
     */
    ICON,

    /**
     * 
     *                 Static image; for image ad.
     *               
     * 
     */
    IMAGE,

    /**
     * 
     *                 Predefined standard icon; used for map ads.
     *               
     * 
     */
    STANDARD_ICON,

    /**
     * 
     *                 Video file.
     *               
     * 
     */
    VIDEO,

    /**
     * 
     *                 ZIP file; used in fields of template ads.
     *               
     * 
     */
    MEDIA_BUNDLE;

    public String value() {
        return name();
    }

    public static MediaMediaType fromValue(String v) {
        return valueOf(v);
    }

}

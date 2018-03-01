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
 * <p>Java class for DeprecatedAd.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeprecatedAd.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="CLICK_TO_CALL"/>
 *     &lt;enumeration value="IN_STREAM_VIDEO"/>
 *     &lt;enumeration value="FROOGLE"/>
 *     &lt;enumeration value="TEXT_LINK"/>
 *     &lt;enumeration value="GADGET"/>
 *     &lt;enumeration value="PRINT"/>
 *     &lt;enumeration value="TEXT_WIDE"/>
 *     &lt;enumeration value="GADGET_TEMPLATE"/>
 *     &lt;enumeration value="TEXT_WITH_VIDEO"/>
 *     &lt;enumeration value="AUDIO"/>
 *     &lt;enumeration value="LOCAL_BUSINESS_AD"/>
 *     &lt;enumeration value="AUDIO_TEMPLATE"/>
 *     &lt;enumeration value="MOBILE_AD"/>
 *     &lt;enumeration value="MOBILE_IMAGE_AD"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeprecatedAd.Type")
@XmlEnum
public enum DeprecatedAdType {


    /**
     * 
     *                 Video ad.
     *               
     * 
     */
    VIDEO,

    /**
     * 
     *                 Click to call ad.
     *               
     * 
     */
    CLICK_TO_CALL,

    /**
     * 
     *                 Instream video ad.
     *               
     * 
     */
    IN_STREAM_VIDEO,

    /**
     * 
     *                 Froogle ad.
     *               
     * 
     */
    FROOGLE,

    /**
     * 
     *                 Text link ad.
     *               
     * 
     */
    TEXT_LINK,

    /**
     * 
     *                 Gadget ad.
     *               
     * 
     */
    GADGET,

    /**
     * 
     *                 Print ad.
     *               
     * 
     */
    PRINT,

    /**
     * 
     *                 Wide text ad.
     *               
     * 
     */
    TEXT_WIDE,

    /**
     * 
     *                 Gadget template ad.
     *               
     * 
     */
    GADGET_TEMPLATE,

    /**
     * 
     *                 Text ad with video.
     *               
     * 
     */
    TEXT_WITH_VIDEO,

    /**
     * 
     *                 Audio ad.
     *               
     * 
     */
    AUDIO,

    /**
     * 
     *                 Local business ads.
     *               
     * 
     */
    LOCAL_BUSINESS_AD,

    /**
     * 
     *                 Audio based template ads.
     *               
     * 
     */
    AUDIO_TEMPLATE,

    /**
     * 
     *                 Mobile ads
     *               
     * 
     */
    MOBILE_AD,

    /**
     * 
     *                 Mobile image ads
     *               
     * 
     */
    MOBILE_IMAGE_AD,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static DeprecatedAdType fromValue(String v) {
        return valueOf(v);
    }

}

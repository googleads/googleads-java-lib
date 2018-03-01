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
 * <p>Java class for RichMediaAd.RichMediaAdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RichMediaAd.RichMediaAdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="IN_STREAM_VIDEO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RichMediaAd.RichMediaAdType")
@XmlEnum
public enum RichMediaAdRichMediaAdType {


    /**
     * 
     *                 Standard.
     *               
     * 
     */
    STANDARD,

    /**
     * 
     *                 In stream video ad.
     *               
     * 
     */
    IN_STREAM_VIDEO;

    public String value() {
        return name();
    }

    public static RichMediaAdRichMediaAdType fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for AdSenseSettings.BorderStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdSenseSettings.BorderStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="NOT_ROUNDED"/>
 *     &lt;enumeration value="SLIGHTLY_ROUNDED"/>
 *     &lt;enumeration value="VERY_ROUNDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdSenseSettings.BorderStyle")
@XmlEnum
public enum AdSenseSettingsBorderStyle {


    /**
     * 
     *                 Uses the default border-style of the browser.
     *               
     * 
     */
    DEFAULT,

    /**
     * 
     *                 Uses a cornered border-style.
     *               
     * 
     */
    NOT_ROUNDED,

    /**
     * 
     *                 Uses a slightly rounded border-style.
     *               
     * 
     */
    SLIGHTLY_ROUNDED,

    /**
     * 
     *                 Uses a rounded border-style.
     *               
     * 
     */
    VERY_ROUNDED;

    public String value() {
        return name();
    }

    public static AdSenseSettingsBorderStyle fromValue(String v) {
        return valueOf(v);
    }

}

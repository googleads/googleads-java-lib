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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdSenseSettings.FontFamily.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdSenseSettings.FontFamily"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEFAULT"/&gt;
 *     &lt;enumeration value="ARIAL"/&gt;
 *     &lt;enumeration value="TAHOMA"/&gt;
 *     &lt;enumeration value="GEORGIA"/&gt;
 *     &lt;enumeration value="TIMES"/&gt;
 *     &lt;enumeration value="VERDANA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdSenseSettings.FontFamily")
@XmlEnum
public enum AdSenseSettingsFontFamily {

    DEFAULT,
    ARIAL,
    TAHOMA,
    GEORGIA,
    TIMES,
    VERDANA;

    public String value() {
        return name();
    }

    public static AdSenseSettingsFontFamily fromValue(String v) {
        return valueOf(v);
    }

}

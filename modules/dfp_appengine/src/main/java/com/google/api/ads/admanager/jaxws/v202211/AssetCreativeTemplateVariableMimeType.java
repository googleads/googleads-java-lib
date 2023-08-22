// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202211;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetCreativeTemplateVariable.MimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetCreativeTemplateVariable.MimeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JPG"/&gt;
 *     &lt;enumeration value="PNG"/&gt;
 *     &lt;enumeration value="GIF"/&gt;
 *     &lt;enumeration value="SWF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssetCreativeTemplateVariable.MimeType")
@XmlEnum
public enum AssetCreativeTemplateVariableMimeType {

    JPG,
    PNG,
    GIF,
    SWF;

    public String value() {
        return name();
    }

    public static AssetCreativeTemplateVariableMimeType fromValue(String v) {
        return valueOf(v);
    }

}

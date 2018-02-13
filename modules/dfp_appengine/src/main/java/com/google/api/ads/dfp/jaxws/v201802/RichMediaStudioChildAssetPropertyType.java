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
 * <p>Java class for RichMediaStudioChildAssetProperty.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RichMediaStudioChildAssetProperty.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FLASH"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="IMAGE"/>
 *     &lt;enumeration value="DATA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RichMediaStudioChildAssetProperty.Type")
@XmlEnum
public enum RichMediaStudioChildAssetPropertyType {


    /**
     * 
     *                 SWF files
     *               
     * 
     */
    FLASH,

    /**
     * 
     *                 FLVS and any other video file types
     *               
     * 
     */
    VIDEO,

    /**
     * 
     *                 Image files
     *               
     * 
     */
    IMAGE,

    /**
     * 
     *                 The rest of the supported file types .txt, .xml, etc.
     *               
     * 
     */
    DATA;

    public String value() {
        return name();
    }

    public static RichMediaStudioChildAssetPropertyType fromValue(String v) {
        return valueOf(v);
    }

}

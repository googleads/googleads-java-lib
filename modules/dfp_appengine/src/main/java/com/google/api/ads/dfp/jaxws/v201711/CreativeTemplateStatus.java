// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativeTemplateStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeTemplateStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="DELETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativeTemplateStatus")
@XmlEnum
public enum CreativeTemplateStatus {


    /**
     * 
     *                 The {@link CreativeTemplate} is active
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 The {@link CreativeTemplate} is inactive. Users cannot create new creatives
     *                 from this template, but existing ones can be edited and continue to serve
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 The {@link CreativeTemplate} is deleted. Creatives created from this {@link CreativeTemplate}
     *                 can no longer serve.
     *               
     * 
     */
    DELETED;

    public String value() {
        return name();
    }

    public static CreativeTemplateStatus fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for CreativeTemplateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeTemplateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SYSTEM_DEFINED"/>
 *     &lt;enumeration value="USER_DEFINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativeTemplateType")
@XmlEnum
public enum CreativeTemplateType {


    /**
     * 
     *                 Creative templates that Google defines for users to use.
     *               
     * 
     */
    SYSTEM_DEFINED,

    /**
     * 
     *                 Arbitrary creative templates that users can define as they see fit.
     *                 Such templates are bound to a specific network and can only be used
     *                 with creatives being created under the network.
     *               
     * 
     */
    USER_DEFINED;

    public String value() {
        return name();
    }

    public static CreativeTemplateType fromValue(String v) {
        return valueOf(v);
    }

}

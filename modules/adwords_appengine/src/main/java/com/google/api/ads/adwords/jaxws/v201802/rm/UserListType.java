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


package com.google.api.ads.adwords.jaxws.v201802.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="REMARKETING"/>
 *     &lt;enumeration value="LOGICAL"/>
 *     &lt;enumeration value="EXTERNAL_REMARKETING"/>
 *     &lt;enumeration value="RULE_BASED"/>
 *     &lt;enumeration value="SIMILAR"/>
 *     &lt;enumeration value="CRM_BASED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserListType")
@XmlEnum
public enum UserListType {


    /**
     * 
     *                 UNKNOWN value can not be passed as input.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 UserList represented as a collection of conversion types.
     *               
     * 
     */
    REMARKETING,

    /**
     * 
     *                 UserList represented as a combination of other user lists/interests.
     *               
     * 
     */
    LOGICAL,

    /**
     * 
     *                 UserList created in the DoubleClick platform.
     *               
     * 
     */
    EXTERNAL_REMARKETING,

    /**
     * 
     *                 UserList associated with a rule.
     *               
     * 
     */
    RULE_BASED,

    /**
     * 
     *                 UserList with users similar to users of another UserList.
     *               
     * 
     */
    SIMILAR,

    /**
     * 
     *                 UserList of first party CRM data provided by advertiser in the form of emails or
     *                 other formats.
     *               
     * 
     */
    CRM_BASED;

    public String value() {
        return name();
    }

    public static UserListType fromValue(String v) {
        return valueOf(v);
    }

}

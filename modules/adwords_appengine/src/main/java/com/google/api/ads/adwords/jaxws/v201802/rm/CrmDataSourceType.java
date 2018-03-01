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
 * <p>Java class for CrmDataSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CrmDataSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="FIRST_PARTY"/>
 *     &lt;enumeration value="THIRD_PARTY_CREDIT_BUREAU"/>
 *     &lt;enumeration value="THIRD_PARTY_VOTER_FILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CrmDataSourceType")
@XmlEnum
public enum CrmDataSourceType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The uploaded data is first party data.
     *               
     * 
     */
    FIRST_PARTY,

    /**
     * 
     *                 The uploaded data is from third party credit bureau.
     *               
     * 
     */
    THIRD_PARTY_CREDIT_BUREAU,

    /**
     * 
     *                 The uploaded data is from third party voter file.
     *               
     * 
     */
    THIRD_PARTY_VOTER_FILE;

    public String value() {
        return name();
    }

    public static CrmDataSourceType fromValue(String v) {
        return valueOf(v);
    }

}

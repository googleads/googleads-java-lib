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
 * <p>Java class for OfflineDataUploadUserIdentifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfflineDataUploadUserIdentifierType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="HASHED_EMAIL"/>
 *     &lt;enumeration value="HASHED_PHONE"/>
 *     &lt;enumeration value="HASHED_LAST_NAME"/>
 *     &lt;enumeration value="HASHED_FIRST_NAME"/>
 *     &lt;enumeration value="CITY"/>
 *     &lt;enumeration value="STATE"/>
 *     &lt;enumeration value="ZIPCODE"/>
 *     &lt;enumeration value="COUNTRY_CODE"/>
 *     &lt;enumeration value="EXTERNAL_USER_ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfflineDataUploadUserIdentifierType")
@XmlEnum
public enum OfflineDataUploadUserIdentifierType {


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
     *                 Indicates the email address.
     *               
     * 
     */
    HASHED_EMAIL,

    /**
     * 
     *                 Indicates the phone number.
     *               
     * 
     */
    HASHED_PHONE,

    /**
     * 
     *                 Indicates the last name.
     *               
     * 
     */
    HASHED_LAST_NAME,

    /**
     * 
     *                 Indicates the first name.
     *               
     * 
     */
    HASHED_FIRST_NAME,

    /**
     * 
     *                 Indicates the city.
     *               
     * 
     */
    CITY,

    /**
     * 
     *                 Indicates the state.
     *               
     * 
     */
    STATE,

    /**
     * 
     *                 Indicates the zip code.
     *               
     * 
     */
    ZIPCODE,

    /**
     * 
     *                 ISO two-letter country codes.
     *               
     * 
     */
    COUNTRY_CODE,

    /**
     * 
     *                 Indicates the external id like third party id.
     *               
     * 
     */
    EXTERNAL_USER_ID;

    public String value() {
        return name();
    }

    public static OfflineDataUploadUserIdentifierType fromValue(String v) {
        return valueOf(v);
    }

}

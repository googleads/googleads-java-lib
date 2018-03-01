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
 * <p>Java class for CustomerMatchUploadKeyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerMatchUploadKeyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CONTACT_INFO"/>
 *     &lt;enumeration value="CRM_ID"/>
 *     &lt;enumeration value="MOBILE_ADVERTISING_ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerMatchUploadKeyType")
@XmlEnum
public enum CustomerMatchUploadKeyType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Members are matched from customer info such as email address, phone number or
     *                 physical address.
     *               
     * 
     */
    CONTACT_INFO,

    /**
     * 
     *                 Members are matched from advertiser generated and assigned user id.
     *               
     * 
     */
    CRM_ID,

    /**
     * 
     *                 Members are matched from mobile advertising ids.
     *               
     * 
     */
    MOBILE_ADVERTISING_ID;

    public String value() {
        return name();
    }

    public static CustomerMatchUploadKeyType fromValue(String v) {
        return valueOf(v);
    }

}

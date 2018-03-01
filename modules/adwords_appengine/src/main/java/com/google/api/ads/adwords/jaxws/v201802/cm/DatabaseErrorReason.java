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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatabaseError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DatabaseError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONCURRENT_MODIFICATION"/>
 *     &lt;enumeration value="PERMISSION_DENIED"/>
 *     &lt;enumeration value="ACCESS_PROHIBITED"/>
 *     &lt;enumeration value="CAMPAIGN_PRODUCT_NOT_SUPPORTED"/>
 *     &lt;enumeration value="DUPLICATE_KEY"/>
 *     &lt;enumeration value="DATABASE_ERROR"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DatabaseError.Reason")
@XmlEnum
public enum DatabaseErrorReason {


    /**
     * 
     *                 A concurrency problem occurred as two threads were attempting to modify same object.
     *               
     * 
     */
    CONCURRENT_MODIFICATION,

    /**
     * 
     *                 The permission was denied to access an object.
     *               
     * 
     */
    PERMISSION_DENIED,

    /**
     * 
     *                 The user's access to an object has been prohibited.
     *               
     * 
     */
    ACCESS_PROHIBITED,

    /**
     * 
     *                 Requested campaign belongs to a product that is not supported by the api.
     *               
     * 
     */
    CAMPAIGN_PRODUCT_NOT_SUPPORTED,

    /**
     * 
     *                 a duplicate key was detected upon insertion
     *               
     * 
     */
    DUPLICATE_KEY,

    /**
     * 
     *                 a database error has occurred
     *               
     * 
     */
    DATABASE_ERROR,

    /**
     * 
     *                 an unknown error has occurred
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static DatabaseErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

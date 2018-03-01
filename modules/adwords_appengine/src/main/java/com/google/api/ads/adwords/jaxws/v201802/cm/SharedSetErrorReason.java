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
 * <p>Java class for SharedSetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SharedSetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOMER_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE"/>
 *     &lt;enumeration value="DUPLICATE_NAME"/>
 *     &lt;enumeration value="MANAGER_CUSTOMER_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE"/>
 *     &lt;enumeration value="SHARED_SET_REMOVED"/>
 *     &lt;enumeration value="SHARED_SET_IN_USE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SharedSetError.Reason")
@XmlEnum
public enum SharedSetErrorReason {

    CUSTOMER_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE,
    DUPLICATE_NAME,

    /**
     * 
     *                 Customer Manager is not allowed to create shared set of this type.
     *               
     * 
     */
    MANAGER_CUSTOMER_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE,
    SHARED_SET_REMOVED,
    SHARED_SET_IN_USE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SharedSetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

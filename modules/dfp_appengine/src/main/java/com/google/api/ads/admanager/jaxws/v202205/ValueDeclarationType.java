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


package com.google.api.ads.admanager.jaxws.v202205;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueDeclarationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueDeclarationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NON_USER_DATA"/>
 *     &lt;enumeration value="USER_DATA"/>
 *     &lt;enumeration value="USER_ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValueDeclarationType")
@XmlEnum
public enum ValueDeclarationType {


    /**
     * 
     *                 Values are not user-related data and will be used in all ad requests.
     *               
     * 
     */
    NON_USER_DATA,

    /**
     * 
     *                 Values are declared as user data that will not be used in sensitive ad requests' targeting.
     *               
     * 
     */
    USER_DATA,

    /**
     * 
     *                 Values are declared as user identifiers that will not be used in targeting and will be
     *                 encrypted in DT using a publisher-provided public key.
     *               
     * 
     */
    USER_ID;

    public String value() {
        return name();
    }

    public static ValueDeclarationType fromValue(String v) {
        return valueOf(v);
    }

}

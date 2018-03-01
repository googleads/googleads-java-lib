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
 * <p>Java class for ListOperations.ListOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListOperations.ListOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PUT"/>
 *     &lt;enumeration value="REMOVE"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListOperations.ListOperator")
@XmlEnum
public enum ListOperationsListOperator {


    /**
     * 
     *                 Adds to a list, or overrides an existing element if it exists.
     *               
     * 
     */
    PUT,

    /**
     * 
     *                 Removes this element from the list.
     *               
     * 
     */
    REMOVE,

    /**
     * 
     *                 Updates this element with the existing behavior of null fields inside the list element being
     *                 a no-op. If the element doesn't exist it is added.
     *               
     * 
     */
    UPDATE,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ListOperationsListOperator fromValue(String v) {
        return valueOf(v);
    }

}

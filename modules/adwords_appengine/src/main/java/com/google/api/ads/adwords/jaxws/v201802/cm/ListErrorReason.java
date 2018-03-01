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
 * <p>Java class for ListError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLEAR_UNSUPPORTED"/>
 *     &lt;enumeration value="INVALID_OPERATOR"/>
 *     &lt;enumeration value="INVALID_ELEMENT"/>
 *     &lt;enumeration value="LIST_LENGTH_MISMATCH"/>
 *     &lt;enumeration value="DUPLICATE_ELEMENT"/>
 *     &lt;enumeration value="MUTATE_UNSUPPORTED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListError.Reason")
@XmlEnum
public enum ListErrorReason {


    /**
     * 
     *                 A request attempted to clear a list that does not support being cleared.
     *               
     * 
     */
    CLEAR_UNSUPPORTED,

    /**
     * 
     *                 The operator is invalid for the list or list element the operator was applied to.
     *               
     * 
     */
    INVALID_OPERATOR,

    /**
     * 
     *                 An UPDATE or REMOVE was requested for a list element that does not exist.
     *               
     * 
     */
    INVALID_ELEMENT,

    /**
     * 
     *                 The operator list has different a size compared to the element list.
     *               
     * 
     */
    LIST_LENGTH_MISMATCH,

    /**
     * 
     *                 Duplicate elements inside list.
     *               
     * 
     */
    DUPLICATE_ELEMENT,

    /**
     * 
     *                 The API operator of the mutate being performed on the entity containing this list is not
     *                 supported.
     *               
     * 
     */
    MUTATE_UNSUPPORTED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ListErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

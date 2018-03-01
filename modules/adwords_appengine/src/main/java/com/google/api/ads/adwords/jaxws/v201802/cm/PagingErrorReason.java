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
 * <p>Java class for PagingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PagingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="START_INDEX_CANNOT_BE_NEGATIVE"/>
 *     &lt;enumeration value="NUMBER_OF_RESULTS_CANNOT_BE_NEGATIVE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PagingError.Reason")
@XmlEnum
public enum PagingErrorReason {


    /**
     * 
     *                 The start index value cannot be a negative number.
     *               
     * 
     */
    START_INDEX_CANNOT_BE_NEGATIVE,

    /**
     * 
     *                 The number of results cannot be a negative number.
     *               
     * 
     */
    NUMBER_OF_RESULTS_CANNOT_BE_NEGATIVE,

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

    public static PagingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

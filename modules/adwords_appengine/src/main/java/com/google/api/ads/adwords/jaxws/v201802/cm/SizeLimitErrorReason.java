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
 * <p>Java class for SizeLimitError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SizeLimitError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUEST_SIZE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="RESPONSE_SIZE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="INTERNAL_STORAGE_ERROR"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SizeLimitError.Reason")
@XmlEnum
public enum SizeLimitErrorReason {


    /**
     * 
     *                 The number of entries in the request exceeds the system limit.
     *               
     * 
     */
    REQUEST_SIZE_LIMIT_EXCEEDED,

    /**
     * 
     *                 The number of entries in the response exceeds the system limit.
     *               
     * 
     */
    RESPONSE_SIZE_LIMIT_EXCEEDED,

    /**
     * 
     *                 The account is too large to load.
     *               
     * 
     */
    INTERNAL_STORAGE_ERROR,

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

    public static SizeLimitErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

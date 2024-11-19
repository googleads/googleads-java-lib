// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommonError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_FOUND"/&gt;
 *     &lt;enumeration value="ALREADY_EXISTS"/&gt;
 *     &lt;enumeration value="NOT_APPLICABLE"/&gt;
 *     &lt;enumeration value="DUPLICATE_OBJECT"/&gt;
 *     &lt;enumeration value="CANNOT_UPDATE"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_OPERATION"/&gt;
 *     &lt;enumeration value="CONCURRENT_MODIFICATION"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommonError.Reason")
@XmlEnum
public enum CommonErrorReason {


    /**
     * 
     *                 Indicates that an attempt was made to retrieve an entity that does not
     *                 exist.
     *               
     * 
     */
    NOT_FOUND,

    /**
     * 
     *                 Indicates that an attempt was made to create an entity that already
     *                 exists.
     *               
     * 
     */
    ALREADY_EXISTS,

    /**
     * 
     *                 Indicates that a value is not applicable for given use case.
     *               
     * 
     */
    NOT_APPLICABLE,

    /**
     * 
     *                 Indicates that two elements in the collection were identical.
     *               
     * 
     */
    DUPLICATE_OBJECT,

    /**
     * 
     *                 Indicates that an attempt was made to change an immutable field.
     *               
     * 
     */
    CANNOT_UPDATE,

    /**
     * 
     *                 Indicates that the requested operation is not supported.
     *               
     * 
     */
    UNSUPPORTED_OPERATION,

    /**
     * 
     *                 Indicates that another request attempted to update the same data in the same network
     *                 at about the same time. Please wait and try the request again.
     *               
     * 
     */
    CONCURRENT_MODIFICATION,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CommonErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternalApiError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InternalApiError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNEXPECTED_INTERNAL_API_ERROR"/&gt;
 *     &lt;enumeration value="TRANSIENT_ERROR"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="DOWNTIME"/&gt;
 *     &lt;enumeration value="ERROR_GENERATING_RESPONSE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InternalApiError.Reason")
@XmlEnum
public enum InternalApiErrorReason {


    /**
     * 
     *                 API encountered an unexpected internal error.
     *               
     * 
     */
    UNEXPECTED_INTERNAL_API_ERROR,

    /**
     * 
     *                 A temporary error occurred during the request. Please retry.
     *               
     * 
     */
    TRANSIENT_ERROR,

    /**
     * 
     *                 The cause of the error is not known or only defined in newer versions.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The API is currently unavailable for a planned downtime.
     *               
     * 
     */
    DOWNTIME,

    /**
     * 
     *                 Mutate succeeded but server was unable to build response. Client should not retry mutate.
     *               
     * 
     */
    ERROR_GENERATING_RESPONSE;

    public String value() {
        return name();
    }

    public static InternalApiErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

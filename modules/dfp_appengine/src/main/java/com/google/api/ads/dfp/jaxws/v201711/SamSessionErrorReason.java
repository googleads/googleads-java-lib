// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamSessionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SamSessionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COULD_NOT_REGISTER_SESSION"/>
 *     &lt;enumeration value="MALFORMED_SESSION_ID"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SamSessionError.Reason")
@XmlEnum
public enum SamSessionErrorReason {


    /**
     * 
     *                 SAM session could not be registered for monitoring.
     *               
     * 
     */
    COULD_NOT_REGISTER_SESSION,

    /**
     * 
     *                 User specified an invalid format for a session ID.
     *                 
     *                 <p>Session IDs are UUIDs and look like
     *                 "123e4567-e89b-12d3-a456-426655440000".
     *               
     * 
     */
    MALFORMED_SESSION_ID,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested
     *                 API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SamSessionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

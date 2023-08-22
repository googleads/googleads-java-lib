// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202308;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamSessionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SamSessionError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COULD_NOT_REGISTER_SESSION"/&gt;
 *     &lt;enumeration value="MALFORMED_SESSION_ID"/&gt;
 *     &lt;enumeration value="INVALID_SESSION_ID"/&gt;
 *     &lt;enumeration value="INVALID_DEBUG_KEY"/&gt;
 *     &lt;enumeration value="REQUEST_EXCEEDS_SESSION_LIMIT"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SamSessionError.Reason")
@XmlEnum
public enum SamSessionErrorReason {

    COULD_NOT_REGISTER_SESSION,
    MALFORMED_SESSION_ID,
    INVALID_SESSION_ID,
    INVALID_DEBUG_KEY,
    REQUEST_EXCEEDS_SESSION_LIMIT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SamSessionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

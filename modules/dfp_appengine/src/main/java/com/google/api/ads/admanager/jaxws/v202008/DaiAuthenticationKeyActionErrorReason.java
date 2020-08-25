// Copyright 2020 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaiAuthenticationKeyActionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaiAuthenticationKeyActionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_STATUS_TRANSITION"/>
 *     &lt;enumeration value="CANNOT_DEACTIVATE_IF_USED_BY_ACTIVE_CONTENT_SOURCES"/>
 *     &lt;enumeration value="CANNOT_DEACTIVATE_IF_USED_BY_ACTIVE_LIVE_STREAMS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DaiAuthenticationKeyActionError.Reason")
@XmlEnum
public enum DaiAuthenticationKeyActionErrorReason {


    /**
     * 
     *                 The operation is not applicable to the current status.
     *               
     * 
     */
    INVALID_STATUS_TRANSITION,

    /**
     * 
     *                 A DAI authentication key cannot be deactivated if it is used by active content sources.
     *               
     * 
     */
    CANNOT_DEACTIVATE_IF_USED_BY_ACTIVE_CONTENT_SOURCES,

    /**
     * 
     *                 A DAI authentication key cannot be deactivated if it is used by active live streams.
     *               
     * 
     */
    CANNOT_DEACTIVATE_IF_USED_BY_ACTIVE_LIVE_STREAMS,

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

    public static DaiAuthenticationKeyActionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

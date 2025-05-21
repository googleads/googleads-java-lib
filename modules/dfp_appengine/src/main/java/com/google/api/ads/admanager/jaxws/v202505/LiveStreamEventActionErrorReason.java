// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveStreamEventActionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveStreamEventActionError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVALID_STATUS_TRANSITION"/&gt;
 *     &lt;enumeration value="IS_ARCHIVED"/&gt;
 *     &lt;enumeration value="INVALID_SLATE_SETTING"/&gt;
 *     &lt;enumeration value="SLATE_CREATIVE_NOT_TRANSCODED"/&gt;
 *     &lt;enumeration value="SLATE_CREATIVE_ARCHIVED"/&gt;
 *     &lt;enumeration value="CANNOT_ACTIVATE_IF_USING_INACTIVE_DAI_AUTHENTICATION_KEYS"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LiveStreamEventActionError.Reason")
@XmlEnum
public enum LiveStreamEventActionErrorReason {


    /**
     * 
     *                 The operation is not applicable to the current status.
     *               
     * 
     */
    INVALID_STATUS_TRANSITION,

    /**
     * 
     *                 The operation cannot be applied because the live stream event is
     *                 archived.
     *               
     * 
     */
    IS_ARCHIVED,

    /**
     * 
     *                 Both the live stream event slate and the network default slate are not set.
     *               
     * 
     */
    INVALID_SLATE_SETTING,

    /**
     * 
     *                 The slate creative has not been transcoded.
     *               
     * 
     */
    SLATE_CREATIVE_NOT_TRANSCODED,

    /**
     * 
     *                 Unable to activate live stream event that has an associated archived slate.
     *               
     * 
     */
    SLATE_CREATIVE_ARCHIVED,

    /**
     * 
     *                 A live stream cannot be activated if it is using inactive DAI authentication keys.
     *               
     * 
     */
    CANNOT_ACTIVATE_IF_USING_INACTIVE_DAI_AUTHENTICATION_KEYS,

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

    public static LiveStreamEventActionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

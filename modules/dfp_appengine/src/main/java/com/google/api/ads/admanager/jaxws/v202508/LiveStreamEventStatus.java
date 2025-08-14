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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveStreamEventStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveStreamEventStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="ARCHIVED"/&gt;
 *     &lt;enumeration value="PAUSED"/&gt;
 *     &lt;enumeration value="ADS_PAUSED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LiveStreamEventStatus")
@XmlEnum
public enum LiveStreamEventStatus {


    /**
     * 
     *                 Indicates the {@link LiveStreamEvent} has been created and is eligible
     *                 for streaming.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Indicates the {@link LiveStreamEvent} has been archived.
     *               
     * 
     */
    ARCHIVED,

    /**
     * 
     *                 Indicates the {@link LiveStreamEvent} has been paused. This
     *                 can be made {@link #ACTIVE} at later time.
     *               
     * 
     */
    PAUSED,

    /**
     * 
     *                 Indicates that the stream is still being served, but ad insertion should be paused
     *                 temporarily.
     *               
     * 
     */
    ADS_PAUSED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LiveStreamEventStatus fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for LiveStreamEventConditioningError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveStreamEventConditioningError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANNOT_APPLY_DASH_BRIDGE"/&gt;
 *     &lt;enumeration value="CANNOT_UPDATE_DASH_BRIDGE_AFTER_START_TIME"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LiveStreamEventConditioningError.Reason")
@XmlEnum
public enum LiveStreamEventConditioningErrorReason {


    /**
     * 
     *                 DASH bridge conditioning cannot be applied.
     *               
     * 
     */
    CANNOT_APPLY_DASH_BRIDGE,

    /**
     * 
     *                 DASH bridge conditioning cannot be modified after start time.
     *               
     * 
     */
    CANNOT_UPDATE_DASH_BRIDGE_AFTER_START_TIME,

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

    public static LiveStreamEventConditioningErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

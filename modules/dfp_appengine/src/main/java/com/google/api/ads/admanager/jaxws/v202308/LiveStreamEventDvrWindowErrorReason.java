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
 * <p>Java class for LiveStreamEventDvrWindowError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveStreamEventDvrWindowError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DVR_WINDOW_TOO_HIGH"/&gt;
 *     &lt;enumeration value="DVR_WINDOW_TOO_LOW"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LiveStreamEventDvrWindowError.Reason")
@XmlEnum
public enum LiveStreamEventDvrWindowErrorReason {


    /**
     * 
     *                 The DVR window cannot be higher than the value allowed for this network.
     *               
     * 
     */
    DVR_WINDOW_TOO_HIGH,

    /**
     * 
     *                 The DVR window cannot be lower than the minimum value allowed.
     *               
     * 
     */
    DVR_WINDOW_TOO_LOW,

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

    public static LiveStreamEventDvrWindowErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

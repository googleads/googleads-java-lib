// Copyright 2021 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202111;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveStreamEventSlateError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveStreamEventSlateError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_SLATE_CREATIVE_ID"/>
 *     &lt;enumeration value="LIVE_STREAM_EVENT_SLATE_CREATIVE_ID_REQUIRED"/>
 *     &lt;enumeration value="MISSING_SOURCE_FOR_SLATE"/>
 *     &lt;enumeration value="INVALID_SLATE_TYPE"/>
 *     &lt;enumeration value="CANNOT_CHANGE_SLATE_VIDEO_SOURCE_URL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LiveStreamEventSlateError.Reason")
@XmlEnum
public enum LiveStreamEventSlateErrorReason {


    /**
     * 
     *                 The slate creative ID does not correspond to a slate creative.
     *               
     * 
     */
    INVALID_SLATE_CREATIVE_ID,

    /**
     * 
     *                 The required field live stream event slate is not set.
     *                 
     *                 <p>There must either be a slate creative ID assigned to the live stream event or
     *                 a valid network level slate selected.
     *               
     * 
     */
    LIVE_STREAM_EVENT_SLATE_CREATIVE_ID_REQUIRED,

    /**
     * 
     *                 The slate does not have a videoSourceUrl or assetSourcePath.
     *               
     * 
     */
    MISSING_SOURCE_FOR_SLATE,

    /**
     * 
     *                 The slate is of an invalid type.
     *               
     * 
     */
    INVALID_SLATE_TYPE,

    /**
     * 
     *                 The slate video source url cannot change.
     *               
     * 
     */
    CANNOT_CHANGE_SLATE_VIDEO_SOURCE_URL,

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

    public static LiveStreamEventSlateErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

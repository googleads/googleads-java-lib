// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficForecastSegmentError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficForecastSegmentError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_UPDATE_TARGETING_AFTER_CREATION"/>
 *     &lt;enumeration value="TARGETING_NOT_UNIQUE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficForecastSegmentError.Reason")
@XmlEnum
public enum TrafficForecastSegmentErrorReason {


    /**
     * 
     *                 Segment targeting cannot be changed after segment creation.
     *               
     * 
     */
    CANNOT_UPDATE_TARGETING_AFTER_CREATION,

    /**
     * 
     *                 The targeting expression that defines the segment is not unique within the given network's
     *                 segments.
     *                 
     *                 <p>The ID of the colliding segment will be provided in the {@link ApiError#trigger}.
     *               
     * 
     */
    TARGETING_NOT_UNIQUE,

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

    public static TrafficForecastSegmentErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

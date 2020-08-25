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
 * <p>Java class for VolumeTimeSeriesRequestError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VolumeTimeSeriesRequestError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT"/>
 *     &lt;enumeration value="NO_VOLUME_SETTINGS_PROVIDED"/>
 *     &lt;enumeration value="MULTIPLE_VOLUME_SETTINGS_PROVIDED"/>
 *     &lt;enumeration value="PARENT_SEGMENT_TARGETING_OPTION_USED_OUTSIDE_OF_ADJUSTMENT_CONTEXT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VolumeTimeSeriesRequestError.Reason")
@XmlEnum
public enum VolumeTimeSeriesRequestErrorReason {


    /**
     * 
     *                 The historical basis date range of the request is shorter than the minimum allowed length.
     *               
     * 
     */
    HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT,

    /**
     * 
     *                 The request does not contain a volume settings instance.
     *               
     * 
     */
    NO_VOLUME_SETTINGS_PROVIDED,

    /**
     * 
     *                 The request contains more than one volume settings instance.
     *               
     * 
     */
    MULTIPLE_VOLUME_SETTINGS_PROVIDED,

    /**
     * 
     *                 The flag to use parent segment targeting was used outside the context of an adjustment,
     *                 meaning no parent segment is available to be referenced.
     *               
     * 
     */
    PARENT_SEGMENT_TARGETING_OPTION_USED_OUTSIDE_OF_ADJUSTMENT_CONTEXT,

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

    public static VolumeTimeSeriesRequestErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

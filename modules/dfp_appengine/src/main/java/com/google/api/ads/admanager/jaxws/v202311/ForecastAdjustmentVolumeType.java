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


package com.google.api.ads.admanager.jaxws.v202311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastAdjustmentVolumeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForecastAdjustmentVolumeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="DAILY_VOLUME"/&gt;
 *     &lt;enumeration value="TOTAL_VOLUME"/&gt;
 *     &lt;enumeration value="HISTORICAL_BASIS_VOLUME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForecastAdjustmentVolumeType")
@XmlEnum
public enum ForecastAdjustmentVolumeType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Volume is defined by a series of daily ad opportunity counts.
     *               
     * 
     */
    DAILY_VOLUME,

    /**
     * 
     *                 Volume is defined by a single total ad opportunity count.
     *               
     * 
     */
    TOTAL_VOLUME,

    /**
     * 
     *                 Volume is defined by historical volume data.
     *               
     * 
     */
    HISTORICAL_BASIS_VOLUME;

    public String value() {
        return name();
    }

    public static ForecastAdjustmentVolumeType fromValue(String v) {
        return valueOf(v);
    }

}

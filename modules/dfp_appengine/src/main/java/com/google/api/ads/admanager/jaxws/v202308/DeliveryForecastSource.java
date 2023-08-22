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
 * <p>Java class for DeliveryForecastSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryForecastSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HISTORICAL"/&gt;
 *     &lt;enumeration value="FORECASTING"/&gt;
 *     &lt;enumeration value="CUSTOM_PACING_CURVE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryForecastSource")
@XmlEnum
public enum DeliveryForecastSource {


    /**
     * 
     *                 The line item's historical traffic shape will be used to pace line item delivery.
     *               
     * 
     */
    HISTORICAL,

    /**
     * 
     *                 The line item's projected future traffic will be used to pace line item delivery.
     *               
     * 
     */
    FORECASTING,

    /**
     * 
     *                 A user specified custom pacing curve will be used to pace line item delivery.
     *               
     * 
     */
    CUSTOM_PACING_CURVE,

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

    public static DeliveryForecastSource fromValue(String v) {
        return valueOf(v);
    }

}

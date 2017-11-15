// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StartDateTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StartDateTimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USE_START_DATE_TIME"/>
 *     &lt;enumeration value="IMMEDIATELY"/>
 *     &lt;enumeration value="ONE_HOUR_FROM_NOW"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StartDateTimeType")
@XmlEnum
public enum StartDateTimeType {


    /**
     * 
     *                 Use the value in {@link #startDateTime}.
     *               
     * 
     */
    USE_START_DATE_TIME,

    /**
     * 
     *                 The entity will start serving immediately. {@link #startDateTime} in the
     *                 request is ignored and will be set to the current time. Additionally,
     *                 {@link #startDateTimeType} will be set to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}.
     *               
     * 
     */
    IMMEDIATELY,

    /**
     * 
     *                 The entity will start serving one hour from now. {@link #startDateTime}
     *                 in the request is ignored and will be set to one hour from the current
     *                 time. Additionally, {@link #startDateTimeType} will be set to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}.
     *               
     * 
     */
    ONE_HOUR_FROM_NOW,

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

    public static StartDateTimeType fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for ForecastError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForecastError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SERVER_NOT_AVAILABLE"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="NO_FORECAST_YET"/>
 *     &lt;enumeration value="NOT_ENOUGH_INVENTORY"/>
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="ZERO_LENGTH_RESERVATION"/>
 *     &lt;enumeration value="EXCEEDED_QUOTA"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForecastError.Reason")
@XmlEnum
public enum ForecastErrorReason {


    /**
     * 
     *                 The forecast could not be retrieved due to a server side
     *                 connection problem. Please try again soon.
     *               
     * 
     */
    SERVER_NOT_AVAILABLE,

    /**
     * 
     *                 There was an unexpected internal error.
     *               
     * 
     */
    INTERNAL_ERROR,

    /**
     * 
     *                 The forecast could not be retrieved because there is not
     *                 enough forecasting data available yet. It may take up to one week before
     *                 enough data is available.
     *               
     * 
     */
    NO_FORECAST_YET,

    /**
     * 
     *                 There's not enough inventory for the requested reservation.
     *               
     * 
     */
    NOT_ENOUGH_INVENTORY,

    /**
     * 
     *                 No error from forecast.
     *               
     * 
     */
    SUCCESS,

    /**
     * 
     *                 The requested reservation is of zero length.  No forecast is returned.
     *               
     * 
     */
    ZERO_LENGTH_RESERVATION,

    /**
     * 
     *                 The number of requests made per second is too high and has exceeded the
     *                 allowable limit. The recommended approach to handle this error is to wait
     *                 about 5 seconds and then retry the request. Note that this does not
     *                 guarantee the request will succeed. If it fails again, try increasing the
     *                 wait time.
     *                 <p>
     *                 Another way to mitigate this error is to limit requests to 2 per second.
     *                 Once again this does not guarantee that every request will succeed, but
     *                 may help reduce the number of times you receive this error.
     *                 </p>
     *               
     * 
     */
    EXCEEDED_QUOTA,

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

    public static ForecastErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

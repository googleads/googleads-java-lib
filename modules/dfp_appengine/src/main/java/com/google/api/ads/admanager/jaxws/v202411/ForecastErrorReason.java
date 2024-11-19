// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForecastError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SERVER_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="INTERNAL_ERROR"/&gt;
 *     &lt;enumeration value="NO_FORECAST_YET"/&gt;
 *     &lt;enumeration value="NOT_ENOUGH_INVENTORY"/&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="ZERO_LENGTH_RESERVATION"/&gt;
 *     &lt;enumeration value="EXCEEDED_QUOTA"/&gt;
 *     &lt;enumeration value="OUTSIDE_AVAILABLE_DATE_RANGE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
     *                 The request falls outside the date range of the available data.
     *               
     * 
     */
    OUTSIDE_AVAILABLE_DATE_RANGE,

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

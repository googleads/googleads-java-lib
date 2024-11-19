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
 * <p>Java class for TimeZoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeZoneType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="PUBLISHER"/&gt;
 *     &lt;enumeration value="PACIFIC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeZoneType")
@XmlEnum
public enum TimeZoneType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Use the publisher's time zone. For Ad Manager reports, this time zone is compatible with all
     *                 metrics. For Ad Exchange reports, this time zone is not compatible with "Bids" and "Deals"
     *                 metrics.
     *                 
     *                 <p><b>Note:</b> if your report includes "time unit" dimensions, only the Ad Manager "time unit"
     *                 dimensions are compatible with this timezone, e.g.:
     *                 <ul>
     *                 <li> {@link com.google.ads.publisher.api.service.reports.Dimension.DATE}
     *                 <li> {@link com.google.ads.publisher.api.service.reports.Dimension.WEEK}
     *                 <li> {@link com.google.ads.publisher.api.service.reports.Dimension.MONTH_AND_YEAR}
     *                 </ul>
     *               
     * 
     */
    PUBLISHER,

    /**
     * 
     *                 Use the PT time zone. This time zone is only compatible with Ad Exchange metrics in Historical
     *                 report type.
     *                 
     *                 <p><b>Note:</b> if your report includes "time unit" dimensions, only the PT "time unit"
     *                 dimensions are compatible with this timezone, e.g.:
     *                 
     *                 <ul>
     *                 <li>{@link com.google.ads.publisher.api.service.reports.Dimension.DATE_PT}
     *                 <li>{@link com.google.ads.publisher.api.service.reports.Dimension.WEEK_PT}
     *                 <li>{@link com.google.ads.publisher.api.service.reports.Dimension.MONTH_YEAR_PT}
     *                 <li>{@link com.google.ads.publisher.api.service.reports.Dimension.DAY_PT}
     *                 </ul>
     *               
     * 
     */
    PACIFIC;

    public String value() {
        return name();
    }

    public static TimeZoneType fromValue(String v) {
        return valueOf(v);
    }

}

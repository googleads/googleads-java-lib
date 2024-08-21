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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateRangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateRangeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TODAY"/&gt;
 *     &lt;enumeration value="YESTERDAY"/&gt;
 *     &lt;enumeration value="LAST_WEEK"/&gt;
 *     &lt;enumeration value="LAST_MONTH"/&gt;
 *     &lt;enumeration value="LAST_3_MONTHS"/&gt;
 *     &lt;enumeration value="REACH_LIFETIME"/&gt;
 *     &lt;enumeration value="CUSTOM_DATE"/&gt;
 *     &lt;enumeration value="NEXT_DAY"/&gt;
 *     &lt;enumeration value="NEXT_90_DAYS"/&gt;
 *     &lt;enumeration value="NEXT_WEEK"/&gt;
 *     &lt;enumeration value="NEXT_MONTH"/&gt;
 *     &lt;enumeration value="CURRENT_AND_NEXT_MONTH"/&gt;
 *     &lt;enumeration value="NEXT_QUARTER"/&gt;
 *     &lt;enumeration value="NEXT_3_MONTHS"/&gt;
 *     &lt;enumeration value="NEXT_12_MONTHS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateRangeType")
@XmlEnum
public enum DateRangeType {


    /**
     * 
     *                 The current day.
     *               
     * 
     */
    TODAY,

    /**
     * 
     *                 The previous day.
     *               
     * 
     */
    YESTERDAY,

    /**
     * 
     *                 The last week, from monday to sunday.
     *               
     * 
     */
    LAST_WEEK,

    /**
     * 
     *                 The previous month.
     *               
     * 
     */
    LAST_MONTH,

    /**
     * 
     *                 The last 3 full months. For example, if today is May 5, 2017, then LAST_3_MONTHS would go from
     *                 February 1 to April 30.
     *               
     * 
     */
    LAST_3_MONTHS,

    /**
     * 
     *                 This will report on the last 93 days for the following columns: {@link
     *                 Column#UNIQUE_REACH_IMPRESSIONS}, {@link Column#UNIQUE_REACH_FREQUENCY}, and {@link
     *                 Column#UNIQUE_REACH}.
     *               
     * 
     */
    REACH_LIFETIME,

    /**
     * 
     *                 Specifying this value will enable the user to specify
     *                 {@link ReportQuery#startDate} and {@link ReportQuery#endDate}.
     *               
     * 
     */
    CUSTOM_DATE,

    /**
     * 
     *                 The next day.
     *               
     * 
     */
    NEXT_DAY,

    /**
     * 
     *                 The next ninety days.
     *               
     * 
     */
    NEXT_90_DAYS,

    /**
     * 
     *                 The next week, from monday to sunday.
     *               
     * 
     */
    NEXT_WEEK,

    /**
     * 
     *                 The next month.
     *               
     * 
     */
    NEXT_MONTH,

    /**
     * 
     *                 Beginning of the next day until the end of the next month.
     *               
     * 
     */
    CURRENT_AND_NEXT_MONTH,

    /**
     * 
     *                 The next quarter.
     *               
     * 
     */
    NEXT_QUARTER,

    /**
     * 
     *                 The next three months.
     *               
     * 
     */
    NEXT_3_MONTHS,

    /**
     * 
     *                 The next twelve months.
     *               
     * 
     */
    NEXT_12_MONTHS;

    public String value() {
        return name();
    }

    public static DateRangeType fromValue(String v) {
        return valueOf(v);
    }

}

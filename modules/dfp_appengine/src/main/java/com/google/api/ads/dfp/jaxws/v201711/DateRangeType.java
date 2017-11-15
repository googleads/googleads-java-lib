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
 * <p>Java class for DateRangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateRangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TODAY"/>
 *     &lt;enumeration value="YESTERDAY"/>
 *     &lt;enumeration value="LAST_WEEK"/>
 *     &lt;enumeration value="LAST_MONTH"/>
 *     &lt;enumeration value="LAST_3_MONTHS"/>
 *     &lt;enumeration value="REACH_LIFETIME"/>
 *     &lt;enumeration value="CUSTOM_DATE"/>
 *     &lt;enumeration value="NEXT_DAY"/>
 *     &lt;enumeration value="NEXT_90_DAYS"/>
 *     &lt;enumeration value="NEXT_WEEK"/>
 *     &lt;enumeration value="NEXT_MONTH"/>
 *     &lt;enumeration value="CURRENT_AND_NEXT_MONTH"/>
 *     &lt;enumeration value="NEXT_QUARTER"/>
 *     &lt;enumeration value="NEXT_3_MONTHS"/>
 *     &lt;enumeration value="NEXT_12_MONTHS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
     *                 The last 5 months and the current month to date. This date range is only
     *                 usable for the columns {@link Column#REACH_FREQUENCY},
     *                 {@link Column#REACH_AVERAGE_REVENUE} and {@link Column#REACH}.
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

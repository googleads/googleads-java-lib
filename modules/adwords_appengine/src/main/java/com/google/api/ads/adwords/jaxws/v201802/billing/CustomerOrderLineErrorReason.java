// Copyright 2018 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201802.billing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerOrderLineError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerOrderLineError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_ORDER_LINE_ID"/>
 *     &lt;enumeration value="END_DATE_BEFORE_START_DATE"/>
 *     &lt;enumeration value="CREATE_IN_PAST"/>
 *     &lt;enumeration value="ALREADY_STARTED"/>
 *     &lt;enumeration value="ALREADY_SPENT"/>
 *     &lt;enumeration value="FINISHED_IN_THE_PAST"/>
 *     &lt;enumeration value="OVERLAP_DATE_RANGE"/>
 *     &lt;enumeration value="END_DATE_PAST_MAX"/>
 *     &lt;enumeration value="PARENT_IS_SELF"/>
 *     &lt;enumeration value="CANNOT_CANCEL_STARTED"/>
 *     &lt;enumeration value="ORDERLINE_BEING_MODIFIED_IS_NOT_NORMAL_OR_PENDING"/>
 *     &lt;enumeration value="MORE_THAN_ONE_OPERATION_NOT_PERMITTED"/>
 *     &lt;enumeration value="INVALID_TIMEZONE_IN_DATE_RANGES"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerOrderLineError.Reason")
@XmlEnum
public enum CustomerOrderLineErrorReason {


    /**
     * 
     *                 Order Line Id does not exist.
     *               
     * 
     */
    INVALID_ORDER_LINE_ID,

    /**
     * 
     *                 End date must be later than start date
     *               
     * 
     */
    END_DATE_BEFORE_START_DATE,

    /**
     * 
     *                 Cannot create order line with start date in the past
     *               
     * 
     */
    CREATE_IN_PAST,

    /**
     * 
     *                 Cannot change start date after the order line has started
     *               
     * 
     */
    ALREADY_STARTED,

    /**
     * 
     *                 Cannot set spending limit below what has already been spent
     *               
     * 
     */
    ALREADY_SPENT,

    /**
     * 
     *                 Cannot move end date into the past
     *               
     * 
     */
    FINISHED_IN_THE_PAST,

    /**
     * 
     *                 Cannot make overlapping order lines.
     *               
     * 
     */
    OVERLAP_DATE_RANGE,

    /**
     * 
     *                 Cannot set contract start date to be after actual start date
     *               
     * 
     */
    END_DATE_PAST_MAX,

    /**
     * 
     *                 only cancelled order lines may have themselves as parent
     *               
     * 
     */
    PARENT_IS_SELF,

    /**
     * 
     *                 Cannot cancel started order line
     *               
     * 
     */
    CANNOT_CANCEL_STARTED,

    /**
     * 
     *                 Only Order lines in normal or pending state can be modified.
     *               
     * 
     */
    ORDERLINE_BEING_MODIFIED_IS_NOT_NORMAL_OR_PENDING,

    /**
     * 
     *                 More than one operation not permitted per call.
     *               
     * 
     */
    MORE_THAN_ONE_OPERATION_NOT_PERMITTED,

    /**
     * 
     *                 StartDate and EndDate should pass in the customer's account timeZone.
     *               
     * 
     */
    INVALID_TIMEZONE_IN_DATE_RANGES,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CustomerOrderLineErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

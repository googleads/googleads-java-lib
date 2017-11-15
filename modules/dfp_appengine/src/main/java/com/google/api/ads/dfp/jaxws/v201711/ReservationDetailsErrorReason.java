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
 * <p>Java class for ReservationDetailsError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationDetailsError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNLIMITED_UNITS_BOUGHT_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNLIMITED_END_DATE_TIME_NOT_ALLOWED"/>
 *     &lt;enumeration value="PERCENTAGE_UNITS_BOUGHT_TOO_HIGH"/>
 *     &lt;enumeration value="DURATION_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNIT_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="COST_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="COST_TYPE_UNIT_TYPE_MISMATCH_NOT_ALLOWED"/>
 *     &lt;enumeration value="LINE_ITEM_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="NETWORK_REMNANT_ORDER_CANNOT_UPDATE_LINEITEM_TYPE"/>
 *     &lt;enumeration value="BACKFILL_WEBPROPERTY_CODE_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReservationDetailsError.Reason")
@XmlEnum
public enum ReservationDetailsErrorReason {


    /**
     * 
     *                 There is no limit on the number of ads delivered for a line item when you
     *                 set {@link LineItem#duration} to be
     *                 {@link LineItemSummary.Duration#NONE}. This can only be set for line
     *                 items of type {@link LineItemType#PRICE_PRIORITY}.
     *               
     * 
     */
    UNLIMITED_UNITS_BOUGHT_NOT_ALLOWED,

    /**
     * 
     *                 {@link LineItem#unlimitedEndDateTime} can be set to true for only
     *                 line items of type {@link LineItemType#SPONSORSHIP},
     *                 {@link LineItemType#NETWORK}, {@link LineItemType#PRICE_PRIORITY} and
     *                 {@link LineItemType#HOUSE}.
     *               
     * 
     */
    UNLIMITED_END_DATE_TIME_NOT_ALLOWED,

    /**
     * 
     *                 When {@link LineItem#lineItemType} is
     *                 {@link LineItemType#SPONSORSHIP}, then
     *                 {@link LineItem#unitsBought} represents the percentage of
     *                 available impressions reserved. That value cannot exceed 100.
     *               
     * 
     */
    PERCENTAGE_UNITS_BOUGHT_TOO_HIGH,

    /**
     * 
     *                 The line item type does not support the specified duration. See
     *                 {@link LineItemSummary.Duration} for allowed values.
     *               
     * 
     */
    DURATION_NOT_ALLOWED,

    /**
     * 
     *                 The {@link LineItem#unitType} is not allowed for the given
     *                 {@link LineItem#lineItemType}. See {@link UnitType} for allowed
     *                 values.
     *               
     * 
     */
    UNIT_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 The {@link LineItem#costType} is not allowed for the
     *                 {@link LineItem#lineItemType}. See {@link CostType} for allowed
     *                 values.
     *               
     * 
     */
    COST_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 When {@link LineItem#costType} is {@link CostType#CPM},
     *                 {@link LineItem#unitType} must be {@link UnitType#IMPRESSIONS}
     *                 and when {@link LineItem#costType} is {@link CostType#CPC},
     *                 {@link LineItem#unitType} must be {@link UnitType#CLICKS}.
     *               
     * 
     */
    COST_TYPE_UNIT_TYPE_MISMATCH_NOT_ALLOWED,

    /**
     * 
     *                 Inventory cannot be reserved for line items which are not of type
     *                 {@link LineItemType#SPONSORSHIP} or {@link LineItemType#STANDARD}.
     *               
     * 
     */
    LINE_ITEM_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 Remnant line items from the Google Ad Manager cannot be changed to other
     *                 line item types once delivery begins. This restriction does not apply
     *                 for new line items created in Doubleclick For Publishers.
     *               
     * 
     */
    NETWORK_REMNANT_ORDER_CANNOT_UPDATE_LINEITEM_TYPE,

    /**
     * 
     *                 A dynamic allocation web property can only be set on a line item of type
     *                 AdSense or Ad Exchange.
     *               
     * 
     */
    BACKFILL_WEBPROPERTY_CODE_NOT_ALLOWED,

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

    public static ReservationDetailsErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

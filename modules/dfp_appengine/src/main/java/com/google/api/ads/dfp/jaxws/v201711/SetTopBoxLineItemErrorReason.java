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
 * <p>Java class for SetTopBoxLineItemError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SetTopBoxLineItemError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NON_SET_TOP_BOX_AD_UNIT_TARGETED"/>
 *     &lt;enumeration value="AT_LEAST_ONE_AD_UNIT_MUST_BE_TARGETED"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_AD_UNITS"/>
 *     &lt;enumeration value="POD_POSITION_OUT_OF_RANGE"/>
 *     &lt;enumeration value="MIDROLL_POSITION_OUT_OF_RANGE"/>
 *     &lt;enumeration value="FEATURE_NOT_ENABLED"/>
 *     &lt;enumeration value="INVALID_ENVIRONMENT_TYPE"/>
 *     &lt;enumeration value="COMPANIONS_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_CREATIVE_SIZE"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="ORDERS_WITH_STANDARD_LINE_ITEMS_CANNOT_CONTAIN_HOUSE_OR_SPONSORSHIP_LINE_ITEMS"/>
 *     &lt;enumeration value="INVALID_COST_TYPE"/>
 *     &lt;enumeration value="COST_PER_UNIT_NOT_ALLOWED"/>
 *     &lt;enumeration value="DISCOUNT_NOT_ALLOWED"/>
 *     &lt;enumeration value="FRONTLOADED_DELIVERY_RATE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_STATUS_CHANGE"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_PRIORITY"/>
 *     &lt;enumeration value="SYNC_REVISION_NOT_INCREASING"/>
 *     &lt;enumeration value="SYNC_REVISION_MUST_BE_GREATER_THAN_ZERO"/>
 *     &lt;enumeration value="CANNOT_UNARCHIVE_SET_TOP_BOX_LINE_ITEMS"/>
 *     &lt;enumeration value="COPY_SET_TOP_BOX_ENABLED_LINE_ITEM_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_TYPE_CHANGE"/>
 *     &lt;enumeration value="CREATIVE_ROTATION_TYPE_MUST_BE_EVENLY_OR_WEIGHTED"/>
 *     &lt;enumeration value="INVALID_FREQUENCY_CAP_TIME_UNIT"/>
 *     &lt;enumeration value="INVALID_FREQUENCY_CAP_TIME_RANGE"/>
 *     &lt;enumeration value="INVALID_PRIMARY_GOAL_UNIT_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetTopBoxLineItemError.Reason")
@XmlEnum
public enum SetTopBoxLineItemErrorReason {


    /**
     * 
     *                 The set-top box line item cannot target an ad unit that doesn't have an external
     *                 set-top box channel ID.
     *               
     * 
     */
    NON_SET_TOP_BOX_AD_UNIT_TARGETED,

    /**
     * 
     *                 The set-top box line item must target at least one ad unit.
     *               
     * 
     */
    AT_LEAST_ONE_AD_UNIT_MUST_BE_TARGETED,

    /**
     * 
     *                 The set-top box line item cannot exclude ad units.
     *               
     * 
     */
    CANNOT_EXCLUDE_AD_UNITS,

    /**
     * 
     *                 The set-top box line item can only target pod positions 1 - 15.
     *               
     * 
     */
    POD_POSITION_OUT_OF_RANGE,

    /**
     * 
     *                 The set-top box line item can only target midroll positions 4 - 100.
     *               
     * 
     */
    MIDROLL_POSITION_OUT_OF_RANGE,

    /**
     * 
     *                 The set-top box feature is not enabled.
     *               
     * 
     */
    FEATURE_NOT_ENABLED,

    /**
     * 
     *                 Only {@link EnvironmentType#VIDEO_PLAYER} is supported for set-top box line items.
     *               
     * 
     */
    INVALID_ENVIRONMENT_TYPE,

    /**
     * 
     *                 Companions are not supported for set-top box line items.
     *               
     * 
     */
    COMPANIONS_NOT_SUPPORTED,

    /**
     * 
     *                 Set-top box line items only support sizes supported by Canoe.
     *               
     * 
     */
    INVALID_CREATIVE_SIZE,

    /**
     * 
     *                 Set-top box line items only support {@link LineItemType#STANDARD},
     *                 {@link LineItemType#HOUSE}, and {@link LineItemType#SPONSORSHIP} line item types.
     *               
     * 
     */
    INVALID_LINE_ITEM_TYPE,

    /**
     * 
     *                 {@link Order orders} containing {@link LineItemType#STANDARD} set-top box line items cannot
     *                 contain set-top box line items of type {@link LineItemType#HOUSE} or
     *                 {@link LineItemType#SPONSORSHIP}.
     *               
     * 
     */
    ORDERS_WITH_STANDARD_LINE_ITEMS_CANNOT_CONTAIN_HOUSE_OR_SPONSORSHIP_LINE_ITEMS,

    /**
     * 
     *                 Set-top box line items only support {@link CostType#CPM}.
     *               
     * 
     */
    INVALID_COST_TYPE,

    /**
     * 
     *                 Set-top box line items do not support a cost per unit.
     *               
     * 
     */
    COST_PER_UNIT_NOT_ALLOWED,

    /**
     * 
     *                 Set-top box line items do not support discounts.
     *               
     * 
     */
    DISCOUNT_NOT_ALLOWED,

    /**
     * 
     *                 Set-top box line items do not support {@link DeliveryRateType#FRONTLOADED}.
     *               
     * 
     */
    FRONTLOADED_DELIVERY_RATE_NOT_SUPPORTED,

    /**
     * 
     *                 Set-top box line items cannot go from a state that is ready to be synced to a
     *                 state that is not ready to be synced.
     *               
     * 
     */
    INVALID_LINE_ITEM_STATUS_CHANGE,

    /**
     * 
     *                 Set-top box line items can only have certain priorities for different
     *                 {@link ReservationType reservation types}:
     *                 <ul>
     *                 <li>{@link ReservationType#SPONSORSHIP} => 1</li>
     *                 <li>{@link ReservationType#HOUSE} => 16</li>
     *                 <li>{@link ReservationType#STANDARD} => Between 1 and 16 inclusive.</li>
     *                 </ul>
     *               
     * 
     */
    INVALID_LINE_ITEM_PRIORITY,

    /**
     * 
     *                 When a set-top box line item is pushed to Canoe, a revision number is used to keep track of
     *                 the last version of the line item that DFP synced with Canoe. The only changes allowed on
     *                 revisions within DFP is increasing the revision number.
     *               
     * 
     */
    SYNC_REVISION_NOT_INCREASING,

    /**
     * 
     *                 When a set-top box line item is pushed to Canoe, a revision number is used to keep track of
     *                 the last version of the line item that DFP synced with Canoe. Sync revisions begin at one and
     *                 can only increase in value.
     *               
     * 
     */
    SYNC_REVISION_MUST_BE_GREATER_THAN_ZERO,

    /**
     * 
     *                 Set Top box line items cannot be unarchived.
     *               
     * 
     */
    CANNOT_UNARCHIVE_SET_TOP_BOX_LINE_ITEMS,

    /**
     * 
     *                 Set-top box enabled line items cannot be copied for V0 of the video Canoe campaign push.
     *               
     * 
     */
    COPY_SET_TOP_BOX_ENABLED_LINE_ITEM_NOT_ALLOWED,

    /**
     * 
     *                 Standard set-top box line items cannot be updated to be {@link LineItemType#House} or
     *                 {@link LineItemType#Sponsorship} line items and vice versa.
     *               
     * 
     */
    INVALID_LINE_ITEM_TYPE_CHANGE,

    /**
     * 
     *                 Set-top box line items can only have a creative rotation type of
     *                 {@link CreativeRotationType.EVEN} or {@link CreativeRotationType#MANUAL}.
     *               
     * 
     */
    CREATIVE_ROTATION_TYPE_MUST_BE_EVENLY_OR_WEIGHTED,

    /**
     * 
     *                 Set-top box line items can only have frequency capping with time units of
     *                 {@link TimeUnit#DAY}, {@link TimeUnit#HOUR}, {@link TimeUnit#POD}, or
     *                 {@link TimeUnit#STREAM}.
     *               
     * 
     */
    INVALID_FREQUENCY_CAP_TIME_UNIT,

    /**
     * 
     *                 Set-top box line items can only have specific time ranges for certain time units:
     *                 <ul>
     *                 <li>{@link TimeUnit#HOUR} => 1, 2, 6</li>
     *                 <li>{@link TimeUnit#DAY} => 1, 3</li>
     *                 </ul>
     *               
     * 
     */
    INVALID_FREQUENCY_CAP_TIME_RANGE,

    /**
     * 
     *                 Set-top box line items can only have a unit type of {@link UnitType#IMPRESSIONS}.
     *               
     * 
     */
    INVALID_PRIMARY_GOAL_UNIT_TYPE,

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

    public static SetTopBoxLineItemErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

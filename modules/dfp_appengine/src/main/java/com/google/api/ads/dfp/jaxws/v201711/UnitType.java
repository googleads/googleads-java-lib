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
 * <p>Java class for UnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMPRESSIONS"/>
 *     &lt;enumeration value="CLICKS"/>
 *     &lt;enumeration value="CLICK_THROUGH_CPA_CONVERSIONS"/>
 *     &lt;enumeration value="VIEW_THROUGH_CPA_CONVERSIONS"/>
 *     &lt;enumeration value="TOTAL_CPA_CONVERSIONS"/>
 *     &lt;enumeration value="VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitType")
@XmlEnum
public enum UnitType {


    /**
     * 
     *                 The number of impressions served by creatives associated with the line
     *                 item. Line items of all {@link LineItemType} support this {@code UnitType}.
     *               
     * 
     */
    IMPRESSIONS,

    /**
     * 
     *                 The number of clicks reported by creatives associated with the line item.
     *                 The {@link LineItem#lineItemType} must be
     *                 {@link LineItemType#STANDARD}, {@link LineItemType#BULK} or
     *                 {@link LineItemType#PRICE_PRIORITY}.
     *               
     * 
     */
    CLICKS,

    /**
     * 
     *                 The number of click-through Cost-Per-Action (CPA) conversions from creatives
     *                 associated with the line item. This is only supported as secondary goal and the
     *                 {@link LineItem#costType} must be {@link CostType#CPA}.
     *               
     * 
     */
    CLICK_THROUGH_CPA_CONVERSIONS,

    /**
     * 
     *                 The number of view-through Cost-Per-Action (CPA) conversions from creatives
     *                 associated with the line item. This is only supported as secondary goal and the
     *                 {@link LineItem#costType} must be {@link CostType#CPA}.
     *               
     * 
     */
    VIEW_THROUGH_CPA_CONVERSIONS,

    /**
     * 
     *                 The number of total Cost-Per-Action (CPA) conversions from creatives
     *                 associated with the line item. This is only supported as secondary goal and the
     *                 {@link LineItem#costType} must be {@link CostType#CPA}.
     *               
     * 
     */
    TOTAL_CPA_CONVERSIONS,

    /**
     * 
     *                 The number of viewable impressions reported by creatives associated with the line item.
     *                 The {@link LineItem#lineItemType} must be {@link LineItemType#STANDARD}.
     *               
     * 
     */
    VIEWABLE_IMPRESSIONS,

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

    public static UnitType fromValue(String v) {
        return valueOf(v);
    }

}

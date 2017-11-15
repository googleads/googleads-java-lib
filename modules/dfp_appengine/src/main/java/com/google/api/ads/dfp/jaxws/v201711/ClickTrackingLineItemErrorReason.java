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
 * <p>Java class for ClickTrackingLineItemError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClickTrackingLineItemError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TYPE_IMMUTABLE"/>
 *     &lt;enumeration value="INVALID_TARGETING_TYPE"/>
 *     &lt;enumeration value="INVALID_ROADBLOCKING_TYPE"/>
 *     &lt;enumeration value="INVALID_CREATIVEROTATION_TYPE"/>
 *     &lt;enumeration value="INVALID_DELIVERY_RATE_TYPE"/>
 *     &lt;enumeration value="UNSUPPORTED_FIELD"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClickTrackingLineItemError.Reason")
@XmlEnum
public enum ClickTrackingLineItemErrorReason {


    /**
     * 
     *                 The line item type cannot be changed once created.
     *               
     * 
     */
    TYPE_IMMUTABLE,

    /**
     * 
     *                 Click tracking line items can only be targeted at ad unit inventory, all other
     *                 types are invalid, as well as placements.
     *               
     * 
     */
    INVALID_TARGETING_TYPE,

    /**
     * 
     *                 Click tracking line items do not allow us to control creative delivery so
     *                 are by nature one or more as entered by the third party.
     *               
     * 
     */
    INVALID_ROADBLOCKING_TYPE,

    /**
     * 
     *                 Click tracking line items do not support the
     *                 {@link CreativeRotationType#OPTIMIZED} creative rotation type.
     *               
     * 
     */
    INVALID_CREATIVEROTATION_TYPE,

    /**
     * 
     *                 Click tracking line items do not allow us to control line item delivery so
     *                 we can not control the rate at which they are served.
     *               
     * 
     */
    INVALID_DELIVERY_RATE_TYPE,

    /**
     * 
     *                 Not all fields are supported by the click tracking line items.
     *               
     * 
     */
    UNSUPPORTED_FIELD,

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

    public static ClickTrackingLineItemErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

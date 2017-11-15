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
 * <p>Java class for DeliveryRateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryRateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EVENLY"/>
 *     &lt;enumeration value="FRONTLOADED"/>
 *     &lt;enumeration value="AS_FAST_AS_POSSIBLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryRateType")
@XmlEnum
public enum DeliveryRateType {


    /**
     * 
     *                 Line items are served as evenly as possible across the number of
     *                 days specified in a line item's {@link LineItem#duration}.
     *               
     * 
     */
    EVENLY,

    /**
     * 
     *                 Line items are served more aggressively in the beginning of the flight
     *                 date.
     *               
     * 
     */
    FRONTLOADED,

    /**
     * 
     *                 The booked impressions for a line item may be delivered well before the
     *                 {@link LineItem#endDateTime}. Other lower-priority or lower-value line
     *                 items will be stopped from delivering until this line item meets the number
     *                 of impressions or clicks it is booked for.
     *               
     * 
     */
    AS_FAST_AS_POSSIBLE;

    public String value() {
        return name();
    }

    public static DeliveryRateType fromValue(String v) {
        return valueOf(v);
    }

}

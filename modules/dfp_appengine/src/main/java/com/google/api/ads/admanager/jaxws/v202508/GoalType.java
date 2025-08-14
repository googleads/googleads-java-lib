// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GoalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="LIFETIME"/&gt;
 *     &lt;enumeration value="DAILY"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GoalType")
@XmlEnum
public enum GoalType {


    /**
     * 
     *                 No goal is specified for the number of ads delivered. The
     *                 {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#AD_EXCHANGE}</li>
     *                 <li>{@link LineItemType#CLICK_TRACKING}</li>
     *                 </ul>
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 There is a goal on the number of ads delivered for this line item during
     *                 its entire lifetime. The {@link LineItem#lineItemType} must be
     *                 one of:
     *                 <ul>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#BULK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#ADSENSE}</li>
     *                 <li>{@link LineItemType#AD_EXCHANGE}</li>
     *                 <li>{@link LineItemType#ADMOB}</li>
     *                 <li>{@link LineItemType#CLICK_TRACKING}</li>
     *                 </ul>
     *               
     * 
     */
    LIFETIME,

    /**
     * 
     *                 There is a daily goal on the number of ads delivered for this line item.
     *                 The {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#NETWORK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#HOUSE}</li>
     *                 <li>{@link LineItemType#ADSENSE}</li>
     *                 <li>{@link LineItemType#AD_EXCHANGE}</li>
     *                 <li>{@link LineItemType#ADMOB}</li>
     *                 <li>{@link LineItemType#BUMPER}</li>
     *                 </ul>
     *               
     * 
     */
    DAILY,

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

    public static GoalType fromValue(String v) {
        return valueOf(v);
    }

}

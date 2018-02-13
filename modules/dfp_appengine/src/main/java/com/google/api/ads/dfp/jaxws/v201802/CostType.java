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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CostType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CPA"/>
 *     &lt;enumeration value="CPC"/>
 *     &lt;enumeration value="CPD"/>
 *     &lt;enumeration value="CPM"/>
 *     &lt;enumeration value="VCPM"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CostType")
@XmlEnum
public enum CostType {


    /**
     * 
     *                 Cost per action. The {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#BULK}</li>
     *                 <li>{@link LineItemType#NETWORK}</li>
     *                 </ul>
     *               
     * 
     */
    CPA,

    /**
     * 
     *                 Cost per click. The {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#BULK}</li>
     *                 <li>{@link LineItemType#NETWORK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#HOUSE}</li>
     *                 </ul>
     *               
     * 
     */
    CPC,

    /**
     * 
     *                 Cost per day. The {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}<li>
     *                 <li>{@link LineItemType#NETWORK}<li>
     *                 </ul>
     *               
     * 
     */
    CPD,

    /**
     * 
     *                 Cost per mille (cost per thousand impressions). The
     *                 {@link LineItem#lineItemType} must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#BULK}</li>
     *                 <li>{@link LineItemType#NETWORK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#HOUSE}</li>
     *                 </ul>
     *               
     * 
     */
    CPM,

    /**
     * 
     *                 Cost per thousand Active View viewable impressions. The {@link LineItem#lineItemType}
     *                 must be {@link LineItemType#STANDARD}.
     *               
     * 
     */
    VCPM,

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

    public static CostType fromValue(String v) {
        return valueOf(v);
    }

}

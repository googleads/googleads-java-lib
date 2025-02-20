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


package com.google.api.ads.admanager.jaxws.v202502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CostType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CPA"/&gt;
 *     &lt;enumeration value="CPC"/&gt;
 *     &lt;enumeration value="CPD"/&gt;
 *     &lt;enumeration value="CPM"/&gt;
 *     &lt;enumeration value="VCPM"/&gt;
 *     &lt;enumeration value="CPM_IN_TARGET"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CostType")
@XmlEnum
public enum CostType {


    /**
     * 
     *                 Starting February 22, 2024 the CPA {@link CostType} will be read only as part of Spotlight
     *                 deprecation, <a href="https://support.google.com/admanager/answer/7519021#spotlight">learn
     *                 more</a>.
     *                 
     *                 <p>Cost per action. The {@link LineItem#lineItemType} must be one of:
     *                 
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}
     *                 <li>{@link LineItemType#STANDARD}
     *                 <li>{@link LineItemType#BULK}
     *                 <li>{@link LineItemType#NETWORK}
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
     *                 Cost per thousand in-target impressions. The {@link LineItem#lineItemType}
     *                 must be {@link LineItemType#STANDARD}.
     *               
     * 
     */
    CPM_IN_TARGET,

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

// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeHistoryEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeHistoryEntityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="BASE_RATE"/&gt;
 *     &lt;enumeration value="COMPANY"/&gt;
 *     &lt;enumeration value="CONTACT"/&gt;
 *     &lt;enumeration value="CREATIVE"/&gt;
 *     &lt;enumeration value="CREATIVE_SET"/&gt;
 *     &lt;enumeration value="CUSTOM_FIELD"/&gt;
 *     &lt;enumeration value="CUSTOM_KEY"/&gt;
 *     &lt;enumeration value="CUSTOM_VALUE"/&gt;
 *     &lt;enumeration value="PLACEMENT"/&gt;
 *     &lt;enumeration value="AD_UNIT"/&gt;
 *     &lt;enumeration value="LABEL"/&gt;
 *     &lt;enumeration value="LINE_ITEM"/&gt;
 *     &lt;enumeration value="NETWORK"/&gt;
 *     &lt;enumeration value="ORDER"/&gt;
 *     &lt;enumeration value="PREMIUM_RATE"/&gt;
 *     &lt;enumeration value="PRODUCT"/&gt;
 *     &lt;enumeration value="PRODUCT_PACKAGE"/&gt;
 *     &lt;enumeration value="PRODUCT_PACKAGE_ITEM"/&gt;
 *     &lt;enumeration value="PRODUCT_TEMPLATE"/&gt;
 *     &lt;enumeration value="PROPOSAL"/&gt;
 *     &lt;enumeration value="PROPOSAL_LINK"/&gt;
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM"/&gt;
 *     &lt;enumeration value="PACKAGE"/&gt;
 *     &lt;enumeration value="RATE_CARD"/&gt;
 *     &lt;enumeration value="ROLE"/&gt;
 *     &lt;enumeration value="TEAM"/&gt;
 *     &lt;enumeration value="USER"/&gt;
 *     &lt;enumeration value="WORKFLOW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChangeHistoryEntityType")
@XmlEnum
public enum ChangeHistoryEntityType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,
    BASE_RATE,
    COMPANY,
    CONTACT,
    CREATIVE,
    CREATIVE_SET,
    CUSTOM_FIELD,
    CUSTOM_KEY,
    CUSTOM_VALUE,
    PLACEMENT,
    AD_UNIT,
    LABEL,
    LINE_ITEM,
    NETWORK,
    ORDER,
    PREMIUM_RATE,
    PRODUCT,
    PRODUCT_PACKAGE,
    PRODUCT_PACKAGE_ITEM,
    PRODUCT_TEMPLATE,
    PROPOSAL,
    PROPOSAL_LINK,
    PROPOSAL_LINE_ITEM,
    PACKAGE,
    RATE_CARD,
    ROLE,
    TEAM,
    USER,
    WORKFLOW;

    public String value() {
        return name();
    }

    public static ChangeHistoryEntityType fromValue(String v) {
        return valueOf(v);
    }

}

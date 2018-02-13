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
 * <p>Java class for ChangeHistoryEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeHistoryEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="BASE_RATE"/>
 *     &lt;enumeration value="COMPANY"/>
 *     &lt;enumeration value="CONTACT"/>
 *     &lt;enumeration value="CREATIVE"/>
 *     &lt;enumeration value="CREATIVE_SET"/>
 *     &lt;enumeration value="CUSTOM_FIELD"/>
 *     &lt;enumeration value="CUSTOM_KEY"/>
 *     &lt;enumeration value="CUSTOM_VALUE"/>
 *     &lt;enumeration value="PLACEMENT"/>
 *     &lt;enumeration value="AD_UNIT"/>
 *     &lt;enumeration value="LABEL"/>
 *     &lt;enumeration value="LINE_ITEM"/>
 *     &lt;enumeration value="NETWORK"/>
 *     &lt;enumeration value="ORDER"/>
 *     &lt;enumeration value="PREMIUM_RATE"/>
 *     &lt;enumeration value="PRODUCT"/>
 *     &lt;enumeration value="PRODUCT_PACKAGE"/>
 *     &lt;enumeration value="PRODUCT_PACKAGE_ITEM"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE"/>
 *     &lt;enumeration value="PROPOSAL"/>
 *     &lt;enumeration value="PROPOSAL_LINK"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM"/>
 *     &lt;enumeration value="PACKAGE"/>
 *     &lt;enumeration value="RATE_CARD"/>
 *     &lt;enumeration value="ROLE"/>
 *     &lt;enumeration value="TEAM"/>
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="WORKFLOW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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

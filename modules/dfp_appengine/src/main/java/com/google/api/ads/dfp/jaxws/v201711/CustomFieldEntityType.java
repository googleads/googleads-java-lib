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
 * <p>Java class for CustomFieldEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LINE_ITEM"/>
 *     &lt;enumeration value="ORDER"/>
 *     &lt;enumeration value="CREATIVE"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE"/>
 *     &lt;enumeration value="PRODUCT"/>
 *     &lt;enumeration value="PROPOSAL"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM"/>
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomFieldEntityType")
@XmlEnum
public enum CustomFieldEntityType {


    /**
     * 
     *                 Represents the {@link LineItem} type.
     *               
     * 
     */
    LINE_ITEM,

    /**
     * 
     *                 Represents the {@link Order} type.
     *               
     * 
     */
    ORDER,

    /**
     * 
     *                 Represents the {@link Creative} type.
     *               
     * 
     */
    CREATIVE,

    /**
     * 
     *                 Represents the {@link ProductTemplate} type.
     *               
     * 
     */
    PRODUCT_TEMPLATE,

    /**
     * 
     *                 Represents the {@link Product} type.
     *               
     * 
     */
    PRODUCT,

    /**
     * 
     *                 Represents the {@link Proposal} type.
     *               
     * 
     */
    PROPOSAL,

    /**
     * 
     *                 Represents the {@link ProposalLineItem} type.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM,

    /**
     * 
     *                 Represents the {@link User} type.
     *               
     * 
     */
    USER,

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

    public static CustomFieldEntityType fromValue(String v) {
        return valueOf(v);
    }

}

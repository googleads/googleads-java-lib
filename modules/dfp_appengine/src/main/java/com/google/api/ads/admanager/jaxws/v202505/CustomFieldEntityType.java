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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldEntityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LINE_ITEM"/&gt;
 *     &lt;enumeration value="ORDER"/&gt;
 *     &lt;enumeration value="CREATIVE"/&gt;
 *     &lt;enumeration value="PROPOSAL"/&gt;
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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

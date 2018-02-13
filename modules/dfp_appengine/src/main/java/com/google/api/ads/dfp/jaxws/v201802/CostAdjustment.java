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
 * <p>Java class for CostAdjustment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CostAdjustment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="MAKE_GOOD"/>
 *     &lt;enumeration value="BARTER"/>
 *     &lt;enumeration value="ADDED_VALUE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CostAdjustment")
@XmlEnum
public enum CostAdjustment {


    /**
     * 
     *                 Indicates that the {@link ProposalLineItem} has no cost adjustment.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 Indicates that the cost adjustment of the {@link ProposalLineItem} is make good.
     *               
     * 
     */
    MAKE_GOOD,

    /**
     * 
     *                 Indicates that the cost adjustment of the {@link ProposalLineItem} is barter.
     *               
     * 
     */
    BARTER,

    /**
     * 
     *                 Indicates that the cost adjustment of the {@link ProposalLineItem} is added value.
     *               
     * 
     */
    ADDED_VALUE,

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

    public static CostAdjustment fromValue(String v) {
        return valueOf(v);
    }

}

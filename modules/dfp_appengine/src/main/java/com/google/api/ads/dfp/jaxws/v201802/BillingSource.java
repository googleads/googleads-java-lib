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
 * <p>Java class for BillingSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTRACTED"/>
 *     &lt;enumeration value="DFP_VOLUME"/>
 *     &lt;enumeration value="THIRD_PARTY_VOLUME"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingSource")
@XmlEnum
public enum BillingSource {


    /**
     * 
     *                 Charge based on the quantity of impressions, clicks, or days booked, regardless of
     *                 what actually delivered.
     *               
     * 
     */
    CONTRACTED,

    /**
     * 
     *                 Charge based on what actually delivered counted by DFP
     *               
     * 
     */
    DFP_VOLUME,

    /**
     * 
     *                 Charge based on what actually delivered counted by third party ads server
     *               
     * 
     */
    THIRD_PARTY_VOLUME,

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

    public static BillingSource fromValue(String v) {
        return valueOf(v);
    }

}

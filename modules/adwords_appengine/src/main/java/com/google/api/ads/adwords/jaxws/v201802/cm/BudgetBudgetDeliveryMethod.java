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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Budget.BudgetDeliveryMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Budget.BudgetDeliveryMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="ACCELERATED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Budget.BudgetDeliveryMethod")
@XmlEnum
public enum BudgetBudgetDeliveryMethod {


    /**
     * 
     *                 The budget server will throttle serving evenly across the entire time period.
     *               
     * 
     */
    STANDARD,

    /**
     * 
     *                 The budget server will not throttle serving, and ads will serve as fast as possible.
     *               
     * 
     */
    ACCELERATED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BudgetBudgetDeliveryMethod fromValue(String v) {
        return valueOf(v);
    }

}

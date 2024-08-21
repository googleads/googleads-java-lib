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
 * <p>Java class for BillingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNSUPPORTED_BILLING_SCHEDULE"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_BILLING_CAP"/&gt;
 *     &lt;enumeration value="MISSING_BILLING_SOURCE"/&gt;
 *     &lt;enumeration value="MISSING_BILLING_SCHEDULE"/&gt;
 *     &lt;enumeration value="MISSING_BILLING_CAP"/&gt;
 *     &lt;enumeration value="INVALID_BILLING_SOURCE_FOR_OFFLINE"/&gt;
 *     &lt;enumeration value="UPDATE_BILLING_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="MISSING_BILLING_BASE"/&gt;
 *     &lt;enumeration value="INVALID_BILLING_BASE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillingError.Reason")
@XmlEnum
public enum BillingErrorReason {


    /**
     * 
     *                 Found unsupported billing schedule.
     *               
     * 
     */
    UNSUPPORTED_BILLING_SCHEDULE,

    /**
     * 
     *                 Found unsupported billing cap.
     *               
     * 
     */
    UNSUPPORTED_BILLING_CAP,

    /**
     * 
     *                 Billing source is missing when either billing scheule or billing cap is provided.
     *               
     * 
     */
    MISSING_BILLING_SOURCE,

    /**
     * 
     *                 Billing schedule is missing when the provided billing source is CONSTRACTED.
     *               
     * 
     */
    MISSING_BILLING_SCHEDULE,

    /**
     * 
     *                 Billing cap is missing when the provided billing source is not CONSTRACTED.
     *               
     * 
     */
    MISSING_BILLING_CAP,

    /**
     * 
     *                 The billing source is invalid for offline proposal line item.
     *               
     * 
     */
    INVALID_BILLING_SOURCE_FOR_OFFLINE,

    /**
     * 
     *                 Billing settings cannot be updated once the proposal has been approved.
     *               
     * 
     */
    UPDATE_BILLING_NOT_ALLOWED,

    /**
     * 
     *                 Billing base is missing when the provided billing source is CONTRACTED.
     *               
     * 
     */
    MISSING_BILLING_BASE,

    /**
     * 
     *                 The billing base is invalid for the provided billing source.
     *               
     * 
     */
    INVALID_BILLING_BASE,

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

    public static BillingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

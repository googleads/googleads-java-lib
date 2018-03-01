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
 * <p>Java class for AdServingOptimizationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdServingOptimizationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPTIMIZE"/>
 *     &lt;enumeration value="CONVERSION_OPTIMIZE"/>
 *     &lt;enumeration value="ROTATE"/>
 *     &lt;enumeration value="ROTATE_INDEFINITELY"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdServingOptimizationStatus")
@XmlEnum
public enum AdServingOptimizationStatus {


    /**
     * 
     *                 Ad serving is optimized based on CTR for the campaign.
     *               
     * 
     */
    OPTIMIZE,

    /**
     * 
     *                 Ad serving is optimized based on CTR * Conversion for the campaign. If the campaign is not in
     *                 the conversion optimizer bidding strategy, it will default to OPTIMIZED.
     *               
     * 
     */
    CONVERSION_OPTIMIZE,

    /**
     * 
     *                 Ads are rotated evenly for 90 days, then optimized for clicks.
     *               
     * 
     */
    ROTATE,

    /**
     * 
     *                 Show lower performing ads more evenly with higher performing ads, and do not optimize.
     *               
     * 
     */
    ROTATE_INDEFINITELY,

    /**
     * 
     *                 Ad serving optimization status is not available.
     *               
     * 
     */
    UNAVAILABLE,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdServingOptimizationStatus fromValue(String v) {
        return valueOf(v);
    }

}

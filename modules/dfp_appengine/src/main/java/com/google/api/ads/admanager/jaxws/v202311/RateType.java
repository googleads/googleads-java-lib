// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CPM"/&gt;
 *     &lt;enumeration value="CPC"/&gt;
 *     &lt;enumeration value="CPD"/&gt;
 *     &lt;enumeration value="CPU"/&gt;
 *     &lt;enumeration value="FLAT_FEE"/&gt;
 *     &lt;enumeration value="VCPM"/&gt;
 *     &lt;enumeration value="CPM_IN_TARGET"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateType")
@XmlEnum
public enum RateType {


    /**
     * 
     *                 The rate applies to cost per mille (CPM) revenue.
     *               
     * 
     */
    CPM,

    /**
     * 
     *                 The rate applies to cost per click (CPC) revenue.
     *               
     * 
     */
    CPC,

    /**
     * 
     *                 The rate applies to cost per day (CPD) revenue.
     *               
     * 
     */
    CPD,

    /**
     * 
     *                 The rate applies to cost per unit (CPU) revenue.
     *               
     * 
     */
    CPU,

    /**
     * 
     *                 The rate applies to flat fee revenue.
     *               
     * 
     */
    FLAT_FEE,

    /**
     * 
     *                 The rate applies to Active View viewable cost per mille (vCPM) revenue.
     *               
     * 
     */
    VCPM,

    /**
     * 
     *                 The rate applies to cost per mille in-target (CPM In-Target).
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

    public static RateType fromValue(String v) {
        return valueOf(v);
    }

}

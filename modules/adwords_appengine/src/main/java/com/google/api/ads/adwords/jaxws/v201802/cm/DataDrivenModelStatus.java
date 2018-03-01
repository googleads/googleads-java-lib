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
 * <p>Java class for DataDrivenModelStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataDrivenModelStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="STALE"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="NEVER_GENERATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataDrivenModelStatus")
@XmlEnum
public enum DataDrivenModelStatus {


    /**
     * 
     *                 The data driven model status is unknown.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 A data driven model is available.
     *               
     * 
     */
    AVAILABLE,

    /**
     * 
     *                 The data driven model is stale. It hasn't been updated for at least 7 days. It
     *                 is still being used, but will become expired if it does not get updated for 30
     *                 days.
     *               
     * 
     */
    STALE,

    /**
     * 
     *                 The data driven model expired. It hasn't been updated for at least 30 days and
     *                 cannot be used. Most commonly this is because there haven't been the required
     *                 number of events in a recent 30-day period.
     *               
     * 
     */
    EXPIRED,

    /**
     * 
     *                 A data driven model has never been generated. Most commonly this is because
     *                 there has never been the required number of events in any 30-day period.
     *               
     * 
     */
    NEVER_GENERATED;

    public String value() {
        return name();
    }

    public static DataDrivenModelStatus fromValue(String v) {
        return valueOf(v);
    }

}

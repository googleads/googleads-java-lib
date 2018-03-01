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
 * <p>Java class for ConversionTracker.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionTracker.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENABLED"/>
 *     &lt;enumeration value="DISABLED"/>
 *     &lt;enumeration value="HIDDEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionTracker.Status")
@XmlEnum
public enum ConversionTrackerStatus {


    /**
     * 
     *                 Visits to the conversion page will be recorded.
     *               
     * 
     */
    ENABLED,

    /**
     * 
     *                 Visits to the conversion page will not be recorded.
     *               
     * 
     */
    DISABLED,

    /**
     * 
     *                 Conversions will be recorded, but the conversion tracker will not appear in the UI.
     *               
     * 
     */
    HIDDEN;

    public String value() {
        return name();
    }

    public static ConversionTrackerStatus fromValue(String v) {
        return valueOf(v);
    }

}

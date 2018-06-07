// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201806.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetPerformanceLabel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetPerformanceLabel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="LEARNING"/>
 *     &lt;enumeration value="LOW"/>
 *     &lt;enumeration value="GOOD"/>
 *     &lt;enumeration value="BEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetPerformanceLabel")
@XmlEnum
public enum AssetPerformanceLabel {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 This asset does not yet have any performance info. This may be because it is
     *                 still under review.
     *               
     * 
     */
    PENDING,

    /**
     * 
     *                 The asset has started getting impressions; but the stats are not statistically
     *                 significant enough to assign a label.
     *               
     * 
     */
    LEARNING,

    /**
     * 
     *                 Worst performing assets.
     *               
     * 
     */
    LOW,

    /**
     * 
     *                 Medium performing assets.
     *               
     * 
     */
    GOOD,

    /**
     * 
     *                 Best performing assets.
     *               
     * 
     */
    BEST;

    public String value() {
        return name();
    }

    public static AssetPerformanceLabel fromValue(String v) {
        return valueOf(v);
    }

}

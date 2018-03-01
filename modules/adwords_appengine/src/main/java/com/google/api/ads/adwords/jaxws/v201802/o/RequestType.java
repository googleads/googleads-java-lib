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


package com.google.api.ads.adwords.jaxws.v201802.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IDEAS"/>
 *     &lt;enumeration value="STATS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestType")
@XmlEnum
public enum RequestType {


    /**
     * 
     *                 Request for new ideas based on other entries in selector.
     *                 This {@link RequestType} can be used to request other ideas
     *                 using keyword/placements that the user already has.
     *               
     * 
     */
    IDEAS,

    /**
     * 
     *                 Request for stats for entries in selector.
     *                 This {@link RequestType} can be used to request
     *                 the stats for keywords/placements that the user already has.
     *                 
     *                 <p>Stats are generated once a month (typically on the last week of the
     *                 month) from the historical data of previous months.</p>
     *               
     * 
     */
    STATS;

    public String value() {
        return name();
    }

    public static RequestType fromValue(String v) {
        return valueOf(v);
    }

}

// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportQuery.AdUnitView.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportQuery.AdUnitView">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOP_LEVEL"/>
 *     &lt;enumeration value="FLAT"/>
 *     &lt;enumeration value="HIERARCHICAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportQuery.AdUnitView")
@XmlEnum
public enum ReportQueryAdUnitView {


    /**
     * 
     *                 Only the top level ad units. Metrics include events for their
     *                 descendants that are not filtered out.
     *               
     * 
     */
    TOP_LEVEL,

    /**
     * 
     *                 All the ad units. Metrics do not include events for the descendants.
     *               
     * 
     */
    FLAT,

    /**
     * 
     *                 Use the ad unit hierarchy. There will be as many ad unit columns as
     *                 levels of ad units in the generated report:
     *                 <ul>
     *                 <li>
     *                 The column {@link Dimension#AD_UNIT_NAME} is replaced with columns
     *                 "Ad unit 1", "Ad unit 2", ... "Ad unit n".
     *                 If level is not applicable to a row, "N/A" is returned as the value.
     *                 </li>
     *                 <li>
     *                 The column {@link Dimension#AD_UNIT_ID} is replaced with columns
     *                 "Ad unit ID 1", "Ad unit ID 2", ... "Ad unit ID n".
     *                 If level is not applicable to a row, "N/A" is returned as the value.
     *                 </li>
     *                 </ul>
     *                 <p>
     *                 Metrics do not include events for the descendants.
     *               
     * 
     */
    HIERARCHICAL;

    public String value() {
        return name();
    }

    public static ReportQueryAdUnitView fromValue(String v) {
        return valueOf(v);
    }

}

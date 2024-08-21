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
 * <p>Java class for LineItemActivityAssociationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemActivityAssociationError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVALID_ACTIVITY_FOR_ADVERTISER"/&gt;
 *     &lt;enumeration value="INVALID_COST_TYPE_FOR_ASSOCIATION"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LineItemActivityAssociationError.Reason")
@XmlEnum
public enum LineItemActivityAssociationErrorReason {


    /**
     * 
     *                 When associating an activity to a line item the activity must belong to the same
     *                 advertiser as the line item.
     *               
     * 
     */
    INVALID_ACTIVITY_FOR_ADVERTISER,

    /**
     * 
     *                 Activities can only be associated with line items of {@link CostType.CPA}.
     *               
     * 
     */
    INVALID_COST_TYPE_FOR_ASSOCIATION,

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

    public static LineItemActivityAssociationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

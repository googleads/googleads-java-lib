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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdUnitHierarchyError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdUnitHierarchyError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_DEPTH"/>
 *     &lt;enumeration value="INVALID_PARENT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdUnitHierarchyError.Reason")
@XmlEnum
public enum AdUnitHierarchyErrorReason {


    /**
     * 
     *                 The depth of the {@link AdUnit} in the inventory hierarchy is greater
     *                 than is allowed. The maximum allowed depth is two below the effective
     *                 root ad unit for Premium accounts and one level below effective root ad
     *                 unit for Small Business accounts.
     *               
     * 
     */
    INVALID_DEPTH,

    /**
     * 
     *                 The only valid {@link AdUnit#parentId} for a DFP Small Business account
     *                 is the {@link Network#effectiveRootAdUnitId}.
     *               
     * 
     */
    INVALID_PARENT,

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

    public static AdUnitHierarchyErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

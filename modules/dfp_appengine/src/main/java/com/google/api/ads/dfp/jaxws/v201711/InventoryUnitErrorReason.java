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
 * <p>Java class for InventoryUnitError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryUnitError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXPLICIT_TARGETING_NOT_ALLOWED"/>
 *     &lt;enumeration value="TARGET_PLATFORM_NOT_APPLICABLE"/>
 *     &lt;enumeration value="ADSENSE_CANNOT_BE_ENABLED"/>
 *     &lt;enumeration value="ROOT_UNIT_CANNOT_BE_DEACTIVATED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryUnitError.Reason")
@XmlEnum
public enum InventoryUnitErrorReason {


    /**
     * 
     *                 {@link AdUnit#explicitlyTargeted} can be set to {@code true} only in a
     *                 DFP Premium account.
     *               
     * 
     */
    EXPLICIT_TARGETING_NOT_ALLOWED,

    /**
     * 
     *                 The specified target platform is not applicable for the inventory unit.
     *               
     * 
     */
    TARGET_PLATFORM_NOT_APPLICABLE,

    /**
     * 
     *                 AdSense cannot be enabled on this inventory unit if it is disabled for the network.
     *               
     * 
     */
    ADSENSE_CANNOT_BE_ENABLED,

    /**
     * 
     *                 A root unit cannot be deactivated.
     *               
     * 
     */
    ROOT_UNIT_CANNOT_BE_DEACTIVATED,

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

    public static InventoryUnitErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

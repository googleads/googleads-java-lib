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
 * <p>Java class for PoddingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PoddingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_PODDING_TYPE_NONE"/>
 *     &lt;enumeration value="INVALID_PODDING_TYPE_STANDARD"/>
 *     &lt;enumeration value="INVALID_OPTIMIZED_POD_WITHOUT_DURATION"/>
 *     &lt;enumeration value="INVALID_OPTIMIZED_POD_WITHOUT_ADS"/>
 *     &lt;enumeration value="INVALID_POD_DURATION_RANGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PoddingError.Reason")
@XmlEnum
public enum PoddingErrorReason {


    /**
     * 
     *                 Invalid podding type NONE, but has podding fields filled in. Podding types are defined in
     *                 {@link com.google.ads.publisher.domain.entity.adrule.export.PoddingType}.
     *               
     * 
     */
    INVALID_PODDING_TYPE_NONE,

    /**
     * 
     *                 Invalid podding type STANDARD, but doesn't specify the max ads in pod and max ad duration
     *                 podding fields.
     *               
     * 
     */
    INVALID_PODDING_TYPE_STANDARD,

    /**
     * 
     *                 Invalid podding type OPTIMIZED, but doesn't specify pod duration.
     *               
     * 
     */
    INVALID_OPTIMIZED_POD_WITHOUT_DURATION,

    /**
     * 
     *                 Invalid optimized pod that does not specify a valid max ads in pod, which must either be a
     *                 positive number or -1 to signify that there is no maximum.
     *               
     * 
     */
    INVALID_OPTIMIZED_POD_WITHOUT_ADS,

    /**
     * 
     *                 Min pod ad duration is greater than max pod ad duration.
     *               
     * 
     */
    INVALID_POD_DURATION_RANGE;

    public String value() {
        return name();
    }

    public static PoddingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

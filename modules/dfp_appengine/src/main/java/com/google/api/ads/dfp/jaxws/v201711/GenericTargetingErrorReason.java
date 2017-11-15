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
 * <p>Java class for GenericTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenericTargetingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFLICTING_INCLUSION_OR_EXCLUSION_OF_SIBLINGS"/>
 *     &lt;enumeration value="INCLUDING_DESCENDANTS_OF_EXCLUDED_CRITERIA"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GenericTargetingError.Reason")
@XmlEnum
public enum GenericTargetingErrorReason {


    /**
     * 
     *                 Both including and excluding sibling criteria is disallowed.
     *               
     * 
     */
    CONFLICTING_INCLUSION_OR_EXCLUSION_OF_SIBLINGS,

    /**
     * 
     *                 Including descendants of excluded criteria is disallowed.
     *               
     * 
     */
    INCLUDING_DESCENDANTS_OF_EXCLUDED_CRITERIA,

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

    public static GenericTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

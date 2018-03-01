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
 * <p>Java class for SharedCriterionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SharedCriterionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXCEEDS_CRITERIA_LIMIT"/>
 *     &lt;enumeration value="INCORRECT_CRITERION_TYPE"/>
 *     &lt;enumeration value="CANNOT_TARGET_AND_EXCLUDE"/>
 *     &lt;enumeration value="NEGATIVE_CRITERION_REQUIRED"/>
 *     &lt;enumeration value="CONCRETE_TYPE_REQUIRED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SharedCriterionError.Reason")
@XmlEnum
public enum SharedCriterionErrorReason {

    EXCEEDS_CRITERIA_LIMIT,
    INCORRECT_CRITERION_TYPE,

    /**
     * 
     *                 Cannot add the same crietrion as positive and negative in the same shared set.
     *               
     * 
     */
    CANNOT_TARGET_AND_EXCLUDE,

    /**
     * 
     *                 Negative shared set type requires a negative shared set criterion.
     *               
     * 
     */
    NEGATIVE_CRITERION_REQUIRED,

    /**
     * 
     *                 Concrete type of criterion (e.g., keyword and placement) is required for ADD operations.
     *               
     * 
     */
    CONCRETE_TYPE_REQUIRED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SharedCriterionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

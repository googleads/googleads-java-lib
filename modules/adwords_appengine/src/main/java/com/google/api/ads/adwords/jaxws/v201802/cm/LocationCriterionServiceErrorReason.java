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
 * <p>Java class for LocationCriterionServiceError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationCriterionServiceError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUIRED_LOCATION_CRITERION_PREDICATE_MISSING"/>
 *     &lt;enumeration value="TOO_MANY_LOCATION_CRITERION_PREDICATES_SPECIFIED"/>
 *     &lt;enumeration value="INVALID_COUNTRY_CODE"/>
 *     &lt;enumeration value="LOCATION_NAME_TOO_LARGE"/>
 *     &lt;enumeration value="LOCATION_CRITERION_SERVICE_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationCriterionServiceError.Reason")
@XmlEnum
public enum LocationCriterionServiceErrorReason {

    REQUIRED_LOCATION_CRITERION_PREDICATE_MISSING,
    TOO_MANY_LOCATION_CRITERION_PREDICATES_SPECIFIED,
    INVALID_COUNTRY_CODE,
    LOCATION_NAME_TOO_LARGE,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    LOCATION_CRITERION_SERVICE_ERROR;

    public String value() {
        return name();
    }

    public static LocationCriterionServiceErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

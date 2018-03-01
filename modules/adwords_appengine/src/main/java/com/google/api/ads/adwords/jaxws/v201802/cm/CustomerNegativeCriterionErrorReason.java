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
 * <p>Java class for CustomerNegativeCriterionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerNegativeCriterionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_CRITERION_TYPE"/>
 *     &lt;enumeration value="SHARED_SET_IS_DELETED"/>
 *     &lt;enumeration value="INVALID_SHARED_SET_TYPE"/>
 *     &lt;enumeration value="PLACEMENT_LIST_TYPE_ONLY_ALLOWED_FOR_XBID"/>
 *     &lt;enumeration value="MANAGER_CUSTOMER_CANNOT_ADD"/>
 *     &lt;enumeration value="CUSTOMER_EXCLUSION_CRITERION_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerNegativeCriterionError.Reason")
@XmlEnum
public enum CustomerNegativeCriterionErrorReason {

    INVALID_CRITERION_TYPE,

    /**
     * 
     *                 Cannot create a criterion with a deleted SharedSet.
     *               
     * 
     */
    SHARED_SET_IS_DELETED,

    /**
     * 
     *                 Cannot create a criterion with an invalid SharedSetType.
     *               
     * 
     */
    INVALID_SHARED_SET_TYPE,

    /**
     * 
     *                 Only Xbid customers can exclude criteria of placement list type.
     *               
     * 
     */
    PLACEMENT_LIST_TYPE_ONLY_ALLOWED_FOR_XBID,

    /**
     * 
     *                 Manager customer is not allowed to add customer exclusion criteria.
     *               
     * 
     */
    MANAGER_CUSTOMER_CANNOT_ADD,
    CUSTOMER_EXCLUSION_CRITERION_ERROR;

    public String value() {
        return name();
    }

    public static CustomerNegativeCriterionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

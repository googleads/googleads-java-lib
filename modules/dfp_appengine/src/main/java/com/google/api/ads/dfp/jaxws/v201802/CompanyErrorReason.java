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
 * <p>Java class for CompanyError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_SET_THIRD_PARTY_COMPANY_DUE_TO_TYPE"/>
 *     &lt;enumeration value="CANNOT_UPDATE_COMPANY_TYPE"/>
 *     &lt;enumeration value="INVALID_COMPANY_TYPE"/>
 *     &lt;enumeration value="PRIMARY_CONTACT_DOES_NOT_BELONG_TO_THIS_COMPANY"/>
 *     &lt;enumeration value="THIRD_PARTY_STATS_PROVIDER_IS_WRONG_ROLE_TYPE"/>
 *     &lt;enumeration value="INVALID_LABEL_ASSOCIATION"/>
 *     &lt;enumeration value="INVALID_COMPANY_TYPE_FOR_DEFAULT_BILLING_SETTING"/>
 *     &lt;enumeration value="INVALID_DEFAULT_BILLING_SETTING"/>
 *     &lt;enumeration value="COMPANY_HAS_ACTIVE_SHARE_ASSIGNMENTS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanyError.Reason")
@XmlEnum
public enum CompanyErrorReason {


    /**
     * 
     *                 Indicates that an attempt was made to set a third party company for a
     *                 company whose type is not the same as the third party company.
     *               
     * 
     */
    CANNOT_SET_THIRD_PARTY_COMPANY_DUE_TO_TYPE,

    /**
     * 
     *                 Indicates that an invalid attempt was made to change a company's type.
     *               
     * 
     */
    CANNOT_UPDATE_COMPANY_TYPE,

    /**
     * 
     *                 Indicates that this type of company is not supported.
     *               
     * 
     */
    INVALID_COMPANY_TYPE,

    /**
     * 
     *                 Indicates that an attempt was made to assign a primary contact who
     *                 does not belong to the specified company.
     *               
     * 
     */
    PRIMARY_CONTACT_DOES_NOT_BELONG_TO_THIS_COMPANY,

    /**
     * 
     *                 Indicates that the user specified as the third party stats provider
     *                 is of the wrong role type.  The user must have the third party stats
     *                 provider role.
     *               
     * 
     */
    THIRD_PARTY_STATS_PROVIDER_IS_WRONG_ROLE_TYPE,

    /**
     * 
     *                 Labels can only be applied to {@link Company.Type#ADVERTISER},
     *                 {@link Company.Type#HOUSE_ADVERTISER}, and {@link Company.Type#AD_NETWORK} company types.
     *               
     * 
     */
    INVALID_LABEL_ASSOCIATION,

    /**
     * 
     *                 Indicates that the {@link Company.Type} does not support default billing settings.
     *               
     * 
     */
    INVALID_COMPANY_TYPE_FOR_DEFAULT_BILLING_SETTING,

    /**
     * 
     *                 Indicates that the format of the default billing setting is wrong.
     *               
     * 
     */
    INVALID_DEFAULT_BILLING_SETTING,

    /**
     * 
     *                 Cannot remove the cross selling config from a company that has active share assignments.
     *               
     * 
     */
    COMPANY_HAS_ACTIVE_SHARE_ASSIGNMENTS,

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

    public static CompanyErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

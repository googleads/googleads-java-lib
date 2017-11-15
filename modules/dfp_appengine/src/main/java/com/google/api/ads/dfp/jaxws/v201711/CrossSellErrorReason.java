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
 * <p>Java class for CrossSellError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CrossSellError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPANY_IS_NOT_DISTRIBUTION_PARTNER"/>
 *     &lt;enumeration value="CHANGING_PARTNER_NETWORK_IS_NOT_SUPPORTED"/>
 *     &lt;enumeration value="MISSING_DISTRIBUTOR_PARTNER_NAME"/>
 *     &lt;enumeration value="DISTRIBUTOR_NETWORK_MISSING_PUBLISHER_FEATURE"/>
 *     &lt;enumeration value="CONTENT_PROVIDER_NETWORK_MISSING_PUBLISHER_FEATURE"/>
 *     &lt;enumeration value="INVALID_DISTRIBUTOR_PARTNER_NAME"/>
 *     &lt;enumeration value="INVALID_CONTENT_PROVIDER_NETWORK"/>
 *     &lt;enumeration value="CONTENT_PROVIDER_NETWORK_CANNOT_BE_ACTIVE_NETWORK"/>
 *     &lt;enumeration value="CONTENT_PROVIDER_NETWORK_ALREADY_ENABLED_FOR_CROSS_SELLING"/>
 *     &lt;enumeration value="DISTRIBUTOR_RULE_VIOLATION_ERROR"/>
 *     &lt;enumeration value="DISTRIBUTOR_RULE_VIOLATION_WARNING"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CrossSellError.Reason")
@XmlEnum
public enum CrossSellErrorReason {


    /**
     * 
     *                 A company for cross-sell partner must be of type {@link Company.Type#PARTNER}.
     *               
     * 
     */
    COMPANY_IS_NOT_DISTRIBUTION_PARTNER,

    /**
     * 
     *                 The network code of a cross-sell partner cannot be changed.
     *               
     * 
     */
    CHANGING_PARTNER_NETWORK_IS_NOT_SUPPORTED,

    /**
     * 
     *                 A cross-sell partner must have a partner name.
     *               
     * 
     */
    MISSING_DISTRIBUTOR_PARTNER_NAME,

    /**
     * 
     *                 The cross-sell distributor publisher feature must be enabled.
     *               
     * 
     */
    DISTRIBUTOR_NETWORK_MISSING_PUBLISHER_FEATURE,

    /**
     * 
     *                 The cross-sell content provider publisher feature must be enabled on the partner's network.
     *               
     * 
     */
    CONTENT_PROVIDER_NETWORK_MISSING_PUBLISHER_FEATURE,

    /**
     * 
     *                 The cross-sell partner name conflicts with an ad unit name on the partner's network.
     *               
     * 
     */
    INVALID_DISTRIBUTOR_PARTNER_NAME,

    /**
     * 
     *                 The network code of a cross-sell partner is invalid.
     *               
     * 
     */
    INVALID_CONTENT_PROVIDER_NETWORK,

    /**
     * 
     *                 The content provider network must be different than the distributor network.
     *               
     * 
     */
    CONTENT_PROVIDER_NETWORK_CANNOT_BE_ACTIVE_NETWORK,

    /**
     * 
     *                 The same network code was already enabled for cross-sell in a different company.
     *               
     * 
     */
    CONTENT_PROVIDER_NETWORK_ALREADY_ENABLED_FOR_CROSS_SELLING,

    /**
     * 
     *                 A rule defined by the cross selling distributor has been violated by a line item targeting
     *                 a shared ad unit. Violating this rule is an error.
     *               
     * 
     */
    DISTRIBUTOR_RULE_VIOLATION_ERROR,

    /**
     * 
     *                 A rule defined by the cross selling distributor has been violated by a line item targeting
     *                 a shared ad unit. Violating this rule is a warning.
     *                 
     *                 <p>By setting {@link LineItem#skipCrossSellingRuleWarningChecks}, the content partner can
     *                 suppress the warning (and create or save the line item).
     *                 
     *                 <p>This flag is available beginning in V201411.
     *               
     * 
     */
    DISTRIBUTOR_RULE_VIOLATION_WARNING,

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

    public static CrossSellErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for ProgrammaticEntitiesError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgrammaticEntitiesError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_RATE_TYPE"/>
 *     &lt;enumeration value="INVALID_ENVIRONMENT_TYPE"/>
 *     &lt;enumeration value="INVALID_PRODUCT_TYPE"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="INVALID_ROADBLOCKING_TYPE"/>
 *     &lt;enumeration value="INVALID_DELIVERY_RATE_TYPE"/>
 *     &lt;enumeration value="INVALID_COMPANION_DELIVERY_OPTION"/>
 *     &lt;enumeration value="INVALID_CREATIVE_ROTATION_TYPE"/>
 *     &lt;enumeration value="INVALID_COMPANION_CREATIVE_PLACEHOLDER"/>
 *     &lt;enumeration value="EMPTY_CREATIVE_PLACEHOLDER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgrammaticEntitiesError.Reason")
@XmlEnum
public enum ProgrammaticEntitiesErrorReason {


    /**
     * 
     *                 {@link RateType} is not supported.
     *               
     * 
     */
    INVALID_RATE_TYPE,

    /**
     * 
     *                 {@link EnvironmentType} must match {@link AdExchangeEnvironment AdExchange environment}.
     *               
     * 
     */
    INVALID_ENVIRONMENT_TYPE,

    /**
     * 
     *                 {@link ProductType} is not supported.
     *               
     * 
     */
    INVALID_PRODUCT_TYPE,

    /**
     * 
     *                 {@link LineItemType} is not supported.
     *               
     * 
     */
    INVALID_LINE_ITEM_TYPE,

    /**
     * 
     *                 {@link RoadblockingType} is not supported.
     *               
     * 
     */
    INVALID_ROADBLOCKING_TYPE,

    /**
     * 
     *                 {@link DeliveryRateType} is not supported.
     *               
     * 
     */
    INVALID_DELIVERY_RATE_TYPE,

    /**
     * 
     *                 {@link CompanionDeliveryOption} is not supported.
     *               
     * 
     */
    INVALID_COMPANION_DELIVERY_OPTION,

    /**
     * 
     *                 {@link CreativeRotationType} is not supported.
     *               
     * 
     */
    INVALID_CREATIVE_ROTATION_TYPE,

    /**
     * 
     *                 {@link CreativePlaceholder} should not have companions.
     *               
     * 
     */
    INVALID_COMPANION_CREATIVE_PLACEHOLDER,

    /**
     * 
     *                 {@link CreativePlaceholder Creative placeholders} cannot be {@code null} or empty.
     *               
     * 
     */
    EMPTY_CREATIVE_PLACEHOLDER,

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

    public static ProgrammaticEntitiesErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

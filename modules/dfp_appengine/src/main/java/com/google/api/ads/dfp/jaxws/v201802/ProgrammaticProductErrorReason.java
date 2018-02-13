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
 * <p>Java class for ProgrammaticProductError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgrammaticProductError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRODUCT_MARKETPLACE_INFO_IS_NULL"/>
 *     &lt;enumeration value="ENVIRONMENT_IS_NULL"/>
 *     &lt;enumeration value="INVALID_AD_EXCHANGE_ENVIRONMENT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgrammaticProductError.Reason")
@XmlEnum
public enum ProgrammaticProductErrorReason {


    /**
     * 
     *                 {@link ProductMarketplaceInfo Product Marketplace info} cannot be {@code null}.
     *               
     * 
     */
    PRODUCT_MARKETPLACE_INFO_IS_NULL,

    /**
     * 
     *                 {@link AdExchangeEnvironment AdExchange environment} cannot be {@code null}.
     *               
     * 
     */
    ENVIRONMENT_IS_NULL,

    /**
     * 
     *                 {@link AdExchangeEnvironment AdExchange environment} is invalid.
     *               
     * 
     */
    INVALID_AD_EXCHANGE_ENVIRONMENT,

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

    public static ProgrammaticProductErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for NetworkError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="MULTI_CURRENCY_NOT_SUPPORTED"/>
 *     &lt;enumeration value="UNSUPPORTED_CURRENCY"/>
 *     &lt;enumeration value="NETWORK_CURRENCY_CANNOT_BE_SAME_AS_SECONDARY"/>
 *     &lt;enumeration value="CANNOT_DELETE_CURRENCY_WITH_ACTIVE_RATE_CARDS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkError.Reason")
@XmlEnum
public enum NetworkErrorReason {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Multi-currency support is not enabled for this network.  This is a premium feature.
     *               
     * 
     */
    MULTI_CURRENCY_NOT_SUPPORTED,

    /**
     * 
     *                 Currency provided is not supported.
     *               
     * 
     */
    UNSUPPORTED_CURRENCY,

    /**
     * 
     *                 The network currency cannot also be specified as a secondary currency.
     *               
     * 
     */
    NETWORK_CURRENCY_CANNOT_BE_SAME_AS_SECONDARY,

    /**
     * 
     *                 The currency cannot be deleted as it is still being used by active rate cards.
     *               
     * 
     */
    CANNOT_DELETE_CURRENCY_WITH_ACTIVE_RATE_CARDS;

    public String value() {
        return name();
    }

    public static NetworkErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

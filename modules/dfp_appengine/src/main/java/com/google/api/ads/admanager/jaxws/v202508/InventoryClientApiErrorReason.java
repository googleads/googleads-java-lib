// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryClientApiError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryClientApiError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCESS_DENIED"/&gt;
 *     &lt;enumeration value="ADSENSE_AUTH_ERROR"/&gt;
 *     &lt;enumeration value="ADSENSE_RPC_ERROR"/&gt;
 *     &lt;enumeration value="DOMAIN_NO_SCHEME"/&gt;
 *     &lt;enumeration value="DOMAIN_INVALID_HOST"/&gt;
 *     &lt;enumeration value="DOMAIN_INVALID_TLD"/&gt;
 *     &lt;enumeration value="DOMAIN_ONE_STRING_AND_PUBLIC_SUFFIX"/&gt;
 *     &lt;enumeration value="DOMAIN_INVALID_INPUT"/&gt;
 *     &lt;enumeration value="DOMAIN_NO_PUBLIC_SUFFIX"/&gt;
 *     &lt;enumeration value="UNKNOWN_ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryClientApiError.Reason")
@XmlEnum
public enum InventoryClientApiErrorReason {

    ACCESS_DENIED,
    ADSENSE_AUTH_ERROR,
    ADSENSE_RPC_ERROR,
    DOMAIN_NO_SCHEME,
    DOMAIN_INVALID_HOST,
    DOMAIN_INVALID_TLD,
    DOMAIN_ONE_STRING_AND_PUBLIC_SUFFIX,
    DOMAIN_INVALID_INPUT,
    DOMAIN_NO_PUBLIC_SUFFIX,
    UNKNOWN_ERROR;

    public String value() {
        return name();
    }

    public static InventoryClientApiErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

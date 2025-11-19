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


package com.google.api.ads.admanager.jaxws.v202511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyDataDeclarationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThirdPartyDataDeclarationStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="INCOMPLETE"/&gt;
 *     &lt;enumeration value="COMPLETE"/&gt;
 *     &lt;enumeration value="UNSCANNED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ThirdPartyDataDeclarationStatus")
@XmlEnum
public enum ThirdPartyDataDeclarationStatus {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 At least one detected ad technology provider wasn’t declared at the network level or on the
     *                 creative's {@link ThirdPartyDataDeclaration}.
     *               
     * 
     */
    INCOMPLETE,

    /**
     * 
     *                 All detected ad technology providers have been declared, either at the network level or on the
     *                 creative's {@link ThirdPartyDataDeclaration}.
     *               
     * 
     */
    COMPLETE,

    /**
     * 
     *                 This entity has not been recently scanned.
     *                 
     *                 <p>There is either no scanning data for this creative, or the scanning data is stale. This can
     *                 happen if the creative is not associated with any line items that are active or eligible to
     *                 serve.
     *               
     * 
     */
    UNSCANNED;

    public String value() {
        return name();
    }

    public static ThirdPartyDataDeclarationStatus fromValue(String v) {
        return valueOf(v);
    }

}

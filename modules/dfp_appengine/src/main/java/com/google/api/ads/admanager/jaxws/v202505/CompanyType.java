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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Company.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Company.Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HOUSE_ADVERTISER"/&gt;
 *     &lt;enumeration value="HOUSE_AGENCY"/&gt;
 *     &lt;enumeration value="ADVERTISER"/&gt;
 *     &lt;enumeration value="AGENCY"/&gt;
 *     &lt;enumeration value="AD_NETWORK"/&gt;
 *     &lt;enumeration value="PARTNER"/&gt;
 *     &lt;enumeration value="CHILD_PUBLISHER"/&gt;
 *     &lt;enumeration value="VIEWABILITY_PROVIDER"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Company.Type")
@XmlEnum
public enum CompanyType {


    /**
     * 
     *                 The publisher's own advertiser. When no outside advertiser buys its inventory, the publisher
     *                 may run its own advertising campaigns.
     *               
     * 
     */
    HOUSE_ADVERTISER,

    /**
     * 
     *                 The publisher's own agency.
     *               
     * 
     */
    HOUSE_AGENCY,

    /**
     * 
     *                 A business entity that buys publisher inventory to run advertising campaigns. An advertiser
     *                 is optionally associated with one or more agencies.
     *               
     * 
     */
    ADVERTISER,

    /**
     * 
     *                 A business entity that offers services, such as advertising creation, placement, and
     *                 management, to advertisers.
     *               
     * 
     */
    AGENCY,

    /**
     * 
     *                 A company representing multiple advertisers and agencies.
     *               
     * 
     */
    AD_NETWORK,

    /**
     * 
     *                 A company representing a partner.
     *               
     * 
     */
    PARTNER,

    /**
     * 
     *                 A company representing a child network.
     *               
     * 
     */
    CHILD_PUBLISHER,

    /**
     * 
     *                 A company representing a viewability provider.
     *               
     * 
     */
    VIEWABILITY_PROVIDER,

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

    public static CompanyType fromValue(String v) {
        return valueOf(v);
    }

}

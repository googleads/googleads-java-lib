// Copyright 2020 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_CHILD_NETWORK_CODE"/>
 *     &lt;enumeration value="INVALID_URL_FOR_SITE"/>
 *     &lt;enumeration value="TOO_MANY_SITES_PER_REVIEW_REQUEST"/>
 *     &lt;enumeration value="TOO_MANY_REVIEW_REQUESTS_FOR_SITE"/>
 *     &lt;enumeration value="INVALID_APPROVAL_STATUS_FOR_REVIEW"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteError.Reason")
@XmlEnum
public enum SiteErrorReason {

    INVALID_CHILD_NETWORK_CODE,
    INVALID_URL_FOR_SITE,
    TOO_MANY_SITES_PER_REVIEW_REQUEST,
    TOO_MANY_REVIEW_REQUESTS_FOR_SITE,
    INVALID_APPROVAL_STATUS_FOR_REVIEW,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SiteErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

// Copyright 2021 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202111;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CdnConfigurationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CdnConfigurationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="URL_SHOULD_NOT_CONTAIN_SCHEME"/>
 *     &lt;enumeration value="INVALID_DELIVERY_LOCATION_NAMES"/>
 *     &lt;enumeration value="CANNOT_ARCHIVE_IF_USED_BY_ACTIVE_CONTENT_SOURCES"/>
 *     &lt;enumeration value="CANNOT_ARCHIVE_IF_USED_BY_ACTIVE_LIVE_STREAMS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CdnConfigurationError.Reason")
@XmlEnum
public enum CdnConfigurationErrorReason {


    /**
     * 
     *                 URL prefixes should not contain schemes.
     *               
     * 
     */
    URL_SHOULD_NOT_CONTAIN_SCHEME,

    /**
     * 
     *                 Invalid delivery setting name. Names for new delivery settings must be null or empty. Names
     *                 for existing delivery settings cannot be modified.
     *               
     * 
     */
    INVALID_DELIVERY_LOCATION_NAMES,

    /**
     * 
     *                 A CDN configuration cannot be archived if it is used by active content sources.
     *               
     * 
     */
    CANNOT_ARCHIVE_IF_USED_BY_ACTIVE_CONTENT_SOURCES,

    /**
     * 
     *                 A CDN configuration cannot be archived if it is used by active live streams.
     *               
     * 
     */
    CANNOT_ARCHIVE_IF_USED_BY_ACTIVE_LIVE_STREAMS,

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

    public static CdnConfigurationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

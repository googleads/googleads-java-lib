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
 * <p>Java class for SetTopBoxCreativeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SetTopBoxCreativeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXTERNAL_ASSET_ID_IMMUTABLE"/>
 *     &lt;enumeration value="EXTERNAL_ASSET_ID_REQUIRED"/>
 *     &lt;enumeration value="PROVIDER_ID_IMMUTABLE"/>
 *     &lt;enumeration value="INVALID_THIRD_PARTY_TRACKING_URL_EVENT_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetTopBoxCreativeError.Reason")
@XmlEnum
public enum SetTopBoxCreativeErrorReason {


    /**
     * 
     *                 Set-top box creative external asset IDs are immutable after creation.
     *               
     * 
     */
    EXTERNAL_ASSET_ID_IMMUTABLE,

    /**
     * 
     *                 Set-top box creatives require an external asset ID.
     *               
     * 
     */
    EXTERNAL_ASSET_ID_REQUIRED,

    /**
     * 
     *                 Set-top box creative provider IDs are immutable after creation.
     *               
     * 
     */
    PROVIDER_ID_IMMUTABLE,

    /**
     * 
     *                 An invalid tracking URL event type was set on the set-top box creative.
     *               
     * 
     */
    INVALID_THIRD_PARTY_TRACKING_URL_EVENT_TYPE,

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

    public static SetTopBoxCreativeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

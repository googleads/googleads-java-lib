// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202402;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestPlatformTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestPlatformTargetingError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REQUEST_PLATFORM_TYPE_NOT_SUPPORTED_BY_LINE_ITEM_TYPE"/&gt;
 *     &lt;enumeration value="REQUEST_PLATFORM_TYPE_NOT_SUPPORTED_BY_ENVIRONMENT_TYPE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestPlatformTargetingError.Reason")
@XmlEnum
public enum RequestPlatformTargetingErrorReason {


    /**
     * 
     *                 The line item type does not support the targeted request platform type.
     *               
     * 
     */
    REQUEST_PLATFORM_TYPE_NOT_SUPPORTED_BY_LINE_ITEM_TYPE,

    /**
     * 
     *                 The line item environment type does not support the targeted request platform type.
     *               
     * 
     */
    REQUEST_PLATFORM_TYPE_NOT_SUPPORTED_BY_ENVIRONMENT_TYPE,

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

    public static RequestPlatformTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

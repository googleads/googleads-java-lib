// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranscodingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TranscodingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_COPY_CREATIVE_PENDING_TRANSCODE"/>
 *     &lt;enumeration value="CANNOT_COPY_INVALID_CREATIVE"/>
 *     &lt;enumeration value="TRANSCODING_IS_IN_PROGRESS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TranscodingError.Reason")
@XmlEnum
public enum TranscodingErrorReason {


    /**
     * 
     *                 The request to copy the creative(s) was rejected because the source is not transcoded.
     *               
     * 
     */
    CANNOT_COPY_CREATIVE_PENDING_TRANSCODE,

    /**
     * 
     *                 The request to copy the creative(s) was rejected because the source is invalid.
     *               
     * 
     */
    CANNOT_COPY_INVALID_CREATIVE,

    /**
     * 
     *                 The creative is still being transcoded or processed. Please try again later.
     *               
     * 
     */
    TRANSCODING_IS_IN_PROGRESS,

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

    public static TranscodingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

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
 * <p>Java class for RichMediaStudioCreativeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RichMediaStudioCreativeError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CREATION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UKNOWN_ERROR"/&gt;
 *     &lt;enumeration value="INVALID_CODE_GENERATION_REQUEST"/&gt;
 *     &lt;enumeration value="INVALID_CREATIVE_OBJECT"/&gt;
 *     &lt;enumeration value="STUDIO_CONNECTION_ERROR"/&gt;
 *     &lt;enumeration value="PUSHDOWN_DURATION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="INVALID_POSITION"/&gt;
 *     &lt;enumeration value="INVALID_Z_INDEX"/&gt;
 *     &lt;enumeration value="INVALID_PUSHDOWN_DURATION"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RichMediaStudioCreativeError.Reason")
@XmlEnum
public enum RichMediaStudioCreativeErrorReason {


    /**
     * 
     *                 Only Studio can create a {@code RichMediaStudioCreative}.
     *               
     * 
     */
    CREATION_NOT_ALLOWED,

    /**
     * 
     *                 Unknown error
     *               
     * 
     */
    UKNOWN_ERROR,

    /**
     * 
     *                 Invalid request indicating missing/invalid request parameters.
     *               
     * 
     */
    INVALID_CODE_GENERATION_REQUEST,

    /**
     * 
     *                 Invalid creative object.
     *               
     * 
     */
    INVALID_CREATIVE_OBJECT,

    /**
     * 
     *                 Unable to connect to Rich Media Studio to save the creative. Please try again later.
     *               
     * 
     */
    STUDIO_CONNECTION_ERROR,

    /**
     * 
     *                 The push down duration is not allowed
     *               
     * 
     */
    PUSHDOWN_DURATION_NOT_ALLOWED,

    /**
     * 
     *                 The position is invalid
     *               
     * 
     */
    INVALID_POSITION,

    /**
     * 
     *                 The Z-index is invalid
     *               
     * 
     */
    INVALID_Z_INDEX,

    /**
     * 
     *                 The push-down duration is invalid
     *               
     * 
     */
    INVALID_PUSHDOWN_DURATION,

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

    public static RichMediaStudioCreativeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

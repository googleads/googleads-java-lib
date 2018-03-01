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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_VIDEO"/>
 *     &lt;enumeration value="STORAGE_ERROR"/>
 *     &lt;enumeration value="BAD_REQUEST"/>
 *     &lt;enumeration value="ERROR_GENERATING_STREAMING_URL"/>
 *     &lt;enumeration value="UNEXPECTED_SIZE"/>
 *     &lt;enumeration value="SERVER_ERROR"/>
 *     &lt;enumeration value="FILE_TOO_LARGE"/>
 *     &lt;enumeration value="VIDEO_PROCESSING_ERROR"/>
 *     &lt;enumeration value="INVALID_INPUT"/>
 *     &lt;enumeration value="PROBLEM_READING_FILE"/>
 *     &lt;enumeration value="INVALID_ISCI"/>
 *     &lt;enumeration value="INVALID_AD_ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoError.Reason")
@XmlEnum
public enum VideoErrorReason {


    /**
     * 
     *                 Invalid video.
     *               
     * 
     */
    INVALID_VIDEO,

    /**
     * 
     *                 Storage error.
     *               
     * 
     */
    STORAGE_ERROR,

    /**
     * 
     *                 Bad request.
     *               
     * 
     */
    BAD_REQUEST,

    /**
     * 
     *                 Server error.
     *               
     * 
     */
    ERROR_GENERATING_STREAMING_URL,

    /**
     * 
     *                 Unexpected size.
     *               
     * 
     */
    UNEXPECTED_SIZE,

    /**
     * 
     *                 Server error.
     *               
     * 
     */
    SERVER_ERROR,

    /**
     * 
     *                 File too large.
     *               
     * 
     */
    FILE_TOO_LARGE,

    /**
     * 
     *                 Video processing error.
     *               
     * 
     */
    VIDEO_PROCESSING_ERROR,

    /**
     * 
     *                 Invalid input.
     *               
     * 
     */
    INVALID_INPUT,

    /**
     * 
     *                 Problem reading file.
     *               
     * 
     */
    PROBLEM_READING_FILE,

    /**
     * 
     *                 Invalid ISCI.
     *               
     * 
     */
    INVALID_ISCI,

    /**
     * 
     *                 Invalid AD-ID.
     *               
     * 
     */
    INVALID_AD_ID;

    public String value() {
        return name();
    }

    public static VideoErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201809.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentLabelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentLabelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADULTISH"/>
 *     &lt;enumeration value="BELOW_THE_FOLD"/>
 *     &lt;enumeration value="DP"/>
 *     &lt;enumeration value="EMBEDDED_VIDEO"/>
 *     &lt;enumeration value="GAMES"/>
 *     &lt;enumeration value="JUVENILE"/>
 *     &lt;enumeration value="PROFANITY"/>
 *     &lt;enumeration value="TRAGEDY"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="VIDEO_RATING_DV_G"/>
 *     &lt;enumeration value="VIDEO_RATING_DV_PG"/>
 *     &lt;enumeration value="VIDEO_RATING_DV_T"/>
 *     &lt;enumeration value="VIDEO_RATING_DV_MA"/>
 *     &lt;enumeration value="VIDEO_NOT_YET_RATED"/>
 *     &lt;enumeration value="LIVE_STREAMING_VIDEO"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentLabelType")
@XmlEnum
public enum ContentLabelType {


    /**
     * 
     *                 Sexually suggestive content
     *               
     * 
     */
    ADULTISH,

    /**
     * 
     *                 Below the fold placements
     *               
     * 
     */
    BELOW_THE_FOLD,

    /**
     * 
     *                 Parked domains
     *               
     * 
     */
    DP,

    /**
     * 
     *                 Embedded video
     *               
     * 
     */
    EMBEDDED_VIDEO,

    /**
     * 
     *                 Games
     *               
     * 
     */
    GAMES,

    /**
     * 
     *                 Sensational & shocking
     *               
     * 
     */
    JUVENILE,

    /**
     * 
     *                 Profanity & rough language
     *               
     * 
     */
    PROFANITY,

    /**
     * 
     *                 Tragedy & conflict
     *               
     * 
     */
    TRAGEDY,

    /**
     * 
     *                 Video
     *               
     * 
     */
    VIDEO,

    /**
     * 
     *                 Content rating: G
     *               
     * 
     */
    VIDEO_RATING_DV_G,

    /**
     * 
     *                 Content rating: PG
     *               
     * 
     */
    VIDEO_RATING_DV_PG,

    /**
     * 
     *                 Content rating: T
     *               
     * 
     */
    VIDEO_RATING_DV_T,

    /**
     * 
     *                 Content rating: MA
     *               
     * 
     */
    VIDEO_RATING_DV_MA,

    /**
     * 
     *                 Content rating: not yet rated
     *               
     * 
     */
    VIDEO_NOT_YET_RATED,

    /**
     * 
     *                 Live streaming video
     *               
     * 
     */
    LIVE_STREAMING_VIDEO,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ContentLabelType fromValue(String v) {
        return valueOf(v);
    }

}

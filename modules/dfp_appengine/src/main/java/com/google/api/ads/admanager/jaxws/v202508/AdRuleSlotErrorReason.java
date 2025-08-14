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
 * <p>Java class for AdRuleSlotError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdRuleSlotError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIFFERENT_STATUS_THAN_AD_RULE"/&gt;
 *     &lt;enumeration value="INVALID_VIDEO_AD_DURATION_RANGE"/&gt;
 *     &lt;enumeration value="INVALID_VIDEO_MIDROLL_FREQUENCY_TYPE"/&gt;
 *     &lt;enumeration value="MALFORMED_VIDEO_MIDROLL_FREQUENCY_CSV"/&gt;
 *     &lt;enumeration value="MALFORMED_VIDEO_MIDROLL_FREQUENCY_SINGLE_NUMBER"/&gt;
 *     &lt;enumeration value="INVALID_OVERLAY_AD_DURATION_RANGE"/&gt;
 *     &lt;enumeration value="INVALID_OVERLAY_MIDROLL_FREQUENCY_TYPE"/&gt;
 *     &lt;enumeration value="MALFORMED_OVERLAY_MIDROLL_FREQUENCY_CSV"/&gt;
 *     &lt;enumeration value="MALFORMED_OVERLAY_MIDROLL_FREQUENCY_SINGLE_NUMBER"/&gt;
 *     &lt;enumeration value="INVALID_BUMPER_MAX_DURATION"/&gt;
 *     &lt;enumeration value="TOO_MANY_MIDROLL_SLOTS_WITHOUT_ADS"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdRuleSlotError.Reason")
@XmlEnum
public enum AdRuleSlotErrorReason {


    /**
     * 
     *                 Has a different status than the ad rule to which it belongs.
     *               
     * 
     */
    DIFFERENT_STATUS_THAN_AD_RULE,

    /**
     * 
     *                 Min video ad duration is greater than max video ad duration.
     *               
     * 
     */
    INVALID_VIDEO_AD_DURATION_RANGE,

    /**
     * 
     *                 Video mid-roll frequency type other than NONE for pre-roll or post-roll.
     *               
     * 
     */
    INVALID_VIDEO_MIDROLL_FREQUENCY_TYPE,

    /**
     * 
     *                 Invalid format for video mid-roll frequency when expecting a CSV list of
     *                 numbers. Valid formats are the following:<ul>
     *                 <li>empty
     *                 <li> comma-separated list of numbers (time milliseconds or cue points)
     *                 <li>a single number (every n milliseconds or cue points, or one
     *                 specific time / cue point)
     *                 </ul>
     *               
     * 
     */
    MALFORMED_VIDEO_MIDROLL_FREQUENCY_CSV,

    /**
     * 
     *                 Invalid format for video mid-roll frequency when expecting a single
     *                 number only, e.g., every n seconds or every n cue points.
     *               
     * 
     */
    MALFORMED_VIDEO_MIDROLL_FREQUENCY_SINGLE_NUMBER,

    /**
     * 
     *                 Min overlay ad duration is greater than max overlay ad duration.
     *               
     * 
     */
    INVALID_OVERLAY_AD_DURATION_RANGE,

    /**
     * 
     *                 Overlay mid-roll frequency type other than NONE for pre-roll or
     *                 post-roll.
     *               
     * 
     */
    INVALID_OVERLAY_MIDROLL_FREQUENCY_TYPE,

    /**
     * 
     *                 Invalid format for overlay mid-roll frequency for list of numbers. See
     *                 valid formats above.
     *               
     * 
     */
    MALFORMED_OVERLAY_MIDROLL_FREQUENCY_CSV,

    /**
     * 
     *                 Invalid format for overlay mid-roll frequency for a single number.
     *               
     * 
     */
    MALFORMED_OVERLAY_MIDROLL_FREQUENCY_SINGLE_NUMBER,

    /**
     * 
     *                 Non-positive bumper duration when expecting a positive number.
     *               
     * 
     */
    INVALID_BUMPER_MAX_DURATION,

    /**
     * 
     *                 At most one mid-roll can be set to disallow ads.
     *               
     * 
     */
    TOO_MANY_MIDROLL_SLOTS_WITHOUT_ADS,

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

    public static AdRuleSlotErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

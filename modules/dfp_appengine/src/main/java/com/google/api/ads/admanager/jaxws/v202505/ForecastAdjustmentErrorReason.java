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
 * <p>Java class for ForecastAdjustmentError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForecastAdjustmentError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AD_REQUEST_SOURCE_PLATFORMS_MUST_MATCH_SEGMENT_PLATFORMS"/&gt;
 *     &lt;enumeration value="AD_REQUEST_HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT_RELATIVE_TO_ADJUSTMENT"/&gt;
 *     &lt;enumeration value="ADJUSTED_VALUE_ABOVE_RECOMMENDED_RELATIVE_LIMIT"/&gt;
 *     &lt;enumeration value="ADJUSTED_VALUE_TOO_HIGH_RELATIVE_TO_FORECAST"/&gt;
 *     &lt;enumeration value="ADJUSTED_VALUE_TOO_LOW"/&gt;
 *     &lt;enumeration value="ADJUSTED_VALUE_TOO_LOW_RELATIVE_TO_FORECAST"/&gt;
 *     &lt;enumeration value="ADJUSTS_CROSS_SELL_INVENTORY"/&gt;
 *     &lt;enumeration value="DATE_RANGE_OVERLAPS_ANOTHER_ADJUSTMENT"/&gt;
 *     &lt;enumeration value="END_DATE_AFTER_FURTHEST_AVAILABLE_FORECAST_DATE"/&gt;
 *     &lt;enumeration value="END_DATE_NOT_ON_OR_AFTER_START_DATE"/&gt;
 *     &lt;enumeration value="HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT"/&gt;
 *     &lt;enumeration value="HISTORICAL_END_DATE_NOT_IN_PAST"/&gt;
 *     &lt;enumeration value="HISTORICAL_START_DATE_TOO_FAR_BEFORE_ADJUSTMENT_END_DATE"/&gt;
 *     &lt;enumeration value="NO_VOLUME_SETTINGS_PROVIDED"/&gt;
 *     &lt;enumeration value="NUMBER_OF_VALUES_DOES_NOT_MATCH_DATE_RANGE"/&gt;
 *     &lt;enumeration value="PARENT_SEGMENT_TARGETING_INCOMPATIBLE_WITH_HISTORICAL_BASIS_AD_REQUEST_SOURCE_SETTINGS"/&gt;
 *     &lt;enumeration value="AD_REQUEST_ADJUSTMENT_MUST_USE_PARENT_SEGMENT_TARGETING"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForecastAdjustmentError.Reason")
@XmlEnum
public enum ForecastAdjustmentErrorReason {


    /**
     * 
     *                 The adjustment has ad request source settings with a targeting expression that contains
     *                 request platform targeting that is not equal to the request platform targeting of the
     *                 targeting expression of the parent traffic forecast segment.
     *               
     * 
     */
    AD_REQUEST_SOURCE_PLATFORMS_MUST_MATCH_SEGMENT_PLATFORMS,

    /**
     * 
     *                 The adjustment has ad request historical basis settings with a source time duration that is
     *                 too short given the adjustment date range.
     *               
     * 
     */
    AD_REQUEST_HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT_RELATIVE_TO_ADJUSTMENT,

    /**
     * 
     *                 The adjustment contains at least one daily value above the recommended limit relative to the
     *                 current forecast. This error will only be thrown if adjusting the forecast above the
     *                 recommended limit is disallowed in the current request.
     *               
     * 
     */
    ADJUSTED_VALUE_ABOVE_RECOMMENDED_RELATIVE_LIMIT,

    /**
     * 
     *                 The adjustment contains at least one daily value above the allowed maximum percentage of the
     *                 current forecast.
     *               
     * 
     */
    ADJUSTED_VALUE_TOO_HIGH_RELATIVE_TO_FORECAST,

    /**
     * 
     *                 The adjustment contains at least one daily value below the allowed minimum.
     *               
     * 
     */
    ADJUSTED_VALUE_TOO_LOW,

    /**
     * 
     *                 The adjustment contains at least one daily value below the allowed minimum percentage of the
     *                 current forecast.
     *               
     * 
     */
    ADJUSTED_VALUE_TOO_LOW_RELATIVE_TO_FORECAST,

    /**
     * 
     *                 The adjustment is attempting to adjust cross-sell inventory.
     *               
     * 
     */
    ADJUSTS_CROSS_SELL_INVENTORY,

    /**
     * 
     *                 The date range of the adjustment overlaps the date range of another adjustment within the
     *                 same traffic forecast segment.
     *               
     * 
     */
    DATE_RANGE_OVERLAPS_ANOTHER_ADJUSTMENT,

    /**
     * 
     *                 The adjustment's end date is after the furthest available date in the forecast.
     *               
     * 
     */
    END_DATE_AFTER_FURTHEST_AVAILABLE_FORECAST_DATE,

    /**
     * 
     *                 A provided date range has an end date that is not on or after its start date.
     *               
     * 
     */
    END_DATE_NOT_ON_OR_AFTER_START_DATE,

    /**
     * 
     *                 A historical date range is shorter than the minimum allowed length.
     *               
     * 
     */
    HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT,

    /**
     * 
     *                 A historical date range has an end date not in the past.
     *               
     * 
     */
    HISTORICAL_END_DATE_NOT_IN_PAST,

    /**
     * 
     *                 A historical date range has a start date more than the allowed number of days before the
     *                 adjustment end date.
     *               
     * 
     */
    HISTORICAL_START_DATE_TOO_FAR_BEFORE_ADJUSTMENT_END_DATE,

    /**
     * 
     *                 No volume settings were provided.
     *               
     * 
     */
    NO_VOLUME_SETTINGS_PROVIDED,

    /**
     * 
     *                 The values provided do not span the provided date range.
     *               
     * 
     */
    NUMBER_OF_VALUES_DOES_NOT_MATCH_DATE_RANGE,

    /**
     * 
     *                 The adjustment provides historical basis ad request source settings, but the targeting of the
     *                 adjustment's parent traffic forecast segment is incompatible with that use.
     *               
     * 
     */
    PARENT_SEGMENT_TARGETING_INCOMPATIBLE_WITH_HISTORICAL_BASIS_AD_REQUEST_SOURCE_SETTINGS,

    /**
     * 
     *                 A historical basis ad request source adjustment must set {@code
     *                 useParentTrafficForecastSegmentTargeting} to {@code true} when the parent segment's targeting
     *                 contains {@code NOT} or {@code OR} expressions.
     *               
     * 
     */
    AD_REQUEST_ADJUSTMENT_MUST_USE_PARENT_SEGMENT_TARGETING,

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

    public static ForecastAdjustmentErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

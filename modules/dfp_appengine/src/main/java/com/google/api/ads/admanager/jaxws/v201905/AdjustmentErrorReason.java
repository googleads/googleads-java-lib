// Copyright 2019 Google LLC
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


package com.google.api.ads.admanager.jaxws.v201905;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdjustmentError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="START_DATE_TIME_IS_IN_PAST"/>
 *     &lt;enumeration value="END_DATE_TIME_NOT_AFTER_START_TIME"/>
 *     &lt;enumeration value="END_DATE_TIME_TOO_LATE"/>
 *     &lt;enumeration value="HISTORICAL_DATE_RANGE_INVALID"/>
 *     &lt;enumeration value="HISTORICAL_START_DATE_TIME_IS_TOO_FAR_IN_PAST"/>
 *     &lt;enumeration value="HISTORICAL_START_DATE_TIME_IS_BEFORE_CREATION_OF_INVENTORY_UNIT"/>
 *     &lt;enumeration value="HISTORICAL_END_DATE_TIME_IS_NOT_IN_PAST"/>
 *     &lt;enumeration value="HISTORICAL_END_DATE_TIME_NOT_AFTER_HISTORICAL_START_TIME"/>
 *     &lt;enumeration value="HISTORICAL_DATE_RANGE_LENGTH_DOES_NOT_MATCH_FUTURE_DATE_RANGE_LENGTH"/>
 *     &lt;enumeration value="ADJUSTMENT_ALREADY_EXISTS_FOR_AD_UNIT_IN_DATE_RANGE"/>
 *     &lt;enumeration value="INVALID_IMPRESSION_VOLUME"/>
 *     &lt;enumeration value="OVERRIDE_SIZE_SETS_MUST_BE_UNIQUE"/>
 *     &lt;enumeration value="OVERRIDE_SIZE_SET_SIZES_MUST_HAVE_THE_SAME_ENV_TYPE"/>
 *     &lt;enumeration value="OVERRIDE_SIZE_SET_SIZES_MUST_MATCH_INVENTORY"/>
 *     &lt;enumeration value="INVALID_INVENTORY_UNIT_ID"/>
 *     &lt;enumeration value="VIOLATES_CONSTRAINTS_OF_OVERLAPPING_ENTRIES"/>
 *     &lt;enumeration value="INVALID_ADJUSTMENT_UPLOAD"/>
 *     &lt;enumeration value="FUTURE_DATE_RANGE_MUST_BE_IN_WEEK_INCREMENTS"/>
 *     &lt;enumeration value="BULK_UPLOAD_ADJUSTMENT_LIMIT_REACHED"/>
 *     &lt;enumeration value="WEEKLY_MANUAL_ADJUSTMENTS_NOT_ALLOWED"/>
 *     &lt;enumeration value="TARGETING_OR_INVENTORY_UNIT_REQUIRED"/>
 *     &lt;enumeration value="CANNOT_CHANGE_ADJUSTMENT_TARGET_TYPE"/>
 *     &lt;enumeration value="OVERRIDES_NOT_ALLOWED_WITH_TARGETING"/>
 *     &lt;enumeration value="INVALID_TARGETING_EXPRESSION"/>
 *     &lt;enumeration value="ADJUSTMENT_NAME_MUST_BE_UNIQUE"/>
 *     &lt;enumeration value="END_DATE_TIME_IS_IN_PAST"/>
 *     &lt;enumeration value="HISTORICAL_TARGETING_REQUIRED"/>
 *     &lt;enumeration value="INVALID_HISTORICAL_TARGETING"/>
 *     &lt;enumeration value="AD_UNIT_REQUIRED"/>
 *     &lt;enumeration value="TARGETING_REQUIRED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdjustmentError.Reason")
@XmlEnum
public enum AdjustmentErrorReason {

    START_DATE_TIME_IS_IN_PAST,
    END_DATE_TIME_NOT_AFTER_START_TIME,
    END_DATE_TIME_TOO_LATE,
    HISTORICAL_DATE_RANGE_INVALID,
    HISTORICAL_START_DATE_TIME_IS_TOO_FAR_IN_PAST,
    HISTORICAL_START_DATE_TIME_IS_BEFORE_CREATION_OF_INVENTORY_UNIT,
    HISTORICAL_END_DATE_TIME_IS_NOT_IN_PAST,
    HISTORICAL_END_DATE_TIME_NOT_AFTER_HISTORICAL_START_TIME,
    HISTORICAL_DATE_RANGE_LENGTH_DOES_NOT_MATCH_FUTURE_DATE_RANGE_LENGTH,
    ADJUSTMENT_ALREADY_EXISTS_FOR_AD_UNIT_IN_DATE_RANGE,
    INVALID_IMPRESSION_VOLUME,
    OVERRIDE_SIZE_SETS_MUST_BE_UNIQUE,
    OVERRIDE_SIZE_SET_SIZES_MUST_HAVE_THE_SAME_ENV_TYPE,
    OVERRIDE_SIZE_SET_SIZES_MUST_MATCH_INVENTORY,
    INVALID_INVENTORY_UNIT_ID,
    VIOLATES_CONSTRAINTS_OF_OVERLAPPING_ENTRIES,
    INVALID_ADJUSTMENT_UPLOAD,
    FUTURE_DATE_RANGE_MUST_BE_IN_WEEK_INCREMENTS,
    BULK_UPLOAD_ADJUSTMENT_LIMIT_REACHED,
    WEEKLY_MANUAL_ADJUSTMENTS_NOT_ALLOWED,
    TARGETING_OR_INVENTORY_UNIT_REQUIRED,
    CANNOT_CHANGE_ADJUSTMENT_TARGET_TYPE,
    OVERRIDES_NOT_ALLOWED_WITH_TARGETING,
    INVALID_TARGETING_EXPRESSION,
    ADJUSTMENT_NAME_MUST_BE_UNIQUE,
    END_DATE_TIME_IS_IN_PAST,
    HISTORICAL_TARGETING_REQUIRED,
    INVALID_HISTORICAL_TARGETING,
    AD_UNIT_REQUIRED,
    TARGETING_REQUIRED,

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

    public static AdjustmentErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

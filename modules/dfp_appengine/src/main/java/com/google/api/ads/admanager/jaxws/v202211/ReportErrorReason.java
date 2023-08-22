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


package com.google.api.ads.admanager.jaxws.v202211;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEFAULT"/&gt;
 *     &lt;enumeration value="REPORT_ACCESS_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="DIMENSION_VIEW_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="ATTRIBUTE_VIEW_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="COLUMN_VIEW_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="TOO_MANY_CONCURRENT_REPORTS"/&gt;
 *     &lt;enumeration value="REPORT_QUERY_TOO_LONG"/&gt;
 *     &lt;enumeration value="INVALID_OPERATION_FOR_REPORT_STATE"/&gt;
 *     &lt;enumeration value="INVALID_DIMENSIONS"/&gt;
 *     &lt;enumeration value="INVALID_ATTRIBUTES"/&gt;
 *     &lt;enumeration value="INVALID_CMS_METADATA_DIMENSIONS"/&gt;
 *     &lt;enumeration value="INVALID_COLUMNS"/&gt;
 *     &lt;enumeration value="INVALID_DIMENSION_FILTERS"/&gt;
 *     &lt;enumeration value="INVALID_DATE"/&gt;
 *     &lt;enumeration value="END_DATE_TIME_NOT_AFTER_START_TIME"/&gt;
 *     &lt;enumeration value="START_DATE_MORE_THAN_THREE_YEARS_AGO"/&gt;
 *     &lt;enumeration value="NOT_NULL"/&gt;
 *     &lt;enumeration value="ATTRIBUTES_NOT_SUPPORTED_FOR_REQUEST"/&gt;
 *     &lt;enumeration value="COLUMNS_NOT_SUPPORTED_FOR_REQUESTED_DIMENSIONS"/&gt;
 *     &lt;enumeration value="DATE_RANGE_NOT_SUPPORTED_FOR_REQUESTED_REPORT"/&gt;
 *     &lt;enumeration value="TIME_ZONE_TYPE_NOT_SUPPORTED_FOR_REQUESTED_REPORT"/&gt;
 *     &lt;enumeration value="CURRENCY_CODE_NOT_SUPPORTED_FOR_REQUESTED_REPORT"/&gt;
 *     &lt;enumeration value="FAILED_TO_STORE_REPORT"/&gt;
 *     &lt;enumeration value="REPORT_NOT_FOUND"/&gt;
 *     &lt;enumeration value="SR_CANNOT_RUN_REPORT_IN_ANOTHER_NETWORK"/&gt;
 *     &lt;enumeration value="AD_UNIT_VIEW_NOT_SUPPORTED_FOR_REQUESTED_REPORT"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportError.Reason")
@XmlEnum
public enum ReportErrorReason {


    /**
     * 
     *                 Default {@code ReportError} when the reason is not among any already defined.
     *               
     * 
     */
    DEFAULT,

    /**
     * 
     *                 User does not have permission to access the report.
     *               
     * 
     */
    REPORT_ACCESS_NOT_ALLOWED,

    /**
     * 
     *                 User does not have permission to view one or more {@link Dimension}.
     *               
     * 
     */
    DIMENSION_VIEW_NOT_ALLOWED,

    /**
     * 
     *                 User has no permission to view one or more attributes.
     *               
     * 
     */
    ATTRIBUTE_VIEW_NOT_ALLOWED,

    /**
     * 
     *                 User does not have permission to view one or more {@link Column}.
     *               
     * 
     */
    COLUMN_VIEW_NOT_ALLOWED,

    /**
     * 
     *                 The user has exceeded the limit on the number of reports that can be run concurrently. The
     *                 current limit is 30 per user.
     *               
     * 
     */
    TOO_MANY_CONCURRENT_REPORTS,

    /**
     * 
     *                 The report query exceeds the maximum allowed number of characters.
     *               
     * 
     */
    REPORT_QUERY_TOO_LONG,

    /**
     * 
     *                 Invalid report job state for the given operation.
     *               
     * 
     */
    INVALID_OPERATION_FOR_REPORT_STATE,

    /**
     * 
     *                 Invalid {@link Dimension} objects specified.
     *               
     * 
     */
    INVALID_DIMENSIONS,

    /**
     * 
     *                 The attribute ID(s) are not valid.
     *               
     * 
     */
    INVALID_ATTRIBUTES,

    /**
     * 
     *                 The API error when running the report with {@link CmsMetadataKeyDimension}. There are three
     *                 reasons for this error.
     *                 
     *                 <ol>
     *                 <li>{@link ReportQuery#dimensions} contains {@link Dimension#CONTENT_CMS_METADATA}, but
     *                 {@link ReportQuery#cmsMetadataKeyIds} is empty.
     *                 <li>{@link ReportQuery#cmsMetadataKeyIds} is non-empty, but {@link ReportQuery#dimensions}
     *                 does not contain {@link Dimension#CONTENT_CMS_METADATA}.
     *                 <li>The {@link ReportQuery#cmsMetadataKeyIds} specified along with the {@link
     *                 Dimension#CONTENT_CMS_METADATA} are not valid, i.e., these IDs are not reportable cms
     *                 metadata key defined by the publisher.
     *                 </ol>
     *               
     * 
     */
    INVALID_CMS_METADATA_DIMENSIONS,

    /**
     * 
     *                 Invalid {@link Column} objects specified.
     *               
     * 
     */
    INVALID_COLUMNS,

    /**
     * 
     *                 Invalid {@link DimensionFilter} objects specified.
     *               
     * 
     */
    INVALID_DIMENSION_FILTERS,

    /**
     * 
     *                 Invalid date.
     *               
     * 
     */
    INVALID_DATE,

    /**
     * 
     *                 The start date for running the report should not be later than the end date.
     *               
     * 
     */
    END_DATE_TIME_NOT_AFTER_START_TIME,

    /**
     * 
     *                 The start date for running the report should not be more than three years before now.
     *               
     * 
     */
    START_DATE_MORE_THAN_THREE_YEARS_AGO,

    /**
     * 
     *                 The list of {@link Dimension} and {@link Column} objects cannot be empty.
     *               
     * 
     */
    NOT_NULL,

    /**
     * 
     *                 Attribute has to be selected in combination with dimensions.
     *               
     * 
     */
    ATTRIBUTES_NOT_SUPPORTED_FOR_REQUEST,

    /**
     * 
     *                 The provided report violates one or more constraints, which govern incompatibilities and
     *                 requirements between different report properties. Some reasons for constraint violations
     *                 include:
     *                 
     *                 <ul>
     *                 <li>Not all {@link Column} objects requested are supported for the given set of {@link
     *                 Dimension} objects.
     *                 <li>The report's date range is not compatible with the given set of {@link Column} objects.
     *                 <li>The report's {@link TimeZoneType} is not compatible with the given set of {@link
     *                 Column} and {@link Dimension} objects (version 201802 and later).
     *                 <li>The report's currency is not compatible with the given set of {@link Column} objects.
     *                 </ul>
     *                 
     *                 For versions 201911 and later, this is only returned when some or all of the {@link Column}
     *                 objects are not supported for the requested {@link Dimension} objects.
     *               
     * 
     */
    COLUMNS_NOT_SUPPORTED_FOR_REQUESTED_DIMENSIONS,

    /**
     * 
     *                 The report's date range is not compatible with the requested {@link Dimension} and {@link
     *                 Column} objects.
     *               
     * 
     */
    DATE_RANGE_NOT_SUPPORTED_FOR_REQUESTED_REPORT,

    /**
     * 
     *                 The report's {@link TimeZoneType} is not compatible with the requested {@link Column} and
     *                 {@link Dimension} objects.
     *               
     * 
     */
    TIME_ZONE_TYPE_NOT_SUPPORTED_FOR_REQUESTED_REPORT,

    /**
     * 
     *                 The report's currency is not compatible with the requested {@link Column} objects.
     *               
     * 
     */
    CURRENCY_CODE_NOT_SUPPORTED_FOR_REQUESTED_REPORT,

    /**
     * 
     *                 Failed to store/cache a report.
     *               
     * 
     */
    FAILED_TO_STORE_REPORT,

    /**
     * 
     *                 The requested report does not exist.
     *               
     * 
     */
    REPORT_NOT_FOUND,

    /**
     * 
     *                 User has no permission to view in another network.
     *               
     * 
     */
    SR_CANNOT_RUN_REPORT_IN_ANOTHER_NETWORK,

    /**
     * 
     *                 The report's {@link AdUnitView} is not compatible with the requested {@link Dimension} and
     *                 {@link Column} objects.
     *               
     * 
     */
    AD_UNIT_VIEW_NOT_SUPPORTED_FOR_REQUESTED_REPORT,

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

    public static ReportErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

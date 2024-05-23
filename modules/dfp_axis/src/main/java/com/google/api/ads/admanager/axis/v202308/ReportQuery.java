// Copyright 2023 Google LLC
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

/**
 * ReportQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;


/**
 * A {@code ReportQuery} object allows you to specify the selection
 * criteria for
 *             generating a report. Only reports with at least one {@link
 * Column} are supported.
 */
public class ReportQuery  implements java.io.Serializable {
    /* The list of break-down types being requested in the report.
     * The generated report will contain the dimensions in the same order
     * as requested.
     *                 This field is required. */
    private com.google.api.ads.admanager.axis.v202308.Dimension[] dimensions;

    /* The ad unit view for the report. Defaults to {@link AdUnitView#TOP_LEVEL}. */
    private com.google.api.ads.admanager.axis.v202308.ReportQueryAdUnitView adUnitView;

    /* The list of trafficking statistics and revenue information
     * being requested
     *                 in the report. The generated report will contain the
     * columns in the same
     *                 order as requested. This field is required. */
    private com.google.api.ads.admanager.axis.v202308.Column[] columns;

    /* The list of break-down attributes being requested in this report.
     * Some
     *                 {@link DimensionAttribute} values can only be used
     * with certain
     *                 {@link Dimension} values that must be included in
     * the {@link #dimensions}
     *                 attribute. The generated report will contain the attributes
     * in the same
     *                 order as requested. */
    private com.google.api.ads.admanager.axis.v202308.DimensionAttribute[] dimensionAttributes;

    /* The list of {@link CustomField#id} being requested in this
     * report.
     *                 To add a {@link CustomField} to the report, you must
     * include
     *                 its corresponding {@link Dimension}, determined by
     * the {@link CustomField#entityType},
     *                 as a {@link #dimensions dimension}.
     *                 
     *                 <table>
     *                 <tr>
     *                 <th scope="col" colspan="2">{@link CustomFieldEntityType#entityType}</th>
     * </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#LINE_ITEM}</td><td>{@link
     * Dimension#LINE_ITEM_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#ORDER}</td><td>{@link
     * Dimension#ORDER_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#CREATIVE}</td><td>{@link
     * Dimension#CREATIVE_NAME}</td>
     *                 </tr>
     *                 </table> */
    private long[] customFieldIds;

    /* The list of content CMS metadata key {@link CmsMetadataKey#id
     * IDs}
     *                 being requested in this report. Each of these IDs
     * must have been defined in the
     *                 {@link CmsMetadataKey CMS metadata key}. This will
     * include
     *                 dimensions in the form of {@code CMS_METADATA_KEY[id]_ID}
     * and
     *                 {@code CMS_METADATA_KEY[id]_VALUE} where where {@code
     * ID} is the ID of
     *                 the {@link CmsMetadataValue#id CMS metadata value}
     * and {@code VALUE} is the
     *                 {@link CmsMetadataValue#valueName name}.
     *                 <p>
     *                 To add {@link CmsMetadataKey#id IDs}, you must include
     * {@link Dimension#CMS_METADATA}
     *                 in {@link #dimensions}, and specify a non-empty list
     * of content CMS metadata key IDs.
     *                 The order of content CMS metadata columns in the report
     * correspond to the place of
     *                 {@link Dimension#CMS_METADATA} in {@link #dimensions}.
     * For example, if {@link #dimensions} contains the following dimensions
     * in the order:
     *                 {@link Dimension#ADVERTISER_NAME},
     *                 {@link Dimension#CMS_METADATA} and {@link Dimension#COUNTRY_NAME},
     * and
     *                 {@link #cmsMetadataKeyIds} contains the following
     * IDs in the
     *                 order: 1001 and 1002. The order of dimensions in the
     * report will be:
     *                 Dimension.ADVERTISER_NAME,
     *                 Dimension.CMS_METADATA_KEY[1001]_VALUE,
     *                 Dimension.CMS_METADATA_KEY[1002]_VALUE,
     *                 Dimension.COUNTRY_NAME,
     *                 Dimension.ADVERTISER_ID,
     *                 Dimension.CMS_METADATA_KEY[1001]_ID,
     *                 Dimension.CMS_METADATA_KEY[1002]_ID,
     *                 Dimension.COUNTRY_CRITERIA_ID */
    private long[] cmsMetadataKeyIds;

    /* The list of custom dimension custom targeting key {@link CustomTargetingKey#id
     * IDs} being
     *                 requested in this report. This will include dimensions
     * in the form of
     *                 {@code TOP_LEVEL_DIMENSION_KEY[id]_ID} and {@code
     * TOP_LEVEL_DIMENSION_KEY[id]_VALUE} where
     *                 {@code ID} is the ID of the {@link CustomTargetingValue#id
     * custom targeting value} and
     *                 {@code VALUE} is the {@link CustomTargetingValue#name
     * name}.
     *                 
     *                 <p>To add {@link CustomTargetingKey#id IDs}, you must
     * include
     *                 {@link Dimension#CUSTOM_DIMENSION} in {@link #dimensions},
     * and specify a non-empty list of
     *                 custom targeting key IDs. The order of cusotm dimension
     * columns in the report correspond to the
     *                 place of {@link Dimension#CUSTOM_DIMENSION} in {@link
     * #dimensions}. For example, if
     *                 {@link #dimensions} contains the following dimensions
     * in the order:
     *                 {@link Dimension#ADVERTISER_NAME}, {@link Dimension#CUSTOM_DIMENSION}
     * and
     *                 {@link Dimension#COUNTRY_NAME}, and {@link #customCriteriaCustomTargetingKeyIds}
     * contains the
     *                 following IDs in the order: 1001 and 1002. The order
     * of dimensions in the report will be:
     *                 Dimension.ADVERTISER_NAME, Dimension.TOP_LEVEL_DIMENSION_KEY[1001]_VALUE,
     * Dimension.TOP_LEVEL_DIMENSION_KEY[1002]_VALUE, Dimension.COUNTRY_NAME,
     * Dimension.ADVERTISER_ID,
     *                 Dimension.TOP_LEVEL_DIMENSION_KEY[1001]_ID, Dimension.TOP_LEVEL_DIMENSION_KEY[1002]_ID,
     * Dimension.COUNTRY_CRITERIA_ID. */
    private long[] customDimensionKeyIds;

    /* The start date from which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this. */
    private com.google.api.ads.admanager.axis.v202308.Date startDate;

    /* The end date up to which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this. */
    private com.google.api.ads.admanager.axis.v202308.Date endDate;

    /* The period of time for which the reporting data is being generated.
     * In
     *                 order to define custom time periods, set this to
     *                 {@link DateRangeType#CUSTOM_DATE}. If set to {@link
     * DateRangeType#CUSTOM_DATE}, then
     *                 {@link ReportQuery#startDate} and {@link ReportQuery#endDate}
     * will be used. */
    private com.google.api.ads.admanager.axis.v202308.DateRangeType dateRangeType;

    /* Specifies a filter to use for reporting on data. This filter
     * will be used
     *                 in conjunction (joined with an AND statement) with
     * the date range selected
     *                 through {@link #dateRangeType}, {@link #startDate},
     * and {@link #endDate}.
     *                 
     *                 The syntax currently allowed for {@link Statement#query}
     * is<br>
     *                 <code> [WHERE <condition> {AND <condition> ...}]<code><br>
     * <p><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp; <code>:= <property> = <value></code><br>
     * <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp; <code>:= <property> = <bind
     * variable></code><br>
     *                 <code><condition> := <property> IN <list></code><br>
     * <code><bind variable> := :<name></code><br>
     *                 </code> where property is the enumeration name of
     * a {@link Dimension} that
     *                 can be filtered.
     *                 <p>
     *                 For example, the statement "WHERE LINE_ITEM_ID IN
     * (34344, 23235)" can be used
     *                 to generate a report for a specific set of line items
     * <p>
     *                 Filtering on IDs is highly recommended over filtering
     * on names, especially
     *                 for geographical entities. When filtering on names,
     * matching is case
     *                 sensitive. */
    private com.google.api.ads.admanager.axis.v202308.Statement statement;

    /* The currency for revenue metrics. Defaults to the network currency
     * if left {@code null}. The
     *                 supported currency codes can be found in <a
     *                 href="https://support.google.com/adxseller/answer/6019533">this
     * Help Center article.</a> */
    private java.lang.String reportCurrency;

    private com.google.api.ads.admanager.axis.v202308.TimeZoneType timeZoneType;

    public ReportQuery() {
    }

    public ReportQuery(
           com.google.api.ads.admanager.axis.v202308.Dimension[] dimensions,
           com.google.api.ads.admanager.axis.v202308.ReportQueryAdUnitView adUnitView,
           com.google.api.ads.admanager.axis.v202308.Column[] columns,
           com.google.api.ads.admanager.axis.v202308.DimensionAttribute[] dimensionAttributes,
           long[] customFieldIds,
           long[] cmsMetadataKeyIds,
           long[] customDimensionKeyIds,
           com.google.api.ads.admanager.axis.v202308.Date startDate,
           com.google.api.ads.admanager.axis.v202308.Date endDate,
           com.google.api.ads.admanager.axis.v202308.DateRangeType dateRangeType,
           com.google.api.ads.admanager.axis.v202308.Statement statement,
           java.lang.String reportCurrency,
           com.google.api.ads.admanager.axis.v202308.TimeZoneType timeZoneType) {
           this.dimensions = dimensions;
           this.adUnitView = adUnitView;
           this.columns = columns;
           this.dimensionAttributes = dimensionAttributes;
           this.customFieldIds = customFieldIds;
           this.cmsMetadataKeyIds = cmsMetadataKeyIds;
           this.customDimensionKeyIds = customDimensionKeyIds;
           this.startDate = startDate;
           this.endDate = endDate;
           this.dateRangeType = dateRangeType;
           this.statement = statement;
           this.reportCurrency = reportCurrency;
           this.timeZoneType = timeZoneType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adUnitView", getAdUnitView())
            .add("cmsMetadataKeyIds", getCmsMetadataKeyIds())
            .add("columns", getColumns())
            .add("customDimensionKeyIds", getCustomDimensionKeyIds())
            .add("customFieldIds", getCustomFieldIds())
            .add("dateRangeType", getDateRangeType())
            .add("dimensionAttributes", getDimensionAttributes())
            .add("dimensions", getDimensions())
            .add("endDate", getEndDate())
            .add("reportCurrency", getReportCurrency())
            .add("startDate", getStartDate())
            .add("statement", getStatement())
            .add("timeZoneType", getTimeZoneType())
            .toString();
    }

    /**
     * Gets the dimensions value for this ReportQuery.
     * 
     * @return dimensions   * The list of break-down types being requested in the report.
     * The generated report will contain the dimensions in the same order
     * as requested.
     *                 This field is required.
     */
    public com.google.api.ads.admanager.axis.v202308.Dimension[] getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this ReportQuery.
     * 
     * @param dimensions   * The list of break-down types being requested in the report.
     * The generated report will contain the dimensions in the same order
     * as requested.
     *                 This field is required.
     */
    public void setDimensions(com.google.api.ads.admanager.axis.v202308.Dimension[] dimensions) {
        this.dimensions = dimensions;
    }

    public com.google.api.ads.admanager.axis.v202308.Dimension getDimensions(int i) {
        return this.dimensions[i];
    }

    public void setDimensions(int i, com.google.api.ads.admanager.axis.v202308.Dimension _value) {
        this.dimensions[i] = _value;
    }


    /**
     * Gets the adUnitView value for this ReportQuery.
     * 
     * @return adUnitView   * The ad unit view for the report. Defaults to {@link AdUnitView#TOP_LEVEL}.
     */
    public com.google.api.ads.admanager.axis.v202308.ReportQueryAdUnitView getAdUnitView() {
        return adUnitView;
    }


    /**
     * Sets the adUnitView value for this ReportQuery.
     * 
     * @param adUnitView   * The ad unit view for the report. Defaults to {@link AdUnitView#TOP_LEVEL}.
     */
    public void setAdUnitView(com.google.api.ads.admanager.axis.v202308.ReportQueryAdUnitView adUnitView) {
        this.adUnitView = adUnitView;
    }


    /**
     * Gets the columns value for this ReportQuery.
     * 
     * @return columns   * The list of trafficking statistics and revenue information
     * being requested
     *                 in the report. The generated report will contain the
     * columns in the same
     *                 order as requested. This field is required.
     */
    public com.google.api.ads.admanager.axis.v202308.Column[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this ReportQuery.
     * 
     * @param columns   * The list of trafficking statistics and revenue information
     * being requested
     *                 in the report. The generated report will contain the
     * columns in the same
     *                 order as requested. This field is required.
     */
    public void setColumns(com.google.api.ads.admanager.axis.v202308.Column[] columns) {
        this.columns = columns;
    }

    public com.google.api.ads.admanager.axis.v202308.Column getColumns(int i) {
        return this.columns[i];
    }

    public void setColumns(int i, com.google.api.ads.admanager.axis.v202308.Column _value) {
        this.columns[i] = _value;
    }


    /**
     * Gets the dimensionAttributes value for this ReportQuery.
     * 
     * @return dimensionAttributes   * The list of break-down attributes being requested in this report.
     * Some
     *                 {@link DimensionAttribute} values can only be used
     * with certain
     *                 {@link Dimension} values that must be included in
     * the {@link #dimensions}
     *                 attribute. The generated report will contain the attributes
     * in the same
     *                 order as requested.
     */
    public com.google.api.ads.admanager.axis.v202308.DimensionAttribute[] getDimensionAttributes() {
        return dimensionAttributes;
    }


    /**
     * Sets the dimensionAttributes value for this ReportQuery.
     * 
     * @param dimensionAttributes   * The list of break-down attributes being requested in this report.
     * Some
     *                 {@link DimensionAttribute} values can only be used
     * with certain
     *                 {@link Dimension} values that must be included in
     * the {@link #dimensions}
     *                 attribute. The generated report will contain the attributes
     * in the same
     *                 order as requested.
     */
    public void setDimensionAttributes(com.google.api.ads.admanager.axis.v202308.DimensionAttribute[] dimensionAttributes) {
        this.dimensionAttributes = dimensionAttributes;
    }

    public com.google.api.ads.admanager.axis.v202308.DimensionAttribute getDimensionAttributes(int i) {
        return this.dimensionAttributes[i];
    }

    public void setDimensionAttributes(int i, com.google.api.ads.admanager.axis.v202308.DimensionAttribute _value) {
        this.dimensionAttributes[i] = _value;
    }


    /**
     * Gets the customFieldIds value for this ReportQuery.
     * 
     * @return customFieldIds   * The list of {@link CustomField#id} being requested in this
     * report.
     *                 To add a {@link CustomField} to the report, you must
     * include
     *                 its corresponding {@link Dimension}, determined by
     * the {@link CustomField#entityType},
     *                 as a {@link #dimensions dimension}.
     *                 
     *                 <table>
     *                 <tr>
     *                 <th scope="col" colspan="2">{@link CustomFieldEntityType#entityType}</th>
     * </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#LINE_ITEM}</td><td>{@link
     * Dimension#LINE_ITEM_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#ORDER}</td><td>{@link
     * Dimension#ORDER_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#CREATIVE}</td><td>{@link
     * Dimension#CREATIVE_NAME}</td>
     *                 </tr>
     *                 </table>
     */
    public long[] getCustomFieldIds() {
        return customFieldIds;
    }


    /**
     * Sets the customFieldIds value for this ReportQuery.
     * 
     * @param customFieldIds   * The list of {@link CustomField#id} being requested in this
     * report.
     *                 To add a {@link CustomField} to the report, you must
     * include
     *                 its corresponding {@link Dimension}, determined by
     * the {@link CustomField#entityType},
     *                 as a {@link #dimensions dimension}.
     *                 
     *                 <table>
     *                 <tr>
     *                 <th scope="col" colspan="2">{@link CustomFieldEntityType#entityType}</th>
     * </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#LINE_ITEM}</td><td>{@link
     * Dimension#LINE_ITEM_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#ORDER}</td><td>{@link
     * Dimension#ORDER_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#CREATIVE}</td><td>{@link
     * Dimension#CREATIVE_NAME}</td>
     *                 </tr>
     *                 </table>
     */
    public void setCustomFieldIds(long[] customFieldIds) {
        this.customFieldIds = customFieldIds;
    }

    public long getCustomFieldIds(int i) {
        return this.customFieldIds[i];
    }

    public void setCustomFieldIds(int i, long _value) {
        this.customFieldIds[i] = _value;
    }


    /**
     * Gets the cmsMetadataKeyIds value for this ReportQuery.
     * 
     * @return cmsMetadataKeyIds   * The list of content CMS metadata key {@link CmsMetadataKey#id
     * IDs}
     *                 being requested in this report. Each of these IDs
     * must have been defined in the
     *                 {@link CmsMetadataKey CMS metadata key}. This will
     * include
     *                 dimensions in the form of {@code CMS_METADATA_KEY[id]_ID}
     * and
     *                 {@code CMS_METADATA_KEY[id]_VALUE} where where {@code
     * ID} is the ID of
     *                 the {@link CmsMetadataValue#id CMS metadata value}
     * and {@code VALUE} is the
     *                 {@link CmsMetadataValue#valueName name}.
     *                 <p>
     *                 To add {@link CmsMetadataKey#id IDs}, you must include
     * {@link Dimension#CMS_METADATA}
     *                 in {@link #dimensions}, and specify a non-empty list
     * of content CMS metadata key IDs.
     *                 The order of content CMS metadata columns in the report
     * correspond to the place of
     *                 {@link Dimension#CMS_METADATA} in {@link #dimensions}.
     * For example, if {@link #dimensions} contains the following dimensions
     * in the order:
     *                 {@link Dimension#ADVERTISER_NAME},
     *                 {@link Dimension#CMS_METADATA} and {@link Dimension#COUNTRY_NAME},
     * and
     *                 {@link #cmsMetadataKeyIds} contains the following
     * IDs in the
     *                 order: 1001 and 1002. The order of dimensions in the
     * report will be:
     *                 Dimension.ADVERTISER_NAME,
     *                 Dimension.CMS_METADATA_KEY[1001]_VALUE,
     *                 Dimension.CMS_METADATA_KEY[1002]_VALUE,
     *                 Dimension.COUNTRY_NAME,
     *                 Dimension.ADVERTISER_ID,
     *                 Dimension.CMS_METADATA_KEY[1001]_ID,
     *                 Dimension.CMS_METADATA_KEY[1002]_ID,
     *                 Dimension.COUNTRY_CRITERIA_ID
     */
    public long[] getCmsMetadataKeyIds() {
        return cmsMetadataKeyIds;
    }


    /**
     * Sets the cmsMetadataKeyIds value for this ReportQuery.
     * 
     * @param cmsMetadataKeyIds   * The list of content CMS metadata key {@link CmsMetadataKey#id
     * IDs}
     *                 being requested in this report. Each of these IDs
     * must have been defined in the
     *                 {@link CmsMetadataKey CMS metadata key}. This will
     * include
     *                 dimensions in the form of {@code CMS_METADATA_KEY[id]_ID}
     * and
     *                 {@code CMS_METADATA_KEY[id]_VALUE} where where {@code
     * ID} is the ID of
     *                 the {@link CmsMetadataValue#id CMS metadata value}
     * and {@code VALUE} is the
     *                 {@link CmsMetadataValue#valueName name}.
     *                 <p>
     *                 To add {@link CmsMetadataKey#id IDs}, you must include
     * {@link Dimension#CMS_METADATA}
     *                 in {@link #dimensions}, and specify a non-empty list
     * of content CMS metadata key IDs.
     *                 The order of content CMS metadata columns in the report
     * correspond to the place of
     *                 {@link Dimension#CMS_METADATA} in {@link #dimensions}.
     * For example, if {@link #dimensions} contains the following dimensions
     * in the order:
     *                 {@link Dimension#ADVERTISER_NAME},
     *                 {@link Dimension#CMS_METADATA} and {@link Dimension#COUNTRY_NAME},
     * and
     *                 {@link #cmsMetadataKeyIds} contains the following
     * IDs in the
     *                 order: 1001 and 1002. The order of dimensions in the
     * report will be:
     *                 Dimension.ADVERTISER_NAME,
     *                 Dimension.CMS_METADATA_KEY[1001]_VALUE,
     *                 Dimension.CMS_METADATA_KEY[1002]_VALUE,
     *                 Dimension.COUNTRY_NAME,
     *                 Dimension.ADVERTISER_ID,
     *                 Dimension.CMS_METADATA_KEY[1001]_ID,
     *                 Dimension.CMS_METADATA_KEY[1002]_ID,
     *                 Dimension.COUNTRY_CRITERIA_ID
     */
    public void setCmsMetadataKeyIds(long[] cmsMetadataKeyIds) {
        this.cmsMetadataKeyIds = cmsMetadataKeyIds;
    }

    public long getCmsMetadataKeyIds(int i) {
        return this.cmsMetadataKeyIds[i];
    }

    public void setCmsMetadataKeyIds(int i, long _value) {
        this.cmsMetadataKeyIds[i] = _value;
    }


    /**
     * Gets the customDimensionKeyIds value for this ReportQuery.
     * 
     * @return customDimensionKeyIds   * The list of custom dimension custom targeting key {@link CustomTargetingKey#id
     * IDs} being
     *                 requested in this report. This will include dimensions
     * in the form of
     *                 {@code TOP_LEVEL_DIMENSION_KEY[id]_ID} and {@code
     * TOP_LEVEL_DIMENSION_KEY[id]_VALUE} where
     *                 {@code ID} is the ID of the {@link CustomTargetingValue#id
     * custom targeting value} and
     *                 {@code VALUE} is the {@link CustomTargetingValue#name
     * name}.
     *                 
     *                 <p>To add {@link CustomTargetingKey#id IDs}, you must
     * include
     *                 {@link Dimension#CUSTOM_DIMENSION} in {@link #dimensions},
     * and specify a non-empty list of
     *                 custom targeting key IDs. The order of cusotm dimension
     * columns in the report correspond to the
     *                 place of {@link Dimension#CUSTOM_DIMENSION} in {@link
     * #dimensions}. For example, if
     *                 {@link #dimensions} contains the following dimensions
     * in the order:
     *                 {@link Dimension#ADVERTISER_NAME}, {@link Dimension#CUSTOM_DIMENSION}
     * and
     *                 {@link Dimension#COUNTRY_NAME}, and {@link #customCriteriaCustomTargetingKeyIds}
     * contains the
     *                 following IDs in the order: 1001 and 1002. The order
     * of dimensions in the report will be:
     *                 Dimension.ADVERTISER_NAME, Dimension.TOP_LEVEL_DIMENSION_KEY[1001]_VALUE,
     * Dimension.TOP_LEVEL_DIMENSION_KEY[1002]_VALUE, Dimension.COUNTRY_NAME,
     * Dimension.ADVERTISER_ID,
     *                 Dimension.TOP_LEVEL_DIMENSION_KEY[1001]_ID, Dimension.TOP_LEVEL_DIMENSION_KEY[1002]_ID,
     * Dimension.COUNTRY_CRITERIA_ID.
     */
    public long[] getCustomDimensionKeyIds() {
        return customDimensionKeyIds;
    }


    /**
     * Sets the customDimensionKeyIds value for this ReportQuery.
     * 
     * @param customDimensionKeyIds   * The list of custom dimension custom targeting key {@link CustomTargetingKey#id
     * IDs} being
     *                 requested in this report. This will include dimensions
     * in the form of
     *                 {@code TOP_LEVEL_DIMENSION_KEY[id]_ID} and {@code
     * TOP_LEVEL_DIMENSION_KEY[id]_VALUE} where
     *                 {@code ID} is the ID of the {@link CustomTargetingValue#id
     * custom targeting value} and
     *                 {@code VALUE} is the {@link CustomTargetingValue#name
     * name}.
     *                 
     *                 <p>To add {@link CustomTargetingKey#id IDs}, you must
     * include
     *                 {@link Dimension#CUSTOM_DIMENSION} in {@link #dimensions},
     * and specify a non-empty list of
     *                 custom targeting key IDs. The order of cusotm dimension
     * columns in the report correspond to the
     *                 place of {@link Dimension#CUSTOM_DIMENSION} in {@link
     * #dimensions}. For example, if
     *                 {@link #dimensions} contains the following dimensions
     * in the order:
     *                 {@link Dimension#ADVERTISER_NAME}, {@link Dimension#CUSTOM_DIMENSION}
     * and
     *                 {@link Dimension#COUNTRY_NAME}, and {@link #customCriteriaCustomTargetingKeyIds}
     * contains the
     *                 following IDs in the order: 1001 and 1002. The order
     * of dimensions in the report will be:
     *                 Dimension.ADVERTISER_NAME, Dimension.TOP_LEVEL_DIMENSION_KEY[1001]_VALUE,
     * Dimension.TOP_LEVEL_DIMENSION_KEY[1002]_VALUE, Dimension.COUNTRY_NAME,
     * Dimension.ADVERTISER_ID,
     *                 Dimension.TOP_LEVEL_DIMENSION_KEY[1001]_ID, Dimension.TOP_LEVEL_DIMENSION_KEY[1002]_ID,
     * Dimension.COUNTRY_CRITERIA_ID.
     */
    public void setCustomDimensionKeyIds(long[] customDimensionKeyIds) {
        this.customDimensionKeyIds = customDimensionKeyIds;
    }

    public long getCustomDimensionKeyIds(int i) {
        return this.customDimensionKeyIds[i];
    }

    public void setCustomDimensionKeyIds(int i, long _value) {
        this.customDimensionKeyIds[i] = _value;
    }


    /**
     * Gets the startDate value for this ReportQuery.
     * 
     * @return startDate   * The start date from which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this.
     */
    public com.google.api.ads.admanager.axis.v202308.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ReportQuery.
     * 
     * @param startDate   * The start date from which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this.
     */
    public void setStartDate(com.google.api.ads.admanager.axis.v202308.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ReportQuery.
     * 
     * @return endDate   * The end date up to which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this.
     */
    public com.google.api.ads.admanager.axis.v202308.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ReportQuery.
     * 
     * @param endDate   * The end date up to which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this.
     */
    public void setEndDate(com.google.api.ads.admanager.axis.v202308.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the dateRangeType value for this ReportQuery.
     * 
     * @return dateRangeType   * The period of time for which the reporting data is being generated.
     * In
     *                 order to define custom time periods, set this to
     *                 {@link DateRangeType#CUSTOM_DATE}. If set to {@link
     * DateRangeType#CUSTOM_DATE}, then
     *                 {@link ReportQuery#startDate} and {@link ReportQuery#endDate}
     * will be used.
     */
    public com.google.api.ads.admanager.axis.v202308.DateRangeType getDateRangeType() {
        return dateRangeType;
    }


    /**
     * Sets the dateRangeType value for this ReportQuery.
     * 
     * @param dateRangeType   * The period of time for which the reporting data is being generated.
     * In
     *                 order to define custom time periods, set this to
     *                 {@link DateRangeType#CUSTOM_DATE}. If set to {@link
     * DateRangeType#CUSTOM_DATE}, then
     *                 {@link ReportQuery#startDate} and {@link ReportQuery#endDate}
     * will be used.
     */
    public void setDateRangeType(com.google.api.ads.admanager.axis.v202308.DateRangeType dateRangeType) {
        this.dateRangeType = dateRangeType;
    }


    /**
     * Gets the statement value for this ReportQuery.
     * 
     * @return statement   * Specifies a filter to use for reporting on data. This filter
     * will be used
     *                 in conjunction (joined with an AND statement) with
     * the date range selected
     *                 through {@link #dateRangeType}, {@link #startDate},
     * and {@link #endDate}.
     *                 
     *                 The syntax currently allowed for {@link Statement#query}
     * is<br>
     *                 <code> [WHERE <condition> {AND <condition> ...}]<code><br>
     * <p><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp; <code>:= <property> = <value></code><br>
     * <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp; <code>:= <property> = <bind
     * variable></code><br>
     *                 <code><condition> := <property> IN <list></code><br>
     * <code><bind variable> := :<name></code><br>
     *                 </code> where property is the enumeration name of
     * a {@link Dimension} that
     *                 can be filtered.
     *                 <p>
     *                 For example, the statement "WHERE LINE_ITEM_ID IN
     * (34344, 23235)" can be used
     *                 to generate a report for a specific set of line items
     * <p>
     *                 Filtering on IDs is highly recommended over filtering
     * on names, especially
     *                 for geographical entities. When filtering on names,
     * matching is case
     *                 sensitive.
     */
    public com.google.api.ads.admanager.axis.v202308.Statement getStatement() {
        return statement;
    }


    /**
     * Sets the statement value for this ReportQuery.
     * 
     * @param statement   * Specifies a filter to use for reporting on data. This filter
     * will be used
     *                 in conjunction (joined with an AND statement) with
     * the date range selected
     *                 through {@link #dateRangeType}, {@link #startDate},
     * and {@link #endDate}.
     *                 
     *                 The syntax currently allowed for {@link Statement#query}
     * is<br>
     *                 <code> [WHERE <condition> {AND <condition> ...}]<code><br>
     * <p><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp; <code>:= <property> = <value></code><br>
     * <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp; <code>:= <property> = <bind
     * variable></code><br>
     *                 <code><condition> := <property> IN <list></code><br>
     * <code><bind variable> := :<name></code><br>
     *                 </code> where property is the enumeration name of
     * a {@link Dimension} that
     *                 can be filtered.
     *                 <p>
     *                 For example, the statement "WHERE LINE_ITEM_ID IN
     * (34344, 23235)" can be used
     *                 to generate a report for a specific set of line items
     * <p>
     *                 Filtering on IDs is highly recommended over filtering
     * on names, especially
     *                 for geographical entities. When filtering on names,
     * matching is case
     *                 sensitive.
     */
    public void setStatement(com.google.api.ads.admanager.axis.v202308.Statement statement) {
        this.statement = statement;
    }


    /**
     * Gets the reportCurrency value for this ReportQuery.
     * 
     * @return reportCurrency   * The currency for revenue metrics. Defaults to the network currency
     * if left {@code null}. The
     *                 supported currency codes can be found in <a
     *                 href="https://support.google.com/adxseller/answer/6019533">this
     * Help Center article.</a>
     */
    public java.lang.String getReportCurrency() {
        return reportCurrency;
    }


    /**
     * Sets the reportCurrency value for this ReportQuery.
     * 
     * @param reportCurrency   * The currency for revenue metrics. Defaults to the network currency
     * if left {@code null}. The
     *                 supported currency codes can be found in <a
     *                 href="https://support.google.com/adxseller/answer/6019533">this
     * Help Center article.</a>
     */
    public void setReportCurrency(java.lang.String reportCurrency) {
        this.reportCurrency = reportCurrency;
    }


    /**
     * Gets the timeZoneType value for this ReportQuery.
     * 
     * @return timeZoneType
     */
    public com.google.api.ads.admanager.axis.v202308.TimeZoneType getTimeZoneType() {
        return timeZoneType;
    }


    /**
     * Sets the timeZoneType value for this ReportQuery.
     * 
     * @param timeZoneType
     */
    public void setTimeZoneType(com.google.api.ads.admanager.axis.v202308.TimeZoneType timeZoneType) {
        this.timeZoneType = timeZoneType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportQuery)) return false;
        ReportQuery other = (ReportQuery) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              java.util.Arrays.equals(this.dimensions, other.getDimensions()))) &&
            ((this.adUnitView==null && other.getAdUnitView()==null) || 
             (this.adUnitView!=null &&
              this.adUnitView.equals(other.getAdUnitView()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              java.util.Arrays.equals(this.columns, other.getColumns()))) &&
            ((this.dimensionAttributes==null && other.getDimensionAttributes()==null) || 
             (this.dimensionAttributes!=null &&
              java.util.Arrays.equals(this.dimensionAttributes, other.getDimensionAttributes()))) &&
            ((this.customFieldIds==null && other.getCustomFieldIds()==null) || 
             (this.customFieldIds!=null &&
              java.util.Arrays.equals(this.customFieldIds, other.getCustomFieldIds()))) &&
            ((this.cmsMetadataKeyIds==null && other.getCmsMetadataKeyIds()==null) || 
             (this.cmsMetadataKeyIds!=null &&
              java.util.Arrays.equals(this.cmsMetadataKeyIds, other.getCmsMetadataKeyIds()))) &&
            ((this.customDimensionKeyIds==null && other.getCustomDimensionKeyIds()==null) || 
             (this.customDimensionKeyIds!=null &&
              java.util.Arrays.equals(this.customDimensionKeyIds, other.getCustomDimensionKeyIds()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.dateRangeType==null && other.getDateRangeType()==null) || 
             (this.dateRangeType!=null &&
              this.dateRangeType.equals(other.getDateRangeType()))) &&
            ((this.statement==null && other.getStatement()==null) || 
             (this.statement!=null &&
              this.statement.equals(other.getStatement()))) &&
            ((this.reportCurrency==null && other.getReportCurrency()==null) || 
             (this.reportCurrency!=null &&
              this.reportCurrency.equals(other.getReportCurrency()))) &&
            ((this.timeZoneType==null && other.getTimeZoneType()==null) || 
             (this.timeZoneType!=null &&
              this.timeZoneType.equals(other.getTimeZoneType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDimensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdUnitView() != null) {
            _hashCode += getAdUnitView().hashCode();
        }
        if (getColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDimensionAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimensionAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimensionAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmsMetadataKeyIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmsMetadataKeyIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmsMetadataKeyIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomDimensionKeyIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomDimensionKeyIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomDimensionKeyIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getDateRangeType() != null) {
            _hashCode += getDateRangeType().hashCode();
        }
        if (getStatement() != null) {
            _hashCode += getStatement().hashCode();
        }
        if (getReportCurrency() != null) {
            _hashCode += getReportCurrency().hashCode();
        }
        if (getTimeZoneType() != null) {
            _hashCode += getTimeZoneType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "ReportQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "Dimension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnitView");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "adUnitView"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "ReportQuery.AdUnitView"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "Column"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "dimensionAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "DimensionAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "customFieldIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsMetadataKeyIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "cmsMetadataKeyIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDimensionKeyIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "customDimensionKeyIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "dateRangeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "DateRangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statement");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "statement"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "Statement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "reportCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "timeZoneType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "TimeZoneType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

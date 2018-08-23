// Copyright 2017 Google Inc. All Rights Reserved.
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
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201711;


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
    private com.google.api.ads.admanager.axis.v201711.Dimension[] dimensions;

    /* The ad unit view for the report. Defaults to {@link AdUnitView#TOP_LEVEL}. */
    private com.google.api.ads.admanager.axis.v201711.ReportQueryAdUnitView adUnitView;

    /* The list of trafficking statistics and revenue information
     * being requested
     *                 in the report. The generated report will contain the
     * columns in the same
     *                 order as requested. This field is required. */
    private com.google.api.ads.admanager.axis.v201711.Column[] columns;

    /* The list of break-down attributes being requested in this report.
     * Some
     *                 {@link DimensionAttribute} values can only be used
     * with certain
     *                 {@link Dimension} values that must be included in
     * the {@link #dimensions}
     *                 attribute. The generated report will contain the attributes
     * in the same
     *                 order as requested. */
    private com.google.api.ads.admanager.axis.v201711.DimensionAttribute[] dimensionAttributes;

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
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#PRODUCT_TEMPLATE}</td>
     * <td>{@link Dimension#PRODUCT_TEMPLATE_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#PRODUCT}</td><td>{@link
     * Dimension#PRODUCT_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#PROPOSAL}</td><td>{@link
     * Dimension#PROPOSAL_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#PROPOSAL_LINE_ITEM}</td>
     * <td>{@link Dimension#PROPOSAL_LINE_ITEM_NAME}</td>
     *                 </tr>
     *                 </table> */
    private long[] customFieldIds;

    /* The list of content metadata hierarchy custom targeting key
     * {@link CustomTargetingKey#id IDs}
     *                 being requested in this report. Each of these IDs
     * must have been defined in the
     *                 {@link ContentMetadataKeyHierarchy content metadata
     * key hierarchy}. This will include
     *                 dimensions in the form of {@code CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[id]_ID}
     * and
     *                 {@code CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[id]_VALUE}
     * where where {@code ID} is the ID of
     *                 the {@link CustomTargetingValue#id custom targeting
     * value} and {@code VALUE} is the
     *                 {@link CustomTargetingValue#name name}.
     *                 <p>
     *                 To add {@link CustomTargetingKey#id IDs}, you must
     * include {@link Dimension#CONTENT_HIERARCHY}
     *                 in {@link #dimensions}, and specify a non-empty list
     * of custom targeting key IDs. The order of
     *                 content hierarchy columns in the report correspond
     * to the place of
     *                 {@link Dimension#CONTENT_HIERARCHY} in {@link #dimensions}.
     * For example, if {@link #dimensions}
     *                 contains the following dimensions in the order: {@link
     * Dimension#ADVERTISER_NAME},
     *                 {@link Dimension#CONTENT_HIERARCHY} and {@link Dimension#COUNTRY_NAME},
     * and
     *                 {@link #contentMetadataKeyHierarchyCustomTargetingKeyIds}
     * contains the following IDs in the
     *                 order: 1001 and 1002. The order of dimensions in the
     * report will be:
     *                 Dimension.ADVERTISER_NAME,
     *                 Dimension.CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[1001]_VALUE,
     * Dimension.CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[1002]_VALUE,
     *                 Dimension.COUNTRY_NAME,
     *                 Dimension.ADVERTISER_ID,
     *                 Dimension.CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[1001]_ID,
     * Dimension.CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[1002]_ID,
     *                 Dimension.COUNTRY_CRITERIA_ID */
    private long[] contentMetadataKeyHierarchyCustomTargetingKeyIds;

    /* The start date from which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this. */
    private com.google.api.ads.admanager.axis.v201711.Date startDate;

    /* The end date upto which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this. */
    private com.google.api.ads.admanager.axis.v201711.Date endDate;

    /* The period of time for which the reporting data is being generated.
     * In
     *                 order to define custom time periods, set this to
     *                 {@link DateRangeType#CUSTOM_DATE}. If set to {@link
     * DateRangeType#CUSTOM_DATE}, then
     *                 {@link ReportQuery#startDate} and {@link ReportQuery#endDate}
     * will be used. */
    private com.google.api.ads.admanager.axis.v201711.DateRangeType dateRangeType;

    /* Specifies a filter to use for reporting on data. This filter
     * will be used
     *                 in conjunction (joined with an AND statement) with
     * the date range selected
     *                 through {@link #dateRangeType}, {@link #startDate},
     * and {@link #endDate}
     *                 and the dimension filters selected through {@link
     * #dimensionFilters}.
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
    private com.google.api.ads.admanager.axis.v201711.Statement statement;

    /* Whether report attributes and metrics are calculated or displayed
     * using proposal or proposal
     *                 line item time zones. When this field is set to {@code
     * true}, only sales metrics and sales date
     *                 time related attributes are supported and affected.
     * 
     *                 <p>For example, if {@link Column#SALES_CONTRACT_CONTRACTED_CLICKS}
     * is included in a report with
     *                 this flag set to {@code true}, then it will be calculated
     * using the
     *                 {@link ProposalLineItem#timeZoneId} of the proposal
     * line item the metric is for. If
     *                 {@link DimensionAttribute#PROPOSAL_CREATION_DATE_TIME}
     * is included in a report with this flag
     *                 set to {@code true}, then a proposal's creation date
     * time will be formatted in
     *                 {@link Proposal#timeZoneId} of that proposal. */
    private java.lang.Boolean useSalesLocalTimeZone;

    /* Whether report includes rows with all zero metric values. This
     * field is only eligible
     *                 for sales reports. This field is optional and defaults
     * to {@code false}. */
    private java.lang.Boolean includeZeroSalesRows;

    public ReportQuery() {
    }

    public ReportQuery(
           com.google.api.ads.admanager.axis.v201711.Dimension[] dimensions,
           com.google.api.ads.admanager.axis.v201711.ReportQueryAdUnitView adUnitView,
           com.google.api.ads.admanager.axis.v201711.Column[] columns,
           com.google.api.ads.admanager.axis.v201711.DimensionAttribute[] dimensionAttributes,
           long[] customFieldIds,
           long[] contentMetadataKeyHierarchyCustomTargetingKeyIds,
           com.google.api.ads.admanager.axis.v201711.Date startDate,
           com.google.api.ads.admanager.axis.v201711.Date endDate,
           com.google.api.ads.admanager.axis.v201711.DateRangeType dateRangeType,
           com.google.api.ads.admanager.axis.v201711.Statement statement,
           java.lang.Boolean useSalesLocalTimeZone,
           java.lang.Boolean includeZeroSalesRows) {
           this.dimensions = dimensions;
           this.adUnitView = adUnitView;
           this.columns = columns;
           this.dimensionAttributes = dimensionAttributes;
           this.customFieldIds = customFieldIds;
           this.contentMetadataKeyHierarchyCustomTargetingKeyIds = contentMetadataKeyHierarchyCustomTargetingKeyIds;
           this.startDate = startDate;
           this.endDate = endDate;
           this.dateRangeType = dateRangeType;
           this.statement = statement;
           this.useSalesLocalTimeZone = useSalesLocalTimeZone;
           this.includeZeroSalesRows = includeZeroSalesRows;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adUnitView", getAdUnitView())
            .add("columns", getColumns())
            .add("contentMetadataKeyHierarchyCustomTargetingKeyIds", getContentMetadataKeyHierarchyCustomTargetingKeyIds())
            .add("customFieldIds", getCustomFieldIds())
            .add("dateRangeType", getDateRangeType())
            .add("dimensionAttributes", getDimensionAttributes())
            .add("dimensions", getDimensions())
            .add("endDate", getEndDate())
            .add("includeZeroSalesRows", getIncludeZeroSalesRows())
            .add("startDate", getStartDate())
            .add("statement", getStatement())
            .add("useSalesLocalTimeZone", getUseSalesLocalTimeZone())
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
    public com.google.api.ads.admanager.axis.v201711.Dimension[] getDimensions() {
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
    public void setDimensions(com.google.api.ads.admanager.axis.v201711.Dimension[] dimensions) {
        this.dimensions = dimensions;
    }

    public com.google.api.ads.admanager.axis.v201711.Dimension getDimensions(int i) {
        return this.dimensions[i];
    }

    public void setDimensions(int i, com.google.api.ads.admanager.axis.v201711.Dimension _value) {
        this.dimensions[i] = _value;
    }


    /**
     * Gets the adUnitView value for this ReportQuery.
     * 
     * @return adUnitView   * The ad unit view for the report. Defaults to {@link AdUnitView#TOP_LEVEL}.
     */
    public com.google.api.ads.admanager.axis.v201711.ReportQueryAdUnitView getAdUnitView() {
        return adUnitView;
    }


    /**
     * Sets the adUnitView value for this ReportQuery.
     * 
     * @param adUnitView   * The ad unit view for the report. Defaults to {@link AdUnitView#TOP_LEVEL}.
     */
    public void setAdUnitView(com.google.api.ads.admanager.axis.v201711.ReportQueryAdUnitView adUnitView) {
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
    public com.google.api.ads.admanager.axis.v201711.Column[] getColumns() {
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
    public void setColumns(com.google.api.ads.admanager.axis.v201711.Column[] columns) {
        this.columns = columns;
    }

    public com.google.api.ads.admanager.axis.v201711.Column getColumns(int i) {
        return this.columns[i];
    }

    public void setColumns(int i, com.google.api.ads.admanager.axis.v201711.Column _value) {
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
    public com.google.api.ads.admanager.axis.v201711.DimensionAttribute[] getDimensionAttributes() {
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
    public void setDimensionAttributes(com.google.api.ads.admanager.axis.v201711.DimensionAttribute[] dimensionAttributes) {
        this.dimensionAttributes = dimensionAttributes;
    }

    public com.google.api.ads.admanager.axis.v201711.DimensionAttribute getDimensionAttributes(int i) {
        return this.dimensionAttributes[i];
    }

    public void setDimensionAttributes(int i, com.google.api.ads.admanager.axis.v201711.DimensionAttribute _value) {
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
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#PRODUCT_TEMPLATE}</td>
     * <td>{@link Dimension#PRODUCT_TEMPLATE_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#PRODUCT}</td><td>{@link
     * Dimension#PRODUCT_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#PROPOSAL}</td><td>{@link
     * Dimension#PROPOSAL_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#PROPOSAL_LINE_ITEM}</td>
     * <td>{@link Dimension#PROPOSAL_LINE_ITEM_NAME}</td>
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
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#PRODUCT_TEMPLATE}</td>
     * <td>{@link Dimension#PRODUCT_TEMPLATE_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#PRODUCT}</td><td>{@link
     * Dimension#PRODUCT_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#PROPOSAL}</td><td>{@link
     * Dimension#PROPOSAL_NAME}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link CustomFieldEntityType#PROPOSAL_LINE_ITEM}</td>
     * <td>{@link Dimension#PROPOSAL_LINE_ITEM_NAME}</td>
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
     * Gets the contentMetadataKeyHierarchyCustomTargetingKeyIds value for this ReportQuery.
     * 
     * @return contentMetadataKeyHierarchyCustomTargetingKeyIds   * The list of content metadata hierarchy custom targeting key
     * {@link CustomTargetingKey#id IDs}
     *                 being requested in this report. Each of these IDs
     * must have been defined in the
     *                 {@link ContentMetadataKeyHierarchy content metadata
     * key hierarchy}. This will include
     *                 dimensions in the form of {@code CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[id]_ID}
     * and
     *                 {@code CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[id]_VALUE}
     * where where {@code ID} is the ID of
     *                 the {@link CustomTargetingValue#id custom targeting
     * value} and {@code VALUE} is the
     *                 {@link CustomTargetingValue#name name}.
     *                 <p>
     *                 To add {@link CustomTargetingKey#id IDs}, you must
     * include {@link Dimension#CONTENT_HIERARCHY}
     *                 in {@link #dimensions}, and specify a non-empty list
     * of custom targeting key IDs. The order of
     *                 content hierarchy columns in the report correspond
     * to the place of
     *                 {@link Dimension#CONTENT_HIERARCHY} in {@link #dimensions}.
     * For example, if {@link #dimensions}
     *                 contains the following dimensions in the order: {@link
     * Dimension#ADVERTISER_NAME},
     *                 {@link Dimension#CONTENT_HIERARCHY} and {@link Dimension#COUNTRY_NAME},
     * and
     *                 {@link #contentMetadataKeyHierarchyCustomTargetingKeyIds}
     * contains the following IDs in the
     *                 order: 1001 and 1002. The order of dimensions in the
     * report will be:
     *                 Dimension.ADVERTISER_NAME,
     *                 Dimension.CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[1001]_VALUE,
     * Dimension.CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[1002]_VALUE,
     *                 Dimension.COUNTRY_NAME,
     *                 Dimension.ADVERTISER_ID,
     *                 Dimension.CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[1001]_ID,
     * Dimension.CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[1002]_ID,
     *                 Dimension.COUNTRY_CRITERIA_ID
     */
    public long[] getContentMetadataKeyHierarchyCustomTargetingKeyIds() {
        return contentMetadataKeyHierarchyCustomTargetingKeyIds;
    }


    /**
     * Sets the contentMetadataKeyHierarchyCustomTargetingKeyIds value for this ReportQuery.
     * 
     * @param contentMetadataKeyHierarchyCustomTargetingKeyIds   * The list of content metadata hierarchy custom targeting key
     * {@link CustomTargetingKey#id IDs}
     *                 being requested in this report. Each of these IDs
     * must have been defined in the
     *                 {@link ContentMetadataKeyHierarchy content metadata
     * key hierarchy}. This will include
     *                 dimensions in the form of {@code CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[id]_ID}
     * and
     *                 {@code CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[id]_VALUE}
     * where where {@code ID} is the ID of
     *                 the {@link CustomTargetingValue#id custom targeting
     * value} and {@code VALUE} is the
     *                 {@link CustomTargetingValue#name name}.
     *                 <p>
     *                 To add {@link CustomTargetingKey#id IDs}, you must
     * include {@link Dimension#CONTENT_HIERARCHY}
     *                 in {@link #dimensions}, and specify a non-empty list
     * of custom targeting key IDs. The order of
     *                 content hierarchy columns in the report correspond
     * to the place of
     *                 {@link Dimension#CONTENT_HIERARCHY} in {@link #dimensions}.
     * For example, if {@link #dimensions}
     *                 contains the following dimensions in the order: {@link
     * Dimension#ADVERTISER_NAME},
     *                 {@link Dimension#CONTENT_HIERARCHY} and {@link Dimension#COUNTRY_NAME},
     * and
     *                 {@link #contentMetadataKeyHierarchyCustomTargetingKeyIds}
     * contains the following IDs in the
     *                 order: 1001 and 1002. The order of dimensions in the
     * report will be:
     *                 Dimension.ADVERTISER_NAME,
     *                 Dimension.CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[1001]_VALUE,
     * Dimension.CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[1002]_VALUE,
     *                 Dimension.COUNTRY_NAME,
     *                 Dimension.ADVERTISER_ID,
     *                 Dimension.CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[1001]_ID,
     * Dimension.CONTENT_HIERARCHY_CUSTOM_TARGETING_KEY[1002]_ID,
     *                 Dimension.COUNTRY_CRITERIA_ID
     */
    public void setContentMetadataKeyHierarchyCustomTargetingKeyIds(long[] contentMetadataKeyHierarchyCustomTargetingKeyIds) {
        this.contentMetadataKeyHierarchyCustomTargetingKeyIds = contentMetadataKeyHierarchyCustomTargetingKeyIds;
    }

    public long getContentMetadataKeyHierarchyCustomTargetingKeyIds(int i) {
        return this.contentMetadataKeyHierarchyCustomTargetingKeyIds[i];
    }

    public void setContentMetadataKeyHierarchyCustomTargetingKeyIds(int i, long _value) {
        this.contentMetadataKeyHierarchyCustomTargetingKeyIds[i] = _value;
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
    public com.google.api.ads.admanager.axis.v201711.Date getStartDate() {
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
    public void setStartDate(com.google.api.ads.admanager.axis.v201711.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ReportQuery.
     * 
     * @return endDate   * The end date upto which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this.
     */
    public com.google.api.ads.admanager.axis.v201711.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ReportQuery.
     * 
     * @param endDate   * The end date upto which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this.
     */
    public void setEndDate(com.google.api.ads.admanager.axis.v201711.Date endDate) {
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
    public com.google.api.ads.admanager.axis.v201711.DateRangeType getDateRangeType() {
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
    public void setDateRangeType(com.google.api.ads.admanager.axis.v201711.DateRangeType dateRangeType) {
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
     * and {@link #endDate}
     *                 and the dimension filters selected through {@link
     * #dimensionFilters}.
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
    public com.google.api.ads.admanager.axis.v201711.Statement getStatement() {
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
     * and {@link #endDate}
     *                 and the dimension filters selected through {@link
     * #dimensionFilters}.
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
    public void setStatement(com.google.api.ads.admanager.axis.v201711.Statement statement) {
        this.statement = statement;
    }


    /**
     * Gets the useSalesLocalTimeZone value for this ReportQuery.
     * 
     * @return useSalesLocalTimeZone   * Whether report attributes and metrics are calculated or displayed
     * using proposal or proposal
     *                 line item time zones. When this field is set to {@code
     * true}, only sales metrics and sales date
     *                 time related attributes are supported and affected.
     * 
     *                 <p>For example, if {@link Column#SALES_CONTRACT_CONTRACTED_CLICKS}
     * is included in a report with
     *                 this flag set to {@code true}, then it will be calculated
     * using the
     *                 {@link ProposalLineItem#timeZoneId} of the proposal
     * line item the metric is for. If
     *                 {@link DimensionAttribute#PROPOSAL_CREATION_DATE_TIME}
     * is included in a report with this flag
     *                 set to {@code true}, then a proposal's creation date
     * time will be formatted in
     *                 {@link Proposal#timeZoneId} of that proposal.
     */
    public java.lang.Boolean getUseSalesLocalTimeZone() {
        return useSalesLocalTimeZone;
    }


    /**
     * Sets the useSalesLocalTimeZone value for this ReportQuery.
     * 
     * @param useSalesLocalTimeZone   * Whether report attributes and metrics are calculated or displayed
     * using proposal or proposal
     *                 line item time zones. When this field is set to {@code
     * true}, only sales metrics and sales date
     *                 time related attributes are supported and affected.
     * 
     *                 <p>For example, if {@link Column#SALES_CONTRACT_CONTRACTED_CLICKS}
     * is included in a report with
     *                 this flag set to {@code true}, then it will be calculated
     * using the
     *                 {@link ProposalLineItem#timeZoneId} of the proposal
     * line item the metric is for. If
     *                 {@link DimensionAttribute#PROPOSAL_CREATION_DATE_TIME}
     * is included in a report with this flag
     *                 set to {@code true}, then a proposal's creation date
     * time will be formatted in
     *                 {@link Proposal#timeZoneId} of that proposal.
     */
    public void setUseSalesLocalTimeZone(java.lang.Boolean useSalesLocalTimeZone) {
        this.useSalesLocalTimeZone = useSalesLocalTimeZone;
    }


    /**
     * Gets the includeZeroSalesRows value for this ReportQuery.
     * 
     * @return includeZeroSalesRows   * Whether report includes rows with all zero metric values. This
     * field is only eligible
     *                 for sales reports. This field is optional and defaults
     * to {@code false}.
     */
    public java.lang.Boolean getIncludeZeroSalesRows() {
        return includeZeroSalesRows;
    }


    /**
     * Sets the includeZeroSalesRows value for this ReportQuery.
     * 
     * @param includeZeroSalesRows   * Whether report includes rows with all zero metric values. This
     * field is only eligible
     *                 for sales reports. This field is optional and defaults
     * to {@code false}.
     */
    public void setIncludeZeroSalesRows(java.lang.Boolean includeZeroSalesRows) {
        this.includeZeroSalesRows = includeZeroSalesRows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportQuery)) return false;
        ReportQuery other = (ReportQuery) obj;
        if (obj == null) return false;
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
            ((this.contentMetadataKeyHierarchyCustomTargetingKeyIds==null && other.getContentMetadataKeyHierarchyCustomTargetingKeyIds()==null) || 
             (this.contentMetadataKeyHierarchyCustomTargetingKeyIds!=null &&
              java.util.Arrays.equals(this.contentMetadataKeyHierarchyCustomTargetingKeyIds, other.getContentMetadataKeyHierarchyCustomTargetingKeyIds()))) &&
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
            ((this.useSalesLocalTimeZone==null && other.getUseSalesLocalTimeZone()==null) || 
             (this.useSalesLocalTimeZone!=null &&
              this.useSalesLocalTimeZone.equals(other.getUseSalesLocalTimeZone()))) &&
            ((this.includeZeroSalesRows==null && other.getIncludeZeroSalesRows()==null) || 
             (this.includeZeroSalesRows!=null &&
              this.includeZeroSalesRows.equals(other.getIncludeZeroSalesRows())));
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
        if (getContentMetadataKeyHierarchyCustomTargetingKeyIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentMetadataKeyHierarchyCustomTargetingKeyIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContentMetadataKeyHierarchyCustomTargetingKeyIds(), i);
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
        if (getUseSalesLocalTimeZone() != null) {
            _hashCode += getUseSalesLocalTimeZone().hashCode();
        }
        if (getIncludeZeroSalesRows() != null) {
            _hashCode += getIncludeZeroSalesRows().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "ReportQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "Dimension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnitView");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "adUnitView"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "ReportQuery.AdUnitView"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "Column"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "dimensionAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "DimensionAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "customFieldIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentMetadataKeyHierarchyCustomTargetingKeyIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "contentMetadataKeyHierarchyCustomTargetingKeyIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "dateRangeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "DateRangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statement");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "statement"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "Statement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSalesLocalTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "useSalesLocalTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeZeroSalesRows");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201711", "includeZeroSalesRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

/**
 * ReportQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201211;


/**
 * A {@code ReportQuery} object allows you to specify the selection
 * criteria for
 *             generating a report.
 */
public class ReportQuery  implements java.io.Serializable {
    /* The list of break-down types being requested in the report.
     * The generated report will contain the dimensions in the same order
     * as requested. */
    private com.google.api.ads.dfp.axis.v201211.Dimension[] dimensions;

    /* The ad unit view for the report. Defaults to {@link AdUnitView#TOP_LEVEL}. */
    private com.google.api.ads.dfp.axis.v201211.ReportQueryAdUnitView adUnitView;

    /* The list of trafficking statistics and revenue information
     * being requested
     *                 in the report. The generated report will contain the
     * columns in the same
     *                 order as requested. */
    private com.google.api.ads.dfp.axis.v201211.Column[] columns;

    /* The list of break-down attributes being requested in this report.
     * Some
     *                 {@link DimensionAttribute} values can only be used
     * with certain
     *                 {@link Dimension} values that must be included in
     * the {@link #dimensions}
     *                 attribute. The generated report will contain the attributes
     * in the same
     *                 order as requested. */
    private com.google.api.ads.dfp.axis.v201211.DimensionAttribute[] dimensionAttributes;

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
     *                 <th scope="col">{@link CustomFieldEntityType#entityType}</th>
     * <th scope="col">{@link Dimension}</th>
     *                 </tr>
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

    /* The start date from which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this. */
    private com.google.api.ads.dfp.axis.v201211.Date startDate;

    /* The end date upto which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this. */
    private com.google.api.ads.dfp.axis.v201211.Date endDate;

    /* The period of time for which the reporting data is being generated.
     * In
     *                 order to define custom time periods, set this to
     *                 {@link DateRangeType#CUSTOM_DATE}. If set to {@link
     * DateRangeType#CUSTOM_DATE}, then
     *                 {@link ReportQuery#startDate} and {@link ReportQuery#endDate}
     * will be used. */
    private com.google.api.ads.dfp.axis.v201211.DateRangeType dateRangeType;

    /* The restrictions that apply to {@link Dimension} objects. These
     * filters are
     *                 AND'ed together to produce the result. */
    private com.google.api.ads.dfp.axis.v201211.DimensionFilter[] dimensionFilters;

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
    private com.google.api.ads.dfp.axis.v201211.Statement statement;

    public ReportQuery() {
    }

    public ReportQuery(
           com.google.api.ads.dfp.axis.v201211.Dimension[] dimensions,
           com.google.api.ads.dfp.axis.v201211.ReportQueryAdUnitView adUnitView,
           com.google.api.ads.dfp.axis.v201211.Column[] columns,
           com.google.api.ads.dfp.axis.v201211.DimensionAttribute[] dimensionAttributes,
           long[] customFieldIds,
           com.google.api.ads.dfp.axis.v201211.Date startDate,
           com.google.api.ads.dfp.axis.v201211.Date endDate,
           com.google.api.ads.dfp.axis.v201211.DateRangeType dateRangeType,
           com.google.api.ads.dfp.axis.v201211.DimensionFilter[] dimensionFilters,
           com.google.api.ads.dfp.axis.v201211.Statement statement) {
           this.dimensions = dimensions;
           this.adUnitView = adUnitView;
           this.columns = columns;
           this.dimensionAttributes = dimensionAttributes;
           this.customFieldIds = customFieldIds;
           this.startDate = startDate;
           this.endDate = endDate;
           this.dateRangeType = dateRangeType;
           this.dimensionFilters = dimensionFilters;
           this.statement = statement;
    }


    /**
     * Gets the dimensions value for this ReportQuery.
     * 
     * @return dimensions   * The list of break-down types being requested in the report.
     * The generated report will contain the dimensions in the same order
     * as requested.
     */
    public com.google.api.ads.dfp.axis.v201211.Dimension[] getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this ReportQuery.
     * 
     * @param dimensions   * The list of break-down types being requested in the report.
     * The generated report will contain the dimensions in the same order
     * as requested.
     */
    public void setDimensions(com.google.api.ads.dfp.axis.v201211.Dimension[] dimensions) {
        this.dimensions = dimensions;
    }

    public com.google.api.ads.dfp.axis.v201211.Dimension getDimensions(int i) {
        return this.dimensions[i];
    }

    public void setDimensions(int i, com.google.api.ads.dfp.axis.v201211.Dimension _value) {
        this.dimensions[i] = _value;
    }


    /**
     * Gets the adUnitView value for this ReportQuery.
     * 
     * @return adUnitView   * The ad unit view for the report. Defaults to {@link AdUnitView#TOP_LEVEL}.
     */
    public com.google.api.ads.dfp.axis.v201211.ReportQueryAdUnitView getAdUnitView() {
        return adUnitView;
    }


    /**
     * Sets the adUnitView value for this ReportQuery.
     * 
     * @param adUnitView   * The ad unit view for the report. Defaults to {@link AdUnitView#TOP_LEVEL}.
     */
    public void setAdUnitView(com.google.api.ads.dfp.axis.v201211.ReportQueryAdUnitView adUnitView) {
        this.adUnitView = adUnitView;
    }


    /**
     * Gets the columns value for this ReportQuery.
     * 
     * @return columns   * The list of trafficking statistics and revenue information
     * being requested
     *                 in the report. The generated report will contain the
     * columns in the same
     *                 order as requested.
     */
    public com.google.api.ads.dfp.axis.v201211.Column[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this ReportQuery.
     * 
     * @param columns   * The list of trafficking statistics and revenue information
     * being requested
     *                 in the report. The generated report will contain the
     * columns in the same
     *                 order as requested.
     */
    public void setColumns(com.google.api.ads.dfp.axis.v201211.Column[] columns) {
        this.columns = columns;
    }

    public com.google.api.ads.dfp.axis.v201211.Column getColumns(int i) {
        return this.columns[i];
    }

    public void setColumns(int i, com.google.api.ads.dfp.axis.v201211.Column _value) {
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
    public com.google.api.ads.dfp.axis.v201211.DimensionAttribute[] getDimensionAttributes() {
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
    public void setDimensionAttributes(com.google.api.ads.dfp.axis.v201211.DimensionAttribute[] dimensionAttributes) {
        this.dimensionAttributes = dimensionAttributes;
    }

    public com.google.api.ads.dfp.axis.v201211.DimensionAttribute getDimensionAttributes(int i) {
        return this.dimensionAttributes[i];
    }

    public void setDimensionAttributes(int i, com.google.api.ads.dfp.axis.v201211.DimensionAttribute _value) {
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
     *                 <th scope="col">{@link CustomFieldEntityType#entityType}</th>
     * <th scope="col">{@link Dimension}</th>
     *                 </tr>
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
     *                 <th scope="col">{@link CustomFieldEntityType#entityType}</th>
     * <th scope="col">{@link Dimension}</th>
     *                 </tr>
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
     * Gets the startDate value for this ReportQuery.
     * 
     * @return startDate   * The start date from which the reporting information is gathered.
     * The
     *                 {@code ReportQuery#dateRangeType} field must be set
     * to
     *                 {@link DateRangeType#CUSTOM_DATE} in order to use
     * this.
     */
    public com.google.api.ads.dfp.axis.v201211.Date getStartDate() {
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
    public void setStartDate(com.google.api.ads.dfp.axis.v201211.Date startDate) {
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
    public com.google.api.ads.dfp.axis.v201211.Date getEndDate() {
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
    public void setEndDate(com.google.api.ads.dfp.axis.v201211.Date endDate) {
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
    public com.google.api.ads.dfp.axis.v201211.DateRangeType getDateRangeType() {
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
    public void setDateRangeType(com.google.api.ads.dfp.axis.v201211.DateRangeType dateRangeType) {
        this.dateRangeType = dateRangeType;
    }


    /**
     * Gets the dimensionFilters value for this ReportQuery.
     * 
     * @return dimensionFilters   * The restrictions that apply to {@link Dimension} objects. These
     * filters are
     *                 AND'ed together to produce the result.
     */
    public com.google.api.ads.dfp.axis.v201211.DimensionFilter[] getDimensionFilters() {
        return dimensionFilters;
    }


    /**
     * Sets the dimensionFilters value for this ReportQuery.
     * 
     * @param dimensionFilters   * The restrictions that apply to {@link Dimension} objects. These
     * filters are
     *                 AND'ed together to produce the result.
     */
    public void setDimensionFilters(com.google.api.ads.dfp.axis.v201211.DimensionFilter[] dimensionFilters) {
        this.dimensionFilters = dimensionFilters;
    }

    public com.google.api.ads.dfp.axis.v201211.DimensionFilter getDimensionFilters(int i) {
        return this.dimensionFilters[i];
    }

    public void setDimensionFilters(int i, com.google.api.ads.dfp.axis.v201211.DimensionFilter _value) {
        this.dimensionFilters[i] = _value;
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
    public com.google.api.ads.dfp.axis.v201211.Statement getStatement() {
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
    public void setStatement(com.google.api.ads.dfp.axis.v201211.Statement statement) {
        this.statement = statement;
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
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.dateRangeType==null && other.getDateRangeType()==null) || 
             (this.dateRangeType!=null &&
              this.dateRangeType.equals(other.getDateRangeType()))) &&
            ((this.dimensionFilters==null && other.getDimensionFilters()==null) || 
             (this.dimensionFilters!=null &&
              java.util.Arrays.equals(this.dimensionFilters, other.getDimensionFilters()))) &&
            ((this.statement==null && other.getStatement()==null) || 
             (this.statement!=null &&
              this.statement.equals(other.getStatement())));
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getDateRangeType() != null) {
            _hashCode += getDateRangeType().hashCode();
        }
        if (getDimensionFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimensionFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimensionFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatement() != null) {
            _hashCode += getStatement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "ReportQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "Dimension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnitView");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "adUnitView"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "ReportQuery.AdUnitView"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "Column"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "dimensionAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "DimensionAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "customFieldIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "Date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "dateRangeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "DateRangeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "dimensionFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "DimensionFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statement");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "statement"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "Statement"));
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

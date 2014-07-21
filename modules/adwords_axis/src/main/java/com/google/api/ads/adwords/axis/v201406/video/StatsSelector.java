/**
 * StatsSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * Selects statistics for date range.
 */
public class StatsSelector  implements java.io.Serializable {
    /* Date range to get stats for. "All time" if unspecified.
     *                 This is required if date segmentation is requested.
     * <span class="constraint DateRangeWithinRange">This range must be contained
     * within the range [19700101, 20380101].</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.DateRange dateRange;

    /* Segmentations that should be returned.
     *                 <p>
     *                 If a date segmentation is requested, then the dateRange
     * should be explicitly specified.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.SegmentationDimension[] segmentationDimensions;

    /* Metrics to select.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.Metric[] metrics;

    /* List of {@link com.google.ads.api.services.video.common.stats.Stats.SummaryType}s
     * to select.
     *                 Maximum of two can be selected simultaneously.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.VideoEntityStatsSummaryType[] summaryTypes;

    /* The {@link com.google.ads.api.services.video.common.stats.Stats.SummaryType}
     * to filter the
     *                 segmented summary by. */
    private com.google.api.ads.adwords.axis.v201406.video.VideoEntityStatsSummaryType segmentedSummaryType;

    /* This field is only honored if dateRange is not speficied (ie.
     * "all time" is requested),
     *                 and is used for setting additional date range restrictions.
     * For instance, if this is set to SINCE_VIDEO_AD_START, then VideoService.get()
     * returns
     *                 video stats since the video ad started running, whereas
     * the stats for the entire life
     *                 of the video is returned if this is NONE. */
    private com.google.api.ads.adwords.axis.v201406.video.StatsSelectorAllTimeRestrict allTimeRestrict;

    public StatsSelector() {
    }

    public StatsSelector(
           com.google.api.ads.adwords.axis.v201406.cm.DateRange dateRange,
           com.google.api.ads.adwords.axis.v201406.video.SegmentationDimension[] segmentationDimensions,
           com.google.api.ads.adwords.axis.v201406.video.Metric[] metrics,
           com.google.api.ads.adwords.axis.v201406.video.VideoEntityStatsSummaryType[] summaryTypes,
           com.google.api.ads.adwords.axis.v201406.video.VideoEntityStatsSummaryType segmentedSummaryType,
           com.google.api.ads.adwords.axis.v201406.video.StatsSelectorAllTimeRestrict allTimeRestrict) {
           this.dateRange = dateRange;
           this.segmentationDimensions = segmentationDimensions;
           this.metrics = metrics;
           this.summaryTypes = summaryTypes;
           this.segmentedSummaryType = segmentedSummaryType;
           this.allTimeRestrict = allTimeRestrict;
    }


    /**
     * Gets the dateRange value for this StatsSelector.
     * 
     * @return dateRange   * Date range to get stats for. "All time" if unspecified.
     *                 This is required if date segmentation is requested.
     * <span class="constraint DateRangeWithinRange">This range must be contained
     * within the range [19700101, 20380101].</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.DateRange getDateRange() {
        return dateRange;
    }


    /**
     * Sets the dateRange value for this StatsSelector.
     * 
     * @param dateRange   * Date range to get stats for. "All time" if unspecified.
     *                 This is required if date segmentation is requested.
     * <span class="constraint DateRangeWithinRange">This range must be contained
     * within the range [19700101, 20380101].</span>
     */
    public void setDateRange(com.google.api.ads.adwords.axis.v201406.cm.DateRange dateRange) {
        this.dateRange = dateRange;
    }


    /**
     * Gets the segmentationDimensions value for this StatsSelector.
     * 
     * @return segmentationDimensions   * Segmentations that should be returned.
     *                 <p>
     *                 If a date segmentation is requested, then the dateRange
     * should be explicitly specified.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.SegmentationDimension[] getSegmentationDimensions() {
        return segmentationDimensions;
    }


    /**
     * Sets the segmentationDimensions value for this StatsSelector.
     * 
     * @param segmentationDimensions   * Segmentations that should be returned.
     *                 <p>
     *                 If a date segmentation is requested, then the dateRange
     * should be explicitly specified.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setSegmentationDimensions(com.google.api.ads.adwords.axis.v201406.video.SegmentationDimension[] segmentationDimensions) {
        this.segmentationDimensions = segmentationDimensions;
    }

    public com.google.api.ads.adwords.axis.v201406.video.SegmentationDimension getSegmentationDimensions(int i) {
        return this.segmentationDimensions[i];
    }

    public void setSegmentationDimensions(int i, com.google.api.ads.adwords.axis.v201406.video.SegmentationDimension _value) {
        this.segmentationDimensions[i] = _value;
    }


    /**
     * Gets the metrics value for this StatsSelector.
     * 
     * @return metrics   * Metrics to select.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.Metric[] getMetrics() {
        return metrics;
    }


    /**
     * Sets the metrics value for this StatsSelector.
     * 
     * @param metrics   * Metrics to select.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setMetrics(com.google.api.ads.adwords.axis.v201406.video.Metric[] metrics) {
        this.metrics = metrics;
    }

    public com.google.api.ads.adwords.axis.v201406.video.Metric getMetrics(int i) {
        return this.metrics[i];
    }

    public void setMetrics(int i, com.google.api.ads.adwords.axis.v201406.video.Metric _value) {
        this.metrics[i] = _value;
    }


    /**
     * Gets the summaryTypes value for this StatsSelector.
     * 
     * @return summaryTypes   * List of {@link com.google.ads.api.services.video.common.stats.Stats.SummaryType}s
     * to select.
     *                 Maximum of two can be selected simultaneously.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoEntityStatsSummaryType[] getSummaryTypes() {
        return summaryTypes;
    }


    /**
     * Sets the summaryTypes value for this StatsSelector.
     * 
     * @param summaryTypes   * List of {@link com.google.ads.api.services.video.common.stats.Stats.SummaryType}s
     * to select.
     *                 Maximum of two can be selected simultaneously.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setSummaryTypes(com.google.api.ads.adwords.axis.v201406.video.VideoEntityStatsSummaryType[] summaryTypes) {
        this.summaryTypes = summaryTypes;
    }

    public com.google.api.ads.adwords.axis.v201406.video.VideoEntityStatsSummaryType getSummaryTypes(int i) {
        return this.summaryTypes[i];
    }

    public void setSummaryTypes(int i, com.google.api.ads.adwords.axis.v201406.video.VideoEntityStatsSummaryType _value) {
        this.summaryTypes[i] = _value;
    }


    /**
     * Gets the segmentedSummaryType value for this StatsSelector.
     * 
     * @return segmentedSummaryType   * The {@link com.google.ads.api.services.video.common.stats.Stats.SummaryType}
     * to filter the
     *                 segmented summary by.
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoEntityStatsSummaryType getSegmentedSummaryType() {
        return segmentedSummaryType;
    }


    /**
     * Sets the segmentedSummaryType value for this StatsSelector.
     * 
     * @param segmentedSummaryType   * The {@link com.google.ads.api.services.video.common.stats.Stats.SummaryType}
     * to filter the
     *                 segmented summary by.
     */
    public void setSegmentedSummaryType(com.google.api.ads.adwords.axis.v201406.video.VideoEntityStatsSummaryType segmentedSummaryType) {
        this.segmentedSummaryType = segmentedSummaryType;
    }


    /**
     * Gets the allTimeRestrict value for this StatsSelector.
     * 
     * @return allTimeRestrict   * This field is only honored if dateRange is not speficied (ie.
     * "all time" is requested),
     *                 and is used for setting additional date range restrictions.
     * For instance, if this is set to SINCE_VIDEO_AD_START, then VideoService.get()
     * returns
     *                 video stats since the video ad started running, whereas
     * the stats for the entire life
     *                 of the video is returned if this is NONE.
     */
    public com.google.api.ads.adwords.axis.v201406.video.StatsSelectorAllTimeRestrict getAllTimeRestrict() {
        return allTimeRestrict;
    }


    /**
     * Sets the allTimeRestrict value for this StatsSelector.
     * 
     * @param allTimeRestrict   * This field is only honored if dateRange is not speficied (ie.
     * "all time" is requested),
     *                 and is used for setting additional date range restrictions.
     * For instance, if this is set to SINCE_VIDEO_AD_START, then VideoService.get()
     * returns
     *                 video stats since the video ad started running, whereas
     * the stats for the entire life
     *                 of the video is returned if this is NONE.
     */
    public void setAllTimeRestrict(com.google.api.ads.adwords.axis.v201406.video.StatsSelectorAllTimeRestrict allTimeRestrict) {
        this.allTimeRestrict = allTimeRestrict;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatsSelector)) return false;
        StatsSelector other = (StatsSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateRange==null && other.getDateRange()==null) || 
             (this.dateRange!=null &&
              this.dateRange.equals(other.getDateRange()))) &&
            ((this.segmentationDimensions==null && other.getSegmentationDimensions()==null) || 
             (this.segmentationDimensions!=null &&
              java.util.Arrays.equals(this.segmentationDimensions, other.getSegmentationDimensions()))) &&
            ((this.metrics==null && other.getMetrics()==null) || 
             (this.metrics!=null &&
              java.util.Arrays.equals(this.metrics, other.getMetrics()))) &&
            ((this.summaryTypes==null && other.getSummaryTypes()==null) || 
             (this.summaryTypes!=null &&
              java.util.Arrays.equals(this.summaryTypes, other.getSummaryTypes()))) &&
            ((this.segmentedSummaryType==null && other.getSegmentedSummaryType()==null) || 
             (this.segmentedSummaryType!=null &&
              this.segmentedSummaryType.equals(other.getSegmentedSummaryType()))) &&
            ((this.allTimeRestrict==null && other.getAllTimeRestrict()==null) || 
             (this.allTimeRestrict!=null &&
              this.allTimeRestrict.equals(other.getAllTimeRestrict())));
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
        if (getDateRange() != null) {
            _hashCode += getDateRange().hashCode();
        }
        if (getSegmentationDimensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegmentationDimensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegmentationDimensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetrics() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetrics());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetrics(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSummaryTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSummaryTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSummaryTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSegmentedSummaryType() != null) {
            _hashCode += getSegmentedSummaryType().hashCode();
        }
        if (getAllTimeRestrict() != null) {
            _hashCode += getAllTimeRestrict().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatsSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "StatsSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "dateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentationDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "segmentationDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "SegmentationDimension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metrics");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "metrics"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "Metric"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "summaryTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoEntityStats.SummaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentedSummaryType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "segmentedSummaryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoEntityStats.SummaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allTimeRestrict");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "allTimeRestrict"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "StatsSelector.AllTimeRestrict"));
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

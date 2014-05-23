/**
 * VideoSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Filters for selecting videos that have been used in ads within
 * the current account.
 */
public class VideoSelector  implements java.io.Serializable {
    /* The list of video ids to return. If empty, no filter will be
     * applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private java.lang.String[] videoIds;

    /* Only the videos in these campaigns will be returned. If empty
     * no filter will be applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private long[] campaignIds;

    /* Filter videos that belong to these campaign statuses. If empty
     * no filter will be applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus[] campaignStatuses;

    /* Indicates if call-to-actions should be included in the returned
     * objects.
     *                 False by default (call-to-actions are not returned). */
    private java.lang.Boolean includeCallToActions;

    /* Indicates if stats should be returned; <code>null</code> will
     * not return stats. */
    private com.google.api.ads.adwords.axis.v201402.video.StatsSelector statsSelector;

    /* The starting index and number of results to return. */
    private com.google.api.ads.adwords.axis.v201402.cm.Paging paging;

    /* The ordering in which results should be returned. */
    private com.google.api.ads.adwords.axis.v201402.video.Sorting sorting;

    public VideoSelector() {
    }

    public VideoSelector(
           java.lang.String[] videoIds,
           long[] campaignIds,
           com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus[] campaignStatuses,
           java.lang.Boolean includeCallToActions,
           com.google.api.ads.adwords.axis.v201402.video.StatsSelector statsSelector,
           com.google.api.ads.adwords.axis.v201402.cm.Paging paging,
           com.google.api.ads.adwords.axis.v201402.video.Sorting sorting) {
           this.videoIds = videoIds;
           this.campaignIds = campaignIds;
           this.campaignStatuses = campaignStatuses;
           this.includeCallToActions = includeCallToActions;
           this.statsSelector = statsSelector;
           this.paging = paging;
           this.sorting = sorting;
    }


    /**
     * Gets the videoIds value for this VideoSelector.
     * 
     * @return videoIds   * The list of video ids to return. If empty, no filter will be
     * applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public java.lang.String[] getVideoIds() {
        return videoIds;
    }


    /**
     * Sets the videoIds value for this VideoSelector.
     * 
     * @param videoIds   * The list of video ids to return. If empty, no filter will be
     * applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setVideoIds(java.lang.String[] videoIds) {
        this.videoIds = videoIds;
    }

    public java.lang.String getVideoIds(int i) {
        return this.videoIds[i];
    }

    public void setVideoIds(int i, java.lang.String _value) {
        this.videoIds[i] = _value;
    }


    /**
     * Gets the campaignIds value for this VideoSelector.
     * 
     * @return campaignIds   * Only the videos in these campaigns will be returned. If empty
     * no filter will be applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public long[] getCampaignIds() {
        return campaignIds;
    }


    /**
     * Sets the campaignIds value for this VideoSelector.
     * 
     * @param campaignIds   * Only the videos in these campaigns will be returned. If empty
     * no filter will be applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setCampaignIds(long[] campaignIds) {
        this.campaignIds = campaignIds;
    }

    public long getCampaignIds(int i) {
        return this.campaignIds[i];
    }

    public void setCampaignIds(int i, long _value) {
        this.campaignIds[i] = _value;
    }


    /**
     * Gets the campaignStatuses value for this VideoSelector.
     * 
     * @return campaignStatuses   * Filter videos that belong to these campaign statuses. If empty
     * no filter will be applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus[] getCampaignStatuses() {
        return campaignStatuses;
    }


    /**
     * Sets the campaignStatuses value for this VideoSelector.
     * 
     * @param campaignStatuses   * Filter videos that belong to these campaign statuses. If empty
     * no filter will be applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setCampaignStatuses(com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus[] campaignStatuses) {
        this.campaignStatuses = campaignStatuses;
    }

    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus getCampaignStatuses(int i) {
        return this.campaignStatuses[i];
    }

    public void setCampaignStatuses(int i, com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus _value) {
        this.campaignStatuses[i] = _value;
    }


    /**
     * Gets the includeCallToActions value for this VideoSelector.
     * 
     * @return includeCallToActions   * Indicates if call-to-actions should be included in the returned
     * objects.
     *                 False by default (call-to-actions are not returned).
     */
    public java.lang.Boolean getIncludeCallToActions() {
        return includeCallToActions;
    }


    /**
     * Sets the includeCallToActions value for this VideoSelector.
     * 
     * @param includeCallToActions   * Indicates if call-to-actions should be included in the returned
     * objects.
     *                 False by default (call-to-actions are not returned).
     */
    public void setIncludeCallToActions(java.lang.Boolean includeCallToActions) {
        this.includeCallToActions = includeCallToActions;
    }


    /**
     * Gets the statsSelector value for this VideoSelector.
     * 
     * @return statsSelector   * Indicates if stats should be returned; <code>null</code> will
     * not return stats.
     */
    public com.google.api.ads.adwords.axis.v201402.video.StatsSelector getStatsSelector() {
        return statsSelector;
    }


    /**
     * Sets the statsSelector value for this VideoSelector.
     * 
     * @param statsSelector   * Indicates if stats should be returned; <code>null</code> will
     * not return stats.
     */
    public void setStatsSelector(com.google.api.ads.adwords.axis.v201402.video.StatsSelector statsSelector) {
        this.statsSelector = statsSelector;
    }


    /**
     * Gets the paging value for this VideoSelector.
     * 
     * @return paging   * The starting index and number of results to return.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Paging getPaging() {
        return paging;
    }


    /**
     * Sets the paging value for this VideoSelector.
     * 
     * @param paging   * The starting index and number of results to return.
     */
    public void setPaging(com.google.api.ads.adwords.axis.v201402.cm.Paging paging) {
        this.paging = paging;
    }


    /**
     * Gets the sorting value for this VideoSelector.
     * 
     * @return sorting   * The ordering in which results should be returned.
     */
    public com.google.api.ads.adwords.axis.v201402.video.Sorting getSorting() {
        return sorting;
    }


    /**
     * Sets the sorting value for this VideoSelector.
     * 
     * @param sorting   * The ordering in which results should be returned.
     */
    public void setSorting(com.google.api.ads.adwords.axis.v201402.video.Sorting sorting) {
        this.sorting = sorting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoSelector)) return false;
        VideoSelector other = (VideoSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.videoIds==null && other.getVideoIds()==null) || 
             (this.videoIds!=null &&
              java.util.Arrays.equals(this.videoIds, other.getVideoIds()))) &&
            ((this.campaignIds==null && other.getCampaignIds()==null) || 
             (this.campaignIds!=null &&
              java.util.Arrays.equals(this.campaignIds, other.getCampaignIds()))) &&
            ((this.campaignStatuses==null && other.getCampaignStatuses()==null) || 
             (this.campaignStatuses!=null &&
              java.util.Arrays.equals(this.campaignStatuses, other.getCampaignStatuses()))) &&
            ((this.includeCallToActions==null && other.getIncludeCallToActions()==null) || 
             (this.includeCallToActions!=null &&
              this.includeCallToActions.equals(other.getIncludeCallToActions()))) &&
            ((this.statsSelector==null && other.getStatsSelector()==null) || 
             (this.statsSelector!=null &&
              this.statsSelector.equals(other.getStatsSelector()))) &&
            ((this.paging==null && other.getPaging()==null) || 
             (this.paging!=null &&
              this.paging.equals(other.getPaging()))) &&
            ((this.sorting==null && other.getSorting()==null) || 
             (this.sorting!=null &&
              this.sorting.equals(other.getSorting())));
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
        if (getVideoIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVideoIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVideoIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeCallToActions() != null) {
            _hashCode += getIncludeCallToActions().hashCode();
        }
        if (getStatsSelector() != null) {
            _hashCode += getStatsSelector().hashCode();
        }
        if (getPaging() != null) {
            _hashCode += getPaging().hashCode();
        }
        if (getSorting() != null) {
            _hashCode += getSorting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "videoIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "campaignIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "campaignStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoCampaignStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeCallToActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "includeCallToActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statsSelector");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "statsSelector"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "StatsSelector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paging");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "paging"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Paging"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sorting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "sorting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "Sorting"));
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

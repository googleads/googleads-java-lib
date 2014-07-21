/**
 * TargetingGroupSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * A filter for selecting TargetingGroups.
 */
public class TargetingGroupSelector  implements java.io.Serializable {
    /* Targeting groups ids to restrict to. If empty, no restrict
     * will be applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private long[] ids;

    /* Campaign ids to restrict to.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private long[] campaignIds;

    /* Statues to restrict to. If empty, no restrict will be applied.
     * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.TargetingGroupStatus[] statuses;

    /* Campaign statues to restrict to. If empty, no restrict will
     * be applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus[] campaignStatuses;

    /* Specification of stats to return. If empty, no stats will be
     * returned. */
    private com.google.api.ads.adwords.axis.v201406.video.StatsSelector statsSelector;

    /* Paging to determine starting index and count. If empty, all
     * matching results will be returned. */
    private com.google.api.ads.adwords.axis.v201406.cm.Paging paging;

    /* The sort order for results. */
    private com.google.api.ads.adwords.axis.v201406.video.Sorting sorting;

    public TargetingGroupSelector() {
    }

    public TargetingGroupSelector(
           long[] ids,
           long[] campaignIds,
           com.google.api.ads.adwords.axis.v201406.video.TargetingGroupStatus[] statuses,
           com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus[] campaignStatuses,
           com.google.api.ads.adwords.axis.v201406.video.StatsSelector statsSelector,
           com.google.api.ads.adwords.axis.v201406.cm.Paging paging,
           com.google.api.ads.adwords.axis.v201406.video.Sorting sorting) {
           this.ids = ids;
           this.campaignIds = campaignIds;
           this.statuses = statuses;
           this.campaignStatuses = campaignStatuses;
           this.statsSelector = statsSelector;
           this.paging = paging;
           this.sorting = sorting;
    }


    /**
     * Gets the ids value for this TargetingGroupSelector.
     * 
     * @return ids   * Targeting groups ids to restrict to. If empty, no restrict
     * will be applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public long[] getIds() {
        return ids;
    }


    /**
     * Sets the ids value for this TargetingGroupSelector.
     * 
     * @param ids   * Targeting groups ids to restrict to. If empty, no restrict
     * will be applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setIds(long[] ids) {
        this.ids = ids;
    }

    public long getIds(int i) {
        return this.ids[i];
    }

    public void setIds(int i, long _value) {
        this.ids[i] = _value;
    }


    /**
     * Gets the campaignIds value for this TargetingGroupSelector.
     * 
     * @return campaignIds   * Campaign ids to restrict to.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public long[] getCampaignIds() {
        return campaignIds;
    }


    /**
     * Sets the campaignIds value for this TargetingGroupSelector.
     * 
     * @param campaignIds   * Campaign ids to restrict to.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
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
     * Gets the statuses value for this TargetingGroupSelector.
     * 
     * @return statuses   * Statues to restrict to. If empty, no restrict will be applied.
     * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.TargetingGroupStatus[] getStatuses() {
        return statuses;
    }


    /**
     * Sets the statuses value for this TargetingGroupSelector.
     * 
     * @param statuses   * Statues to restrict to. If empty, no restrict will be applied.
     * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setStatuses(com.google.api.ads.adwords.axis.v201406.video.TargetingGroupStatus[] statuses) {
        this.statuses = statuses;
    }

    public com.google.api.ads.adwords.axis.v201406.video.TargetingGroupStatus getStatuses(int i) {
        return this.statuses[i];
    }

    public void setStatuses(int i, com.google.api.ads.adwords.axis.v201406.video.TargetingGroupStatus _value) {
        this.statuses[i] = _value;
    }


    /**
     * Gets the campaignStatuses value for this TargetingGroupSelector.
     * 
     * @return campaignStatuses   * Campaign statues to restrict to. If empty, no restrict will
     * be applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus[] getCampaignStatuses() {
        return campaignStatuses;
    }


    /**
     * Sets the campaignStatuses value for this TargetingGroupSelector.
     * 
     * @param campaignStatuses   * Campaign statues to restrict to. If empty, no restrict will
     * be applied.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setCampaignStatuses(com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus[] campaignStatuses) {
        this.campaignStatuses = campaignStatuses;
    }

    public com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus getCampaignStatuses(int i) {
        return this.campaignStatuses[i];
    }

    public void setCampaignStatuses(int i, com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus _value) {
        this.campaignStatuses[i] = _value;
    }


    /**
     * Gets the statsSelector value for this TargetingGroupSelector.
     * 
     * @return statsSelector   * Specification of stats to return. If empty, no stats will be
     * returned.
     */
    public com.google.api.ads.adwords.axis.v201406.video.StatsSelector getStatsSelector() {
        return statsSelector;
    }


    /**
     * Sets the statsSelector value for this TargetingGroupSelector.
     * 
     * @param statsSelector   * Specification of stats to return. If empty, no stats will be
     * returned.
     */
    public void setStatsSelector(com.google.api.ads.adwords.axis.v201406.video.StatsSelector statsSelector) {
        this.statsSelector = statsSelector;
    }


    /**
     * Gets the paging value for this TargetingGroupSelector.
     * 
     * @return paging   * Paging to determine starting index and count. If empty, all
     * matching results will be returned.
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Paging getPaging() {
        return paging;
    }


    /**
     * Sets the paging value for this TargetingGroupSelector.
     * 
     * @param paging   * Paging to determine starting index and count. If empty, all
     * matching results will be returned.
     */
    public void setPaging(com.google.api.ads.adwords.axis.v201406.cm.Paging paging) {
        this.paging = paging;
    }


    /**
     * Gets the sorting value for this TargetingGroupSelector.
     * 
     * @return sorting   * The sort order for results.
     */
    public com.google.api.ads.adwords.axis.v201406.video.Sorting getSorting() {
        return sorting;
    }


    /**
     * Sets the sorting value for this TargetingGroupSelector.
     * 
     * @param sorting   * The sort order for results.
     */
    public void setSorting(com.google.api.ads.adwords.axis.v201406.video.Sorting sorting) {
        this.sorting = sorting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetingGroupSelector)) return false;
        TargetingGroupSelector other = (TargetingGroupSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ids==null && other.getIds()==null) || 
             (this.ids!=null &&
              java.util.Arrays.equals(this.ids, other.getIds()))) &&
            ((this.campaignIds==null && other.getCampaignIds()==null) || 
             (this.campaignIds!=null &&
              java.util.Arrays.equals(this.campaignIds, other.getCampaignIds()))) &&
            ((this.statuses==null && other.getStatuses()==null) || 
             (this.statuses!=null &&
              java.util.Arrays.equals(this.statuses, other.getStatuses()))) &&
            ((this.campaignStatuses==null && other.getCampaignStatuses()==null) || 
             (this.campaignStatuses!=null &&
              java.util.Arrays.equals(this.campaignStatuses, other.getCampaignStatuses()))) &&
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
        if (getIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIds(), i);
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
        if (getStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatuses(), i);
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
        new org.apache.axis.description.TypeDesc(TargetingGroupSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "TargetingGroupSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ids");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "campaignIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statuses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "statuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "TargetingGroupStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "campaignStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoCampaignStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statsSelector");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "statsSelector"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "StatsSelector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paging");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "paging"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "Paging"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sorting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "sorting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "Sorting"));
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

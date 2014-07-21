/**
 * ReportedVideoCampaignCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class ReportedVideoCampaignCriterion  extends com.google.api.ads.adwords.axis.v201406.video.VideoCampaignCriterion  implements java.io.Serializable {
    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats stats;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats[] segmentedStats;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private java.lang.Boolean excluded;

    public ReportedVideoCampaignCriterion() {
    }

    public ReportedVideoCampaignCriterion(
           java.lang.Long campaignId,
           java.lang.String campaignName,
           com.google.api.ads.adwords.axis.v201406.video.BaseCriterion criterion,
           java.lang.String videoCampaignCriterionType,
           com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats stats,
           com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats[] segmentedStats,
           java.lang.Boolean excluded) {
        super(
            campaignId,
            campaignName,
            criterion,
            videoCampaignCriterionType);
        this.stats = stats;
        this.segmentedStats = segmentedStats;
        this.excluded = excluded;
    }


    /**
     * Gets the stats value for this ReportedVideoCampaignCriterion.
     * 
     * @return stats   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this ReportedVideoCampaignCriterion.
     * 
     * @param stats   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setStats(com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats stats) {
        this.stats = stats;
    }


    /**
     * Gets the segmentedStats value for this ReportedVideoCampaignCriterion.
     * 
     * @return segmentedStats   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats[] getSegmentedStats() {
        return segmentedStats;
    }


    /**
     * Sets the segmentedStats value for this ReportedVideoCampaignCriterion.
     * 
     * @param segmentedStats   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setSegmentedStats(com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats[] segmentedStats) {
        this.segmentedStats = segmentedStats;
    }

    public com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats getSegmentedStats(int i) {
        return this.segmentedStats[i];
    }

    public void setSegmentedStats(int i, com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats _value) {
        this.segmentedStats[i] = _value;
    }


    /**
     * Gets the excluded value for this ReportedVideoCampaignCriterion.
     * 
     * @return excluded   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getExcluded() {
        return excluded;
    }


    /**
     * Sets the excluded value for this ReportedVideoCampaignCriterion.
     * 
     * @param excluded   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setExcluded(java.lang.Boolean excluded) {
        this.excluded = excluded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportedVideoCampaignCriterion)) return false;
        ReportedVideoCampaignCriterion other = (ReportedVideoCampaignCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.segmentedStats==null && other.getSegmentedStats()==null) || 
             (this.segmentedStats!=null &&
              java.util.Arrays.equals(this.segmentedStats, other.getSegmentedStats()))) &&
            ((this.excluded==null && other.getExcluded()==null) || 
             (this.excluded!=null &&
              this.excluded.equals(other.getExcluded())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getSegmentedStats() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegmentedStats());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegmentedStats(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcluded() != null) {
            _hashCode += getExcluded().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportedVideoCampaignCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ReportedVideoCampaignCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoEntityStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentedStats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "segmentedStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoEntityStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excluded");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "excluded"));
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

/**
 * BiddableTargetingGroupCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Represents a biddable (positive) targeting group criterion.
 *             
 *             Binds bid override, user specified status and stats to
 * a {@link TargetingGroupCriterion}.
 */
public class BiddableTargetingGroupCriterion  extends com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterion  implements java.io.Serializable {
    /* Current user set state of criterion.
     *                     
     *                     <p>During an ADD operation: It may not be set
     * to REMOVED. Defaults to
     *                     {@code ENABLED} if unspecified. */
    private com.google.api.ads.adwords.axis.v201402.video.UserStatus userStatus;

    /* Statistics for this criterion.
     *                     Always returned if statsSelector is specified,
     * regardless of segmentation.
     *                     See {@link StatsSelector}.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats stats;

    /* Segmented Stats for this criterion. Returned only
     *                     if StatsSelector.segmentationDimensions is specified.
     * See {@link StatsSelector}.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] segmentedStats;

    public BiddableTargetingGroupCriterion() {
    }

    public BiddableTargetingGroupCriterion(
           java.lang.Long targetingGroupId,
           java.lang.String targetingGroupName,
           com.google.api.ads.adwords.axis.v201402.video.BaseCriterion criterion,
           java.lang.Long campaignId,
           java.lang.String targetingGroupCriterionType,
           com.google.api.ads.adwords.axis.v201402.video.UserStatus userStatus,
           com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats stats,
           com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] segmentedStats) {
        super(
            targetingGroupId,
            targetingGroupName,
            criterion,
            campaignId,
            targetingGroupCriterionType);
        this.userStatus = userStatus;
        this.stats = stats;
        this.segmentedStats = segmentedStats;
    }


    /**
     * Gets the userStatus value for this BiddableTargetingGroupCriterion.
     * 
     * @return userStatus   * Current user set state of criterion.
     *                     
     *                     <p>During an ADD operation: It may not be set
     * to REMOVED. Defaults to
     *                     {@code ENABLED} if unspecified.
     */
    public com.google.api.ads.adwords.axis.v201402.video.UserStatus getUserStatus() {
        return userStatus;
    }


    /**
     * Sets the userStatus value for this BiddableTargetingGroupCriterion.
     * 
     * @param userStatus   * Current user set state of criterion.
     *                     
     *                     <p>During an ADD operation: It may not be set
     * to REMOVED. Defaults to
     *                     {@code ENABLED} if unspecified.
     */
    public void setUserStatus(com.google.api.ads.adwords.axis.v201402.video.UserStatus userStatus) {
        this.userStatus = userStatus;
    }


    /**
     * Gets the stats value for this BiddableTargetingGroupCriterion.
     * 
     * @return stats   * Statistics for this criterion.
     *                     Always returned if statsSelector is specified,
     * regardless of segmentation.
     *                     See {@link StatsSelector}.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this BiddableTargetingGroupCriterion.
     * 
     * @param stats   * Statistics for this criterion.
     *                     Always returned if statsSelector is specified,
     * regardless of segmentation.
     *                     See {@link StatsSelector}.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setStats(com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats stats) {
        this.stats = stats;
    }


    /**
     * Gets the segmentedStats value for this BiddableTargetingGroupCriterion.
     * 
     * @return segmentedStats   * Segmented Stats for this criterion. Returned only
     *                     if StatsSelector.segmentationDimensions is specified.
     * See {@link StatsSelector}.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] getSegmentedStats() {
        return segmentedStats;
    }


    /**
     * Sets the segmentedStats value for this BiddableTargetingGroupCriterion.
     * 
     * @param segmentedStats   * Segmented Stats for this criterion. Returned only
     *                     if StatsSelector.segmentationDimensions is specified.
     * See {@link StatsSelector}.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setSegmentedStats(com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] segmentedStats) {
        this.segmentedStats = segmentedStats;
    }

    public com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats getSegmentedStats(int i) {
        return this.segmentedStats[i];
    }

    public void setSegmentedStats(int i, com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats _value) {
        this.segmentedStats[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiddableTargetingGroupCriterion)) return false;
        BiddableTargetingGroupCriterion other = (BiddableTargetingGroupCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userStatus==null && other.getUserStatus()==null) || 
             (this.userStatus!=null &&
              this.userStatus.equals(other.getUserStatus()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.segmentedStats==null && other.getSegmentedStats()==null) || 
             (this.segmentedStats!=null &&
              java.util.Arrays.equals(this.segmentedStats, other.getSegmentedStats())));
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
        if (getUserStatus() != null) {
            _hashCode += getUserStatus().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiddableTargetingGroupCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "BiddableTargetingGroupCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "userStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "UserStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoEntityStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentedStats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "segmentedStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoEntityStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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

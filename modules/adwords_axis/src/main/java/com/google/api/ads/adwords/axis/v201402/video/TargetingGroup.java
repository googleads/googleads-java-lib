/**
 * TargetingGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Represents a TargetingGroup. TargetingGroups are used to target
 * VideoAds.
 */
public class TargetingGroup  implements java.io.Serializable {
    /* Id of this TargetingGroup.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* The id of the video campaign containing this targeting group.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span> */
    private java.lang.Long campaignId;

    /* Name of this targeting group. It is unique within a campaign.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String name;

    /* Status of this video targeting group. On add, defaults to ENABLED. */
    private com.google.api.ads.adwords.axis.v201402.video.TargetingGroupStatus status;

    /* Bids per format.  Once a bid is added, it cannot be removed,
     * so any subsequent SET operations
     *                 will merge the specified values with the existing
     * ones. */
    private com.google.api.ads.adwords.axis.v201402.video.BidsByFormat bidsByFormat;

    /* Statistics for this TargetingGroup. Returned by VideoTargetingGroupService.get()
     * only
     *                 if TargetingGroupSelector.statsSelector is specified,
     * regardless of segmentation.
     *                 See {@link StatsSelector}.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats stats;

    /* List of issues reported on this TargetingGroup. */
    private com.google.api.ads.adwords.axis.v201402.video.ServingInfo issues;

    /* Segmented Stats for this targetingGroup. Returned by VideoTargetingGroupService.get()
     * only
     *                 if StatsSelector.segmentationDimensions is specified.
     * See {@link StatsSelector}.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] segmentedStats;

    /* The name of the corresponding video campaign.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String campaignName;

    public TargetingGroup() {
    }

    public TargetingGroup(
           java.lang.Long id,
           java.lang.Long campaignId,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201402.video.TargetingGroupStatus status,
           com.google.api.ads.adwords.axis.v201402.video.BidsByFormat bidsByFormat,
           com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats stats,
           com.google.api.ads.adwords.axis.v201402.video.ServingInfo issues,
           com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] segmentedStats,
           java.lang.String campaignName) {
           this.id = id;
           this.campaignId = campaignId;
           this.name = name;
           this.status = status;
           this.bidsByFormat = bidsByFormat;
           this.stats = stats;
           this.issues = issues;
           this.segmentedStats = segmentedStats;
           this.campaignName = campaignName;
    }


    /**
     * Gets the id value for this TargetingGroup.
     * 
     * @return id   * Id of this TargetingGroup.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this TargetingGroup.
     * 
     * @param id   * Id of this TargetingGroup.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the campaignId value for this TargetingGroup.
     * 
     * @return campaignId   * The id of the video campaign containing this targeting group.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this TargetingGroup.
     * 
     * @param campaignId   * The id of the video campaign containing this targeting group.
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the name value for this TargetingGroup.
     * 
     * @return name   * Name of this targeting group. It is unique within a campaign.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TargetingGroup.
     * 
     * @param name   * Name of this targeting group. It is unique within a campaign.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this TargetingGroup.
     * 
     * @return status   * Status of this video targeting group. On add, defaults to ENABLED.
     */
    public com.google.api.ads.adwords.axis.v201402.video.TargetingGroupStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TargetingGroup.
     * 
     * @param status   * Status of this video targeting group. On add, defaults to ENABLED.
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201402.video.TargetingGroupStatus status) {
        this.status = status;
    }


    /**
     * Gets the bidsByFormat value for this TargetingGroup.
     * 
     * @return bidsByFormat   * Bids per format.  Once a bid is added, it cannot be removed,
     * so any subsequent SET operations
     *                 will merge the specified values with the existing
     * ones.
     */
    public com.google.api.ads.adwords.axis.v201402.video.BidsByFormat getBidsByFormat() {
        return bidsByFormat;
    }


    /**
     * Sets the bidsByFormat value for this TargetingGroup.
     * 
     * @param bidsByFormat   * Bids per format.  Once a bid is added, it cannot be removed,
     * so any subsequent SET operations
     *                 will merge the specified values with the existing
     * ones.
     */
    public void setBidsByFormat(com.google.api.ads.adwords.axis.v201402.video.BidsByFormat bidsByFormat) {
        this.bidsByFormat = bidsByFormat;
    }


    /**
     * Gets the stats value for this TargetingGroup.
     * 
     * @return stats   * Statistics for this TargetingGroup. Returned by VideoTargetingGroupService.get()
     * only
     *                 if TargetingGroupSelector.statsSelector is specified,
     * regardless of segmentation.
     *                 See {@link StatsSelector}.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this TargetingGroup.
     * 
     * @param stats   * Statistics for this TargetingGroup. Returned by VideoTargetingGroupService.get()
     * only
     *                 if TargetingGroupSelector.statsSelector is specified,
     * regardless of segmentation.
     *                 See {@link StatsSelector}.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStats(com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats stats) {
        this.stats = stats;
    }


    /**
     * Gets the issues value for this TargetingGroup.
     * 
     * @return issues   * List of issues reported on this TargetingGroup.
     */
    public com.google.api.ads.adwords.axis.v201402.video.ServingInfo getIssues() {
        return issues;
    }


    /**
     * Sets the issues value for this TargetingGroup.
     * 
     * @param issues   * List of issues reported on this TargetingGroup.
     */
    public void setIssues(com.google.api.ads.adwords.axis.v201402.video.ServingInfo issues) {
        this.issues = issues;
    }


    /**
     * Gets the segmentedStats value for this TargetingGroup.
     * 
     * @return segmentedStats   * Segmented Stats for this targetingGroup. Returned by VideoTargetingGroupService.get()
     * only
     *                 if StatsSelector.segmentationDimensions is specified.
     * See {@link StatsSelector}.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] getSegmentedStats() {
        return segmentedStats;
    }


    /**
     * Sets the segmentedStats value for this TargetingGroup.
     * 
     * @param segmentedStats   * Segmented Stats for this targetingGroup. Returned by VideoTargetingGroupService.get()
     * only
     *                 if StatsSelector.segmentationDimensions is specified.
     * See {@link StatsSelector}.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
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


    /**
     * Gets the campaignName value for this TargetingGroup.
     * 
     * @return campaignName   * The name of the corresponding video campaign.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getCampaignName() {
        return campaignName;
    }


    /**
     * Sets the campaignName value for this TargetingGroup.
     * 
     * @param campaignName   * The name of the corresponding video campaign.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCampaignName(java.lang.String campaignName) {
        this.campaignName = campaignName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetingGroup)) return false;
        TargetingGroup other = (TargetingGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.bidsByFormat==null && other.getBidsByFormat()==null) || 
             (this.bidsByFormat!=null &&
              this.bidsByFormat.equals(other.getBidsByFormat()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.issues==null && other.getIssues()==null) || 
             (this.issues!=null &&
              this.issues.equals(other.getIssues()))) &&
            ((this.segmentedStats==null && other.getSegmentedStats()==null) || 
             (this.segmentedStats!=null &&
              java.util.Arrays.equals(this.segmentedStats, other.getSegmentedStats()))) &&
            ((this.campaignName==null && other.getCampaignName()==null) || 
             (this.campaignName!=null &&
              this.campaignName.equals(other.getCampaignName())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getBidsByFormat() != null) {
            _hashCode += getBidsByFormat().hashCode();
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getIssues() != null) {
            _hashCode += getIssues().hashCode();
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
        if (getCampaignName() != null) {
            _hashCode += getCampaignName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetingGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "TargetingGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "TargetingGroupStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidsByFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "bidsByFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "BidsByFormat"));
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
        elemField.setFieldName("issues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "issues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "ServingInfo"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "campaignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

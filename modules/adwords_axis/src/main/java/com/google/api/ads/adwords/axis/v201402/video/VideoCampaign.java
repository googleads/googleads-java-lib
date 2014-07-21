/**
 * VideoCampaign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Represents a video campaign, which contains a set of video ads.
 */
public class VideoCampaign  implements java.io.Serializable {
    /* Id of this video campaign.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* Name of this video campaign.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String name;

    /* Status of this video campaign. On add, defaults to ENABLED. */
    private com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus status;

    /* Date the campaign starts. The format for the date is YYYYMMDD. */
    private java.lang.String startDate;

    /* Date the campaign ends. The format for the date is YYYYMMDD. */
    private java.lang.String endDate;

    /* This campaign's budget id. See
     *                 {@link com.google.ads.api.services.campaignmgmt.budget.BudgetService}. */
    private java.lang.Long budgetId;

    /* Bidding mode - see {@link BiddingMode}. */
    private com.google.api.ads.adwords.axis.v201402.video.VideoCampaignBiddingMode biddingMode;

    /* Targeting mode */
    private com.google.api.ads.adwords.axis.v201402.video.VideoCampaignTargetingMode targetingMode;

    /* Spending mode
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.VideoCampaignSpendingStatus spendingStatus;

    /* Scheduling mode
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.CampaignSchedulingStatus schedulingStatus;

    /* Ad serving optimization status for the campaign. */
    private com.google.api.ads.adwords.axis.v201402.video.AdServingOptimizationStatus adServingOptimizationStatus;

    /* Frequency cap for the campaign. */
    private com.google.api.ads.adwords.axis.v201402.video.VideoFrequencyCap frequencyCap;

    /* VideoAdNetworks this campaign is running on. */
    private com.google.api.ads.adwords.axis.v201402.video.VideoAdNetworks networks;

    /* Statistics about this campaign. Always returned if statsSelector
     * is specified, regardless of
     *                 segmentation. See {@link StatsSelector}.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats stats;

    /* Statistics about this campaign segmented by the dimensions
     * indicated in the
     *                 {@link StatsSelector}, if any.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] segmentedStats;

    public VideoCampaign() {
    }

    public VideoCampaign(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus status,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.Long budgetId,
           com.google.api.ads.adwords.axis.v201402.video.VideoCampaignBiddingMode biddingMode,
           com.google.api.ads.adwords.axis.v201402.video.VideoCampaignTargetingMode targetingMode,
           com.google.api.ads.adwords.axis.v201402.video.VideoCampaignSpendingStatus spendingStatus,
           com.google.api.ads.adwords.axis.v201402.video.CampaignSchedulingStatus schedulingStatus,
           com.google.api.ads.adwords.axis.v201402.video.AdServingOptimizationStatus adServingOptimizationStatus,
           com.google.api.ads.adwords.axis.v201402.video.VideoFrequencyCap frequencyCap,
           com.google.api.ads.adwords.axis.v201402.video.VideoAdNetworks networks,
           com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats stats,
           com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] segmentedStats) {
           this.id = id;
           this.name = name;
           this.status = status;
           this.startDate = startDate;
           this.endDate = endDate;
           this.budgetId = budgetId;
           this.biddingMode = biddingMode;
           this.targetingMode = targetingMode;
           this.spendingStatus = spendingStatus;
           this.schedulingStatus = schedulingStatus;
           this.adServingOptimizationStatus = adServingOptimizationStatus;
           this.frequencyCap = frequencyCap;
           this.networks = networks;
           this.stats = stats;
           this.segmentedStats = segmentedStats;
    }


    /**
     * Gets the id value for this VideoCampaign.
     * 
     * @return id   * Id of this video campaign.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this VideoCampaign.
     * 
     * @param id   * Id of this video campaign.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this VideoCampaign.
     * 
     * @return name   * Name of this video campaign.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VideoCampaign.
     * 
     * @param name   * Name of this video campaign.
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this VideoCampaign.
     * 
     * @return status   * Status of this video campaign. On add, defaults to ENABLED.
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this VideoCampaign.
     * 
     * @param status   * Status of this video campaign. On add, defaults to ENABLED.
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus status) {
        this.status = status;
    }


    /**
     * Gets the startDate value for this VideoCampaign.
     * 
     * @return startDate   * Date the campaign starts. The format for the date is YYYYMMDD.
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this VideoCampaign.
     * 
     * @param startDate   * Date the campaign starts. The format for the date is YYYYMMDD.
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this VideoCampaign.
     * 
     * @return endDate   * Date the campaign ends. The format for the date is YYYYMMDD.
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this VideoCampaign.
     * 
     * @param endDate   * Date the campaign ends. The format for the date is YYYYMMDD.
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the budgetId value for this VideoCampaign.
     * 
     * @return budgetId   * This campaign's budget id. See
     *                 {@link com.google.ads.api.services.campaignmgmt.budget.BudgetService}.
     */
    public java.lang.Long getBudgetId() {
        return budgetId;
    }


    /**
     * Sets the budgetId value for this VideoCampaign.
     * 
     * @param budgetId   * This campaign's budget id. See
     *                 {@link com.google.ads.api.services.campaignmgmt.budget.BudgetService}.
     */
    public void setBudgetId(java.lang.Long budgetId) {
        this.budgetId = budgetId;
    }


    /**
     * Gets the biddingMode value for this VideoCampaign.
     * 
     * @return biddingMode   * Bidding mode - see {@link BiddingMode}.
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignBiddingMode getBiddingMode() {
        return biddingMode;
    }


    /**
     * Sets the biddingMode value for this VideoCampaign.
     * 
     * @param biddingMode   * Bidding mode - see {@link BiddingMode}.
     */
    public void setBiddingMode(com.google.api.ads.adwords.axis.v201402.video.VideoCampaignBiddingMode biddingMode) {
        this.biddingMode = biddingMode;
    }


    /**
     * Gets the targetingMode value for this VideoCampaign.
     * 
     * @return targetingMode   * Targeting mode
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignTargetingMode getTargetingMode() {
        return targetingMode;
    }


    /**
     * Sets the targetingMode value for this VideoCampaign.
     * 
     * @param targetingMode   * Targeting mode
     */
    public void setTargetingMode(com.google.api.ads.adwords.axis.v201402.video.VideoCampaignTargetingMode targetingMode) {
        this.targetingMode = targetingMode;
    }


    /**
     * Gets the spendingStatus value for this VideoCampaign.
     * 
     * @return spendingStatus   * Spending mode
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignSpendingStatus getSpendingStatus() {
        return spendingStatus;
    }


    /**
     * Sets the spendingStatus value for this VideoCampaign.
     * 
     * @param spendingStatus   * Spending mode
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSpendingStatus(com.google.api.ads.adwords.axis.v201402.video.VideoCampaignSpendingStatus spendingStatus) {
        this.spendingStatus = spendingStatus;
    }


    /**
     * Gets the schedulingStatus value for this VideoCampaign.
     * 
     * @return schedulingStatus   * Scheduling mode
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.CampaignSchedulingStatus getSchedulingStatus() {
        return schedulingStatus;
    }


    /**
     * Sets the schedulingStatus value for this VideoCampaign.
     * 
     * @param schedulingStatus   * Scheduling mode
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSchedulingStatus(com.google.api.ads.adwords.axis.v201402.video.CampaignSchedulingStatus schedulingStatus) {
        this.schedulingStatus = schedulingStatus;
    }


    /**
     * Gets the adServingOptimizationStatus value for this VideoCampaign.
     * 
     * @return adServingOptimizationStatus   * Ad serving optimization status for the campaign.
     */
    public com.google.api.ads.adwords.axis.v201402.video.AdServingOptimizationStatus getAdServingOptimizationStatus() {
        return adServingOptimizationStatus;
    }


    /**
     * Sets the adServingOptimizationStatus value for this VideoCampaign.
     * 
     * @param adServingOptimizationStatus   * Ad serving optimization status for the campaign.
     */
    public void setAdServingOptimizationStatus(com.google.api.ads.adwords.axis.v201402.video.AdServingOptimizationStatus adServingOptimizationStatus) {
        this.adServingOptimizationStatus = adServingOptimizationStatus;
    }


    /**
     * Gets the frequencyCap value for this VideoCampaign.
     * 
     * @return frequencyCap   * Frequency cap for the campaign.
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoFrequencyCap getFrequencyCap() {
        return frequencyCap;
    }


    /**
     * Sets the frequencyCap value for this VideoCampaign.
     * 
     * @param frequencyCap   * Frequency cap for the campaign.
     */
    public void setFrequencyCap(com.google.api.ads.adwords.axis.v201402.video.VideoFrequencyCap frequencyCap) {
        this.frequencyCap = frequencyCap;
    }


    /**
     * Gets the networks value for this VideoCampaign.
     * 
     * @return networks   * VideoAdNetworks this campaign is running on.
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoAdNetworks getNetworks() {
        return networks;
    }


    /**
     * Sets the networks value for this VideoCampaign.
     * 
     * @param networks   * VideoAdNetworks this campaign is running on.
     */
    public void setNetworks(com.google.api.ads.adwords.axis.v201402.video.VideoAdNetworks networks) {
        this.networks = networks;
    }


    /**
     * Gets the stats value for this VideoCampaign.
     * 
     * @return stats   * Statistics about this campaign. Always returned if statsSelector
     * is specified, regardless of
     *                 segmentation. See {@link StatsSelector}.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this VideoCampaign.
     * 
     * @param stats   * Statistics about this campaign. Always returned if statsSelector
     * is specified, regardless of
     *                 segmentation. See {@link StatsSelector}.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStats(com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats stats) {
        this.stats = stats;
    }


    /**
     * Gets the segmentedStats value for this VideoCampaign.
     * 
     * @return segmentedStats   * Statistics about this campaign segmented by the dimensions
     * indicated in the
     *                 {@link StatsSelector}, if any.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] getSegmentedStats() {
        return segmentedStats;
    }


    /**
     * Sets the segmentedStats value for this VideoCampaign.
     * 
     * @param segmentedStats   * Statistics about this campaign segmented by the dimensions
     * indicated in the
     *                 {@link StatsSelector}, if any.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoCampaign)) return false;
        VideoCampaign other = (VideoCampaign) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.budgetId==null && other.getBudgetId()==null) || 
             (this.budgetId!=null &&
              this.budgetId.equals(other.getBudgetId()))) &&
            ((this.biddingMode==null && other.getBiddingMode()==null) || 
             (this.biddingMode!=null &&
              this.biddingMode.equals(other.getBiddingMode()))) &&
            ((this.targetingMode==null && other.getTargetingMode()==null) || 
             (this.targetingMode!=null &&
              this.targetingMode.equals(other.getTargetingMode()))) &&
            ((this.spendingStatus==null && other.getSpendingStatus()==null) || 
             (this.spendingStatus!=null &&
              this.spendingStatus.equals(other.getSpendingStatus()))) &&
            ((this.schedulingStatus==null && other.getSchedulingStatus()==null) || 
             (this.schedulingStatus!=null &&
              this.schedulingStatus.equals(other.getSchedulingStatus()))) &&
            ((this.adServingOptimizationStatus==null && other.getAdServingOptimizationStatus()==null) || 
             (this.adServingOptimizationStatus!=null &&
              this.adServingOptimizationStatus.equals(other.getAdServingOptimizationStatus()))) &&
            ((this.frequencyCap==null && other.getFrequencyCap()==null) || 
             (this.frequencyCap!=null &&
              this.frequencyCap.equals(other.getFrequencyCap()))) &&
            ((this.networks==null && other.getNetworks()==null) || 
             (this.networks!=null &&
              this.networks.equals(other.getNetworks()))) &&
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
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getBudgetId() != null) {
            _hashCode += getBudgetId().hashCode();
        }
        if (getBiddingMode() != null) {
            _hashCode += getBiddingMode().hashCode();
        }
        if (getTargetingMode() != null) {
            _hashCode += getTargetingMode().hashCode();
        }
        if (getSpendingStatus() != null) {
            _hashCode += getSpendingStatus().hashCode();
        }
        if (getSchedulingStatus() != null) {
            _hashCode += getSchedulingStatus().hashCode();
        }
        if (getAdServingOptimizationStatus() != null) {
            _hashCode += getAdServingOptimizationStatus().hashCode();
        }
        if (getFrequencyCap() != null) {
            _hashCode += getFrequencyCap().hashCode();
        }
        if (getNetworks() != null) {
            _hashCode += getNetworks().hashCode();
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
        new org.apache.axis.description.TypeDesc(VideoCampaign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoCampaign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "id"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoCampaignStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "budgetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "biddingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoCampaign.BiddingMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "targetingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoCampaign.TargetingMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spendingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "spendingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoCampaign.SpendingStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedulingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "schedulingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "CampaignSchedulingStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adServingOptimizationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "adServingOptimizationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "AdServingOptimizationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "frequencyCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoFrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "networks"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoAdNetworks"));
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

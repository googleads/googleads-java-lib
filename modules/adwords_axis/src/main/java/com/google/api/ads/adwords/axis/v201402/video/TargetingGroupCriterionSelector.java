/**
 * TargetingGroupCriterionSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * A filter for selecting video campaign criterions for a customer.
 * Only those criterions that match all filters will be returned.
 */
public class TargetingGroupCriterionSelector  implements java.io.Serializable {
    /* The dimension of criteria to be returned. Required. */
    private com.google.api.ads.adwords.axis.v201402.video.CriteriaDimension criteriaDimension;

    /* Specifies finer filtering of the criteria dimension by actual
     * criteria types.
     *                 Criteria types specified in this list must belong
     * to the criteria dimension.
     *                 
     *                 NOTE: Filtering by criteria type is not supported
     * for PLACEMENT dimension.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.BaseCriterionType[] criterionTypes;

    /* Only criterion with those statuses will be returned. Empty
     * list indicates all statuses.
     *                 
     *                 A negative criteria matches the ENABLED status, when
     * selected through {@link #criterionUse}.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.UserStatus[] userStatuses;

    /* The list of campaign statuses for which to return criterions.
     * Empty list indicates all account campaigns.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus[] campaignStatuses;

    /* Indicates if stats should be returned; {@code null} will not
     * return stats. */
    private com.google.api.ads.adwords.axis.v201402.video.StatsSelector statsSelector;

    /* The starting index and number of results to return. */
    private com.google.api.ads.adwords.axis.v201402.cm.Paging paging;

    /* The ordering to return results. */
    private com.google.api.ads.adwords.axis.v201402.video.Sorting sorting;

    /* The list of campaign ids for which to return criterions.
     *                 Empty list indicates all account campaigns.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private long[] campaignIds;

    /* The list of targeting group ids for which to return criterions.
     * Empty list indicates all targeting groups.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private long[] targetingGroupIds;

    /* The list of criterion ids to return.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private long[] criterionIds;

    /* Filtering option based on relation type. */
    private com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterionSelectorCriterionUse criterionUse;

    public TargetingGroupCriterionSelector() {
    }

    public TargetingGroupCriterionSelector(
           com.google.api.ads.adwords.axis.v201402.video.CriteriaDimension criteriaDimension,
           com.google.api.ads.adwords.axis.v201402.video.BaseCriterionType[] criterionTypes,
           com.google.api.ads.adwords.axis.v201402.video.UserStatus[] userStatuses,
           com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus[] campaignStatuses,
           com.google.api.ads.adwords.axis.v201402.video.StatsSelector statsSelector,
           com.google.api.ads.adwords.axis.v201402.cm.Paging paging,
           com.google.api.ads.adwords.axis.v201402.video.Sorting sorting,
           long[] campaignIds,
           long[] targetingGroupIds,
           long[] criterionIds,
           com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterionSelectorCriterionUse criterionUse) {
           this.criteriaDimension = criteriaDimension;
           this.criterionTypes = criterionTypes;
           this.userStatuses = userStatuses;
           this.campaignStatuses = campaignStatuses;
           this.statsSelector = statsSelector;
           this.paging = paging;
           this.sorting = sorting;
           this.campaignIds = campaignIds;
           this.targetingGroupIds = targetingGroupIds;
           this.criterionIds = criterionIds;
           this.criterionUse = criterionUse;
    }


    /**
     * Gets the criteriaDimension value for this TargetingGroupCriterionSelector.
     * 
     * @return criteriaDimension   * The dimension of criteria to be returned. Required.
     */
    public com.google.api.ads.adwords.axis.v201402.video.CriteriaDimension getCriteriaDimension() {
        return criteriaDimension;
    }


    /**
     * Sets the criteriaDimension value for this TargetingGroupCriterionSelector.
     * 
     * @param criteriaDimension   * The dimension of criteria to be returned. Required.
     */
    public void setCriteriaDimension(com.google.api.ads.adwords.axis.v201402.video.CriteriaDimension criteriaDimension) {
        this.criteriaDimension = criteriaDimension;
    }


    /**
     * Gets the criterionTypes value for this TargetingGroupCriterionSelector.
     * 
     * @return criterionTypes   * Specifies finer filtering of the criteria dimension by actual
     * criteria types.
     *                 Criteria types specified in this list must belong
     * to the criteria dimension.
     *                 
     *                 NOTE: Filtering by criteria type is not supported
     * for PLACEMENT dimension.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.BaseCriterionType[] getCriterionTypes() {
        return criterionTypes;
    }


    /**
     * Sets the criterionTypes value for this TargetingGroupCriterionSelector.
     * 
     * @param criterionTypes   * Specifies finer filtering of the criteria dimension by actual
     * criteria types.
     *                 Criteria types specified in this list must belong
     * to the criteria dimension.
     *                 
     *                 NOTE: Filtering by criteria type is not supported
     * for PLACEMENT dimension.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setCriterionTypes(com.google.api.ads.adwords.axis.v201402.video.BaseCriterionType[] criterionTypes) {
        this.criterionTypes = criterionTypes;
    }

    public com.google.api.ads.adwords.axis.v201402.video.BaseCriterionType getCriterionTypes(int i) {
        return this.criterionTypes[i];
    }

    public void setCriterionTypes(int i, com.google.api.ads.adwords.axis.v201402.video.BaseCriterionType _value) {
        this.criterionTypes[i] = _value;
    }


    /**
     * Gets the userStatuses value for this TargetingGroupCriterionSelector.
     * 
     * @return userStatuses   * Only criterion with those statuses will be returned. Empty
     * list indicates all statuses.
     *                 
     *                 A negative criteria matches the ENABLED status, when
     * selected through {@link #criterionUse}.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.UserStatus[] getUserStatuses() {
        return userStatuses;
    }


    /**
     * Sets the userStatuses value for this TargetingGroupCriterionSelector.
     * 
     * @param userStatuses   * Only criterion with those statuses will be returned. Empty
     * list indicates all statuses.
     *                 
     *                 A negative criteria matches the ENABLED status, when
     * selected through {@link #criterionUse}.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setUserStatuses(com.google.api.ads.adwords.axis.v201402.video.UserStatus[] userStatuses) {
        this.userStatuses = userStatuses;
    }

    public com.google.api.ads.adwords.axis.v201402.video.UserStatus getUserStatuses(int i) {
        return this.userStatuses[i];
    }

    public void setUserStatuses(int i, com.google.api.ads.adwords.axis.v201402.video.UserStatus _value) {
        this.userStatuses[i] = _value;
    }


    /**
     * Gets the campaignStatuses value for this TargetingGroupCriterionSelector.
     * 
     * @return campaignStatuses   * The list of campaign statuses for which to return criterions.
     * Empty list indicates all account campaigns.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignStatus[] getCampaignStatuses() {
        return campaignStatuses;
    }


    /**
     * Sets the campaignStatuses value for this TargetingGroupCriterionSelector.
     * 
     * @param campaignStatuses   * The list of campaign statuses for which to return criterions.
     * Empty list indicates all account campaigns.
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
     * Gets the statsSelector value for this TargetingGroupCriterionSelector.
     * 
     * @return statsSelector   * Indicates if stats should be returned; {@code null} will not
     * return stats.
     */
    public com.google.api.ads.adwords.axis.v201402.video.StatsSelector getStatsSelector() {
        return statsSelector;
    }


    /**
     * Sets the statsSelector value for this TargetingGroupCriterionSelector.
     * 
     * @param statsSelector   * Indicates if stats should be returned; {@code null} will not
     * return stats.
     */
    public void setStatsSelector(com.google.api.ads.adwords.axis.v201402.video.StatsSelector statsSelector) {
        this.statsSelector = statsSelector;
    }


    /**
     * Gets the paging value for this TargetingGroupCriterionSelector.
     * 
     * @return paging   * The starting index and number of results to return.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Paging getPaging() {
        return paging;
    }


    /**
     * Sets the paging value for this TargetingGroupCriterionSelector.
     * 
     * @param paging   * The starting index and number of results to return.
     */
    public void setPaging(com.google.api.ads.adwords.axis.v201402.cm.Paging paging) {
        this.paging = paging;
    }


    /**
     * Gets the sorting value for this TargetingGroupCriterionSelector.
     * 
     * @return sorting   * The ordering to return results.
     */
    public com.google.api.ads.adwords.axis.v201402.video.Sorting getSorting() {
        return sorting;
    }


    /**
     * Sets the sorting value for this TargetingGroupCriterionSelector.
     * 
     * @param sorting   * The ordering to return results.
     */
    public void setSorting(com.google.api.ads.adwords.axis.v201402.video.Sorting sorting) {
        this.sorting = sorting;
    }


    /**
     * Gets the campaignIds value for this TargetingGroupCriterionSelector.
     * 
     * @return campaignIds   * The list of campaign ids for which to return criterions.
     *                 Empty list indicates all account campaigns.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public long[] getCampaignIds() {
        return campaignIds;
    }


    /**
     * Sets the campaignIds value for this TargetingGroupCriterionSelector.
     * 
     * @param campaignIds   * The list of campaign ids for which to return criterions.
     *                 Empty list indicates all account campaigns.
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
     * Gets the targetingGroupIds value for this TargetingGroupCriterionSelector.
     * 
     * @return targetingGroupIds   * The list of targeting group ids for which to return criterions.
     * Empty list indicates all targeting groups.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public long[] getTargetingGroupIds() {
        return targetingGroupIds;
    }


    /**
     * Sets the targetingGroupIds value for this TargetingGroupCriterionSelector.
     * 
     * @param targetingGroupIds   * The list of targeting group ids for which to return criterions.
     * Empty list indicates all targeting groups.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setTargetingGroupIds(long[] targetingGroupIds) {
        this.targetingGroupIds = targetingGroupIds;
    }

    public long getTargetingGroupIds(int i) {
        return this.targetingGroupIds[i];
    }

    public void setTargetingGroupIds(int i, long _value) {
        this.targetingGroupIds[i] = _value;
    }


    /**
     * Gets the criterionIds value for this TargetingGroupCriterionSelector.
     * 
     * @return criterionIds   * The list of criterion ids to return.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public long[] getCriterionIds() {
        return criterionIds;
    }


    /**
     * Sets the criterionIds value for this TargetingGroupCriterionSelector.
     * 
     * @param criterionIds   * The list of criterion ids to return.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setCriterionIds(long[] criterionIds) {
        this.criterionIds = criterionIds;
    }

    public long getCriterionIds(int i) {
        return this.criterionIds[i];
    }

    public void setCriterionIds(int i, long _value) {
        this.criterionIds[i] = _value;
    }


    /**
     * Gets the criterionUse value for this TargetingGroupCriterionSelector.
     * 
     * @return criterionUse   * Filtering option based on relation type.
     */
    public com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterionSelectorCriterionUse getCriterionUse() {
        return criterionUse;
    }


    /**
     * Sets the criterionUse value for this TargetingGroupCriterionSelector.
     * 
     * @param criterionUse   * Filtering option based on relation type.
     */
    public void setCriterionUse(com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterionSelectorCriterionUse criterionUse) {
        this.criterionUse = criterionUse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetingGroupCriterionSelector)) return false;
        TargetingGroupCriterionSelector other = (TargetingGroupCriterionSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.criteriaDimension==null && other.getCriteriaDimension()==null) || 
             (this.criteriaDimension!=null &&
              this.criteriaDimension.equals(other.getCriteriaDimension()))) &&
            ((this.criterionTypes==null && other.getCriterionTypes()==null) || 
             (this.criterionTypes!=null &&
              java.util.Arrays.equals(this.criterionTypes, other.getCriterionTypes()))) &&
            ((this.userStatuses==null && other.getUserStatuses()==null) || 
             (this.userStatuses!=null &&
              java.util.Arrays.equals(this.userStatuses, other.getUserStatuses()))) &&
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
              this.sorting.equals(other.getSorting()))) &&
            ((this.campaignIds==null && other.getCampaignIds()==null) || 
             (this.campaignIds!=null &&
              java.util.Arrays.equals(this.campaignIds, other.getCampaignIds()))) &&
            ((this.targetingGroupIds==null && other.getTargetingGroupIds()==null) || 
             (this.targetingGroupIds!=null &&
              java.util.Arrays.equals(this.targetingGroupIds, other.getTargetingGroupIds()))) &&
            ((this.criterionIds==null && other.getCriterionIds()==null) || 
             (this.criterionIds!=null &&
              java.util.Arrays.equals(this.criterionIds, other.getCriterionIds()))) &&
            ((this.criterionUse==null && other.getCriterionUse()==null) || 
             (this.criterionUse!=null &&
              this.criterionUse.equals(other.getCriterionUse())));
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
        if (getCriteriaDimension() != null) {
            _hashCode += getCriteriaDimension().hashCode();
        }
        if (getCriterionTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriterionTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriterionTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserStatuses(), i);
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
        if (getTargetingGroupIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetingGroupIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetingGroupIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCriterionIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriterionIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriterionIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCriterionUse() != null) {
            _hashCode += getCriterionUse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetingGroupCriterionSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "TargetingGroupCriterionSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriaDimension");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "criteriaDimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "CriteriaDimension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "criterionTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "BaseCriterion.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "userStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "UserStatus"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "campaignIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "targetingGroupIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "criterionIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionUse");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "criterionUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "TargetingGroupCriterionSelector.CriterionUse"));
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

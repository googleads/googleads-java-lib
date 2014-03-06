/**
 * AdGroupAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;


/**
 * Represents an ad in an ad group.
 */
public class AdGroupAd  implements java.io.Serializable {
    /* The id of the adgroup containing this ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long adGroupId;

    /* The contents of the ad itself.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201402.cm.Ad ad;

    /* Experiment data associated with this {@link AdGroupAd}. It
     * is returned by
     *                 {@link AdGroupAdService#get get()} only if the experimentId
     * is supplied. */
    private com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdExperimentData experimentData;

    /* The status of the ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to ENABLED for campaign channel type SHOPPING.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdStatus status;

    /* Approval status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupCreativeApprovalStatus".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdApprovalStatus approvalStatus;

    /* List of disapproval reasons.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupAdDisapprovalReasons".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.String[] disapprovalReasons;

    /* True if and only if this ad is not serving because it does
     * not meet
     *                 trademark policy.
     *                 This field is only useful when {@link #approvalStatus
     * approvalStatus} is an
     *                 approved status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupAdTrademarkDisapproved".</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.Boolean trademarkDisapproved;

    /* This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value. */
    private com.google.api.ads.adwords.axis.v201402.cm.String_StringMapEntry[] forwardCompatibilityMap;

    public AdGroupAd() {
    }

    public AdGroupAd(
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201402.cm.Ad ad,
           com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdExperimentData experimentData,
           com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdStatus status,
           com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdApprovalStatus approvalStatus,
           java.lang.String[] disapprovalReasons,
           java.lang.Boolean trademarkDisapproved,
           com.google.api.ads.adwords.axis.v201402.cm.String_StringMapEntry[] forwardCompatibilityMap) {
           this.adGroupId = adGroupId;
           this.ad = ad;
           this.experimentData = experimentData;
           this.status = status;
           this.approvalStatus = approvalStatus;
           this.disapprovalReasons = disapprovalReasons;
           this.trademarkDisapproved = trademarkDisapproved;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
    }


    /**
     * Gets the adGroupId value for this AdGroupAd.
     * 
     * @return adGroupId   * The id of the adgroup containing this ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupAd.
     * 
     * @param adGroupId   * The id of the adgroup containing this ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the ad value for this AdGroupAd.
     * 
     * @return ad   * The contents of the ad itself.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Ad getAd() {
        return ad;
    }


    /**
     * Sets the ad value for this AdGroupAd.
     * 
     * @param ad   * The contents of the ad itself.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAd(com.google.api.ads.adwords.axis.v201402.cm.Ad ad) {
        this.ad = ad;
    }


    /**
     * Gets the experimentData value for this AdGroupAd.
     * 
     * @return experimentData   * Experiment data associated with this {@link AdGroupAd}. It
     * is returned by
     *                 {@link AdGroupAdService#get get()} only if the experimentId
     * is supplied.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdExperimentData getExperimentData() {
        return experimentData;
    }


    /**
     * Sets the experimentData value for this AdGroupAd.
     * 
     * @param experimentData   * Experiment data associated with this {@link AdGroupAd}. It
     * is returned by
     *                 {@link AdGroupAdService#get get()} only if the experimentId
     * is supplied.
     */
    public void setExperimentData(com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdExperimentData experimentData) {
        this.experimentData = experimentData;
    }


    /**
     * Gets the status value for this AdGroupAd.
     * 
     * @return status   * The status of the ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to ENABLED for campaign channel type SHOPPING.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdGroupAd.
     * 
     * @param status   * The status of the ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint CampaignType">This field may
     * only be set to ENABLED for campaign channel type SHOPPING.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdStatus status) {
        this.status = status;
    }


    /**
     * Gets the approvalStatus value for this AdGroupAd.
     * 
     * @return approvalStatus   * Approval status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupCreativeApprovalStatus".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this AdGroupAd.
     * 
     * @param approvalStatus   * Approval status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupCreativeApprovalStatus".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setApprovalStatus(com.google.api.ads.adwords.axis.v201402.cm.AdGroupAdApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the disapprovalReasons value for this AdGroupAd.
     * 
     * @return disapprovalReasons   * List of disapproval reasons.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupAdDisapprovalReasons".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.String[] getDisapprovalReasons() {
        return disapprovalReasons;
    }


    /**
     * Sets the disapprovalReasons value for this AdGroupAd.
     * 
     * @param disapprovalReasons   * List of disapproval reasons.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupAdDisapprovalReasons".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setDisapprovalReasons(java.lang.String[] disapprovalReasons) {
        this.disapprovalReasons = disapprovalReasons;
    }

    public java.lang.String getDisapprovalReasons(int i) {
        return this.disapprovalReasons[i];
    }

    public void setDisapprovalReasons(int i, java.lang.String _value) {
        this.disapprovalReasons[i] = _value;
    }


    /**
     * Gets the trademarkDisapproved value for this AdGroupAd.
     * 
     * @return trademarkDisapproved   * True if and only if this ad is not serving because it does
     * not meet
     *                 trademark policy.
     *                 This field is only useful when {@link #approvalStatus
     * approvalStatus} is an
     *                 approved status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupAdTrademarkDisapproved".</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getTrademarkDisapproved() {
        return trademarkDisapproved;
    }


    /**
     * Sets the trademarkDisapproved value for this AdGroupAd.
     * 
     * @param trademarkDisapproved   * True if and only if this ad is not serving because it does
     * not meet
     *                 trademark policy.
     *                 This field is only useful when {@link #approvalStatus
     * approvalStatus} is an
     *                 approved status.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupAdTrademarkDisapproved".</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setTrademarkDisapproved(java.lang.Boolean trademarkDisapproved) {
        this.trademarkDisapproved = trademarkDisapproved;
    }


    /**
     * Gets the forwardCompatibilityMap value for this AdGroupAd.
     * 
     * @return forwardCompatibilityMap   * This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.String_StringMapEntry[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    /**
     * Sets the forwardCompatibilityMap value for this AdGroupAd.
     * 
     * @param forwardCompatibilityMap   * This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value.
     */
    public void setForwardCompatibilityMap(com.google.api.ads.adwords.axis.v201402.cm.String_StringMapEntry[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    public com.google.api.ads.adwords.axis.v201402.cm.String_StringMapEntry getForwardCompatibilityMap(int i) {
        return this.forwardCompatibilityMap[i];
    }

    public void setForwardCompatibilityMap(int i, com.google.api.ads.adwords.axis.v201402.cm.String_StringMapEntry _value) {
        this.forwardCompatibilityMap[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupAd)) return false;
        AdGroupAd other = (AdGroupAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.ad==null && other.getAd()==null) || 
             (this.ad!=null &&
              this.ad.equals(other.getAd()))) &&
            ((this.experimentData==null && other.getExperimentData()==null) || 
             (this.experimentData!=null &&
              this.experimentData.equals(other.getExperimentData()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.disapprovalReasons==null && other.getDisapprovalReasons()==null) || 
             (this.disapprovalReasons!=null &&
              java.util.Arrays.equals(this.disapprovalReasons, other.getDisapprovalReasons()))) &&
            ((this.trademarkDisapproved==null && other.getTrademarkDisapproved()==null) || 
             (this.trademarkDisapproved!=null &&
              this.trademarkDisapproved.equals(other.getTrademarkDisapproved()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) || 
             (this.forwardCompatibilityMap!=null &&
              java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getAd() != null) {
            _hashCode += getAd().hashCode();
        }
        if (getExperimentData() != null) {
            _hashCode += getExperimentData().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getDisapprovalReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisapprovalReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisapprovalReasons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrademarkDisapproved() != null) {
            _hashCode += getTrademarkDisapproved().hashCode();
        }
        if (getForwardCompatibilityMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
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
        new org.apache.axis.description.TypeDesc(AdGroupAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "AdGroupAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ad");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "ad"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Ad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "experimentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "AdGroupAdExperimentData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "AdGroupAd.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "AdGroupAd.ApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disapprovalReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "disapprovalReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trademarkDisapproved");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "trademarkDisapproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "forwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "String_StringMapEntry"));
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

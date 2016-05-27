/**
 * FeedItemPolicyData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;


/**
 * Contains offline-validation and approval results for a given FeedItem
 * and FeedMapping. Each
 *             validation data indicates any issues found on the feed
 * item when used in the context of the
 *             feed mapping.
 */
public class FeedItemPolicyData  extends com.google.api.ads.adwords.axis.v201605.cm.PolicyData  implements java.io.Serializable {
    /* Mapped placeholder type used in validation/approvals checks. */
    private java.lang.Integer placeholderType;

    /* Id of FeedMapping used in validation/approvals checks. */
    private java.lang.Long feedMappingId;

    /* Validation status of feed item for a particular feed mapping. */
    private com.google.api.ads.adwords.axis.v201605.cm.FeedItemValidationStatus validationStatus;

    /* Feed item approval status. */
    private com.google.api.ads.adwords.axis.v201605.cm.FeedItemApprovalStatus approvalStatus;

    /* List of error codes specifying what errors were found during
     * validation. */
    private com.google.api.ads.adwords.axis.v201605.cm.FeedItemAttributeError[] validationErrors;

    public FeedItemPolicyData() {
    }

    public FeedItemPolicyData(
           com.google.api.ads.adwords.axis.v201605.cm.DisapprovalReason[] disapprovalReasons,
           java.lang.String policyDataType,
           java.lang.Integer placeholderType,
           java.lang.Long feedMappingId,
           com.google.api.ads.adwords.axis.v201605.cm.FeedItemValidationStatus validationStatus,
           com.google.api.ads.adwords.axis.v201605.cm.FeedItemApprovalStatus approvalStatus,
           com.google.api.ads.adwords.axis.v201605.cm.FeedItemAttributeError[] validationErrors) {
        super(
            disapprovalReasons,
            policyDataType);
        this.placeholderType = placeholderType;
        this.feedMappingId = feedMappingId;
        this.validationStatus = validationStatus;
        this.approvalStatus = approvalStatus;
        this.validationErrors = validationErrors;
    }


    /**
     * Gets the placeholderType value for this FeedItemPolicyData.
     * 
     * @return placeholderType   * Mapped placeholder type used in validation/approvals checks.
     */
    public java.lang.Integer getPlaceholderType() {
        return placeholderType;
    }


    /**
     * Sets the placeholderType value for this FeedItemPolicyData.
     * 
     * @param placeholderType   * Mapped placeholder type used in validation/approvals checks.
     */
    public void setPlaceholderType(java.lang.Integer placeholderType) {
        this.placeholderType = placeholderType;
    }


    /**
     * Gets the feedMappingId value for this FeedItemPolicyData.
     * 
     * @return feedMappingId   * Id of FeedMapping used in validation/approvals checks.
     */
    public java.lang.Long getFeedMappingId() {
        return feedMappingId;
    }


    /**
     * Sets the feedMappingId value for this FeedItemPolicyData.
     * 
     * @param feedMappingId   * Id of FeedMapping used in validation/approvals checks.
     */
    public void setFeedMappingId(java.lang.Long feedMappingId) {
        this.feedMappingId = feedMappingId;
    }


    /**
     * Gets the validationStatus value for this FeedItemPolicyData.
     * 
     * @return validationStatus   * Validation status of feed item for a particular feed mapping.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.FeedItemValidationStatus getValidationStatus() {
        return validationStatus;
    }


    /**
     * Sets the validationStatus value for this FeedItemPolicyData.
     * 
     * @param validationStatus   * Validation status of feed item for a particular feed mapping.
     */
    public void setValidationStatus(com.google.api.ads.adwords.axis.v201605.cm.FeedItemValidationStatus validationStatus) {
        this.validationStatus = validationStatus;
    }


    /**
     * Gets the approvalStatus value for this FeedItemPolicyData.
     * 
     * @return approvalStatus   * Feed item approval status.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.FeedItemApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this FeedItemPolicyData.
     * 
     * @param approvalStatus   * Feed item approval status.
     */
    public void setApprovalStatus(com.google.api.ads.adwords.axis.v201605.cm.FeedItemApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the validationErrors value for this FeedItemPolicyData.
     * 
     * @return validationErrors   * List of error codes specifying what errors were found during
     * validation.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.FeedItemAttributeError[] getValidationErrors() {
        return validationErrors;
    }


    /**
     * Sets the validationErrors value for this FeedItemPolicyData.
     * 
     * @param validationErrors   * List of error codes specifying what errors were found during
     * validation.
     */
    public void setValidationErrors(com.google.api.ads.adwords.axis.v201605.cm.FeedItemAttributeError[] validationErrors) {
        this.validationErrors = validationErrors;
    }

    public com.google.api.ads.adwords.axis.v201605.cm.FeedItemAttributeError getValidationErrors(int i) {
        return this.validationErrors[i];
    }

    public void setValidationErrors(int i, com.google.api.ads.adwords.axis.v201605.cm.FeedItemAttributeError _value) {
        this.validationErrors[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemPolicyData)) return false;
        FeedItemPolicyData other = (FeedItemPolicyData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.placeholderType==null && other.getPlaceholderType()==null) || 
             (this.placeholderType!=null &&
              this.placeholderType.equals(other.getPlaceholderType()))) &&
            ((this.feedMappingId==null && other.getFeedMappingId()==null) || 
             (this.feedMappingId!=null &&
              this.feedMappingId.equals(other.getFeedMappingId()))) &&
            ((this.validationStatus==null && other.getValidationStatus()==null) || 
             (this.validationStatus!=null &&
              this.validationStatus.equals(other.getValidationStatus()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus()))) &&
            ((this.validationErrors==null && other.getValidationErrors()==null) || 
             (this.validationErrors!=null &&
              java.util.Arrays.equals(this.validationErrors, other.getValidationErrors())));
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
        if (getPlaceholderType() != null) {
            _hashCode += getPlaceholderType().hashCode();
        }
        if (getFeedMappingId() != null) {
            _hashCode += getFeedMappingId().hashCode();
        }
        if (getValidationStatus() != null) {
            _hashCode += getValidationStatus().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        if (getValidationErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidationErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidationErrors(), i);
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
        new org.apache.axis.description.TypeDesc(FeedItemPolicyData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "FeedItemPolicyData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeholderType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "placeholderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedMappingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "feedMappingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "validationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "FeedItemValidationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "FeedItemApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "validationErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "FeedItemAttributeError"));
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

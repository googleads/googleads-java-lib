/**
 * FeedItemValidationDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Contains offline-validation and approval results for a given FeedItem
 * and FeedMapping. Each
 *             validation detail indicates any issues found on the feed
 * item when used in the context
 *             of the feed mapping.
 */
public class FeedItemValidationDetail  implements java.io.Serializable {
    /* Id of FeedMapping used in validation/approvals checks. */
    private java.lang.Long feedMappingId;

    /* Validation status of feed item for a particular feed mapping. */
    private com.google.api.ads.adwords.axis.v201309.cm.FeedItemValidationDetailValidationStatus validationStatus;

    /* List of error codes specifying what errors were found during
     * validation. */
    private com.google.api.ads.adwords.axis.v201309.cm.FeedItemAttributeError[] validationErrors;

    /* Approval status of feed item for a particular feed mapping. */
    private com.google.api.ads.adwords.axis.v201309.cm.FeedItemValidationDetailApprovalStatus approvalStatus;

    public FeedItemValidationDetail() {
    }

    public FeedItemValidationDetail(
           java.lang.Long feedMappingId,
           com.google.api.ads.adwords.axis.v201309.cm.FeedItemValidationDetailValidationStatus validationStatus,
           com.google.api.ads.adwords.axis.v201309.cm.FeedItemAttributeError[] validationErrors,
           com.google.api.ads.adwords.axis.v201309.cm.FeedItemValidationDetailApprovalStatus approvalStatus) {
           this.feedMappingId = feedMappingId;
           this.validationStatus = validationStatus;
           this.validationErrors = validationErrors;
           this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the feedMappingId value for this FeedItemValidationDetail.
     * 
     * @return feedMappingId   * Id of FeedMapping used in validation/approvals checks.
     */
    public java.lang.Long getFeedMappingId() {
        return feedMappingId;
    }


    /**
     * Sets the feedMappingId value for this FeedItemValidationDetail.
     * 
     * @param feedMappingId   * Id of FeedMapping used in validation/approvals checks.
     */
    public void setFeedMappingId(java.lang.Long feedMappingId) {
        this.feedMappingId = feedMappingId;
    }


    /**
     * Gets the validationStatus value for this FeedItemValidationDetail.
     * 
     * @return validationStatus   * Validation status of feed item for a particular feed mapping.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.FeedItemValidationDetailValidationStatus getValidationStatus() {
        return validationStatus;
    }


    /**
     * Sets the validationStatus value for this FeedItemValidationDetail.
     * 
     * @param validationStatus   * Validation status of feed item for a particular feed mapping.
     */
    public void setValidationStatus(com.google.api.ads.adwords.axis.v201309.cm.FeedItemValidationDetailValidationStatus validationStatus) {
        this.validationStatus = validationStatus;
    }


    /**
     * Gets the validationErrors value for this FeedItemValidationDetail.
     * 
     * @return validationErrors   * List of error codes specifying what errors were found during
     * validation.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.FeedItemAttributeError[] getValidationErrors() {
        return validationErrors;
    }


    /**
     * Sets the validationErrors value for this FeedItemValidationDetail.
     * 
     * @param validationErrors   * List of error codes specifying what errors were found during
     * validation.
     */
    public void setValidationErrors(com.google.api.ads.adwords.axis.v201309.cm.FeedItemAttributeError[] validationErrors) {
        this.validationErrors = validationErrors;
    }

    public com.google.api.ads.adwords.axis.v201309.cm.FeedItemAttributeError getValidationErrors(int i) {
        return this.validationErrors[i];
    }

    public void setValidationErrors(int i, com.google.api.ads.adwords.axis.v201309.cm.FeedItemAttributeError _value) {
        this.validationErrors[i] = _value;
    }


    /**
     * Gets the approvalStatus value for this FeedItemValidationDetail.
     * 
     * @return approvalStatus   * Approval status of feed item for a particular feed mapping.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.FeedItemValidationDetailApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this FeedItemValidationDetail.
     * 
     * @param approvalStatus   * Approval status of feed item for a particular feed mapping.
     */
    public void setApprovalStatus(com.google.api.ads.adwords.axis.v201309.cm.FeedItemValidationDetailApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemValidationDetail)) return false;
        FeedItemValidationDetail other = (FeedItemValidationDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedMappingId==null && other.getFeedMappingId()==null) || 
             (this.feedMappingId!=null &&
              this.feedMappingId.equals(other.getFeedMappingId()))) &&
            ((this.validationStatus==null && other.getValidationStatus()==null) || 
             (this.validationStatus!=null &&
              this.validationStatus.equals(other.getValidationStatus()))) &&
            ((this.validationErrors==null && other.getValidationErrors()==null) || 
             (this.validationErrors!=null &&
              java.util.Arrays.equals(this.validationErrors, other.getValidationErrors()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus())));
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
        if (getFeedMappingId() != null) {
            _hashCode += getFeedMappingId().hashCode();
        }
        if (getValidationStatus() != null) {
            _hashCode += getValidationStatus().hashCode();
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
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemValidationDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "FeedItemValidationDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedMappingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "feedMappingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "validationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "FeedItemValidationDetail.ValidationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "validationErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "FeedItemAttributeError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "FeedItemValidationDetail.ApprovalStatus"));
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

// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * FeedItemPolicyData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Contains offline-validation and approval results for a given FeedItem
 * and FeedMapping. Each
 *             validation data indicates any issues found on the feed
 * item when used in the context of the
 *             feed mapping.
 */
public class FeedItemPolicyData  extends com.google.api.ads.adwords.axis.v201802.cm.PolicyData  implements java.io.Serializable {
    /* Mapped placeholder type used in validation/approvals checks. */
    private java.lang.Integer placeholderType;

    /* Id of FeedMapping used in validation/approvals checks. */
    private java.lang.Long feedMappingId;

    /* Validation status of feed item for a particular feed mapping. */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemValidationStatus validationStatus;

    /* Feed item approval status. */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemApprovalStatus approvalStatus;

    /* List of error codes specifying what errors were found during
     * validation. */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeError[] validationErrors;

    /* Feed item quality evaluation approval status for a particular
     * feed mapping. */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemQualityApprovalStatus qualityApprovalStatus;

    /* Feed item quality evaluation disapproval reasons. */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedItemQualityDisapprovalReasons[] qualityDisapprovalReasons;

    public FeedItemPolicyData() {
    }

    public FeedItemPolicyData(
           com.google.api.ads.adwords.axis.v201802.cm.DisapprovalReason[] disapprovalReasons,
           java.lang.String policyDataType,
           java.lang.Integer placeholderType,
           java.lang.Long feedMappingId,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemValidationStatus validationStatus,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemApprovalStatus approvalStatus,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeError[] validationErrors,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemQualityApprovalStatus qualityApprovalStatus,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemQualityDisapprovalReasons[] qualityDisapprovalReasons) {
        super(
            disapprovalReasons,
            policyDataType);
        this.placeholderType = placeholderType;
        this.feedMappingId = feedMappingId;
        this.validationStatus = validationStatus;
        this.approvalStatus = approvalStatus;
        this.validationErrors = validationErrors;
        this.qualityApprovalStatus = qualityApprovalStatus;
        this.qualityDisapprovalReasons = qualityDisapprovalReasons;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("approvalStatus", getApprovalStatus())
            .add("disapprovalReasons", getDisapprovalReasons())
            .add("feedMappingId", getFeedMappingId())
            .add("placeholderType", getPlaceholderType())
            .add("policyDataType", getPolicyDataType())
            .add("qualityApprovalStatus", getQualityApprovalStatus())
            .add("qualityDisapprovalReasons", getQualityDisapprovalReasons())
            .add("validationErrors", getValidationErrors())
            .add("validationStatus", getValidationStatus())
            .toString();
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
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemValidationStatus getValidationStatus() {
        return validationStatus;
    }


    /**
     * Sets the validationStatus value for this FeedItemPolicyData.
     * 
     * @param validationStatus   * Validation status of feed item for a particular feed mapping.
     */
    public void setValidationStatus(com.google.api.ads.adwords.axis.v201802.cm.FeedItemValidationStatus validationStatus) {
        this.validationStatus = validationStatus;
    }


    /**
     * Gets the approvalStatus value for this FeedItemPolicyData.
     * 
     * @return approvalStatus   * Feed item approval status.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this FeedItemPolicyData.
     * 
     * @param approvalStatus   * Feed item approval status.
     */
    public void setApprovalStatus(com.google.api.ads.adwords.axis.v201802.cm.FeedItemApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the validationErrors value for this FeedItemPolicyData.
     * 
     * @return validationErrors   * List of error codes specifying what errors were found during
     * validation.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeError[] getValidationErrors() {
        return validationErrors;
    }


    /**
     * Sets the validationErrors value for this FeedItemPolicyData.
     * 
     * @param validationErrors   * List of error codes specifying what errors were found during
     * validation.
     */
    public void setValidationErrors(com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeError[] validationErrors) {
        this.validationErrors = validationErrors;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeError getValidationErrors(int i) {
        return this.validationErrors[i];
    }

    public void setValidationErrors(int i, com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeError _value) {
        this.validationErrors[i] = _value;
    }


    /**
     * Gets the qualityApprovalStatus value for this FeedItemPolicyData.
     * 
     * @return qualityApprovalStatus   * Feed item quality evaluation approval status for a particular
     * feed mapping.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemQualityApprovalStatus getQualityApprovalStatus() {
        return qualityApprovalStatus;
    }


    /**
     * Sets the qualityApprovalStatus value for this FeedItemPolicyData.
     * 
     * @param qualityApprovalStatus   * Feed item quality evaluation approval status for a particular
     * feed mapping.
     */
    public void setQualityApprovalStatus(com.google.api.ads.adwords.axis.v201802.cm.FeedItemQualityApprovalStatus qualityApprovalStatus) {
        this.qualityApprovalStatus = qualityApprovalStatus;
    }


    /**
     * Gets the qualityDisapprovalReasons value for this FeedItemPolicyData.
     * 
     * @return qualityDisapprovalReasons   * Feed item quality evaluation disapproval reasons.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemQualityDisapprovalReasons[] getQualityDisapprovalReasons() {
        return qualityDisapprovalReasons;
    }


    /**
     * Sets the qualityDisapprovalReasons value for this FeedItemPolicyData.
     * 
     * @param qualityDisapprovalReasons   * Feed item quality evaluation disapproval reasons.
     */
    public void setQualityDisapprovalReasons(com.google.api.ads.adwords.axis.v201802.cm.FeedItemQualityDisapprovalReasons[] qualityDisapprovalReasons) {
        this.qualityDisapprovalReasons = qualityDisapprovalReasons;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.FeedItemQualityDisapprovalReasons getQualityDisapprovalReasons(int i) {
        return this.qualityDisapprovalReasons[i];
    }

    public void setQualityDisapprovalReasons(int i, com.google.api.ads.adwords.axis.v201802.cm.FeedItemQualityDisapprovalReasons _value) {
        this.qualityDisapprovalReasons[i] = _value;
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
              java.util.Arrays.equals(this.validationErrors, other.getValidationErrors()))) &&
            ((this.qualityApprovalStatus==null && other.getQualityApprovalStatus()==null) || 
             (this.qualityApprovalStatus!=null &&
              this.qualityApprovalStatus.equals(other.getQualityApprovalStatus()))) &&
            ((this.qualityDisapprovalReasons==null && other.getQualityDisapprovalReasons()==null) || 
             (this.qualityDisapprovalReasons!=null &&
              java.util.Arrays.equals(this.qualityDisapprovalReasons, other.getQualityDisapprovalReasons())));
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
        if (getQualityApprovalStatus() != null) {
            _hashCode += getQualityApprovalStatus().hashCode();
        }
        if (getQualityDisapprovalReasons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQualityDisapprovalReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQualityDisapprovalReasons(), i);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemPolicyData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeholderType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "placeholderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedMappingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedMappingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "validationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemValidationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "validationErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemAttributeError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualityApprovalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "qualityApprovalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemQualityApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualityDisapprovalReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "qualityDisapprovalReasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemQualityDisapprovalReasons"));
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

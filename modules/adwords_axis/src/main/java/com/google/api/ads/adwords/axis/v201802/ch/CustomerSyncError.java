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
 * CustomerSyncError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.ch;


/**
 * Represents CustomerSyncService specific errors
 */
public class CustomerSyncError  extends com.google.api.ads.adwords.axis.v201802.cm.ApiError  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201802.ch.CustomerSyncErrorReason reason;

    private java.lang.Long campaignId;

    public CustomerSyncError() {
    }

    public CustomerSyncError(
           java.lang.String fieldPath,
           com.google.api.ads.adwords.axis.v201802.cm.FieldPathElement[] fieldPathElements,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.adwords.axis.v201802.ch.CustomerSyncErrorReason reason,
           java.lang.Long campaignId) {
        super(
            fieldPath,
            fieldPathElements,
            trigger,
            errorString,
            apiErrorType);
        this.reason = reason;
        this.campaignId = campaignId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("apiErrorType", getApiErrorType())
            .add("campaignId", getCampaignId())
            .add("errorString", getErrorString())
            .add("fieldPath", getFieldPath())
            .add("fieldPathElements", getFieldPathElements())
            .add("reason", getReason())
            .add("trigger", getTrigger())
            .toString();
    }

    /**
     * Gets the reason value for this CustomerSyncError.
     * 
     * @return reason
     */
    public com.google.api.ads.adwords.axis.v201802.ch.CustomerSyncErrorReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this CustomerSyncError.
     * 
     * @param reason
     */
    public void setReason(com.google.api.ads.adwords.axis.v201802.ch.CustomerSyncErrorReason reason) {
        this.reason = reason;
    }


    /**
     * Gets the campaignId value for this CustomerSyncError.
     * 
     * @return campaignId
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CustomerSyncError.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerSyncError)) return false;
        CustomerSyncError other = (CustomerSyncError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId())));
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
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerSyncError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "CustomerSyncError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "CustomerSyncError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

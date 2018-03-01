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
 * FeedAttributeReferenceError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * An error indicating a problem with a reference to a feed attribute
 * in an ad.
 */
public class FeedAttributeReferenceError  extends com.google.api.ads.adwords.axis.v201802.cm.ApiError  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201802.cm.FeedAttributeReferenceErrorReason reason;

    /* The referenced feed name. */
    private java.lang.String feedName;

    /* The referenced feed attribute name. */
    private java.lang.String feedAttributeName;

    public FeedAttributeReferenceError() {
    }

    public FeedAttributeReferenceError(
           java.lang.String fieldPath,
           com.google.api.ads.adwords.axis.v201802.cm.FieldPathElement[] fieldPathElements,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.adwords.axis.v201802.cm.FeedAttributeReferenceErrorReason reason,
           java.lang.String feedName,
           java.lang.String feedAttributeName) {
        super(
            fieldPath,
            fieldPathElements,
            trigger,
            errorString,
            apiErrorType);
        this.reason = reason;
        this.feedName = feedName;
        this.feedAttributeName = feedAttributeName;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("apiErrorType", getApiErrorType())
            .add("errorString", getErrorString())
            .add("feedAttributeName", getFeedAttributeName())
            .add("feedName", getFeedName())
            .add("fieldPath", getFieldPath())
            .add("fieldPathElements", getFieldPathElements())
            .add("reason", getReason())
            .add("trigger", getTrigger())
            .toString();
    }

    /**
     * Gets the reason value for this FeedAttributeReferenceError.
     * 
     * @return reason
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedAttributeReferenceErrorReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this FeedAttributeReferenceError.
     * 
     * @param reason
     */
    public void setReason(com.google.api.ads.adwords.axis.v201802.cm.FeedAttributeReferenceErrorReason reason) {
        this.reason = reason;
    }


    /**
     * Gets the feedName value for this FeedAttributeReferenceError.
     * 
     * @return feedName   * The referenced feed name.
     */
    public java.lang.String getFeedName() {
        return feedName;
    }


    /**
     * Sets the feedName value for this FeedAttributeReferenceError.
     * 
     * @param feedName   * The referenced feed name.
     */
    public void setFeedName(java.lang.String feedName) {
        this.feedName = feedName;
    }


    /**
     * Gets the feedAttributeName value for this FeedAttributeReferenceError.
     * 
     * @return feedAttributeName   * The referenced feed attribute name.
     */
    public java.lang.String getFeedAttributeName() {
        return feedAttributeName;
    }


    /**
     * Sets the feedAttributeName value for this FeedAttributeReferenceError.
     * 
     * @param feedAttributeName   * The referenced feed attribute name.
     */
    public void setFeedAttributeName(java.lang.String feedAttributeName) {
        this.feedAttributeName = feedAttributeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedAttributeReferenceError)) return false;
        FeedAttributeReferenceError other = (FeedAttributeReferenceError) obj;
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
            ((this.feedName==null && other.getFeedName()==null) || 
             (this.feedName!=null &&
              this.feedName.equals(other.getFeedName()))) &&
            ((this.feedAttributeName==null && other.getFeedAttributeName()==null) || 
             (this.feedAttributeName!=null &&
              this.feedAttributeName.equals(other.getFeedAttributeName())));
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
        if (getFeedName() != null) {
            _hashCode += getFeedName().hashCode();
        }
        if (getFeedAttributeName() != null) {
            _hashCode += getFeedAttributeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedAttributeReferenceError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedAttributeReferenceError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedAttributeReferenceError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedAttributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedAttributeName"));
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

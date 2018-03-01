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
 * RateExceededError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Signals that a call failed because a measured rate exceeded.
 */
public class RateExceededError  extends com.google.api.ads.adwords.axis.v201802.cm.ApiError  implements java.io.Serializable {
    /* The error reason represented by an enum. */
    private com.google.api.ads.adwords.axis.v201802.cm.RateExceededErrorReason reason;

    /* Cause of the rate exceeded error. */
    private java.lang.String rateName;

    /* The scope of the rate (ACCOUNT/DEVELOPER). */
    private java.lang.String rateScope;

    /* The amount of time (in seconds) the client should wait before
     * retrying the request. */
    private java.lang.Integer retryAfterSeconds;

    public RateExceededError() {
    }

    public RateExceededError(
           java.lang.String fieldPath,
           com.google.api.ads.adwords.axis.v201802.cm.FieldPathElement[] fieldPathElements,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.adwords.axis.v201802.cm.RateExceededErrorReason reason,
           java.lang.String rateName,
           java.lang.String rateScope,
           java.lang.Integer retryAfterSeconds) {
        super(
            fieldPath,
            fieldPathElements,
            trigger,
            errorString,
            apiErrorType);
        this.reason = reason;
        this.rateName = rateName;
        this.rateScope = rateScope;
        this.retryAfterSeconds = retryAfterSeconds;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("apiErrorType", getApiErrorType())
            .add("errorString", getErrorString())
            .add("fieldPath", getFieldPath())
            .add("fieldPathElements", getFieldPathElements())
            .add("rateName", getRateName())
            .add("rateScope", getRateScope())
            .add("reason", getReason())
            .add("retryAfterSeconds", getRetryAfterSeconds())
            .add("trigger", getTrigger())
            .toString();
    }

    /**
     * Gets the reason value for this RateExceededError.
     * 
     * @return reason   * The error reason represented by an enum.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.RateExceededErrorReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this RateExceededError.
     * 
     * @param reason   * The error reason represented by an enum.
     */
    public void setReason(com.google.api.ads.adwords.axis.v201802.cm.RateExceededErrorReason reason) {
        this.reason = reason;
    }


    /**
     * Gets the rateName value for this RateExceededError.
     * 
     * @return rateName   * Cause of the rate exceeded error.
     */
    public java.lang.String getRateName() {
        return rateName;
    }


    /**
     * Sets the rateName value for this RateExceededError.
     * 
     * @param rateName   * Cause of the rate exceeded error.
     */
    public void setRateName(java.lang.String rateName) {
        this.rateName = rateName;
    }


    /**
     * Gets the rateScope value for this RateExceededError.
     * 
     * @return rateScope   * The scope of the rate (ACCOUNT/DEVELOPER).
     */
    public java.lang.String getRateScope() {
        return rateScope;
    }


    /**
     * Sets the rateScope value for this RateExceededError.
     * 
     * @param rateScope   * The scope of the rate (ACCOUNT/DEVELOPER).
     */
    public void setRateScope(java.lang.String rateScope) {
        this.rateScope = rateScope;
    }


    /**
     * Gets the retryAfterSeconds value for this RateExceededError.
     * 
     * @return retryAfterSeconds   * The amount of time (in seconds) the client should wait before
     * retrying the request.
     */
    public java.lang.Integer getRetryAfterSeconds() {
        return retryAfterSeconds;
    }


    /**
     * Sets the retryAfterSeconds value for this RateExceededError.
     * 
     * @param retryAfterSeconds   * The amount of time (in seconds) the client should wait before
     * retrying the request.
     */
    public void setRetryAfterSeconds(java.lang.Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RateExceededError)) return false;
        RateExceededError other = (RateExceededError) obj;
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
            ((this.rateName==null && other.getRateName()==null) || 
             (this.rateName!=null &&
              this.rateName.equals(other.getRateName()))) &&
            ((this.rateScope==null && other.getRateScope()==null) || 
             (this.rateScope!=null &&
              this.rateScope.equals(other.getRateScope()))) &&
            ((this.retryAfterSeconds==null && other.getRetryAfterSeconds()==null) || 
             (this.retryAfterSeconds!=null &&
              this.retryAfterSeconds.equals(other.getRetryAfterSeconds())));
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
        if (getRateName() != null) {
            _hashCode += getRateName().hashCode();
        }
        if (getRateScope() != null) {
            _hashCode += getRateScope().hashCode();
        }
        if (getRetryAfterSeconds() != null) {
            _hashCode += getRetryAfterSeconds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RateExceededError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RateExceededError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RateExceededError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "rateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateScope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "rateScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryAfterSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "retryAfterSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

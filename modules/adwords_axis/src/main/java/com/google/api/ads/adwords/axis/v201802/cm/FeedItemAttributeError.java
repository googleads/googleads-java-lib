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
 * FeedItemAttributeError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Contains validation error details for a set of feed attributes.
 */
public class FeedItemAttributeError  implements java.io.Serializable {
    /* Contains the set of feed attribute ids whose attributes together
     * triggered the error.
     *                 Null or empty field means error code does not apply
     * to a specific set of attributes. */
    private long[] feedAttributeIds;

    /* Validation error code. See the
     *                 <a href="/adwords/api/docs/appendix/feed-errors">list
     * of error codes</a>. */
    private java.lang.Integer validationErrorCode;

    /* Extra information about the error, including related field
     * IDs. */
    private java.lang.String errorInformation;

    public FeedItemAttributeError() {
    }

    public FeedItemAttributeError(
           long[] feedAttributeIds,
           java.lang.Integer validationErrorCode,
           java.lang.String errorInformation) {
           this.feedAttributeIds = feedAttributeIds;
           this.validationErrorCode = validationErrorCode;
           this.errorInformation = errorInformation;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("errorInformation", getErrorInformation())
            .add("feedAttributeIds", getFeedAttributeIds())
            .add("validationErrorCode", getValidationErrorCode())
            .toString();
    }

    /**
     * Gets the feedAttributeIds value for this FeedItemAttributeError.
     * 
     * @return feedAttributeIds   * Contains the set of feed attribute ids whose attributes together
     * triggered the error.
     *                 Null or empty field means error code does not apply
     * to a specific set of attributes.
     */
    public long[] getFeedAttributeIds() {
        return feedAttributeIds;
    }


    /**
     * Sets the feedAttributeIds value for this FeedItemAttributeError.
     * 
     * @param feedAttributeIds   * Contains the set of feed attribute ids whose attributes together
     * triggered the error.
     *                 Null or empty field means error code does not apply
     * to a specific set of attributes.
     */
    public void setFeedAttributeIds(long[] feedAttributeIds) {
        this.feedAttributeIds = feedAttributeIds;
    }

    public long getFeedAttributeIds(int i) {
        return this.feedAttributeIds[i];
    }

    public void setFeedAttributeIds(int i, long _value) {
        this.feedAttributeIds[i] = _value;
    }


    /**
     * Gets the validationErrorCode value for this FeedItemAttributeError.
     * 
     * @return validationErrorCode   * Validation error code. See the
     *                 <a href="/adwords/api/docs/appendix/feed-errors">list
     * of error codes</a>.
     */
    public java.lang.Integer getValidationErrorCode() {
        return validationErrorCode;
    }


    /**
     * Sets the validationErrorCode value for this FeedItemAttributeError.
     * 
     * @param validationErrorCode   * Validation error code. See the
     *                 <a href="/adwords/api/docs/appendix/feed-errors">list
     * of error codes</a>.
     */
    public void setValidationErrorCode(java.lang.Integer validationErrorCode) {
        this.validationErrorCode = validationErrorCode;
    }


    /**
     * Gets the errorInformation value for this FeedItemAttributeError.
     * 
     * @return errorInformation   * Extra information about the error, including related field
     * IDs.
     */
    public java.lang.String getErrorInformation() {
        return errorInformation;
    }


    /**
     * Sets the errorInformation value for this FeedItemAttributeError.
     * 
     * @param errorInformation   * Extra information about the error, including related field
     * IDs.
     */
    public void setErrorInformation(java.lang.String errorInformation) {
        this.errorInformation = errorInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemAttributeError)) return false;
        FeedItemAttributeError other = (FeedItemAttributeError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedAttributeIds==null && other.getFeedAttributeIds()==null) || 
             (this.feedAttributeIds!=null &&
              java.util.Arrays.equals(this.feedAttributeIds, other.getFeedAttributeIds()))) &&
            ((this.validationErrorCode==null && other.getValidationErrorCode()==null) || 
             (this.validationErrorCode!=null &&
              this.validationErrorCode.equals(other.getValidationErrorCode()))) &&
            ((this.errorInformation==null && other.getErrorInformation()==null) || 
             (this.errorInformation!=null &&
              this.errorInformation.equals(other.getErrorInformation())));
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
        if (getFeedAttributeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedAttributeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedAttributeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValidationErrorCode() != null) {
            _hashCode += getValidationErrorCode().hashCode();
        }
        if (getErrorInformation() != null) {
            _hashCode += getErrorInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemAttributeError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemAttributeError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedAttributeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedAttributeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "validationErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "errorInformation"));
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

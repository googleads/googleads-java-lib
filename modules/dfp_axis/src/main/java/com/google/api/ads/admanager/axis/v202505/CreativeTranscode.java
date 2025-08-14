// Copyright 2025 Google LLC
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
 * CreativeTranscode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;


/**
 * Contains information needed to identify a Truman creative transcode.
 */
public class CreativeTranscode  implements java.io.Serializable {
    /* The ad system that the creative is associated with. */
    private java.lang.String adServer;

    /* The {@link IdType} that describes the type of {@code creativeId}. */
    private com.google.api.ads.admanager.axis.v202505.CreativeTranscodeIdType creativeIdType;

    /* An ID (either an ad ID, a creative ID, or a concatenation of
     * the two) that identifies a
     *                 creative. */
    private java.lang.String creativeId;

    public CreativeTranscode() {
    }

    public CreativeTranscode(
           java.lang.String adServer,
           com.google.api.ads.admanager.axis.v202505.CreativeTranscodeIdType creativeIdType,
           java.lang.String creativeId) {
           this.adServer = adServer;
           this.creativeIdType = creativeIdType;
           this.creativeId = creativeId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adServer", getAdServer())
            .add("creativeId", getCreativeId())
            .add("creativeIdType", getCreativeIdType())
            .toString();
    }

    /**
     * Gets the adServer value for this CreativeTranscode.
     * 
     * @return adServer   * The ad system that the creative is associated with.
     */
    public java.lang.String getAdServer() {
        return adServer;
    }


    /**
     * Sets the adServer value for this CreativeTranscode.
     * 
     * @param adServer   * The ad system that the creative is associated with.
     */
    public void setAdServer(java.lang.String adServer) {
        this.adServer = adServer;
    }


    /**
     * Gets the creativeIdType value for this CreativeTranscode.
     * 
     * @return creativeIdType   * The {@link IdType} that describes the type of {@code creativeId}.
     */
    public com.google.api.ads.admanager.axis.v202505.CreativeTranscodeIdType getCreativeIdType() {
        return creativeIdType;
    }


    /**
     * Sets the creativeIdType value for this CreativeTranscode.
     * 
     * @param creativeIdType   * The {@link IdType} that describes the type of {@code creativeId}.
     */
    public void setCreativeIdType(com.google.api.ads.admanager.axis.v202505.CreativeTranscodeIdType creativeIdType) {
        this.creativeIdType = creativeIdType;
    }


    /**
     * Gets the creativeId value for this CreativeTranscode.
     * 
     * @return creativeId   * An ID (either an ad ID, a creative ID, or a concatenation of
     * the two) that identifies a
     *                 creative.
     */
    public java.lang.String getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this CreativeTranscode.
     * 
     * @param creativeId   * An ID (either an ad ID, a creative ID, or a concatenation of
     * the two) that identifies a
     *                 creative.
     */
    public void setCreativeId(java.lang.String creativeId) {
        this.creativeId = creativeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeTranscode)) return false;
        CreativeTranscode other = (CreativeTranscode) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adServer==null && other.getAdServer()==null) || 
             (this.adServer!=null &&
              this.adServer.equals(other.getAdServer()))) &&
            ((this.creativeIdType==null && other.getCreativeIdType()==null) || 
             (this.creativeIdType!=null &&
              this.creativeIdType.equals(other.getCreativeIdType()))) &&
            ((this.creativeId==null && other.getCreativeId()==null) || 
             (this.creativeId!=null &&
              this.creativeId.equals(other.getCreativeId())));
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
        if (getAdServer() != null) {
            _hashCode += getAdServer().hashCode();
        }
        if (getCreativeIdType() != null) {
            _hashCode += getCreativeIdType().hashCode();
        }
        if (getCreativeId() != null) {
            _hashCode += getCreativeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeTranscode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "CreativeTranscode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adServer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "adServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "creativeIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "CreativeTranscode.IdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "creativeId"));
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

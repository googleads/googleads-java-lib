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
 * CreativeNativeStylePreview.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents the {@link NativeStyle} of a {@link Creative} and its
 * corresponding preview URL.
 */
public class CreativeNativeStylePreview  implements java.io.Serializable {
    /* The id of the {@link NativeStyle}. */
    private java.lang.Long nativeStyleId;

    /* The URL for previewing this creative using this particular
     * {@link NativeStyle} */
    private java.lang.String previewUrl;

    public CreativeNativeStylePreview() {
    }

    public CreativeNativeStylePreview(
           java.lang.Long nativeStyleId,
           java.lang.String previewUrl) {
           this.nativeStyleId = nativeStyleId;
           this.previewUrl = previewUrl;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("nativeStyleId", getNativeStyleId())
            .add("previewUrl", getPreviewUrl())
            .toString();
    }

    /**
     * Gets the nativeStyleId value for this CreativeNativeStylePreview.
     * 
     * @return nativeStyleId   * The id of the {@link NativeStyle}.
     */
    public java.lang.Long getNativeStyleId() {
        return nativeStyleId;
    }


    /**
     * Sets the nativeStyleId value for this CreativeNativeStylePreview.
     * 
     * @param nativeStyleId   * The id of the {@link NativeStyle}.
     */
    public void setNativeStyleId(java.lang.Long nativeStyleId) {
        this.nativeStyleId = nativeStyleId;
    }


    /**
     * Gets the previewUrl value for this CreativeNativeStylePreview.
     * 
     * @return previewUrl   * The URL for previewing this creative using this particular
     * {@link NativeStyle}
     */
    public java.lang.String getPreviewUrl() {
        return previewUrl;
    }


    /**
     * Sets the previewUrl value for this CreativeNativeStylePreview.
     * 
     * @param previewUrl   * The URL for previewing this creative using this particular
     * {@link NativeStyle}
     */
    public void setPreviewUrl(java.lang.String previewUrl) {
        this.previewUrl = previewUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeNativeStylePreview)) return false;
        CreativeNativeStylePreview other = (CreativeNativeStylePreview) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nativeStyleId==null && other.getNativeStyleId()==null) || 
             (this.nativeStyleId!=null &&
              this.nativeStyleId.equals(other.getNativeStyleId()))) &&
            ((this.previewUrl==null && other.getPreviewUrl()==null) || 
             (this.previewUrl!=null &&
              this.previewUrl.equals(other.getPreviewUrl())));
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
        if (getNativeStyleId() != null) {
            _hashCode += getNativeStyleId().hashCode();
        }
        if (getPreviewUrl() != null) {
            _hashCode += getPreviewUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeNativeStylePreview.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeNativeStylePreview"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeStyleId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "nativeStyleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "previewUrl"));
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

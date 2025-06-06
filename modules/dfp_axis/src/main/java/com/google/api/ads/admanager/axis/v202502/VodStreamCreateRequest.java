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
 * VodStreamCreateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;

public class VodStreamCreateRequest  extends com.google.api.ads.admanager.axis.v202502.StreamCreateRequest  implements java.io.Serializable {
    private java.lang.Long contentSourceId;

    private java.lang.String videoId;

    private java.lang.Long contentId;

    private java.lang.String contentName;

    private long[] cuePoints;

    public VodStreamCreateRequest() {
    }

    public VodStreamCreateRequest(
           java.lang.String url,
           java.lang.String userAgent,
           com.google.api.ads.admanager.axis.v202502.ReportingType reportingType,
           java.lang.Long contentSourceId,
           java.lang.String videoId,
           java.lang.Long contentId,
           java.lang.String contentName,
           long[] cuePoints) {
        super(
            url,
            userAgent,
            reportingType);
        this.contentSourceId = contentSourceId;
        this.videoId = videoId;
        this.contentId = contentId;
        this.contentName = contentName;
        this.cuePoints = cuePoints;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("contentId", getContentId())
            .add("contentName", getContentName())
            .add("contentSourceId", getContentSourceId())
            .add("cuePoints", getCuePoints())
            .add("reportingType", getReportingType())
            .add("url", getUrl())
            .add("userAgent", getUserAgent())
            .add("videoId", getVideoId())
            .toString();
    }

    /**
     * Gets the contentSourceId value for this VodStreamCreateRequest.
     * 
     * @return contentSourceId
     */
    public java.lang.Long getContentSourceId() {
        return contentSourceId;
    }


    /**
     * Sets the contentSourceId value for this VodStreamCreateRequest.
     * 
     * @param contentSourceId
     */
    public void setContentSourceId(java.lang.Long contentSourceId) {
        this.contentSourceId = contentSourceId;
    }


    /**
     * Gets the videoId value for this VodStreamCreateRequest.
     * 
     * @return videoId
     */
    public java.lang.String getVideoId() {
        return videoId;
    }


    /**
     * Sets the videoId value for this VodStreamCreateRequest.
     * 
     * @param videoId
     */
    public void setVideoId(java.lang.String videoId) {
        this.videoId = videoId;
    }


    /**
     * Gets the contentId value for this VodStreamCreateRequest.
     * 
     * @return contentId
     */
    public java.lang.Long getContentId() {
        return contentId;
    }


    /**
     * Sets the contentId value for this VodStreamCreateRequest.
     * 
     * @param contentId
     */
    public void setContentId(java.lang.Long contentId) {
        this.contentId = contentId;
    }


    /**
     * Gets the contentName value for this VodStreamCreateRequest.
     * 
     * @return contentName
     */
    public java.lang.String getContentName() {
        return contentName;
    }


    /**
     * Sets the contentName value for this VodStreamCreateRequest.
     * 
     * @param contentName
     */
    public void setContentName(java.lang.String contentName) {
        this.contentName = contentName;
    }


    /**
     * Gets the cuePoints value for this VodStreamCreateRequest.
     * 
     * @return cuePoints
     */
    public long[] getCuePoints() {
        return cuePoints;
    }


    /**
     * Sets the cuePoints value for this VodStreamCreateRequest.
     * 
     * @param cuePoints
     */
    public void setCuePoints(long[] cuePoints) {
        this.cuePoints = cuePoints;
    }

    public long getCuePoints(int i) {
        return this.cuePoints[i];
    }

    public void setCuePoints(int i, long _value) {
        this.cuePoints[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VodStreamCreateRequest)) return false;
        VodStreamCreateRequest other = (VodStreamCreateRequest) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contentSourceId==null && other.getContentSourceId()==null) || 
             (this.contentSourceId!=null &&
              this.contentSourceId.equals(other.getContentSourceId()))) &&
            ((this.videoId==null && other.getVideoId()==null) || 
             (this.videoId!=null &&
              this.videoId.equals(other.getVideoId()))) &&
            ((this.contentId==null && other.getContentId()==null) || 
             (this.contentId!=null &&
              this.contentId.equals(other.getContentId()))) &&
            ((this.contentName==null && other.getContentName()==null) || 
             (this.contentName!=null &&
              this.contentName.equals(other.getContentName()))) &&
            ((this.cuePoints==null && other.getCuePoints()==null) || 
             (this.cuePoints!=null &&
              java.util.Arrays.equals(this.cuePoints, other.getCuePoints())));
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
        if (getContentSourceId() != null) {
            _hashCode += getContentSourceId().hashCode();
        }
        if (getVideoId() != null) {
            _hashCode += getVideoId().hashCode();
        }
        if (getContentId() != null) {
            _hashCode += getContentId().hashCode();
        }
        if (getContentName() != null) {
            _hashCode += getContentName().hashCode();
        }
        if (getCuePoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCuePoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCuePoints(), i);
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
        new org.apache.axis.description.TypeDesc(VodStreamCreateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "VodStreamCreateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentSourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "contentSourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "videoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "contentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "contentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuePoints");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "cuePoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

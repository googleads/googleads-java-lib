// Copyright 2023 Google LLC
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
 * Slate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;


/**
 * A {@code Slate} encapsulates all the information necessary to represent
 * a Slate entity, the video
 *             creative used by Dynamic Ad Insertion to fill vacant ad
 * slots.
 */
public class Slate  implements java.io.Serializable {
    /* The unique ID of the {@code Slate}. This value is read-only
     * and is assigned by Google. */
    private java.lang.Long id;

    /* The name of the {@code Slate}. This value is required to create
     * a slate and has a maximum
     *                 length of 255 characters. */
    private java.lang.String name;

    /* The status of this {@code Slate}. This attribute is read-only
     * and is assigned by Google. Slates
     *                 are created in the {@link SlateStatus#ACTIVE} state. */
    private com.google.api.ads.admanager.axis.v202308.SlateStatus status;

    /* Server side transcoding status of the current slate. */
    private com.google.api.ads.admanager.axis.v202308.TranscodeStatus transcodeStatus;

    /* The location of the original asset if publisher provided and
     * slate is externally hosted. */
    private java.lang.String videoSourceUrl;

    /* The date and time this slate was last modified. */
    private com.google.api.ads.admanager.axis.v202308.DateTime lastModifiedDateTime;

    public Slate() {
    }

    public Slate(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202308.SlateStatus status,
           com.google.api.ads.admanager.axis.v202308.TranscodeStatus transcodeStatus,
           java.lang.String videoSourceUrl,
           com.google.api.ads.admanager.axis.v202308.DateTime lastModifiedDateTime) {
           this.id = id;
           this.name = name;
           this.status = status;
           this.transcodeStatus = transcodeStatus;
           this.videoSourceUrl = videoSourceUrl;
           this.lastModifiedDateTime = lastModifiedDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("status", getStatus())
            .add("transcodeStatus", getTranscodeStatus())
            .add("videoSourceUrl", getVideoSourceUrl())
            .toString();
    }

    /**
     * Gets the id value for this Slate.
     * 
     * @return id   * The unique ID of the {@code Slate}. This value is read-only
     * and is assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Slate.
     * 
     * @param id   * The unique ID of the {@code Slate}. This value is read-only
     * and is assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Slate.
     * 
     * @return name   * The name of the {@code Slate}. This value is required to create
     * a slate and has a maximum
     *                 length of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Slate.
     * 
     * @param name   * The name of the {@code Slate}. This value is required to create
     * a slate and has a maximum
     *                 length of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this Slate.
     * 
     * @return status   * The status of this {@code Slate}. This attribute is read-only
     * and is assigned by Google. Slates
     *                 are created in the {@link SlateStatus#ACTIVE} state.
     */
    public com.google.api.ads.admanager.axis.v202308.SlateStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Slate.
     * 
     * @param status   * The status of this {@code Slate}. This attribute is read-only
     * and is assigned by Google. Slates
     *                 are created in the {@link SlateStatus#ACTIVE} state.
     */
    public void setStatus(com.google.api.ads.admanager.axis.v202308.SlateStatus status) {
        this.status = status;
    }


    /**
     * Gets the transcodeStatus value for this Slate.
     * 
     * @return transcodeStatus   * Server side transcoding status of the current slate.
     */
    public com.google.api.ads.admanager.axis.v202308.TranscodeStatus getTranscodeStatus() {
        return transcodeStatus;
    }


    /**
     * Sets the transcodeStatus value for this Slate.
     * 
     * @param transcodeStatus   * Server side transcoding status of the current slate.
     */
    public void setTranscodeStatus(com.google.api.ads.admanager.axis.v202308.TranscodeStatus transcodeStatus) {
        this.transcodeStatus = transcodeStatus;
    }


    /**
     * Gets the videoSourceUrl value for this Slate.
     * 
     * @return videoSourceUrl   * The location of the original asset if publisher provided and
     * slate is externally hosted.
     */
    public java.lang.String getVideoSourceUrl() {
        return videoSourceUrl;
    }


    /**
     * Sets the videoSourceUrl value for this Slate.
     * 
     * @param videoSourceUrl   * The location of the original asset if publisher provided and
     * slate is externally hosted.
     */
    public void setVideoSourceUrl(java.lang.String videoSourceUrl) {
        this.videoSourceUrl = videoSourceUrl;
    }


    /**
     * Gets the lastModifiedDateTime value for this Slate.
     * 
     * @return lastModifiedDateTime   * The date and time this slate was last modified.
     */
    public com.google.api.ads.admanager.axis.v202308.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Slate.
     * 
     * @param lastModifiedDateTime   * The date and time this slate was last modified.
     */
    public void setLastModifiedDateTime(com.google.api.ads.admanager.axis.v202308.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Slate)) return false;
        Slate other = (Slate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.transcodeStatus==null && other.getTranscodeStatus()==null) || 
             (this.transcodeStatus!=null &&
              this.transcodeStatus.equals(other.getTranscodeStatus()))) &&
            ((this.videoSourceUrl==null && other.getVideoSourceUrl()==null) || 
             (this.videoSourceUrl!=null &&
              this.videoSourceUrl.equals(other.getVideoSourceUrl()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTranscodeStatus() != null) {
            _hashCode += getTranscodeStatus().hashCode();
        }
        if (getVideoSourceUrl() != null) {
            _hashCode += getVideoSourceUrl().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Slate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "Slate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "SlateStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transcodeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "transcodeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "TranscodeStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoSourceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "videoSourceUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "DateTime"));
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

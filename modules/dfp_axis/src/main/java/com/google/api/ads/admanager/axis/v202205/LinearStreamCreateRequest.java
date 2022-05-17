// Copyright 2022 Google LLC
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
 * LinearStreamCreateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202205;

public class LinearStreamCreateRequest  extends com.google.api.ads.admanager.axis.v202205.StreamCreateRequest  implements java.io.Serializable {
    private java.lang.String liveStreamEventAssetKey;

    private java.lang.String eventName;

    private java.lang.Long liveStreamEventId;

    private com.google.api.ads.admanager.axis.v202205.DateTime eventStartDateTime;

    private com.google.api.ads.admanager.axis.v202205.DateTime eventEndDateTime;

    private java.lang.Boolean prefetchEnabled;

    public LinearStreamCreateRequest() {
    }

    public LinearStreamCreateRequest(
           java.lang.String url,
           java.lang.String userAgent,
           com.google.api.ads.admanager.axis.v202205.ReportingType reportingType,
           java.lang.String liveStreamEventAssetKey,
           java.lang.String eventName,
           java.lang.Long liveStreamEventId,
           com.google.api.ads.admanager.axis.v202205.DateTime eventStartDateTime,
           com.google.api.ads.admanager.axis.v202205.DateTime eventEndDateTime,
           java.lang.Boolean prefetchEnabled) {
        super(
            url,
            userAgent,
            reportingType);
        this.liveStreamEventAssetKey = liveStreamEventAssetKey;
        this.eventName = eventName;
        this.liveStreamEventId = liveStreamEventId;
        this.eventStartDateTime = eventStartDateTime;
        this.eventEndDateTime = eventEndDateTime;
        this.prefetchEnabled = prefetchEnabled;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("eventEndDateTime", getEventEndDateTime())
            .add("eventName", getEventName())
            .add("eventStartDateTime", getEventStartDateTime())
            .add("liveStreamEventAssetKey", getLiveStreamEventAssetKey())
            .add("liveStreamEventId", getLiveStreamEventId())
            .add("prefetchEnabled", getPrefetchEnabled())
            .add("reportingType", getReportingType())
            .add("url", getUrl())
            .add("userAgent", getUserAgent())
            .toString();
    }

    /**
     * Gets the liveStreamEventAssetKey value for this LinearStreamCreateRequest.
     * 
     * @return liveStreamEventAssetKey
     */
    public java.lang.String getLiveStreamEventAssetKey() {
        return liveStreamEventAssetKey;
    }


    /**
     * Sets the liveStreamEventAssetKey value for this LinearStreamCreateRequest.
     * 
     * @param liveStreamEventAssetKey
     */
    public void setLiveStreamEventAssetKey(java.lang.String liveStreamEventAssetKey) {
        this.liveStreamEventAssetKey = liveStreamEventAssetKey;
    }


    /**
     * Gets the eventName value for this LinearStreamCreateRequest.
     * 
     * @return eventName
     */
    public java.lang.String getEventName() {
        return eventName;
    }


    /**
     * Sets the eventName value for this LinearStreamCreateRequest.
     * 
     * @param eventName
     */
    public void setEventName(java.lang.String eventName) {
        this.eventName = eventName;
    }


    /**
     * Gets the liveStreamEventId value for this LinearStreamCreateRequest.
     * 
     * @return liveStreamEventId
     */
    public java.lang.Long getLiveStreamEventId() {
        return liveStreamEventId;
    }


    /**
     * Sets the liveStreamEventId value for this LinearStreamCreateRequest.
     * 
     * @param liveStreamEventId
     */
    public void setLiveStreamEventId(java.lang.Long liveStreamEventId) {
        this.liveStreamEventId = liveStreamEventId;
    }


    /**
     * Gets the eventStartDateTime value for this LinearStreamCreateRequest.
     * 
     * @return eventStartDateTime
     */
    public com.google.api.ads.admanager.axis.v202205.DateTime getEventStartDateTime() {
        return eventStartDateTime;
    }


    /**
     * Sets the eventStartDateTime value for this LinearStreamCreateRequest.
     * 
     * @param eventStartDateTime
     */
    public void setEventStartDateTime(com.google.api.ads.admanager.axis.v202205.DateTime eventStartDateTime) {
        this.eventStartDateTime = eventStartDateTime;
    }


    /**
     * Gets the eventEndDateTime value for this LinearStreamCreateRequest.
     * 
     * @return eventEndDateTime
     */
    public com.google.api.ads.admanager.axis.v202205.DateTime getEventEndDateTime() {
        return eventEndDateTime;
    }


    /**
     * Sets the eventEndDateTime value for this LinearStreamCreateRequest.
     * 
     * @param eventEndDateTime
     */
    public void setEventEndDateTime(com.google.api.ads.admanager.axis.v202205.DateTime eventEndDateTime) {
        this.eventEndDateTime = eventEndDateTime;
    }


    /**
     * Gets the prefetchEnabled value for this LinearStreamCreateRequest.
     * 
     * @return prefetchEnabled
     */
    public java.lang.Boolean getPrefetchEnabled() {
        return prefetchEnabled;
    }


    /**
     * Sets the prefetchEnabled value for this LinearStreamCreateRequest.
     * 
     * @param prefetchEnabled
     */
    public void setPrefetchEnabled(java.lang.Boolean prefetchEnabled) {
        this.prefetchEnabled = prefetchEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinearStreamCreateRequest)) return false;
        LinearStreamCreateRequest other = (LinearStreamCreateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.liveStreamEventAssetKey==null && other.getLiveStreamEventAssetKey()==null) || 
             (this.liveStreamEventAssetKey!=null &&
              this.liveStreamEventAssetKey.equals(other.getLiveStreamEventAssetKey()))) &&
            ((this.eventName==null && other.getEventName()==null) || 
             (this.eventName!=null &&
              this.eventName.equals(other.getEventName()))) &&
            ((this.liveStreamEventId==null && other.getLiveStreamEventId()==null) || 
             (this.liveStreamEventId!=null &&
              this.liveStreamEventId.equals(other.getLiveStreamEventId()))) &&
            ((this.eventStartDateTime==null && other.getEventStartDateTime()==null) || 
             (this.eventStartDateTime!=null &&
              this.eventStartDateTime.equals(other.getEventStartDateTime()))) &&
            ((this.eventEndDateTime==null && other.getEventEndDateTime()==null) || 
             (this.eventEndDateTime!=null &&
              this.eventEndDateTime.equals(other.getEventEndDateTime()))) &&
            ((this.prefetchEnabled==null && other.getPrefetchEnabled()==null) || 
             (this.prefetchEnabled!=null &&
              this.prefetchEnabled.equals(other.getPrefetchEnabled())));
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
        if (getLiveStreamEventAssetKey() != null) {
            _hashCode += getLiveStreamEventAssetKey().hashCode();
        }
        if (getEventName() != null) {
            _hashCode += getEventName().hashCode();
        }
        if (getLiveStreamEventId() != null) {
            _hashCode += getLiveStreamEventId().hashCode();
        }
        if (getEventStartDateTime() != null) {
            _hashCode += getEventStartDateTime().hashCode();
        }
        if (getEventEndDateTime() != null) {
            _hashCode += getEventEndDateTime().hashCode();
        }
        if (getPrefetchEnabled() != null) {
            _hashCode += getPrefetchEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LinearStreamCreateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "LinearStreamCreateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveStreamEventAssetKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "liveStreamEventAssetKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "eventName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveStreamEventId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "liveStreamEventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventStartDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "eventStartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventEndDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "eventEndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefetchEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202205", "prefetchEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

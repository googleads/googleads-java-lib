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
 * SamSession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;


/**
 * Contains the debugging information that was logged for a Stream
 * Activity Monitor (SAM) session.
 *             
 *             <p>This object will grow and get updated over the course
 * of the stream.
 */
public class SamSession  implements java.io.Serializable {
    /* The UUID that uniquely identifies this session. */
    private java.lang.String sessionId;

    /* Whether this is a VOD session. */
    private java.lang.Boolean isVodSession;

    /* The initial request from the video player to retrieve the streaming
     * URL chunks that are updated
     *                 as the stream progresses. */
    private com.google.api.ads.admanager.axis.v202502.StreamCreateRequest streamCreateRequest;

    /* The list of debugging information that occurred at each ad
     * break in the stream. */
    private com.google.api.ads.admanager.axis.v202502.AdBreak[] adBreaks;

    /* The date and time the session started. */
    private com.google.api.ads.admanager.axis.v202502.DateTime startDateTime;

    /* The duration of the session in milliseconds. For live this
     * is calculated by subtracting the
     *                 timestamp on the oldest log from the timestamp on
     * the newest log. For VOD this is the total
     *                 duration of the content plus the ads that have been
     * inserted. */
    private java.lang.Long sessionDurationMillis;

    /* The duration of the content in milliseconds. This is for VOD
     * debugging only. */
    private java.lang.Long contentDurationMillis;

    public SamSession() {
    }

    public SamSession(
           java.lang.String sessionId,
           java.lang.Boolean isVodSession,
           com.google.api.ads.admanager.axis.v202502.StreamCreateRequest streamCreateRequest,
           com.google.api.ads.admanager.axis.v202502.AdBreak[] adBreaks,
           com.google.api.ads.admanager.axis.v202502.DateTime startDateTime,
           java.lang.Long sessionDurationMillis,
           java.lang.Long contentDurationMillis) {
           this.sessionId = sessionId;
           this.isVodSession = isVodSession;
           this.streamCreateRequest = streamCreateRequest;
           this.adBreaks = adBreaks;
           this.startDateTime = startDateTime;
           this.sessionDurationMillis = sessionDurationMillis;
           this.contentDurationMillis = contentDurationMillis;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adBreaks", getAdBreaks())
            .add("contentDurationMillis", getContentDurationMillis())
            .add("isVodSession", getIsVodSession())
            .add("sessionDurationMillis", getSessionDurationMillis())
            .add("sessionId", getSessionId())
            .add("startDateTime", getStartDateTime())
            .add("streamCreateRequest", getStreamCreateRequest())
            .toString();
    }

    /**
     * Gets the sessionId value for this SamSession.
     * 
     * @return sessionId   * The UUID that uniquely identifies this session.
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SamSession.
     * 
     * @param sessionId   * The UUID that uniquely identifies this session.
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the isVodSession value for this SamSession.
     * 
     * @return isVodSession   * Whether this is a VOD session.
     */
    public java.lang.Boolean getIsVodSession() {
        return isVodSession;
    }


    /**
     * Sets the isVodSession value for this SamSession.
     * 
     * @param isVodSession   * Whether this is a VOD session.
     */
    public void setIsVodSession(java.lang.Boolean isVodSession) {
        this.isVodSession = isVodSession;
    }


    /**
     * Gets the streamCreateRequest value for this SamSession.
     * 
     * @return streamCreateRequest   * The initial request from the video player to retrieve the streaming
     * URL chunks that are updated
     *                 as the stream progresses.
     */
    public com.google.api.ads.admanager.axis.v202502.StreamCreateRequest getStreamCreateRequest() {
        return streamCreateRequest;
    }


    /**
     * Sets the streamCreateRequest value for this SamSession.
     * 
     * @param streamCreateRequest   * The initial request from the video player to retrieve the streaming
     * URL chunks that are updated
     *                 as the stream progresses.
     */
    public void setStreamCreateRequest(com.google.api.ads.admanager.axis.v202502.StreamCreateRequest streamCreateRequest) {
        this.streamCreateRequest = streamCreateRequest;
    }


    /**
     * Gets the adBreaks value for this SamSession.
     * 
     * @return adBreaks   * The list of debugging information that occurred at each ad
     * break in the stream.
     */
    public com.google.api.ads.admanager.axis.v202502.AdBreak[] getAdBreaks() {
        return adBreaks;
    }


    /**
     * Sets the adBreaks value for this SamSession.
     * 
     * @param adBreaks   * The list of debugging information that occurred at each ad
     * break in the stream.
     */
    public void setAdBreaks(com.google.api.ads.admanager.axis.v202502.AdBreak[] adBreaks) {
        this.adBreaks = adBreaks;
    }

    public com.google.api.ads.admanager.axis.v202502.AdBreak getAdBreaks(int i) {
        return this.adBreaks[i];
    }

    public void setAdBreaks(int i, com.google.api.ads.admanager.axis.v202502.AdBreak _value) {
        this.adBreaks[i] = _value;
    }


    /**
     * Gets the startDateTime value for this SamSession.
     * 
     * @return startDateTime   * The date and time the session started.
     */
    public com.google.api.ads.admanager.axis.v202502.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this SamSession.
     * 
     * @param startDateTime   * The date and time the session started.
     */
    public void setStartDateTime(com.google.api.ads.admanager.axis.v202502.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the sessionDurationMillis value for this SamSession.
     * 
     * @return sessionDurationMillis   * The duration of the session in milliseconds. For live this
     * is calculated by subtracting the
     *                 timestamp on the oldest log from the timestamp on
     * the newest log. For VOD this is the total
     *                 duration of the content plus the ads that have been
     * inserted.
     */
    public java.lang.Long getSessionDurationMillis() {
        return sessionDurationMillis;
    }


    /**
     * Sets the sessionDurationMillis value for this SamSession.
     * 
     * @param sessionDurationMillis   * The duration of the session in milliseconds. For live this
     * is calculated by subtracting the
     *                 timestamp on the oldest log from the timestamp on
     * the newest log. For VOD this is the total
     *                 duration of the content plus the ads that have been
     * inserted.
     */
    public void setSessionDurationMillis(java.lang.Long sessionDurationMillis) {
        this.sessionDurationMillis = sessionDurationMillis;
    }


    /**
     * Gets the contentDurationMillis value for this SamSession.
     * 
     * @return contentDurationMillis   * The duration of the content in milliseconds. This is for VOD
     * debugging only.
     */
    public java.lang.Long getContentDurationMillis() {
        return contentDurationMillis;
    }


    /**
     * Sets the contentDurationMillis value for this SamSession.
     * 
     * @param contentDurationMillis   * The duration of the content in milliseconds. This is for VOD
     * debugging only.
     */
    public void setContentDurationMillis(java.lang.Long contentDurationMillis) {
        this.contentDurationMillis = contentDurationMillis;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SamSession)) return false;
        SamSession other = (SamSession) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.isVodSession==null && other.getIsVodSession()==null) || 
             (this.isVodSession!=null &&
              this.isVodSession.equals(other.getIsVodSession()))) &&
            ((this.streamCreateRequest==null && other.getStreamCreateRequest()==null) || 
             (this.streamCreateRequest!=null &&
              this.streamCreateRequest.equals(other.getStreamCreateRequest()))) &&
            ((this.adBreaks==null && other.getAdBreaks()==null) || 
             (this.adBreaks!=null &&
              java.util.Arrays.equals(this.adBreaks, other.getAdBreaks()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.sessionDurationMillis==null && other.getSessionDurationMillis()==null) || 
             (this.sessionDurationMillis!=null &&
              this.sessionDurationMillis.equals(other.getSessionDurationMillis()))) &&
            ((this.contentDurationMillis==null && other.getContentDurationMillis()==null) || 
             (this.contentDurationMillis!=null &&
              this.contentDurationMillis.equals(other.getContentDurationMillis())));
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
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getIsVodSession() != null) {
            _hashCode += getIsVodSession().hashCode();
        }
        if (getStreamCreateRequest() != null) {
            _hashCode += getStreamCreateRequest().hashCode();
        }
        if (getAdBreaks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdBreaks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdBreaks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getSessionDurationMillis() != null) {
            _hashCode += getSessionDurationMillis().hashCode();
        }
        if (getContentDurationMillis() != null) {
            _hashCode += getContentDurationMillis().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SamSession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "SamSession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVodSession");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "isVodSession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamCreateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "streamCreateRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "StreamCreateRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adBreaks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "adBreaks"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "AdBreak"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionDurationMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "sessionDurationMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentDurationMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "contentDurationMillis"));
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

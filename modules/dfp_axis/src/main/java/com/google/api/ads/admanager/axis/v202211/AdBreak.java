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
 * AdBreak.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202211;

public class AdBreak  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202211.AdResponse[] rootAdResponses;

    private com.google.api.ads.admanager.axis.v202211.AdDecisionCreative[] adDecisionCreatives;

    private java.lang.Integer podNum;

    private java.lang.Integer linearAbsolutePodNum;

    private java.lang.Long adBreakDurationMillis;

    private java.lang.Long filledDurationMillis;

    private java.lang.Long servedDurationMillis;

    private com.google.api.ads.admanager.axis.v202211.DateTime startDateTime;

    private java.lang.Long startTimeOffsetMillis;

    private com.google.api.ads.admanager.axis.v202211.SamError samError;

    private java.lang.Integer midrollIndex;

    private java.lang.Boolean decisionedAds;

    private com.google.api.ads.admanager.axis.v202211.TrackingEvent[] trackingEvents;

    public AdBreak() {
    }

    public AdBreak(
           com.google.api.ads.admanager.axis.v202211.AdResponse[] rootAdResponses,
           com.google.api.ads.admanager.axis.v202211.AdDecisionCreative[] adDecisionCreatives,
           java.lang.Integer podNum,
           java.lang.Integer linearAbsolutePodNum,
           java.lang.Long adBreakDurationMillis,
           java.lang.Long filledDurationMillis,
           java.lang.Long servedDurationMillis,
           com.google.api.ads.admanager.axis.v202211.DateTime startDateTime,
           java.lang.Long startTimeOffsetMillis,
           com.google.api.ads.admanager.axis.v202211.SamError samError,
           java.lang.Integer midrollIndex,
           java.lang.Boolean decisionedAds,
           com.google.api.ads.admanager.axis.v202211.TrackingEvent[] trackingEvents) {
           this.rootAdResponses = rootAdResponses;
           this.adDecisionCreatives = adDecisionCreatives;
           this.podNum = podNum;
           this.linearAbsolutePodNum = linearAbsolutePodNum;
           this.adBreakDurationMillis = adBreakDurationMillis;
           this.filledDurationMillis = filledDurationMillis;
           this.servedDurationMillis = servedDurationMillis;
           this.startDateTime = startDateTime;
           this.startTimeOffsetMillis = startTimeOffsetMillis;
           this.samError = samError;
           this.midrollIndex = midrollIndex;
           this.decisionedAds = decisionedAds;
           this.trackingEvents = trackingEvents;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adBreakDurationMillis", getAdBreakDurationMillis())
            .add("adDecisionCreatives", getAdDecisionCreatives())
            .add("decisionedAds", getDecisionedAds())
            .add("filledDurationMillis", getFilledDurationMillis())
            .add("linearAbsolutePodNum", getLinearAbsolutePodNum())
            .add("midrollIndex", getMidrollIndex())
            .add("podNum", getPodNum())
            .add("rootAdResponses", getRootAdResponses())
            .add("samError", getSamError())
            .add("servedDurationMillis", getServedDurationMillis())
            .add("startDateTime", getStartDateTime())
            .add("startTimeOffsetMillis", getStartTimeOffsetMillis())
            .add("trackingEvents", getTrackingEvents())
            .toString();
    }

    /**
     * Gets the rootAdResponses value for this AdBreak.
     * 
     * @return rootAdResponses
     */
    public com.google.api.ads.admanager.axis.v202211.AdResponse[] getRootAdResponses() {
        return rootAdResponses;
    }


    /**
     * Sets the rootAdResponses value for this AdBreak.
     * 
     * @param rootAdResponses
     */
    public void setRootAdResponses(com.google.api.ads.admanager.axis.v202211.AdResponse[] rootAdResponses) {
        this.rootAdResponses = rootAdResponses;
    }

    public com.google.api.ads.admanager.axis.v202211.AdResponse getRootAdResponses(int i) {
        return this.rootAdResponses[i];
    }

    public void setRootAdResponses(int i, com.google.api.ads.admanager.axis.v202211.AdResponse _value) {
        this.rootAdResponses[i] = _value;
    }


    /**
     * Gets the adDecisionCreatives value for this AdBreak.
     * 
     * @return adDecisionCreatives
     */
    public com.google.api.ads.admanager.axis.v202211.AdDecisionCreative[] getAdDecisionCreatives() {
        return adDecisionCreatives;
    }


    /**
     * Sets the adDecisionCreatives value for this AdBreak.
     * 
     * @param adDecisionCreatives
     */
    public void setAdDecisionCreatives(com.google.api.ads.admanager.axis.v202211.AdDecisionCreative[] adDecisionCreatives) {
        this.adDecisionCreatives = adDecisionCreatives;
    }

    public com.google.api.ads.admanager.axis.v202211.AdDecisionCreative getAdDecisionCreatives(int i) {
        return this.adDecisionCreatives[i];
    }

    public void setAdDecisionCreatives(int i, com.google.api.ads.admanager.axis.v202211.AdDecisionCreative _value) {
        this.adDecisionCreatives[i] = _value;
    }


    /**
     * Gets the podNum value for this AdBreak.
     * 
     * @return podNum
     */
    public java.lang.Integer getPodNum() {
        return podNum;
    }


    /**
     * Sets the podNum value for this AdBreak.
     * 
     * @param podNum
     */
    public void setPodNum(java.lang.Integer podNum) {
        this.podNum = podNum;
    }


    /**
     * Gets the linearAbsolutePodNum value for this AdBreak.
     * 
     * @return linearAbsolutePodNum
     */
    public java.lang.Integer getLinearAbsolutePodNum() {
        return linearAbsolutePodNum;
    }


    /**
     * Sets the linearAbsolutePodNum value for this AdBreak.
     * 
     * @param linearAbsolutePodNum
     */
    public void setLinearAbsolutePodNum(java.lang.Integer linearAbsolutePodNum) {
        this.linearAbsolutePodNum = linearAbsolutePodNum;
    }


    /**
     * Gets the adBreakDurationMillis value for this AdBreak.
     * 
     * @return adBreakDurationMillis
     */
    public java.lang.Long getAdBreakDurationMillis() {
        return adBreakDurationMillis;
    }


    /**
     * Sets the adBreakDurationMillis value for this AdBreak.
     * 
     * @param adBreakDurationMillis
     */
    public void setAdBreakDurationMillis(java.lang.Long adBreakDurationMillis) {
        this.adBreakDurationMillis = adBreakDurationMillis;
    }


    /**
     * Gets the filledDurationMillis value for this AdBreak.
     * 
     * @return filledDurationMillis
     */
    public java.lang.Long getFilledDurationMillis() {
        return filledDurationMillis;
    }


    /**
     * Sets the filledDurationMillis value for this AdBreak.
     * 
     * @param filledDurationMillis
     */
    public void setFilledDurationMillis(java.lang.Long filledDurationMillis) {
        this.filledDurationMillis = filledDurationMillis;
    }


    /**
     * Gets the servedDurationMillis value for this AdBreak.
     * 
     * @return servedDurationMillis
     */
    public java.lang.Long getServedDurationMillis() {
        return servedDurationMillis;
    }


    /**
     * Sets the servedDurationMillis value for this AdBreak.
     * 
     * @param servedDurationMillis
     */
    public void setServedDurationMillis(java.lang.Long servedDurationMillis) {
        this.servedDurationMillis = servedDurationMillis;
    }


    /**
     * Gets the startDateTime value for this AdBreak.
     * 
     * @return startDateTime
     */
    public com.google.api.ads.admanager.axis.v202211.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this AdBreak.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(com.google.api.ads.admanager.axis.v202211.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the startTimeOffsetMillis value for this AdBreak.
     * 
     * @return startTimeOffsetMillis
     */
    public java.lang.Long getStartTimeOffsetMillis() {
        return startTimeOffsetMillis;
    }


    /**
     * Sets the startTimeOffsetMillis value for this AdBreak.
     * 
     * @param startTimeOffsetMillis
     */
    public void setStartTimeOffsetMillis(java.lang.Long startTimeOffsetMillis) {
        this.startTimeOffsetMillis = startTimeOffsetMillis;
    }


    /**
     * Gets the samError value for this AdBreak.
     * 
     * @return samError
     */
    public com.google.api.ads.admanager.axis.v202211.SamError getSamError() {
        return samError;
    }


    /**
     * Sets the samError value for this AdBreak.
     * 
     * @param samError
     */
    public void setSamError(com.google.api.ads.admanager.axis.v202211.SamError samError) {
        this.samError = samError;
    }


    /**
     * Gets the midrollIndex value for this AdBreak.
     * 
     * @return midrollIndex
     */
    public java.lang.Integer getMidrollIndex() {
        return midrollIndex;
    }


    /**
     * Sets the midrollIndex value for this AdBreak.
     * 
     * @param midrollIndex
     */
    public void setMidrollIndex(java.lang.Integer midrollIndex) {
        this.midrollIndex = midrollIndex;
    }


    /**
     * Gets the decisionedAds value for this AdBreak.
     * 
     * @return decisionedAds
     */
    public java.lang.Boolean getDecisionedAds() {
        return decisionedAds;
    }


    /**
     * Sets the decisionedAds value for this AdBreak.
     * 
     * @param decisionedAds
     */
    public void setDecisionedAds(java.lang.Boolean decisionedAds) {
        this.decisionedAds = decisionedAds;
    }


    /**
     * Gets the trackingEvents value for this AdBreak.
     * 
     * @return trackingEvents
     */
    public com.google.api.ads.admanager.axis.v202211.TrackingEvent[] getTrackingEvents() {
        return trackingEvents;
    }


    /**
     * Sets the trackingEvents value for this AdBreak.
     * 
     * @param trackingEvents
     */
    public void setTrackingEvents(com.google.api.ads.admanager.axis.v202211.TrackingEvent[] trackingEvents) {
        this.trackingEvents = trackingEvents;
    }

    public com.google.api.ads.admanager.axis.v202211.TrackingEvent getTrackingEvents(int i) {
        return this.trackingEvents[i];
    }

    public void setTrackingEvents(int i, com.google.api.ads.admanager.axis.v202211.TrackingEvent _value) {
        this.trackingEvents[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdBreak)) return false;
        AdBreak other = (AdBreak) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rootAdResponses==null && other.getRootAdResponses()==null) || 
             (this.rootAdResponses!=null &&
              java.util.Arrays.equals(this.rootAdResponses, other.getRootAdResponses()))) &&
            ((this.adDecisionCreatives==null && other.getAdDecisionCreatives()==null) || 
             (this.adDecisionCreatives!=null &&
              java.util.Arrays.equals(this.adDecisionCreatives, other.getAdDecisionCreatives()))) &&
            ((this.podNum==null && other.getPodNum()==null) || 
             (this.podNum!=null &&
              this.podNum.equals(other.getPodNum()))) &&
            ((this.linearAbsolutePodNum==null && other.getLinearAbsolutePodNum()==null) || 
             (this.linearAbsolutePodNum!=null &&
              this.linearAbsolutePodNum.equals(other.getLinearAbsolutePodNum()))) &&
            ((this.adBreakDurationMillis==null && other.getAdBreakDurationMillis()==null) || 
             (this.adBreakDurationMillis!=null &&
              this.adBreakDurationMillis.equals(other.getAdBreakDurationMillis()))) &&
            ((this.filledDurationMillis==null && other.getFilledDurationMillis()==null) || 
             (this.filledDurationMillis!=null &&
              this.filledDurationMillis.equals(other.getFilledDurationMillis()))) &&
            ((this.servedDurationMillis==null && other.getServedDurationMillis()==null) || 
             (this.servedDurationMillis!=null &&
              this.servedDurationMillis.equals(other.getServedDurationMillis()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.startTimeOffsetMillis==null && other.getStartTimeOffsetMillis()==null) || 
             (this.startTimeOffsetMillis!=null &&
              this.startTimeOffsetMillis.equals(other.getStartTimeOffsetMillis()))) &&
            ((this.samError==null && other.getSamError()==null) || 
             (this.samError!=null &&
              this.samError.equals(other.getSamError()))) &&
            ((this.midrollIndex==null && other.getMidrollIndex()==null) || 
             (this.midrollIndex!=null &&
              this.midrollIndex.equals(other.getMidrollIndex()))) &&
            ((this.decisionedAds==null && other.getDecisionedAds()==null) || 
             (this.decisionedAds!=null &&
              this.decisionedAds.equals(other.getDecisionedAds()))) &&
            ((this.trackingEvents==null && other.getTrackingEvents()==null) || 
             (this.trackingEvents!=null &&
              java.util.Arrays.equals(this.trackingEvents, other.getTrackingEvents())));
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
        if (getRootAdResponses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRootAdResponses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRootAdResponses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdDecisionCreatives() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdDecisionCreatives());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdDecisionCreatives(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPodNum() != null) {
            _hashCode += getPodNum().hashCode();
        }
        if (getLinearAbsolutePodNum() != null) {
            _hashCode += getLinearAbsolutePodNum().hashCode();
        }
        if (getAdBreakDurationMillis() != null) {
            _hashCode += getAdBreakDurationMillis().hashCode();
        }
        if (getFilledDurationMillis() != null) {
            _hashCode += getFilledDurationMillis().hashCode();
        }
        if (getServedDurationMillis() != null) {
            _hashCode += getServedDurationMillis().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getStartTimeOffsetMillis() != null) {
            _hashCode += getStartTimeOffsetMillis().hashCode();
        }
        if (getSamError() != null) {
            _hashCode += getSamError().hashCode();
        }
        if (getMidrollIndex() != null) {
            _hashCode += getMidrollIndex().hashCode();
        }
        if (getDecisionedAds() != null) {
            _hashCode += getDecisionedAds().hashCode();
        }
        if (getTrackingEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackingEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrackingEvents(), i);
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
        new org.apache.axis.description.TypeDesc(AdBreak.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "AdBreak"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootAdResponses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "rootAdResponses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "AdResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adDecisionCreatives");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "adDecisionCreatives"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "AdDecisionCreative"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("podNum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "podNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linearAbsolutePodNum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "linearAbsolutePodNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adBreakDurationMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "adBreakDurationMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filledDurationMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "filledDurationMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servedDurationMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "servedDurationMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTimeOffsetMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "startTimeOffsetMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samError");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "samError"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "SamError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("midrollIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "midrollIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decisionedAds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "decisionedAds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "trackingEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "TrackingEvent"));
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

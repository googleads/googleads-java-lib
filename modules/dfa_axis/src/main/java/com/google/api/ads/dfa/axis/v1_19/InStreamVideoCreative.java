/**
 * InStreamVideoCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class InStreamVideoCreative  extends com.google.api.ads.dfa.axis.v1_19.CreativeBase  implements java.io.Serializable {
    private java.lang.String adId;

    private java.lang.String clickThroughUrl;

    private com.google.api.ads.dfa.axis.v1_19.InStreamCompanionAd[] companionAds;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private com.google.api.ads.dfa.axis.v1_19.InStreamMediaFile[] mediaFiles;

    private com.google.api.ads.dfa.axis.v1_19.InStreamNonLinearAd[] nonLinearAds;

    private boolean skippableAd;

    private java.lang.String surveyUrl;

    private com.google.api.ads.dfa.axis.v1_19.InStreamThirdPartyTrackingEvents thirdPartyTrackingEvents;

    private float videoDuration;

    public InStreamVideoCreative() {
    }

    public InStreamVideoCreative(
           long id,
           java.lang.String name,
           boolean active,
           long advertiserId,
           boolean archived,
           com.google.api.ads.dfa.axis.v1_19.CreativeFieldAssignment[] creativeFieldAssignments,
           long sizeId,
           long typeId,
           int version,
           java.lang.String adId,
           java.lang.String clickThroughUrl,
           com.google.api.ads.dfa.axis.v1_19.InStreamCompanionAd[] companionAds,
           java.util.Calendar createdDate,
           java.lang.String description,
           com.google.api.ads.dfa.axis.v1_19.InStreamMediaFile[] mediaFiles,
           com.google.api.ads.dfa.axis.v1_19.InStreamNonLinearAd[] nonLinearAds,
           boolean skippableAd,
           java.lang.String surveyUrl,
           com.google.api.ads.dfa.axis.v1_19.InStreamThirdPartyTrackingEvents thirdPartyTrackingEvents,
           float videoDuration) {
        super(
            id,
            name,
            active,
            advertiserId,
            archived,
            creativeFieldAssignments,
            sizeId,
            typeId,
            version);
        this.adId = adId;
        this.clickThroughUrl = clickThroughUrl;
        this.companionAds = companionAds;
        this.createdDate = createdDate;
        this.description = description;
        this.mediaFiles = mediaFiles;
        this.nonLinearAds = nonLinearAds;
        this.skippableAd = skippableAd;
        this.surveyUrl = surveyUrl;
        this.thirdPartyTrackingEvents = thirdPartyTrackingEvents;
        this.videoDuration = videoDuration;
    }


    /**
     * Gets the adId value for this InStreamVideoCreative.
     * 
     * @return adId
     */
    public java.lang.String getAdId() {
        return adId;
    }


    /**
     * Sets the adId value for this InStreamVideoCreative.
     * 
     * @param adId
     */
    public void setAdId(java.lang.String adId) {
        this.adId = adId;
    }


    /**
     * Gets the clickThroughUrl value for this InStreamVideoCreative.
     * 
     * @return clickThroughUrl
     */
    public java.lang.String getClickThroughUrl() {
        return clickThroughUrl;
    }


    /**
     * Sets the clickThroughUrl value for this InStreamVideoCreative.
     * 
     * @param clickThroughUrl
     */
    public void setClickThroughUrl(java.lang.String clickThroughUrl) {
        this.clickThroughUrl = clickThroughUrl;
    }


    /**
     * Gets the companionAds value for this InStreamVideoCreative.
     * 
     * @return companionAds
     */
    public com.google.api.ads.dfa.axis.v1_19.InStreamCompanionAd[] getCompanionAds() {
        return companionAds;
    }


    /**
     * Sets the companionAds value for this InStreamVideoCreative.
     * 
     * @param companionAds
     */
    public void setCompanionAds(com.google.api.ads.dfa.axis.v1_19.InStreamCompanionAd[] companionAds) {
        this.companionAds = companionAds;
    }


    /**
     * Gets the createdDate value for this InStreamVideoCreative.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this InStreamVideoCreative.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this InStreamVideoCreative.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InStreamVideoCreative.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the mediaFiles value for this InStreamVideoCreative.
     * 
     * @return mediaFiles
     */
    public com.google.api.ads.dfa.axis.v1_19.InStreamMediaFile[] getMediaFiles() {
        return mediaFiles;
    }


    /**
     * Sets the mediaFiles value for this InStreamVideoCreative.
     * 
     * @param mediaFiles
     */
    public void setMediaFiles(com.google.api.ads.dfa.axis.v1_19.InStreamMediaFile[] mediaFiles) {
        this.mediaFiles = mediaFiles;
    }


    /**
     * Gets the nonLinearAds value for this InStreamVideoCreative.
     * 
     * @return nonLinearAds
     */
    public com.google.api.ads.dfa.axis.v1_19.InStreamNonLinearAd[] getNonLinearAds() {
        return nonLinearAds;
    }


    /**
     * Sets the nonLinearAds value for this InStreamVideoCreative.
     * 
     * @param nonLinearAds
     */
    public void setNonLinearAds(com.google.api.ads.dfa.axis.v1_19.InStreamNonLinearAd[] nonLinearAds) {
        this.nonLinearAds = nonLinearAds;
    }


    /**
     * Gets the skippableAd value for this InStreamVideoCreative.
     * 
     * @return skippableAd
     */
    public boolean isSkippableAd() {
        return skippableAd;
    }


    /**
     * Sets the skippableAd value for this InStreamVideoCreative.
     * 
     * @param skippableAd
     */
    public void setSkippableAd(boolean skippableAd) {
        this.skippableAd = skippableAd;
    }


    /**
     * Gets the surveyUrl value for this InStreamVideoCreative.
     * 
     * @return surveyUrl
     */
    public java.lang.String getSurveyUrl() {
        return surveyUrl;
    }


    /**
     * Sets the surveyUrl value for this InStreamVideoCreative.
     * 
     * @param surveyUrl
     */
    public void setSurveyUrl(java.lang.String surveyUrl) {
        this.surveyUrl = surveyUrl;
    }


    /**
     * Gets the thirdPartyTrackingEvents value for this InStreamVideoCreative.
     * 
     * @return thirdPartyTrackingEvents
     */
    public com.google.api.ads.dfa.axis.v1_19.InStreamThirdPartyTrackingEvents getThirdPartyTrackingEvents() {
        return thirdPartyTrackingEvents;
    }


    /**
     * Sets the thirdPartyTrackingEvents value for this InStreamVideoCreative.
     * 
     * @param thirdPartyTrackingEvents
     */
    public void setThirdPartyTrackingEvents(com.google.api.ads.dfa.axis.v1_19.InStreamThirdPartyTrackingEvents thirdPartyTrackingEvents) {
        this.thirdPartyTrackingEvents = thirdPartyTrackingEvents;
    }


    /**
     * Gets the videoDuration value for this InStreamVideoCreative.
     * 
     * @return videoDuration
     */
    public float getVideoDuration() {
        return videoDuration;
    }


    /**
     * Sets the videoDuration value for this InStreamVideoCreative.
     * 
     * @param videoDuration
     */
    public void setVideoDuration(float videoDuration) {
        this.videoDuration = videoDuration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InStreamVideoCreative)) return false;
        InStreamVideoCreative other = (InStreamVideoCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adId==null && other.getAdId()==null) || 
             (this.adId!=null &&
              this.adId.equals(other.getAdId()))) &&
            ((this.clickThroughUrl==null && other.getClickThroughUrl()==null) || 
             (this.clickThroughUrl!=null &&
              this.clickThroughUrl.equals(other.getClickThroughUrl()))) &&
            ((this.companionAds==null && other.getCompanionAds()==null) || 
             (this.companionAds!=null &&
              java.util.Arrays.equals(this.companionAds, other.getCompanionAds()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.mediaFiles==null && other.getMediaFiles()==null) || 
             (this.mediaFiles!=null &&
              java.util.Arrays.equals(this.mediaFiles, other.getMediaFiles()))) &&
            ((this.nonLinearAds==null && other.getNonLinearAds()==null) || 
             (this.nonLinearAds!=null &&
              java.util.Arrays.equals(this.nonLinearAds, other.getNonLinearAds()))) &&
            this.skippableAd == other.isSkippableAd() &&
            ((this.surveyUrl==null && other.getSurveyUrl()==null) || 
             (this.surveyUrl!=null &&
              this.surveyUrl.equals(other.getSurveyUrl()))) &&
            ((this.thirdPartyTrackingEvents==null && other.getThirdPartyTrackingEvents()==null) || 
             (this.thirdPartyTrackingEvents!=null &&
              this.thirdPartyTrackingEvents.equals(other.getThirdPartyTrackingEvents()))) &&
            this.videoDuration == other.getVideoDuration();
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
        if (getAdId() != null) {
            _hashCode += getAdId().hashCode();
        }
        if (getClickThroughUrl() != null) {
            _hashCode += getClickThroughUrl().hashCode();
        }
        if (getCompanionAds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanionAds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanionAds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMediaFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMediaFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMediaFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNonLinearAds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNonLinearAds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNonLinearAds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isSkippableAd() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSurveyUrl() != null) {
            _hashCode += getSurveyUrl().hashCode();
        }
        if (getThirdPartyTrackingEvents() != null) {
            _hashCode += getThirdPartyTrackingEvents().hashCode();
        }
        _hashCode += new Float(getVideoDuration()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InStreamVideoCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "InStreamVideoCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickThroughUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickThroughUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionAds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companionAds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "InStreamCompanionAd"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "InStreamMediaFile"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonLinearAds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonLinearAds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "InStreamNonLinearAd"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skippableAd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skippableAd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surveyUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyTrackingEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thirdPartyTrackingEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "InStreamThirdPartyTrackingEvents"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "videoDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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

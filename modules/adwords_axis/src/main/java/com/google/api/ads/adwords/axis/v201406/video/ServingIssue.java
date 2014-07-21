/**
 * ServingIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * A serving issue on a particular entity (e.g. VideoCampaign: insufficient
 * funds).
 */
public class ServingIssue  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201406.video.ServingIssueReason reason;

    private java.lang.Long campaignId;

    private java.lang.Long targetingGroupId;

    private java.lang.Long videoAdId;

    private java.lang.String videoId;

    private java.lang.Boolean hideActionLink;

    private com.google.api.ads.adwords.axis.v201406.video.ServingIssueSeverity severity;

    private com.google.api.ads.adwords.axis.v201406.video.ServingIssueType type;

    public ServingIssue() {
    }

    public ServingIssue(
           com.google.api.ads.adwords.axis.v201406.video.ServingIssueReason reason,
           java.lang.Long campaignId,
           java.lang.Long targetingGroupId,
           java.lang.Long videoAdId,
           java.lang.String videoId,
           java.lang.Boolean hideActionLink,
           com.google.api.ads.adwords.axis.v201406.video.ServingIssueSeverity severity,
           com.google.api.ads.adwords.axis.v201406.video.ServingIssueType type) {
           this.reason = reason;
           this.campaignId = campaignId;
           this.targetingGroupId = targetingGroupId;
           this.videoAdId = videoAdId;
           this.videoId = videoId;
           this.hideActionLink = hideActionLink;
           this.severity = severity;
           this.type = type;
    }


    /**
     * Gets the reason value for this ServingIssue.
     * 
     * @return reason
     */
    public com.google.api.ads.adwords.axis.v201406.video.ServingIssueReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ServingIssue.
     * 
     * @param reason
     */
    public void setReason(com.google.api.ads.adwords.axis.v201406.video.ServingIssueReason reason) {
        this.reason = reason;
    }


    /**
     * Gets the campaignId value for this ServingIssue.
     * 
     * @return campaignId
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this ServingIssue.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the targetingGroupId value for this ServingIssue.
     * 
     * @return targetingGroupId
     */
    public java.lang.Long getTargetingGroupId() {
        return targetingGroupId;
    }


    /**
     * Sets the targetingGroupId value for this ServingIssue.
     * 
     * @param targetingGroupId
     */
    public void setTargetingGroupId(java.lang.Long targetingGroupId) {
        this.targetingGroupId = targetingGroupId;
    }


    /**
     * Gets the videoAdId value for this ServingIssue.
     * 
     * @return videoAdId
     */
    public java.lang.Long getVideoAdId() {
        return videoAdId;
    }


    /**
     * Sets the videoAdId value for this ServingIssue.
     * 
     * @param videoAdId
     */
    public void setVideoAdId(java.lang.Long videoAdId) {
        this.videoAdId = videoAdId;
    }


    /**
     * Gets the videoId value for this ServingIssue.
     * 
     * @return videoId
     */
    public java.lang.String getVideoId() {
        return videoId;
    }


    /**
     * Sets the videoId value for this ServingIssue.
     * 
     * @param videoId
     */
    public void setVideoId(java.lang.String videoId) {
        this.videoId = videoId;
    }


    /**
     * Gets the hideActionLink value for this ServingIssue.
     * 
     * @return hideActionLink
     */
    public java.lang.Boolean getHideActionLink() {
        return hideActionLink;
    }


    /**
     * Sets the hideActionLink value for this ServingIssue.
     * 
     * @param hideActionLink
     */
    public void setHideActionLink(java.lang.Boolean hideActionLink) {
        this.hideActionLink = hideActionLink;
    }


    /**
     * Gets the severity value for this ServingIssue.
     * 
     * @return severity
     */
    public com.google.api.ads.adwords.axis.v201406.video.ServingIssueSeverity getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this ServingIssue.
     * 
     * @param severity
     */
    public void setSeverity(com.google.api.ads.adwords.axis.v201406.video.ServingIssueSeverity severity) {
        this.severity = severity;
    }


    /**
     * Gets the type value for this ServingIssue.
     * 
     * @return type
     */
    public com.google.api.ads.adwords.axis.v201406.video.ServingIssueType getType() {
        return type;
    }


    /**
     * Sets the type value for this ServingIssue.
     * 
     * @param type
     */
    public void setType(com.google.api.ads.adwords.axis.v201406.video.ServingIssueType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServingIssue)) return false;
        ServingIssue other = (ServingIssue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.targetingGroupId==null && other.getTargetingGroupId()==null) || 
             (this.targetingGroupId!=null &&
              this.targetingGroupId.equals(other.getTargetingGroupId()))) &&
            ((this.videoAdId==null && other.getVideoAdId()==null) || 
             (this.videoAdId!=null &&
              this.videoAdId.equals(other.getVideoAdId()))) &&
            ((this.videoId==null && other.getVideoId()==null) || 
             (this.videoId!=null &&
              this.videoId.equals(other.getVideoId()))) &&
            ((this.hideActionLink==null && other.getHideActionLink()==null) || 
             (this.hideActionLink!=null &&
              this.hideActionLink.equals(other.getHideActionLink()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getTargetingGroupId() != null) {
            _hashCode += getTargetingGroupId().hashCode();
        }
        if (getVideoAdId() != null) {
            _hashCode += getVideoAdId().hashCode();
        }
        if (getVideoId() != null) {
            _hashCode += getVideoId().hashCode();
        }
        if (getHideActionLink() != null) {
            _hashCode += getHideActionLink().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServingIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ServingIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ServingIssue.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "targetingGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoAdId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "videoAdId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "videoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hideActionLink");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "hideActionLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ServingIssue.Severity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ServingIssue.Type"));
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

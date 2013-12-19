/**
 * VastRedirectCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


/**
 * A {@code Creative} that points to an externally hosted VAST ad
 * and is
 *             served via VAST 2.0 XML as a VAST Wrapper.  This creative
 * is read only.
 */
public class VastRedirectCreative  extends com.google.api.ads.dfp.axis.v201311.Creative  implements java.io.Serializable {
    /* The URL where the 3rd party VAST 2.0 XML is hosted. */
    private java.lang.String vastXmlUrl;

    /* The type of VAST ad that this redirects to. */
    private com.google.api.ads.dfp.axis.v201311.VastRedirectType vastRedirectType;

    /* The duration of the VAST ad in milliseconds. */
    private java.lang.Integer duration;

    /* The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional. */
    private long[] companionCreativeIds;

    /* A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201311.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls;

    /* An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only. */
    private java.lang.String vastPreviewUrl;

    public VastRedirectCreative() {
    }

    public VastRedirectCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201311.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201311.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201311.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201311.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String vastXmlUrl,
           com.google.api.ads.dfp.axis.v201311.VastRedirectType vastRedirectType,
           java.lang.Integer duration,
           long[] companionCreativeIds,
           com.google.api.ads.dfp.axis.v201311.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           java.lang.String vastPreviewUrl) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            creativeType);
        this.vastXmlUrl = vastXmlUrl;
        this.vastRedirectType = vastRedirectType;
        this.duration = duration;
        this.companionCreativeIds = companionCreativeIds;
        this.trackingUrls = trackingUrls;
        this.vastPreviewUrl = vastPreviewUrl;
    }


    /**
     * Gets the vastXmlUrl value for this VastRedirectCreative.
     * 
     * @return vastXmlUrl   * The URL where the 3rd party VAST 2.0 XML is hosted.
     */
    public java.lang.String getVastXmlUrl() {
        return vastXmlUrl;
    }


    /**
     * Sets the vastXmlUrl value for this VastRedirectCreative.
     * 
     * @param vastXmlUrl   * The URL where the 3rd party VAST 2.0 XML is hosted.
     */
    public void setVastXmlUrl(java.lang.String vastXmlUrl) {
        this.vastXmlUrl = vastXmlUrl;
    }


    /**
     * Gets the vastRedirectType value for this VastRedirectCreative.
     * 
     * @return vastRedirectType   * The type of VAST ad that this redirects to.
     */
    public com.google.api.ads.dfp.axis.v201311.VastRedirectType getVastRedirectType() {
        return vastRedirectType;
    }


    /**
     * Sets the vastRedirectType value for this VastRedirectCreative.
     * 
     * @param vastRedirectType   * The type of VAST ad that this redirects to.
     */
    public void setVastRedirectType(com.google.api.ads.dfp.axis.v201311.VastRedirectType vastRedirectType) {
        this.vastRedirectType = vastRedirectType;
    }


    /**
     * Gets the duration value for this VastRedirectCreative.
     * 
     * @return duration   * The duration of the VAST ad in milliseconds.
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this VastRedirectCreative.
     * 
     * @param duration   * The duration of the VAST ad in milliseconds.
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the companionCreativeIds value for this VastRedirectCreative.
     * 
     * @return companionCreativeIds   * The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional.
     */
    public long[] getCompanionCreativeIds() {
        return companionCreativeIds;
    }


    /**
     * Sets the companionCreativeIds value for this VastRedirectCreative.
     * 
     * @param companionCreativeIds   * The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional.
     */
    public void setCompanionCreativeIds(long[] companionCreativeIds) {
        this.companionCreativeIds = companionCreativeIds;
    }

    public long getCompanionCreativeIds(int i) {
        return this.companionCreativeIds[i];
    }

    public void setCompanionCreativeIds(int i, long _value) {
        this.companionCreativeIds[i] = _value;
    }


    /**
     * Gets the trackingUrls value for this VastRedirectCreative.
     * 
     * @return trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201311.ConversionEvent_TrackingUrlsMapEntry[] getTrackingUrls() {
        return trackingUrls;
    }


    /**
     * Sets the trackingUrls value for this VastRedirectCreative.
     * 
     * @param trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public void setTrackingUrls(com.google.api.ads.dfp.axis.v201311.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    public com.google.api.ads.dfp.axis.v201311.ConversionEvent_TrackingUrlsMapEntry getTrackingUrls(int i) {
        return this.trackingUrls[i];
    }

    public void setTrackingUrls(int i, com.google.api.ads.dfp.axis.v201311.ConversionEvent_TrackingUrlsMapEntry _value) {
        this.trackingUrls[i] = _value;
    }


    /**
     * Gets the vastPreviewUrl value for this VastRedirectCreative.
     * 
     * @return vastPreviewUrl   * An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only.
     */
    public java.lang.String getVastPreviewUrl() {
        return vastPreviewUrl;
    }


    /**
     * Sets the vastPreviewUrl value for this VastRedirectCreative.
     * 
     * @param vastPreviewUrl   * An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only.
     */
    public void setVastPreviewUrl(java.lang.String vastPreviewUrl) {
        this.vastPreviewUrl = vastPreviewUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VastRedirectCreative)) return false;
        VastRedirectCreative other = (VastRedirectCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vastXmlUrl==null && other.getVastXmlUrl()==null) || 
             (this.vastXmlUrl!=null &&
              this.vastXmlUrl.equals(other.getVastXmlUrl()))) &&
            ((this.vastRedirectType==null && other.getVastRedirectType()==null) || 
             (this.vastRedirectType!=null &&
              this.vastRedirectType.equals(other.getVastRedirectType()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.companionCreativeIds==null && other.getCompanionCreativeIds()==null) || 
             (this.companionCreativeIds!=null &&
              java.util.Arrays.equals(this.companionCreativeIds, other.getCompanionCreativeIds()))) &&
            ((this.trackingUrls==null && other.getTrackingUrls()==null) || 
             (this.trackingUrls!=null &&
              java.util.Arrays.equals(this.trackingUrls, other.getTrackingUrls()))) &&
            ((this.vastPreviewUrl==null && other.getVastPreviewUrl()==null) || 
             (this.vastPreviewUrl!=null &&
              this.vastPreviewUrl.equals(other.getVastPreviewUrl())));
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
        if (getVastXmlUrl() != null) {
            _hashCode += getVastXmlUrl().hashCode();
        }
        if (getVastRedirectType() != null) {
            _hashCode += getVastRedirectType().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getCompanionCreativeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanionCreativeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanionCreativeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackingUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackingUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrackingUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVastPreviewUrl() != null) {
            _hashCode += getVastPreviewUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VastRedirectCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "VastRedirectCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vastXmlUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "vastXmlUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vastRedirectType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "vastRedirectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "VastRedirectType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionCreativeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "companionCreativeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "trackingUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ConversionEvent_TrackingUrlsMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vastPreviewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "vastPreviewUrl"));
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

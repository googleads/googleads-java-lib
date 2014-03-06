/**
 * BaseVideoCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


/**
 * A base type for video creatives.
 */
public abstract class BaseVideoCreative  extends com.google.api.ads.dfp.axis.v201311.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The expected duration of this creative in milliseconds. */
    private java.lang.Integer duration;

    /* Allows the creative duration to differ from the actual asset
     * durations. This
     *                     attribute is optional. */
    private java.lang.Boolean allowDurationOverride;

    /* A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201311.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls;

    /* The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional. */
    private long[] companionCreativeIds;

    /* A comma separated key=value list of parameters that will be
     * supplied to
     *                     the creative, written into the VAST {@code AdParameters}
     * node.
     *                     This attribute is optional. */
    private java.lang.String customParameters;

    /* An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only. */
    private java.lang.String vastPreviewUrl;

    public BaseVideoCreative() {
    }

    public BaseVideoCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201311.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201311.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201311.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201311.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           java.lang.Integer duration,
           java.lang.Boolean allowDurationOverride,
           com.google.api.ads.dfp.axis.v201311.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           long[] companionCreativeIds,
           java.lang.String customParameters,
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
            creativeType,
            destinationUrl);
        this.duration = duration;
        this.allowDurationOverride = allowDurationOverride;
        this.trackingUrls = trackingUrls;
        this.companionCreativeIds = companionCreativeIds;
        this.customParameters = customParameters;
        this.vastPreviewUrl = vastPreviewUrl;
    }


    /**
     * Gets the duration value for this BaseVideoCreative.
     * 
     * @return duration   * The expected duration of this creative in milliseconds.
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this BaseVideoCreative.
     * 
     * @param duration   * The expected duration of this creative in milliseconds.
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the allowDurationOverride value for this BaseVideoCreative.
     * 
     * @return allowDurationOverride   * Allows the creative duration to differ from the actual asset
     * durations. This
     *                     attribute is optional.
     */
    public java.lang.Boolean getAllowDurationOverride() {
        return allowDurationOverride;
    }


    /**
     * Sets the allowDurationOverride value for this BaseVideoCreative.
     * 
     * @param allowDurationOverride   * Allows the creative duration to differ from the actual asset
     * durations. This
     *                     attribute is optional.
     */
    public void setAllowDurationOverride(java.lang.Boolean allowDurationOverride) {
        this.allowDurationOverride = allowDurationOverride;
    }


    /**
     * Gets the trackingUrls value for this BaseVideoCreative.
     * 
     * @return trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201311.ConversionEvent_TrackingUrlsMapEntry[] getTrackingUrls() {
        return trackingUrls;
    }


    /**
     * Sets the trackingUrls value for this BaseVideoCreative.
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
     * Gets the companionCreativeIds value for this BaseVideoCreative.
     * 
     * @return companionCreativeIds   * The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional.
     */
    public long[] getCompanionCreativeIds() {
        return companionCreativeIds;
    }


    /**
     * Sets the companionCreativeIds value for this BaseVideoCreative.
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
     * Gets the customParameters value for this BaseVideoCreative.
     * 
     * @return customParameters   * A comma separated key=value list of parameters that will be
     * supplied to
     *                     the creative, written into the VAST {@code AdParameters}
     * node.
     *                     This attribute is optional.
     */
    public java.lang.String getCustomParameters() {
        return customParameters;
    }


    /**
     * Sets the customParameters value for this BaseVideoCreative.
     * 
     * @param customParameters   * A comma separated key=value list of parameters that will be
     * supplied to
     *                     the creative, written into the VAST {@code AdParameters}
     * node.
     *                     This attribute is optional.
     */
    public void setCustomParameters(java.lang.String customParameters) {
        this.customParameters = customParameters;
    }


    /**
     * Gets the vastPreviewUrl value for this BaseVideoCreative.
     * 
     * @return vastPreviewUrl   * An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only.
     */
    public java.lang.String getVastPreviewUrl() {
        return vastPreviewUrl;
    }


    /**
     * Sets the vastPreviewUrl value for this BaseVideoCreative.
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
        if (!(obj instanceof BaseVideoCreative)) return false;
        BaseVideoCreative other = (BaseVideoCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.allowDurationOverride==null && other.getAllowDurationOverride()==null) || 
             (this.allowDurationOverride!=null &&
              this.allowDurationOverride.equals(other.getAllowDurationOverride()))) &&
            ((this.trackingUrls==null && other.getTrackingUrls()==null) || 
             (this.trackingUrls!=null &&
              java.util.Arrays.equals(this.trackingUrls, other.getTrackingUrls()))) &&
            ((this.companionCreativeIds==null && other.getCompanionCreativeIds()==null) || 
             (this.companionCreativeIds!=null &&
              java.util.Arrays.equals(this.companionCreativeIds, other.getCompanionCreativeIds()))) &&
            ((this.customParameters==null && other.getCustomParameters()==null) || 
             (this.customParameters!=null &&
              this.customParameters.equals(other.getCustomParameters()))) &&
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
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getAllowDurationOverride() != null) {
            _hashCode += getAllowDurationOverride().hashCode();
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
        if (getCustomParameters() != null) {
            _hashCode += getCustomParameters().hashCode();
        }
        if (getVastPreviewUrl() != null) {
            _hashCode += getVastPreviewUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseVideoCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "BaseVideoCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDurationOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "allowDurationOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("companionCreativeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "companionCreativeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "customParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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

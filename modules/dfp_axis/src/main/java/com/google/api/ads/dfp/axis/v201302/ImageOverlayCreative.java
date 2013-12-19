/**
 * ImageOverlayCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201302;


/**
 * An overlay {@code Creative} that displays an image and is served
 * via VAST
 *             2.0 XML. Overlays cover part of the video content they
 * are displayed on
 *             top of. This creative is read only.
 */
public class ImageOverlayCreative  extends com.google.api.ads.dfp.axis.v201302.BaseImageCreative  implements java.io.Serializable {
    /* The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional. */
    private long[] companionCreativeIds;

    /* A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201302.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls;

    /* A comma separated key=value list of parameters that will be
     * supplied to
     *                     the creative, written into the VAST {@code AdParameters}
     * node.
     *                     This attribute is optional. */
    private java.lang.String customParameters;

    /* Minimum suggested duration in milliseconds. This attribute
     * is optional. */
    private java.lang.Integer duration;

    public ImageOverlayCreative() {
    }

    public ImageOverlayCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201302.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201302.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201302.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201302.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           java.lang.Boolean overrideSize,
           com.google.api.ads.dfp.axis.v201302.CreativeAsset primaryImageAsset,
           long[] companionCreativeIds,
           com.google.api.ads.dfp.axis.v201302.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           java.lang.String customParameters,
           java.lang.Integer duration) {
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
            destinationUrl,
            overrideSize,
            primaryImageAsset);
        this.companionCreativeIds = companionCreativeIds;
        this.trackingUrls = trackingUrls;
        this.customParameters = customParameters;
        this.duration = duration;
    }


    /**
     * Gets the companionCreativeIds value for this ImageOverlayCreative.
     * 
     * @return companionCreativeIds   * The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional.
     */
    public long[] getCompanionCreativeIds() {
        return companionCreativeIds;
    }


    /**
     * Sets the companionCreativeIds value for this ImageOverlayCreative.
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
     * Gets the trackingUrls value for this ImageOverlayCreative.
     * 
     * @return trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201302.ConversionEvent_TrackingUrlsMapEntry[] getTrackingUrls() {
        return trackingUrls;
    }


    /**
     * Sets the trackingUrls value for this ImageOverlayCreative.
     * 
     * @param trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public void setTrackingUrls(com.google.api.ads.dfp.axis.v201302.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    public com.google.api.ads.dfp.axis.v201302.ConversionEvent_TrackingUrlsMapEntry getTrackingUrls(int i) {
        return this.trackingUrls[i];
    }

    public void setTrackingUrls(int i, com.google.api.ads.dfp.axis.v201302.ConversionEvent_TrackingUrlsMapEntry _value) {
        this.trackingUrls[i] = _value;
    }


    /**
     * Gets the customParameters value for this ImageOverlayCreative.
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
     * Sets the customParameters value for this ImageOverlayCreative.
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
     * Gets the duration value for this ImageOverlayCreative.
     * 
     * @return duration   * Minimum suggested duration in milliseconds. This attribute
     * is optional.
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this ImageOverlayCreative.
     * 
     * @param duration   * Minimum suggested duration in milliseconds. This attribute
     * is optional.
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImageOverlayCreative)) return false;
        ImageOverlayCreative other = (ImageOverlayCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.companionCreativeIds==null && other.getCompanionCreativeIds()==null) || 
             (this.companionCreativeIds!=null &&
              java.util.Arrays.equals(this.companionCreativeIds, other.getCompanionCreativeIds()))) &&
            ((this.trackingUrls==null && other.getTrackingUrls()==null) || 
             (this.trackingUrls!=null &&
              java.util.Arrays.equals(this.trackingUrls, other.getTrackingUrls()))) &&
            ((this.customParameters==null && other.getCustomParameters()==null) || 
             (this.customParameters!=null &&
              this.customParameters.equals(other.getCustomParameters()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration())));
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
        if (getCustomParameters() != null) {
            _hashCode += getCustomParameters().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImageOverlayCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "ImageOverlayCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionCreativeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "companionCreativeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "trackingUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "ConversionEvent_TrackingUrlsMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "customParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

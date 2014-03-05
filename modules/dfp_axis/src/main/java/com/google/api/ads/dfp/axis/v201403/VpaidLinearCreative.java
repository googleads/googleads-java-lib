/**
 * VpaidLinearCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201403;


/**
 * A {@code Creative} that displays a DFP-hosted Flash-based ad
 *             and is served via VAST 2.0 XML.  It is displayed in a
 * linear fashion
 *             with a video (before, after, interrupting).  This creative
 * is read only.
 */
public class VpaidLinearCreative  extends com.google.api.ads.dfp.axis.v201403.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The name of the Flash asset. This attribute is required and
     * has a maximum
     *                     length of 248 characters. */
    private java.lang.String flashName;

    /* The contents of the Flash asset as a byte array. This attribute
     * is
     *                     required. The {@code flashByteArray} will be {@code
     * null} when the {@code
     *                     FlashCreative} is retrieved. To view the Flash
     * image, use the {@code
     *                     previewUrl}. */
    private byte[] flashByteArray;

    /* Allows the creative size to differ from the actual Flash asset
     * size. This
     *                     attribute is optional. */
    private java.lang.Boolean overrideSize;

    /* The Flash asset size. Note that this may differ from {@link
     * #size} if
     *                     {@link #overrideSize} is set to true. This attribute
     * is read-only and is
     *                     populated by Google. */
    private com.google.api.ads.dfp.axis.v201403.Size flashAssetSize;

    /* The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional. */
    private long[] companionCreativeIds;

    /* A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201403.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls;

    /* A string that is supplied to the VPAID creative's init function.
     * This is written into the VAST XML in the {@code AdParameters} section.
     * This attribute is optional. */
    private java.lang.String customParameters;

    /* Duration in milliseconds for the vpaid ad given no user interaction.
     * This attribute is optional. */
    private java.lang.Integer duration;

    /* An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only. */
    private java.lang.String vastPreviewUrl;

    public VpaidLinearCreative() {
    }

    public VpaidLinearCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201403.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201403.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201403.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201403.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           java.lang.String flashName,
           byte[] flashByteArray,
           java.lang.Boolean overrideSize,
           com.google.api.ads.dfp.axis.v201403.Size flashAssetSize,
           long[] companionCreativeIds,
           com.google.api.ads.dfp.axis.v201403.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           java.lang.String customParameters,
           java.lang.Integer duration,
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
        this.flashName = flashName;
        this.flashByteArray = flashByteArray;
        this.overrideSize = overrideSize;
        this.flashAssetSize = flashAssetSize;
        this.companionCreativeIds = companionCreativeIds;
        this.trackingUrls = trackingUrls;
        this.customParameters = customParameters;
        this.duration = duration;
        this.vastPreviewUrl = vastPreviewUrl;
    }


    /**
     * Gets the flashName value for this VpaidLinearCreative.
     * 
     * @return flashName   * The name of the Flash asset. This attribute is required and
     * has a maximum
     *                     length of 248 characters.
     */
    public java.lang.String getFlashName() {
        return flashName;
    }


    /**
     * Sets the flashName value for this VpaidLinearCreative.
     * 
     * @param flashName   * The name of the Flash asset. This attribute is required and
     * has a maximum
     *                     length of 248 characters.
     */
    public void setFlashName(java.lang.String flashName) {
        this.flashName = flashName;
    }


    /**
     * Gets the flashByteArray value for this VpaidLinearCreative.
     * 
     * @return flashByteArray   * The contents of the Flash asset as a byte array. This attribute
     * is
     *                     required. The {@code flashByteArray} will be {@code
     * null} when the {@code
     *                     FlashCreative} is retrieved. To view the Flash
     * image, use the {@code
     *                     previewUrl}.
     */
    public byte[] getFlashByteArray() {
        return flashByteArray;
    }


    /**
     * Sets the flashByteArray value for this VpaidLinearCreative.
     * 
     * @param flashByteArray   * The contents of the Flash asset as a byte array. This attribute
     * is
     *                     required. The {@code flashByteArray} will be {@code
     * null} when the {@code
     *                     FlashCreative} is retrieved. To view the Flash
     * image, use the {@code
     *                     previewUrl}.
     */
    public void setFlashByteArray(byte[] flashByteArray) {
        this.flashByteArray = flashByteArray;
    }


    /**
     * Gets the overrideSize value for this VpaidLinearCreative.
     * 
     * @return overrideSize   * Allows the creative size to differ from the actual Flash asset
     * size. This
     *                     attribute is optional.
     */
    public java.lang.Boolean getOverrideSize() {
        return overrideSize;
    }


    /**
     * Sets the overrideSize value for this VpaidLinearCreative.
     * 
     * @param overrideSize   * Allows the creative size to differ from the actual Flash asset
     * size. This
     *                     attribute is optional.
     */
    public void setOverrideSize(java.lang.Boolean overrideSize) {
        this.overrideSize = overrideSize;
    }


    /**
     * Gets the flashAssetSize value for this VpaidLinearCreative.
     * 
     * @return flashAssetSize   * The Flash asset size. Note that this may differ from {@link
     * #size} if
     *                     {@link #overrideSize} is set to true. This attribute
     * is read-only and is
     *                     populated by Google.
     */
    public com.google.api.ads.dfp.axis.v201403.Size getFlashAssetSize() {
        return flashAssetSize;
    }


    /**
     * Sets the flashAssetSize value for this VpaidLinearCreative.
     * 
     * @param flashAssetSize   * The Flash asset size. Note that this may differ from {@link
     * #size} if
     *                     {@link #overrideSize} is set to true. This attribute
     * is read-only and is
     *                     populated by Google.
     */
    public void setFlashAssetSize(com.google.api.ads.dfp.axis.v201403.Size flashAssetSize) {
        this.flashAssetSize = flashAssetSize;
    }


    /**
     * Gets the companionCreativeIds value for this VpaidLinearCreative.
     * 
     * @return companionCreativeIds   * The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional.
     */
    public long[] getCompanionCreativeIds() {
        return companionCreativeIds;
    }


    /**
     * Sets the companionCreativeIds value for this VpaidLinearCreative.
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
     * Gets the trackingUrls value for this VpaidLinearCreative.
     * 
     * @return trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201403.ConversionEvent_TrackingUrlsMapEntry[] getTrackingUrls() {
        return trackingUrls;
    }


    /**
     * Sets the trackingUrls value for this VpaidLinearCreative.
     * 
     * @param trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public void setTrackingUrls(com.google.api.ads.dfp.axis.v201403.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    public com.google.api.ads.dfp.axis.v201403.ConversionEvent_TrackingUrlsMapEntry getTrackingUrls(int i) {
        return this.trackingUrls[i];
    }

    public void setTrackingUrls(int i, com.google.api.ads.dfp.axis.v201403.ConversionEvent_TrackingUrlsMapEntry _value) {
        this.trackingUrls[i] = _value;
    }


    /**
     * Gets the customParameters value for this VpaidLinearCreative.
     * 
     * @return customParameters   * A string that is supplied to the VPAID creative's init function.
     * This is written into the VAST XML in the {@code AdParameters} section.
     * This attribute is optional.
     */
    public java.lang.String getCustomParameters() {
        return customParameters;
    }


    /**
     * Sets the customParameters value for this VpaidLinearCreative.
     * 
     * @param customParameters   * A string that is supplied to the VPAID creative's init function.
     * This is written into the VAST XML in the {@code AdParameters} section.
     * This attribute is optional.
     */
    public void setCustomParameters(java.lang.String customParameters) {
        this.customParameters = customParameters;
    }


    /**
     * Gets the duration value for this VpaidLinearCreative.
     * 
     * @return duration   * Duration in milliseconds for the vpaid ad given no user interaction.
     * This attribute is optional.
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this VpaidLinearCreative.
     * 
     * @param duration   * Duration in milliseconds for the vpaid ad given no user interaction.
     * This attribute is optional.
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the vastPreviewUrl value for this VpaidLinearCreative.
     * 
     * @return vastPreviewUrl   * An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only.
     */
    public java.lang.String getVastPreviewUrl() {
        return vastPreviewUrl;
    }


    /**
     * Sets the vastPreviewUrl value for this VpaidLinearCreative.
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
        if (!(obj instanceof VpaidLinearCreative)) return false;
        VpaidLinearCreative other = (VpaidLinearCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.flashName==null && other.getFlashName()==null) || 
             (this.flashName!=null &&
              this.flashName.equals(other.getFlashName()))) &&
            ((this.flashByteArray==null && other.getFlashByteArray()==null) || 
             (this.flashByteArray!=null &&
              java.util.Arrays.equals(this.flashByteArray, other.getFlashByteArray()))) &&
            ((this.overrideSize==null && other.getOverrideSize()==null) || 
             (this.overrideSize!=null &&
              this.overrideSize.equals(other.getOverrideSize()))) &&
            ((this.flashAssetSize==null && other.getFlashAssetSize()==null) || 
             (this.flashAssetSize!=null &&
              this.flashAssetSize.equals(other.getFlashAssetSize()))) &&
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
              this.duration.equals(other.getDuration()))) &&
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
        if (getFlashName() != null) {
            _hashCode += getFlashName().hashCode();
        }
        if (getFlashByteArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlashByteArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlashByteArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverrideSize() != null) {
            _hashCode += getOverrideSize().hashCode();
        }
        if (getFlashAssetSize() != null) {
            _hashCode += getFlashAssetSize().hashCode();
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
        if (getCustomParameters() != null) {
            _hashCode += getCustomParameters().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getVastPreviewUrl() != null) {
            _hashCode += getVastPreviewUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VpaidLinearCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "VpaidLinearCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "flashName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashByteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "flashByteArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "overrideSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashAssetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "flashAssetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionCreativeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "companionCreativeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "trackingUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ConversionEvent_TrackingUrlsMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "customParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vastPreviewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "vastPreviewUrl"));
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

/**
 * VideoRedirectCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201602;


/**
 * A {@code Creative} that contains externally hosted video ads and
 * is served via VAST 2.0 XML.
 */
public class VideoRedirectCreative  extends com.google.api.ads.dfp.axis.v201602.BaseVideoCreative  implements java.io.Serializable {
    /* The video creative assets. */
    private com.google.api.ads.dfp.axis.v201602.VideoRedirectAsset[] videoAssets;

    public VideoRedirectCreative() {
    }

    public VideoRedirectCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201602.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201602.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201602.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201602.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201602.BaseCustomFieldValue[] customFieldValues,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.axis.v201602.DestinationUrlType destinationUrlType,
           java.lang.Integer duration,
           java.lang.Boolean allowDurationOverride,
           com.google.api.ads.dfp.axis.v201602.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           long[] companionCreativeIds,
           java.lang.String customParameters,
           java.lang.String vastPreviewUrl,
           com.google.api.ads.dfp.axis.v201602.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201602.SslManualOverride sslManualOverride,
           com.google.api.ads.dfp.axis.v201602.VideoRedirectAsset[] videoAssets) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            policyViolations,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            destinationUrl,
            destinationUrlType,
            duration,
            allowDurationOverride,
            trackingUrls,
            companionCreativeIds,
            customParameters,
            vastPreviewUrl,
            sslScanResult,
            sslManualOverride);
        this.videoAssets = videoAssets;
    }


    /**
     * Gets the videoAssets value for this VideoRedirectCreative.
     * 
     * @return videoAssets   * The video creative assets.
     */
    public com.google.api.ads.dfp.axis.v201602.VideoRedirectAsset[] getVideoAssets() {
        return videoAssets;
    }


    /**
     * Sets the videoAssets value for this VideoRedirectCreative.
     * 
     * @param videoAssets   * The video creative assets.
     */
    public void setVideoAssets(com.google.api.ads.dfp.axis.v201602.VideoRedirectAsset[] videoAssets) {
        this.videoAssets = videoAssets;
    }

    public com.google.api.ads.dfp.axis.v201602.VideoRedirectAsset getVideoAssets(int i) {
        return this.videoAssets[i];
    }

    public void setVideoAssets(int i, com.google.api.ads.dfp.axis.v201602.VideoRedirectAsset _value) {
        this.videoAssets[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoRedirectCreative)) return false;
        VideoRedirectCreative other = (VideoRedirectCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.videoAssets==null && other.getVideoAssets()==null) || 
             (this.videoAssets!=null &&
              java.util.Arrays.equals(this.videoAssets, other.getVideoAssets())));
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
        if (getVideoAssets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVideoAssets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVideoAssets(), i);
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
        new org.apache.axis.description.TypeDesc(VideoRedirectCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "VideoRedirectCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "videoAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "VideoRedirectAsset"));
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

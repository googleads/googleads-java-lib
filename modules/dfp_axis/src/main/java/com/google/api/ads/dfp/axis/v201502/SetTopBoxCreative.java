/**
 * SetTopBoxCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201502;


/**
 * A {@code Creative} that will be served into cable set-top boxes.
 * There are no assets for this
 *             creative type, as they are hosted by external cable systems.
 */
public class SetTopBoxCreative  extends com.google.api.ads.dfp.axis.v201502.BaseVideoCreative  implements java.io.Serializable {
    /* An external asset identifier that is used in the cable system.
     * This attribute is read-only
     *                     after creation. */
    private java.lang.String externalAssetId;

    /* An identifier for the provider in the cable system. This attribute
     * is read-only after creation. */
    private java.lang.String providerId;

    public SetTopBoxCreative() {
    }

    public SetTopBoxCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201502.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201502.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201502.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201502.BaseCustomFieldValue[] customFieldValues,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.axis.v201502.DestinationUrlType destinationUrlType,
           java.lang.Integer duration,
           java.lang.Boolean allowDurationOverride,
           com.google.api.ads.dfp.axis.v201502.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           long[] companionCreativeIds,
           java.lang.String customParameters,
           java.lang.String vastPreviewUrl,
           com.google.api.ads.dfp.axis.v201502.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201502.SslManualOverride sslManualOverride,
           java.lang.String externalAssetId,
           java.lang.String providerId) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
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
        this.externalAssetId = externalAssetId;
        this.providerId = providerId;
    }


    /**
     * Gets the externalAssetId value for this SetTopBoxCreative.
     * 
     * @return externalAssetId   * An external asset identifier that is used in the cable system.
     * This attribute is read-only
     *                     after creation.
     */
    public java.lang.String getExternalAssetId() {
        return externalAssetId;
    }


    /**
     * Sets the externalAssetId value for this SetTopBoxCreative.
     * 
     * @param externalAssetId   * An external asset identifier that is used in the cable system.
     * This attribute is read-only
     *                     after creation.
     */
    public void setExternalAssetId(java.lang.String externalAssetId) {
        this.externalAssetId = externalAssetId;
    }


    /**
     * Gets the providerId value for this SetTopBoxCreative.
     * 
     * @return providerId   * An identifier for the provider in the cable system. This attribute
     * is read-only after creation.
     */
    public java.lang.String getProviderId() {
        return providerId;
    }


    /**
     * Sets the providerId value for this SetTopBoxCreative.
     * 
     * @param providerId   * An identifier for the provider in the cable system. This attribute
     * is read-only after creation.
     */
    public void setProviderId(java.lang.String providerId) {
        this.providerId = providerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetTopBoxCreative)) return false;
        SetTopBoxCreative other = (SetTopBoxCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.externalAssetId==null && other.getExternalAssetId()==null) || 
             (this.externalAssetId!=null &&
              this.externalAssetId.equals(other.getExternalAssetId()))) &&
            ((this.providerId==null && other.getProviderId()==null) || 
             (this.providerId!=null &&
              this.providerId.equals(other.getProviderId())));
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
        if (getExternalAssetId() != null) {
            _hashCode += getExternalAssetId().hashCode();
        }
        if (getProviderId() != null) {
            _hashCode += getProviderId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetTopBoxCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "SetTopBoxCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalAssetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "externalAssetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "providerId"));
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

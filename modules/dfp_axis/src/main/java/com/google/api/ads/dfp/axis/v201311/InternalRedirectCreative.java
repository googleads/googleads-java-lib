/**
 * InternalRedirectCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


/**
 * A {@code Creative} hosted by either DoubleClick for Advertisers
 * (DFA) or DART
 *             for Publishers.
 *             <p>
 *             Similar to third-party creatives, a DoubleClick tag is
 * used to retrieve a
 *             creative asset. However, DoubleClick tags are not sent
 * to the user's browser.
 *             Instead, they are processed internally within the DoubleClick
 * system..
 */
public class InternalRedirectCreative  extends com.google.api.ads.dfp.axis.v201311.Creative  implements java.io.Serializable {
    /* The asset size of an internal redirect creative.
     *                     Note that this may differ from {@code size} if
     * users set {@code overrideSize} to true.
     *                     This attribute is read-only and is populated 
     * by Google. */
    private com.google.api.ads.dfp.axis.v201311.Size assetSize;

    /* The internal redirect URL of the DFA or DART for Publishers
     * hosted creative.
     *                     This attribute is required and has a maximum length
     * of 1024 characters. */
    private java.lang.String internalRedirectUrl;

    /* Allows the creative size to differ from the actual size specified
     * in the
     *                     internal redirect's url. This attribute is optional. */
    private java.lang.Boolean overrideSize;

    /* {@code true} if this internal redirect creative is interstitial. */
    private java.lang.Boolean isInterstitial;

    public InternalRedirectCreative() {
    }

    public InternalRedirectCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201311.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201311.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201311.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201311.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           com.google.api.ads.dfp.axis.v201311.Size assetSize,
           java.lang.String internalRedirectUrl,
           java.lang.Boolean overrideSize,
           java.lang.Boolean isInterstitial) {
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
        this.assetSize = assetSize;
        this.internalRedirectUrl = internalRedirectUrl;
        this.overrideSize = overrideSize;
        this.isInterstitial = isInterstitial;
    }


    /**
     * Gets the assetSize value for this InternalRedirectCreative.
     * 
     * @return assetSize   * The asset size of an internal redirect creative.
     *                     Note that this may differ from {@code size} if
     * users set {@code overrideSize} to true.
     *                     This attribute is read-only and is populated 
     * by Google.
     */
    public com.google.api.ads.dfp.axis.v201311.Size getAssetSize() {
        return assetSize;
    }


    /**
     * Sets the assetSize value for this InternalRedirectCreative.
     * 
     * @param assetSize   * The asset size of an internal redirect creative.
     *                     Note that this may differ from {@code size} if
     * users set {@code overrideSize} to true.
     *                     This attribute is read-only and is populated 
     * by Google.
     */
    public void setAssetSize(com.google.api.ads.dfp.axis.v201311.Size assetSize) {
        this.assetSize = assetSize;
    }


    /**
     * Gets the internalRedirectUrl value for this InternalRedirectCreative.
     * 
     * @return internalRedirectUrl   * The internal redirect URL of the DFA or DART for Publishers
     * hosted creative.
     *                     This attribute is required and has a maximum length
     * of 1024 characters.
     */
    public java.lang.String getInternalRedirectUrl() {
        return internalRedirectUrl;
    }


    /**
     * Sets the internalRedirectUrl value for this InternalRedirectCreative.
     * 
     * @param internalRedirectUrl   * The internal redirect URL of the DFA or DART for Publishers
     * hosted creative.
     *                     This attribute is required and has a maximum length
     * of 1024 characters.
     */
    public void setInternalRedirectUrl(java.lang.String internalRedirectUrl) {
        this.internalRedirectUrl = internalRedirectUrl;
    }


    /**
     * Gets the overrideSize value for this InternalRedirectCreative.
     * 
     * @return overrideSize   * Allows the creative size to differ from the actual size specified
     * in the
     *                     internal redirect's url. This attribute is optional.
     */
    public java.lang.Boolean getOverrideSize() {
        return overrideSize;
    }


    /**
     * Sets the overrideSize value for this InternalRedirectCreative.
     * 
     * @param overrideSize   * Allows the creative size to differ from the actual size specified
     * in the
     *                     internal redirect's url. This attribute is optional.
     */
    public void setOverrideSize(java.lang.Boolean overrideSize) {
        this.overrideSize = overrideSize;
    }


    /**
     * Gets the isInterstitial value for this InternalRedirectCreative.
     * 
     * @return isInterstitial   * {@code true} if this internal redirect creative is interstitial.
     */
    public java.lang.Boolean getIsInterstitial() {
        return isInterstitial;
    }


    /**
     * Sets the isInterstitial value for this InternalRedirectCreative.
     * 
     * @param isInterstitial   * {@code true} if this internal redirect creative is interstitial.
     */
    public void setIsInterstitial(java.lang.Boolean isInterstitial) {
        this.isInterstitial = isInterstitial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternalRedirectCreative)) return false;
        InternalRedirectCreative other = (InternalRedirectCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assetSize==null && other.getAssetSize()==null) || 
             (this.assetSize!=null &&
              this.assetSize.equals(other.getAssetSize()))) &&
            ((this.internalRedirectUrl==null && other.getInternalRedirectUrl()==null) || 
             (this.internalRedirectUrl!=null &&
              this.internalRedirectUrl.equals(other.getInternalRedirectUrl()))) &&
            ((this.overrideSize==null && other.getOverrideSize()==null) || 
             (this.overrideSize!=null &&
              this.overrideSize.equals(other.getOverrideSize()))) &&
            ((this.isInterstitial==null && other.getIsInterstitial()==null) || 
             (this.isInterstitial!=null &&
              this.isInterstitial.equals(other.getIsInterstitial())));
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
        if (getAssetSize() != null) {
            _hashCode += getAssetSize().hashCode();
        }
        if (getInternalRedirectUrl() != null) {
            _hashCode += getInternalRedirectUrl().hashCode();
        }
        if (getOverrideSize() != null) {
            _hashCode += getOverrideSize().hashCode();
        }
        if (getIsInterstitial() != null) {
            _hashCode += getIsInterstitial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternalRedirectCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "InternalRedirectCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "assetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalRedirectUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "internalRedirectUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "overrideSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInterstitial");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "isInterstitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

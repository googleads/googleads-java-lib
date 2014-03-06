/**
 * HTMLCreativeFlashAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class HTMLCreativeFlashAsset  extends com.google.api.ads.dfa.axis.v1_19.HTMLCreativeAsset  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.FlashClickTag[] clickTags;

    private int flashVersion;

    private com.google.api.ads.dfa.axis.v1_19.Dimensions frameSize;

    public HTMLCreativeFlashAsset() {
    }

    public HTMLCreativeFlashAsset(
           java.lang.String assetFilename,
           com.google.api.ads.dfa.axis.v1_19.FlashClickTag[] clickTags,
           int flashVersion,
           com.google.api.ads.dfa.axis.v1_19.Dimensions frameSize) {
        super(
            assetFilename);
        this.clickTags = clickTags;
        this.flashVersion = flashVersion;
        this.frameSize = frameSize;
    }


    /**
     * Gets the clickTags value for this HTMLCreativeFlashAsset.
     * 
     * @return clickTags
     */
    public com.google.api.ads.dfa.axis.v1_19.FlashClickTag[] getClickTags() {
        return clickTags;
    }


    /**
     * Sets the clickTags value for this HTMLCreativeFlashAsset.
     * 
     * @param clickTags
     */
    public void setClickTags(com.google.api.ads.dfa.axis.v1_19.FlashClickTag[] clickTags) {
        this.clickTags = clickTags;
    }


    /**
     * Gets the flashVersion value for this HTMLCreativeFlashAsset.
     * 
     * @return flashVersion
     */
    public int getFlashVersion() {
        return flashVersion;
    }


    /**
     * Sets the flashVersion value for this HTMLCreativeFlashAsset.
     * 
     * @param flashVersion
     */
    public void setFlashVersion(int flashVersion) {
        this.flashVersion = flashVersion;
    }


    /**
     * Gets the frameSize value for this HTMLCreativeFlashAsset.
     * 
     * @return frameSize
     */
    public com.google.api.ads.dfa.axis.v1_19.Dimensions getFrameSize() {
        return frameSize;
    }


    /**
     * Sets the frameSize value for this HTMLCreativeFlashAsset.
     * 
     * @param frameSize
     */
    public void setFrameSize(com.google.api.ads.dfa.axis.v1_19.Dimensions frameSize) {
        this.frameSize = frameSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HTMLCreativeFlashAsset)) return false;
        HTMLCreativeFlashAsset other = (HTMLCreativeFlashAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.clickTags==null && other.getClickTags()==null) || 
             (this.clickTags!=null &&
              java.util.Arrays.equals(this.clickTags, other.getClickTags()))) &&
            this.flashVersion == other.getFlashVersion() &&
            ((this.frameSize==null && other.getFrameSize()==null) || 
             (this.frameSize!=null &&
              this.frameSize.equals(other.getFrameSize())));
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
        if (getClickTags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClickTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClickTags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getFlashVersion();
        if (getFrameSize() != null) {
            _hashCode += getFrameSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HTMLCreativeFlashAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "HTMLCreativeFlashAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickTags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "FlashClickTag"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flashVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frameSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frameSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Dimensions"));
        elemField.setNillable(true);
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

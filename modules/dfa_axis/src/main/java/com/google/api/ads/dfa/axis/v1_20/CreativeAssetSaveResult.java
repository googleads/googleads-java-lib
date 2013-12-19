/**
 * CreativeAssetSaveResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeAssetSaveResult  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.FlashClickTag[] clickTags;

    private int flashVersion;

    private com.google.api.ads.dfa.axis.v1_20.Dimensions frameSize;

    private java.lang.String savedFilename;

    private com.google.api.ads.dfa.axis.v1_20.Size size;

    private java.lang.String url;

    public CreativeAssetSaveResult() {
    }

    public CreativeAssetSaveResult(
           com.google.api.ads.dfa.axis.v1_20.FlashClickTag[] clickTags,
           int flashVersion,
           com.google.api.ads.dfa.axis.v1_20.Dimensions frameSize,
           java.lang.String savedFilename,
           com.google.api.ads.dfa.axis.v1_20.Size size,
           java.lang.String url) {
           this.clickTags = clickTags;
           this.flashVersion = flashVersion;
           this.frameSize = frameSize;
           this.savedFilename = savedFilename;
           this.size = size;
           this.url = url;
    }


    /**
     * Gets the clickTags value for this CreativeAssetSaveResult.
     * 
     * @return clickTags
     */
    public com.google.api.ads.dfa.axis.v1_20.FlashClickTag[] getClickTags() {
        return clickTags;
    }


    /**
     * Sets the clickTags value for this CreativeAssetSaveResult.
     * 
     * @param clickTags
     */
    public void setClickTags(com.google.api.ads.dfa.axis.v1_20.FlashClickTag[] clickTags) {
        this.clickTags = clickTags;
    }


    /**
     * Gets the flashVersion value for this CreativeAssetSaveResult.
     * 
     * @return flashVersion
     */
    public int getFlashVersion() {
        return flashVersion;
    }


    /**
     * Sets the flashVersion value for this CreativeAssetSaveResult.
     * 
     * @param flashVersion
     */
    public void setFlashVersion(int flashVersion) {
        this.flashVersion = flashVersion;
    }


    /**
     * Gets the frameSize value for this CreativeAssetSaveResult.
     * 
     * @return frameSize
     */
    public com.google.api.ads.dfa.axis.v1_20.Dimensions getFrameSize() {
        return frameSize;
    }


    /**
     * Sets the frameSize value for this CreativeAssetSaveResult.
     * 
     * @param frameSize
     */
    public void setFrameSize(com.google.api.ads.dfa.axis.v1_20.Dimensions frameSize) {
        this.frameSize = frameSize;
    }


    /**
     * Gets the savedFilename value for this CreativeAssetSaveResult.
     * 
     * @return savedFilename
     */
    public java.lang.String getSavedFilename() {
        return savedFilename;
    }


    /**
     * Sets the savedFilename value for this CreativeAssetSaveResult.
     * 
     * @param savedFilename
     */
    public void setSavedFilename(java.lang.String savedFilename) {
        this.savedFilename = savedFilename;
    }


    /**
     * Gets the size value for this CreativeAssetSaveResult.
     * 
     * @return size
     */
    public com.google.api.ads.dfa.axis.v1_20.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this CreativeAssetSaveResult.
     * 
     * @param size
     */
    public void setSize(com.google.api.ads.dfa.axis.v1_20.Size size) {
        this.size = size;
    }


    /**
     * Gets the url value for this CreativeAssetSaveResult.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this CreativeAssetSaveResult.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeAssetSaveResult)) return false;
        CreativeAssetSaveResult other = (CreativeAssetSaveResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clickTags==null && other.getClickTags()==null) || 
             (this.clickTags!=null &&
              java.util.Arrays.equals(this.clickTags, other.getClickTags()))) &&
            this.flashVersion == other.getFlashVersion() &&
            ((this.frameSize==null && other.getFrameSize()==null) || 
             (this.frameSize!=null &&
              this.frameSize.equals(other.getFrameSize()))) &&
            ((this.savedFilename==null && other.getSavedFilename()==null) || 
             (this.savedFilename!=null &&
              this.savedFilename.equals(other.getSavedFilename()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getSavedFilename() != null) {
            _hashCode += getSavedFilename().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeAssetSaveResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAssetSaveResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickTags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FlashClickTag"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Dimensions"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savedFilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "savedFilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Size"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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

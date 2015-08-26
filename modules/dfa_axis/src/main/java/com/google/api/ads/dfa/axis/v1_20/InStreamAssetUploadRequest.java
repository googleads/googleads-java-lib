/**
 * InStreamAssetUploadRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class InStreamAssetUploadRequest  implements java.io.Serializable {
    private boolean companion;

    private long creativeId;

    private com.google.api.ads.dfa.axis.v1_20.CreativeAsset inStreamAsset;

    private boolean mediaFile;

    private boolean nonLinear;

    public InStreamAssetUploadRequest() {
    }

    public InStreamAssetUploadRequest(
           boolean companion,
           long creativeId,
           com.google.api.ads.dfa.axis.v1_20.CreativeAsset inStreamAsset,
           boolean mediaFile,
           boolean nonLinear) {
           this.companion = companion;
           this.creativeId = creativeId;
           this.inStreamAsset = inStreamAsset;
           this.mediaFile = mediaFile;
           this.nonLinear = nonLinear;
    }


    /**
     * Gets the companion value for this InStreamAssetUploadRequest.
     * 
     * @return companion
     */
    public boolean isCompanion() {
        return companion;
    }


    /**
     * Sets the companion value for this InStreamAssetUploadRequest.
     * 
     * @param companion
     */
    public void setCompanion(boolean companion) {
        this.companion = companion;
    }


    /**
     * Gets the creativeId value for this InStreamAssetUploadRequest.
     * 
     * @return creativeId
     */
    public long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this InStreamAssetUploadRequest.
     * 
     * @param creativeId
     */
    public void setCreativeId(long creativeId) {
        this.creativeId = creativeId;
    }


    /**
     * Gets the inStreamAsset value for this InStreamAssetUploadRequest.
     * 
     * @return inStreamAsset
     */
    public com.google.api.ads.dfa.axis.v1_20.CreativeAsset getInStreamAsset() {
        return inStreamAsset;
    }


    /**
     * Sets the inStreamAsset value for this InStreamAssetUploadRequest.
     * 
     * @param inStreamAsset
     */
    public void setInStreamAsset(com.google.api.ads.dfa.axis.v1_20.CreativeAsset inStreamAsset) {
        this.inStreamAsset = inStreamAsset;
    }


    /**
     * Gets the mediaFile value for this InStreamAssetUploadRequest.
     * 
     * @return mediaFile
     */
    public boolean isMediaFile() {
        return mediaFile;
    }


    /**
     * Sets the mediaFile value for this InStreamAssetUploadRequest.
     * 
     * @param mediaFile
     */
    public void setMediaFile(boolean mediaFile) {
        this.mediaFile = mediaFile;
    }


    /**
     * Gets the nonLinear value for this InStreamAssetUploadRequest.
     * 
     * @return nonLinear
     */
    public boolean isNonLinear() {
        return nonLinear;
    }


    /**
     * Sets the nonLinear value for this InStreamAssetUploadRequest.
     * 
     * @param nonLinear
     */
    public void setNonLinear(boolean nonLinear) {
        this.nonLinear = nonLinear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InStreamAssetUploadRequest)) return false;
        InStreamAssetUploadRequest other = (InStreamAssetUploadRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.companion == other.isCompanion() &&
            this.creativeId == other.getCreativeId() &&
            ((this.inStreamAsset==null && other.getInStreamAsset()==null) || 
             (this.inStreamAsset!=null &&
              this.inStreamAsset.equals(other.getInStreamAsset()))) &&
            this.mediaFile == other.isMediaFile() &&
            this.nonLinear == other.isNonLinear();
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
        _hashCode += (isCompanion() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getCreativeId()).hashCode();
        if (getInStreamAsset() != null) {
            _hashCode += getInStreamAsset().hashCode();
        }
        _hashCode += (isMediaFile() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNonLinear() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InStreamAssetUploadRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamAssetUploadRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inStreamAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inStreamAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAsset"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonLinear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonLinear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

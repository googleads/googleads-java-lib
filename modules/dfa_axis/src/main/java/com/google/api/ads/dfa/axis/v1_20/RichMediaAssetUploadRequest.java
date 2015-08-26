/**
 * RichMediaAssetUploadRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class RichMediaAssetUploadRequest  implements java.io.Serializable {
    private java.lang.String assetFileName;

    private long creativeId;

    private byte[] fileData;

    private int parentAssetId;

    public RichMediaAssetUploadRequest() {
    }

    public RichMediaAssetUploadRequest(
           java.lang.String assetFileName,
           long creativeId,
           byte[] fileData,
           int parentAssetId) {
           this.assetFileName = assetFileName;
           this.creativeId = creativeId;
           this.fileData = fileData;
           this.parentAssetId = parentAssetId;
    }


    /**
     * Gets the assetFileName value for this RichMediaAssetUploadRequest.
     * 
     * @return assetFileName
     */
    public java.lang.String getAssetFileName() {
        return assetFileName;
    }


    /**
     * Sets the assetFileName value for this RichMediaAssetUploadRequest.
     * 
     * @param assetFileName
     */
    public void setAssetFileName(java.lang.String assetFileName) {
        this.assetFileName = assetFileName;
    }


    /**
     * Gets the creativeId value for this RichMediaAssetUploadRequest.
     * 
     * @return creativeId
     */
    public long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this RichMediaAssetUploadRequest.
     * 
     * @param creativeId
     */
    public void setCreativeId(long creativeId) {
        this.creativeId = creativeId;
    }


    /**
     * Gets the fileData value for this RichMediaAssetUploadRequest.
     * 
     * @return fileData
     */
    public byte[] getFileData() {
        return fileData;
    }


    /**
     * Sets the fileData value for this RichMediaAssetUploadRequest.
     * 
     * @param fileData
     */
    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }


    /**
     * Gets the parentAssetId value for this RichMediaAssetUploadRequest.
     * 
     * @return parentAssetId
     */
    public int getParentAssetId() {
        return parentAssetId;
    }


    /**
     * Sets the parentAssetId value for this RichMediaAssetUploadRequest.
     * 
     * @param parentAssetId
     */
    public void setParentAssetId(int parentAssetId) {
        this.parentAssetId = parentAssetId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaAssetUploadRequest)) return false;
        RichMediaAssetUploadRequest other = (RichMediaAssetUploadRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetFileName==null && other.getAssetFileName()==null) || 
             (this.assetFileName!=null &&
              this.assetFileName.equals(other.getAssetFileName()))) &&
            this.creativeId == other.getCreativeId() &&
            ((this.fileData==null && other.getFileData()==null) || 
             (this.fileData!=null &&
              java.util.Arrays.equals(this.fileData, other.getFileData()))) &&
            this.parentAssetId == other.getParentAssetId();
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
        if (getAssetFileName() != null) {
            _hashCode += getAssetFileName().hashCode();
        }
        _hashCode += new Long(getCreativeId()).hashCode();
        if (getFileData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getParentAssetId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaAssetUploadRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaAssetUploadRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentAssetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentAssetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

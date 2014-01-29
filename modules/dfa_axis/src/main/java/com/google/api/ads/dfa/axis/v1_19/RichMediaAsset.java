/**
 * RichMediaAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class RichMediaAsset  implements java.io.Serializable {
    private java.lang.String fileName;

    private int fileSize;

    private long id;

    private long parentAssetId;

    private java.lang.String type;

    public RichMediaAsset() {
    }

    public RichMediaAsset(
           java.lang.String fileName,
           int fileSize,
           long id,
           long parentAssetId,
           java.lang.String type) {
           this.fileName = fileName;
           this.fileSize = fileSize;
           this.id = id;
           this.parentAssetId = parentAssetId;
           this.type = type;
    }


    /**
     * Gets the fileName value for this RichMediaAsset.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this RichMediaAsset.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileSize value for this RichMediaAsset.
     * 
     * @return fileSize
     */
    public int getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this RichMediaAsset.
     * 
     * @param fileSize
     */
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the id value for this RichMediaAsset.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this RichMediaAsset.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the parentAssetId value for this RichMediaAsset.
     * 
     * @return parentAssetId
     */
    public long getParentAssetId() {
        return parentAssetId;
    }


    /**
     * Sets the parentAssetId value for this RichMediaAsset.
     * 
     * @param parentAssetId
     */
    public void setParentAssetId(long parentAssetId) {
        this.parentAssetId = parentAssetId;
    }


    /**
     * Gets the type value for this RichMediaAsset.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this RichMediaAsset.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaAsset)) return false;
        RichMediaAsset other = (RichMediaAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            this.fileSize == other.getFileSize() &&
            this.id == other.getId() &&
            this.parentAssetId == other.getParentAssetId() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        _hashCode += getFileSize();
        _hashCode += new Long(getId()).hashCode();
        _hashCode += new Long(getParentAssetId()).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentAssetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentAssetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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

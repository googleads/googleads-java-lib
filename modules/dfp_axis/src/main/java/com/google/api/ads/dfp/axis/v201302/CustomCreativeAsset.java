/**
 * CustomCreativeAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201302;


/**
 * A {@code CustomCreativeAsset} is an association between a
 *             {@link CustomCreative} and an asset. Any assets that are
 * associated with a
 *             creative can be inserted into its HTML snippet.
 */
public class CustomCreativeAsset  implements java.io.Serializable {
    /* The name by which the associated asset will be referenced.
     * For example,
     *                 if the value is "foo", then the asset can be inserted
     * into an HTML snippet
     *                 using the macro: "%%FILE:foo%%". */
    private java.lang.String macroName;

    /* The ID of the associated asset. This attribute is read-only
     * and is populated by Google. */
    private java.lang.Long assetId;

    /* The content of the asset as a byte array. This attribute is
     * required when creating
     *                 a new {@code CustomCreativeAsset}.
     *                 <p/>
     *                 When updating the content, pass a new byte array,
     * and set {@code assetId} to null.
     *                 Otherwise, this field can be null.
     *                 <p/>
     *                 The {@code assetByteArray} will be {@code null} when
     * the
     *                 {@code CustomCreativeAsset} is retrieved. */
    private byte[] assetByteArray;

    /* The file name of the asset. This attribute is required when
     * creating a new asset (e.g. when assetByteArray is not null). */
    private java.lang.String fileName;

    /* The file size of the asset, in bytes. This attribute is read-only. */
    private java.lang.Long fileSize;

    public CustomCreativeAsset() {
    }

    public CustomCreativeAsset(
           java.lang.String macroName,
           java.lang.Long assetId,
           byte[] assetByteArray,
           java.lang.String fileName,
           java.lang.Long fileSize) {
           this.macroName = macroName;
           this.assetId = assetId;
           this.assetByteArray = assetByteArray;
           this.fileName = fileName;
           this.fileSize = fileSize;
    }


    /**
     * Gets the macroName value for this CustomCreativeAsset.
     * 
     * @return macroName   * The name by which the associated asset will be referenced.
     * For example,
     *                 if the value is "foo", then the asset can be inserted
     * into an HTML snippet
     *                 using the macro: "%%FILE:foo%%".
     */
    public java.lang.String getMacroName() {
        return macroName;
    }


    /**
     * Sets the macroName value for this CustomCreativeAsset.
     * 
     * @param macroName   * The name by which the associated asset will be referenced.
     * For example,
     *                 if the value is "foo", then the asset can be inserted
     * into an HTML snippet
     *                 using the macro: "%%FILE:foo%%".
     */
    public void setMacroName(java.lang.String macroName) {
        this.macroName = macroName;
    }


    /**
     * Gets the assetId value for this CustomCreativeAsset.
     * 
     * @return assetId   * The ID of the associated asset. This attribute is read-only
     * and is populated by Google.
     */
    public java.lang.Long getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this CustomCreativeAsset.
     * 
     * @param assetId   * The ID of the associated asset. This attribute is read-only
     * and is populated by Google.
     */
    public void setAssetId(java.lang.Long assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the assetByteArray value for this CustomCreativeAsset.
     * 
     * @return assetByteArray   * The content of the asset as a byte array. This attribute is
     * required when creating
     *                 a new {@code CustomCreativeAsset}.
     *                 <p/>
     *                 When updating the content, pass a new byte array,
     * and set {@code assetId} to null.
     *                 Otherwise, this field can be null.
     *                 <p/>
     *                 The {@code assetByteArray} will be {@code null} when
     * the
     *                 {@code CustomCreativeAsset} is retrieved.
     */
    public byte[] getAssetByteArray() {
        return assetByteArray;
    }


    /**
     * Sets the assetByteArray value for this CustomCreativeAsset.
     * 
     * @param assetByteArray   * The content of the asset as a byte array. This attribute is
     * required when creating
     *                 a new {@code CustomCreativeAsset}.
     *                 <p/>
     *                 When updating the content, pass a new byte array,
     * and set {@code assetId} to null.
     *                 Otherwise, this field can be null.
     *                 <p/>
     *                 The {@code assetByteArray} will be {@code null} when
     * the
     *                 {@code CustomCreativeAsset} is retrieved.
     */
    public void setAssetByteArray(byte[] assetByteArray) {
        this.assetByteArray = assetByteArray;
    }


    /**
     * Gets the fileName value for this CustomCreativeAsset.
     * 
     * @return fileName   * The file name of the asset. This attribute is required when
     * creating a new asset (e.g. when assetByteArray is not null).
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this CustomCreativeAsset.
     * 
     * @param fileName   * The file name of the asset. This attribute is required when
     * creating a new asset (e.g. when assetByteArray is not null).
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileSize value for this CustomCreativeAsset.
     * 
     * @return fileSize   * The file size of the asset, in bytes. This attribute is read-only.
     */
    public java.lang.Long getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this CustomCreativeAsset.
     * 
     * @param fileSize   * The file size of the asset, in bytes. This attribute is read-only.
     */
    public void setFileSize(java.lang.Long fileSize) {
        this.fileSize = fileSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomCreativeAsset)) return false;
        CustomCreativeAsset other = (CustomCreativeAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.macroName==null && other.getMacroName()==null) || 
             (this.macroName!=null &&
              this.macroName.equals(other.getMacroName()))) &&
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.assetByteArray==null && other.getAssetByteArray()==null) || 
             (this.assetByteArray!=null &&
              java.util.Arrays.equals(this.assetByteArray, other.getAssetByteArray()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize())));
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
        if (getMacroName() != null) {
            _hashCode += getMacroName().hashCode();
        }
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getAssetByteArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssetByteArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssetByteArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomCreativeAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "CustomCreativeAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macroName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "macroName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "assetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetByteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "assetByteArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

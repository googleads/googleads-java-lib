/**
 * AssetCreativeTemplateVariableValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;


/**
 * Stores values of {@link CreativeTemplateVariable} of {@link VariableType#ASSET}.
 */
public class AssetCreativeTemplateVariableValue  extends com.google.api.ads.dfp.axis.v201411.BaseCreativeTemplateVariableValue  implements java.io.Serializable {
    /* The ID of the associated asset. This attribute is read-only
     * and is populated by Google. */
    private java.lang.Long assetId;

    /* The content of the asset as a byte array. This attribute is
     * required when creating
     *                     a new {@code TemplateCreative}.
     *                     <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@code assetId} to null.
     *                     Otherwise, this field can be null.
     *                     <p/>
     *                     The {@code assetByteArray} will be {@code null}
     * when the {@code TemplateCreative} is retrieved. */
    private byte[] assetByteArray;

    /* The file name of the asset. This attribute is required when
     * creating a new asset (e.g. when assetByteArray is not null). */
    private java.lang.String fileName;

    public AssetCreativeTemplateVariableValue() {
    }

    public AssetCreativeTemplateVariableValue(
           java.lang.String uniqueName,
           java.lang.String baseCreativeTemplateVariableValueType,
           java.lang.Long assetId,
           byte[] assetByteArray,
           java.lang.String fileName) {
        super(
            uniqueName,
            baseCreativeTemplateVariableValueType);
        this.assetId = assetId;
        this.assetByteArray = assetByteArray;
        this.fileName = fileName;
    }


    /**
     * Gets the assetId value for this AssetCreativeTemplateVariableValue.
     * 
     * @return assetId   * The ID of the associated asset. This attribute is read-only
     * and is populated by Google.
     */
    public java.lang.Long getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this AssetCreativeTemplateVariableValue.
     * 
     * @param assetId   * The ID of the associated asset. This attribute is read-only
     * and is populated by Google.
     */
    public void setAssetId(java.lang.Long assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the assetByteArray value for this AssetCreativeTemplateVariableValue.
     * 
     * @return assetByteArray   * The content of the asset as a byte array. This attribute is
     * required when creating
     *                     a new {@code TemplateCreative}.
     *                     <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@code assetId} to null.
     *                     Otherwise, this field can be null.
     *                     <p/>
     *                     The {@code assetByteArray} will be {@code null}
     * when the {@code TemplateCreative} is retrieved.
     */
    public byte[] getAssetByteArray() {
        return assetByteArray;
    }


    /**
     * Sets the assetByteArray value for this AssetCreativeTemplateVariableValue.
     * 
     * @param assetByteArray   * The content of the asset as a byte array. This attribute is
     * required when creating
     *                     a new {@code TemplateCreative}.
     *                     <p/>
     *                     When updating the content, pass a new byte array,
     * and set {@code assetId} to null.
     *                     Otherwise, this field can be null.
     *                     <p/>
     *                     The {@code assetByteArray} will be {@code null}
     * when the {@code TemplateCreative} is retrieved.
     */
    public void setAssetByteArray(byte[] assetByteArray) {
        this.assetByteArray = assetByteArray;
    }


    /**
     * Gets the fileName value for this AssetCreativeTemplateVariableValue.
     * 
     * @return fileName   * The file name of the asset. This attribute is required when
     * creating a new asset (e.g. when assetByteArray is not null).
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this AssetCreativeTemplateVariableValue.
     * 
     * @param fileName   * The file name of the asset. This attribute is required when
     * creating a new asset (e.g. when assetByteArray is not null).
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssetCreativeTemplateVariableValue)) return false;
        AssetCreativeTemplateVariableValue other = (AssetCreativeTemplateVariableValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.assetByteArray==null && other.getAssetByteArray()==null) || 
             (this.assetByteArray!=null &&
              java.util.Arrays.equals(this.assetByteArray, other.getAssetByteArray()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssetCreativeTemplateVariableValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "AssetCreativeTemplateVariableValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "assetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetByteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "assetByteArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "fileName"));
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

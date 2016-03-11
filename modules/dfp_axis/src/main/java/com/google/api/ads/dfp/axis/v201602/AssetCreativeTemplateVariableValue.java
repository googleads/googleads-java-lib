/**
 * AssetCreativeTemplateVariableValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201602;


/**
 * Stores values of {@link CreativeTemplateVariable} of {@link VariableType#ASSET}.
 */
public class AssetCreativeTemplateVariableValue  extends com.google.api.ads.dfp.axis.v201602.BaseCreativeTemplateVariableValue  implements java.io.Serializable {
    /* The associated asset. This attribute is required when creating
     * a new {@code TemplateCreative}.
     *                     To view the asset, use {@link CreativeAsset#assetUrl}. */
    private com.google.api.ads.dfp.axis.v201602.CreativeAsset asset;

    public AssetCreativeTemplateVariableValue() {
    }

    public AssetCreativeTemplateVariableValue(
           java.lang.String uniqueName,
           com.google.api.ads.dfp.axis.v201602.CreativeAsset asset) {
        super(
            uniqueName);
        this.asset = asset;
    }


    /**
     * Gets the asset value for this AssetCreativeTemplateVariableValue.
     * 
     * @return asset   * The associated asset. This attribute is required when creating
     * a new {@code TemplateCreative}.
     *                     To view the asset, use {@link CreativeAsset#assetUrl}.
     */
    public com.google.api.ads.dfp.axis.v201602.CreativeAsset getAsset() {
        return asset;
    }


    /**
     * Sets the asset value for this AssetCreativeTemplateVariableValue.
     * 
     * @param asset   * The associated asset. This attribute is required when creating
     * a new {@code TemplateCreative}.
     *                     To view the asset, use {@link CreativeAsset#assetUrl}.
     */
    public void setAsset(com.google.api.ads.dfp.axis.v201602.CreativeAsset asset) {
        this.asset = asset;
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
            ((this.asset==null && other.getAsset()==null) || 
             (this.asset!=null &&
              this.asset.equals(other.getAsset())));
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
        if (getAsset() != null) {
            _hashCode += getAsset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssetCreativeTemplateVariableValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "AssetCreativeTemplateVariableValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "asset"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "CreativeAsset"));
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

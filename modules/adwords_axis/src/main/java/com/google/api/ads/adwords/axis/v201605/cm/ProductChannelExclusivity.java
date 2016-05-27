/**
 * ProductChannelExclusivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;


/**
 * The product channel exclusivity dimension, which limits the availability
 * of an offer between only
 *             local, only online, or both. Only supported by campaigns
 * of
 *             {@link AdvertisingChannelType#SHOPPING}.
 */
public class ProductChannelExclusivity  extends com.google.api.ads.adwords.axis.v201605.cm.ProductDimension  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201605.cm.ShoppingProductChannelExclusivity channelExclusivity;

    public ProductChannelExclusivity() {
    }

    public ProductChannelExclusivity(
           java.lang.String productDimensionType,
           com.google.api.ads.adwords.axis.v201605.cm.ShoppingProductChannelExclusivity channelExclusivity) {
        super(
            productDimensionType);
        this.channelExclusivity = channelExclusivity;
    }


    /**
     * Gets the channelExclusivity value for this ProductChannelExclusivity.
     * 
     * @return channelExclusivity
     */
    public com.google.api.ads.adwords.axis.v201605.cm.ShoppingProductChannelExclusivity getChannelExclusivity() {
        return channelExclusivity;
    }


    /**
     * Sets the channelExclusivity value for this ProductChannelExclusivity.
     * 
     * @param channelExclusivity
     */
    public void setChannelExclusivity(com.google.api.ads.adwords.axis.v201605.cm.ShoppingProductChannelExclusivity channelExclusivity) {
        this.channelExclusivity = channelExclusivity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductChannelExclusivity)) return false;
        ProductChannelExclusivity other = (ProductChannelExclusivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.channelExclusivity==null && other.getChannelExclusivity()==null) || 
             (this.channelExclusivity!=null &&
              this.channelExclusivity.equals(other.getChannelExclusivity())));
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
        if (getChannelExclusivity() != null) {
            _hashCode += getChannelExclusivity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductChannelExclusivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "ProductChannelExclusivity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelExclusivity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "channelExclusivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "ShoppingProductChannelExclusivity"));
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

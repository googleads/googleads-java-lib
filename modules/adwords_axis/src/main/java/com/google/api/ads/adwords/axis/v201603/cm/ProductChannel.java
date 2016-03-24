/**
 * ProductChannel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201603.cm;


/**
 * The product channel dimension, which specifies the locality of
 * an offer. Only supported by
 *             campaigns of {@link AdvertisingChannelType#SHOPPING}.
 */
public class ProductChannel  extends com.google.api.ads.adwords.axis.v201603.cm.ProductDimension  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201603.cm.ShoppingProductChannel channel;

    public ProductChannel() {
    }

    public ProductChannel(
           java.lang.String productDimensionType,
           com.google.api.ads.adwords.axis.v201603.cm.ShoppingProductChannel channel) {
        super(
            productDimensionType);
        this.channel = channel;
    }


    /**
     * Gets the channel value for this ProductChannel.
     * 
     * @return channel
     */
    public com.google.api.ads.adwords.axis.v201603.cm.ShoppingProductChannel getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this ProductChannel.
     * 
     * @param channel
     */
    public void setChannel(com.google.api.ads.adwords.axis.v201603.cm.ShoppingProductChannel channel) {
        this.channel = channel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductChannel)) return false;
        ProductChannel other = (ProductChannel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel())));
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
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductChannel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "ProductChannel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "ShoppingProductChannel"));
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

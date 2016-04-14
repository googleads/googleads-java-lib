/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.dmp;

public class Product implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Product(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID = "INVALID";
    public static final java.lang.String _ADX_BUYER = "ADX_BUYER";
    public static final java.lang.String _ADX_PUBLISHER = "ADX_PUBLISHER";
    public static final java.lang.String _DFP_BY_GOOGLE = "DFP_BY_GOOGLE";
    public static final java.lang.String _DFP = "DFP";
    public static final java.lang.String _INVITE_ADVERTISER = "INVITE_ADVERTISER";
    public static final java.lang.String _INVITE_PARTNER = "INVITE_PARTNER";
    public static final java.lang.String _GOOGLE_RESELLER = "GOOGLE_RESELLER";
    public static final java.lang.String _ADWORDS = "ADWORDS";
    public static final Product INVALID = new Product(_INVALID);
    public static final Product ADX_BUYER = new Product(_ADX_BUYER);
    public static final Product ADX_PUBLISHER = new Product(_ADX_PUBLISHER);
    public static final Product DFP_BY_GOOGLE = new Product(_DFP_BY_GOOGLE);
    public static final Product DFP = new Product(_DFP);
    public static final Product INVITE_ADVERTISER = new Product(_INVITE_ADVERTISER);
    public static final Product INVITE_PARTNER = new Product(_INVITE_PARTNER);
    public static final Product GOOGLE_RESELLER = new Product(_GOOGLE_RESELLER);
    public static final Product ADWORDS = new Product(_ADWORDS);
    public java.lang.String getValue() { return _value_;}
    public static Product fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Product enumeration = (Product)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Product fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "Product"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

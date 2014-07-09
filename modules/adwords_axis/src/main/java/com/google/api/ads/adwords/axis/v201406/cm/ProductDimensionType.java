/**
 * ProductDimensionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.cm;

public class ProductDimensionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProductDimensionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _BIDDING_CATEGORY_L1 = "BIDDING_CATEGORY_L1";
    public static final java.lang.String _BIDDING_CATEGORY_L2 = "BIDDING_CATEGORY_L2";
    public static final java.lang.String _BIDDING_CATEGORY_L3 = "BIDDING_CATEGORY_L3";
    public static final java.lang.String _BIDDING_CATEGORY_L4 = "BIDDING_CATEGORY_L4";
    public static final java.lang.String _BIDDING_CATEGORY_L5 = "BIDDING_CATEGORY_L5";
    public static final java.lang.String _BRAND = "BRAND";
    public static final java.lang.String _CANONICAL_CONDITION = "CANONICAL_CONDITION";
    public static final java.lang.String _CUSTOM_ATTRIBUTE_0 = "CUSTOM_ATTRIBUTE_0";
    public static final java.lang.String _CUSTOM_ATTRIBUTE_1 = "CUSTOM_ATTRIBUTE_1";
    public static final java.lang.String _CUSTOM_ATTRIBUTE_2 = "CUSTOM_ATTRIBUTE_2";
    public static final java.lang.String _CUSTOM_ATTRIBUTE_3 = "CUSTOM_ATTRIBUTE_3";
    public static final java.lang.String _CUSTOM_ATTRIBUTE_4 = "CUSTOM_ATTRIBUTE_4";
    public static final java.lang.String _OFFER_ID = "OFFER_ID";
    public static final java.lang.String _PRODUCT_TYPE_L1 = "PRODUCT_TYPE_L1";
    public static final java.lang.String _PRODUCT_TYPE_L2 = "PRODUCT_TYPE_L2";
    public static final java.lang.String _PRODUCT_TYPE_L3 = "PRODUCT_TYPE_L3";
    public static final java.lang.String _PRODUCT_TYPE_L4 = "PRODUCT_TYPE_L4";
    public static final java.lang.String _PRODUCT_TYPE_L5 = "PRODUCT_TYPE_L5";
    public static final ProductDimensionType UNKNOWN = new ProductDimensionType(_UNKNOWN);
    public static final ProductDimensionType BIDDING_CATEGORY_L1 = new ProductDimensionType(_BIDDING_CATEGORY_L1);
    public static final ProductDimensionType BIDDING_CATEGORY_L2 = new ProductDimensionType(_BIDDING_CATEGORY_L2);
    public static final ProductDimensionType BIDDING_CATEGORY_L3 = new ProductDimensionType(_BIDDING_CATEGORY_L3);
    public static final ProductDimensionType BIDDING_CATEGORY_L4 = new ProductDimensionType(_BIDDING_CATEGORY_L4);
    public static final ProductDimensionType BIDDING_CATEGORY_L5 = new ProductDimensionType(_BIDDING_CATEGORY_L5);
    public static final ProductDimensionType BRAND = new ProductDimensionType(_BRAND);
    public static final ProductDimensionType CANONICAL_CONDITION = new ProductDimensionType(_CANONICAL_CONDITION);
    public static final ProductDimensionType CUSTOM_ATTRIBUTE_0 = new ProductDimensionType(_CUSTOM_ATTRIBUTE_0);
    public static final ProductDimensionType CUSTOM_ATTRIBUTE_1 = new ProductDimensionType(_CUSTOM_ATTRIBUTE_1);
    public static final ProductDimensionType CUSTOM_ATTRIBUTE_2 = new ProductDimensionType(_CUSTOM_ATTRIBUTE_2);
    public static final ProductDimensionType CUSTOM_ATTRIBUTE_3 = new ProductDimensionType(_CUSTOM_ATTRIBUTE_3);
    public static final ProductDimensionType CUSTOM_ATTRIBUTE_4 = new ProductDimensionType(_CUSTOM_ATTRIBUTE_4);
    public static final ProductDimensionType OFFER_ID = new ProductDimensionType(_OFFER_ID);
    public static final ProductDimensionType PRODUCT_TYPE_L1 = new ProductDimensionType(_PRODUCT_TYPE_L1);
    public static final ProductDimensionType PRODUCT_TYPE_L2 = new ProductDimensionType(_PRODUCT_TYPE_L2);
    public static final ProductDimensionType PRODUCT_TYPE_L3 = new ProductDimensionType(_PRODUCT_TYPE_L3);
    public static final ProductDimensionType PRODUCT_TYPE_L4 = new ProductDimensionType(_PRODUCT_TYPE_L4);
    public static final ProductDimensionType PRODUCT_TYPE_L5 = new ProductDimensionType(_PRODUCT_TYPE_L5);
    public java.lang.String getValue() { return _value_;}
    public static ProductDimensionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProductDimensionType enumeration = (ProductDimensionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProductDimensionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProductDimensionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "ProductDimensionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

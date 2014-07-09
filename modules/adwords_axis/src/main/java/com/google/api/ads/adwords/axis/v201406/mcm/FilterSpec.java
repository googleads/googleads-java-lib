/**
 * FilterSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.mcm;

public class FilterSpec implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FilterSpec(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALL = "ALL";
    public static final java.lang.String _ONLY_SUBMANAGERS = "ONLY_SUBMANAGERS";
    public static final java.lang.String _ONLY_LEAF_CLIENTS = "ONLY_LEAF_CLIENTS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final FilterSpec ALL = new FilterSpec(_ALL);
    public static final FilterSpec ONLY_SUBMANAGERS = new FilterSpec(_ONLY_SUBMANAGERS);
    public static final FilterSpec ONLY_LEAF_CLIENTS = new FilterSpec(_ONLY_LEAF_CLIENTS);
    public static final FilterSpec UNKNOWN = new FilterSpec(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static FilterSpec fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FilterSpec enumeration = (FilterSpec)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FilterSpec fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FilterSpec.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "FilterSpec"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

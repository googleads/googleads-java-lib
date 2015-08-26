/**
 * SharedAdUnitStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;

public class SharedAdUnitStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SharedAdUnitStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PENDING = "PENDING";
    public static final java.lang.String _APPROVED = "APPROVED";
    public static final java.lang.String _REJECTED = "REJECTED";
    public static final java.lang.String _UNSHARED = "UNSHARED";
    public static final java.lang.String _PLACEHOLDER = "PLACEHOLDER";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final SharedAdUnitStatus PENDING = new SharedAdUnitStatus(_PENDING);
    public static final SharedAdUnitStatus APPROVED = new SharedAdUnitStatus(_APPROVED);
    public static final SharedAdUnitStatus REJECTED = new SharedAdUnitStatus(_REJECTED);
    public static final SharedAdUnitStatus UNSHARED = new SharedAdUnitStatus(_UNSHARED);
    public static final SharedAdUnitStatus PLACEHOLDER = new SharedAdUnitStatus(_PLACEHOLDER);
    public static final SharedAdUnitStatus UNKNOWN = new SharedAdUnitStatus(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static SharedAdUnitStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SharedAdUnitStatus enumeration = (SharedAdUnitStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SharedAdUnitStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SharedAdUnitStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "SharedAdUnitStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * SharedSetErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;

public class SharedSetErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SharedSetErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CUSTOMER_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE = "CUSTOMER_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE";
    public static final java.lang.String _DUPLICATE_NAME = "DUPLICATE_NAME";
    public static final java.lang.String _EXCEEDS_MAX_SHARED_SETS_FOR_TYPE = "EXCEEDS_MAX_SHARED_SETS_FOR_TYPE";
    public static final java.lang.String _INVALID_SET_NAME = "INVALID_SET_NAME";
    public static final java.lang.String _SHARED_SET_DELETED = "SHARED_SET_DELETED";
    public static final java.lang.String _SHARED_SET_IN_USE = "SHARED_SET_IN_USE";
    public static final java.lang.String _TYPE_CANNOT_BE_CHANGED = "TYPE_CANNOT_BE_CHANGED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final SharedSetErrorReason CUSTOMER_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE = new SharedSetErrorReason(_CUSTOMER_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE);
    public static final SharedSetErrorReason DUPLICATE_NAME = new SharedSetErrorReason(_DUPLICATE_NAME);
    public static final SharedSetErrorReason EXCEEDS_MAX_SHARED_SETS_FOR_TYPE = new SharedSetErrorReason(_EXCEEDS_MAX_SHARED_SETS_FOR_TYPE);
    public static final SharedSetErrorReason INVALID_SET_NAME = new SharedSetErrorReason(_INVALID_SET_NAME);
    public static final SharedSetErrorReason SHARED_SET_DELETED = new SharedSetErrorReason(_SHARED_SET_DELETED);
    public static final SharedSetErrorReason SHARED_SET_IN_USE = new SharedSetErrorReason(_SHARED_SET_IN_USE);
    public static final SharedSetErrorReason TYPE_CANNOT_BE_CHANGED = new SharedSetErrorReason(_TYPE_CANNOT_BE_CHANGED);
    public static final SharedSetErrorReason UNKNOWN = new SharedSetErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static SharedSetErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SharedSetErrorReason enumeration = (SharedSetErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SharedSetErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SharedSetErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "SharedSetError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

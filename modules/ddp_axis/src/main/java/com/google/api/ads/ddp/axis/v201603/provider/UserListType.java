/**
 * UserListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.provider;

public class UserListType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserListType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _REMARKETING = "REMARKETING";
    public static final java.lang.String _LOGICAL = "LOGICAL";
    public static final java.lang.String _EXTERNAL_REMARKETING = "EXTERNAL_REMARKETING";
    public static final java.lang.String _RULE_BASED = "RULE_BASED";
    public static final java.lang.String _SIMILAR = "SIMILAR";
    public static final java.lang.String _CRM_BASED = "CRM_BASED";
    public static final UserListType UNKNOWN = new UserListType(_UNKNOWN);
    public static final UserListType REMARKETING = new UserListType(_REMARKETING);
    public static final UserListType LOGICAL = new UserListType(_LOGICAL);
    public static final UserListType EXTERNAL_REMARKETING = new UserListType(_EXTERNAL_REMARKETING);
    public static final UserListType RULE_BASED = new UserListType(_RULE_BASED);
    public static final UserListType SIMILAR = new UserListType(_SIMILAR);
    public static final UserListType CRM_BASED = new UserListType(_CRM_BASED);
    public java.lang.String getValue() { return _value_;}
    public static UserListType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UserListType enumeration = (UserListType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UserListType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UserListType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "UserListType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

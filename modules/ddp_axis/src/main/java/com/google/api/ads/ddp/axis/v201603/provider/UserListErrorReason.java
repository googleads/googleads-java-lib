/**
 * UserListErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.provider;

public class UserListErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserListErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EXTERNAL_REMARKETING_USER_LIST_MUTATE_NOT_SUPPORTED = "EXTERNAL_REMARKETING_USER_LIST_MUTATE_NOT_SUPPORTED";
    public static final java.lang.String _CONCRETE_TYPE_REQUIRED = "CONCRETE_TYPE_REQUIRED";
    public static final java.lang.String _CONVERSION_TYPE_ID_REQUIRED = "CONVERSION_TYPE_ID_REQUIRED";
    public static final java.lang.String _DUPLICATE_CONVERSION_TYPES = "DUPLICATE_CONVERSION_TYPES";
    public static final java.lang.String _INVALID_CONVERSION_TYPE = "INVALID_CONVERSION_TYPE";
    public static final java.lang.String _INVALID_DESCRIPTION = "INVALID_DESCRIPTION";
    public static final java.lang.String _INVALID_NAME = "INVALID_NAME";
    public static final java.lang.String _INVALID_TYPE = "INVALID_TYPE";
    public static final java.lang.String _INVALID_USER_LIST_LOGICAL_RULE_OPERAND = "INVALID_USER_LIST_LOGICAL_RULE_OPERAND";
    public static final java.lang.String _NAME_ALREADY_USED = "NAME_ALREADY_USED";
    public static final java.lang.String _NEW_CONVERSION_TYPE_NAME_REQUIRED = "NEW_CONVERSION_TYPE_NAME_REQUIRED";
    public static final java.lang.String _OWNERSHIP_REQUIRED_FOR_SET = "OWNERSHIP_REQUIRED_FOR_SET";
    public static final java.lang.String _REMOVE_NOT_SUPPORTED = "REMOVE_NOT_SUPPORTED";
    public static final java.lang.String _USER_LIST_MUTATE_NOT_SUPPORTED = "USER_LIST_MUTATE_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_RULE = "INVALID_RULE";
    public static final java.lang.String _INVALID_DATE_RANGE = "INVALID_DATE_RANGE";
    public static final java.lang.String _OPT_OUT_LINK_IS_NOT_VALID = "OPT_OUT_LINK_IS_NOT_VALID";
    public static final java.lang.String _MAX_NUM_RULEBASED_USERLISTS = "MAX_NUM_RULEBASED_USERLISTS";
    public static final java.lang.String _USER_LIST_SERVICE_ERROR = "USER_LIST_SERVICE_ERROR";
    public static final UserListErrorReason EXTERNAL_REMARKETING_USER_LIST_MUTATE_NOT_SUPPORTED = new UserListErrorReason(_EXTERNAL_REMARKETING_USER_LIST_MUTATE_NOT_SUPPORTED);
    public static final UserListErrorReason CONCRETE_TYPE_REQUIRED = new UserListErrorReason(_CONCRETE_TYPE_REQUIRED);
    public static final UserListErrorReason CONVERSION_TYPE_ID_REQUIRED = new UserListErrorReason(_CONVERSION_TYPE_ID_REQUIRED);
    public static final UserListErrorReason DUPLICATE_CONVERSION_TYPES = new UserListErrorReason(_DUPLICATE_CONVERSION_TYPES);
    public static final UserListErrorReason INVALID_CONVERSION_TYPE = new UserListErrorReason(_INVALID_CONVERSION_TYPE);
    public static final UserListErrorReason INVALID_DESCRIPTION = new UserListErrorReason(_INVALID_DESCRIPTION);
    public static final UserListErrorReason INVALID_NAME = new UserListErrorReason(_INVALID_NAME);
    public static final UserListErrorReason INVALID_TYPE = new UserListErrorReason(_INVALID_TYPE);
    public static final UserListErrorReason INVALID_USER_LIST_LOGICAL_RULE_OPERAND = new UserListErrorReason(_INVALID_USER_LIST_LOGICAL_RULE_OPERAND);
    public static final UserListErrorReason NAME_ALREADY_USED = new UserListErrorReason(_NAME_ALREADY_USED);
    public static final UserListErrorReason NEW_CONVERSION_TYPE_NAME_REQUIRED = new UserListErrorReason(_NEW_CONVERSION_TYPE_NAME_REQUIRED);
    public static final UserListErrorReason OWNERSHIP_REQUIRED_FOR_SET = new UserListErrorReason(_OWNERSHIP_REQUIRED_FOR_SET);
    public static final UserListErrorReason REMOVE_NOT_SUPPORTED = new UserListErrorReason(_REMOVE_NOT_SUPPORTED);
    public static final UserListErrorReason USER_LIST_MUTATE_NOT_SUPPORTED = new UserListErrorReason(_USER_LIST_MUTATE_NOT_SUPPORTED);
    public static final UserListErrorReason INVALID_RULE = new UserListErrorReason(_INVALID_RULE);
    public static final UserListErrorReason INVALID_DATE_RANGE = new UserListErrorReason(_INVALID_DATE_RANGE);
    public static final UserListErrorReason OPT_OUT_LINK_IS_NOT_VALID = new UserListErrorReason(_OPT_OUT_LINK_IS_NOT_VALID);
    public static final UserListErrorReason MAX_NUM_RULEBASED_USERLISTS = new UserListErrorReason(_MAX_NUM_RULEBASED_USERLISTS);
    public static final UserListErrorReason USER_LIST_SERVICE_ERROR = new UserListErrorReason(_USER_LIST_SERVICE_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static UserListErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UserListErrorReason enumeration = (UserListErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UserListErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UserListErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "UserListError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

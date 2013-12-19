/**
 * OperationAccessDeniedReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

public class OperationAccessDeniedReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OperationAccessDeniedReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACTION_NOT_PERMITTED = "ACTION_NOT_PERMITTED";
    public static final java.lang.String _ADD_OPERATION_NOT_PERMITTED = "ADD_OPERATION_NOT_PERMITTED";
    public static final java.lang.String _REMOVE_OPERATION_NOT_PERMITTED = "REMOVE_OPERATION_NOT_PERMITTED";
    public static final java.lang.String _SET_OPERATION_NOT_PERMITTED = "SET_OPERATION_NOT_PERMITTED";
    public static final java.lang.String _MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT = "MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT";
    public static final java.lang.String _OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE = "OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final OperationAccessDeniedReason ACTION_NOT_PERMITTED = new OperationAccessDeniedReason(_ACTION_NOT_PERMITTED);
    public static final OperationAccessDeniedReason ADD_OPERATION_NOT_PERMITTED = new OperationAccessDeniedReason(_ADD_OPERATION_NOT_PERMITTED);
    public static final OperationAccessDeniedReason REMOVE_OPERATION_NOT_PERMITTED = new OperationAccessDeniedReason(_REMOVE_OPERATION_NOT_PERMITTED);
    public static final OperationAccessDeniedReason SET_OPERATION_NOT_PERMITTED = new OperationAccessDeniedReason(_SET_OPERATION_NOT_PERMITTED);
    public static final OperationAccessDeniedReason MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT = new OperationAccessDeniedReason(_MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT);
    public static final OperationAccessDeniedReason OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE = new OperationAccessDeniedReason(_OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE);
    public static final OperationAccessDeniedReason UNKNOWN = new OperationAccessDeniedReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static OperationAccessDeniedReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OperationAccessDeniedReason enumeration = (OperationAccessDeniedReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OperationAccessDeniedReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OperationAccessDeniedReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "OperationAccessDenied.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * ManagedCustomerServiceErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.mcm;

public class ManagedCustomerServiceErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagedCustomerServiceErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _NOT_AUTHORIZED = "NOT_AUTHORIZED";
    public static final java.lang.String _INVALID_SELECTOR = "INVALID_SELECTOR";
    public static final java.lang.String _INVALID_TIMEZONE = "INVALID_TIMEZONE";
    public static final java.lang.String _INVALID_CURRENCY = "INVALID_CURRENCY";
    public static final java.lang.String _INVALID_DESCRIPTIVE_NAME = "INVALID_DESCRIPTIVE_NAME";
    public static final java.lang.String _ADD_CUSTOMER_FAILURE = "ADD_CUSTOMER_FAILURE";
    public static final java.lang.String _SAVE_CUSTOMERS_FAILURE = "SAVE_CUSTOMERS_FAILURE";
    public static final java.lang.String _ALREADY_MANAGED_BY_THIS_MANAGER = "ALREADY_MANAGED_BY_THIS_MANAGER";
    public static final java.lang.String _ALREADY_INVITED_BY_THIS_MANAGER = "ALREADY_INVITED_BY_THIS_MANAGER";
    public static final java.lang.String _NO_PENDING_INVITATION = "NO_PENDING_INVITATION";
    public static final java.lang.String _TEST_ACCOUNT_LINK_ERROR = "TEST_ACCOUNT_LINK_ERROR";
    public static final ManagedCustomerServiceErrorReason UNKNOWN = new ManagedCustomerServiceErrorReason(_UNKNOWN);
    public static final ManagedCustomerServiceErrorReason NOT_AUTHORIZED = new ManagedCustomerServiceErrorReason(_NOT_AUTHORIZED);
    public static final ManagedCustomerServiceErrorReason INVALID_SELECTOR = new ManagedCustomerServiceErrorReason(_INVALID_SELECTOR);
    public static final ManagedCustomerServiceErrorReason INVALID_TIMEZONE = new ManagedCustomerServiceErrorReason(_INVALID_TIMEZONE);
    public static final ManagedCustomerServiceErrorReason INVALID_CURRENCY = new ManagedCustomerServiceErrorReason(_INVALID_CURRENCY);
    public static final ManagedCustomerServiceErrorReason INVALID_DESCRIPTIVE_NAME = new ManagedCustomerServiceErrorReason(_INVALID_DESCRIPTIVE_NAME);
    public static final ManagedCustomerServiceErrorReason ADD_CUSTOMER_FAILURE = new ManagedCustomerServiceErrorReason(_ADD_CUSTOMER_FAILURE);
    public static final ManagedCustomerServiceErrorReason SAVE_CUSTOMERS_FAILURE = new ManagedCustomerServiceErrorReason(_SAVE_CUSTOMERS_FAILURE);
    public static final ManagedCustomerServiceErrorReason ALREADY_MANAGED_BY_THIS_MANAGER = new ManagedCustomerServiceErrorReason(_ALREADY_MANAGED_BY_THIS_MANAGER);
    public static final ManagedCustomerServiceErrorReason ALREADY_INVITED_BY_THIS_MANAGER = new ManagedCustomerServiceErrorReason(_ALREADY_INVITED_BY_THIS_MANAGER);
    public static final ManagedCustomerServiceErrorReason NO_PENDING_INVITATION = new ManagedCustomerServiceErrorReason(_NO_PENDING_INVITATION);
    public static final ManagedCustomerServiceErrorReason TEST_ACCOUNT_LINK_ERROR = new ManagedCustomerServiceErrorReason(_TEST_ACCOUNT_LINK_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static ManagedCustomerServiceErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagedCustomerServiceErrorReason enumeration = (ManagedCustomerServiceErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManagedCustomerServiceErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManagedCustomerServiceErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201402", "ManagedCustomerServiceError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

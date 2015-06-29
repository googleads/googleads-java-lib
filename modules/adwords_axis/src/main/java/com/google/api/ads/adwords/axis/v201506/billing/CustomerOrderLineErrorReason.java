/**
 * CustomerOrderLineErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201506.billing;

public class CustomerOrderLineErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerOrderLineErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_ORDER_LINE_ID = "INVALID_ORDER_LINE_ID";
    public static final java.lang.String _END_DATE_BEFORE_START_DATE = "END_DATE_BEFORE_START_DATE";
    public static final java.lang.String _NEGATIVE_SPEND = "NEGATIVE_SPEND";
    public static final java.lang.String _CREATE_IN_PAST = "CREATE_IN_PAST";
    public static final java.lang.String _ALREADY_STARTED = "ALREADY_STARTED";
    public static final java.lang.String _ALREADY_SPENT = "ALREADY_SPENT";
    public static final java.lang.String _FINISHED_IN_THE_PAST = "FINISHED_IN_THE_PAST";
    public static final java.lang.String _CANCEL_ACTIVE = "CANCEL_ACTIVE";
    public static final java.lang.String _OVERLAP_DATE_RANGE = "OVERLAP_DATE_RANGE";
    public static final java.lang.String _COS_CHANGE = "COS_CHANGE";
    public static final java.lang.String _NON_ADWORDS = "NON_ADWORDS";
    public static final java.lang.String _START_DATE_AFTER_ACTUAL = "START_DATE_AFTER_ACTUAL";
    public static final java.lang.String _END_DATE_PAST_MAX = "END_DATE_PAST_MAX";
    public static final java.lang.String _PARENT_IS_SELF = "PARENT_IS_SELF";
    public static final java.lang.String _CANNOT_CANCEL_NEW = "CANNOT_CANCEL_NEW";
    public static final java.lang.String _CANNOT_CANCEL_STARTED = "CANNOT_CANCEL_STARTED";
    public static final java.lang.String _CANNOT_PROMOTE_NON_PENDING_ORDERLINE = "CANNOT_PROMOTE_NON_PENDING_ORDERLINE";
    public static final java.lang.String _UPDATE_ORDERLINE_WILL_SHIFT_CURRENT = "UPDATE_ORDERLINE_WILL_SHIFT_CURRENT";
    public static final java.lang.String _ORDERLINE_BEING_MODIFIED_IS_NOT_NORMAL_OR_PENDING = "ORDERLINE_BEING_MODIFIED_IS_NOT_NORMAL_OR_PENDING";
    public static final java.lang.String _INVALID_STATUS_CHANGE = "INVALID_STATUS_CHANGE";
    public static final java.lang.String _MORE_THAN_ONE_OPERATION_NOT_PERMITTED = "MORE_THAN_ONE_OPERATION_NOT_PERMITTED";
    public static final java.lang.String _INVALID_TIMEZONE_IN_DATE_RANGES = "INVALID_TIMEZONE_IN_DATE_RANGES";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CustomerOrderLineErrorReason INVALID_ORDER_LINE_ID = new CustomerOrderLineErrorReason(_INVALID_ORDER_LINE_ID);
    public static final CustomerOrderLineErrorReason END_DATE_BEFORE_START_DATE = new CustomerOrderLineErrorReason(_END_DATE_BEFORE_START_DATE);
    public static final CustomerOrderLineErrorReason NEGATIVE_SPEND = new CustomerOrderLineErrorReason(_NEGATIVE_SPEND);
    public static final CustomerOrderLineErrorReason CREATE_IN_PAST = new CustomerOrderLineErrorReason(_CREATE_IN_PAST);
    public static final CustomerOrderLineErrorReason ALREADY_STARTED = new CustomerOrderLineErrorReason(_ALREADY_STARTED);
    public static final CustomerOrderLineErrorReason ALREADY_SPENT = new CustomerOrderLineErrorReason(_ALREADY_SPENT);
    public static final CustomerOrderLineErrorReason FINISHED_IN_THE_PAST = new CustomerOrderLineErrorReason(_FINISHED_IN_THE_PAST);
    public static final CustomerOrderLineErrorReason CANCEL_ACTIVE = new CustomerOrderLineErrorReason(_CANCEL_ACTIVE);
    public static final CustomerOrderLineErrorReason OVERLAP_DATE_RANGE = new CustomerOrderLineErrorReason(_OVERLAP_DATE_RANGE);
    public static final CustomerOrderLineErrorReason COS_CHANGE = new CustomerOrderLineErrorReason(_COS_CHANGE);
    public static final CustomerOrderLineErrorReason NON_ADWORDS = new CustomerOrderLineErrorReason(_NON_ADWORDS);
    public static final CustomerOrderLineErrorReason START_DATE_AFTER_ACTUAL = new CustomerOrderLineErrorReason(_START_DATE_AFTER_ACTUAL);
    public static final CustomerOrderLineErrorReason END_DATE_PAST_MAX = new CustomerOrderLineErrorReason(_END_DATE_PAST_MAX);
    public static final CustomerOrderLineErrorReason PARENT_IS_SELF = new CustomerOrderLineErrorReason(_PARENT_IS_SELF);
    public static final CustomerOrderLineErrorReason CANNOT_CANCEL_NEW = new CustomerOrderLineErrorReason(_CANNOT_CANCEL_NEW);
    public static final CustomerOrderLineErrorReason CANNOT_CANCEL_STARTED = new CustomerOrderLineErrorReason(_CANNOT_CANCEL_STARTED);
    public static final CustomerOrderLineErrorReason CANNOT_PROMOTE_NON_PENDING_ORDERLINE = new CustomerOrderLineErrorReason(_CANNOT_PROMOTE_NON_PENDING_ORDERLINE);
    public static final CustomerOrderLineErrorReason UPDATE_ORDERLINE_WILL_SHIFT_CURRENT = new CustomerOrderLineErrorReason(_UPDATE_ORDERLINE_WILL_SHIFT_CURRENT);
    public static final CustomerOrderLineErrorReason ORDERLINE_BEING_MODIFIED_IS_NOT_NORMAL_OR_PENDING = new CustomerOrderLineErrorReason(_ORDERLINE_BEING_MODIFIED_IS_NOT_NORMAL_OR_PENDING);
    public static final CustomerOrderLineErrorReason INVALID_STATUS_CHANGE = new CustomerOrderLineErrorReason(_INVALID_STATUS_CHANGE);
    public static final CustomerOrderLineErrorReason MORE_THAN_ONE_OPERATION_NOT_PERMITTED = new CustomerOrderLineErrorReason(_MORE_THAN_ONE_OPERATION_NOT_PERMITTED);
    public static final CustomerOrderLineErrorReason INVALID_TIMEZONE_IN_DATE_RANGES = new CustomerOrderLineErrorReason(_INVALID_TIMEZONE_IN_DATE_RANGES);
    public static final CustomerOrderLineErrorReason UNKNOWN = new CustomerOrderLineErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CustomerOrderLineErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerOrderLineErrorReason enumeration = (CustomerOrderLineErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerOrderLineErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerOrderLineErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201506", "CustomerOrderLineError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

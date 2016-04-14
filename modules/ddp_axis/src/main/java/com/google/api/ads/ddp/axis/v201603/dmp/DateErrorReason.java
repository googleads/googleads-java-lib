/**
 * DateErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.dmp;

public class DateErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DateErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_FIELD_VALUES_IN_DATE = "INVALID_FIELD_VALUES_IN_DATE";
    public static final java.lang.String _INVALID_FIELD_VALUES_IN_DATE_TIME = "INVALID_FIELD_VALUES_IN_DATE_TIME";
    public static final java.lang.String _INVALID_STRING_DATE = "INVALID_STRING_DATE";
    public static final java.lang.String _INVALID_STRING_DATE_RANGE = "INVALID_STRING_DATE_RANGE";
    public static final java.lang.String _INVALID_STRING_DATE_TIME = "INVALID_STRING_DATE_TIME";
    public static final java.lang.String _EARLIER_THAN_MINIMUM_DATE = "EARLIER_THAN_MINIMUM_DATE";
    public static final java.lang.String _LATER_THAN_MAXIMUM_DATE = "LATER_THAN_MAXIMUM_DATE";
    public static final java.lang.String _DATE_RANGE_MINIMUM_DATE_LATER_THAN_MAXIMUM_DATE = "DATE_RANGE_MINIMUM_DATE_LATER_THAN_MAXIMUM_DATE";
    public static final java.lang.String _DATE_RANGE_MINIMUM_AND_MAXIMUM_DATES_BOTH_NULL = "DATE_RANGE_MINIMUM_AND_MAXIMUM_DATES_BOTH_NULL";
    public static final DateErrorReason INVALID_FIELD_VALUES_IN_DATE = new DateErrorReason(_INVALID_FIELD_VALUES_IN_DATE);
    public static final DateErrorReason INVALID_FIELD_VALUES_IN_DATE_TIME = new DateErrorReason(_INVALID_FIELD_VALUES_IN_DATE_TIME);
    public static final DateErrorReason INVALID_STRING_DATE = new DateErrorReason(_INVALID_STRING_DATE);
    public static final DateErrorReason INVALID_STRING_DATE_RANGE = new DateErrorReason(_INVALID_STRING_DATE_RANGE);
    public static final DateErrorReason INVALID_STRING_DATE_TIME = new DateErrorReason(_INVALID_STRING_DATE_TIME);
    public static final DateErrorReason EARLIER_THAN_MINIMUM_DATE = new DateErrorReason(_EARLIER_THAN_MINIMUM_DATE);
    public static final DateErrorReason LATER_THAN_MAXIMUM_DATE = new DateErrorReason(_LATER_THAN_MAXIMUM_DATE);
    public static final DateErrorReason DATE_RANGE_MINIMUM_DATE_LATER_THAN_MAXIMUM_DATE = new DateErrorReason(_DATE_RANGE_MINIMUM_DATE_LATER_THAN_MAXIMUM_DATE);
    public static final DateErrorReason DATE_RANGE_MINIMUM_AND_MAXIMUM_DATES_BOTH_NULL = new DateErrorReason(_DATE_RANGE_MINIMUM_AND_MAXIMUM_DATES_BOTH_NULL);
    public java.lang.String getValue() { return _value_;}
    public static DateErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DateErrorReason enumeration = (DateErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DateErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DateErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "DateError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

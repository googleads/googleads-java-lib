/**
 * ExpressBusinessErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.express;

public class ExpressBusinessErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ExpressBusinessErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_WEBSITE = "INVALID_WEBSITE";
    public static final java.lang.String _INVALID_ADDRESS = "INVALID_ADDRESS";
    public static final java.lang.String _INVALID_PHONE_NUMBER = "INVALID_PHONE_NUMBER";
    public static final java.lang.String _PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED = "PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ExpressBusinessErrorReason INVALID_WEBSITE = new ExpressBusinessErrorReason(_INVALID_WEBSITE);
    public static final ExpressBusinessErrorReason INVALID_ADDRESS = new ExpressBusinessErrorReason(_INVALID_ADDRESS);
    public static final ExpressBusinessErrorReason INVALID_PHONE_NUMBER = new ExpressBusinessErrorReason(_INVALID_PHONE_NUMBER);
    public static final ExpressBusinessErrorReason PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED = new ExpressBusinessErrorReason(_PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED);
    public static final ExpressBusinessErrorReason UNKNOWN = new ExpressBusinessErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ExpressBusinessErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ExpressBusinessErrorReason enumeration = (ExpressBusinessErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ExpressBusinessErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ExpressBusinessErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "ExpressBusinessError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

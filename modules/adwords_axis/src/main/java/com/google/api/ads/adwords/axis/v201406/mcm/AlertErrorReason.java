/**
 * AlertErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.mcm;

public class AlertErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlertErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO_CLIENT_IDS_SELECTED = "NO_CLIENT_IDS_SELECTED";
    public static final java.lang.String _INVALID_CLIENT_ID_SELECTED = "INVALID_CLIENT_ID_SELECTED";
    public static final java.lang.String _INVALID_CLIENT_ID_FORMAT = "INVALID_CLIENT_ID_FORMAT";
    public static final java.lang.String _UNAVAILABLE = "UNAVAILABLE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AlertErrorReason NO_CLIENT_IDS_SELECTED = new AlertErrorReason(_NO_CLIENT_IDS_SELECTED);
    public static final AlertErrorReason INVALID_CLIENT_ID_SELECTED = new AlertErrorReason(_INVALID_CLIENT_ID_SELECTED);
    public static final AlertErrorReason INVALID_CLIENT_ID_FORMAT = new AlertErrorReason(_INVALID_CLIENT_ID_FORMAT);
    public static final AlertErrorReason UNAVAILABLE = new AlertErrorReason(_UNAVAILABLE);
    public static final AlertErrorReason UNKNOWN = new AlertErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AlertErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlertErrorReason enumeration = (AlertErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlertErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlertErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "AlertError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

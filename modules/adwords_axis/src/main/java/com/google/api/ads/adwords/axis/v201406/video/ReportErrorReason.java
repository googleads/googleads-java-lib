/**
 * ReportErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class ReportErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReportErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _CRITERIA_TYPE_NOT_SUPPORTED = "CRITERIA_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_TARGETING_GROUP_ID_COUNT = "INVALID_TARGETING_GROUP_ID_COUNT";
    public static final java.lang.String _NO_STATS_SELECTOR = "NO_STATS_SELECTOR";
    public static final ReportErrorReason UNKNOWN = new ReportErrorReason(_UNKNOWN);
    public static final ReportErrorReason CRITERIA_TYPE_NOT_SUPPORTED = new ReportErrorReason(_CRITERIA_TYPE_NOT_SUPPORTED);
    public static final ReportErrorReason INVALID_TARGETING_GROUP_ID_COUNT = new ReportErrorReason(_INVALID_TARGETING_GROUP_ID_COUNT);
    public static final ReportErrorReason NO_STATS_SELECTOR = new ReportErrorReason(_NO_STATS_SELECTOR);
    public java.lang.String getValue() { return _value_;}
    public static ReportErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReportErrorReason enumeration = (ReportErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReportErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReportErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ReportError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * VideoBiddingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class VideoBiddingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoBiddingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BID_AMOUNT_REQUIRED = "BID_AMOUNT_REQUIRED";
    public static final java.lang.String _BID_TOO_SMALL = "BID_TOO_SMALL";
    public static final java.lang.String _BID_TOO_BIG = "BID_TOO_BIG";
    public static final java.lang.String _BID_TOO_MANY_FRACTIONAL_DIGITS = "BID_TOO_MANY_FRACTIONAL_DIGITS";
    public static final java.lang.String _BID_TOO_HIGH_FOR_DAILY_BUDGET = "BID_TOO_HIGH_FOR_DAILY_BUDGET";
    public static final java.lang.String _NON_POSITIVE_BID = "NON_POSITIVE_BID";
    public static final java.lang.String _BID_FOR_DEPRECATED_FORMAT = "BID_FOR_DEPRECATED_FORMAT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final VideoBiddingErrorReason BID_AMOUNT_REQUIRED = new VideoBiddingErrorReason(_BID_AMOUNT_REQUIRED);
    public static final VideoBiddingErrorReason BID_TOO_SMALL = new VideoBiddingErrorReason(_BID_TOO_SMALL);
    public static final VideoBiddingErrorReason BID_TOO_BIG = new VideoBiddingErrorReason(_BID_TOO_BIG);
    public static final VideoBiddingErrorReason BID_TOO_MANY_FRACTIONAL_DIGITS = new VideoBiddingErrorReason(_BID_TOO_MANY_FRACTIONAL_DIGITS);
    public static final VideoBiddingErrorReason BID_TOO_HIGH_FOR_DAILY_BUDGET = new VideoBiddingErrorReason(_BID_TOO_HIGH_FOR_DAILY_BUDGET);
    public static final VideoBiddingErrorReason NON_POSITIVE_BID = new VideoBiddingErrorReason(_NON_POSITIVE_BID);
    public static final VideoBiddingErrorReason BID_FOR_DEPRECATED_FORMAT = new VideoBiddingErrorReason(_BID_FOR_DEPRECATED_FORMAT);
    public static final VideoBiddingErrorReason UNKNOWN = new VideoBiddingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static VideoBiddingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoBiddingErrorReason enumeration = (VideoBiddingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoBiddingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoBiddingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoBiddingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

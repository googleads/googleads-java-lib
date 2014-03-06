/**
 * PromotionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.express;

public class PromotionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PromotionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BUSINESS_DELETED = "BUSINESS_DELETED";
    public static final java.lang.String _CURRENCY_NOT_SUPPORTED = "CURRENCY_NOT_SUPPORTED";
    public static final java.lang.String _GOOGLE_GRANT_ACCOUNT = "GOOGLE_GRANT_ACCOUNT";
    public static final java.lang.String _AOL_ACCOUNT = "AOL_ACCOUNT";
    public static final java.lang.String _MCC_ACCOUNT = "MCC_ACCOUNT";
    public static final java.lang.String _INVALID_DESTINATION_URL = "INVALID_DESTINATION_URL";
    public static final java.lang.String _CALL_TRACKING_NOT_SUPPORTED = "CALL_TRACKING_NOT_SUPPORTED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final PromotionErrorReason BUSINESS_DELETED = new PromotionErrorReason(_BUSINESS_DELETED);
    public static final PromotionErrorReason CURRENCY_NOT_SUPPORTED = new PromotionErrorReason(_CURRENCY_NOT_SUPPORTED);
    public static final PromotionErrorReason GOOGLE_GRANT_ACCOUNT = new PromotionErrorReason(_GOOGLE_GRANT_ACCOUNT);
    public static final PromotionErrorReason AOL_ACCOUNT = new PromotionErrorReason(_AOL_ACCOUNT);
    public static final PromotionErrorReason MCC_ACCOUNT = new PromotionErrorReason(_MCC_ACCOUNT);
    public static final PromotionErrorReason INVALID_DESTINATION_URL = new PromotionErrorReason(_INVALID_DESTINATION_URL);
    public static final PromotionErrorReason CALL_TRACKING_NOT_SUPPORTED = new PromotionErrorReason(_CALL_TRACKING_NOT_SUPPORTED);
    public static final PromotionErrorReason UNKNOWN = new PromotionErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static PromotionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PromotionErrorReason enumeration = (PromotionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PromotionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PromotionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201402", "PromotionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

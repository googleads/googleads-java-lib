/**
 * RateCardCustomizationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201403;

public class RateCardCustomizationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RateCardCustomizationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_RATE_TYPE = "INVALID_RATE_TYPE";
    public static final java.lang.String _CANNOT_ADD_TO_GROUP_BY_PRICING_METHOD = "CANNOT_ADD_TO_GROUP_BY_PRICING_METHOD";
    public static final java.lang.String _GROUP_FOR_FEATURE_ALREADY_EXISTS = "GROUP_FOR_FEATURE_ALREADY_EXISTS";
    public static final java.lang.String _FEATURE_NOT_BELONGS_TO_GROUP = "FEATURE_NOT_BELONGS_TO_GROUP";
    public static final java.lang.String _SAME_GROUP_DIFFERENT_FEATURE = "SAME_GROUP_DIFFERENT_FEATURE";
    public static final java.lang.String _DIFFERENT_GROUP_SAME_FEATURE = "DIFFERENT_GROUP_SAME_FEATURE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final RateCardCustomizationErrorReason INVALID_RATE_TYPE = new RateCardCustomizationErrorReason(_INVALID_RATE_TYPE);
    public static final RateCardCustomizationErrorReason CANNOT_ADD_TO_GROUP_BY_PRICING_METHOD = new RateCardCustomizationErrorReason(_CANNOT_ADD_TO_GROUP_BY_PRICING_METHOD);
    public static final RateCardCustomizationErrorReason GROUP_FOR_FEATURE_ALREADY_EXISTS = new RateCardCustomizationErrorReason(_GROUP_FOR_FEATURE_ALREADY_EXISTS);
    public static final RateCardCustomizationErrorReason FEATURE_NOT_BELONGS_TO_GROUP = new RateCardCustomizationErrorReason(_FEATURE_NOT_BELONGS_TO_GROUP);
    public static final RateCardCustomizationErrorReason SAME_GROUP_DIFFERENT_FEATURE = new RateCardCustomizationErrorReason(_SAME_GROUP_DIFFERENT_FEATURE);
    public static final RateCardCustomizationErrorReason DIFFERENT_GROUP_SAME_FEATURE = new RateCardCustomizationErrorReason(_DIFFERENT_GROUP_SAME_FEATURE);
    public static final RateCardCustomizationErrorReason UNKNOWN = new RateCardCustomizationErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static RateCardCustomizationErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RateCardCustomizationErrorReason enumeration = (RateCardCustomizationErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RateCardCustomizationErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RateCardCustomizationErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "RateCardCustomizationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

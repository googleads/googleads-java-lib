/**
 * AdGroupServiceErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.cm;

public class AdGroupServiceErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdGroupServiceErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DUPLICATE_ADGROUP_NAME = "DUPLICATE_ADGROUP_NAME";
    public static final java.lang.String _INVALID_ADGROUP_NAME = "INVALID_ADGROUP_NAME";
    public static final java.lang.String _USE_SET_OPERATOR_AND_MARK_STATUS_TO_REMOVED = "USE_SET_OPERATOR_AND_MARK_STATUS_TO_REMOVED";
    public static final java.lang.String _ADVERTISER_NOT_ON_CONTENT_NETWORK = "ADVERTISER_NOT_ON_CONTENT_NETWORK";
    public static final java.lang.String _BID_TOO_BIG = "BID_TOO_BIG";
    public static final java.lang.String _BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH = "BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH";
    public static final java.lang.String _MISSING_ADGROUP_NAME = "MISSING_ADGROUP_NAME";
    public static final java.lang.String _ADGROUP_LABEL_DOES_NOT_EXIST = "ADGROUP_LABEL_DOES_NOT_EXIST";
    public static final java.lang.String _ADGROUP_LABEL_ALREADY_EXISTS = "ADGROUP_LABEL_ALREADY_EXISTS";
    public static final java.lang.String _INVALID_CONTENT_BID_CRITERION_TYPE_GROUP = "INVALID_CONTENT_BID_CRITERION_TYPE_GROUP";
    public static final AdGroupServiceErrorReason DUPLICATE_ADGROUP_NAME = new AdGroupServiceErrorReason(_DUPLICATE_ADGROUP_NAME);
    public static final AdGroupServiceErrorReason INVALID_ADGROUP_NAME = new AdGroupServiceErrorReason(_INVALID_ADGROUP_NAME);
    public static final AdGroupServiceErrorReason USE_SET_OPERATOR_AND_MARK_STATUS_TO_REMOVED = new AdGroupServiceErrorReason(_USE_SET_OPERATOR_AND_MARK_STATUS_TO_REMOVED);
    public static final AdGroupServiceErrorReason ADVERTISER_NOT_ON_CONTENT_NETWORK = new AdGroupServiceErrorReason(_ADVERTISER_NOT_ON_CONTENT_NETWORK);
    public static final AdGroupServiceErrorReason BID_TOO_BIG = new AdGroupServiceErrorReason(_BID_TOO_BIG);
    public static final AdGroupServiceErrorReason BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH = new AdGroupServiceErrorReason(_BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH);
    public static final AdGroupServiceErrorReason MISSING_ADGROUP_NAME = new AdGroupServiceErrorReason(_MISSING_ADGROUP_NAME);
    public static final AdGroupServiceErrorReason ADGROUP_LABEL_DOES_NOT_EXIST = new AdGroupServiceErrorReason(_ADGROUP_LABEL_DOES_NOT_EXIST);
    public static final AdGroupServiceErrorReason ADGROUP_LABEL_ALREADY_EXISTS = new AdGroupServiceErrorReason(_ADGROUP_LABEL_ALREADY_EXISTS);
    public static final AdGroupServiceErrorReason INVALID_CONTENT_BID_CRITERION_TYPE_GROUP = new AdGroupServiceErrorReason(_INVALID_CONTENT_BID_CRITERION_TYPE_GROUP);
    public java.lang.String getValue() { return _value_;}
    public static AdGroupServiceErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdGroupServiceErrorReason enumeration = (AdGroupServiceErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdGroupServiceErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdGroupServiceErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "AdGroupServiceError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

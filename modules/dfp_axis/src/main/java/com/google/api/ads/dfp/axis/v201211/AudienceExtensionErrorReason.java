/**
 * AudienceExtensionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201211;

public class AudienceExtensionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AudienceExtensionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FREQUENCY_CAPS_NOT_SUPPORTED = "FREQUENCY_CAPS_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_TARGETING = "INVALID_TARGETING";
    public static final java.lang.String _INVENTORY_UNIT_TARGETING_INVALID = "INVENTORY_UNIT_TARGETING_INVALID";
    public static final java.lang.String _INVALID_CREATIVE_ROTATION = "INVALID_CREATIVE_ROTATION";
    public static final java.lang.String _INVALID_LINE_ITEM_TYPE = "INVALID_LINE_ITEM_TYPE";
    public static final java.lang.String _INVALID_MAX_BID = "INVALID_MAX_BID";
    public static final java.lang.String _AUDIENCE_EXTENSION_BULK_UPDATE_NOT_ALLOWED = "AUDIENCE_EXTENSION_BULK_UPDATE_NOT_ALLOWED";
    public static final java.lang.String _UNEXPECTED_AUDIENCE_EXTENSION_ERROR = "UNEXPECTED_AUDIENCE_EXTENSION_ERROR";
    public static final java.lang.String _MAX_DAILY_BUDGET_AMOUNT_EXCEEDED = "MAX_DAILY_BUDGET_AMOUNT_EXCEEDED";
    public static final java.lang.String _EXTERNAL_CAMPAIGN_ALREADY_EXISTS = "EXTERNAL_CAMPAIGN_ALREADY_EXISTS";
    public static final java.lang.String _AUDIENCE_EXTENSION_WITHOUT_FEATURE = "AUDIENCE_EXTENSION_WITHOUT_FEATURE";
    public static final java.lang.String _AUDIENCE_EXTENSION_WITHOUT_LINKED_ACCOUNT = "AUDIENCE_EXTENSION_WITHOUT_LINKED_ACCOUNT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AudienceExtensionErrorReason FREQUENCY_CAPS_NOT_SUPPORTED = new AudienceExtensionErrorReason(_FREQUENCY_CAPS_NOT_SUPPORTED);
    public static final AudienceExtensionErrorReason INVALID_TARGETING = new AudienceExtensionErrorReason(_INVALID_TARGETING);
    public static final AudienceExtensionErrorReason INVENTORY_UNIT_TARGETING_INVALID = new AudienceExtensionErrorReason(_INVENTORY_UNIT_TARGETING_INVALID);
    public static final AudienceExtensionErrorReason INVALID_CREATIVE_ROTATION = new AudienceExtensionErrorReason(_INVALID_CREATIVE_ROTATION);
    public static final AudienceExtensionErrorReason INVALID_LINE_ITEM_TYPE = new AudienceExtensionErrorReason(_INVALID_LINE_ITEM_TYPE);
    public static final AudienceExtensionErrorReason INVALID_MAX_BID = new AudienceExtensionErrorReason(_INVALID_MAX_BID);
    public static final AudienceExtensionErrorReason AUDIENCE_EXTENSION_BULK_UPDATE_NOT_ALLOWED = new AudienceExtensionErrorReason(_AUDIENCE_EXTENSION_BULK_UPDATE_NOT_ALLOWED);
    public static final AudienceExtensionErrorReason UNEXPECTED_AUDIENCE_EXTENSION_ERROR = new AudienceExtensionErrorReason(_UNEXPECTED_AUDIENCE_EXTENSION_ERROR);
    public static final AudienceExtensionErrorReason MAX_DAILY_BUDGET_AMOUNT_EXCEEDED = new AudienceExtensionErrorReason(_MAX_DAILY_BUDGET_AMOUNT_EXCEEDED);
    public static final AudienceExtensionErrorReason EXTERNAL_CAMPAIGN_ALREADY_EXISTS = new AudienceExtensionErrorReason(_EXTERNAL_CAMPAIGN_ALREADY_EXISTS);
    public static final AudienceExtensionErrorReason AUDIENCE_EXTENSION_WITHOUT_FEATURE = new AudienceExtensionErrorReason(_AUDIENCE_EXTENSION_WITHOUT_FEATURE);
    public static final AudienceExtensionErrorReason AUDIENCE_EXTENSION_WITHOUT_LINKED_ACCOUNT = new AudienceExtensionErrorReason(_AUDIENCE_EXTENSION_WITHOUT_LINKED_ACCOUNT);
    public static final AudienceExtensionErrorReason UNKNOWN = new AudienceExtensionErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AudienceExtensionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AudienceExtensionErrorReason enumeration = (AudienceExtensionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AudienceExtensionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AudienceExtensionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "AudienceExtensionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

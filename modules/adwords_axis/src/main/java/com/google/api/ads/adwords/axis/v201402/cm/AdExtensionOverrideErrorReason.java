/**
 * AdExtensionOverrideErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;

public class AdExtensionOverrideErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdExtensionOverrideErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AD_ALREADY_HAS_ADEXTENSION_OVERRIDE = "AD_ALREADY_HAS_ADEXTENSION_OVERRIDE";
    public static final java.lang.String _ADEXTENSION_ID_MUST_BE_SPECIFIED = "ADEXTENSION_ID_MUST_BE_SPECIFIED";
    public static final java.lang.String _ADEXTENSION_LATITUTE_CANNOT_CHANGE_AFTER_BEING_SET_ONCE = "ADEXTENSION_LATITUTE_CANNOT_CHANGE_AFTER_BEING_SET_ONCE";
    public static final java.lang.String _ADEXTENSION_LONGITUDE_CANNOT_CHANGE_AFTER_BEING_SET_ONCE = "ADEXTENSION_LONGITUDE_CANNOT_CHANGE_AFTER_BEING_SET_ONCE";
    public static final java.lang.String _ADEXTENSION_NOT_UNDER_CAMPAIGN = "ADEXTENSION_NOT_UNDER_CAMPAIGN";
    public static final java.lang.String _CANNOT_OPERATE_ON_DELETED_OVERRIDE = "CANNOT_OPERATE_ON_DELETED_OVERRIDE";
    public static final java.lang.String _CANNOT_OVERRIDE_EXTENSIONS_ON_NON_TEXT_AD = "CANNOT_OVERRIDE_EXTENSIONS_ON_NON_TEXT_AD";
    public static final java.lang.String _CANNOT_OVERRIDE_USING_NON_LOCATION_EXTENSION = "CANNOT_OVERRIDE_USING_NON_LOCATION_EXTENSION";
    public static final java.lang.String _INVALID_ADEXTENSION_ID = "INVALID_ADEXTENSION_ID";
    public static final java.lang.String _LOCATION_OVERRIDE_INFO_REQUIRED_FOR_NEW_LOCATION_EXTENSION_OVERRIDE = "LOCATION_OVERRIDE_INFO_REQUIRED_FOR_NEW_LOCATION_EXTENSION_OVERRIDE";
    public static final java.lang.String _OVERRIDE_INFO_MUST_BE_NULL_AFTER_BEING_SET_ONCE = "OVERRIDE_INFO_MUST_BE_NULL_AFTER_BEING_SET_ONCE";
    public static final java.lang.String _RADIUS_TOO_LARGE = "RADIUS_TOO_LARGE";
    public static final java.lang.String _RADIUS_TOO_SMALL = "RADIUS_TOO_SMALL";
    public static final java.lang.String _UNKNOWN_ADEXTENSION_OVERRIDE = "UNKNOWN_ADEXTENSION_OVERRIDE";
    public static final AdExtensionOverrideErrorReason AD_ALREADY_HAS_ADEXTENSION_OVERRIDE = new AdExtensionOverrideErrorReason(_AD_ALREADY_HAS_ADEXTENSION_OVERRIDE);
    public static final AdExtensionOverrideErrorReason ADEXTENSION_ID_MUST_BE_SPECIFIED = new AdExtensionOverrideErrorReason(_ADEXTENSION_ID_MUST_BE_SPECIFIED);
    public static final AdExtensionOverrideErrorReason ADEXTENSION_LATITUTE_CANNOT_CHANGE_AFTER_BEING_SET_ONCE = new AdExtensionOverrideErrorReason(_ADEXTENSION_LATITUTE_CANNOT_CHANGE_AFTER_BEING_SET_ONCE);
    public static final AdExtensionOverrideErrorReason ADEXTENSION_LONGITUDE_CANNOT_CHANGE_AFTER_BEING_SET_ONCE = new AdExtensionOverrideErrorReason(_ADEXTENSION_LONGITUDE_CANNOT_CHANGE_AFTER_BEING_SET_ONCE);
    public static final AdExtensionOverrideErrorReason ADEXTENSION_NOT_UNDER_CAMPAIGN = new AdExtensionOverrideErrorReason(_ADEXTENSION_NOT_UNDER_CAMPAIGN);
    public static final AdExtensionOverrideErrorReason CANNOT_OPERATE_ON_DELETED_OVERRIDE = new AdExtensionOverrideErrorReason(_CANNOT_OPERATE_ON_DELETED_OVERRIDE);
    public static final AdExtensionOverrideErrorReason CANNOT_OVERRIDE_EXTENSIONS_ON_NON_TEXT_AD = new AdExtensionOverrideErrorReason(_CANNOT_OVERRIDE_EXTENSIONS_ON_NON_TEXT_AD);
    public static final AdExtensionOverrideErrorReason CANNOT_OVERRIDE_USING_NON_LOCATION_EXTENSION = new AdExtensionOverrideErrorReason(_CANNOT_OVERRIDE_USING_NON_LOCATION_EXTENSION);
    public static final AdExtensionOverrideErrorReason INVALID_ADEXTENSION_ID = new AdExtensionOverrideErrorReason(_INVALID_ADEXTENSION_ID);
    public static final AdExtensionOverrideErrorReason LOCATION_OVERRIDE_INFO_REQUIRED_FOR_NEW_LOCATION_EXTENSION_OVERRIDE = new AdExtensionOverrideErrorReason(_LOCATION_OVERRIDE_INFO_REQUIRED_FOR_NEW_LOCATION_EXTENSION_OVERRIDE);
    public static final AdExtensionOverrideErrorReason OVERRIDE_INFO_MUST_BE_NULL_AFTER_BEING_SET_ONCE = new AdExtensionOverrideErrorReason(_OVERRIDE_INFO_MUST_BE_NULL_AFTER_BEING_SET_ONCE);
    public static final AdExtensionOverrideErrorReason RADIUS_TOO_LARGE = new AdExtensionOverrideErrorReason(_RADIUS_TOO_LARGE);
    public static final AdExtensionOverrideErrorReason RADIUS_TOO_SMALL = new AdExtensionOverrideErrorReason(_RADIUS_TOO_SMALL);
    public static final AdExtensionOverrideErrorReason UNKNOWN_ADEXTENSION_OVERRIDE = new AdExtensionOverrideErrorReason(_UNKNOWN_ADEXTENSION_OVERRIDE);
    public java.lang.String getValue() { return _value_;}
    public static AdExtensionOverrideErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdExtensionOverrideErrorReason enumeration = (AdExtensionOverrideErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdExtensionOverrideErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdExtensionOverrideErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "AdExtensionOverrideError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

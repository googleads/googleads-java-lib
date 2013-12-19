/**
 * AdExtensionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;

public class AdExtensionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdExtensionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACCOUNT_DELETED = "ACCOUNT_DELETED";
    public static final java.lang.String _AD_EXTENSION_NO_LONGER_ACTIVE = "AD_EXTENSION_NO_LONGER_ACTIVE";
    public static final java.lang.String _CANNOT_HAVE_MULTIPLE_LOCATION_SYNC_EXTENSIONS_PER_CAMPAIGN = "CANNOT_HAVE_MULTIPLE_LOCATION_SYNC_EXTENSIONS_PER_CAMPAIGN";
    public static final java.lang.String _CANNOT_HAVE_MULTIPLE_MOBILE_EXTENSIONS_PER_CAMPAIGN = "CANNOT_HAVE_MULTIPLE_MOBILE_EXTENSIONS_PER_CAMPAIGN";
    public static final java.lang.String _CANNOT_HAVE_MULTIPLE_PRODUCT_EXTENSIONS_PER_CAMPAIGN = "CANNOT_HAVE_MULTIPLE_PRODUCT_EXTENSIONS_PER_CAMPAIGN";
    public static final java.lang.String _CANNOT_HAVE_MULTIPLE_SITELINKS_EXTENSIONS_PER_CAMPAIGN = "CANNOT_HAVE_MULTIPLE_SITELINKS_EXTENSIONS_PER_CAMPAIGN";
    public static final java.lang.String _CANNOT_HAVE_MULTIPLE_IN_APP_LINK_EXTENSIONS_PER_CAMPAIGN_PER_APPSTORE = "CANNOT_HAVE_MULTIPLE_IN_APP_LINK_EXTENSIONS_PER_CAMPAIGN_PER_APPSTORE";
    public static final java.lang.String _INVALID_ADEXTENSION_TYPE = "INVALID_ADEXTENSION_TYPE";
    public static final java.lang.String _INVALID_AUTH_TOKEN_FOR_EMAIL = "INVALID_AUTH_TOKEN_FOR_EMAIL";
    public static final java.lang.String _INVALID_COUNTRY_CODE = "INVALID_COUNTRY_CODE";
    public static final java.lang.String _INVALID_DOMESTIC_PHONE_NUMBER_FORMAT = "INVALID_DOMESTIC_PHONE_NUMBER_FORMAT";
    public static final java.lang.String _INVALID_DESTINATION_URL = "INVALID_DESTINATION_URL";
    public static final java.lang.String _INVALID_EMAIL = "INVALID_EMAIL";
    public static final java.lang.String _INVALID_ENCODED_LOCATION = "INVALID_ENCODED_LOCATION";
    public static final java.lang.String _INVALID_ENUM_CONDITION_OPERATOR = "INVALID_ENUM_CONDITION_OPERATOR";
    public static final java.lang.String _INVALID_ICON_DIMENSIONS = "INVALID_ICON_DIMENSIONS";
    public static final java.lang.String _INVALID_ID = "INVALID_ID";
    public static final java.lang.String _INVALID_IMAGE_DIMENSIONS = "INVALID_IMAGE_DIMENSIONS";
    public static final java.lang.String _INVALID_INPUT = "INVALID_INPUT";
    public static final java.lang.String _INVALID_LATITUDE = "INVALID_LATITUDE";
    public static final java.lang.String _INVALID_LONGITUDE = "INVALID_LONGITUDE";
    public static final java.lang.String _INVALID_PHONE_NUMBER = "INVALID_PHONE_NUMBER";
    public static final java.lang.String _INVALID_STRING_CONDITION_OPERATOR = "INVALID_STRING_CONDITION_OPERATOR";
    public static final java.lang.String _INVALID_TOLL_PHONE_NUMBER_FORMAT = "INVALID_TOLL_PHONE_NUMBER_FORMAT";
    public static final java.lang.String _MEDIA_DOES_NOT_BELONG_TO_ACCOUNT = "MEDIA_DOES_NOT_BELONG_TO_ACCOUNT";
    public static final java.lang.String _MEDIA_NOT_ICON_TYPE = "MEDIA_NOT_ICON_TYPE";
    public static final java.lang.String _MEDIA_NOT_IMAGE_TYPE = "MEDIA_NOT_IMAGE_TYPE";
    public static final java.lang.String _MISSING_ADVERTISER_NAME = "MISSING_ADVERTISER_NAME";
    public static final java.lang.String _MISSING_AUTH_TOKEN = "MISSING_AUTH_TOKEN";
    public static final java.lang.String _MISSING_COUNTRY_CODE = "MISSING_COUNTRY_CODE";
    public static final java.lang.String _MISSING_CITY_NAME = "MISSING_CITY_NAME";
    public static final java.lang.String _MISSING_EMAIL = "MISSING_EMAIL";
    public static final java.lang.String _MISSING_ENCODED_LOCATION = "MISSING_ENCODED_LOCATION";
    public static final java.lang.String _MISSING_CONDITION_OPERAND = "MISSING_CONDITION_OPERAND";
    public static final java.lang.String _MISSING_CONDITION_STRING_VALUE = "MISSING_CONDITION_STRING_VALUE";
    public static final java.lang.String _MISSING_POSTAL_CODE = "MISSING_POSTAL_CODE";
    public static final java.lang.String _MISSING_STREET_ADDRESS = "MISSING_STREET_ADDRESS";
    public static final java.lang.String _NUM_AND_GROUPS_OVER_LIMIT = "NUM_AND_GROUPS_OVER_LIMIT";
    public static final java.lang.String _NUM_CONDITIONS_OVER_LIMIT = "NUM_CONDITIONS_OVER_LIMIT";
    public static final java.lang.String _NUM_LOCATION_EXTENSIONS_OVER_LIMIT = "NUM_LOCATION_EXTENSIONS_OVER_LIMIT";
    public static final java.lang.String _NOT_AUTHORIZED_TO_CREATE_EXTENSION = "NOT_AUTHORIZED_TO_CREATE_EXTENSION";
    public static final java.lang.String _PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY = "PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY";
    public static final java.lang.String _DISALLOWED_NUMBER_TYPE = "DISALLOWED_NUMBER_TYPE";
    public static final java.lang.String _PREMIUM_RATE_NUMBER_NOT_ALLOWED = "PREMIUM_RATE_NUMBER_NOT_ALLOWED";
    public static final java.lang.String _TOO_LONG = "TOO_LONG";
    public static final java.lang.String _USER_NOT_PERMITTED_TO_CREATE_LBC_SYNC_LOCATION_EXTENSION = "USER_NOT_PERMITTED_TO_CREATE_LBC_SYNC_LOCATION_EXTENSION";
    public static final AdExtensionErrorReason ACCOUNT_DELETED = new AdExtensionErrorReason(_ACCOUNT_DELETED);
    public static final AdExtensionErrorReason AD_EXTENSION_NO_LONGER_ACTIVE = new AdExtensionErrorReason(_AD_EXTENSION_NO_LONGER_ACTIVE);
    public static final AdExtensionErrorReason CANNOT_HAVE_MULTIPLE_LOCATION_SYNC_EXTENSIONS_PER_CAMPAIGN = new AdExtensionErrorReason(_CANNOT_HAVE_MULTIPLE_LOCATION_SYNC_EXTENSIONS_PER_CAMPAIGN);
    public static final AdExtensionErrorReason CANNOT_HAVE_MULTIPLE_MOBILE_EXTENSIONS_PER_CAMPAIGN = new AdExtensionErrorReason(_CANNOT_HAVE_MULTIPLE_MOBILE_EXTENSIONS_PER_CAMPAIGN);
    public static final AdExtensionErrorReason CANNOT_HAVE_MULTIPLE_PRODUCT_EXTENSIONS_PER_CAMPAIGN = new AdExtensionErrorReason(_CANNOT_HAVE_MULTIPLE_PRODUCT_EXTENSIONS_PER_CAMPAIGN);
    public static final AdExtensionErrorReason CANNOT_HAVE_MULTIPLE_SITELINKS_EXTENSIONS_PER_CAMPAIGN = new AdExtensionErrorReason(_CANNOT_HAVE_MULTIPLE_SITELINKS_EXTENSIONS_PER_CAMPAIGN);
    public static final AdExtensionErrorReason CANNOT_HAVE_MULTIPLE_IN_APP_LINK_EXTENSIONS_PER_CAMPAIGN_PER_APPSTORE = new AdExtensionErrorReason(_CANNOT_HAVE_MULTIPLE_IN_APP_LINK_EXTENSIONS_PER_CAMPAIGN_PER_APPSTORE);
    public static final AdExtensionErrorReason INVALID_ADEXTENSION_TYPE = new AdExtensionErrorReason(_INVALID_ADEXTENSION_TYPE);
    public static final AdExtensionErrorReason INVALID_AUTH_TOKEN_FOR_EMAIL = new AdExtensionErrorReason(_INVALID_AUTH_TOKEN_FOR_EMAIL);
    public static final AdExtensionErrorReason INVALID_COUNTRY_CODE = new AdExtensionErrorReason(_INVALID_COUNTRY_CODE);
    public static final AdExtensionErrorReason INVALID_DOMESTIC_PHONE_NUMBER_FORMAT = new AdExtensionErrorReason(_INVALID_DOMESTIC_PHONE_NUMBER_FORMAT);
    public static final AdExtensionErrorReason INVALID_DESTINATION_URL = new AdExtensionErrorReason(_INVALID_DESTINATION_URL);
    public static final AdExtensionErrorReason INVALID_EMAIL = new AdExtensionErrorReason(_INVALID_EMAIL);
    public static final AdExtensionErrorReason INVALID_ENCODED_LOCATION = new AdExtensionErrorReason(_INVALID_ENCODED_LOCATION);
    public static final AdExtensionErrorReason INVALID_ENUM_CONDITION_OPERATOR = new AdExtensionErrorReason(_INVALID_ENUM_CONDITION_OPERATOR);
    public static final AdExtensionErrorReason INVALID_ICON_DIMENSIONS = new AdExtensionErrorReason(_INVALID_ICON_DIMENSIONS);
    public static final AdExtensionErrorReason INVALID_ID = new AdExtensionErrorReason(_INVALID_ID);
    public static final AdExtensionErrorReason INVALID_IMAGE_DIMENSIONS = new AdExtensionErrorReason(_INVALID_IMAGE_DIMENSIONS);
    public static final AdExtensionErrorReason INVALID_INPUT = new AdExtensionErrorReason(_INVALID_INPUT);
    public static final AdExtensionErrorReason INVALID_LATITUDE = new AdExtensionErrorReason(_INVALID_LATITUDE);
    public static final AdExtensionErrorReason INVALID_LONGITUDE = new AdExtensionErrorReason(_INVALID_LONGITUDE);
    public static final AdExtensionErrorReason INVALID_PHONE_NUMBER = new AdExtensionErrorReason(_INVALID_PHONE_NUMBER);
    public static final AdExtensionErrorReason INVALID_STRING_CONDITION_OPERATOR = new AdExtensionErrorReason(_INVALID_STRING_CONDITION_OPERATOR);
    public static final AdExtensionErrorReason INVALID_TOLL_PHONE_NUMBER_FORMAT = new AdExtensionErrorReason(_INVALID_TOLL_PHONE_NUMBER_FORMAT);
    public static final AdExtensionErrorReason MEDIA_DOES_NOT_BELONG_TO_ACCOUNT = new AdExtensionErrorReason(_MEDIA_DOES_NOT_BELONG_TO_ACCOUNT);
    public static final AdExtensionErrorReason MEDIA_NOT_ICON_TYPE = new AdExtensionErrorReason(_MEDIA_NOT_ICON_TYPE);
    public static final AdExtensionErrorReason MEDIA_NOT_IMAGE_TYPE = new AdExtensionErrorReason(_MEDIA_NOT_IMAGE_TYPE);
    public static final AdExtensionErrorReason MISSING_ADVERTISER_NAME = new AdExtensionErrorReason(_MISSING_ADVERTISER_NAME);
    public static final AdExtensionErrorReason MISSING_AUTH_TOKEN = new AdExtensionErrorReason(_MISSING_AUTH_TOKEN);
    public static final AdExtensionErrorReason MISSING_COUNTRY_CODE = new AdExtensionErrorReason(_MISSING_COUNTRY_CODE);
    public static final AdExtensionErrorReason MISSING_CITY_NAME = new AdExtensionErrorReason(_MISSING_CITY_NAME);
    public static final AdExtensionErrorReason MISSING_EMAIL = new AdExtensionErrorReason(_MISSING_EMAIL);
    public static final AdExtensionErrorReason MISSING_ENCODED_LOCATION = new AdExtensionErrorReason(_MISSING_ENCODED_LOCATION);
    public static final AdExtensionErrorReason MISSING_CONDITION_OPERAND = new AdExtensionErrorReason(_MISSING_CONDITION_OPERAND);
    public static final AdExtensionErrorReason MISSING_CONDITION_STRING_VALUE = new AdExtensionErrorReason(_MISSING_CONDITION_STRING_VALUE);
    public static final AdExtensionErrorReason MISSING_POSTAL_CODE = new AdExtensionErrorReason(_MISSING_POSTAL_CODE);
    public static final AdExtensionErrorReason MISSING_STREET_ADDRESS = new AdExtensionErrorReason(_MISSING_STREET_ADDRESS);
    public static final AdExtensionErrorReason NUM_AND_GROUPS_OVER_LIMIT = new AdExtensionErrorReason(_NUM_AND_GROUPS_OVER_LIMIT);
    public static final AdExtensionErrorReason NUM_CONDITIONS_OVER_LIMIT = new AdExtensionErrorReason(_NUM_CONDITIONS_OVER_LIMIT);
    public static final AdExtensionErrorReason NUM_LOCATION_EXTENSIONS_OVER_LIMIT = new AdExtensionErrorReason(_NUM_LOCATION_EXTENSIONS_OVER_LIMIT);
    public static final AdExtensionErrorReason NOT_AUTHORIZED_TO_CREATE_EXTENSION = new AdExtensionErrorReason(_NOT_AUTHORIZED_TO_CREATE_EXTENSION);
    public static final AdExtensionErrorReason PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY = new AdExtensionErrorReason(_PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY);
    public static final AdExtensionErrorReason DISALLOWED_NUMBER_TYPE = new AdExtensionErrorReason(_DISALLOWED_NUMBER_TYPE);
    public static final AdExtensionErrorReason PREMIUM_RATE_NUMBER_NOT_ALLOWED = new AdExtensionErrorReason(_PREMIUM_RATE_NUMBER_NOT_ALLOWED);
    public static final AdExtensionErrorReason TOO_LONG = new AdExtensionErrorReason(_TOO_LONG);
    public static final AdExtensionErrorReason USER_NOT_PERMITTED_TO_CREATE_LBC_SYNC_LOCATION_EXTENSION = new AdExtensionErrorReason(_USER_NOT_PERMITTED_TO_CREATE_LBC_SYNC_LOCATION_EXTENSION);
    public java.lang.String getValue() { return _value_;}
    public static AdExtensionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdExtensionErrorReason enumeration = (AdExtensionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdExtensionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdExtensionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "AdExtensionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

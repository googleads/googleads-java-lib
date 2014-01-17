/**
 * AdGroupCriterionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;

public class AdGroupCriterionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdGroupCriterionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_ID_FILTER_TYPE = "INVALID_ID_FILTER_TYPE";
    public static final java.lang.String _ID_FILTERS_HAVE_DIFF_FIELDS_SET = "ID_FILTERS_HAVE_DIFF_FIELDS_SET";
    public static final java.lang.String _INAPPLICABLE_FOR_NEGATIVE = "INAPPLICABLE_FOR_NEGATIVE";
    public static final java.lang.String _INAPPLICABLE_FILTER_SPECIFIED = "INAPPLICABLE_FILTER_SPECIFIED";
    public static final java.lang.String _TOO_MANY_OPERTAIONS = "TOO_MANY_OPERTAIONS";
    public static final java.lang.String _CANT_UPDATE_NEGATIVE = "CANT_UPDATE_NEGATIVE";
    public static final java.lang.String _TYPE_MISMATCH = "TYPE_MISMATCH";
    public static final java.lang.String _CONCRETE_TYPE_REQUIRED = "CONCRETE_TYPE_REQUIRED";
    public static final java.lang.String _BID_INCOMPATIBLE_WITH_ADGROUP = "BID_INCOMPATIBLE_WITH_ADGROUP";
    public static final java.lang.String _NETWORK_NOT_OVERRIDABLE = "NETWORK_NOT_OVERRIDABLE";
    public static final java.lang.String _CURRENCY_MISMATCH = "CURRENCY_MISMATCH";
    public static final java.lang.String _CRITERION_NOT_TARGETED = "CRITERION_NOT_TARGETED";
    public static final java.lang.String _CANNOT_TARGET_AND_EXCLUDE = "CANNOT_TARGET_AND_EXCLUDE";
    public static final java.lang.String _ILLEGAL_URL = "ILLEGAL_URL";
    public static final java.lang.String _INVALID_VERTICAL_PATH = "INVALID_VERTICAL_PATH";
    public static final java.lang.String _NO_EFFECTIVE_BID_FOR_THIS_CRITERION = "NO_EFFECTIVE_BID_FOR_THIS_CRITERION";
    public static final java.lang.String _INVALID_KEYWORD_TEXT = "INVALID_KEYWORD_TEXT";
    public static final java.lang.String _INVALID_DESTINATION_URL = "INVALID_DESTINATION_URL";
    public static final java.lang.String _MISSING_DESTINATION_URL_TAG = "MISSING_DESTINATION_URL_TAG";
    public static final java.lang.String _KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM = "KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM";
    public static final java.lang.String _INVALID_USER_STATUS = "INVALID_USER_STATUS";
    public static final java.lang.String _CANNOT_ADD_CRITERIA_TYPE = "CANNOT_ADD_CRITERIA_TYPE";
    public static final java.lang.String _CANNOT_EXCLUDE_CRITERIA_TYPE = "CANNOT_EXCLUDE_CRITERIA_TYPE";
    public static final java.lang.String _PRODUCT_FILTER_TOO_LONG = "PRODUCT_FILTER_TOO_LONG";
    public static final java.lang.String _INVALID_PRODUCT_FILTER = "INVALID_PRODUCT_FILTER";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AdGroupCriterionErrorReason INVALID_ID_FILTER_TYPE = new AdGroupCriterionErrorReason(_INVALID_ID_FILTER_TYPE);
    public static final AdGroupCriterionErrorReason ID_FILTERS_HAVE_DIFF_FIELDS_SET = new AdGroupCriterionErrorReason(_ID_FILTERS_HAVE_DIFF_FIELDS_SET);
    public static final AdGroupCriterionErrorReason INAPPLICABLE_FOR_NEGATIVE = new AdGroupCriterionErrorReason(_INAPPLICABLE_FOR_NEGATIVE);
    public static final AdGroupCriterionErrorReason INAPPLICABLE_FILTER_SPECIFIED = new AdGroupCriterionErrorReason(_INAPPLICABLE_FILTER_SPECIFIED);
    public static final AdGroupCriterionErrorReason TOO_MANY_OPERTAIONS = new AdGroupCriterionErrorReason(_TOO_MANY_OPERTAIONS);
    public static final AdGroupCriterionErrorReason CANT_UPDATE_NEGATIVE = new AdGroupCriterionErrorReason(_CANT_UPDATE_NEGATIVE);
    public static final AdGroupCriterionErrorReason TYPE_MISMATCH = new AdGroupCriterionErrorReason(_TYPE_MISMATCH);
    public static final AdGroupCriterionErrorReason CONCRETE_TYPE_REQUIRED = new AdGroupCriterionErrorReason(_CONCRETE_TYPE_REQUIRED);
    public static final AdGroupCriterionErrorReason BID_INCOMPATIBLE_WITH_ADGROUP = new AdGroupCriterionErrorReason(_BID_INCOMPATIBLE_WITH_ADGROUP);
    public static final AdGroupCriterionErrorReason NETWORK_NOT_OVERRIDABLE = new AdGroupCriterionErrorReason(_NETWORK_NOT_OVERRIDABLE);
    public static final AdGroupCriterionErrorReason CURRENCY_MISMATCH = new AdGroupCriterionErrorReason(_CURRENCY_MISMATCH);
    public static final AdGroupCriterionErrorReason CRITERION_NOT_TARGETED = new AdGroupCriterionErrorReason(_CRITERION_NOT_TARGETED);
    public static final AdGroupCriterionErrorReason CANNOT_TARGET_AND_EXCLUDE = new AdGroupCriterionErrorReason(_CANNOT_TARGET_AND_EXCLUDE);
    public static final AdGroupCriterionErrorReason ILLEGAL_URL = new AdGroupCriterionErrorReason(_ILLEGAL_URL);
    public static final AdGroupCriterionErrorReason INVALID_VERTICAL_PATH = new AdGroupCriterionErrorReason(_INVALID_VERTICAL_PATH);
    public static final AdGroupCriterionErrorReason NO_EFFECTIVE_BID_FOR_THIS_CRITERION = new AdGroupCriterionErrorReason(_NO_EFFECTIVE_BID_FOR_THIS_CRITERION);
    public static final AdGroupCriterionErrorReason INVALID_KEYWORD_TEXT = new AdGroupCriterionErrorReason(_INVALID_KEYWORD_TEXT);
    public static final AdGroupCriterionErrorReason INVALID_DESTINATION_URL = new AdGroupCriterionErrorReason(_INVALID_DESTINATION_URL);
    public static final AdGroupCriterionErrorReason MISSING_DESTINATION_URL_TAG = new AdGroupCriterionErrorReason(_MISSING_DESTINATION_URL_TAG);
    public static final AdGroupCriterionErrorReason KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM = new AdGroupCriterionErrorReason(_KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM);
    public static final AdGroupCriterionErrorReason INVALID_USER_STATUS = new AdGroupCriterionErrorReason(_INVALID_USER_STATUS);
    public static final AdGroupCriterionErrorReason CANNOT_ADD_CRITERIA_TYPE = new AdGroupCriterionErrorReason(_CANNOT_ADD_CRITERIA_TYPE);
    public static final AdGroupCriterionErrorReason CANNOT_EXCLUDE_CRITERIA_TYPE = new AdGroupCriterionErrorReason(_CANNOT_EXCLUDE_CRITERIA_TYPE);
    public static final AdGroupCriterionErrorReason PRODUCT_FILTER_TOO_LONG = new AdGroupCriterionErrorReason(_PRODUCT_FILTER_TOO_LONG);
    public static final AdGroupCriterionErrorReason INVALID_PRODUCT_FILTER = new AdGroupCriterionErrorReason(_INVALID_PRODUCT_FILTER);
    public static final AdGroupCriterionErrorReason UNKNOWN = new AdGroupCriterionErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AdGroupCriterionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdGroupCriterionErrorReason enumeration = (AdGroupCriterionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdGroupCriterionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdGroupCriterionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "AdGroupCriterionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

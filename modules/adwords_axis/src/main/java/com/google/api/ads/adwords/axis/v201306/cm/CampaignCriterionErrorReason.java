/**
 * CampaignCriterionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

public class CampaignCriterionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignCriterionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CRITERIA_QUOTA_EXCEEDED = "CRITERIA_QUOTA_EXCEEDED";
    public static final java.lang.String _CONCRETE_TYPE_REQUIRED = "CONCRETE_TYPE_REQUIRED";
    public static final java.lang.String _ID_FILTERS_HAVE_DIFF_FIELDS_SET = "ID_FILTERS_HAVE_DIFF_FIELDS_SET";
    public static final java.lang.String _INVALID_EXCLUDED_CATEGORY = "INVALID_EXCLUDED_CATEGORY";
    public static final java.lang.String _INVALID_KEYWORD_TEXT = "INVALID_KEYWORD_TEXT";
    public static final java.lang.String _INVALID_PLACEMENT_URL = "INVALID_PLACEMENT_URL";
    public static final java.lang.String _INVALID_VERTICAL_PATH = "INVALID_VERTICAL_PATH";
    public static final java.lang.String _LICENSED_USERLISTS_NOT_ALLOWED = "LICENSED_USERLISTS_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_EXCLUDE_ALL_PLATFORMS = "CANNOT_EXCLUDE_ALL_PLATFORMS";
    public static final java.lang.String _CANNOT_EXCLUDE_CRITERIA_TYPE = "CANNOT_EXCLUDE_CRITERIA_TYPE";
    public static final java.lang.String _CANNOT_EXCLUDE_PLATFORM_CRITERION = "CANNOT_EXCLUDE_PLATFORM_CRITERION";
    public static final java.lang.String _CANNOT_TARGET_AND_EXCLUDE = "CANNOT_TARGET_AND_EXCLUDE";
    public static final java.lang.String _TOO_MANY_OPERTAIONS = "TOO_MANY_OPERTAIONS";
    public static final java.lang.String _OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE = "OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CampaignCriterionErrorReason CRITERIA_QUOTA_EXCEEDED = new CampaignCriterionErrorReason(_CRITERIA_QUOTA_EXCEEDED);
    public static final CampaignCriterionErrorReason CONCRETE_TYPE_REQUIRED = new CampaignCriterionErrorReason(_CONCRETE_TYPE_REQUIRED);
    public static final CampaignCriterionErrorReason ID_FILTERS_HAVE_DIFF_FIELDS_SET = new CampaignCriterionErrorReason(_ID_FILTERS_HAVE_DIFF_FIELDS_SET);
    public static final CampaignCriterionErrorReason INVALID_EXCLUDED_CATEGORY = new CampaignCriterionErrorReason(_INVALID_EXCLUDED_CATEGORY);
    public static final CampaignCriterionErrorReason INVALID_KEYWORD_TEXT = new CampaignCriterionErrorReason(_INVALID_KEYWORD_TEXT);
    public static final CampaignCriterionErrorReason INVALID_PLACEMENT_URL = new CampaignCriterionErrorReason(_INVALID_PLACEMENT_URL);
    public static final CampaignCriterionErrorReason INVALID_VERTICAL_PATH = new CampaignCriterionErrorReason(_INVALID_VERTICAL_PATH);
    public static final CampaignCriterionErrorReason LICENSED_USERLISTS_NOT_ALLOWED = new CampaignCriterionErrorReason(_LICENSED_USERLISTS_NOT_ALLOWED);
    public static final CampaignCriterionErrorReason CANNOT_EXCLUDE_ALL_PLATFORMS = new CampaignCriterionErrorReason(_CANNOT_EXCLUDE_ALL_PLATFORMS);
    public static final CampaignCriterionErrorReason CANNOT_EXCLUDE_CRITERIA_TYPE = new CampaignCriterionErrorReason(_CANNOT_EXCLUDE_CRITERIA_TYPE);
    public static final CampaignCriterionErrorReason CANNOT_EXCLUDE_PLATFORM_CRITERION = new CampaignCriterionErrorReason(_CANNOT_EXCLUDE_PLATFORM_CRITERION);
    public static final CampaignCriterionErrorReason CANNOT_TARGET_AND_EXCLUDE = new CampaignCriterionErrorReason(_CANNOT_TARGET_AND_EXCLUDE);
    public static final CampaignCriterionErrorReason TOO_MANY_OPERTAIONS = new CampaignCriterionErrorReason(_TOO_MANY_OPERTAIONS);
    public static final CampaignCriterionErrorReason OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE = new CampaignCriterionErrorReason(_OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE);
    public static final CampaignCriterionErrorReason UNKNOWN = new CampaignCriterionErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CampaignCriterionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignCriterionErrorReason enumeration = (CampaignCriterionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignCriterionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CampaignCriterionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "CampaignCriterionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

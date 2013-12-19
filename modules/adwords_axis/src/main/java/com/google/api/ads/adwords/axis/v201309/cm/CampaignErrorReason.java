/**
 * CampaignErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;

public class CampaignErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AFTER_MAXIMUM_ALLOWABLE_DATE = "AFTER_MAXIMUM_ALLOWABLE_DATE";
    public static final java.lang.String _CANNOT_GO_BACK_TO_INCOMPLETE = "CANNOT_GO_BACK_TO_INCOMPLETE";
    public static final java.lang.String _CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED = "CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED";
    public static final java.lang.String _CANNOT_SET_END_DATE_BEFORE_EXPERIMENT_END_DATE = "CANNOT_SET_END_DATE_BEFORE_EXPERIMENT_END_DATE";
    public static final java.lang.String _CANNOT_SET_DATE_TO_PAST = "CANNOT_SET_DATE_TO_PAST";
    public static final java.lang.String _DUPLICATE_CAMPAIGN_NAME = "DUPLICATE_CAMPAIGN_NAME";
    public static final java.lang.String _INCOMPATIBLE_CAMPAIGN_FIELD = "INCOMPATIBLE_CAMPAIGN_FIELD";
    public static final java.lang.String _INVALID_CAMPAIGN_NAME = "INVALID_CAMPAIGN_NAME";
    public static final java.lang.String _INVALID_AD_SERVING_OPTIMIZATION_STATUS = "INVALID_AD_SERVING_OPTIMIZATION_STATUS";
    public static final java.lang.String _INVALID_TRACKING_URL = "INVALID_TRACKING_URL";
    public static final java.lang.String _MAX_IMPRESSIONS_NOT_IN_RANGE = "MAX_IMPRESSIONS_NOT_IN_RANGE";
    public static final java.lang.String _START_DATE_AFTER_END_DATE = "START_DATE_AFTER_END_DATE";
    public static final java.lang.String _TIME_UNIT_NOT_SUPPORTED = "TIME_UNIT_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED = "INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED";
    public static final java.lang.String _BUDGET_CANNOT_BE_SHARED = "BUDGET_CANNOT_BE_SHARED";
    public static final java.lang.String _CANNOT_SET_BUDGET = "CANNOT_SET_BUDGET";
    public static final java.lang.String _CAMPAIGN_CANNOT_USE_SHARED_BUDGET = "CAMPAIGN_CANNOT_USE_SHARED_BUDGET";
    public static final java.lang.String _MUST_SPECIFY_KEYWORD_MATCH_SETTINGS = "MUST_SPECIFY_KEYWORD_MATCH_SETTINGS";
    public static final java.lang.String _BIDDING_STRATEGY_NOT_SUPPORTED_WITH_BID_MODIFIER = "BIDDING_STRATEGY_NOT_SUPPORTED_WITH_BID_MODIFIER";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CampaignErrorReason AFTER_MAXIMUM_ALLOWABLE_DATE = new CampaignErrorReason(_AFTER_MAXIMUM_ALLOWABLE_DATE);
    public static final CampaignErrorReason CANNOT_GO_BACK_TO_INCOMPLETE = new CampaignErrorReason(_CANNOT_GO_BACK_TO_INCOMPLETE);
    public static final CampaignErrorReason CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED = new CampaignErrorReason(_CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED);
    public static final CampaignErrorReason CANNOT_SET_END_DATE_BEFORE_EXPERIMENT_END_DATE = new CampaignErrorReason(_CANNOT_SET_END_DATE_BEFORE_EXPERIMENT_END_DATE);
    public static final CampaignErrorReason CANNOT_SET_DATE_TO_PAST = new CampaignErrorReason(_CANNOT_SET_DATE_TO_PAST);
    public static final CampaignErrorReason DUPLICATE_CAMPAIGN_NAME = new CampaignErrorReason(_DUPLICATE_CAMPAIGN_NAME);
    public static final CampaignErrorReason INCOMPATIBLE_CAMPAIGN_FIELD = new CampaignErrorReason(_INCOMPATIBLE_CAMPAIGN_FIELD);
    public static final CampaignErrorReason INVALID_CAMPAIGN_NAME = new CampaignErrorReason(_INVALID_CAMPAIGN_NAME);
    public static final CampaignErrorReason INVALID_AD_SERVING_OPTIMIZATION_STATUS = new CampaignErrorReason(_INVALID_AD_SERVING_OPTIMIZATION_STATUS);
    public static final CampaignErrorReason INVALID_TRACKING_URL = new CampaignErrorReason(_INVALID_TRACKING_URL);
    public static final CampaignErrorReason MAX_IMPRESSIONS_NOT_IN_RANGE = new CampaignErrorReason(_MAX_IMPRESSIONS_NOT_IN_RANGE);
    public static final CampaignErrorReason START_DATE_AFTER_END_DATE = new CampaignErrorReason(_START_DATE_AFTER_END_DATE);
    public static final CampaignErrorReason TIME_UNIT_NOT_SUPPORTED = new CampaignErrorReason(_TIME_UNIT_NOT_SUPPORTED);
    public static final CampaignErrorReason INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED = new CampaignErrorReason(_INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED);
    public static final CampaignErrorReason BUDGET_CANNOT_BE_SHARED = new CampaignErrorReason(_BUDGET_CANNOT_BE_SHARED);
    public static final CampaignErrorReason CANNOT_SET_BUDGET = new CampaignErrorReason(_CANNOT_SET_BUDGET);
    public static final CampaignErrorReason CAMPAIGN_CANNOT_USE_SHARED_BUDGET = new CampaignErrorReason(_CAMPAIGN_CANNOT_USE_SHARED_BUDGET);
    public static final CampaignErrorReason MUST_SPECIFY_KEYWORD_MATCH_SETTINGS = new CampaignErrorReason(_MUST_SPECIFY_KEYWORD_MATCH_SETTINGS);
    public static final CampaignErrorReason BIDDING_STRATEGY_NOT_SUPPORTED_WITH_BID_MODIFIER = new CampaignErrorReason(_BIDDING_STRATEGY_NOT_SUPPORTED_WITH_BID_MODIFIER);
    public static final CampaignErrorReason UNKNOWN = new CampaignErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CampaignErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignErrorReason enumeration = (CampaignErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CampaignErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "CampaignError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

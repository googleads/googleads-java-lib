/**
 * BiddingTransitionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;

public class BiddingTransitionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BiddingTransitionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BID_TO_POSITION_ENABLED = "BID_TO_POSITION_ENABLED";
    public static final java.lang.String _BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE = "BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE";
    public static final java.lang.String _BUDGET_OPTIMIZER_IS_ENABLED = "BUDGET_OPTIMIZER_IS_ENABLED";
    public static final java.lang.String _CONVERSION_OPTIMIZER_IS_ENABLED = "CONVERSION_OPTIMIZER_IS_ENABLED";
    public static final java.lang.String _CONVERSION_TRACKING_NOT_ENABLED = "CONVERSION_TRACKING_NOT_ENABLED";
    public static final java.lang.String _CONVERSION_TRACKING_NOT_AVAILABLE_FOR_ACCOUNT_TYPE = "CONVERSION_TRACKING_NOT_AVAILABLE_FOR_ACCOUNT_TYPE";
    public static final java.lang.String _USE_POSITION_PREFERENCE_IN_MANUALCPC_INSTEAD_TO_DISABLE_POSITION_PREFERENCE = "USE_POSITION_PREFERENCE_IN_MANUALCPC_INSTEAD_TO_DISABLE_POSITION_PREFERENCE";
    public static final java.lang.String _INVALID_BID = "INVALID_BID";
    public static final java.lang.String _CANNOT_SET_EXPLICIT_BID = "CANNOT_SET_EXPLICIT_BID";
    public static final java.lang.String _EXPLICIT_BID_REQUIRED_FOR_TRANSITION = "EXPLICIT_BID_REQUIRED_FOR_TRANSITION";
    public static final java.lang.String _EXPLICIT_BID_TYPE_DOES_NOT_MATCH_CAMPAIGN_BIDDING_STRATEGY = "EXPLICIT_BID_TYPE_DOES_NOT_MATCH_CAMPAIGN_BIDDING_STRATEGY";
    public static final java.lang.String _MISSING_REQUIRED_BID = "MISSING_REQUIRED_BID";
    public static final java.lang.String _INVALID_STATUS = "INVALID_STATUS";
    public static final java.lang.String _IS_CPM_CAMPAIGN = "IS_CPM_CAMPAIGN";
    public static final java.lang.String _IS_PERCENT_CPA_CAMPAIGN = "IS_PERCENT_CPA_CAMPAIGN";
    public static final java.lang.String _NOT_THE_PREVIOUS_BIDDING_STRATEGY = "NOT_THE_PREVIOUS_BIDDING_STRATEGY";
    public static final java.lang.String _NOT_ENOUGH_CONVERSION_DATA = "NOT_ENOUGH_CONVERSION_DATA";
    public static final java.lang.String _NOT_ENOUGH_CONVERSIONS = "NOT_ENOUGH_CONVERSIONS";
    public static final java.lang.String _OPTED_IN_SEARCH = "OPTED_IN_SEARCH";
    public static final java.lang.String _PROXY_BIDDING_ON = "PROXY_BIDDING_ON";
    public static final java.lang.String _SITE_REMNANT_RESERVATION_ALLOWED = "SITE_REMNANT_RESERVATION_ALLOWED";
    public static final java.lang.String _TRANSITION_TO_ITSELF = "TRANSITION_TO_ITSELF";
    public static final java.lang.String _UNKNOWN_BIDDING_STRATEGY = "UNKNOWN_BIDDING_STRATEGY";
    public static final java.lang.String _UNSUPPORTED_TRANSITION = "UNSUPPORTED_TRANSITION";
    public static final java.lang.String _VCG_ENABLED = "VCG_ENABLED";
    public static final java.lang.String _BIDDING_TRANSITION_FAILED = "BIDDING_TRANSITION_FAILED";
    public static final java.lang.String _ACCELERATED_DELIVERY_NOT_SUPPORTED_FOR_BUDGET_OPTIMIZER = "ACCELERATED_DELIVERY_NOT_SUPPORTED_FOR_BUDGET_OPTIMIZER";
    public static final java.lang.String _HAS_ACTIVE_EXPERIMENT = "HAS_ACTIVE_EXPERIMENT";
    public static final java.lang.String _INCOMPATIBLE_WITH_CAMPAIGN_SETTING = "INCOMPATIBLE_WITH_CAMPAIGN_SETTING";
    public static final BiddingTransitionErrorReason BID_TO_POSITION_ENABLED = new BiddingTransitionErrorReason(_BID_TO_POSITION_ENABLED);
    public static final BiddingTransitionErrorReason BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE = new BiddingTransitionErrorReason(_BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE);
    public static final BiddingTransitionErrorReason BUDGET_OPTIMIZER_IS_ENABLED = new BiddingTransitionErrorReason(_BUDGET_OPTIMIZER_IS_ENABLED);
    public static final BiddingTransitionErrorReason CONVERSION_OPTIMIZER_IS_ENABLED = new BiddingTransitionErrorReason(_CONVERSION_OPTIMIZER_IS_ENABLED);
    public static final BiddingTransitionErrorReason CONVERSION_TRACKING_NOT_ENABLED = new BiddingTransitionErrorReason(_CONVERSION_TRACKING_NOT_ENABLED);
    public static final BiddingTransitionErrorReason CONVERSION_TRACKING_NOT_AVAILABLE_FOR_ACCOUNT_TYPE = new BiddingTransitionErrorReason(_CONVERSION_TRACKING_NOT_AVAILABLE_FOR_ACCOUNT_TYPE);
    public static final BiddingTransitionErrorReason USE_POSITION_PREFERENCE_IN_MANUALCPC_INSTEAD_TO_DISABLE_POSITION_PREFERENCE = new BiddingTransitionErrorReason(_USE_POSITION_PREFERENCE_IN_MANUALCPC_INSTEAD_TO_DISABLE_POSITION_PREFERENCE);
    public static final BiddingTransitionErrorReason INVALID_BID = new BiddingTransitionErrorReason(_INVALID_BID);
    public static final BiddingTransitionErrorReason CANNOT_SET_EXPLICIT_BID = new BiddingTransitionErrorReason(_CANNOT_SET_EXPLICIT_BID);
    public static final BiddingTransitionErrorReason EXPLICIT_BID_REQUIRED_FOR_TRANSITION = new BiddingTransitionErrorReason(_EXPLICIT_BID_REQUIRED_FOR_TRANSITION);
    public static final BiddingTransitionErrorReason EXPLICIT_BID_TYPE_DOES_NOT_MATCH_CAMPAIGN_BIDDING_STRATEGY = new BiddingTransitionErrorReason(_EXPLICIT_BID_TYPE_DOES_NOT_MATCH_CAMPAIGN_BIDDING_STRATEGY);
    public static final BiddingTransitionErrorReason MISSING_REQUIRED_BID = new BiddingTransitionErrorReason(_MISSING_REQUIRED_BID);
    public static final BiddingTransitionErrorReason INVALID_STATUS = new BiddingTransitionErrorReason(_INVALID_STATUS);
    public static final BiddingTransitionErrorReason IS_CPM_CAMPAIGN = new BiddingTransitionErrorReason(_IS_CPM_CAMPAIGN);
    public static final BiddingTransitionErrorReason IS_PERCENT_CPA_CAMPAIGN = new BiddingTransitionErrorReason(_IS_PERCENT_CPA_CAMPAIGN);
    public static final BiddingTransitionErrorReason NOT_THE_PREVIOUS_BIDDING_STRATEGY = new BiddingTransitionErrorReason(_NOT_THE_PREVIOUS_BIDDING_STRATEGY);
    public static final BiddingTransitionErrorReason NOT_ENOUGH_CONVERSION_DATA = new BiddingTransitionErrorReason(_NOT_ENOUGH_CONVERSION_DATA);
    public static final BiddingTransitionErrorReason NOT_ENOUGH_CONVERSIONS = new BiddingTransitionErrorReason(_NOT_ENOUGH_CONVERSIONS);
    public static final BiddingTransitionErrorReason OPTED_IN_SEARCH = new BiddingTransitionErrorReason(_OPTED_IN_SEARCH);
    public static final BiddingTransitionErrorReason PROXY_BIDDING_ON = new BiddingTransitionErrorReason(_PROXY_BIDDING_ON);
    public static final BiddingTransitionErrorReason SITE_REMNANT_RESERVATION_ALLOWED = new BiddingTransitionErrorReason(_SITE_REMNANT_RESERVATION_ALLOWED);
    public static final BiddingTransitionErrorReason TRANSITION_TO_ITSELF = new BiddingTransitionErrorReason(_TRANSITION_TO_ITSELF);
    public static final BiddingTransitionErrorReason UNKNOWN_BIDDING_STRATEGY = new BiddingTransitionErrorReason(_UNKNOWN_BIDDING_STRATEGY);
    public static final BiddingTransitionErrorReason UNSUPPORTED_TRANSITION = new BiddingTransitionErrorReason(_UNSUPPORTED_TRANSITION);
    public static final BiddingTransitionErrorReason VCG_ENABLED = new BiddingTransitionErrorReason(_VCG_ENABLED);
    public static final BiddingTransitionErrorReason BIDDING_TRANSITION_FAILED = new BiddingTransitionErrorReason(_BIDDING_TRANSITION_FAILED);
    public static final BiddingTransitionErrorReason ACCELERATED_DELIVERY_NOT_SUPPORTED_FOR_BUDGET_OPTIMIZER = new BiddingTransitionErrorReason(_ACCELERATED_DELIVERY_NOT_SUPPORTED_FOR_BUDGET_OPTIMIZER);
    public static final BiddingTransitionErrorReason HAS_ACTIVE_EXPERIMENT = new BiddingTransitionErrorReason(_HAS_ACTIVE_EXPERIMENT);
    public static final BiddingTransitionErrorReason INCOMPATIBLE_WITH_CAMPAIGN_SETTING = new BiddingTransitionErrorReason(_INCOMPATIBLE_WITH_CAMPAIGN_SETTING);
    public java.lang.String getValue() { return _value_;}
    public static BiddingTransitionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BiddingTransitionErrorReason enumeration = (BiddingTransitionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BiddingTransitionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BiddingTransitionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "BiddingTransitionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

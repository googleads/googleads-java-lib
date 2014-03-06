/**
 * BiddingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;

public class BiddingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BiddingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BID_AMOUNT_REQUIRED = "BID_AMOUNT_REQUIRED";
    public static final java.lang.String _BID_TOO_SMALL = "BID_TOO_SMALL";
    public static final java.lang.String _BID_TOO_BIG = "BID_TOO_BIG";
    public static final java.lang.String _BID_TOO_MANY_FRACTIONAL_DIGITS = "BID_TOO_MANY_FRACTIONAL_DIGITS";
    public static final java.lang.String _NON_POSITIVE_BID = "NON_POSITIVE_BID";
    public static final java.lang.String _BID_TOO_HIGH_FOR_DAILY_BUDGET = "BID_TOO_HIGH_FOR_DAILY_BUDGET";
    public static final java.lang.String _BID_TOO_HIGH_FOR_MONTHLY_BUDGET = "BID_TOO_HIGH_FOR_MONTHLY_BUDGET";
    public static final java.lang.String _MUST_EXCLUDE_0_TO_17_WITH_OTHER_AGE_EXCLUSIONS = "MUST_EXCLUDE_0_TO_17_WITH_OTHER_AGE_EXCLUSIONS";
    public static final java.lang.String _CAMPAIGN_MUST_HAVE_A_BUDGET_TO_ENABLE_BUDGET_OPTIMIZER = "CAMPAIGN_MUST_HAVE_A_BUDGET_TO_ENABLE_BUDGET_OPTIMIZER";
    public static final java.lang.String _CANNOT_SET_CONTENT_BID_WITHOUT_SETTING_KEYWORD_MAX_CPC_AS_WELL = "CANNOT_SET_CONTENT_BID_WITHOUT_SETTING_KEYWORD_MAX_CPC_AS_WELL";
    public static final java.lang.String _CANNOT_CREATE_CAMPAIGN_WITH_CONVERSION_OPTIMIZER = "CANNOT_CREATE_CAMPAIGN_WITH_CONVERSION_OPTIMIZER";
    public static final java.lang.String _PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER = "PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER";
    public static final java.lang.String _PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA = "PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA";
    public static final java.lang.String _PAY_PER_CONVERSION_NOT_ALLOWED_WITH_MANY_PER_CLICK = "PAY_PER_CONVERSION_NOT_ALLOWED_WITH_MANY_PER_CLICK";
    public static final java.lang.String _TARGET_CPA_NOT_AVAILABLE_FOR_CUSTOMER = "TARGET_CPA_NOT_AVAILABLE_FOR_CUSTOMER";
    public static final java.lang.String _MANY_PER_CLICK_NOT_AVAILABLE_FOR_CUSTOMER = "MANY_PER_CLICK_NOT_AVAILABLE_FOR_CUSTOMER";
    public static final java.lang.String _CANNOT_SET_SITE_MAX_CPC = "CANNOT_SET_SITE_MAX_CPC";
    public static final java.lang.String _BID_ERROR = "BID_ERROR";
    public static final BiddingErrorReason BID_AMOUNT_REQUIRED = new BiddingErrorReason(_BID_AMOUNT_REQUIRED);
    public static final BiddingErrorReason BID_TOO_SMALL = new BiddingErrorReason(_BID_TOO_SMALL);
    public static final BiddingErrorReason BID_TOO_BIG = new BiddingErrorReason(_BID_TOO_BIG);
    public static final BiddingErrorReason BID_TOO_MANY_FRACTIONAL_DIGITS = new BiddingErrorReason(_BID_TOO_MANY_FRACTIONAL_DIGITS);
    public static final BiddingErrorReason NON_POSITIVE_BID = new BiddingErrorReason(_NON_POSITIVE_BID);
    public static final BiddingErrorReason BID_TOO_HIGH_FOR_DAILY_BUDGET = new BiddingErrorReason(_BID_TOO_HIGH_FOR_DAILY_BUDGET);
    public static final BiddingErrorReason BID_TOO_HIGH_FOR_MONTHLY_BUDGET = new BiddingErrorReason(_BID_TOO_HIGH_FOR_MONTHLY_BUDGET);
    public static final BiddingErrorReason MUST_EXCLUDE_0_TO_17_WITH_OTHER_AGE_EXCLUSIONS = new BiddingErrorReason(_MUST_EXCLUDE_0_TO_17_WITH_OTHER_AGE_EXCLUSIONS);
    public static final BiddingErrorReason CAMPAIGN_MUST_HAVE_A_BUDGET_TO_ENABLE_BUDGET_OPTIMIZER = new BiddingErrorReason(_CAMPAIGN_MUST_HAVE_A_BUDGET_TO_ENABLE_BUDGET_OPTIMIZER);
    public static final BiddingErrorReason CANNOT_SET_CONTENT_BID_WITHOUT_SETTING_KEYWORD_MAX_CPC_AS_WELL = new BiddingErrorReason(_CANNOT_SET_CONTENT_BID_WITHOUT_SETTING_KEYWORD_MAX_CPC_AS_WELL);
    public static final BiddingErrorReason CANNOT_CREATE_CAMPAIGN_WITH_CONVERSION_OPTIMIZER = new BiddingErrorReason(_CANNOT_CREATE_CAMPAIGN_WITH_CONVERSION_OPTIMIZER);
    public static final BiddingErrorReason PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER = new BiddingErrorReason(_PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER);
    public static final BiddingErrorReason PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA = new BiddingErrorReason(_PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA);
    public static final BiddingErrorReason PAY_PER_CONVERSION_NOT_ALLOWED_WITH_MANY_PER_CLICK = new BiddingErrorReason(_PAY_PER_CONVERSION_NOT_ALLOWED_WITH_MANY_PER_CLICK);
    public static final BiddingErrorReason TARGET_CPA_NOT_AVAILABLE_FOR_CUSTOMER = new BiddingErrorReason(_TARGET_CPA_NOT_AVAILABLE_FOR_CUSTOMER);
    public static final BiddingErrorReason MANY_PER_CLICK_NOT_AVAILABLE_FOR_CUSTOMER = new BiddingErrorReason(_MANY_PER_CLICK_NOT_AVAILABLE_FOR_CUSTOMER);
    public static final BiddingErrorReason CANNOT_SET_SITE_MAX_CPC = new BiddingErrorReason(_CANNOT_SET_SITE_MAX_CPC);
    public static final BiddingErrorReason BID_ERROR = new BiddingErrorReason(_BID_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static BiddingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BiddingErrorReason enumeration = (BiddingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BiddingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BiddingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "BiddingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * LineItemErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201505;

public class LineItemErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LineItemErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALREADY_STARTED = "ALREADY_STARTED";
    public static final java.lang.String _UPDATE_RESERVATION_NOT_ALLOWED = "UPDATE_RESERVATION_NOT_ALLOWED";
    public static final java.lang.String _ALL_ROADBLOCK_NOT_ALLOWED = "ALL_ROADBLOCK_NOT_ALLOWED";
    public static final java.lang.String _CREATIVE_SET_ROADBLOCK_NOT_ALLOWED = "CREATIVE_SET_ROADBLOCK_NOT_ALLOWED";
    public static final java.lang.String _FRACTIONAL_PERCENTAGE_NOT_ALLOWED = "FRACTIONAL_PERCENTAGE_NOT_ALLOWED";
    public static final java.lang.String _DISCOUNT_NOT_ALLOWED = "DISCOUNT_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_CANCELED_LINE_ITEM_NOT_ALLOWED = "UPDATE_CANCELED_LINE_ITEM_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_PENDING_APPROVAL_LINE_ITEM_NOT_ALLOWED = "UPDATE_PENDING_APPROVAL_LINE_ITEM_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_ARCHIVED_LINE_ITEM_NOT_ALLOWED = "UPDATE_ARCHIVED_LINE_ITEM_NOT_ALLOWED";
    public static final java.lang.String _CREATE_OR_UPDATE_LEGACY_DFP_LINE_ITEM_TYPE_NOT_ALLOWED = "CREATE_OR_UPDATE_LEGACY_DFP_LINE_ITEM_TYPE_NOT_ALLOWED";
    public static final java.lang.String _COPY_LINE_ITEM_FROM_DIFFERENT_COMPANY_NOT_ALLOWED = "COPY_LINE_ITEM_FROM_DIFFERENT_COMPANY_NOT_ALLOWED";
    public static final java.lang.String _INVALID_SIZE_FOR_PLATFORM = "INVALID_SIZE_FOR_PLATFORM";
    public static final java.lang.String _INVALID_LINE_ITEM_TYPE_FOR_PLATFORM = "INVALID_LINE_ITEM_TYPE_FOR_PLATFORM";
    public static final java.lang.String _INVALID_WEB_PROPERTY_FOR_PLATFORM = "INVALID_WEB_PROPERTY_FOR_PLATFORM";
    public static final java.lang.String _INVALID_WEB_PROPERTY_FOR_ENVIRONMENT = "INVALID_WEB_PROPERTY_FOR_ENVIRONMENT";
    public static final java.lang.String _AFMA_BACKFILL_NOT_ALLOWED = "AFMA_BACKFILL_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_ENVIRONMENT_TYPE_NOT_ALLOWED = "UPDATE_ENVIRONMENT_TYPE_NOT_ALLOWED";
    public static final java.lang.String _COMPANIONS_NOT_ALLOWED = "COMPANIONS_NOT_ALLOWED";
    public static final java.lang.String _ROADBLOCKS_WITH_NONROADBLOCKS_NOT_ALLOWED = "ROADBLOCKS_WITH_NONROADBLOCKS_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK = "CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK";
    public static final java.lang.String _UPDATE_FROM_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED = "UPDATE_FROM_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_TO_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED = "UPDATE_TO_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_BACKFILL_WEB_PROPERTY_NOT_ALLOWED = "UPDATE_BACKFILL_WEB_PROPERTY_NOT_ALLOWED";
    public static final java.lang.String _INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE = "INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE";
    public static final java.lang.String _COMPANION_BACKFILL_REQUIRES_VIDEO = "COMPANION_BACKFILL_REQUIRES_VIDEO";
    public static final java.lang.String _COMPANION_DELIVERY_OPTION_REQUIRE_PREMIUM = "COMPANION_DELIVERY_OPTION_REQUIRE_PREMIUM";
    public static final java.lang.String _DUPLICATE_MASTER_SIZES = "DUPLICATE_MASTER_SIZES";
    public static final java.lang.String _INVALID_PRIORITY_FOR_LINE_ITEM_TYPE = "INVALID_PRIORITY_FOR_LINE_ITEM_TYPE";
    public static final java.lang.String _INVALID_ENVIRONMENT_TYPE = "INVALID_ENVIRONMENT_TYPE";
    public static final java.lang.String _INVALID_ENVIRONMENT_TYPE_FOR_PLATFORM = "INVALID_ENVIRONMENT_TYPE_FOR_PLATFORM";
    public static final java.lang.String _INVALID_TYPE_FOR_AUTO_EXTENSION = "INVALID_TYPE_FOR_AUTO_EXTENSION";
    public static final java.lang.String _VIDEO_INVALID_ROADBLOCKING = "VIDEO_INVALID_ROADBLOCKING";
    public static final java.lang.String _BACKFILL_TYPE_NOT_ALLOWED = "BACKFILL_TYPE_NOT_ALLOWED";
    public static final java.lang.String _INVALID_BACKFILL_LINK_TYPE = "INVALID_BACKFILL_LINK_TYPE";
    public static final java.lang.String _DIFFERENT_BACKFILL_WEB_PROPERTY_CODE = "DIFFERENT_BACKFILL_WEB_PROPERTY_CODE";
    public static final java.lang.String _COMPANION_DELIVERY_OPTIONS_NOT_ALLOWED_WITH_BACKFILL = "COMPANION_DELIVERY_OPTIONS_NOT_ALLOWED_WITH_BACKFILL";
    public static final java.lang.String _INVALID_WEB_PROPERTY_FOR_ADX_BACKFILL = "INVALID_WEB_PROPERTY_FOR_ADX_BACKFILL";
    public static final java.lang.String _INVALID_SIZE_FOR_ENVIRONMENT = "INVALID_SIZE_FOR_ENVIRONMENT";
    public static final java.lang.String _TARGET_PLATOFRM_NOT_ALLOWED = "TARGET_PLATOFRM_NOT_ALLOWED";
    public static final java.lang.String _INVALID_LINE_ITEM_CURRENCY = "INVALID_LINE_ITEM_CURRENCY";
    public static final java.lang.String _LINE_ITEM_CANNOT_HAVE_MULTIPLE_CURRENCIES = "LINE_ITEM_CANNOT_HAVE_MULTIPLE_CURRENCIES";
    public static final java.lang.String _CANNOT_CHANGE_CURRENCY = "CANNOT_CHANGE_CURRENCY";
    public static final java.lang.String _INVALID_FOR_OFFLINE = "INVALID_FOR_OFFLINE";
    public static final java.lang.String _INVALID_LINE_ITEM_DATE_TIME = "INVALID_LINE_ITEM_DATE_TIME";
    public static final java.lang.String _INVALID_COST_PER_UNIT_FOR_CPA = "INVALID_COST_PER_UNIT_FOR_CPA";
    public static final java.lang.String _UPDATE_CPA_COST_TYPE_NOT_ALLOWED = "UPDATE_CPA_COST_TYPE_NOT_ALLOWED";
    public static final java.lang.String _DUPLICATED_UNIT_TYPE = "DUPLICATED_UNIT_TYPE";
    public static final java.lang.String _MULTIPLE_GOAL_TYPE_NOT_ALLOWED = "MULTIPLE_GOAL_TYPE_NOT_ALLOWED";
    public static final java.lang.String _INVALID_UNIT_TYPE_COMBINATION_FOR_SECONDARY_GOALS = "INVALID_UNIT_TYPE_COMBINATION_FOR_SECONDARY_GOALS";
    public static final java.lang.String _UNSUPPORTED_LINE_ITEM_TYPE_FOR_THIS_API_VERSION = "UNSUPPORTED_LINE_ITEM_TYPE_FOR_THIS_API_VERSION";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final LineItemErrorReason ALREADY_STARTED = new LineItemErrorReason(_ALREADY_STARTED);
    public static final LineItemErrorReason UPDATE_RESERVATION_NOT_ALLOWED = new LineItemErrorReason(_UPDATE_RESERVATION_NOT_ALLOWED);
    public static final LineItemErrorReason ALL_ROADBLOCK_NOT_ALLOWED = new LineItemErrorReason(_ALL_ROADBLOCK_NOT_ALLOWED);
    public static final LineItemErrorReason CREATIVE_SET_ROADBLOCK_NOT_ALLOWED = new LineItemErrorReason(_CREATIVE_SET_ROADBLOCK_NOT_ALLOWED);
    public static final LineItemErrorReason FRACTIONAL_PERCENTAGE_NOT_ALLOWED = new LineItemErrorReason(_FRACTIONAL_PERCENTAGE_NOT_ALLOWED);
    public static final LineItemErrorReason DISCOUNT_NOT_ALLOWED = new LineItemErrorReason(_DISCOUNT_NOT_ALLOWED);
    public static final LineItemErrorReason UPDATE_CANCELED_LINE_ITEM_NOT_ALLOWED = new LineItemErrorReason(_UPDATE_CANCELED_LINE_ITEM_NOT_ALLOWED);
    public static final LineItemErrorReason UPDATE_PENDING_APPROVAL_LINE_ITEM_NOT_ALLOWED = new LineItemErrorReason(_UPDATE_PENDING_APPROVAL_LINE_ITEM_NOT_ALLOWED);
    public static final LineItemErrorReason UPDATE_ARCHIVED_LINE_ITEM_NOT_ALLOWED = new LineItemErrorReason(_UPDATE_ARCHIVED_LINE_ITEM_NOT_ALLOWED);
    public static final LineItemErrorReason CREATE_OR_UPDATE_LEGACY_DFP_LINE_ITEM_TYPE_NOT_ALLOWED = new LineItemErrorReason(_CREATE_OR_UPDATE_LEGACY_DFP_LINE_ITEM_TYPE_NOT_ALLOWED);
    public static final LineItemErrorReason COPY_LINE_ITEM_FROM_DIFFERENT_COMPANY_NOT_ALLOWED = new LineItemErrorReason(_COPY_LINE_ITEM_FROM_DIFFERENT_COMPANY_NOT_ALLOWED);
    public static final LineItemErrorReason INVALID_SIZE_FOR_PLATFORM = new LineItemErrorReason(_INVALID_SIZE_FOR_PLATFORM);
    public static final LineItemErrorReason INVALID_LINE_ITEM_TYPE_FOR_PLATFORM = new LineItemErrorReason(_INVALID_LINE_ITEM_TYPE_FOR_PLATFORM);
    public static final LineItemErrorReason INVALID_WEB_PROPERTY_FOR_PLATFORM = new LineItemErrorReason(_INVALID_WEB_PROPERTY_FOR_PLATFORM);
    public static final LineItemErrorReason INVALID_WEB_PROPERTY_FOR_ENVIRONMENT = new LineItemErrorReason(_INVALID_WEB_PROPERTY_FOR_ENVIRONMENT);
    public static final LineItemErrorReason AFMA_BACKFILL_NOT_ALLOWED = new LineItemErrorReason(_AFMA_BACKFILL_NOT_ALLOWED);
    public static final LineItemErrorReason UPDATE_ENVIRONMENT_TYPE_NOT_ALLOWED = new LineItemErrorReason(_UPDATE_ENVIRONMENT_TYPE_NOT_ALLOWED);
    public static final LineItemErrorReason COMPANIONS_NOT_ALLOWED = new LineItemErrorReason(_COMPANIONS_NOT_ALLOWED);
    public static final LineItemErrorReason ROADBLOCKS_WITH_NONROADBLOCKS_NOT_ALLOWED = new LineItemErrorReason(_ROADBLOCKS_WITH_NONROADBLOCKS_NOT_ALLOWED);
    public static final LineItemErrorReason CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK = new LineItemErrorReason(_CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK);
    public static final LineItemErrorReason UPDATE_FROM_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED = new LineItemErrorReason(_UPDATE_FROM_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED);
    public static final LineItemErrorReason UPDATE_TO_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED = new LineItemErrorReason(_UPDATE_TO_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED);
    public static final LineItemErrorReason UPDATE_BACKFILL_WEB_PROPERTY_NOT_ALLOWED = new LineItemErrorReason(_UPDATE_BACKFILL_WEB_PROPERTY_NOT_ALLOWED);
    public static final LineItemErrorReason INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE = new LineItemErrorReason(_INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE);
    public static final LineItemErrorReason COMPANION_BACKFILL_REQUIRES_VIDEO = new LineItemErrorReason(_COMPANION_BACKFILL_REQUIRES_VIDEO);
    public static final LineItemErrorReason COMPANION_DELIVERY_OPTION_REQUIRE_PREMIUM = new LineItemErrorReason(_COMPANION_DELIVERY_OPTION_REQUIRE_PREMIUM);
    public static final LineItemErrorReason DUPLICATE_MASTER_SIZES = new LineItemErrorReason(_DUPLICATE_MASTER_SIZES);
    public static final LineItemErrorReason INVALID_PRIORITY_FOR_LINE_ITEM_TYPE = new LineItemErrorReason(_INVALID_PRIORITY_FOR_LINE_ITEM_TYPE);
    public static final LineItemErrorReason INVALID_ENVIRONMENT_TYPE = new LineItemErrorReason(_INVALID_ENVIRONMENT_TYPE);
    public static final LineItemErrorReason INVALID_ENVIRONMENT_TYPE_FOR_PLATFORM = new LineItemErrorReason(_INVALID_ENVIRONMENT_TYPE_FOR_PLATFORM);
    public static final LineItemErrorReason INVALID_TYPE_FOR_AUTO_EXTENSION = new LineItemErrorReason(_INVALID_TYPE_FOR_AUTO_EXTENSION);
    public static final LineItemErrorReason VIDEO_INVALID_ROADBLOCKING = new LineItemErrorReason(_VIDEO_INVALID_ROADBLOCKING);
    public static final LineItemErrorReason BACKFILL_TYPE_NOT_ALLOWED = new LineItemErrorReason(_BACKFILL_TYPE_NOT_ALLOWED);
    public static final LineItemErrorReason INVALID_BACKFILL_LINK_TYPE = new LineItemErrorReason(_INVALID_BACKFILL_LINK_TYPE);
    public static final LineItemErrorReason DIFFERENT_BACKFILL_WEB_PROPERTY_CODE = new LineItemErrorReason(_DIFFERENT_BACKFILL_WEB_PROPERTY_CODE);
    public static final LineItemErrorReason COMPANION_DELIVERY_OPTIONS_NOT_ALLOWED_WITH_BACKFILL = new LineItemErrorReason(_COMPANION_DELIVERY_OPTIONS_NOT_ALLOWED_WITH_BACKFILL);
    public static final LineItemErrorReason INVALID_WEB_PROPERTY_FOR_ADX_BACKFILL = new LineItemErrorReason(_INVALID_WEB_PROPERTY_FOR_ADX_BACKFILL);
    public static final LineItemErrorReason INVALID_SIZE_FOR_ENVIRONMENT = new LineItemErrorReason(_INVALID_SIZE_FOR_ENVIRONMENT);
    public static final LineItemErrorReason TARGET_PLATOFRM_NOT_ALLOWED = new LineItemErrorReason(_TARGET_PLATOFRM_NOT_ALLOWED);
    public static final LineItemErrorReason INVALID_LINE_ITEM_CURRENCY = new LineItemErrorReason(_INVALID_LINE_ITEM_CURRENCY);
    public static final LineItemErrorReason LINE_ITEM_CANNOT_HAVE_MULTIPLE_CURRENCIES = new LineItemErrorReason(_LINE_ITEM_CANNOT_HAVE_MULTIPLE_CURRENCIES);
    public static final LineItemErrorReason CANNOT_CHANGE_CURRENCY = new LineItemErrorReason(_CANNOT_CHANGE_CURRENCY);
    public static final LineItemErrorReason INVALID_FOR_OFFLINE = new LineItemErrorReason(_INVALID_FOR_OFFLINE);
    public static final LineItemErrorReason INVALID_LINE_ITEM_DATE_TIME = new LineItemErrorReason(_INVALID_LINE_ITEM_DATE_TIME);
    public static final LineItemErrorReason INVALID_COST_PER_UNIT_FOR_CPA = new LineItemErrorReason(_INVALID_COST_PER_UNIT_FOR_CPA);
    public static final LineItemErrorReason UPDATE_CPA_COST_TYPE_NOT_ALLOWED = new LineItemErrorReason(_UPDATE_CPA_COST_TYPE_NOT_ALLOWED);
    public static final LineItemErrorReason DUPLICATED_UNIT_TYPE = new LineItemErrorReason(_DUPLICATED_UNIT_TYPE);
    public static final LineItemErrorReason MULTIPLE_GOAL_TYPE_NOT_ALLOWED = new LineItemErrorReason(_MULTIPLE_GOAL_TYPE_NOT_ALLOWED);
    public static final LineItemErrorReason INVALID_UNIT_TYPE_COMBINATION_FOR_SECONDARY_GOALS = new LineItemErrorReason(_INVALID_UNIT_TYPE_COMBINATION_FOR_SECONDARY_GOALS);
    public static final LineItemErrorReason UNSUPPORTED_LINE_ITEM_TYPE_FOR_THIS_API_VERSION = new LineItemErrorReason(_UNSUPPORTED_LINE_ITEM_TYPE_FOR_THIS_API_VERSION);
    public static final LineItemErrorReason UNKNOWN = new LineItemErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static LineItemErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LineItemErrorReason enumeration = (LineItemErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LineItemErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LineItemErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "LineItemError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

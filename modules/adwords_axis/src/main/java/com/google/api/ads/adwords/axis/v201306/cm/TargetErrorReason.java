/**
 * TargetErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;

public class TargetErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TargetErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AD_SCHEDULE_ADVANCED_INCOMPATIBLE_WITH_CONVERSION_OPTIMIZER = "AD_SCHEDULE_ADVANCED_INCOMPATIBLE_WITH_CONVERSION_OPTIMIZER";
    public static final java.lang.String _AD_SCHEDULE_BID_MULTIPLIER_MALFORMED = "AD_SCHEDULE_BID_MULTIPLIER_MALFORMED";
    public static final java.lang.String _AD_SCHEDULE_BID_MULTIPLIER_TOO_BIG = "AD_SCHEDULE_BID_MULTIPLIER_TOO_BIG";
    public static final java.lang.String _AD_SCHEDULE_BID_MULTIPLIER_TOO_SMALL = "AD_SCHEDULE_BID_MULTIPLIER_TOO_SMALL";
    public static final java.lang.String _AD_SCHEDULE_BID_MULTIPLIER_TOO_MANY_FRACTION_DIGITS = "AD_SCHEDULE_BID_MULTIPLIER_TOO_MANY_FRACTION_DIGITS";
    public static final java.lang.String _AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT = "AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT";
    public static final java.lang.String _AD_SCHEDULE_EXCEEDS_PAST_END_OF_WEEK = "AD_SCHEDULE_EXCEEDS_PAST_END_OF_WEEK";
    public static final java.lang.String _AD_SCHEDULE_INCOMPATIBILITY = "AD_SCHEDULE_INCOMPATIBILITY";
    public static final java.lang.String _AD_SCHEDULE_INCOMPATIBLE_WITH_BUDGET_OPTIMIZER = "AD_SCHEDULE_INCOMPATIBLE_WITH_BUDGET_OPTIMIZER";
    public static final java.lang.String _AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS = "AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS";
    public static final java.lang.String _AD_SCHEDULE_INVALID_DAY_OF_THE_WEEK = "AD_SCHEDULE_INVALID_DAY_OF_THE_WEEK";
    public static final java.lang.String _AD_SCHEDULE_INVALID_TIME_INTERVAL = "AD_SCHEDULE_INVALID_TIME_INTERVAL";
    public static final java.lang.String _AD_SCHEDULE_NO_INTERVALS_WHILE_ENABLED = "AD_SCHEDULE_NO_INTERVALS_WHILE_ENABLED";
    public static final java.lang.String _AD_SCHEDULE_NOT_MULTIPLE_OF_15_MINUTES = "AD_SCHEDULE_NOT_MULTIPLE_OF_15_MINUTES";
    public static final java.lang.String _AD_SCHEDULE_TIME_INTERVALS_OVERLAP = "AD_SCHEDULE_TIME_INTERVALS_OVERLAP";
    public static final java.lang.String _CANNOT_EXCLUDE_CITY = "CANNOT_EXCLUDE_CITY";
    public static final java.lang.String _CANNOT_EXCLUDE_IF_NOT_TARGETED = "CANNOT_EXCLUDE_IF_NOT_TARGETED";
    public static final java.lang.String _CANNOT_EXCLUDE_METRO = "CANNOT_EXCLUDE_METRO";
    public static final java.lang.String _CANNOT_EXCLUDE_PROVINCE = "CANNOT_EXCLUDE_PROVINCE";
    public static final java.lang.String _CANNOT_OPT_OUT_GOOGLE_SEARCH_WHILE_BID_TO_POSITION_ENABLE = "CANNOT_OPT_OUT_GOOGLE_SEARCH_WHILE_BID_TO_POSITION_ENABLE";
    public static final java.lang.String _CANNOT_TARGET_AGE_WITHOUT_GENDER = "CANNOT_TARGET_AGE_WITHOUT_GENDER";
    public static final java.lang.String _CANNOT_TARGET_CITY = "CANNOT_TARGET_CITY";
    public static final java.lang.String _CANNOT_TARGET_CONTENT_CONTEXTUAL_WITHOUT_CONTENT_NETWORK = "CANNOT_TARGET_CONTENT_CONTEXTUAL_WITHOUT_CONTENT_NETWORK";
    public static final java.lang.String _CANNOT_MODIFY_CONTENT_CONTEXTUAL = "CANNOT_MODIFY_CONTENT_CONTEXTUAL";
    public static final java.lang.String _CANNOT_TARGET_COUNTRY = "CANNOT_TARGET_COUNTRY";
    public static final java.lang.String _CANNOT_TARGET_COVERAGE = "CANNOT_TARGET_COVERAGE";
    public static final java.lang.String _CANNOT_TARGET_GENDER_WITHOUT_AGE = "CANNOT_TARGET_GENDER_WITHOUT_AGE";
    public static final java.lang.String _CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN = "CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN";
    public static final java.lang.String _CANNOT_TARGET_LANGUAGE = "CANNOT_TARGET_LANGUAGE";
    public static final java.lang.String _CANNOT_TARGET_METRO = "CANNOT_TARGET_METRO";
    public static final java.lang.String _CANNOT_TARGET_MOBILE_CARRIER = "CANNOT_TARGET_MOBILE_CARRIER";
    public static final java.lang.String _CANNOT_TARGET_PROVINCE = "CANNOT_TARGET_PROVINCE";
    public static final java.lang.String _CANNOT_TARGET_SEARCH_SYNDICATION_WITHOUT_GOOGLE_SEARCH = "CANNOT_TARGET_SEARCH_SYNDICATION_WITHOUT_GOOGLE_SEARCH";
    public static final java.lang.String _CANNOT_TARGET_SYNDICATABLE_TYPES = "CANNOT_TARGET_SYNDICATABLE_TYPES";
    public static final java.lang.String _CANNOT_TARGET_THE_SAME_TARGET_LIST_TYPE_MULTIPLE_TIMES = "CANNOT_TARGET_THE_SAME_TARGET_LIST_TYPE_MULTIPLE_TIMES";
    public static final java.lang.String _DEMOGRAPHIC_BID_MODIFIER_SHOULD_BE_IN_BETWEEN_0_AND_500 = "DEMOGRAPHIC_BID_MODIFIER_SHOULD_BE_IN_BETWEEN_0_AND_500";
    public static final java.lang.String _INVALID_CITY_CODE = "INVALID_CITY_CODE";
    public static final java.lang.String _INVALID_CITYNAME_LENGTH = "INVALID_CITYNAME_LENGTH";
    public static final java.lang.String _INVALID_EXCLUDED_POLYGON_TARGET = "INVALID_EXCLUDED_POLYGON_TARGET";
    public static final java.lang.String _INVALID_EXCLUDED_PROXIMITY_TARGET = "INVALID_EXCLUDED_PROXIMITY_TARGET";
    public static final java.lang.String _INVALID_LANGUAGE_CODE = "INVALID_LANGUAGE_CODE";
    public static final java.lang.String _INVALID_LATITUDE = "INVALID_LATITUDE";
    public static final java.lang.String _INVALID_LONGITUDE = "INVALID_LONGITUDE";
    public static final java.lang.String _INVALID_METRO_CODE = "INVALID_METRO_CODE";
    public static final java.lang.String _INVALID_MOBILE_CARRIER = "INVALID_MOBILE_CARRIER";
    public static final java.lang.String _INVALID_MOBILE_PLATFORM = "INVALID_MOBILE_PLATFORM";
    public static final java.lang.String _INVALID_POSTALCODE_LENGTH = "INVALID_POSTALCODE_LENGTH";
    public static final java.lang.String _INVALID_PROVINCE_CODE = "INVALID_PROVINCE_CODE";
    public static final java.lang.String _INVALID_PROXIMITY_RADIUS = "INVALID_PROXIMITY_RADIUS";
    public static final java.lang.String _INVALID_REGIONCODE_LENGTH = "INVALID_REGIONCODE_LENGTH";
    public static final java.lang.String _INVALID_REGIONNAME_LENGTH = "INVALID_REGIONNAME_LENGTH";
    public static final java.lang.String _INVALID_STREETADDRESS_LENGTH = "INVALID_STREETADDRESS_LENGTH";
    public static final java.lang.String _MULTIPLE_OCCURRENCES_OF_SAME_TARGET = "MULTIPLE_OCCURRENCES_OF_SAME_TARGET";
    public static final java.lang.String _POLYGON_DUPLICATE_VERTICES = "POLYGON_DUPLICATE_VERTICES";
    public static final java.lang.String _POLYGON_EDGES_INTERSECT = "POLYGON_EDGES_INTERSECT";
    public static final java.lang.String _POLYGON_TOO_FEW_VERTICES = "POLYGON_TOO_FEW_VERTICES";
    public static final java.lang.String _POLYGON_TOO_MANY_VERTICES = "POLYGON_TOO_MANY_VERTICES";
    public static final java.lang.String _POLYGON_TOO_LARGE = "POLYGON_TOO_LARGE";
    public static final java.lang.String _TARGETING_VALIDATION_FAILED = "TARGETING_VALIDATION_FAILED";
    public static final java.lang.String _TARGETING_CROSS_COUNTRY_REGIONAL = "TARGETING_CROSS_COUNTRY_REGIONAL";
    public static final java.lang.String _TARGETING_EXCLUSION_NOT_SUPPORTED = "TARGETING_EXCLUSION_NOT_SUPPORTED";
    public static final java.lang.String _TARGETING_INCOMPATIBLE_LOCATION_TYPES = "TARGETING_INCOMPATIBLE_LOCATION_TYPES";
    public static final java.lang.String _TARGETING_NOT_SUPPORTED = "TARGETING_NOT_SUPPORTED";
    public static final java.lang.String _TARGETING_TOO_MANY_REGIONS = "TARGETING_TOO_MANY_REGIONS";
    public static final java.lang.String _TOO_MANY_EXCLUDED_LOCATIONS = "TOO_MANY_EXCLUDED_LOCATIONS";
    public static final java.lang.String _TOO_MANY_TARGETED_LOCATIONS = "TOO_MANY_TARGETED_LOCATIONS";
    public static final java.lang.String _WARNING_MAY_NOW_REQUIRE_CHINESE_APPROVAL = "WARNING_MAY_NOW_REQUIRE_CHINESE_APPROVAL";
    public static final java.lang.String _WARNING_NOW_REQUIRES_CHINESE_APPROVAL = "WARNING_NOW_REQUIRES_CHINESE_APPROVAL";
    public static final java.lang.String _WARNING_NOW_TARGETS_CHINA = "WARNING_NOW_TARGETS_CHINA";
    public static final java.lang.String _WARNING_NOW_TARGETS_CHINESE = "WARNING_NOW_TARGETS_CHINESE";
    public static final java.lang.String _TARGET_ERROR = "TARGET_ERROR";
    public static final TargetErrorReason AD_SCHEDULE_ADVANCED_INCOMPATIBLE_WITH_CONVERSION_OPTIMIZER = new TargetErrorReason(_AD_SCHEDULE_ADVANCED_INCOMPATIBLE_WITH_CONVERSION_OPTIMIZER);
    public static final TargetErrorReason AD_SCHEDULE_BID_MULTIPLIER_MALFORMED = new TargetErrorReason(_AD_SCHEDULE_BID_MULTIPLIER_MALFORMED);
    public static final TargetErrorReason AD_SCHEDULE_BID_MULTIPLIER_TOO_BIG = new TargetErrorReason(_AD_SCHEDULE_BID_MULTIPLIER_TOO_BIG);
    public static final TargetErrorReason AD_SCHEDULE_BID_MULTIPLIER_TOO_SMALL = new TargetErrorReason(_AD_SCHEDULE_BID_MULTIPLIER_TOO_SMALL);
    public static final TargetErrorReason AD_SCHEDULE_BID_MULTIPLIER_TOO_MANY_FRACTION_DIGITS = new TargetErrorReason(_AD_SCHEDULE_BID_MULTIPLIER_TOO_MANY_FRACTION_DIGITS);
    public static final TargetErrorReason AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT = new TargetErrorReason(_AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT);
    public static final TargetErrorReason AD_SCHEDULE_EXCEEDS_PAST_END_OF_WEEK = new TargetErrorReason(_AD_SCHEDULE_EXCEEDS_PAST_END_OF_WEEK);
    public static final TargetErrorReason AD_SCHEDULE_INCOMPATIBILITY = new TargetErrorReason(_AD_SCHEDULE_INCOMPATIBILITY);
    public static final TargetErrorReason AD_SCHEDULE_INCOMPATIBLE_WITH_BUDGET_OPTIMIZER = new TargetErrorReason(_AD_SCHEDULE_INCOMPATIBLE_WITH_BUDGET_OPTIMIZER);
    public static final TargetErrorReason AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS = new TargetErrorReason(_AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS);
    public static final TargetErrorReason AD_SCHEDULE_INVALID_DAY_OF_THE_WEEK = new TargetErrorReason(_AD_SCHEDULE_INVALID_DAY_OF_THE_WEEK);
    public static final TargetErrorReason AD_SCHEDULE_INVALID_TIME_INTERVAL = new TargetErrorReason(_AD_SCHEDULE_INVALID_TIME_INTERVAL);
    public static final TargetErrorReason AD_SCHEDULE_NO_INTERVALS_WHILE_ENABLED = new TargetErrorReason(_AD_SCHEDULE_NO_INTERVALS_WHILE_ENABLED);
    public static final TargetErrorReason AD_SCHEDULE_NOT_MULTIPLE_OF_15_MINUTES = new TargetErrorReason(_AD_SCHEDULE_NOT_MULTIPLE_OF_15_MINUTES);
    public static final TargetErrorReason AD_SCHEDULE_TIME_INTERVALS_OVERLAP = new TargetErrorReason(_AD_SCHEDULE_TIME_INTERVALS_OVERLAP);
    public static final TargetErrorReason CANNOT_EXCLUDE_CITY = new TargetErrorReason(_CANNOT_EXCLUDE_CITY);
    public static final TargetErrorReason CANNOT_EXCLUDE_IF_NOT_TARGETED = new TargetErrorReason(_CANNOT_EXCLUDE_IF_NOT_TARGETED);
    public static final TargetErrorReason CANNOT_EXCLUDE_METRO = new TargetErrorReason(_CANNOT_EXCLUDE_METRO);
    public static final TargetErrorReason CANNOT_EXCLUDE_PROVINCE = new TargetErrorReason(_CANNOT_EXCLUDE_PROVINCE);
    public static final TargetErrorReason CANNOT_OPT_OUT_GOOGLE_SEARCH_WHILE_BID_TO_POSITION_ENABLE = new TargetErrorReason(_CANNOT_OPT_OUT_GOOGLE_SEARCH_WHILE_BID_TO_POSITION_ENABLE);
    public static final TargetErrorReason CANNOT_TARGET_AGE_WITHOUT_GENDER = new TargetErrorReason(_CANNOT_TARGET_AGE_WITHOUT_GENDER);
    public static final TargetErrorReason CANNOT_TARGET_CITY = new TargetErrorReason(_CANNOT_TARGET_CITY);
    public static final TargetErrorReason CANNOT_TARGET_CONTENT_CONTEXTUAL_WITHOUT_CONTENT_NETWORK = new TargetErrorReason(_CANNOT_TARGET_CONTENT_CONTEXTUAL_WITHOUT_CONTENT_NETWORK);
    public static final TargetErrorReason CANNOT_MODIFY_CONTENT_CONTEXTUAL = new TargetErrorReason(_CANNOT_MODIFY_CONTENT_CONTEXTUAL);
    public static final TargetErrorReason CANNOT_TARGET_COUNTRY = new TargetErrorReason(_CANNOT_TARGET_COUNTRY);
    public static final TargetErrorReason CANNOT_TARGET_COVERAGE = new TargetErrorReason(_CANNOT_TARGET_COVERAGE);
    public static final TargetErrorReason CANNOT_TARGET_GENDER_WITHOUT_AGE = new TargetErrorReason(_CANNOT_TARGET_GENDER_WITHOUT_AGE);
    public static final TargetErrorReason CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN = new TargetErrorReason(_CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN);
    public static final TargetErrorReason CANNOT_TARGET_LANGUAGE = new TargetErrorReason(_CANNOT_TARGET_LANGUAGE);
    public static final TargetErrorReason CANNOT_TARGET_METRO = new TargetErrorReason(_CANNOT_TARGET_METRO);
    public static final TargetErrorReason CANNOT_TARGET_MOBILE_CARRIER = new TargetErrorReason(_CANNOT_TARGET_MOBILE_CARRIER);
    public static final TargetErrorReason CANNOT_TARGET_PROVINCE = new TargetErrorReason(_CANNOT_TARGET_PROVINCE);
    public static final TargetErrorReason CANNOT_TARGET_SEARCH_SYNDICATION_WITHOUT_GOOGLE_SEARCH = new TargetErrorReason(_CANNOT_TARGET_SEARCH_SYNDICATION_WITHOUT_GOOGLE_SEARCH);
    public static final TargetErrorReason CANNOT_TARGET_SYNDICATABLE_TYPES = new TargetErrorReason(_CANNOT_TARGET_SYNDICATABLE_TYPES);
    public static final TargetErrorReason CANNOT_TARGET_THE_SAME_TARGET_LIST_TYPE_MULTIPLE_TIMES = new TargetErrorReason(_CANNOT_TARGET_THE_SAME_TARGET_LIST_TYPE_MULTIPLE_TIMES);
    public static final TargetErrorReason DEMOGRAPHIC_BID_MODIFIER_SHOULD_BE_IN_BETWEEN_0_AND_500 = new TargetErrorReason(_DEMOGRAPHIC_BID_MODIFIER_SHOULD_BE_IN_BETWEEN_0_AND_500);
    public static final TargetErrorReason INVALID_CITY_CODE = new TargetErrorReason(_INVALID_CITY_CODE);
    public static final TargetErrorReason INVALID_CITYNAME_LENGTH = new TargetErrorReason(_INVALID_CITYNAME_LENGTH);
    public static final TargetErrorReason INVALID_EXCLUDED_POLYGON_TARGET = new TargetErrorReason(_INVALID_EXCLUDED_POLYGON_TARGET);
    public static final TargetErrorReason INVALID_EXCLUDED_PROXIMITY_TARGET = new TargetErrorReason(_INVALID_EXCLUDED_PROXIMITY_TARGET);
    public static final TargetErrorReason INVALID_LANGUAGE_CODE = new TargetErrorReason(_INVALID_LANGUAGE_CODE);
    public static final TargetErrorReason INVALID_LATITUDE = new TargetErrorReason(_INVALID_LATITUDE);
    public static final TargetErrorReason INVALID_LONGITUDE = new TargetErrorReason(_INVALID_LONGITUDE);
    public static final TargetErrorReason INVALID_METRO_CODE = new TargetErrorReason(_INVALID_METRO_CODE);
    public static final TargetErrorReason INVALID_MOBILE_CARRIER = new TargetErrorReason(_INVALID_MOBILE_CARRIER);
    public static final TargetErrorReason INVALID_MOBILE_PLATFORM = new TargetErrorReason(_INVALID_MOBILE_PLATFORM);
    public static final TargetErrorReason INVALID_POSTALCODE_LENGTH = new TargetErrorReason(_INVALID_POSTALCODE_LENGTH);
    public static final TargetErrorReason INVALID_PROVINCE_CODE = new TargetErrorReason(_INVALID_PROVINCE_CODE);
    public static final TargetErrorReason INVALID_PROXIMITY_RADIUS = new TargetErrorReason(_INVALID_PROXIMITY_RADIUS);
    public static final TargetErrorReason INVALID_REGIONCODE_LENGTH = new TargetErrorReason(_INVALID_REGIONCODE_LENGTH);
    public static final TargetErrorReason INVALID_REGIONNAME_LENGTH = new TargetErrorReason(_INVALID_REGIONNAME_LENGTH);
    public static final TargetErrorReason INVALID_STREETADDRESS_LENGTH = new TargetErrorReason(_INVALID_STREETADDRESS_LENGTH);
    public static final TargetErrorReason MULTIPLE_OCCURRENCES_OF_SAME_TARGET = new TargetErrorReason(_MULTIPLE_OCCURRENCES_OF_SAME_TARGET);
    public static final TargetErrorReason POLYGON_DUPLICATE_VERTICES = new TargetErrorReason(_POLYGON_DUPLICATE_VERTICES);
    public static final TargetErrorReason POLYGON_EDGES_INTERSECT = new TargetErrorReason(_POLYGON_EDGES_INTERSECT);
    public static final TargetErrorReason POLYGON_TOO_FEW_VERTICES = new TargetErrorReason(_POLYGON_TOO_FEW_VERTICES);
    public static final TargetErrorReason POLYGON_TOO_MANY_VERTICES = new TargetErrorReason(_POLYGON_TOO_MANY_VERTICES);
    public static final TargetErrorReason POLYGON_TOO_LARGE = new TargetErrorReason(_POLYGON_TOO_LARGE);
    public static final TargetErrorReason TARGETING_VALIDATION_FAILED = new TargetErrorReason(_TARGETING_VALIDATION_FAILED);
    public static final TargetErrorReason TARGETING_CROSS_COUNTRY_REGIONAL = new TargetErrorReason(_TARGETING_CROSS_COUNTRY_REGIONAL);
    public static final TargetErrorReason TARGETING_EXCLUSION_NOT_SUPPORTED = new TargetErrorReason(_TARGETING_EXCLUSION_NOT_SUPPORTED);
    public static final TargetErrorReason TARGETING_INCOMPATIBLE_LOCATION_TYPES = new TargetErrorReason(_TARGETING_INCOMPATIBLE_LOCATION_TYPES);
    public static final TargetErrorReason TARGETING_NOT_SUPPORTED = new TargetErrorReason(_TARGETING_NOT_SUPPORTED);
    public static final TargetErrorReason TARGETING_TOO_MANY_REGIONS = new TargetErrorReason(_TARGETING_TOO_MANY_REGIONS);
    public static final TargetErrorReason TOO_MANY_EXCLUDED_LOCATIONS = new TargetErrorReason(_TOO_MANY_EXCLUDED_LOCATIONS);
    public static final TargetErrorReason TOO_MANY_TARGETED_LOCATIONS = new TargetErrorReason(_TOO_MANY_TARGETED_LOCATIONS);
    public static final TargetErrorReason WARNING_MAY_NOW_REQUIRE_CHINESE_APPROVAL = new TargetErrorReason(_WARNING_MAY_NOW_REQUIRE_CHINESE_APPROVAL);
    public static final TargetErrorReason WARNING_NOW_REQUIRES_CHINESE_APPROVAL = new TargetErrorReason(_WARNING_NOW_REQUIRES_CHINESE_APPROVAL);
    public static final TargetErrorReason WARNING_NOW_TARGETS_CHINA = new TargetErrorReason(_WARNING_NOW_TARGETS_CHINA);
    public static final TargetErrorReason WARNING_NOW_TARGETS_CHINESE = new TargetErrorReason(_WARNING_NOW_TARGETS_CHINESE);
    public static final TargetErrorReason TARGET_ERROR = new TargetErrorReason(_TARGET_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static TargetErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TargetErrorReason enumeration = (TargetErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TargetErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TargetErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "TargetError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

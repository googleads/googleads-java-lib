// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * SettingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class SettingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SettingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DUPLICATE_SETTING_TYPE = "DUPLICATE_SETTING_TYPE";
    public static final java.lang.String _SETTING_TYPE_IS_NOT_AVAILABLE = "SETTING_TYPE_IS_NOT_AVAILABLE";
    public static final java.lang.String _SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN = "SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN";
    public static final java.lang.String _TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP = "TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP";
    public static final java.lang.String _TARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL = "TARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL";
    public static final java.lang.String _TARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP = "TARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP";
    public static final java.lang.String _DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT = "DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT";
    public static final java.lang.String _DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME = "DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME";
    public static final java.lang.String _DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME = "DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME";
    public static final java.lang.String _DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE = "DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE";
    public static final java.lang.String _TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN = "TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN";
    public static final java.lang.String _UNIVERSAL_APP_CAMPAIGN_SETTING_DUPLICATE_DESCRIPTION = "UNIVERSAL_APP_CAMPAIGN_SETTING_DUPLICATE_DESCRIPTION";
    public static final java.lang.String _UNIVERSAL_APP_CAMPAIGN_SETTING_DESCRIPTION_LINE_WIDTH_TOO_LONG = "UNIVERSAL_APP_CAMPAIGN_SETTING_DESCRIPTION_LINE_WIDTH_TOO_LONG";
    public static final java.lang.String _UNIVERSAL_APP_CAMPAIGN_SETTING_APP_ID_CANNOT_BE_MODIFIED = "UNIVERSAL_APP_CAMPAIGN_SETTING_APP_ID_CANNOT_BE_MODIFIED";
    public static final java.lang.String _TOO_MANY_YOUTUBE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN = "TOO_MANY_YOUTUBE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN";
    public static final java.lang.String _TOO_MANY_IMAGE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN = "TOO_MANY_IMAGE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN";
    public static final java.lang.String _MEDIA_INCOMPATIBLE_FOR_UNIVERSAL_APP_CAMPAIGN = "MEDIA_INCOMPATIBLE_FOR_UNIVERSAL_APP_CAMPAIGN";
    public static final java.lang.String _TOO_MANY_EXCLAMATION_MARKS = "TOO_MANY_EXCLAMATION_MARKS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final SettingErrorReason DUPLICATE_SETTING_TYPE = new SettingErrorReason(_DUPLICATE_SETTING_TYPE);
    public static final SettingErrorReason SETTING_TYPE_IS_NOT_AVAILABLE = new SettingErrorReason(_SETTING_TYPE_IS_NOT_AVAILABLE);
    public static final SettingErrorReason SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN = new SettingErrorReason(_SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN);
    public static final SettingErrorReason TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP = new SettingErrorReason(_TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP);
    public static final SettingErrorReason TARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL = new SettingErrorReason(_TARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL);
    public static final SettingErrorReason TARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP = new SettingErrorReason(_TARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP);
    public static final SettingErrorReason DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT = new SettingErrorReason(_DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT);
    public static final SettingErrorReason DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME = new SettingErrorReason(_DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME);
    public static final SettingErrorReason DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME = new SettingErrorReason(_DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME);
    public static final SettingErrorReason DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE = new SettingErrorReason(_DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE);
    public static final SettingErrorReason TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN = new SettingErrorReason(_TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN);
    public static final SettingErrorReason UNIVERSAL_APP_CAMPAIGN_SETTING_DUPLICATE_DESCRIPTION = new SettingErrorReason(_UNIVERSAL_APP_CAMPAIGN_SETTING_DUPLICATE_DESCRIPTION);
    public static final SettingErrorReason UNIVERSAL_APP_CAMPAIGN_SETTING_DESCRIPTION_LINE_WIDTH_TOO_LONG = new SettingErrorReason(_UNIVERSAL_APP_CAMPAIGN_SETTING_DESCRIPTION_LINE_WIDTH_TOO_LONG);
    public static final SettingErrorReason UNIVERSAL_APP_CAMPAIGN_SETTING_APP_ID_CANNOT_BE_MODIFIED = new SettingErrorReason(_UNIVERSAL_APP_CAMPAIGN_SETTING_APP_ID_CANNOT_BE_MODIFIED);
    public static final SettingErrorReason TOO_MANY_YOUTUBE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN = new SettingErrorReason(_TOO_MANY_YOUTUBE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN);
    public static final SettingErrorReason TOO_MANY_IMAGE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN = new SettingErrorReason(_TOO_MANY_IMAGE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN);
    public static final SettingErrorReason MEDIA_INCOMPATIBLE_FOR_UNIVERSAL_APP_CAMPAIGN = new SettingErrorReason(_MEDIA_INCOMPATIBLE_FOR_UNIVERSAL_APP_CAMPAIGN);
    public static final SettingErrorReason TOO_MANY_EXCLAMATION_MARKS = new SettingErrorReason(_TOO_MANY_EXCLAMATION_MARKS);
    public static final SettingErrorReason UNKNOWN = new SettingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static SettingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SettingErrorReason enumeration = (SettingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SettingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SettingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SettingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

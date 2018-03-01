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
 * AdGroupCriterionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class AdGroupCriterionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdGroupCriterionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AD_GROUP_CRITERION_LABEL_DOES_NOT_EXIST = "AD_GROUP_CRITERION_LABEL_DOES_NOT_EXIST";
    public static final java.lang.String _AD_GROUP_CRITERION_LABEL_ALREADY_EXISTS = "AD_GROUP_CRITERION_LABEL_ALREADY_EXISTS";
    public static final java.lang.String _CANNOT_ADD_LABEL_TO_NEGATIVE_CRITERION = "CANNOT_ADD_LABEL_TO_NEGATIVE_CRITERION";
    public static final java.lang.String _TOO_MANY_OPERATIONS = "TOO_MANY_OPERATIONS";
    public static final java.lang.String _CANT_UPDATE_NEGATIVE = "CANT_UPDATE_NEGATIVE";
    public static final java.lang.String _CONCRETE_TYPE_REQUIRED = "CONCRETE_TYPE_REQUIRED";
    public static final java.lang.String _BID_INCOMPATIBLE_WITH_ADGROUP = "BID_INCOMPATIBLE_WITH_ADGROUP";
    public static final java.lang.String _CANNOT_TARGET_AND_EXCLUDE = "CANNOT_TARGET_AND_EXCLUDE";
    public static final java.lang.String _ILLEGAL_URL = "ILLEGAL_URL";
    public static final java.lang.String _INVALID_KEYWORD_TEXT = "INVALID_KEYWORD_TEXT";
    public static final java.lang.String _INVALID_DESTINATION_URL = "INVALID_DESTINATION_URL";
    public static final java.lang.String _MISSING_DESTINATION_URL_TAG = "MISSING_DESTINATION_URL_TAG";
    public static final java.lang.String _KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM = "KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM";
    public static final java.lang.String _INVALID_USER_STATUS = "INVALID_USER_STATUS";
    public static final java.lang.String _CANNOT_ADD_CRITERIA_TYPE = "CANNOT_ADD_CRITERIA_TYPE";
    public static final java.lang.String _CANNOT_EXCLUDE_CRITERIA_TYPE = "CANNOT_EXCLUDE_CRITERIA_TYPE";
    public static final java.lang.String _INVALID_PRODUCT_PARTITION_HIERARCHY = "INVALID_PRODUCT_PARTITION_HIERARCHY";
    public static final java.lang.String _PRODUCT_PARTITION_UNIT_CANNOT_HAVE_CHILDREN = "PRODUCT_PARTITION_UNIT_CANNOT_HAVE_CHILDREN";
    public static final java.lang.String _PRODUCT_PARTITION_SUBDIVISION_REQUIRES_OTHERS_CASE = "PRODUCT_PARTITION_SUBDIVISION_REQUIRES_OTHERS_CASE";
    public static final java.lang.String _PRODUCT_PARTITION_REQUIRES_SAME_DIMENSION_TYPE_AS_SIBLINGS = "PRODUCT_PARTITION_REQUIRES_SAME_DIMENSION_TYPE_AS_SIBLINGS";
    public static final java.lang.String _PRODUCT_PARTITION_ALREADY_EXISTS = "PRODUCT_PARTITION_ALREADY_EXISTS";
    public static final java.lang.String _PRODUCT_PARTITION_DOES_NOT_EXIST = "PRODUCT_PARTITION_DOES_NOT_EXIST";
    public static final java.lang.String _PRODUCT_PARTITION_CANNOT_BE_REMOVED = "PRODUCT_PARTITION_CANNOT_BE_REMOVED";
    public static final java.lang.String _INVALID_PRODUCT_PARTITION_TYPE = "INVALID_PRODUCT_PARTITION_TYPE";
    public static final java.lang.String _PRODUCT_PARTITION_ADD_MAY_ONLY_USE_TEMP_ID = "PRODUCT_PARTITION_ADD_MAY_ONLY_USE_TEMP_ID";
    public static final java.lang.String _CAMPAIGN_TYPE_NOT_COMPATIBLE_WITH_PARTIAL_FAILURE = "CAMPAIGN_TYPE_NOT_COMPATIBLE_WITH_PARTIAL_FAILURE";
    public static final java.lang.String _OPERATIONS_FOR_TOO_MANY_SHOPPING_ADGROUPS = "OPERATIONS_FOR_TOO_MANY_SHOPPING_ADGROUPS";
    public static final java.lang.String _CANNOT_MODIFY_URL_FIELDS_WITH_DUPLICATE_ELEMENTS = "CANNOT_MODIFY_URL_FIELDS_WITH_DUPLICATE_ELEMENTS";
    public static final java.lang.String _CANNOT_SET_WITHOUT_FINAL_URLS = "CANNOT_SET_WITHOUT_FINAL_URLS";
    public static final java.lang.String _CANNOT_CLEAR_FINAL_URLS_IF_FINAL_MOBILE_URLS_EXIST = "CANNOT_CLEAR_FINAL_URLS_IF_FINAL_MOBILE_URLS_EXIST";
    public static final java.lang.String _CANNOT_CLEAR_FINAL_URLS_IF_FINAL_APP_URLS_EXIST = "CANNOT_CLEAR_FINAL_URLS_IF_FINAL_APP_URLS_EXIST";
    public static final java.lang.String _CANNOT_CLEAR_FINAL_URLS_IF_TRACKING_URL_TEMPLATE_EXISTS = "CANNOT_CLEAR_FINAL_URLS_IF_TRACKING_URL_TEMPLATE_EXISTS";
    public static final java.lang.String _CANNOT_CLEAR_FINAL_URLS_IF_URL_CUSTOM_PARAMETERS_EXIST = "CANNOT_CLEAR_FINAL_URLS_IF_URL_CUSTOM_PARAMETERS_EXIST";
    public static final java.lang.String _CANNOT_SET_BOTH_DESTINATION_URL_AND_FINAL_URLS = "CANNOT_SET_BOTH_DESTINATION_URL_AND_FINAL_URLS";
    public static final java.lang.String _CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE = "CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE";
    public static final java.lang.String _FINAL_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE = "FINAL_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE";
    public static final java.lang.String _FINAL_MOBILE_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE = "FINAL_MOBILE_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AdGroupCriterionErrorReason AD_GROUP_CRITERION_LABEL_DOES_NOT_EXIST = new AdGroupCriterionErrorReason(_AD_GROUP_CRITERION_LABEL_DOES_NOT_EXIST);
    public static final AdGroupCriterionErrorReason AD_GROUP_CRITERION_LABEL_ALREADY_EXISTS = new AdGroupCriterionErrorReason(_AD_GROUP_CRITERION_LABEL_ALREADY_EXISTS);
    public static final AdGroupCriterionErrorReason CANNOT_ADD_LABEL_TO_NEGATIVE_CRITERION = new AdGroupCriterionErrorReason(_CANNOT_ADD_LABEL_TO_NEGATIVE_CRITERION);
    public static final AdGroupCriterionErrorReason TOO_MANY_OPERATIONS = new AdGroupCriterionErrorReason(_TOO_MANY_OPERATIONS);
    public static final AdGroupCriterionErrorReason CANT_UPDATE_NEGATIVE = new AdGroupCriterionErrorReason(_CANT_UPDATE_NEGATIVE);
    public static final AdGroupCriterionErrorReason CONCRETE_TYPE_REQUIRED = new AdGroupCriterionErrorReason(_CONCRETE_TYPE_REQUIRED);
    public static final AdGroupCriterionErrorReason BID_INCOMPATIBLE_WITH_ADGROUP = new AdGroupCriterionErrorReason(_BID_INCOMPATIBLE_WITH_ADGROUP);
    public static final AdGroupCriterionErrorReason CANNOT_TARGET_AND_EXCLUDE = new AdGroupCriterionErrorReason(_CANNOT_TARGET_AND_EXCLUDE);
    public static final AdGroupCriterionErrorReason ILLEGAL_URL = new AdGroupCriterionErrorReason(_ILLEGAL_URL);
    public static final AdGroupCriterionErrorReason INVALID_KEYWORD_TEXT = new AdGroupCriterionErrorReason(_INVALID_KEYWORD_TEXT);
    public static final AdGroupCriterionErrorReason INVALID_DESTINATION_URL = new AdGroupCriterionErrorReason(_INVALID_DESTINATION_URL);
    public static final AdGroupCriterionErrorReason MISSING_DESTINATION_URL_TAG = new AdGroupCriterionErrorReason(_MISSING_DESTINATION_URL_TAG);
    public static final AdGroupCriterionErrorReason KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM = new AdGroupCriterionErrorReason(_KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM);
    public static final AdGroupCriterionErrorReason INVALID_USER_STATUS = new AdGroupCriterionErrorReason(_INVALID_USER_STATUS);
    public static final AdGroupCriterionErrorReason CANNOT_ADD_CRITERIA_TYPE = new AdGroupCriterionErrorReason(_CANNOT_ADD_CRITERIA_TYPE);
    public static final AdGroupCriterionErrorReason CANNOT_EXCLUDE_CRITERIA_TYPE = new AdGroupCriterionErrorReason(_CANNOT_EXCLUDE_CRITERIA_TYPE);
    public static final AdGroupCriterionErrorReason INVALID_PRODUCT_PARTITION_HIERARCHY = new AdGroupCriterionErrorReason(_INVALID_PRODUCT_PARTITION_HIERARCHY);
    public static final AdGroupCriterionErrorReason PRODUCT_PARTITION_UNIT_CANNOT_HAVE_CHILDREN = new AdGroupCriterionErrorReason(_PRODUCT_PARTITION_UNIT_CANNOT_HAVE_CHILDREN);
    public static final AdGroupCriterionErrorReason PRODUCT_PARTITION_SUBDIVISION_REQUIRES_OTHERS_CASE = new AdGroupCriterionErrorReason(_PRODUCT_PARTITION_SUBDIVISION_REQUIRES_OTHERS_CASE);
    public static final AdGroupCriterionErrorReason PRODUCT_PARTITION_REQUIRES_SAME_DIMENSION_TYPE_AS_SIBLINGS = new AdGroupCriterionErrorReason(_PRODUCT_PARTITION_REQUIRES_SAME_DIMENSION_TYPE_AS_SIBLINGS);
    public static final AdGroupCriterionErrorReason PRODUCT_PARTITION_ALREADY_EXISTS = new AdGroupCriterionErrorReason(_PRODUCT_PARTITION_ALREADY_EXISTS);
    public static final AdGroupCriterionErrorReason PRODUCT_PARTITION_DOES_NOT_EXIST = new AdGroupCriterionErrorReason(_PRODUCT_PARTITION_DOES_NOT_EXIST);
    public static final AdGroupCriterionErrorReason PRODUCT_PARTITION_CANNOT_BE_REMOVED = new AdGroupCriterionErrorReason(_PRODUCT_PARTITION_CANNOT_BE_REMOVED);
    public static final AdGroupCriterionErrorReason INVALID_PRODUCT_PARTITION_TYPE = new AdGroupCriterionErrorReason(_INVALID_PRODUCT_PARTITION_TYPE);
    public static final AdGroupCriterionErrorReason PRODUCT_PARTITION_ADD_MAY_ONLY_USE_TEMP_ID = new AdGroupCriterionErrorReason(_PRODUCT_PARTITION_ADD_MAY_ONLY_USE_TEMP_ID);
    public static final AdGroupCriterionErrorReason CAMPAIGN_TYPE_NOT_COMPATIBLE_WITH_PARTIAL_FAILURE = new AdGroupCriterionErrorReason(_CAMPAIGN_TYPE_NOT_COMPATIBLE_WITH_PARTIAL_FAILURE);
    public static final AdGroupCriterionErrorReason OPERATIONS_FOR_TOO_MANY_SHOPPING_ADGROUPS = new AdGroupCriterionErrorReason(_OPERATIONS_FOR_TOO_MANY_SHOPPING_ADGROUPS);
    public static final AdGroupCriterionErrorReason CANNOT_MODIFY_URL_FIELDS_WITH_DUPLICATE_ELEMENTS = new AdGroupCriterionErrorReason(_CANNOT_MODIFY_URL_FIELDS_WITH_DUPLICATE_ELEMENTS);
    public static final AdGroupCriterionErrorReason CANNOT_SET_WITHOUT_FINAL_URLS = new AdGroupCriterionErrorReason(_CANNOT_SET_WITHOUT_FINAL_URLS);
    public static final AdGroupCriterionErrorReason CANNOT_CLEAR_FINAL_URLS_IF_FINAL_MOBILE_URLS_EXIST = new AdGroupCriterionErrorReason(_CANNOT_CLEAR_FINAL_URLS_IF_FINAL_MOBILE_URLS_EXIST);
    public static final AdGroupCriterionErrorReason CANNOT_CLEAR_FINAL_URLS_IF_FINAL_APP_URLS_EXIST = new AdGroupCriterionErrorReason(_CANNOT_CLEAR_FINAL_URLS_IF_FINAL_APP_URLS_EXIST);
    public static final AdGroupCriterionErrorReason CANNOT_CLEAR_FINAL_URLS_IF_TRACKING_URL_TEMPLATE_EXISTS = new AdGroupCriterionErrorReason(_CANNOT_CLEAR_FINAL_URLS_IF_TRACKING_URL_TEMPLATE_EXISTS);
    public static final AdGroupCriterionErrorReason CANNOT_CLEAR_FINAL_URLS_IF_URL_CUSTOM_PARAMETERS_EXIST = new AdGroupCriterionErrorReason(_CANNOT_CLEAR_FINAL_URLS_IF_URL_CUSTOM_PARAMETERS_EXIST);
    public static final AdGroupCriterionErrorReason CANNOT_SET_BOTH_DESTINATION_URL_AND_FINAL_URLS = new AdGroupCriterionErrorReason(_CANNOT_SET_BOTH_DESTINATION_URL_AND_FINAL_URLS);
    public static final AdGroupCriterionErrorReason CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE = new AdGroupCriterionErrorReason(_CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE);
    public static final AdGroupCriterionErrorReason FINAL_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE = new AdGroupCriterionErrorReason(_FINAL_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE);
    public static final AdGroupCriterionErrorReason FINAL_MOBILE_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE = new AdGroupCriterionErrorReason(_FINAL_MOBILE_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

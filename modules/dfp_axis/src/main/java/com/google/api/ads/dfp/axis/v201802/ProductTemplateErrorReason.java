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
 * ProductTemplateErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class ProductTemplateErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProductTemplateErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_FEATURE_EXPANDED_EXCLUSIVE = "INVALID_FEATURE_EXPANDED_EXCLUSIVE";
    public static final java.lang.String _INVALID_EXPANDED_FEATURE_DEFAULT_NOT_TARGETED = "INVALID_EXPANDED_FEATURE_DEFAULT_NOT_TARGETED";
    public static final java.lang.String _INVALID_EXPANDED_FEATURE_DEFAULT_LOCKED = "INVALID_EXPANDED_FEATURE_DEFAULT_LOCKED";
    public static final java.lang.String _INVALID_EXPANDED_FEATURE_VALUE_TARGETED = "INVALID_EXPANDED_FEATURE_VALUE_TARGETED";
    public static final java.lang.String _INVALID_EXPANDED_FEATURE_VALUE_LOCKED = "INVALID_EXPANDED_FEATURE_VALUE_LOCKED";
    public static final java.lang.String _INVALID_FEATURE_TYPE = "INVALID_FEATURE_TYPE";
    public static final java.lang.String _INVALID_ROADBLOCKING_TYPE = "INVALID_ROADBLOCKING_TYPE";
    public static final java.lang.String _INVALID_DELIVERY_RATE_TYPE = "INVALID_DELIVERY_RATE_TYPE";
    public static final java.lang.String _INVALID_CREATIVE_ROTATION_TYPE = "INVALID_CREATIVE_ROTATION_TYPE";
    public static final java.lang.String _INVALID_COMPANION_DELIVERY_OPTION = "INVALID_COMPANION_DELIVERY_OPTION";
    public static final java.lang.String _INVALID_TARGETING = "INVALID_TARGETING";
    public static final java.lang.String _INVALID_FREQUENCY_CAPS = "INVALID_FREQUENCY_CAPS";
    public static final java.lang.String _INVALID_TECHNOLOGY_INCLUDE_EXCLUDE = "INVALID_TECHNOLOGY_INCLUDE_EXCLUDE";
    public static final java.lang.String _INVALID_EXPANDED_PRODUCT_COUNT = "INVALID_EXPANDED_PRODUCT_COUNT";
    public static final java.lang.String _INVALID_TARGET_PLATFORM = "INVALID_TARGET_PLATFORM";
    public static final java.lang.String _INVALID_NON_TARGETING_FEATURE = "INVALID_NON_TARGETING_FEATURE";
    public static final java.lang.String _INVALID_FEATURE_CARDINALITY_AT_LEAST_ONE = "INVALID_FEATURE_CARDINALITY_AT_LEAST_ONE";
    public static final java.lang.String _INVALID_FEATURE_CARDINALITY_AT_MOST_ONE = "INVALID_FEATURE_CARDINALITY_AT_MOST_ONE";
    public static final java.lang.String _INVALID_FEATURE_CARDINALITY_EXACTLY_ONE = "INVALID_FEATURE_CARDINALITY_EXACTLY_ONE";
    public static final java.lang.String _INVALID_FEATURE_FOR_OFFLINE = "INVALID_FEATURE_FOR_OFFLINE";
    public static final java.lang.String _INVALID_RATE_TYPE_FOR_OFFLINE = "INVALID_RATE_TYPE_FOR_OFFLINE";
    public static final java.lang.String _INVALID_RATE_TYPE_FOR_DFP = "INVALID_RATE_TYPE_FOR_DFP";
    public static final java.lang.String _INVALID_RATE_TYPE_FOR_NON_DFP = "INVALID_RATE_TYPE_FOR_NON_DFP";
    public static final java.lang.String _INVALID_VALUES_FOR_CLICK_TRACKING_LINE_ITEM_TYPE = "INVALID_VALUES_FOR_CLICK_TRACKING_LINE_ITEM_TYPE";
    public static final java.lang.String _INVALID_SEGMENTATION_OR_TARGETING_FOR_CLICK_TRACKING_LINE_ITEM_TYPE = "INVALID_SEGMENTATION_OR_TARGETING_FOR_CLICK_TRACKING_LINE_ITEM_TYPE";
    public static final java.lang.String _INVALID_LINE_ITEM_PRIORITY = "INVALID_LINE_ITEM_PRIORITY";
    public static final java.lang.String _INVALID_LINE_ITEM_TYPE = "INVALID_LINE_ITEM_TYPE";
    public static final java.lang.String _INVALID_ENVIRONMENT_TYPE = "INVALID_ENVIRONMENT_TYPE";
    public static final java.lang.String _DUPLICATED_PLACEHOLDER_IN_NAMEMACRO = "DUPLICATED_PLACEHOLDER_IN_NAMEMACRO";
    public static final java.lang.String _INVALID_EXPANDED_FEATURE_IN_NON_EXPANDABLE_AFFINITY = "INVALID_EXPANDED_FEATURE_IN_NON_EXPANDABLE_AFFINITY";
    public static final java.lang.String _INVALID_FEATURE_DEFAULT_TARGET_TYPE = "INVALID_FEATURE_DEFAULT_TARGET_TYPE";
    public static final java.lang.String _INVALID_FEATURE_VALUE_TARGET_TYPE = "INVALID_FEATURE_VALUE_TARGET_TYPE";
    public static final java.lang.String _INVALID_FEATURE_AND_VALUE_LOCK_EXCLUSIVE = "INVALID_FEATURE_AND_VALUE_LOCK_EXCLUSIVE";
    public static final java.lang.String _INVALID_CREATIVE_PLACEHOLDER = "INVALID_CREATIVE_PLACEHOLDER";
    public static final java.lang.String _DUPLICATED_FEATURE = "DUPLICATED_FEATURE";
    public static final java.lang.String _DUPLICATED_CUSTOM_TARGETING_KEY = "DUPLICATED_CUSTOM_TARGETING_KEY";
    public static final java.lang.String _DUPLICATED_CUSTOM_TARGETING_VALUE = "DUPLICATED_CUSTOM_TARGETING_VALUE";
    public static final java.lang.String _INVALID_CUSTOM_TARGETING_KEY_ID = "INVALID_CUSTOM_TARGETING_KEY_ID";
    public static final java.lang.String _INVALID_CUSTOM_TARGETING_VALUE_ID = "INVALID_CUSTOM_TARGETING_VALUE_ID";
    public static final java.lang.String _MISSING_CUSTOM_TARGETING_VALUES = "MISSING_CUSTOM_TARGETING_VALUES";
    public static final java.lang.String _LOCATION_CANNOT_BE_TARGETED_IF_PARENT_IS_TARGETED = "LOCATION_CANNOT_BE_TARGETED_IF_PARENT_IS_TARGETED";
    public static final java.lang.String _LOCATION_CANNOT_BE_EXCLUDED_IF_PARENT_IS_EXCLUDED = "LOCATION_CANNOT_BE_EXCLUDED_IF_PARENT_IS_EXCLUDED";
    public static final java.lang.String _LOCATION_CANNOT_BE_EXCLUDED_DIRECTLY_WHEN_HAVE_TARGETED_LOCATION = "LOCATION_CANNOT_BE_EXCLUDED_DIRECTLY_WHEN_HAVE_TARGETED_LOCATION";
    public static final java.lang.String _CUSTOMIZABLE_CUSTOM_KEY_CANNOT_BE_SEGMENTED = "CUSTOMIZABLE_CUSTOM_KEY_CANNOT_BE_SEGMENTED";
    public static final java.lang.String _CUSTOM_KEY_USED_IN_TARGETING_CANNOT_BE_SEGMENTED = "CUSTOM_KEY_USED_IN_TARGETING_CANNOT_BE_SEGMENTED";
    public static final java.lang.String _MISSING_EXPANDED_FEATURE_PLACEHOLDER_IN_NAMEMACRO = "MISSING_EXPANDED_FEATURE_PLACEHOLDER_IN_NAMEMACRO";
    public static final java.lang.String _MISSING_FEATURE_VALUE_OF_NAMEMACRO_PLACEHOLDER = "MISSING_FEATURE_VALUE_OF_NAMEMACRO_PLACEHOLDER";
    public static final java.lang.String _MISSING_FEATURE_OF_NAMEMACRO_PLACEHOLDER = "MISSING_FEATURE_OF_NAMEMACRO_PLACEHOLDER";
    public static final java.lang.String _MISSING_SUBTYPE_FOR_CUSTOM_TARGETING = "MISSING_SUBTYPE_FOR_CUSTOM_TARGETING";
    public static final java.lang.String _COMPANION_NOT_ALLOWED = "COMPANION_NOT_ALLOWED";
    public static final java.lang.String _MISSING_COMPANION = "MISSING_COMPANION";
    public static final java.lang.String _DUPLICATED_MASTER_SIZE = "DUPLICATED_MASTER_SIZE";
    public static final java.lang.String _CANNOT_HAVE_CREATIVE_TEMPLATE = "CANNOT_HAVE_CREATIVE_TEMPLATE";
    public static final java.lang.String _NATIVE_CREATIVE_TEMPLATE_REQUIRED = "NATIVE_CREATIVE_TEMPLATE_REQUIRED";
    public static final java.lang.String _CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID = "CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID";
    public static final java.lang.String _CANNOT_MODIFY_READONLY_FEATURE = "CANNOT_MODIFY_READONLY_FEATURE";
    public static final java.lang.String _CANNOT_MODIFY_PRODUCT_TYPE = "CANNOT_MODIFY_PRODUCT_TYPE";
    public static final java.lang.String _CANNOT_ADD_SEGMENTATION = "CANNOT_ADD_SEGMENTATION";
    public static final java.lang.String _CANNOT_REMOVE_SEGMENTATION = "CANNOT_REMOVE_SEGMENTATION";
    public static final java.lang.String _CANNOT_REMOVE_VALUE_FROM_SEGMENTATION = "CANNOT_REMOVE_VALUE_FROM_SEGMENTATION";
    public static final java.lang.String _CANNOT_ADD_FEATURE_VALUE_FOR_CUSTOM_TARGETING = "CANNOT_ADD_FEATURE_VALUE_FOR_CUSTOM_TARGETING";
    public static final java.lang.String _CANNOT_MODIFY_BUILTIN_TARGETING_FEATURE = "CANNOT_MODIFY_BUILTIN_TARGETING_FEATURE";
    public static final java.lang.String _CANNOT_UPDATE_ARCHIVED_PRODUCT_TEMPLATE = "CANNOT_UPDATE_ARCHIVED_PRODUCT_TEMPLATE";
    public static final java.lang.String _INVALID_VIDEO_POSITION_VALUE_FOR_LINE_ITEM_TYPE = "INVALID_VIDEO_POSITION_VALUE_FOR_LINE_ITEM_TYPE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ProductTemplateErrorReason INVALID_FEATURE_EXPANDED_EXCLUSIVE = new ProductTemplateErrorReason(_INVALID_FEATURE_EXPANDED_EXCLUSIVE);
    public static final ProductTemplateErrorReason INVALID_EXPANDED_FEATURE_DEFAULT_NOT_TARGETED = new ProductTemplateErrorReason(_INVALID_EXPANDED_FEATURE_DEFAULT_NOT_TARGETED);
    public static final ProductTemplateErrorReason INVALID_EXPANDED_FEATURE_DEFAULT_LOCKED = new ProductTemplateErrorReason(_INVALID_EXPANDED_FEATURE_DEFAULT_LOCKED);
    public static final ProductTemplateErrorReason INVALID_EXPANDED_FEATURE_VALUE_TARGETED = new ProductTemplateErrorReason(_INVALID_EXPANDED_FEATURE_VALUE_TARGETED);
    public static final ProductTemplateErrorReason INVALID_EXPANDED_FEATURE_VALUE_LOCKED = new ProductTemplateErrorReason(_INVALID_EXPANDED_FEATURE_VALUE_LOCKED);
    public static final ProductTemplateErrorReason INVALID_FEATURE_TYPE = new ProductTemplateErrorReason(_INVALID_FEATURE_TYPE);
    public static final ProductTemplateErrorReason INVALID_ROADBLOCKING_TYPE = new ProductTemplateErrorReason(_INVALID_ROADBLOCKING_TYPE);
    public static final ProductTemplateErrorReason INVALID_DELIVERY_RATE_TYPE = new ProductTemplateErrorReason(_INVALID_DELIVERY_RATE_TYPE);
    public static final ProductTemplateErrorReason INVALID_CREATIVE_ROTATION_TYPE = new ProductTemplateErrorReason(_INVALID_CREATIVE_ROTATION_TYPE);
    public static final ProductTemplateErrorReason INVALID_COMPANION_DELIVERY_OPTION = new ProductTemplateErrorReason(_INVALID_COMPANION_DELIVERY_OPTION);
    public static final ProductTemplateErrorReason INVALID_TARGETING = new ProductTemplateErrorReason(_INVALID_TARGETING);
    public static final ProductTemplateErrorReason INVALID_FREQUENCY_CAPS = new ProductTemplateErrorReason(_INVALID_FREQUENCY_CAPS);
    public static final ProductTemplateErrorReason INVALID_TECHNOLOGY_INCLUDE_EXCLUDE = new ProductTemplateErrorReason(_INVALID_TECHNOLOGY_INCLUDE_EXCLUDE);
    public static final ProductTemplateErrorReason INVALID_EXPANDED_PRODUCT_COUNT = new ProductTemplateErrorReason(_INVALID_EXPANDED_PRODUCT_COUNT);
    public static final ProductTemplateErrorReason INVALID_TARGET_PLATFORM = new ProductTemplateErrorReason(_INVALID_TARGET_PLATFORM);
    public static final ProductTemplateErrorReason INVALID_NON_TARGETING_FEATURE = new ProductTemplateErrorReason(_INVALID_NON_TARGETING_FEATURE);
    public static final ProductTemplateErrorReason INVALID_FEATURE_CARDINALITY_AT_LEAST_ONE = new ProductTemplateErrorReason(_INVALID_FEATURE_CARDINALITY_AT_LEAST_ONE);
    public static final ProductTemplateErrorReason INVALID_FEATURE_CARDINALITY_AT_MOST_ONE = new ProductTemplateErrorReason(_INVALID_FEATURE_CARDINALITY_AT_MOST_ONE);
    public static final ProductTemplateErrorReason INVALID_FEATURE_CARDINALITY_EXACTLY_ONE = new ProductTemplateErrorReason(_INVALID_FEATURE_CARDINALITY_EXACTLY_ONE);
    public static final ProductTemplateErrorReason INVALID_FEATURE_FOR_OFFLINE = new ProductTemplateErrorReason(_INVALID_FEATURE_FOR_OFFLINE);
    public static final ProductTemplateErrorReason INVALID_RATE_TYPE_FOR_OFFLINE = new ProductTemplateErrorReason(_INVALID_RATE_TYPE_FOR_OFFLINE);
    public static final ProductTemplateErrorReason INVALID_RATE_TYPE_FOR_DFP = new ProductTemplateErrorReason(_INVALID_RATE_TYPE_FOR_DFP);
    public static final ProductTemplateErrorReason INVALID_RATE_TYPE_FOR_NON_DFP = new ProductTemplateErrorReason(_INVALID_RATE_TYPE_FOR_NON_DFP);
    public static final ProductTemplateErrorReason INVALID_VALUES_FOR_CLICK_TRACKING_LINE_ITEM_TYPE = new ProductTemplateErrorReason(_INVALID_VALUES_FOR_CLICK_TRACKING_LINE_ITEM_TYPE);
    public static final ProductTemplateErrorReason INVALID_SEGMENTATION_OR_TARGETING_FOR_CLICK_TRACKING_LINE_ITEM_TYPE = new ProductTemplateErrorReason(_INVALID_SEGMENTATION_OR_TARGETING_FOR_CLICK_TRACKING_LINE_ITEM_TYPE);
    public static final ProductTemplateErrorReason INVALID_LINE_ITEM_PRIORITY = new ProductTemplateErrorReason(_INVALID_LINE_ITEM_PRIORITY);
    public static final ProductTemplateErrorReason INVALID_LINE_ITEM_TYPE = new ProductTemplateErrorReason(_INVALID_LINE_ITEM_TYPE);
    public static final ProductTemplateErrorReason INVALID_ENVIRONMENT_TYPE = new ProductTemplateErrorReason(_INVALID_ENVIRONMENT_TYPE);
    public static final ProductTemplateErrorReason DUPLICATED_PLACEHOLDER_IN_NAMEMACRO = new ProductTemplateErrorReason(_DUPLICATED_PLACEHOLDER_IN_NAMEMACRO);
    public static final ProductTemplateErrorReason INVALID_EXPANDED_FEATURE_IN_NON_EXPANDABLE_AFFINITY = new ProductTemplateErrorReason(_INVALID_EXPANDED_FEATURE_IN_NON_EXPANDABLE_AFFINITY);
    public static final ProductTemplateErrorReason INVALID_FEATURE_DEFAULT_TARGET_TYPE = new ProductTemplateErrorReason(_INVALID_FEATURE_DEFAULT_TARGET_TYPE);
    public static final ProductTemplateErrorReason INVALID_FEATURE_VALUE_TARGET_TYPE = new ProductTemplateErrorReason(_INVALID_FEATURE_VALUE_TARGET_TYPE);
    public static final ProductTemplateErrorReason INVALID_FEATURE_AND_VALUE_LOCK_EXCLUSIVE = new ProductTemplateErrorReason(_INVALID_FEATURE_AND_VALUE_LOCK_EXCLUSIVE);
    public static final ProductTemplateErrorReason INVALID_CREATIVE_PLACEHOLDER = new ProductTemplateErrorReason(_INVALID_CREATIVE_PLACEHOLDER);
    public static final ProductTemplateErrorReason DUPLICATED_FEATURE = new ProductTemplateErrorReason(_DUPLICATED_FEATURE);
    public static final ProductTemplateErrorReason DUPLICATED_CUSTOM_TARGETING_KEY = new ProductTemplateErrorReason(_DUPLICATED_CUSTOM_TARGETING_KEY);
    public static final ProductTemplateErrorReason DUPLICATED_CUSTOM_TARGETING_VALUE = new ProductTemplateErrorReason(_DUPLICATED_CUSTOM_TARGETING_VALUE);
    public static final ProductTemplateErrorReason INVALID_CUSTOM_TARGETING_KEY_ID = new ProductTemplateErrorReason(_INVALID_CUSTOM_TARGETING_KEY_ID);
    public static final ProductTemplateErrorReason INVALID_CUSTOM_TARGETING_VALUE_ID = new ProductTemplateErrorReason(_INVALID_CUSTOM_TARGETING_VALUE_ID);
    public static final ProductTemplateErrorReason MISSING_CUSTOM_TARGETING_VALUES = new ProductTemplateErrorReason(_MISSING_CUSTOM_TARGETING_VALUES);
    public static final ProductTemplateErrorReason LOCATION_CANNOT_BE_TARGETED_IF_PARENT_IS_TARGETED = new ProductTemplateErrorReason(_LOCATION_CANNOT_BE_TARGETED_IF_PARENT_IS_TARGETED);
    public static final ProductTemplateErrorReason LOCATION_CANNOT_BE_EXCLUDED_IF_PARENT_IS_EXCLUDED = new ProductTemplateErrorReason(_LOCATION_CANNOT_BE_EXCLUDED_IF_PARENT_IS_EXCLUDED);
    public static final ProductTemplateErrorReason LOCATION_CANNOT_BE_EXCLUDED_DIRECTLY_WHEN_HAVE_TARGETED_LOCATION = new ProductTemplateErrorReason(_LOCATION_CANNOT_BE_EXCLUDED_DIRECTLY_WHEN_HAVE_TARGETED_LOCATION);
    public static final ProductTemplateErrorReason CUSTOMIZABLE_CUSTOM_KEY_CANNOT_BE_SEGMENTED = new ProductTemplateErrorReason(_CUSTOMIZABLE_CUSTOM_KEY_CANNOT_BE_SEGMENTED);
    public static final ProductTemplateErrorReason CUSTOM_KEY_USED_IN_TARGETING_CANNOT_BE_SEGMENTED = new ProductTemplateErrorReason(_CUSTOM_KEY_USED_IN_TARGETING_CANNOT_BE_SEGMENTED);
    public static final ProductTemplateErrorReason MISSING_EXPANDED_FEATURE_PLACEHOLDER_IN_NAMEMACRO = new ProductTemplateErrorReason(_MISSING_EXPANDED_FEATURE_PLACEHOLDER_IN_NAMEMACRO);
    public static final ProductTemplateErrorReason MISSING_FEATURE_VALUE_OF_NAMEMACRO_PLACEHOLDER = new ProductTemplateErrorReason(_MISSING_FEATURE_VALUE_OF_NAMEMACRO_PLACEHOLDER);
    public static final ProductTemplateErrorReason MISSING_FEATURE_OF_NAMEMACRO_PLACEHOLDER = new ProductTemplateErrorReason(_MISSING_FEATURE_OF_NAMEMACRO_PLACEHOLDER);
    public static final ProductTemplateErrorReason MISSING_SUBTYPE_FOR_CUSTOM_TARGETING = new ProductTemplateErrorReason(_MISSING_SUBTYPE_FOR_CUSTOM_TARGETING);
    public static final ProductTemplateErrorReason COMPANION_NOT_ALLOWED = new ProductTemplateErrorReason(_COMPANION_NOT_ALLOWED);
    public static final ProductTemplateErrorReason MISSING_COMPANION = new ProductTemplateErrorReason(_MISSING_COMPANION);
    public static final ProductTemplateErrorReason DUPLICATED_MASTER_SIZE = new ProductTemplateErrorReason(_DUPLICATED_MASTER_SIZE);
    public static final ProductTemplateErrorReason CANNOT_HAVE_CREATIVE_TEMPLATE = new ProductTemplateErrorReason(_CANNOT_HAVE_CREATIVE_TEMPLATE);
    public static final ProductTemplateErrorReason NATIVE_CREATIVE_TEMPLATE_REQUIRED = new ProductTemplateErrorReason(_NATIVE_CREATIVE_TEMPLATE_REQUIRED);
    public static final ProductTemplateErrorReason CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID = new ProductTemplateErrorReason(_CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID);
    public static final ProductTemplateErrorReason CANNOT_MODIFY_READONLY_FEATURE = new ProductTemplateErrorReason(_CANNOT_MODIFY_READONLY_FEATURE);
    public static final ProductTemplateErrorReason CANNOT_MODIFY_PRODUCT_TYPE = new ProductTemplateErrorReason(_CANNOT_MODIFY_PRODUCT_TYPE);
    public static final ProductTemplateErrorReason CANNOT_ADD_SEGMENTATION = new ProductTemplateErrorReason(_CANNOT_ADD_SEGMENTATION);
    public static final ProductTemplateErrorReason CANNOT_REMOVE_SEGMENTATION = new ProductTemplateErrorReason(_CANNOT_REMOVE_SEGMENTATION);
    public static final ProductTemplateErrorReason CANNOT_REMOVE_VALUE_FROM_SEGMENTATION = new ProductTemplateErrorReason(_CANNOT_REMOVE_VALUE_FROM_SEGMENTATION);
    public static final ProductTemplateErrorReason CANNOT_ADD_FEATURE_VALUE_FOR_CUSTOM_TARGETING = new ProductTemplateErrorReason(_CANNOT_ADD_FEATURE_VALUE_FOR_CUSTOM_TARGETING);
    public static final ProductTemplateErrorReason CANNOT_MODIFY_BUILTIN_TARGETING_FEATURE = new ProductTemplateErrorReason(_CANNOT_MODIFY_BUILTIN_TARGETING_FEATURE);
    public static final ProductTemplateErrorReason CANNOT_UPDATE_ARCHIVED_PRODUCT_TEMPLATE = new ProductTemplateErrorReason(_CANNOT_UPDATE_ARCHIVED_PRODUCT_TEMPLATE);
    public static final ProductTemplateErrorReason INVALID_VIDEO_POSITION_VALUE_FOR_LINE_ITEM_TYPE = new ProductTemplateErrorReason(_INVALID_VIDEO_POSITION_VALUE_FOR_LINE_ITEM_TYPE);
    public static final ProductTemplateErrorReason UNKNOWN = new ProductTemplateErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ProductTemplateErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProductTemplateErrorReason enumeration = (ProductTemplateErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProductTemplateErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProductTemplateErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductTemplateError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

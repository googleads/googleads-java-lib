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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductTemplateError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductTemplateError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_FEATURE_EXPANDED_EXCLUSIVE"/>
 *     &lt;enumeration value="INVALID_EXPANDED_FEATURE_DEFAULT_NOT_TARGETED"/>
 *     &lt;enumeration value="INVALID_EXPANDED_FEATURE_DEFAULT_LOCKED"/>
 *     &lt;enumeration value="INVALID_EXPANDED_FEATURE_VALUE_TARGETED"/>
 *     &lt;enumeration value="INVALID_EXPANDED_FEATURE_VALUE_LOCKED"/>
 *     &lt;enumeration value="INVALID_FEATURE_TYPE"/>
 *     &lt;enumeration value="INVALID_ROADBLOCKING_TYPE"/>
 *     &lt;enumeration value="INVALID_DELIVERY_RATE_TYPE"/>
 *     &lt;enumeration value="INVALID_CREATIVE_ROTATION_TYPE"/>
 *     &lt;enumeration value="INVALID_COMPANION_DELIVERY_OPTION"/>
 *     &lt;enumeration value="INVALID_TARGETING"/>
 *     &lt;enumeration value="INVALID_FREQUENCY_CAPS"/>
 *     &lt;enumeration value="INVALID_TECHNOLOGY_INCLUDE_EXCLUDE"/>
 *     &lt;enumeration value="INVALID_EXPANDED_PRODUCT_COUNT"/>
 *     &lt;enumeration value="INVALID_TARGET_PLATFORM"/>
 *     &lt;enumeration value="INVALID_NON_TARGETING_FEATURE"/>
 *     &lt;enumeration value="INVALID_FEATURE_CARDINALITY_AT_LEAST_ONE"/>
 *     &lt;enumeration value="INVALID_FEATURE_CARDINALITY_AT_MOST_ONE"/>
 *     &lt;enumeration value="INVALID_FEATURE_CARDINALITY_EXACTLY_ONE"/>
 *     &lt;enumeration value="INVALID_FEATURE_FOR_OFFLINE"/>
 *     &lt;enumeration value="INVALID_RATE_TYPE_FOR_OFFLINE"/>
 *     &lt;enumeration value="INVALID_RATE_TYPE_FOR_DFP"/>
 *     &lt;enumeration value="INVALID_RATE_TYPE_FOR_NON_DFP"/>
 *     &lt;enumeration value="INVALID_VALUES_FOR_CLICK_TRACKING_LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="INVALID_SEGMENTATION_OR_TARGETING_FOR_CLICK_TRACKING_LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_PRIORITY"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="INVALID_ENVIRONMENT_TYPE"/>
 *     &lt;enumeration value="DUPLICATED_PLACEHOLDER_IN_NAMEMACRO"/>
 *     &lt;enumeration value="INVALID_EXPANDED_FEATURE_IN_NON_EXPANDABLE_AFFINITY"/>
 *     &lt;enumeration value="INVALID_FEATURE_DEFAULT_TARGET_TYPE"/>
 *     &lt;enumeration value="INVALID_FEATURE_VALUE_TARGET_TYPE"/>
 *     &lt;enumeration value="INVALID_FEATURE_AND_VALUE_LOCK_EXCLUSIVE"/>
 *     &lt;enumeration value="INVALID_CREATIVE_PLACEHOLDER"/>
 *     &lt;enumeration value="DUPLICATED_FEATURE"/>
 *     &lt;enumeration value="DUPLICATED_CUSTOM_TARGETING_KEY"/>
 *     &lt;enumeration value="DUPLICATED_CUSTOM_TARGETING_VALUE"/>
 *     &lt;enumeration value="INVALID_CUSTOM_TARGETING_KEY_ID"/>
 *     &lt;enumeration value="INVALID_CUSTOM_TARGETING_VALUE_ID"/>
 *     &lt;enumeration value="MISSING_CUSTOM_TARGETING_VALUES"/>
 *     &lt;enumeration value="LOCATION_CANNOT_BE_TARGETED_IF_PARENT_IS_TARGETED"/>
 *     &lt;enumeration value="LOCATION_CANNOT_BE_EXCLUDED_IF_PARENT_IS_EXCLUDED"/>
 *     &lt;enumeration value="LOCATION_CANNOT_BE_EXCLUDED_DIRECTLY_WHEN_HAVE_TARGETED_LOCATION"/>
 *     &lt;enumeration value="CUSTOMIZABLE_CUSTOM_KEY_CANNOT_BE_SEGMENTED"/>
 *     &lt;enumeration value="CUSTOM_KEY_USED_IN_TARGETING_CANNOT_BE_SEGMENTED"/>
 *     &lt;enumeration value="MISSING_EXPANDED_FEATURE_PLACEHOLDER_IN_NAMEMACRO"/>
 *     &lt;enumeration value="MISSING_FEATURE_VALUE_OF_NAMEMACRO_PLACEHOLDER"/>
 *     &lt;enumeration value="MISSING_FEATURE_OF_NAMEMACRO_PLACEHOLDER"/>
 *     &lt;enumeration value="MISSING_SUBTYPE_FOR_CUSTOM_TARGETING"/>
 *     &lt;enumeration value="COMPANION_NOT_ALLOWED"/>
 *     &lt;enumeration value="MISSING_COMPANION"/>
 *     &lt;enumeration value="DUPLICATED_MASTER_SIZE"/>
 *     &lt;enumeration value="CANNOT_HAVE_CREATIVE_TEMPLATE"/>
 *     &lt;enumeration value="NATIVE_CREATIVE_TEMPLATE_REQUIRED"/>
 *     &lt;enumeration value="CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID"/>
 *     &lt;enumeration value="CANNOT_MODIFY_READONLY_FEATURE"/>
 *     &lt;enumeration value="CANNOT_MODIFY_PRODUCT_TYPE"/>
 *     &lt;enumeration value="CANNOT_ADD_SEGMENTATION"/>
 *     &lt;enumeration value="CANNOT_REMOVE_SEGMENTATION"/>
 *     &lt;enumeration value="CANNOT_REMOVE_VALUE_FROM_SEGMENTATION"/>
 *     &lt;enumeration value="CANNOT_ADD_FEATURE_VALUE_FOR_CUSTOM_TARGETING"/>
 *     &lt;enumeration value="CANNOT_MODIFY_BUILTIN_TARGETING_FEATURE"/>
 *     &lt;enumeration value="CANNOT_UPDATE_ARCHIVED_PRODUCT_TEMPLATE"/>
 *     &lt;enumeration value="INVALID_VIDEO_POSITION_VALUE_FOR_LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductTemplateError.Reason")
@XmlEnum
public enum ProductTemplateErrorReason {


    /**
     * 
     *                 One feature affinity should be expanded or not-expanded exclusively.
     *               
     * 
     */
    INVALID_FEATURE_EXPANDED_EXCLUSIVE,

    /**
     * 
     *                 Expanded feature should have false default targeting type.
     *               
     * 
     */
    INVALID_EXPANDED_FEATURE_DEFAULT_NOT_TARGETED,

    /**
     * 
     *                 Expanded feature should be default locked.
     *               
     * 
     */
    INVALID_EXPANDED_FEATURE_DEFAULT_LOCKED,

    /**
     * 
     *                 Expanded feature value should have true targeting type.
     *               
     * 
     */
    INVALID_EXPANDED_FEATURE_VALUE_TARGETED,

    /**
     * 
     *                 Expanded feature value should be default locked.
     *               
     * 
     */
    INVALID_EXPANDED_FEATURE_VALUE_LOCKED,

    /**
     * 
     *                 The feature type is mismatch with feature value's type.
     *               
     * 
     */
    INVALID_FEATURE_TYPE,

    /**
     * 
     *                 The roadblocking type is invalid.
     *               
     * 
     */
    INVALID_ROADBLOCKING_TYPE,

    /**
     * 
     *                 The delivery rate type is invalid.
     *               
     * 
     */
    INVALID_DELIVERY_RATE_TYPE,

    /**
     * 
     *                 The creative rotation type is invalid.
     *               
     * 
     */
    INVALID_CREATIVE_ROTATION_TYPE,

    /**
     * 
     *                 The companion delivery option is invalid.
     *               
     * 
     */
    INVALID_COMPANION_DELIVERY_OPTION,

    /**
     * 
     *                 The targeting is invalid.
     *               
     * 
     */
    INVALID_TARGETING,

    /**
     * 
     *                 The frequency cap is invalid.
     *               
     * 
     */
    INVALID_FREQUENCY_CAPS,

    /**
     * 
     *                 The technology criteria is included and excluded at same time.
     *               
     * 
     */
    INVALID_TECHNOLOGY_INCLUDE_EXCLUDE,
    INVALID_EXPANDED_PRODUCT_COUNT,

    /**
     * 
     *                 The target platform should always be WEB.
     *               
     * 
     */
    INVALID_TARGET_PLATFORM,

    /**
     * 
     *                 The non-targeting feature cannot have default target type TRUE.
     *               
     * 
     */
    INVALID_NON_TARGETING_FEATURE,

    /**
     * 
     *                 The feature's targeted value number breaks the cardinality request, it should have at least
     *                 one value.
     *               
     * 
     */
    INVALID_FEATURE_CARDINALITY_AT_LEAST_ONE,

    /**
     * 
     *                 The feature's targeted value number breaks the cardinality request, it should have at most
     *                 one value.
     *               
     * 
     */
    INVALID_FEATURE_CARDINALITY_AT_MOST_ONE,

    /**
     * 
     *                 The feature's targeted value number breaks the cardinality request, it should have exactly
     *                 one value.
     *               
     * 
     */
    INVALID_FEATURE_CARDINALITY_EXACTLY_ONE,

    /**
     * 
     *                 The feature is invalid for offline product template.
     *               
     * 
     */
    INVALID_FEATURE_FOR_OFFLINE,

    /**
     * 
     *                 The rate type is invalid for offline product template.
     *               
     * 
     */
    INVALID_RATE_TYPE_FOR_OFFLINE,

    /**
     * 
     *                 The rate type should be in the valid set for corresponding line item type of a dfp product
     *                 template.
     *               
     * 
     */
    INVALID_RATE_TYPE_FOR_DFP,

    /**
     * 
     *                 The rate type should be in the valid set for corresponding line item type of a
     *                 {@link ProductType#NON_DFP} product template.
     *               
     * 
     */
    INVALID_RATE_TYPE_FOR_NON_DFP,

    /**
     * 
     *                 One or more values on the product template are not valid for a
     *                 {@link LineItemType#CLICK_TRACKING} line item type.
     *               
     * 
     */
    INVALID_VALUES_FOR_CLICK_TRACKING_LINE_ITEM_TYPE,

    /**
     * 
     *                 The segmentation or targeting on the product template is not valid for a
     *                 {@link LineItemType#CLICK_TRACKING} line item type.
     *               
     * 
     */
    INVALID_SEGMENTATION_OR_TARGETING_FOR_CLICK_TRACKING_LINE_ITEM_TYPE,

    /**
     * 
     *                 The line item priority feature is not match with line item type feature.
     *               
     * 
     */
    INVALID_LINE_ITEM_PRIORITY,

    /**
     * 
     *                 The line item type value is not supported.
     *               
     * 
     */
    INVALID_LINE_ITEM_TYPE,

    /**
     * 
     *                 The environment type is not valid.
     *               
     * 
     */
    INVALID_ENVIRONMENT_TYPE,

    /**
     * 
     *                 Duplication of placeholder for feature type affinity exists in name macro.
     *               
     * 
     */
    DUPLICATED_PLACEHOLDER_IN_NAMEMACRO,

    /**
     * 
     *                 Expanded features are not allowed in non expandable feature affinity.
     *               
     * 
     */
    INVALID_EXPANDED_FEATURE_IN_NON_EXPANDABLE_AFFINITY,

    /**
     * 
     *                 The default target type of the feature is not supported.
     *               
     * 
     */
    INVALID_FEATURE_DEFAULT_TARGET_TYPE,

    /**
     * 
     *                 The target type of the value is invalid.
     *               
     * 
     */
    INVALID_FEATURE_VALUE_TARGET_TYPE,

    /**
     * 
     *                 The default locked of feature is different with locked of feature values.
     *               
     * 
     */
    INVALID_FEATURE_AND_VALUE_LOCK_EXCLUSIVE,

    /**
     * 
     *                 The creative placeholder should have at least a master size, or has one master and multiple
     *                 companion sizes.
     *               
     * 
     */
    INVALID_CREATIVE_PLACEHOLDER,

    /**
     * 
     *                 Duplicated features with the same feature type.
     *               
     * 
     */
    DUPLICATED_FEATURE,

    /**
     * 
     *                 Duplicated custom criteria key.
     *               
     * 
     */
    DUPLICATED_CUSTOM_TARGETING_KEY,

    /**
     * 
     *                 Duplicated custom criteria value.
     *               
     * 
     */
    DUPLICATED_CUSTOM_TARGETING_VALUE,

    /**
     * 
     *                 The id of custom criteria key is invalid.
     *               
     * 
     */
    INVALID_CUSTOM_TARGETING_KEY_ID,

    /**
     * 
     *                 The id of custom criteria value is invalid.
     *               
     * 
     */
    INVALID_CUSTOM_TARGETING_VALUE_ID,

    /**
     * 
     *                 Missing custom targeting values.
     *               
     * 
     */
    MISSING_CUSTOM_TARGETING_VALUES,

    /**
     * 
     *                 A child location can not be targeted if any one of its parent locations is also targeted.
     *               
     * 
     */
    LOCATION_CANNOT_BE_TARGETED_IF_PARENT_IS_TARGETED,

    /**
     * 
     *                 A child location can not be excluded if any one of its parent locations is also excluded.
     *               
     * 
     */
    LOCATION_CANNOT_BE_EXCLUDED_IF_PARENT_IS_EXCLUDED,

    /**
     * 
     *                 An excluded location must have one targeted parent when targeted location is not empty.
     *               
     * 
     */
    LOCATION_CANNOT_BE_EXCLUDED_DIRECTLY_WHEN_HAVE_TARGETED_LOCATION,

    /**
     * 
     *                 Customizable key is used in custom targeting segment.
     *               
     * 
     */
    CUSTOMIZABLE_CUSTOM_KEY_CANNOT_BE_SEGMENTED,

    /**
     * 
     *                 Custom targeting key is already used in custom targeting segment.
     *               
     * 
     */
    CUSTOM_KEY_USED_IN_TARGETING_CANNOT_BE_SEGMENTED,

    /**
     * 
     *                 A placeholder for an expanded feature type affinity is missing in name macro.
     *               
     * 
     */
    MISSING_EXPANDED_FEATURE_PLACEHOLDER_IN_NAMEMACRO,

    /**
     * 
     *                 The feature type affinity with placeholder been added is missing corresponding value.
     *               
     * 
     */
    MISSING_FEATURE_VALUE_OF_NAMEMACRO_PLACEHOLDER,

    /**
     * 
     *                 The feature type affinity with placeholder been added is not specified.
     *               
     * 
     */
    MISSING_FEATURE_OF_NAMEMACRO_PLACEHOLDER,

    /**
     * 
     *                 The SubTypeId of custom criteria feature is not specified.
     *               
     * 
     */
    MISSING_SUBTYPE_FOR_CUSTOM_TARGETING,

    /**
     * 
     *                 A placeholder contains companions but the roadblocking type is not CREATIVE_SET or the
     *                 product type is offline.
     *               
     * 
     */
    COMPANION_NOT_ALLOWED,

    /**
     * 
     *                 A placeholder does not contain companions but the roadblocking type is CREATIVE_SET.
     *               
     * 
     */
    MISSING_COMPANION,

    /**
     * 
     *                 A placeholder's master size is the same as another placeholder.
     *               
     * 
     */
    DUPLICATED_MASTER_SIZE,

    /**
     * 
     *                 Non-native placeholders cannot have creative templates.
     *               
     * 
     */
    CANNOT_HAVE_CREATIVE_TEMPLATE,

    /**
     * 
     *                 Placeholders can only have native creative templates.
     *               
     * 
     */
    NATIVE_CREATIVE_TEMPLATE_REQUIRED,

    /**
     * 
     *                 Cannot include native placeholders without native creative templates.
     *               
     * 
     */
    CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID,

    /**
     * 
     *                 The feature is readonly.
     *               
     * 
     */
    CANNOT_MODIFY_READONLY_FEATURE,

    /**
     * 
     *                 The product type can not be modified after creation.
     *               
     * 
     */
    CANNOT_MODIFY_PRODUCT_TYPE,

    /**
     * 
     *                 Cannot add new segmentations after product template is saved.
     *               
     * 
     */
    CANNOT_ADD_SEGMENTATION,

    /**
     * 
     *                 Cannot remove segmentations after product template is saved.
     *               
     * 
     */
    CANNOT_REMOVE_SEGMENTATION,

    /**
     * 
     *                 Cannot remove value from segmentation after product template is saved.
     *               
     * 
     */
    CANNOT_REMOVE_VALUE_FROM_SEGMENTATION,

    /**
     * 
     *                 Cannot add feature value for custom targeting.
     *               
     * 
     */
    CANNOT_ADD_FEATURE_VALUE_FOR_CUSTOM_TARGETING,

    /**
     * 
     *                 Cannot modify a builtin targeting feature.
     *               
     * 
     */
    CANNOT_MODIFY_BUILTIN_TARGETING_FEATURE,

    /**
     * 
     *                 Cannot update an archived product template.
     *               
     * 
     */
    CANNOT_UPDATE_ARCHIVED_PRODUCT_TEMPLATE,

    /**
     * 
     *                 There are video position values that are invalid for the {@link LineItemType}.
     *               
     * 
     */
    INVALID_VIDEO_POSITION_VALUE_FOR_LINE_ITEM_TYPE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ProductTemplateErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedMappingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedMappingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_PLACEHOLDER_FIELD"/>
 *     &lt;enumeration value="INVALID_CRITERION_FIELD"/>
 *     &lt;enumeration value="INVALID_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="INVALID_CRITERION_TYPE"/>
 *     &lt;enumeration value="CANNOT_SET_PLACEHOLDER_TYPE_AND_CRITERION_TYPE"/>
 *     &lt;enumeration value="NO_ATTRIBUTE_FIELD_MAPPINGS"/>
 *     &lt;enumeration value="FEED_ATTRIBUTE_TYPE_MISMATCH"/>
 *     &lt;enumeration value="CANNOT_OPERATE_ON_MAPPINGS_FOR_SYSTEM_GENERATED_FEED"/>
 *     &lt;enumeration value="MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="MULTIPLE_MAPPINGS_FOR_CRITERION_TYPE"/>
 *     &lt;enumeration value="MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_FIELD"/>
 *     &lt;enumeration value="MULTIPLE_MAPPINGS_FOR_CRITERION_FIELD"/>
 *     &lt;enumeration value="UNEXPECTED_ATTRIBUTE_FIELD_MAPPINGS"/>
 *     &lt;enumeration value="LOCATION_PLACEHOLDER_ONLY_FOR_PLACES_FEEDS"/>
 *     &lt;enumeration value="CANNOT_MODIFY_MAPPINGS_FOR_TYPED_FEED"/>
 *     &lt;enumeration value="INVALID_PLACEHOLDER_TYPE_FOR_NON_SYSTEM_GENERATED_FEED"/>
 *     &lt;enumeration value="INVALID_PLACEHOLDER_TYPE_FOR_SYSTEM_GENERATED_FEED_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedMappingError.Reason")
@XmlEnum
public enum FeedMappingErrorReason {


    /**
     * 
     *                 The given placeholder field does not exist.
     *               
     * 
     */
    INVALID_PLACEHOLDER_FIELD,

    /**
     * 
     *                 The given criterion field does not exist.
     *               
     * 
     */
    INVALID_CRITERION_FIELD,

    /**
     * 
     *                 The given placeholder type does not exist.
     *               
     * 
     */
    INVALID_PLACEHOLDER_TYPE,

    /**
     * 
     *                 The given criterion type does not exist.
     *               
     * 
     */
    INVALID_CRITERION_TYPE,

    /**
     * 
     *                 Cannot specify both placeholder type and criterion type.
     *               
     * 
     */
    CANNOT_SET_PLACEHOLDER_TYPE_AND_CRITERION_TYPE,

    /**
     * 
     *                 A feed mapping must contain at least one attribute field mapping.
     *               
     * 
     */
    NO_ATTRIBUTE_FIELD_MAPPINGS,

    /**
     * 
     *                 The type of the feed attribute referenced in the attribute field mapping must match
     *                 the type of the placeholder field.
     *               
     * 
     */
    FEED_ATTRIBUTE_TYPE_MISMATCH,

    /**
     * 
     *                 A feed mapping for a system generated feed cannot be operated on.
     *               
     * 
     */
    CANNOT_OPERATE_ON_MAPPINGS_FOR_SYSTEM_GENERATED_FEED,

    /**
     * 
     *                 Only one feed mapping for a placeholder type is allowed per feed or customer
     *                 (depending on the placeholder type).
     *               
     * 
     */
    MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE,

    /**
     * 
     *                 Only one feed mapping for a criterion type is allowed per customer.
     *               
     * 
     */
    MULTIPLE_MAPPINGS_FOR_CRITERION_TYPE,

    /**
     * 
     *                 Only one feed attribute mapping for a placeholder field is allowed
     *                 (depending on the placeholder type).
     *               
     * 
     */
    MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_FIELD,

    /**
     * 
     *                 Only one feed attribute mapping for a criterion field is allowed
     *                 (depending on the criterion type).
     *               
     * 
     */
    MULTIPLE_MAPPINGS_FOR_CRITERION_FIELD,

    /**
     * 
     *                 This feed mapping may not contain any explicit attribute field mappings.
     *               
     * 
     */
    UNEXPECTED_ATTRIBUTE_FIELD_MAPPINGS,

    /**
     * 
     *                 Location placeholder feedmappings can only be created for Places feeds.
     *               
     * 
     */
    LOCATION_PLACEHOLDER_ONLY_FOR_PLACES_FEEDS,

    /**
     * 
     *                 Mappings for typed feeds cannot be modified.
     *               
     * 
     */
    CANNOT_MODIFY_MAPPINGS_FOR_TYPED_FEED,

    /**
     * 
     *                 The given placeholder type can only be mapped to system generated feeds.
     *               
     * 
     */
    INVALID_PLACEHOLDER_TYPE_FOR_NON_SYSTEM_GENERATED_FEED,

    /**
     * 
     *                 The given placeholder type cannot be mapped to a system generated feed with the given type.
     *               
     * 
     */
    INVALID_PLACEHOLDER_TYPE_FOR_SYSTEM_GENERATED_FEED_TYPE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static FeedMappingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

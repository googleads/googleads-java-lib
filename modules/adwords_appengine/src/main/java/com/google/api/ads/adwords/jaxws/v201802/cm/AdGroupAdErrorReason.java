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
 * <p>Java class for AdGroupAdError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupAdError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD_GROUP_AD_LABEL_DOES_NOT_EXIST"/>
 *     &lt;enumeration value="AD_GROUP_AD_LABEL_ALREADY_EXISTS"/>
 *     &lt;enumeration value="AD_NOT_UNDER_ADGROUP"/>
 *     &lt;enumeration value="CANNOT_OPERATE_ON_REMOVED_ADGROUPAD"/>
 *     &lt;enumeration value="CANNOT_CREATE_DEPRECATED_ADS"/>
 *     &lt;enumeration value="CANNOT_CREATE_TEXT_ADS"/>
 *     &lt;enumeration value="EMPTY_FIELD"/>
 *     &lt;enumeration value="ENTITY_REFERENCED_IN_MULTIPLE_OPS"/>
 *     &lt;enumeration value="UNSUPPORTED_OPERATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupAdError.Reason")
@XmlEnum
public enum AdGroupAdErrorReason {


    /**
     * 
     *                 No link found between the adgroup ad and the label.
     *               
     * 
     */
    AD_GROUP_AD_LABEL_DOES_NOT_EXIST,

    /**
     * 
     *                 The label has already been attached to the adgroup ad.
     *               
     * 
     */
    AD_GROUP_AD_LABEL_ALREADY_EXISTS,

    /**
     * 
     *                 The specified ad was not found in the adgroup
     *               
     * 
     */
    AD_NOT_UNDER_ADGROUP,

    /**
     * 
     *                 Removed ads may not be modified
     *               
     * 
     */
    CANNOT_OPERATE_ON_REMOVED_ADGROUPAD,

    /**
     * 
     *                 An ad of this type is deprecated and cannot be created. Only deletions
     *                 are permitted.
     *               
     * 
     */
    CANNOT_CREATE_DEPRECATED_ADS,

    /**
     * 
     *                 Text ads are deprecated and cannot be created. Use expanded text ads instead.
     *               
     * 
     */
    CANNOT_CREATE_TEXT_ADS,

    /**
     * 
     *                 A required field was not specified or is an empty string.
     *               
     * 
     */
    EMPTY_FIELD,

    /**
     * 
     *                 An ad may only be modified once per call
     *               
     * 
     */
    ENTITY_REFERENCED_IN_MULTIPLE_OPS,

    /**
     * 
     *                 The specified operation is not supported.  Only ADD, SET, and REMOVE
     *                 are supported
     *               
     * 
     */
    UNSUPPORTED_OPERATION;

    public String value() {
        return name();
    }

    public static AdGroupAdErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

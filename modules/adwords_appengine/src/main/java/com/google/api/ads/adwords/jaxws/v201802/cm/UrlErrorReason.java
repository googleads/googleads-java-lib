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
 * <p>Java class for UrlError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UrlError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_TRACKING_URL_TEMPLATE"/>
 *     &lt;enumeration value="INVALID_TAG_IN_TRACKING_URL_TEMPLATE"/>
 *     &lt;enumeration value="MISSING_TRACKING_URL_TEMPLATE_TAG"/>
 *     &lt;enumeration value="MISSING_PROTOCOL_IN_TRACKING_URL_TEMPLATE"/>
 *     &lt;enumeration value="INVALID_PROTOCOL_IN_TRACKING_URL_TEMPLATE"/>
 *     &lt;enumeration value="MALFORMED_TRACKING_URL_TEMPLATE"/>
 *     &lt;enumeration value="MISSING_HOST_IN_TRACKING_URL_TEMPLATE"/>
 *     &lt;enumeration value="INVALID_TLD_IN_TRACKING_URL_TEMPLATE"/>
 *     &lt;enumeration value="REDUNDANT_NESTED_TRACKING_URL_TEMPLATE_TAG"/>
 *     &lt;enumeration value="INVALID_FINAL_URL"/>
 *     &lt;enumeration value="INVALID_TAG_IN_FINAL_URL"/>
 *     &lt;enumeration value="REDUNDANT_NESTED_FINAL_URL_TAG"/>
 *     &lt;enumeration value="MISSING_PROTOCOL_IN_FINAL_URL"/>
 *     &lt;enumeration value="INVALID_PROTOCOL_IN_FINAL_URL"/>
 *     &lt;enumeration value="MALFORMED_FINAL_URL"/>
 *     &lt;enumeration value="MISSING_HOST_IN_FINAL_URL"/>
 *     &lt;enumeration value="INVALID_TLD_IN_FINAL_URL"/>
 *     &lt;enumeration value="INVALID_FINAL_MOBILE_URL"/>
 *     &lt;enumeration value="INVALID_TAG_IN_FINAL_MOBILE_URL"/>
 *     &lt;enumeration value="REDUNDANT_NESTED_FINAL_MOBILE_URL_TAG"/>
 *     &lt;enumeration value="MISSING_PROTOCOL_IN_FINAL_MOBILE_URL"/>
 *     &lt;enumeration value="INVALID_PROTOCOL_IN_FINAL_MOBILE_URL"/>
 *     &lt;enumeration value="MALFORMED_FINAL_MOBILE_URL"/>
 *     &lt;enumeration value="MISSING_HOST_IN_FINAL_MOBILE_URL"/>
 *     &lt;enumeration value="INVALID_TLD_IN_FINAL_MOBILE_URL"/>
 *     &lt;enumeration value="INVALID_FINAL_APP_URL"/>
 *     &lt;enumeration value="INVALID_TAG_IN_FINAL_APP_URL"/>
 *     &lt;enumeration value="REDUNDANT_NESTED_FINAL_APP_URL_TAG"/>
 *     &lt;enumeration value="MULTIPLE_APP_URLS_FOR_OSTYPE"/>
 *     &lt;enumeration value="INVALID_OSTYPE"/>
 *     &lt;enumeration value="INVALID_PROTOCOL_FOR_APP_URL"/>
 *     &lt;enumeration value="INVALID_PACKAGE_ID_FOR_APP_URL"/>
 *     &lt;enumeration value="URL_CUSTOM_PARAMETERS_COUNT_EXCEEDS_LIMIT"/>
 *     &lt;enumeration value="URL_CUSTOM_PARAMETER_REMOVAL_WITH_NON_NULL_VALUE"/>
 *     &lt;enumeration value="CANNOT_REMOVE_URL_CUSTOM_PARAMETER_IN_ADD_OPERATION"/>
 *     &lt;enumeration value="CANNOT_REMOVE_URL_CUSTOM_PARAMETER_DURING_FULL_REPLACEMENT"/>
 *     &lt;enumeration value="NULL_CUSTOM_PARAMETER_VALUE_DURING_ADD_OR_FULL_REPLACEMENT"/>
 *     &lt;enumeration value="INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_KEY"/>
 *     &lt;enumeration value="INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_VALUE"/>
 *     &lt;enumeration value="INVALID_TAG_IN_URL_CUSTOM_PARAMETER_VALUE"/>
 *     &lt;enumeration value="REDUNDANT_NESTED_URL_CUSTOM_PARAMETER_TAG"/>
 *     &lt;enumeration value="MISSING_PROTOCOL"/>
 *     &lt;enumeration value="INVALID_URL"/>
 *     &lt;enumeration value="DESTINATION_URL_DEPRECATED"/>
 *     &lt;enumeration value="INVALID_TAG_IN_URL"/>
 *     &lt;enumeration value="MISSING_URL_TAG"/>
 *     &lt;enumeration value="DUPLICATE_URL_ID"/>
 *     &lt;enumeration value="INVALID_URL_ID"/>
 *     &lt;enumeration value="URL_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UrlError.Reason")
@XmlEnum
public enum UrlErrorReason {


    /**
     * 
     *                 The tracking url template is invalid.
     *               
     * 
     */
    INVALID_TRACKING_URL_TEMPLATE,

    /**
     * 
     *                 The tracking url template contains invalid tag.
     *               
     * 
     */
    INVALID_TAG_IN_TRACKING_URL_TEMPLATE,

    /**
     * 
     *                 The tracking url template must contain at least one tag (e.g. {lpurl}),
     *                 This applies only to tracking url template associated with website ads or product ads.
     *               
     * 
     */
    MISSING_TRACKING_URL_TEMPLATE_TAG,

    /**
     * 
     *                 The tracking url template must start with a valid protocol (or lpurl tag).
     *               
     * 
     */
    MISSING_PROTOCOL_IN_TRACKING_URL_TEMPLATE,

    /**
     * 
     *                 The tracking url template starts with an invalid protocol.
     *               
     * 
     */
    INVALID_PROTOCOL_IN_TRACKING_URL_TEMPLATE,

    /**
     * 
     *                 The tracking url template  contains illegal characters.
     *               
     * 
     */
    MALFORMED_TRACKING_URL_TEMPLATE,

    /**
     * 
     *                 The tracking url template must contain a host name (or lpurl tag).
     *               
     * 
     */
    MISSING_HOST_IN_TRACKING_URL_TEMPLATE,

    /**
     * 
     *                 The tracking url template has an invalid or missing top level domain extension.
     *               
     * 
     */
    INVALID_TLD_IN_TRACKING_URL_TEMPLATE,

    /**
     * 
     *                 The tracking url template contains nested occurrences of the same conditional tag
     *                 (i.e. {ifmobile:{ifmobile:x}}).
     *               
     * 
     */
    REDUNDANT_NESTED_TRACKING_URL_TEMPLATE_TAG,

    /**
     * 
     *                 The final url is invalid.
     *               
     * 
     */
    INVALID_FINAL_URL,

    /**
     * 
     *                 The final url contains invalid tag.
     *               
     * 
     */
    INVALID_TAG_IN_FINAL_URL,

    /**
     * 
     *                 The final url contains nested occurrences of the same conditional tag
     *                 (i.e. {ifmobile:{ifmobile:x}}).
     *               
     * 
     */
    REDUNDANT_NESTED_FINAL_URL_TAG,

    /**
     * 
     *                 The final url must start with a valid protocol.
     *               
     * 
     */
    MISSING_PROTOCOL_IN_FINAL_URL,

    /**
     * 
     *                 The final url starts with an invalid protocol.
     *               
     * 
     */
    INVALID_PROTOCOL_IN_FINAL_URL,

    /**
     * 
     *                 The final url  contains illegal characters.
     *               
     * 
     */
    MALFORMED_FINAL_URL,

    /**
     * 
     *                 The final url must contain a host name.
     *               
     * 
     */
    MISSING_HOST_IN_FINAL_URL,

    /**
     * 
     *                 The tracking url template has an invalid or missing top level domain extension.
     *               
     * 
     */
    INVALID_TLD_IN_FINAL_URL,

    /**
     * 
     *                 The final mobile url is invalid.
     *               
     * 
     */
    INVALID_FINAL_MOBILE_URL,

    /**
     * 
     *                 The final mobile url contains invalid tag.
     *               
     * 
     */
    INVALID_TAG_IN_FINAL_MOBILE_URL,

    /**
     * 
     *                 The final mobile url contains nested occurrences of the same conditional tag
     *                 (i.e. {ifmobile:{ifmobile:x}}).
     *               
     * 
     */
    REDUNDANT_NESTED_FINAL_MOBILE_URL_TAG,

    /**
     * 
     *                 The final mobile url must start with a valid protocol.
     *               
     * 
     */
    MISSING_PROTOCOL_IN_FINAL_MOBILE_URL,

    /**
     * 
     *                 The final mobile url starts with an invalid protocol.
     *               
     * 
     */
    INVALID_PROTOCOL_IN_FINAL_MOBILE_URL,

    /**
     * 
     *                 The final mobile url  contains illegal characters.
     *               
     * 
     */
    MALFORMED_FINAL_MOBILE_URL,

    /**
     * 
     *                 The final mobile url must contain a host name.
     *               
     * 
     */
    MISSING_HOST_IN_FINAL_MOBILE_URL,

    /**
     * 
     *                 The tracking url template has an invalid or missing top level domain extension.
     *               
     * 
     */
    INVALID_TLD_IN_FINAL_MOBILE_URL,

    /**
     * 
     *                 The final app url is invalid.
     *               
     * 
     */
    INVALID_FINAL_APP_URL,

    /**
     * 
     *                 The final app url contains invalid tag.
     *               
     * 
     */
    INVALID_TAG_IN_FINAL_APP_URL,

    /**
     * 
     *                 The final app url contains nested occurrences of the same conditional tag
     *                 (i.e. {ifmobile:{ifmobile:x}}).
     *               
     * 
     */
    REDUNDANT_NESTED_FINAL_APP_URL_TAG,

    /**
     * 
     *                 More than one app url found for the same OS type.
     *               
     * 
     */
    MULTIPLE_APP_URLS_FOR_OSTYPE,

    /**
     * 
     *                 The OS type given for an app url is not valid.
     *               
     * 
     */
    INVALID_OSTYPE,

    /**
     * 
     *                 The protocol given for an app url is not valid. (E.g. "android-app://")
     *               
     * 
     */
    INVALID_PROTOCOL_FOR_APP_URL,

    /**
     * 
     *                 The package id (app id) given for an app url is not valid.
     *               
     * 
     */
    INVALID_PACKAGE_ID_FOR_APP_URL,

    /**
     * 
     *                 The number of url custom parameters for an entity exceeds the maximum limit allowed.
     *               
     * 
     */
    URL_CUSTOM_PARAMETERS_COUNT_EXCEEDS_LIMIT,

    /**
     * 
     *                 The parameter has isRemove set to true but a value that is non-null.
     *               
     * 
     */
    URL_CUSTOM_PARAMETER_REMOVAL_WITH_NON_NULL_VALUE,

    /**
     * 
     *                 For add operations, there will not be any existing parameters to delete.
     *               
     * 
     */
    CANNOT_REMOVE_URL_CUSTOM_PARAMETER_IN_ADD_OPERATION,

    /**
     * 
     *                 When the doReplace flag is set to true, individual parameters cannot be deleted.
     *               
     * 
     */
    CANNOT_REMOVE_URL_CUSTOM_PARAMETER_DURING_FULL_REPLACEMENT,

    /**
     * 
     *                 For ADD operations and when the doReplace flag is set to true, custom parameter values
     *                 cannot be null.
     *               
     * 
     */
    NULL_CUSTOM_PARAMETER_VALUE_DURING_ADD_OR_FULL_REPLACEMENT,

    /**
     * 
     *                 An invalid character appears in the parameter key.
     *               
     * 
     */
    INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_KEY,

    /**
     * 
     *                 An invalid character appears in the parameter value.
     *               
     * 
     */
    INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_VALUE,

    /**
     * 
     *                 The url custom parameter value fails url tag validation.
     *               
     * 
     */
    INVALID_TAG_IN_URL_CUSTOM_PARAMETER_VALUE,

    /**
     * 
     *                 The custom parameter contains nested occurrences of the same conditional tag
     *                 (i.e. {ifmobile:{ifmobile:x}}).
     *               
     * 
     */
    REDUNDANT_NESTED_URL_CUSTOM_PARAMETER_TAG,

    /**
     * 
     *                 The protocol (http:// or https://) is missing.
     *               
     * 
     */
    MISSING_PROTOCOL,

    /**
     * 
     *                 The url is invalid.
     *               
     * 
     */
    INVALID_URL,

    /**
     * 
     *                 Destination Url is deprecated.
     *               
     * 
     */
    DESTINATION_URL_DEPRECATED,

    /**
     * 
     *                 The url contains invalid tag.
     *               
     * 
     */
    INVALID_TAG_IN_URL,

    /**
     * 
     *                 The url must contain at least one tag (e.g. {lpurl}),
     *                 This applies only to urls associated with website ads or product ads.
     *               
     * 
     */
    MISSING_URL_TAG,
    DUPLICATE_URL_ID,
    INVALID_URL_ID,
    URL_ERROR;

    public String value() {
        return name();
    }

    public static UrlErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

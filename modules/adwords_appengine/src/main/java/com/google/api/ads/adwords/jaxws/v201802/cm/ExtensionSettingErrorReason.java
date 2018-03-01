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
 * <p>Java class for ExtensionSettingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtensionSettingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXTENSIONS_REQUIRED"/>
 *     &lt;enumeration value="FEED_TYPE_EXTENSION_TYPE_MISMATCH"/>
 *     &lt;enumeration value="INVALID_FEED_TYPE"/>
 *     &lt;enumeration value="INVALID_FEED_TYPE_FOR_CUSTOMER_EXTENSION_SETTING"/>
 *     &lt;enumeration value="CANNOT_CHANGE_FEED_ITEM_ON_ADD"/>
 *     &lt;enumeration value="CANNOT_UPDATE_NEWLY_ADDED_EXTENSION"/>
 *     &lt;enumeration value="NO_EXISTING_AD_GROUP_EXTENSION_SETTING_FOR_TYPE"/>
 *     &lt;enumeration value="NO_EXISTING_CAMPAIGN_EXTENSION_SETTING_FOR_TYPE"/>
 *     &lt;enumeration value="NO_EXISTING_CUSTOMER_EXTENSION_SETTING_FOR_TYPE"/>
 *     &lt;enumeration value="AD_GROUP_EXTENSION_SETTING_ALREADY_EXISTS"/>
 *     &lt;enumeration value="CAMPAIGN_EXTENSION_SETTING_ALREADY_EXISTS"/>
 *     &lt;enumeration value="CUSTOMER_EXTENSION_SETTING_ALREADY_EXISTS"/>
 *     &lt;enumeration value="AD_GROUP_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="CAMPAIGN_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="CUSTOMER_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE"/>
 *     &lt;enumeration value="VALUE_OUT_OF_RANGE"/>
 *     &lt;enumeration value="CANNOT_SET_WITH_FINAL_URLS"/>
 *     &lt;enumeration value="CANNOT_SET_WITHOUT_FINAL_URLS"/>
 *     &lt;enumeration value="CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE"/>
 *     &lt;enumeration value="INVALID_PHONE_NUMBER"/>
 *     &lt;enumeration value="PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY"/>
 *     &lt;enumeration value="CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED"/>
 *     &lt;enumeration value="PREMIUM_RATE_NUMBER_NOT_ALLOWED"/>
 *     &lt;enumeration value="DISALLOWED_NUMBER_TYPE"/>
 *     &lt;enumeration value="INVALID_DOMESTIC_PHONE_NUMBER_FORMAT"/>
 *     &lt;enumeration value="VANITY_PHONE_NUMBER_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_COUNTRY_CODE"/>
 *     &lt;enumeration value="INVALID_CALL_CONVERSION_TYPE_ID"/>
 *     &lt;enumeration value="CUSTOMER_NOT_WHITELISTED_FOR_CALLTRACKING"/>
 *     &lt;enumeration value="CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY"/>
 *     &lt;enumeration value="INVALID_APP_ID"/>
 *     &lt;enumeration value="QUOTES_IN_REVIEW_EXTENSION_SNIPPET"/>
 *     &lt;enumeration value="HYPHENS_IN_REVIEW_EXTENSION_SNIPPET"/>
 *     &lt;enumeration value="REVIEW_EXTENSION_SOURCE_INELIGIBLE"/>
 *     &lt;enumeration value="SOURCE_NAME_IN_REVIEW_EXTENSION_TEXT"/>
 *     &lt;enumeration value="MISSING_FIELD"/>
 *     &lt;enumeration value="INCONSISTENT_CURRENCY_CODES"/>
 *     &lt;enumeration value="PRICE_EXTENSION_HAS_DUPLICATED_HEADERS"/>
 *     &lt;enumeration value="PRICE_ITEM_HAS_DUPLICATED_HEADER_AND_DESCRIPTION"/>
 *     &lt;enumeration value="PRICE_EXTENSION_HAS_TOO_FEW_ITEMS"/>
 *     &lt;enumeration value="PRICE_EXTENSION_HAS_TOO_MANY_ITEMS"/>
 *     &lt;enumeration value="UNSUPPORTED_VALUE"/>
 *     &lt;enumeration value="UNSUPPORTED_VALUE_IN_SELECTED_LANGUAGE"/>
 *     &lt;enumeration value="INVALID_DEVICE_PREFERENCE"/>
 *     &lt;enumeration value="INVALID_SCHEDULE_END"/>
 *     &lt;enumeration value="DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE"/>
 *     &lt;enumeration value="OVERLAPPING_SCHEDULES"/>
 *     &lt;enumeration value="SCHEDULE_END_NOT_AFTER_START"/>
 *     &lt;enumeration value="TOO_MANY_SCHEDULES_PER_DAY"/>
 *     &lt;enumeration value="DUPLICATE_EXTENSION_FEED_ITEM_EDIT"/>
 *     &lt;enumeration value="INVALID_SNIPPETS_HEADER"/>
 *     &lt;enumeration value="PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY"/>
 *     &lt;enumeration value="CAMPAIGN_TARGETING_MISMATCH"/>
 *     &lt;enumeration value="CANNOT_OPERATE_ON_DELETED_FEED"/>
 *     &lt;enumeration value="CONCRETE_EXTENSION_TYPE_REQUIRED"/>
 *     &lt;enumeration value="INCOMPATIBLE_UNDERLYING_MATCHING_FUNCTION"/>
 *     &lt;enumeration value="START_DATE_AFTER_END_DATE"/>
 *     &lt;enumeration value="INVALID_PRICE_FORMAT"/>
 *     &lt;enumeration value="PROMOTION_INVALID_TIME"/>
 *     &lt;enumeration value="PROMOTION_CANNOT_SET_PERCENT_OFF_AND_MONEY_AMOUNT_OFF"/>
 *     &lt;enumeration value="PROMOTION_CANNOT_SET_PROMOTION_CODE_AND_ORDERS_OVER_AMOUNT"/>
 *     &lt;enumeration value="TOO_MANY_DECIMAL_PLACES_SPECIFIED"/>
 *     &lt;enumeration value="INVALID_LANGUAGE_CODE"/>
 *     &lt;enumeration value="UNSUPPORTED_LANGUAGE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtensionSettingError.Reason")
@XmlEnum
public enum ExtensionSettingErrorReason {


    /**
     * 
     *                 A platform restriction was provided without input extensions or existing extensions.
     *               
     * 
     */
    EXTENSIONS_REQUIRED,

    /**
     * 
     *                 The provided feed type does not correspond to the provided extensions.
     *               
     * 
     */
    FEED_TYPE_EXTENSION_TYPE_MISMATCH,

    /**
     * 
     *                 The provided feed type cannot be used.
     *               
     * 
     */
    INVALID_FEED_TYPE,

    /**
     * 
     *                 The provided feed type cannot be used at the customer level.
     *               
     * 
     */
    INVALID_FEED_TYPE_FOR_CUSTOMER_EXTENSION_SETTING,

    /**
     * 
     *                 Can not change a feed item field on an ADD operation.
     *               
     * 
     */
    CANNOT_CHANGE_FEED_ITEM_ON_ADD,

    /**
     * 
     *                 Can not update an extension that is not already in this setting.
     *               
     * 
     */
    CANNOT_UPDATE_NEWLY_ADDED_EXTENSION,

    /**
     * 
     *                 There is no existing AdGroupExtensionSetting for this type.
     *               
     * 
     */
    NO_EXISTING_AD_GROUP_EXTENSION_SETTING_FOR_TYPE,

    /**
     * 
     *                 There is no existing CampaignExtensionSetting for this type.
     *               
     * 
     */
    NO_EXISTING_CAMPAIGN_EXTENSION_SETTING_FOR_TYPE,

    /**
     * 
     *                 There is no existing CustomerExtensionSetting for this type.
     *               
     * 
     */
    NO_EXISTING_CUSTOMER_EXTENSION_SETTING_FOR_TYPE,

    /**
     * 
     *                 The AdGroupExtensionSetting already exists. SET should be used to modify the existing
     *                 AdGroupExtensionSetting.
     *               
     * 
     */
    AD_GROUP_EXTENSION_SETTING_ALREADY_EXISTS,

    /**
     * 
     *                 The CampaignExtensionSetting already exists. SET should be used to modify the existing
     *                 CampaignExtensionSetting.
     *               
     * 
     */
    CAMPAIGN_EXTENSION_SETTING_ALREADY_EXISTS,

    /**
     * 
     *                 The CustomerExtensionSetting already exists. SET should be used to modify the existing
     *                 CustomerExtensionSetting.
     *               
     * 
     */
    CUSTOMER_EXTENSION_SETTING_ALREADY_EXISTS,

    /**
     * 
     *                 An active ad group feed already exists for this place holder type.
     *               
     * 
     */
    AD_GROUP_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE,

    /**
     * 
     *                 An active campaign feed already exists for this place holder type.
     *               
     * 
     */
    CAMPAIGN_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE,

    /**
     * 
     *                 An active customer feed already exists for this place holder type.
     *               
     * 
     */
    CUSTOMER_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE,

    /**
     * 
     *                 Value is not within the accepted range.
     *               
     * 
     */
    VALUE_OUT_OF_RANGE,

    /**
     * 
     *                 Cannot simultaneously set sitelink field with final urls.
     *               
     * 
     */
    CANNOT_SET_WITH_FINAL_URLS,

    /**
     * 
     *                 Must set field with final urls.
     *               
     * 
     */
    CANNOT_SET_WITHOUT_FINAL_URLS,

    /**
     * 
     *                 Cannot simultaneously set sitelink url field with tracking url template.
     *               
     * 
     */
    CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE,

    /**
     * 
     *                 Phone number for a call extension is invalid.
     *               
     * 
     */
    INVALID_PHONE_NUMBER,

    /**
     * 
     *                 Phone number for a call extension is not supported for the given country code.
     *               
     * 
     */
    PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY,

    /**
     * 
     *                 A carrier specific number in short format is not allowed for call extensions.
     *               
     * 
     */
    CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED,

    /**
     * 
     *                 Premium rate numbers are not allowed for call extensions.
     *               
     * 
     */
    PREMIUM_RATE_NUMBER_NOT_ALLOWED,

    /**
     * 
     *                 Phone number type for a call extension is not allowed.
     *               
     * 
     */
    DISALLOWED_NUMBER_TYPE,

    /**
     * 
     *                 Phone number for a call extension does not meet domestic format requirements.
     *               
     * 
     */
    INVALID_DOMESTIC_PHONE_NUMBER_FORMAT,

    /**
     * 
     *                 Vanity phone numbers (i.e. those including letters) are not allowed for call extensions.
     *               
     * 
     */
    VANITY_PHONE_NUMBER_NOT_ALLOWED,

    /**
     * 
     *                 Country code provided for a call extension is invalid.
     *               
     * 
     */
    INVALID_COUNTRY_CODE,

    /**
     * 
     *                 Call conversion type id provided for a call extension is invalid.
     *               
     * 
     */
    INVALID_CALL_CONVERSION_TYPE_ID,

    /**
     * 
     *                 For a call extension, the customer is not whitelisted for call tracking.
     *               
     * 
     */
    CUSTOMER_NOT_WHITELISTED_FOR_CALLTRACKING,

    /**
     * 
     *                 Call tracking is not supported for the given country for a call extension.
     *               
     * 
     */
    CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY,

    /**
     * 
     *                 App id provided for an app extension is invalid.
     *               
     * 
     */
    INVALID_APP_ID,

    /**
     * 
     *                 Quotation marks present in the review text for a review extension.
     *               
     * 
     */
    QUOTES_IN_REVIEW_EXTENSION_SNIPPET,

    /**
     * 
     *                 Hyphen character present in the review text for a review extension.
     *               
     * 
     */
    HYPHENS_IN_REVIEW_EXTENSION_SNIPPET,

    /**
     * 
     *                 A blacklisted review source name or url was provided for a review extension.
     *               
     * 
     */
    REVIEW_EXTENSION_SOURCE_INELIGIBLE,

    /**
     * 
     *                 Review source name should not be found in the review text.
     *               
     * 
     */
    SOURCE_NAME_IN_REVIEW_EXTENSION_TEXT,

    /**
     * 
     *                 Field must be set.
     *               
     * 
     */
    MISSING_FIELD,

    /**
     * 
     *                 Inconsistent currency codes.
     *               
     * 
     */
    INCONSISTENT_CURRENCY_CODES,

    /**
     * 
     *                 Price extension cannot have duplicated headers.
     *               
     * 
     */
    PRICE_EXTENSION_HAS_DUPLICATED_HEADERS,

    /**
     * 
     *                 Price item cannot have duplicated header and description.
     *               
     * 
     */
    PRICE_ITEM_HAS_DUPLICATED_HEADER_AND_DESCRIPTION,

    /**
     * 
     *                 Price extension has too few items
     *               
     * 
     */
    PRICE_EXTENSION_HAS_TOO_FEW_ITEMS,

    /**
     * 
     *                 Price extension has too many items
     *               
     * 
     */
    PRICE_EXTENSION_HAS_TOO_MANY_ITEMS,

    /**
     * 
     *                 The input value is not currently supported.
     *               
     * 
     */
    UNSUPPORTED_VALUE,

    /**
     * 
     *                 The input value is not currently supported in the selected language of an extension.
     *               
     * 
     */
    UNSUPPORTED_VALUE_IN_SELECTED_LANGUAGE,

    /**
     * 
     *                 Unknown or unsupported device preference.
     *               
     * 
     */
    INVALID_DEVICE_PREFERENCE,

    /**
     * 
     *                 Invalid feed item schedule end time (i.e., endHour = 24 and endMinute != 0).
     *               
     * 
     */
    INVALID_SCHEDULE_END,

    /**
     * 
     *                 Date time zone does not match the account's time zone.
     *               
     * 
     */
    DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE,

    /**
     * 
     *                 Overlapping feed item schedule times (e.g., 7-10AM and 8-11AM) are not allowed.
     *               
     * 
     */
    OVERLAPPING_SCHEDULES,

    /**
     * 
     *                 Feed item schedule end time must be after start time.
     *               
     * 
     */
    SCHEDULE_END_NOT_AFTER_START,

    /**
     * 
     *                 There are too many feed item schedules per day.
     *               
     * 
     */
    TOO_MANY_SCHEDULES_PER_DAY,

    /**
     * 
     *                 Cannot edit the same extension feed item id twice.
     *               
     * 
     */
    DUPLICATE_EXTENSION_FEED_ITEM_EDIT,

    /**
     * 
     *                 Invalid structured snippet header.
     *               
     * 
     */
    INVALID_SNIPPETS_HEADER,

    /**
     * 
     *                 Phone number not supported with call tracking enabled for country.
     *               
     * 
     */
    PHONE_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNTRY,

    /**
     * 
     *                 Targeted adgroup's campaign does not match the targeted campaign.
     *               
     * 
     */
    CAMPAIGN_TARGETING_MISMATCH,

    /**
     * 
     *                 The feed used by the ExtensionSetting is deleted and cannot be operated on. Remove the
     *                 ExtensionSetting to allow a new one to be created using an active feed.
     *               
     * 
     */
    CANNOT_OPERATE_ON_DELETED_FEED,

    /**
     * 
     *                 Concrete sub type of ExtensionFeedItem is required for this operation.
     *               
     * 
     */
    CONCRETE_EXTENSION_TYPE_REQUIRED,

    /**
     * 
     *                 The matching function that links the extension feed to the customer, campaign, or ad group
     *                 is not compatible with the ExtensionSetting services.
     *               
     * 
     */
    INCOMPATIBLE_UNDERLYING_MATCHING_FUNCTION,
    START_DATE_AFTER_END_DATE,
    INVALID_PRICE_FORMAT,
    PROMOTION_INVALID_TIME,
    PROMOTION_CANNOT_SET_PERCENT_OFF_AND_MONEY_AMOUNT_OFF,
    PROMOTION_CANNOT_SET_PROMOTION_CODE_AND_ORDERS_OVER_AMOUNT,
    TOO_MANY_DECIMAL_PLACES_SPECIFIED,

    /**
     * 
     *                 The language code is not valid.
     *               
     * 
     */
    INVALID_LANGUAGE_CODE,

    /**
     * 
     *                 The language is not supported.
     *               
     * 
     */
    UNSUPPORTED_LANGUAGE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ExtensionSettingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

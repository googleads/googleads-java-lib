
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriterionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriterionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONCRETE_TYPE_REQUIRED"/>
 *     &lt;enumeration value="INVALID_EXCLUDED_CATEGORY"/>
 *     &lt;enumeration value="INVALID_KEYWORD_TEXT"/>
 *     &lt;enumeration value="KEYWORD_TEXT_TOO_LONG"/>
 *     &lt;enumeration value="KEYWORD_HAS_TOO_MANY_WORDS"/>
 *     &lt;enumeration value="KEYWORD_HAS_INVALID_CHARS"/>
 *     &lt;enumeration value="INVALID_PLACEMENT_URL"/>
 *     &lt;enumeration value="INVALID_USER_LIST"/>
 *     &lt;enumeration value="INVALID_USER_INTEREST"/>
 *     &lt;enumeration value="INVALID_FORMAT_FOR_PLACEMENT_URL"/>
 *     &lt;enumeration value="PLACEMENT_URL_IS_TOO_LONG"/>
 *     &lt;enumeration value="PLACEMENT_URL_HAS_ILLEGAL_CHAR"/>
 *     &lt;enumeration value="PLACEMENT_URL_HAS_MULTIPLE_SITES_IN_LINE"/>
 *     &lt;enumeration value="PLACEMENT_IS_NOT_AVAILABLE_FOR_TARGETING_OR_EXCLUSION"/>
 *     &lt;enumeration value="INVALID_VERTICAL_PATH"/>
 *     &lt;enumeration value="YOUTUBE_VERTICAL_CHANNEL_DEPRECATED"/>
 *     &lt;enumeration value="YOUTUBE_DEMOGRAPHIC_CHANNEL_DEPRECATED"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_CRITERIA_TYPE"/>
 *     &lt;enumeration value="CANNOT_ADD_CRITERIA_TYPE"/>
 *     &lt;enumeration value="INVALID_PRODUCT_FILTER"/>
 *     &lt;enumeration value="PRODUCT_FILTER_TOO_LONG"/>
 *     &lt;enumeration value="CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_ONLY_CAMPAIGNS"/>
 *     &lt;enumeration value="INVALID_CRITERION_ID"/>
 *     &lt;enumeration value="CANNOT_TARGET_CRITERION"/>
 *     &lt;enumeration value="CRITERION_ID_AND_TYPE_MISMATCH"/>
 *     &lt;enumeration value="INVALID_PROXIMITY_RADIUS"/>
 *     &lt;enumeration value="INVALID_PROXIMITY_RADIUS_UNITS"/>
 *     &lt;enumeration value="INVALID_STREETADDRESS_LENGTH"/>
 *     &lt;enumeration value="INVALID_CITYNAME_LENGTH"/>
 *     &lt;enumeration value="INVALID_REGIONCODE_LENGTH"/>
 *     &lt;enumeration value="INVALID_REGIONNAME_LENGTH"/>
 *     &lt;enumeration value="INVALID_POSTALCODE_LENGTH"/>
 *     &lt;enumeration value="INVALID_COUNTRY_CODE"/>
 *     &lt;enumeration value="INVALID_LATITUDE"/>
 *     &lt;enumeration value="INVALID_LONGITUDE"/>
 *     &lt;enumeration value="PROXIMITY_GEOPOINT_AND_ADDRESS_BOTH_CANNOT_BE_NULL"/>
 *     &lt;enumeration value="INVALID_PROXIMITY_ADDRESS"/>
 *     &lt;enumeration value="AD_SCHEDULE_TIME_INTERVALS_OVERLAP"/>
 *     &lt;enumeration value="AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS"/>
 *     &lt;enumeration value="AD_SCHEDULE_INVALID_TIME_INTERVAL"/>
 *     &lt;enumeration value="AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT"/>
 *     &lt;enumeration value="AD_SCHEDULE_CRITERION_ID_MISMATCHING_FIELDS"/>
 *     &lt;enumeration value="CANNOT_BID_MODIFY_CRITERION_TYPE"/>
 *     &lt;enumeration value="CANNOT_BID_MODIFY_NEGATIVE_CRITERION"/>
 *     &lt;enumeration value="CANNOT_ADD_BID_MODIFIER_FOR_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="CANNOT_BID_MODIFY_NON_ENHANCED_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_BID_MODIFY_DESKTOP"/>
 *     &lt;enumeration value="ACCOUNT_INELIGIBLE_FOR_CRITERIA_TYPE"/>
 *     &lt;enumeration value="CRITERIA_TYPE_INVALID_FOR_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="CANNOT_ATTACH_CRITERIA_BIDDING_STRATEGY_ON_CONTENT_NETWORK_ONLY_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_CRITERION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CriterionError.Reason")
@XmlEnum
public enum CriterionErrorReason {


    /**
     * 
     *                 Concrete type of criterion is required for ADD and SET operations.
     *               
     * 
     */
    CONCRETE_TYPE_REQUIRED,

    /**
     * 
     *                 The category requested for exclusion is invalid.
     *               
     * 
     */
    INVALID_EXCLUDED_CATEGORY,

    /**
     * 
     *                 Invalid keyword criteria text.
     *               
     * 
     */
    INVALID_KEYWORD_TEXT,

    /**
     * 
     *                 Keyword text should be less than 80 chars.
     *               
     * 
     */
    KEYWORD_TEXT_TOO_LONG,

    /**
     * 
     *                 Keyword text has too many words.
     *               
     * 
     */
    KEYWORD_HAS_TOO_MANY_WORDS,

    /**
     * 
     *                 Keyword text has invalid characters or symbols.
     *               
     * 
     */
    KEYWORD_HAS_INVALID_CHARS,

    /**
     * 
     *                 Invalid placement URL.
     *               
     * 
     */
    INVALID_PLACEMENT_URL,

    /**
     * 
     *                 Invalid user list criterion.
     *               
     * 
     */
    INVALID_USER_LIST,

    /**
     * 
     *                 Invalid user interest criterion.
     *               
     * 
     */
    INVALID_USER_INTEREST,

    /**
     * 
     *                 Placement URL has wrong format.
     *               
     * 
     */
    INVALID_FORMAT_FOR_PLACEMENT_URL,

    /**
     * 
     *                 Placement URL is too long.
     *               
     * 
     */
    PLACEMENT_URL_IS_TOO_LONG,

    /**
     * 
     *                 Indicates the URL contains an illegal character.
     *               
     * 
     */
    PLACEMENT_URL_HAS_ILLEGAL_CHAR,

    /**
     * 
     *                 Indicates the URL contains multiple comma separated URLs.
     *               
     * 
     */
    PLACEMENT_URL_HAS_MULTIPLE_SITES_IN_LINE,

    /**
     * 
     *                 Indicates the domain is blacklisted.
     *               
     * 
     */
    PLACEMENT_IS_NOT_AVAILABLE_FOR_TARGETING_OR_EXCLUSION,

    /**
     * 
     *                 Invalid vertical path.
     *               
     * 
     */
    INVALID_VERTICAL_PATH,

    /**
     * 
     *                 Indicates the placement is a YouTube vertical channel, which is no longer supported.
     *               
     * 
     */
    YOUTUBE_VERTICAL_CHANNEL_DEPRECATED,

    /**
     * 
     *                 Indicates the placement is a YouTube demographic channel, which is no longer supported.
     *               
     * 
     */
    YOUTUBE_DEMOGRAPHIC_CHANNEL_DEPRECATED,

    /**
     * 
     *                 Criteria type can not be excluded by the customer,
     *                 like AOL account type cannot target site type criteria.
     *               
     * 
     */
    CANNOT_EXCLUDE_CRITERIA_TYPE,

    /**
     * 
     *                 Criteria type can not be targeted.
     *               
     * 
     */
    CANNOT_ADD_CRITERIA_TYPE,

    /**
     * 
     *                 Product filter in the product criteria has invalid characters.
     *                 Operand and the argument in the filter can not have "==" or "&+".
     *               
     * 
     */
    INVALID_PRODUCT_FILTER,

    /**
     * 
     *                 Product filter in the product criteria is translated to a string as
     *                 operand1==argument1&+operand2==argument2, maximum allowed length for
     *                 the string is 255 chars.
     *               
     * 
     */
    PRODUCT_FILTER_TOO_LONG,

    /**
     * 
     *                 Not allowed to add display only UserLists to search only campaigns.
     *               
     * 
     */
    CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_ONLY_CAMPAIGNS,

    /**
     * 
     *                 The CriterionId does not exist or is of the incorrect type.
     *               
     * 
     */
    INVALID_CRITERION_ID,

    /**
     * 
     *                 The Criterion is not allowed to be targeted.
     *               
     * 
     */
    CANNOT_TARGET_CRITERION,

    /**
     * 
     *                 The CriterionId is not valid for the type.
     *               
     * 
     */
    CRITERION_ID_AND_TYPE_MISMATCH,

    /**
     * 
     *                 Distance for the radius for the proximity criterion is invalid.
     *               
     * 
     */
    INVALID_PROXIMITY_RADIUS,

    /**
     * 
     *                 Units for the distance for the radius for the proximity criterion is invalid.
     *               
     * 
     */
    INVALID_PROXIMITY_RADIUS_UNITS,

    /**
     * 
     *                 Street address is too short.
     *               
     * 
     */
    INVALID_STREETADDRESS_LENGTH,

    /**
     * 
     *                 City name in the address is too short.
     *               
     * 
     */
    INVALID_CITYNAME_LENGTH,

    /**
     * 
     *                 Region code in the address is too short.
     *               
     * 
     */
    INVALID_REGIONCODE_LENGTH,

    /**
     * 
     *                 Region name in the address is not valid.
     *               
     * 
     */
    INVALID_REGIONNAME_LENGTH,

    /**
     * 
     *                 Postal code in the address is not valid.
     *               
     * 
     */
    INVALID_POSTALCODE_LENGTH,

    /**
     * 
     *                 Country code in the address is not valid.
     *               
     * 
     */
    INVALID_COUNTRY_CODE,

    /**
     * 
     *                 Latitude for the GeoPoint is not valid.
     *               
     * 
     */
    INVALID_LATITUDE,

    /**
     * 
     *                 Longitude for the GeoPoint is not valid.
     *               
     * 
     */
    INVALID_LONGITUDE,

    /**
     * 
     *                 The Proximity input is not valid. Both address and geoPoint cannot be null.
     *               
     * 
     */
    PROXIMITY_GEOPOINT_AND_ADDRESS_BOTH_CANNOT_BE_NULL,

    /**
     * 
     *                 The Proximity address cannot be geocoded to a valid lat/long.
     *               
     * 
     */
    INVALID_PROXIMITY_ADDRESS,

    /**
     * 
     *                 Time interval in the AdSchedule overlaps with another AdSchedule.
     *               
     * 
     */
    AD_SCHEDULE_TIME_INTERVALS_OVERLAP,

    /**
     * 
     *                 AdSchedule time interval cannot span multiple days.
     *               
     * 
     */
    AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS,

    /**
     * 
     *                 AdSchedule time interval specified is invalid,
     *                 endTime cannot be earlier than startTime.
     *               
     * 
     */
    AD_SCHEDULE_INVALID_TIME_INTERVAL,

    /**
     * 
     *                 The number of AdSchedule entries in a day exceeds the limit.
     *               
     * 
     */
    AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT,

    /**
     * 
     *                 CriteriaId does not match the interval of the AdSchedule specified.
     *               
     * 
     */
    AD_SCHEDULE_CRITERION_ID_MISMATCHING_FIELDS,

    /**
     * 
     *                 Cannot set bid modifier for this criterion type.
     *               
     * 
     */
    CANNOT_BID_MODIFY_CRITERION_TYPE,

    /**
     * 
     *                 Cannot set bid modifier for a negative criterion.
     *               
     * 
     */
    CANNOT_BID_MODIFY_NEGATIVE_CRITERION,

    /**
     * 
     *                 Campaign's bidding strategy does not support bid modifiers.
     *               
     * 
     */
    CANNOT_ADD_BID_MODIFIER_FOR_BIDDING_STRATEGY,

    /**
     * 
     *                 Only enhanced campaigns support bid modifier.
     *               
     * 
     */
    CANNOT_BID_MODIFY_NON_ENHANCED_CAMPAIGN,

    /**
     * 
     *                 Cannot set bid modifier for Desktop criterion.
     *               
     * 
     */
    CANNOT_BID_MODIFY_DESKTOP,

    /**
     * 
     *                 The account may not use the requested criteria type. For example, some
     *                 accounts are restricted to keywords only.
     *               
     * 
     */
    ACCOUNT_INELIGIBLE_FOR_CRITERIA_TYPE,

    /**
     * 
     *                 The requested criteria type cannot be used with campaign or ad group bidding strategy.
     *               
     * 
     */
    CRITERIA_TYPE_INVALID_FOR_BIDDING_STRATEGY,

    /**
     * 
     *                 Cannot attach bidding strategy for campaigns opted in to content network only.
     *               
     * 
     */
    CANNOT_ATTACH_CRITERIA_BIDDING_STRATEGY_ON_CONTENT_NETWORK_ONLY_CAMPAIGN,

    /**
     * 
     *                 The Criterion is not allowed to be excluded.
     *               
     * 
     */
    CANNOT_EXCLUDE_CRITERION,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CriterionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

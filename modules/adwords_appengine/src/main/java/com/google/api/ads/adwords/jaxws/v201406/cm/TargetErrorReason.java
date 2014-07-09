
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD_SCHEDULE_ADVANCED_INCOMPATIBLE_WITH_CONVERSION_OPTIMIZER"/>
 *     &lt;enumeration value="AD_SCHEDULE_BID_MULTIPLIER_MALFORMED"/>
 *     &lt;enumeration value="AD_SCHEDULE_BID_MULTIPLIER_TOO_BIG"/>
 *     &lt;enumeration value="AD_SCHEDULE_BID_MULTIPLIER_TOO_SMALL"/>
 *     &lt;enumeration value="AD_SCHEDULE_BID_MULTIPLIER_TOO_MANY_FRACTION_DIGITS"/>
 *     &lt;enumeration value="AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT"/>
 *     &lt;enumeration value="AD_SCHEDULE_EXCEEDS_PAST_END_OF_WEEK"/>
 *     &lt;enumeration value="AD_SCHEDULE_INCOMPATIBILITY"/>
 *     &lt;enumeration value="AD_SCHEDULE_INCOMPATIBLE_WITH_BUDGET_OPTIMIZER"/>
 *     &lt;enumeration value="AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS"/>
 *     &lt;enumeration value="AD_SCHEDULE_INVALID_DAY_OF_THE_WEEK"/>
 *     &lt;enumeration value="AD_SCHEDULE_INVALID_TIME_INTERVAL"/>
 *     &lt;enumeration value="AD_SCHEDULE_NO_INTERVALS_WHILE_ENABLED"/>
 *     &lt;enumeration value="AD_SCHEDULE_NOT_MULTIPLE_OF_15_MINUTES"/>
 *     &lt;enumeration value="AD_SCHEDULE_TIME_INTERVALS_OVERLAP"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_CITY"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_IF_NOT_TARGETED"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_METRO"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_PROVINCE"/>
 *     &lt;enumeration value="CANNOT_OPT_OUT_GOOGLE_SEARCH_WHILE_BID_TO_POSITION_ENABLE"/>
 *     &lt;enumeration value="CANNOT_TARGET_AGE_WITHOUT_GENDER"/>
 *     &lt;enumeration value="CANNOT_TARGET_CITY"/>
 *     &lt;enumeration value="CANNOT_TARGET_CONTENT_CONTEXTUAL_WITHOUT_CONTENT_NETWORK"/>
 *     &lt;enumeration value="CANNOT_MODIFY_CONTENT_CONTEXTUAL"/>
 *     &lt;enumeration value="CANNOT_TARGET_COUNTRY"/>
 *     &lt;enumeration value="CANNOT_TARGET_COVERAGE"/>
 *     &lt;enumeration value="CANNOT_TARGET_GENDER_WITHOUT_AGE"/>
 *     &lt;enumeration value="CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_CHANGE_GOOGLE_SEARCH_SETTING"/>
 *     &lt;enumeration value="CANNOT_TARGET_LANGUAGE"/>
 *     &lt;enumeration value="CANNOT_TARGET_METRO"/>
 *     &lt;enumeration value="CANNOT_TARGET_MOBILE_CARRIER"/>
 *     &lt;enumeration value="CANNOT_TARGET_PROVINCE"/>
 *     &lt;enumeration value="CANNOT_TARGET_SEARCH_SYNDICATION_WITHOUT_GOOGLE_SEARCH"/>
 *     &lt;enumeration value="CANNOT_TARGET_SYNDICATABLE_TYPES"/>
 *     &lt;enumeration value="CANNOT_TARGET_THE_SAME_TARGET_LIST_TYPE_MULTIPLE_TIMES"/>
 *     &lt;enumeration value="DEMOGRAPHIC_BID_MODIFIER_SHOULD_BE_IN_BETWEEN_0_AND_500"/>
 *     &lt;enumeration value="INVALID_CITY_CODE"/>
 *     &lt;enumeration value="INVALID_CITYNAME_LENGTH"/>
 *     &lt;enumeration value="INVALID_EXCLUDED_POLYGON_TARGET"/>
 *     &lt;enumeration value="INVALID_EXCLUDED_PROXIMITY_TARGET"/>
 *     &lt;enumeration value="INVALID_LANGUAGE_CODE"/>
 *     &lt;enumeration value="INVALID_LATITUDE"/>
 *     &lt;enumeration value="INVALID_LONGITUDE"/>
 *     &lt;enumeration value="INVALID_METRO_CODE"/>
 *     &lt;enumeration value="INVALID_MOBILE_CARRIER"/>
 *     &lt;enumeration value="INVALID_MOBILE_PLATFORM"/>
 *     &lt;enumeration value="INVALID_POSTALCODE_LENGTH"/>
 *     &lt;enumeration value="INVALID_PROVINCE_CODE"/>
 *     &lt;enumeration value="INVALID_PROXIMITY_RADIUS"/>
 *     &lt;enumeration value="INVALID_REGIONCODE_LENGTH"/>
 *     &lt;enumeration value="INVALID_REGIONNAME_LENGTH"/>
 *     &lt;enumeration value="INVALID_STREETADDRESS_LENGTH"/>
 *     &lt;enumeration value="MULTIPLE_OCCURRENCES_OF_SAME_TARGET"/>
 *     &lt;enumeration value="POLYGON_DUPLICATE_VERTICES"/>
 *     &lt;enumeration value="POLYGON_EDGES_INTERSECT"/>
 *     &lt;enumeration value="POLYGON_TOO_FEW_VERTICES"/>
 *     &lt;enumeration value="POLYGON_TOO_MANY_VERTICES"/>
 *     &lt;enumeration value="POLYGON_TOO_LARGE"/>
 *     &lt;enumeration value="TARGETING_VALIDATION_FAILED"/>
 *     &lt;enumeration value="TARGETING_CROSS_COUNTRY_REGIONAL"/>
 *     &lt;enumeration value="TARGETING_EXCLUSION_NOT_SUPPORTED"/>
 *     &lt;enumeration value="TARGETING_INCOMPATIBLE_LOCATION_TYPES"/>
 *     &lt;enumeration value="TARGETING_NOT_SUPPORTED"/>
 *     &lt;enumeration value="TARGETING_TOO_MANY_REGIONS"/>
 *     &lt;enumeration value="TOO_MANY_EXCLUDED_LOCATIONS"/>
 *     &lt;enumeration value="TOO_MANY_TARGETED_LOCATIONS"/>
 *     &lt;enumeration value="WARNING_MAY_NOW_REQUIRE_CHINESE_APPROVAL"/>
 *     &lt;enumeration value="WARNING_NOW_REQUIRES_CHINESE_APPROVAL"/>
 *     &lt;enumeration value="WARNING_NOW_TARGETS_CHINA"/>
 *     &lt;enumeration value="WARNING_NOW_TARGETS_CHINESE"/>
 *     &lt;enumeration value="TARGET_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetError.Reason")
@XmlEnum
public enum TargetErrorReason {


    /**
     * 
     *                 Cannot enable advanced ad scheduling for a conversion optimizer campaign.
     *               
     * 
     */
    AD_SCHEDULE_ADVANCED_INCOMPATIBLE_WITH_CONVERSION_OPTIMIZER,

    /**
     * 
     *                 Bid multiplier could not be parsed as a number; it was malformed.
     *               
     * 
     */
    AD_SCHEDULE_BID_MULTIPLIER_MALFORMED,

    /**
     * 
     *                 Bid multiplier was too big.
     *               
     * 
     */
    AD_SCHEDULE_BID_MULTIPLIER_TOO_BIG,

    /**
     * 
     *                 Bid multiplier was too small.
     *               
     * 
     */
    AD_SCHEDULE_BID_MULTIPLIER_TOO_SMALL,

    /**
     * 
     *                 Bid multiplier has too many decimal digits.
     *               
     * 
     */
    AD_SCHEDULE_BID_MULTIPLIER_TOO_MANY_FRACTION_DIGITS,

    /**
     * 
     *                 The number of intervals per day limit was exceeded.
     *               
     * 
     */
    AD_SCHEDULE_EXCEEDED_INTERVALS_PER_DAY_LIMIT,

    /**
     * 
     *                 The required times must be on or before the end of the week (Sunday at 11:45pm).
     *               
     * 
     */
    AD_SCHEDULE_EXCEEDS_PAST_END_OF_WEEK,

    /**
     * 
     *                 Cannot enable ad scheduling for the campaign.
     *               
     * 
     */
    AD_SCHEDULE_INCOMPATIBILITY,

    /**
     * 
     *                 Cannot enable ad scheduling for a budget optimizer campaign.
     *               
     * 
     */
    AD_SCHEDULE_INCOMPATIBLE_WITH_BUDGET_OPTIMIZER,

    /**
     * 
     *                 The start and end times are not on the same day.
     *               
     * 
     */
    AD_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAYS,

    /**
     * 
     *                 Integer representation day of the week is not within proper range
     *               
     * 
     */
    AD_SCHEDULE_INVALID_DAY_OF_THE_WEEK,

    /**
     * 
     *                 The start time is not less than the end time.
     *               
     * 
     */
    AD_SCHEDULE_INVALID_TIME_INTERVAL,

    /**
     * 
     *                 Enabled ad schedule does not have at least one interval.
     *               
     * 
     */
    AD_SCHEDULE_NO_INTERVALS_WHILE_ENABLED,

    /**
     * 
     *                 The required times must be a multiple of 15 minutes.
     *               
     * 
     */
    AD_SCHEDULE_NOT_MULTIPLE_OF_15_MINUTES,

    /**
     * 
     *                 Two time intervals overlap each other.
     *               
     * 
     */
    AD_SCHEDULE_TIME_INTERVALS_OVERLAP,

    /**
     * 
     *                 Cannot exclude city.
     *               
     * 
     */
    CANNOT_EXCLUDE_CITY,

    /**
     * 
     *                 Cannot exclude a location that is not being targeted by an enclosing location.
     *               
     * 
     */
    CANNOT_EXCLUDE_IF_NOT_TARGETED,

    /**
     * 
     *                 Cannot exclude metro.
     *               
     * 
     */
    CANNOT_EXCLUDE_METRO,

    /**
     * 
     *                 Cannot exclude province.
     *               
     * 
     */
    CANNOT_EXCLUDE_PROVINCE,

    /**
     * 
     *                 Cannot opt out from Google Search while position preference enabled.
     *               
     * 
     */
    CANNOT_OPT_OUT_GOOGLE_SEARCH_WHILE_BID_TO_POSITION_ENABLE,

    /**
     * 
     *                 Cannot target an age segment without targeting at least one gender segment.
     *               
     * 
     */
    CANNOT_TARGET_AGE_WITHOUT_GENDER,

    /**
     * 
     *                 Cannot target city.
     *               
     * 
     */
    CANNOT_TARGET_CITY,

    /**
     * 
     *                 Cannot cover content contextual without content network.
     *               
     * 
     */
    CANNOT_TARGET_CONTENT_CONTEXTUAL_WITHOUT_CONTENT_NETWORK,

    /**
     * 
     *                 Cannot modify content contextual on campaigns setup to use AdGroup level targeting settings.
     *                 This is specified using {@link TargetRestrictSetting}. Note that
     *                 {@link TargetRestrictSetting} is set automatically for all campaigns created after version
     *                 v201206.
     *               
     * 
     */
    CANNOT_MODIFY_CONTENT_CONTEXTUAL,

    /**
     * 
     *                 Cannot target country.
     *               
     * 
     */
    CANNOT_TARGET_COUNTRY,

    /**
     * 
     *                 The requested network coverage modification is prohibited.
     *               
     * 
     */
    CANNOT_TARGET_COVERAGE,

    /**
     * 
     *                 Cannot target a gender segment without targeting at least one age segment.
     *               
     * 
     */
    CANNOT_TARGET_GENDER_WITHOUT_AGE,

    /**
     * 
     *                 Cannot target Google Search network for a CPM campaign.
     *               
     * 
     */
    CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN,

    /**
     * 
     *                 Cannot change Google Search network setting.
     *               
     * 
     */
    CANNOT_CHANGE_GOOGLE_SEARCH_SETTING,

    /**
     * 
     *                 Specified language cannot be targeted.
     *               
     * 
     */
    CANNOT_TARGET_LANGUAGE,

    /**
     * 
     *                 Cannot target metro.
     *               
     * 
     */
    CANNOT_TARGET_METRO,

    /**
     * 
     *                 Specified Mobile carrier cannot be targeted
     *               
     * 
     */
    CANNOT_TARGET_MOBILE_CARRIER,

    /**
     * 
     *                 Cannot target province.
     *               
     * 
     */
    CANNOT_TARGET_PROVINCE,

    /**
     * 
     *                 Cannot cover search syndication network without google search network.
     *               
     * 
     */
    CANNOT_TARGET_SEARCH_SYNDICATION_WITHOUT_GOOGLE_SEARCH,

    /**
     * 
     *                 Cannot target any syndicatable types.
     *               
     * 
     */
    CANNOT_TARGET_SYNDICATABLE_TYPES,

    /**
     * 
     *                 Cannot target the same target list type twice.
     *               
     * 
     */
    CANNOT_TARGET_THE_SAME_TARGET_LIST_TYPE_MULTIPLE_TIMES,

    /**
     * 
     *                 The bid modifier of a demographic target should be in the [0, 500] range.
     *               
     * 
     */
    DEMOGRAPHIC_BID_MODIFIER_SHOULD_BE_IN_BETWEEN_0_AND_500,

    /**
     * 
     *                 A city could not be matched with the provided input.
     *               
     * 
     */
    INVALID_CITY_CODE,

    /**
     * 
     *                 CityName is too long.
     *               
     * 
     */
    INVALID_CITYNAME_LENGTH,

    /**
     * 
     *                 Polygon targets cannot be excluded.
     *               
     * 
     */
    INVALID_EXCLUDED_POLYGON_TARGET,

    /**
     * 
     *                 Proximity targets cannot be excluded
     *               
     * 
     */
    INVALID_EXCLUDED_PROXIMITY_TARGET,

    /**
     * 
     *                 Language code specified is invalid.
     *               
     * 
     */
    INVALID_LANGUAGE_CODE,

    /**
     * 
     *                 Latitude supplied with the target is invalid.
     *               
     * 
     */
    INVALID_LATITUDE,

    /**
     * 
     *                 Longitude supplied with the target is invalid.
     *               
     * 
     */
    INVALID_LONGITUDE,

    /**
     * 
     *                 Metro code specified is invalid.
     *               
     * 
     */
    INVALID_METRO_CODE,

    /**
     * 
     *                 Mobile Carrier specified is invalid.
     *               
     * 
     */
    INVALID_MOBILE_CARRIER,

    /**
     * 
     *                 Mobile Platform is invalid.
     *               
     * 
     */
    INVALID_MOBILE_PLATFORM,

    /**
     * 
     *                 PostalCode is too long.
     *               
     * 
     */
    INVALID_POSTALCODE_LENGTH,

    /**
     * 
     *                 Province code specified is invalid.
     *               
     * 
     */
    INVALID_PROVINCE_CODE,

    /**
     * 
     *                 Radius supplied with the proximity target is invalid.
     *               
     * 
     */
    INVALID_PROXIMITY_RADIUS,

    /**
     * 
     *                 RegionCode is too long.
     *               
     * 
     */
    INVALID_REGIONCODE_LENGTH,

    /**
     * 
     *                 RegionName is too long.
     *               
     * 
     */
    INVALID_REGIONNAME_LENGTH,

    /**
     * 
     *                 StreetAddress is too long.
     *               
     * 
     */
    INVALID_STREETADDRESS_LENGTH,

    /**
     * 
     *                 Multiple occurrences of the same target were encountered.
     *               
     * 
     */
    MULTIPLE_OCCURRENCES_OF_SAME_TARGET,

    /**
     * 
     *                 A PolygonTarget point is duplicated.
     *               
     * 
     */
    POLYGON_DUPLICATE_VERTICES,

    /**
     * 
     *                 A PolygonTarget has edges that intersect.
     *               
     * 
     */
    POLYGON_EDGES_INTERSECT,

    /**
     * 
     *                 A PolygonTarget has too few vertices.
     *               
     * 
     */
    POLYGON_TOO_FEW_VERTICES,

    /**
     * 
     *                 A polygonTarget has too many vertices. (more than 100)
     *               
     * 
     */
    POLYGON_TOO_MANY_VERTICES,

    /**
     * 
     *                 A PolygonTarget is too large.
     *               
     * 
     */
    POLYGON_TOO_LARGE,

    /**
     * 
     *                 A validation error was encountered; however,
     *                 a more detailed TargetingValidationError usually has already been provided.
     *               
     * 
     */
    TARGETING_VALIDATION_FAILED,

    /**
     * 
     *                 Region spanning multiple countries.
     *               
     * 
     */
    TARGETING_CROSS_COUNTRY_REGIONAL,

    /**
     * 
     *                 The given exclusion is not supported.
     *               
     * 
     */
    TARGETING_EXCLUSION_NOT_SUPPORTED,

    /**
     * 
     *                 The location types are incompatible for targeting.
     *               
     * 
     */
    TARGETING_INCOMPATIBLE_LOCATION_TYPES,

    /**
     * 
     *                 The targeting is not supported.
     *               
     * 
     */
    TARGETING_NOT_SUPPORTED,

    /**
     * 
     *                 There are too many regions.
     *               
     * 
     */
    TARGETING_TOO_MANY_REGIONS,

    /**
     * 
     *                 There are too many excluded locations.
     *               
     * 
     */
    TOO_MANY_EXCLUDED_LOCATIONS,

    /**
     * 
     *                 There are too many targeted locations.
     *               
     * 
     */
    TOO_MANY_TARGETED_LOCATIONS,

    /**
     * 
     *                 This is for warnings which is currently not being passed back to the client.
     *               
     * 
     */
    WARNING_MAY_NOW_REQUIRE_CHINESE_APPROVAL,

    /**
     * 
     *                 This is for warnings which is currently not being passed back to the client.
     *               
     * 
     */
    WARNING_NOW_REQUIRES_CHINESE_APPROVAL,

    /**
     * 
     *                 This is for warnings which is currently not being passed back to the client.
     *               
     * 
     */
    WARNING_NOW_TARGETS_CHINA,

    /**
     * 
     *                 This is for warnings which is currently not being passed back to the client.
     *               
     * 
     */
    WARNING_NOW_TARGETS_CHINESE,

    /**
     * 
     *                 The target error is unknown.
     *               
     * 
     */
    TARGET_ERROR;

    public String value() {
        return name();
    }

    public static TargetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

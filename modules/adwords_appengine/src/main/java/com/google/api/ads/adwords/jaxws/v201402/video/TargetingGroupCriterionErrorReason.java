
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetingGroupCriterionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetingGroupCriterionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="WEBSITE_NOT_ALLOWED_FOR_NETWORK"/>
 *     &lt;enumeration value="NETWORK_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_KEYWORD_TEXT"/>
 *     &lt;enumeration value="KEYWORD_TEXT_TOO_LONG"/>
 *     &lt;enumeration value="KEYWORD_HAS_TOO_MANY_WORDS"/>
 *     &lt;enumeration value="KEYWORD_HAS_INVALID_CHARS"/>
 *     &lt;enumeration value="INVALID_WEBSITE_URL"/>
 *     &lt;enumeration value="INVALID_FORMAT_FOR_WEBSITE_URL"/>
 *     &lt;enumeration value="WEBSITE_URL_IS_TOO_LONG"/>
 *     &lt;enumeration value="WEBSITE_URL_HAS_ILLEGAL_CHAR"/>
 *     &lt;enumeration value="WEBSITE_URL_HAS_MULTIPLE_SITES_IN_LINE"/>
 *     &lt;enumeration value="WEBSITE_DOMAIN_BLACKLISTED"/>
 *     &lt;enumeration value="INVALID_VIDEO_ID"/>
 *     &lt;enumeration value="INVALID_CHANNEL_ID"/>
 *     &lt;enumeration value="INVALID_VERTICAL_PATH"/>
 *     &lt;enumeration value="INVALID_USER_LIST_ID"/>
 *     &lt;enumeration value="KEYWORD_UNSUPPORTED"/>
 *     &lt;enumeration value="INVALID_TARGETING_GROUP_ID"/>
 *     &lt;enumeration value="INVALID_CRITERION_ID"/>
 *     &lt;enumeration value="IMMUTABLE_NEGATIVE"/>
 *     &lt;enumeration value="WEBSITE_URL_HAS_SCHEMA"/>
 *     &lt;enumeration value="USER_ID_OF_CHANNEL_MISSING"/>
 *     &lt;enumeration value="TOO_MANY_CRITERIONS_PER_TARGETING_GROUP"/>
 *     &lt;enumeration value="INVALID_STATUS"/>
 *     &lt;enumeration value="MUTATING_REPORTED_TGC"/>
 *     &lt;enumeration value="UNSUPPORTED_BID_OVERRIDE"/>
 *     &lt;enumeration value="CANNOT_TARGET_AND_EXCLUDE"/>
 *     &lt;enumeration value="CANNOT_REMOVE_CRITERION"/>
 *     &lt;enumeration value="CANNOT_TARGET_CRITERION"/>
 *     &lt;enumeration value="CANNOT_TARGET_OBSOLETE_CRITERION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetingGroupCriterionError.Reason")
@XmlEnum
public enum TargetingGroupCriterionErrorReason {


    /**
     * 
     *                 Default error.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Combination of website url and network is invalid.
     *               
     * 
     */
    WEBSITE_NOT_ALLOWED_FOR_NETWORK,

    /**
     * 
     *                 A targeting group criterion is targeted to a network which is not supported.
     *               
     * 
     */
    NETWORK_NOT_SUPPORTED,

    /**
     * 
     *                 A keyword (potentially inside a keyword theme) has invalid text.
     *               
     * 
     */
    INVALID_KEYWORD_TEXT,

    /**
     * 
     *                 A keyword (potentially inside a keyword theme) has text too long.
     *               
     * 
     */
    KEYWORD_TEXT_TOO_LONG,

    /**
     * 
     *                 A keyword (potentially inside a keyword theme) has text too many keywords.
     *               
     * 
     */
    KEYWORD_HAS_TOO_MANY_WORDS,

    /**
     * 
     *                 A keyword (potentially inside a keyword theme) has invalid chars.
     *               
     * 
     */
    KEYWORD_HAS_INVALID_CHARS,

    /**
     * 
     *                 A website has invalid url.
     *               
     * 
     */
    INVALID_WEBSITE_URL,

    /**
     * 
     *                 A website has wrong format.
     *               
     * 
     */
    INVALID_FORMAT_FOR_WEBSITE_URL,

    /**
     * 
     *                 A website has url too long.
     *               
     * 
     */
    WEBSITE_URL_IS_TOO_LONG,

    /**
     * 
     *                 A website has illegal chars.
     *               
     * 
     */
    WEBSITE_URL_HAS_ILLEGAL_CHAR,

    /**
     * 
     *                 A website has multiple comma separated urls.
     *               
     * 
     */
    WEBSITE_URL_HAS_MULTIPLE_SITES_IN_LINE,

    /**
     * 
     *                 A website has blacklisted domain.
     *               
     * 
     */
    WEBSITE_DOMAIN_BLACKLISTED,

    /**
     * 
     *                 Invalid video id.
     *               
     * 
     */
    INVALID_VIDEO_ID,

    /**
     * 
     *                 Invalid channel id.
     *               
     * 
     */
    INVALID_CHANNEL_ID,

    /**
     * 
     *                 Invalid vertical.
     *               
     * 
     */
    INVALID_VERTICAL_PATH,

    /**
     * 
     *                 Invalid user list id.
     *               
     * 
     */
    INVALID_USER_LIST_ID,

    /**
     * 
     *                 Tried to select keyword when it is unsupported for TGCs.
     *               
     * 
     */
    KEYWORD_UNSUPPORTED,

    /**
     * 
     *                 Targeting group id not specified.
     *               
     * 
     */
    INVALID_TARGETING_GROUP_ID,

    /**
     * 
     *                 Criterion id is specified on ADD or not specified on SET/REMOVE.
     *               
     * 
     */
    INVALID_CRITERION_ID,

    /**
     * 
     *                 Negative criterions cannot be modified.
     *               
     * 
     */
    IMMUTABLE_NEGATIVE,

    /**
     * 
     *                 Website urls should not include schema
     *               
     * 
     */
    WEBSITE_URL_HAS_SCHEMA,

    /**
     * 
     *                 The user id of a youtube channel must be set if you want to target it
     *               
     * 
     */
    USER_ID_OF_CHANNEL_MISSING,

    /**
     * 
     *                 This operation will result in the video ad having more than the maximum
     *                 number of allowed criterions a targeting group.
     *               
     * 
     */
    TOO_MANY_CRITERIONS_PER_TARGETING_GROUP,

    /**
     * 
     *                 Attempt to set an invalid status for a criteria, e.g. DELETED on ADD.
     *               
     * 
     */
    INVALID_STATUS,

    /**
     * 
     *                 Attempt to call mutate operation with a {@link ReportedTargetingGroupCriterion}, which is
     *                 read-only.
     *               
     * 
     */
    MUTATING_REPORTED_TGC,

    /**
     * 
     *                 Attempted to set a bid override for a criterion that doesn't support it.
     *               
     * 
     */
    UNSUPPORTED_BID_OVERRIDE,

    /**
     * 
     *                 Cannot target and exclude the same criterion at once.
     *               
     * 
     */
    CANNOT_TARGET_AND_EXCLUDE,

    /**
     * 
     *                 Adding or removing platform criteria from enhanced campaigns is prohibited.
     *               
     * 
     */
    CANNOT_REMOVE_CRITERION,

    /**
     * 
     *                 Criterion is not allowed to be targeted.
     *               
     * 
     */
    CANNOT_TARGET_CRITERION,

    /**
     * 
     *                 Criterion is deprecated.
     *               
     * 
     */
    CANNOT_TARGET_OBSOLETE_CRITERION;

    public String value() {
        return name();
    }

    public static TargetingGroupCriterionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

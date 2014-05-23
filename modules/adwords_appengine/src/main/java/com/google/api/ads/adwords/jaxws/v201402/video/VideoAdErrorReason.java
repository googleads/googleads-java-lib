
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoAdError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoAdError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="INVALID_FORMAT"/>
 *     &lt;enumeration value="INVALID_INPUT"/>
 *     &lt;enumeration value="EMPTY_FIELD"/>
 *     &lt;enumeration value="URL_INVALID_TOP_LEVEL_DOMAIN"/>
 *     &lt;enumeration value="URL_MALFORMED"/>
 *     &lt;enumeration value="URL_NO_HOST"/>
 *     &lt;enumeration value="URL_NO_SCHEME"/>
 *     &lt;enumeration value="TOO_LONG"/>
 *     &lt;enumeration value="LINE_TOO_WIDE"/>
 *     &lt;enumeration value="INVALID_IMAGE_MEDIA_ID"/>
 *     &lt;enumeration value="INVALID_COMPANION_BANNER_IMAGE_TYPE"/>
 *     &lt;enumeration value="UNSUPPORTED_COMPANION_IMAGE_SIZE"/>
 *     &lt;enumeration value="TOO_MANY_TARGETING_GROUP_ASSOCIATIONS"/>
 *     &lt;enumeration value="TOO_MANY_VIDEO_ADS_PER_CUSTOMER"/>
 *     &lt;enumeration value="TOO_MANY_VIDEO_ADS_PER_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_OPERATE_ON_DELETED_AD"/>
 *     &lt;enumeration value="UNSUPPORTED_SCOPE_STATUS"/>
 *     &lt;enumeration value="NO_SCOPE_STATUSES_SPECIFIED"/>
 *     &lt;enumeration value="TARGETING_GROUP_FROM_DIFFERENT_CAMPAIGN"/>
 *     &lt;enumeration value="APPROXIMATELY_TOO_LONG"/>
 *     &lt;enumeration value="APPROXIMATELY_TOO_SHORT"/>
 *     &lt;enumeration value="BAD_SNIPPET"/>
 *     &lt;enumeration value="CUSTOMER_NOT_APPROVED_MOBILEADS"/>
 *     &lt;enumeration value="CUSTOMER_NOT_ELIGIBLE"/>
 *     &lt;enumeration value="INCORRECT_LENGTH"/>
 *     &lt;enumeration value="INVALID_AD_ADDRESS_CAMPAIGN_TARGET"/>
 *     &lt;enumeration value="INVALID_CHARACTER_FOR_URL"/>
 *     &lt;enumeration value="INVALID_COUNTRY_CODE"/>
 *     &lt;enumeration value="INVALID_MARKUP_LANGUAGE"/>
 *     &lt;enumeration value="INVALID_MOBILE_CARRIER"/>
 *     &lt;enumeration value="INVALID_MOBILE_CARRIER_TARGET"/>
 *     &lt;enumeration value="TOO_SHORT"/>
 *     &lt;enumeration value="URL_INVALID_SCHEME"/>
 *     &lt;enumeration value="URL_HOST_NAME_TOO_LONG"/>
 *     &lt;enumeration value="URL_NO_TOP_LEVEL_DOMAIN"/>
 *     &lt;enumeration value="URL_PATH_NOT_ALLOWED"/>
 *     &lt;enumeration value="URL_PORT_NOT_ALLOWED"/>
 *     &lt;enumeration value="URL_QUERY_NOT_ALLOWED"/>
 *     &lt;enumeration value="URL_SCHEME_BEFORE_DSA_TAG"/>
 *     &lt;enumeration value="USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE"/>
 *     &lt;enumeration value="INVALID_FIELD_TEXT"/>
 *     &lt;enumeration value="IMAGE_ERROR"/>
 *     &lt;enumeration value="VIDEO_RETRIEVAL_ERROR"/>
 *     &lt;enumeration value="AUDIO_ERROR"/>
 *     &lt;enumeration value="DEPRECATED_FORMAT_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoAdError.Reason")
@XmlEnum
public enum VideoAdErrorReason {

    UNKNOWN,

    /**
     * 
     *                 The structure of the input didn't match an expected pattern.
     *               
     * 
     */
    INVALID_FORMAT,
    INVALID_INPUT,

    /**
     * 
     *                 A required field was not specified or is an empty string.
     *               
     * 
     */
    EMPTY_FIELD,

    /**
     * 
     *                 URL ends with an invalid top-level domain name.
     *               
     * 
     */
    URL_INVALID_TOP_LEVEL_DOMAIN,

    /**
     * 
     *                 URL contains illegal characters.
     *               
     * 
     */
    URL_MALFORMED,

    /**
     * 
     *                 URL must contain a host name.
     *               
     * 
     */
    URL_NO_HOST,

    /**
     * 
     *                 URL must start with a scheme.
     *               
     * 
     */
    URL_NO_SCHEME,

    /**
     * 
     *                 The string has too many characters.
     *               
     * 
     */
    TOO_LONG,

    /**
     * 
     *                 After substituting replacement strings, the line is too wide.
     *               
     * 
     */
    LINE_TOO_WIDE,

    /**
     * 
     *                 Image field has null or invalid media id.
     *               
     * 
     */
    INVALID_IMAGE_MEDIA_ID,

    /**
     * 
     *                 Companion banner image object must be of type MEDIA.
     *               
     * 
     */
    INVALID_COMPANION_BANNER_IMAGE_TYPE,

    /**
     * 
     *                 The companion banner image is not of legal dimensions.
     *               
     * 
     */
    UNSUPPORTED_COMPANION_IMAGE_SIZE,

    /**
     * 
     *                 This operation will result in the video ad having more than the maximum
     *                 number of allowed targeting group associations.
     *               
     * 
     */
    TOO_MANY_TARGETING_GROUP_ASSOCIATIONS,

    /**
     * 
     *                 This operation will result in the video ad having more than the maximum
     *                 number of allowed video ads per customer.
     *               
     * 
     */
    TOO_MANY_VIDEO_ADS_PER_CUSTOMER,

    /**
     * 
     *                 This operation will result in the video ad having more than the maximum
     *                 number of allowed video ads in each campaign.
     *               
     * 
     */
    TOO_MANY_VIDEO_ADS_PER_CAMPAIGN,

    /**
     * 
     *                 The client is attempting to do a SET on an already-deleted ad;
     *                 no modifications are allowed to deleted ads.
     *               
     * 
     */
    CANNOT_OPERATE_ON_DELETED_AD,

    /**
     * 
     *                 The client is attempting to set a scope status to something other than
     *                 ENABLED or PAUSED.
     *               
     * 
     */
    UNSUPPORTED_SCOPE_STATUS,

    /**
     * 
     *                 The client must specify at least one targeting scope status when
     *                 create a new ad.
     *               
     * 
     */
    NO_SCOPE_STATUSES_SPECIFIED,

    /**
     * 
     *                 Cannot associate an ad to a targeting group from a different campaign.
     *               
     * 
     */
    TARGETING_GROUP_FROM_DIFFERENT_CAMPAIGN,

    /**
     * 
     *                 Estimating character sizes the string is too long.
     *               
     * 
     */
    APPROXIMATELY_TOO_LONG,

    /**
     * 
     *                 Estimating character sizes the string is too short.
     *               
     * 
     */
    APPROXIMATELY_TOO_SHORT,

    /**
     * 
     *                 There is a problem with the snippet.
     *               
     * 
     */
    BAD_SNIPPET,

    /**
     * 
     *                 Customer is not approved for mobile ads.
     *               
     * 
     */
    CUSTOMER_NOT_APPROVED_MOBILEADS,

    /**
     * 
     *                 Not an eligible customer
     *               
     * 
     */
    CUSTOMER_NOT_ELIGIBLE,

    /**
     * 
     *                 The length of the string is not valid.
     *               
     * 
     */
    INCORRECT_LENGTH,

    /**
     * 
     *                 User cannot create mobile ad for countries targeted in specified campaign.
     *               
     * 
     */
    INVALID_AD_ADDRESS_CAMPAIGN_TARGET,

    /**
     * 
     *                 Invalid character in URL.
     *               
     * 
     */
    INVALID_CHARACTER_FOR_URL,

    /**
     * 
     *                 Creative's country code is not valid.
     *               
     * 
     */
    INVALID_COUNTRY_CODE,

    /**
     * 
     *                 An invalid markup language was entered.
     *               
     * 
     */
    INVALID_MARKUP_LANGUAGE,

    /**
     * 
     *                 An invalid mobile carrier was entered.
     *               
     * 
     */
    INVALID_MOBILE_CARRIER,

    /**
     * 
     *                 Specified mobile carriers target a country not targeted by the campaign.
     *               
     * 
     */
    INVALID_MOBILE_CARRIER_TARGET,

    /**
     * 
     *                 The string has too few characters.
     *               
     * 
     */
    TOO_SHORT,

    /**
     * 
     *                 URL starts with an invalid scheme.
     *               
     * 
     */
    URL_INVALID_SCHEME,

    /**
     * 
     *                 URL host name too long to be stored as visible URL
     *               
     * 
     */
    URL_HOST_NAME_TOO_LONG,

    /**
     * 
     *                 URL should end in a valid domain extension, such as .com or .net.
     *               
     * 
     */
    URL_NO_TOP_LEVEL_DOMAIN,

    /**
     * 
     *                 URL must not end with a path.
     *               
     * 
     */
    URL_PATH_NOT_ALLOWED,

    /**
     * 
     *                 URL must not specify a port.
     *               
     * 
     */
    URL_PORT_NOT_ALLOWED,

    /**
     * 
     *                 URL must not contain a query.
     *               
     * 
     */
    URL_QUERY_NOT_ALLOWED,

    /**
     * 
     *                 A url scheme is not allowed in front of tag in dest url (e.g. http://{lpurl})
     *               
     * 
     */
    URL_SCHEME_BEFORE_DSA_TAG,

    /**
     * 
     *                 User does not have permissions to create a template ad for the given template
     *               
     * 
     */
    USER_DOES_NOT_HAVE_ACCESS_TO_TEMPLATE,

    /**
     * 
     *                 The text of this field did not match a pattern of allowed values.
     *               
     * 
     */
    INVALID_FIELD_TEXT,

    /**
     * 
     *                 Error occurred during image processing
     *               
     * 
     */
    IMAGE_ERROR,

    /**
     * 
     *                 Error retrieving specified video
     *               
     * 
     */
    VIDEO_RETRIEVAL_ERROR,

    /**
     * 
     *                 Error processing audio
     *               
     * 
     */
    AUDIO_ERROR,

    /**
     * 
     *                 Request uses a deprecated format not supported anymore.
     *               
     * 
     */
    DEPRECATED_FORMAT_ERROR;

    public String value() {
        return name();
    }

    public static VideoAdErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

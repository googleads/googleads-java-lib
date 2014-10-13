
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdExtensionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCOUNT_DELETED"/>
 *     &lt;enumeration value="AD_EXTENSION_NO_LONGER_ACTIVE"/>
 *     &lt;enumeration value="CANNOT_HAVE_MULTIPLE_LOCATION_SYNC_EXTENSIONS_PER_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_HAVE_MULTIPLE_MOBILE_EXTENSIONS_PER_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_HAVE_MULTIPLE_PRODUCT_EXTENSIONS_PER_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_HAVE_MULTIPLE_SITELINKS_EXTENSIONS_PER_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_HAVE_MULTIPLE_IN_APP_LINK_EXTENSIONS_PER_CAMPAIGN_PER_APPSTORE"/>
 *     &lt;enumeration value="INVALID_ADEXTENSION_TYPE"/>
 *     &lt;enumeration value="INVALID_AUTH_TOKEN_FOR_EMAIL"/>
 *     &lt;enumeration value="INVALID_COUNTRY_CODE"/>
 *     &lt;enumeration value="INVALID_DOMESTIC_PHONE_NUMBER_FORMAT"/>
 *     &lt;enumeration value="INVALID_DESTINATION_URL"/>
 *     &lt;enumeration value="INVALID_EMAIL"/>
 *     &lt;enumeration value="INVALID_ENCODED_LOCATION"/>
 *     &lt;enumeration value="INVALID_ENUM_CONDITION_OPERATOR"/>
 *     &lt;enumeration value="INVALID_ICON_DIMENSIONS"/>
 *     &lt;enumeration value="INVALID_ID"/>
 *     &lt;enumeration value="INVALID_IMAGE_DIMENSIONS"/>
 *     &lt;enumeration value="INVALID_INPUT"/>
 *     &lt;enumeration value="INVALID_LATITUDE"/>
 *     &lt;enumeration value="INVALID_LONGITUDE"/>
 *     &lt;enumeration value="INVALID_PHONE_NUMBER"/>
 *     &lt;enumeration value="INVALID_STRING_CONDITION_OPERATOR"/>
 *     &lt;enumeration value="INVALID_TOLL_PHONE_NUMBER_FORMAT"/>
 *     &lt;enumeration value="MEDIA_DOES_NOT_BELONG_TO_ACCOUNT"/>
 *     &lt;enumeration value="MEDIA_NOT_ICON_TYPE"/>
 *     &lt;enumeration value="MEDIA_NOT_IMAGE_TYPE"/>
 *     &lt;enumeration value="MISSING_ADVERTISER_NAME"/>
 *     &lt;enumeration value="MISSING_AUTH_TOKEN"/>
 *     &lt;enumeration value="MISSING_COUNTRY_CODE"/>
 *     &lt;enumeration value="MISSING_CITY_NAME"/>
 *     &lt;enumeration value="MISSING_EMAIL"/>
 *     &lt;enumeration value="MISSING_ENCODED_LOCATION"/>
 *     &lt;enumeration value="MISSING_CONDITION_OPERAND"/>
 *     &lt;enumeration value="MISSING_CONDITION_STRING_VALUE"/>
 *     &lt;enumeration value="MISSING_POSTAL_CODE"/>
 *     &lt;enumeration value="MISSING_STREET_ADDRESS"/>
 *     &lt;enumeration value="NUM_AND_GROUPS_OVER_LIMIT"/>
 *     &lt;enumeration value="NUM_CONDITIONS_OVER_LIMIT"/>
 *     &lt;enumeration value="NUM_LOCATION_EXTENSIONS_OVER_LIMIT"/>
 *     &lt;enumeration value="NOT_AUTHORIZED_TO_CREATE_EXTENSION"/>
 *     &lt;enumeration value="PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY"/>
 *     &lt;enumeration value="DISALLOWED_NUMBER_TYPE"/>
 *     &lt;enumeration value="PREMIUM_RATE_NUMBER_NOT_ALLOWED"/>
 *     &lt;enumeration value="TOO_LONG"/>
 *     &lt;enumeration value="USER_NOT_PERMITTED_TO_CREATE_LBC_SYNC_LOCATION_EXTENSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdExtensionError.Reason")
@XmlEnum
public enum AdExtensionErrorReason {


    /**
     * 
     *                 Account has been deleted
     *               
     * 
     */
    ACCOUNT_DELETED,

    /**
     * 
     *                 Cannot reuse an ad extension that is no longer active
     *               
     * 
     */
    AD_EXTENSION_NO_LONGER_ACTIVE,

    /**
     * 
     *                 Cannot have multiple location sync extensions per campaign
     *               
     * 
     */
    CANNOT_HAVE_MULTIPLE_LOCATION_SYNC_EXTENSIONS_PER_CAMPAIGN,

    /**
     * 
     *                 Cannot have multiple mobile extensions per campaign
     *               
     * 
     */
    CANNOT_HAVE_MULTIPLE_MOBILE_EXTENSIONS_PER_CAMPAIGN,

    /**
     * 
     *                 Cannot have multiple product extensions per campaign
     *               
     * 
     */
    CANNOT_HAVE_MULTIPLE_PRODUCT_EXTENSIONS_PER_CAMPAIGN,

    /**
     * 
     *                 Cannot have multiple sitelinks extensions per campaign
     *               
     * 
     */
    CANNOT_HAVE_MULTIPLE_SITELINKS_EXTENSIONS_PER_CAMPAIGN,

    /**
     * 
     *                 Cannot have multiple in-app link extensions with same app store in a campaign.
     *               
     * 
     */
    CANNOT_HAVE_MULTIPLE_IN_APP_LINK_EXTENSIONS_PER_CAMPAIGN_PER_APPSTORE,

    /**
     * 
     *                 Invalid adextension type for an input adextension
     *               
     * 
     */
    INVALID_ADEXTENSION_TYPE,

    /**
     * 
     *                 Invalid auth token for the given email
     *               
     * 
     */
    INVALID_AUTH_TOKEN_FOR_EMAIL,

    /**
     * 
     *                 Invalid country code specified
     *               
     * 
     */
    INVALID_COUNTRY_CODE,

    /**
     * 
     *                 Invalid phone number format specified
     *               
     * 
     */
    INVALID_DOMESTIC_PHONE_NUMBER_FORMAT,

    /**
     * 
     *                 Invalid destination url specified
     *               
     * 
     */
    INVALID_DESTINATION_URL,

    /**
     * 
     *                 Invalid email specified
     *               
     * 
     */
    INVALID_EMAIL,

    /**
     * 
     *                 The encoded location does not match what should have been returned
     *                 in GeoLocation.
     *               
     * 
     */
    INVALID_ENCODED_LOCATION,

    /**
     * 
     *                 The enum operator in condition is not valid.
     *               
     * 
     */
    INVALID_ENUM_CONDITION_OPERATOR,

    /**
     * 
     *                 The icon has dimensions other than 16x16
     *               
     * 
     */
    INVALID_ICON_DIMENSIONS,

    /**
     * 
     *                 Invalid id specified
     *               
     * 
     */
    INVALID_ID,

    /**
     * 
     *                 The image has width or height exceeding 125
     *               
     * 
     */
    INVALID_IMAGE_DIMENSIONS,

    /**
     * 
     *                 The input field is invalid
     *               
     * 
     */
    INVALID_INPUT,

    /**
     * 
     *                 Invalid latitude specified
     *               
     * 
     */
    INVALID_LATITUDE,

    /**
     * 
     *                 Invalid longitude specified
     *               
     * 
     */
    INVALID_LONGITUDE,

    /**
     * 
     *                 Invalid phone number specified
     *               
     * 
     */
    INVALID_PHONE_NUMBER,

    /**
     * 
     *                 The string operator in condition is not valid.
     *               
     * 
     */
    INVALID_STRING_CONDITION_OPERATOR,

    /**
     * 
     *                 Invalid toll phone number format specified
     *               
     * 
     */
    INVALID_TOLL_PHONE_NUMBER_FORMAT,

    /**
     * 
     *                 Media referenced does not belong to the customer's account
     *               
     * 
     */
    MEDIA_DOES_NOT_BELONG_TO_ACCOUNT,

    /**
     * 
     *                 Media referenced is not an icon
     *               
     * 
     */
    MEDIA_NOT_ICON_TYPE,

    /**
     * 
     *                 Media referenced is not an image
     *               
     * 
     */
    MEDIA_NOT_IMAGE_TYPE,

    /**
     * 
     *                 Missing advertiser name
     *               
     * 
     */
    MISSING_ADVERTISER_NAME,

    /**
     * 
     *                 Missing auth token
     *               
     * 
     */
    MISSING_AUTH_TOKEN,

    /**
     * 
     *                 Missing country code
     *               
     * 
     */
    MISSING_COUNTRY_CODE,

    /**
     * 
     *                 Missing city name
     *               
     * 
     */
    MISSING_CITY_NAME,

    /**
     * 
     *                 Missing email
     *               
     * 
     */
    MISSING_EMAIL,

    /**
     * 
     *                 Missing encoded location
     *               
     * 
     */
    MISSING_ENCODED_LOCATION,

    /**
     * 
     *                 Missing operand for condition
     *               
     * 
     */
    MISSING_CONDITION_OPERAND,

    /**
     * 
     *                 Missing comparison string value for condition
     *               
     * 
     */
    MISSING_CONDITION_STRING_VALUE,

    /**
     * 
     *                 Missing postal code
     *               
     * 
     */
    MISSING_POSTAL_CODE,

    /**
     * 
     *                 Missing street address
     *               
     * 
     */
    MISSING_STREET_ADDRESS,

    /**
     * 
     *                 Extension or OR clause contains more than 10 AND clauses
     *               
     * 
     */
    NUM_AND_GROUPS_OVER_LIMIT,

    /**
     * 
     *                 The number of conditions in an extension or AND group (5 max in AND) exceeds limit
     *               
     * 
     */
    NUM_CONDITIONS_OVER_LIMIT,

    /**
     * 
     *                 The number of location extensions exceeds campaign limits
     *               
     * 
     */
    NUM_LOCATION_EXTENSIONS_OVER_LIMIT,

    /**
     * 
     *                 The client is not authorized to make the specified extension
     *               
     * 
     */
    NOT_AUTHORIZED_TO_CREATE_EXTENSION,

    /**
     * 
     *                 Setting phone number is not supported for the specified country currently
     *               
     * 
     */
    PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY,

    /**
     * 
     *                 Phone number type is not allowed
     *               
     * 
     */
    DISALLOWED_NUMBER_TYPE,

    /**
     * 
     *                 Premium rate numbers e.g. 1-900 numbers not allowed
     *               
     * 
     */
    PREMIUM_RATE_NUMBER_NOT_ALLOWED,

    /**
     * 
     *                 Text is too long
     *               
     * 
     */
    TOO_LONG,

    /**
     * 
     *                 The user is not permitted to create location sync extensions
     *               
     * 
     */
    USER_NOT_PERMITTED_TO_CREATE_LBC_SYNC_LOCATION_EXTENSION;

    public String value() {
        return name();
    }

    public static AdExtensionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

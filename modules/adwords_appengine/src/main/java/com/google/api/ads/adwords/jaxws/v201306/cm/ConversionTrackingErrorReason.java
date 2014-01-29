
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionTrackingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionTrackingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANALYTICS_NOT_ALLOWED"/>
 *     &lt;enumeration value="CANNOT_ADD_CONVERSION_TYPE_SUBCLASS"/>
 *     &lt;enumeration value="CANNOT_CHANGE_APP_CONVERSION_TYPE"/>
 *     &lt;enumeration value="CANNOT_CHANGE_APP_PLATFORM"/>
 *     &lt;enumeration value="CANNNOT_CHANGE_CONVERSION_SUBCLASS"/>
 *     &lt;enumeration value="CANNOT_SET_HIDDEN_STATUS"/>
 *     &lt;enumeration value="CONVERSION_TYPE_NOT_FOUND"/>
 *     &lt;enumeration value="DOMAIN_EXCEPTION"/>
 *     &lt;enumeration value="DUPLICATE_APP_ID"/>
 *     &lt;enumeration value="DUPLICATE_NAME"/>
 *     &lt;enumeration value="EMAIL_FAILED"/>
 *     &lt;enumeration value="EXCEEDED_CONVERSION_TYPE_LIMIT"/>
 *     &lt;enumeration value="ID_IS_NULL"/>
 *     &lt;enumeration value="INVALID_APP_ID"/>
 *     &lt;enumeration value="INVALID_COLOR"/>
 *     &lt;enumeration value="INVALID_CONVERSION"/>
 *     &lt;enumeration value="INVALID_DATE_RANGE"/>
 *     &lt;enumeration value="INVALID_EMAIL_ADDRESS"/>
 *     &lt;enumeration value="MUST_SET_APP_PLATFORM_AND_APP_CONVERSION_TYPE_TOGETHER"/>
 *     &lt;enumeration value="NAME_ALREADY_EXISTS"/>
 *     &lt;enumeration value="NO_RECIPIENTS"/>
 *     &lt;enumeration value="NO_SNIPPET"/>
 *     &lt;enumeration value="REMARKETING_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="TOO_MANY_WEBPAGES"/>
 *     &lt;enumeration value="UNKNOWN_SORTING_TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionTrackingError.Reason")
@XmlEnum
public enum ConversionTrackingErrorReason {


    /**
     * 
     *                 This user is not whitelisted for the import of Analytics goals and profiles, and yet
     *                 requested to mutate an Analytics conversion type.
     *               
     * 
     */
    ANALYTICS_NOT_ALLOWED,

    /**
     * 
     *                 Cannot execute an ADD operation on this subclass of ConversionType (currently, only
     *                 instances of AdWordsConversionType may be added).
     *               
     * 
     */
    CANNOT_ADD_CONVERSION_TYPE_SUBCLASS,

    /**
     * 
     *                 AppConversions cannot change app conversion types once it has been set.
     *               
     * 
     */
    CANNOT_CHANGE_APP_CONVERSION_TYPE,

    /**
     * 
     *                 AppConversions cannot change app platforms once it has been set.
     *               
     * 
     */
    CANNOT_CHANGE_APP_PLATFORM,

    /**
     * 
     *                 Cannot change between subclasses of ConversionType
     *               
     * 
     */
    CANNNOT_CHANGE_CONVERSION_SUBCLASS,

    /**
     * 
     *                 If a conversion type's status is initially non-hidden, it may not be changed to Hidden;
     *                 nor may hidden conversion types be created through the API. Hidden conversion types are
     *                 typically created by backend processes.
     *               
     * 
     */
    CANNOT_SET_HIDDEN_STATUS,

    /**
     * 
     *                 An attempt to access a conversion type failed because no conversion type with this ID
     *                 exists for this account.
     *               
     * 
     */
    CONVERSION_TYPE_NOT_FOUND,

    /**
     * 
     *                 An exception occurred in the domain layer during an attempt to process a
     *                 ConversionTypeOperation.
     *               
     * 
     */
    DOMAIN_EXCEPTION,

    /**
     * 
     *                 The user specified two identical app ids when attempting to create or rename a
     *                 conversion type.
     *               
     * 
     */
    DUPLICATE_APP_ID,

    /**
     * 
     *                 The user specified two identical names when attempting to create or rename multiple
     *                 conversion types.
     *               
     * 
     */
    DUPLICATE_NAME,

    /**
     * 
     *                 An error occurred while sending email.
     *               
     * 
     */
    EMAIL_FAILED,

    /**
     * 
     *                 The maximum number of active conversion types for this account has been exceeded.
     *               
     * 
     */
    EXCEEDED_CONVERSION_TYPE_LIMIT,

    /**
     * 
     *                 The user requested to modify an existing conversion type, but did not supply an ID.
     *               
     * 
     */
    ID_IS_NULL,

    /**
     * 
     *                 App ids must adhere to valid Java package naming requirements.
     *               
     * 
     */
    INVALID_APP_ID,

    /**
     * 
     *                 The user entered an invalid background color. The background color must be a valid
     *                 HTML hex color code, such as "99ccff".
     *               
     * 
     */
    INVALID_COLOR,

    /**
     * 
     *                 The conversion given is invalid
     *               
     * 
     */
    INVALID_CONVERSION,

    /**
     * 
     *                 The date range specified in the stats selector is invalid.
     *               
     * 
     */
    INVALID_DATE_RANGE,

    /**
     * 
     *                 The email address of the sender or the recipient of a snippet email was invalid.
     *               
     * 
     */
    INVALID_EMAIL_ADDRESS,

    /**
     * 
     *                 The AppPlatform and AppConversionType must be set at the same time. It is an error to set
     *                 just one or the other.
     *               
     * 
     */
    MUST_SET_APP_PLATFORM_AND_APP_CONVERSION_TYPE_TOGETHER,

    /**
     * 
     *                 The user attempted to create a new conversion type, or to rename an existing conversion type,
     *                 whose new name matches one of the other conversion types for his account.
     *               
     * 
     */
    NAME_ALREADY_EXISTS,

    /**
     * 
     *                 The user asked to send a notification email, but specified no recipients.
     *               
     * 
     */
    NO_RECIPIENTS,

    /**
     * 
     *                 The requested conversion type has no snippet, and thus its snippet email cannot be sent.
     *               
     * 
     */
    NO_SNIPPET,

    /**
     * 
     *                 This user is not whitelisted user targeting and requested to mutate an Analytics
     *                 conversion type.
     *               
     * 
     */
    REMARKETING_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 The requested date range contains too many webpages to be processed.
     *               
     * 
     */
    TOO_MANY_WEBPAGES,

    /**
     * 
     *                 An unknown sorting type was specified in the selector.
     *               
     * 
     */
    UNKNOWN_SORTING_TYPE;

    public String value() {
        return name();
    }

    public static ConversionTrackingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

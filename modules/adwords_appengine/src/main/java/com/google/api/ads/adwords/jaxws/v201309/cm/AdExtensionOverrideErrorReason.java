
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionOverrideError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdExtensionOverrideError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD_ALREADY_HAS_ADEXTENSION_OVERRIDE"/>
 *     &lt;enumeration value="ADEXTENSION_ID_MUST_BE_SPECIFIED"/>
 *     &lt;enumeration value="ADEXTENSION_LATITUTE_CANNOT_CHANGE_AFTER_BEING_SET_ONCE"/>
 *     &lt;enumeration value="ADEXTENSION_LONGITUDE_CANNOT_CHANGE_AFTER_BEING_SET_ONCE"/>
 *     &lt;enumeration value="ADEXTENSION_NOT_UNDER_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_OPERATE_ON_DELETED_OVERRIDE"/>
 *     &lt;enumeration value="CANNOT_OVERRIDE_EXTENSIONS_ON_NON_TEXT_AD"/>
 *     &lt;enumeration value="CANNOT_OVERRIDE_USING_NON_LOCATION_EXTENSION"/>
 *     &lt;enumeration value="INVALID_ADEXTENSION_ID"/>
 *     &lt;enumeration value="LOCATION_OVERRIDE_INFO_REQUIRED_FOR_NEW_LOCATION_EXTENSION_OVERRIDE"/>
 *     &lt;enumeration value="OVERRIDE_INFO_MUST_BE_NULL_AFTER_BEING_SET_ONCE"/>
 *     &lt;enumeration value="RADIUS_TOO_LARGE"/>
 *     &lt;enumeration value="RADIUS_TOO_SMALL"/>
 *     &lt;enumeration value="UNKNOWN_ADEXTENSION_OVERRIDE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdExtensionOverrideError.Reason")
@XmlEnum
public enum AdExtensionOverrideErrorReason {


    /**
     * 
     *                 Cannot override an ad that is already overriden with an adextension
     *               
     * 
     */
    AD_ALREADY_HAS_ADEXTENSION_OVERRIDE,

    /**
     * 
     *                 AdExtension id must be specified
     *               
     * 
     */
    ADEXTENSION_ID_MUST_BE_SPECIFIED,

    /**
     * 
     *                 Latitutde of the new override must be the same as the first override set on the ad
     *               
     * 
     */
    ADEXTENSION_LATITUTE_CANNOT_CHANGE_AFTER_BEING_SET_ONCE,

    /**
     * 
     *                 Longitude of the new override must be the same as the first override set on the ad
     *               
     * 
     */
    ADEXTENSION_LONGITUDE_CANNOT_CHANGE_AFTER_BEING_SET_ONCE,

    /**
     * 
     *                 The adextension to use in overriding does not belong to the campaign
     *               
     * 
     */
    ADEXTENSION_NOT_UNDER_CAMPAIGN,

    /**
     * 
     *                 Cannot operate on a deleted adextension override
     *               
     * 
     */
    CANNOT_OPERATE_ON_DELETED_OVERRIDE,

    /**
     * 
     *                 Cannot override any other ad type besides a text ad
     *               
     * 
     */
    CANNOT_OVERRIDE_EXTENSIONS_ON_NON_TEXT_AD,

    /**
     * 
     *                 Cannot override an ad using a non-location extension override
     *               
     * 
     */
    CANNOT_OVERRIDE_USING_NON_LOCATION_EXTENSION,

    /**
     * 
     *                 Invalid adextension id
     *               
     * 
     */
    INVALID_ADEXTENSION_ID,

    /**
     * 
     *                 Location override info must be specified when overriding an ad for the first time
     *               
     * 
     */
    LOCATION_OVERRIDE_INFO_REQUIRED_FOR_NEW_LOCATION_EXTENSION_OVERRIDE,

    /**
     * 
     *                 Location override info must not be specified once an ad has already been overrided once
     *               
     * 
     */
    OVERRIDE_INFO_MUST_BE_NULL_AFTER_BEING_SET_ONCE,

    /**
     * 
     *                 Radius is too large
     *               
     * 
     */
    RADIUS_TOO_LARGE,

    /**
     * 
     *                 Radius is too small
     *               
     * 
     */
    RADIUS_TOO_SMALL,

    /**
     * 
     *                 Unknown adextension override specified
     *               
     * 
     */
    UNKNOWN_ADEXTENSION_OVERRIDE;

    public String value() {
        return name();
    }

    public static AdExtensionOverrideErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

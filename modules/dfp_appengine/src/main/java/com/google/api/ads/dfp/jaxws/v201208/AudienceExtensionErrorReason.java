
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceExtensionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudienceExtensionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREQUENCY_CAPS_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_TARGETING"/>
 *     &lt;enumeration value="INVENTORY_UNIT_TARGETING_INVALID"/>
 *     &lt;enumeration value="INVALID_CREATIVE_ROTATION"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="INVALID_MAX_BID"/>
 *     &lt;enumeration value="AUDIENCE_EXTENSION_BULK_UPDATE_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNEXPECTED_AUDIENCE_EXTENSION_ERROR"/>
 *     &lt;enumeration value="MAX_DAILY_BUDGET_AMOUNT_EXCEEDED"/>
 *     &lt;enumeration value="EXTERNAL_CAMPAIGN_ALREADY_EXISTS"/>
 *     &lt;enumeration value="AUDIENCE_EXTENSION_WITHOUT_FEATURE"/>
 *     &lt;enumeration value="AUDIENCE_EXTENSION_WITHOUT_LINKED_ACCOUNT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudienceExtensionError.Reason")
@XmlEnum
public enum AudienceExtensionErrorReason {


    /**
     * 
     *                 Frequency caps are not supported by audience extension line items
     *               
     * 
     */
    FREQUENCY_CAPS_NOT_SUPPORTED,

    /**
     * 
     *                 Audience extension line items can only target geography
     *               
     * 
     */
    INVALID_TARGETING,

    /**
     * 
     *                 Audience extension line items can only target audience extension inventory units
     *               
     * 
     */
    INVENTORY_UNIT_TARGETING_INVALID,

    /**
     * 
     *                 Audience extension line items do not support {@link CreativeRotationType#SEQUENTIAL}.
     *               
     * 
     */
    INVALID_CREATIVE_ROTATION,

    /**
     * 
     *                 Audience extension line items only support {@link LineItemType#STANDARD}.
     *               
     * 
     */
    INVALID_LINE_ITEM_TYPE,

    /**
     * 
     *                 Audience extension max bid is invalid when it is greater then the max budget.
     *               
     * 
     */
    INVALID_MAX_BID,

    /**
     * 
     *                 Bulk update for audience extension line items is not allowed.
     *               
     * 
     */
    AUDIENCE_EXTENSION_BULK_UPDATE_NOT_ALLOWED,

    /**
     * 
     *                 An unexpected error occurred.
     *               
     * 
     */
    UNEXPECTED_AUDIENCE_EXTENSION_ERROR,

    /**
     * 
     *                 The value entered for the maximum daily budget on an audience extension line item exceeds
     *                 the maximum allowed.
     *               
     * 
     */
    MAX_DAILY_BUDGET_AMOUNT_EXCEEDED,

    /**
     * 
     *                 Creating a campaign for a line item that already has an associated campaign is not allowed.
     *               
     * 
     */
    EXTERNAL_CAMPAIGN_ALREADY_EXISTS,

    /**
     * 
     *                 Audience extension was specified on a line item but the feature was not
     *                 enabled.
     *               
     * 
     */
    AUDIENCE_EXTENSION_WITHOUT_FEATURE,

    /**
     * 
     *                 Audience extension was specified on a line item but no audience extension account has
     *                 been linked.
     *               
     * 
     */
    AUDIENCE_EXTENSION_WITHOUT_LINKED_ACCOUNT,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AudienceExtensionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

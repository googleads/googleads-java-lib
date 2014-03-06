
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityCountLimitExceeded.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityCountLimitExceeded.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCOUNT_LIMIT"/>
 *     &lt;enumeration value="CAMPAIGN_LIMIT"/>
 *     &lt;enumeration value="ADGROUP_LIMIT"/>
 *     &lt;enumeration value="SHARED_SET_LIMIT"/>
 *     &lt;enumeration value="ADGROUP_TEXT_AD_LIMIT"/>
 *     &lt;enumeration value="ADGROUP_DISPLAY_AD_LIMIT"/>
 *     &lt;enumeration value="MATCHING_FUNCTION_LIMIT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityCountLimitExceeded.Reason")
@XmlEnum
public enum EntityCountLimitExceededReason {

    ACCOUNT_LIMIT,
    CAMPAIGN_LIMIT,

    /**
     * 
     *                 Indicates that this request would exceed the number of allowed entities in
     *                 this ad group.  The exact entity type and limit being checked can be
     *                 inferred from {@link #accountLimitType}, and the numeric id of the ad group
     *                 involved is given by {@link #enclosingId}.
     *               
     * 
     */
    ADGROUP_LIMIT,

    /**
     * 
     *                 Indicates that this request would exceed the number of allowed entities in
     *                 this shared set.  The exact entity type and limit being checked can be
     *                 inferred from {@link #accountLimitType}, and the numeric id of the shared
     *                 set involved is given by {@link #enclosingId}.
     *               
     * 
     */
    SHARED_SET_LIMIT,

    /**
     * 
     *                 Specifies max number of ads not intended for Display Network; applies to
     *                 MobileAd, TextAd, TemplateAd (text templates only).
     *               
     * 
     */
    ADGROUP_TEXT_AD_LIMIT,

    /**
     * 
     *                 Specifies max number of Display Network ads; applies to
     *                 ImageAd, MobileImageAd, TemplateAd (except text templates).
     *               
     * 
     */
    ADGROUP_DISPLAY_AD_LIMIT,

    /**
     * 
     *                 Exceeds a limit related to a matching function.
     *               
     * 
     */
    MATCHING_FUNCTION_LIMIT,

    /**
     * 
     *                 Specific limit that has been exceeded is unknown (the client may be of an
     *                 older version than the server).
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static EntityCountLimitExceededReason fromValue(String v) {
        return valueOf(v);
    }

}

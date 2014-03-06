
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignAdExtensionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignAdExtensionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADEXTENSION_NOT_UNDER_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_ADD_DELETED_CAMPAIGN_ADEXTENSION"/>
 *     &lt;enumeration value="CANNOT_OPERATE_ON_DELETED_CAMPAIGN_ADEXTENSION"/>
 *     &lt;enumeration value="INVALID_ADEXTENSION_ID"/>
 *     &lt;enumeration value="MISSING_ADEXTENSION_ID"/>
 *     &lt;enumeration value="MUST_USE_CONCRETE_ADEXTENSION_DURING_ADD"/>
 *     &lt;enumeration value="MUST_USE_CONCRETE_ADEXTENSION"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignAdExtensionError.Reason")
@XmlEnum
public enum CampaignAdExtensionErrorReason {


    /**
     * 
     *                 Cannot operate on an adextensions under the wrong campaign
     *               
     * 
     */
    ADEXTENSION_NOT_UNDER_CAMPAIGN,

    /**
     * 
     *                 Cannot add a CampaignAdExtension with status DELETED
     *               
     * 
     */
    CANNOT_ADD_DELETED_CAMPAIGN_ADEXTENSION,

    /**
     * 
     *                 Cannot operate on a CampaignAdExtension with status DELETED
     *               
     * 
     */
    CANNOT_OPERATE_ON_DELETED_CAMPAIGN_ADEXTENSION,

    /**
     * 
     *                 Invalid adextension id
     *               
     * 
     */
    INVALID_ADEXTENSION_ID,

    /**
     * 
     *                 Missing adextension id
     *               
     * 
     */
    MISSING_ADEXTENSION_ID,

    /**
     * 
     *                 Must use a concrete subtype of AdExtension (eg. LocationExtension)
     *               
     * 
     */
    MUST_USE_CONCRETE_ADEXTENSION_DURING_ADD,

    /**
     * 
     *                 Must use a concrete subtype of AdExtension (eg. LocationExtension)
     *               
     * 
     */
    MUST_USE_CONCRETE_ADEXTENSION,
    UNKNOWN_ERROR;

    public String value() {
        return name();
    }

    public static CampaignAdExtensionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

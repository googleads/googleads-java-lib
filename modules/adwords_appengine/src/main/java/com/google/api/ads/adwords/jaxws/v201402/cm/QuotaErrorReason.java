
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuotaError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOO_MANY_ADGROUPS_PER_CAMPAIGN"/>
 *     &lt;enumeration value="TOO_MANY_CAMPAIGNS_PER_ACCOUNT"/>
 *     &lt;enumeration value="TOO_MANY_CONVERSION_TYPES_PER_ACCOUNT"/>
 *     &lt;enumeration value="TOO_MANY_KEYWORDS_PER_ADGROUP"/>
 *     &lt;enumeration value="TOO_MANY_KEYWORDS_PER_CAMPAIGN"/>
 *     &lt;enumeration value="TOO_MANY_KEYWORDS_PER_CUSTOMER"/>
 *     &lt;enumeration value="TOO_MANY_SITES_PER_ADGROUP"/>
 *     &lt;enumeration value="TOO_MANY_SITES_PER_CAMPAIGN"/>
 *     &lt;enumeration value="TOO_MANY_CRITERIA_PER_ACCOUNT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuotaError.Reason")
@XmlEnum
public enum QuotaErrorReason {


    /**
     * 
     *                 Too many ad groups per campaign.
     *               
     * 
     */
    TOO_MANY_ADGROUPS_PER_CAMPAIGN,

    /**
     * 
     *                 Too many campaigns per account.
     *               
     * 
     */
    TOO_MANY_CAMPAIGNS_PER_ACCOUNT,

    /**
     * 
     *                 Too many conversion types per account.
     *               
     * 
     */
    TOO_MANY_CONVERSION_TYPES_PER_ACCOUNT,

    /**
     * 
     *                 Too many keywords per ad group.
     *               
     * 
     */
    TOO_MANY_KEYWORDS_PER_ADGROUP,

    /**
     * 
     *                 Too many keywords per campaign.
     *               
     * 
     */
    TOO_MANY_KEYWORDS_PER_CAMPAIGN,

    /**
     * 
     *                 Too many keywords per customer.
     *               
     * 
     */
    TOO_MANY_KEYWORDS_PER_CUSTOMER,

    /**
     * 
     *                 Too many sites per ad group.
     *               
     * 
     */
    TOO_MANY_SITES_PER_ADGROUP,

    /**
     * 
     *                 Too many sites per campaign.
     *               
     * 
     */
    TOO_MANY_SITES_PER_CAMPAIGN,

    /**
     * 
     *                 Too many campaign level negative keywords + negative sites + geo targets
     *                 for the account.
     *               
     * 
     */
    TOO_MANY_CRITERIA_PER_ACCOUNT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static QuotaErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

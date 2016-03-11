
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Company.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Company.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOUSE_ADVERTISER"/>
 *     &lt;enumeration value="HOUSE_AGENCY"/>
 *     &lt;enumeration value="ADVERTISER"/>
 *     &lt;enumeration value="AGENCY"/>
 *     &lt;enumeration value="AD_NETWORK"/>
 *     &lt;enumeration value="AFFILIATE_DISTRIBUTION_PARTNER"/>
 *     &lt;enumeration value="CONTENT_PARTNER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Company.Type")
@XmlEnum
public enum CompanyType {


    /**
     * 
     *                 The publisher's own advertiser. When no outside advertiser buys its
     *                 inventory, the publisher may run its own advertising campaigns.
     *               
     * 
     */
    HOUSE_ADVERTISER,

    /**
     * 
     *                 The publisher's own agency.
     *               
     * 
     */
    HOUSE_AGENCY,

    /**
     * 
     *                 A business entity that buys publisher inventory to run advertising
     *                 campaigns. An advertiser is optionally associated with one or more
     *                 agencies.
     *               
     * 
     */
    ADVERTISER,

    /**
     * 
     *                 A business entity that offers services, such as advertising creation,
     *                 placement, and management, to advertisers.
     *               
     * 
     */
    AGENCY,

    /**
     * 
     *                 A company representing multiple advertisers and agencies.
     *               
     * 
     */
    AD_NETWORK,

    /**
     * 
     *                 A company representing a content owner's affiliate/distribution partner.
     *               
     * 
     */
    AFFILIATE_DISTRIBUTION_PARTNER,

    /**
     * 
     *                 A company representing a distributor's content partner.
     *               
     * 
     */
    CONTENT_PARTNER,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CompanyType fromValue(String v) {
        return valueOf(v);
    }

}


package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignFeed.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignFeed.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignFeed.Status")
@XmlEnum
public enum CampaignFeedStatus {


    /**
     * 
     *                 This CampaignFeed's data is currently being used.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 This CampaignFeed's data is not used anymore.
     *               
     * 
     */
    DELETED,

    /**
     * 
     *                 Unknown status.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CampaignFeedStatus fromValue(String v) {
        return valueOf(v);
    }

}

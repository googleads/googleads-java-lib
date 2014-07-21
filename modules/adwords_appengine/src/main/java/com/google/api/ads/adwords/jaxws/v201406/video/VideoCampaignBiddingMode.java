
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoCampaign.BiddingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoCampaign.BiddingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTO"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoCampaign.BiddingMode")
@XmlEnum
public enum VideoCampaignBiddingMode {

    AUTO,

    /**
     * 
     *                 Manual bidding.
     *               
     * 
     */
    MANUAL,

    /**
     * 
     *                 No value has been set.
     *               
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static VideoCampaignBiddingMode fromValue(String v) {
        return valueOf(v);
    }

}

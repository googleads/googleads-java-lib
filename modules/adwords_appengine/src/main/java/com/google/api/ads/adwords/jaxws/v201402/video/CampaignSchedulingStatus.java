
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignSchedulingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignSchedulingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNAVAILABLE"/>
 *     &lt;enumeration value="CURRENT"/>
 *     &lt;enumeration value="ENDED"/>
 *     &lt;enumeration value="PENDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignSchedulingStatus")
@XmlEnum
public enum CampaignSchedulingStatus {

    UNAVAILABLE,
    CURRENT,
    ENDED,
    PENDING;

    public String value() {
        return name();
    }

    public static CampaignSchedulingStatus fromValue(String v) {
        return valueOf(v);
    }

}

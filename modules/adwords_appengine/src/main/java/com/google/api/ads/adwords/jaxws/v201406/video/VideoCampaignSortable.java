
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoCampaignSortable.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoCampaignSortable">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUDGET_AMOUNT"/>
 *     &lt;enumeration value="CAMPAIGN_ID"/>
 *     &lt;enumeration value="END_DATE"/>
 *     &lt;enumeration value="NAME"/>
 *     &lt;enumeration value="START_DATE"/>
 *     &lt;enumeration value="STATUS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoCampaignSortable")
@XmlEnum
public enum VideoCampaignSortable {

    BUDGET_AMOUNT,
    CAMPAIGN_ID,
    END_DATE,
    NAME,
    START_DATE,
    STATUS,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static VideoCampaignSortable fromValue(String v) {
        return valueOf(v);
    }

}

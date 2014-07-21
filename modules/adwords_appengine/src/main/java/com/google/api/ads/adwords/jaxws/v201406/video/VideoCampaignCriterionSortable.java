
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoCampaignCriterionSortable.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoCampaignCriterionSortable">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAMPAIGN_ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoCampaignCriterionSortable")
@XmlEnum
public enum VideoCampaignCriterionSortable {

    CAMPAIGN_ID;

    public String value() {
        return name();
    }

    public static VideoCampaignCriterionSortable fromValue(String v) {
        return valueOf(v);
    }

}

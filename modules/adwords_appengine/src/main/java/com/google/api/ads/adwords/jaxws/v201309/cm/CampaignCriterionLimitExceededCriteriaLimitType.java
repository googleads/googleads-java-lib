
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignCriterionLimitExceeded.CriteriaLimitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignCriterionLimitExceeded.CriteriaLimitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAMPAIGN_CRITERIA"/>
 *     &lt;enumeration value="CAMPAIGN_NEGATIVE_KEYWORD"/>
 *     &lt;enumeration value="CAMPAIGN_NEGATIVE_WEBSITE"/>
 *     &lt;enumeration value="CAMPAIGN_LOCATION_CRITERIA"/>
 *     &lt;enumeration value="CAMPAIGN_PROXIMITY_CRITERIA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignCriterionLimitExceeded.CriteriaLimitType")
@XmlEnum
public enum CampaignCriterionLimitExceededCriteriaLimitType {

    CAMPAIGN_CRITERIA,
    CAMPAIGN_NEGATIVE_KEYWORD,
    CAMPAIGN_NEGATIVE_WEBSITE,
    CAMPAIGN_LOCATION_CRITERIA,
    CAMPAIGN_PROXIMITY_CRITERIA;

    public String value() {
        return name();
    }

    public static CampaignCriterionLimitExceededCriteriaLimitType fromValue(String v) {
        return valueOf(v);
    }

}

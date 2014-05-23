
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoCampaignCriterionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoCampaignCriterionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="INVALID_CRITERION_USE"/>
 *     &lt;enumeration value="INVALID_CRITERION_TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoCampaignCriterionError.Reason")
@XmlEnum
public enum VideoCampaignCriterionErrorReason {

    UNKNOWN,
    INVALID_CRITERION_USE,
    INVALID_CRITERION_TYPE;

    public String value() {
        return name();
    }

    public static VideoCampaignCriterionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}


package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupCriterionLimitExceeded.CriteriaLimitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupCriterionLimitExceeded.CriteriaLimitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADGROUP_KEYWORD"/>
 *     &lt;enumeration value="ADGROUP_WEBSITE"/>
 *     &lt;enumeration value="ADGROUP_CRITERION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupCriterionLimitExceeded.CriteriaLimitType")
@XmlEnum
public enum AdGroupCriterionLimitExceededCriteriaLimitType {

    ADGROUP_KEYWORD,
    ADGROUP_WEBSITE,
    ADGROUP_CRITERION,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdGroupCriterionLimitExceededCriteriaLimitType fromValue(String v) {
        return valueOf(v);
    }

}

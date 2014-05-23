
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceAge.AgeRange.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudienceAge.AgeRange">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGE_RANGE_18_24"/>
 *     &lt;enumeration value="AGE_RANGE_25_34"/>
 *     &lt;enumeration value="AGE_RANGE_35_44"/>
 *     &lt;enumeration value="AGE_RANGE_45_54"/>
 *     &lt;enumeration value="AGE_RANGE_55_64"/>
 *     &lt;enumeration value="AGE_RANGE_65_UP"/>
 *     &lt;enumeration value="AGE_RANGE_UNDETERMINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudienceAge.AgeRange")
@XmlEnum
public enum AudienceAgeAgeRange {

    AGE_RANGE_18_24,
    AGE_RANGE_25_34,
    AGE_RANGE_35_44,
    AGE_RANGE_45_54,
    AGE_RANGE_55_64,
    AGE_RANGE_65_UP,
    AGE_RANGE_UNDETERMINED;

    public String value() {
        return name();
    }

    public static AudienceAgeAgeRange fromValue(String v) {
        return valueOf(v);
    }

}

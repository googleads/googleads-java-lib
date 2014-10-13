
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gender.GenderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Gender.GenderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENDER_MALE"/>
 *     &lt;enumeration value="GENDER_FEMALE"/>
 *     &lt;enumeration value="GENDER_UNDETERMINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Gender.GenderType")
@XmlEnum
public enum GenderGenderType {

    GENDER_MALE,
    GENDER_FEMALE,
    GENDER_UNDETERMINED;

    public String value() {
        return name();
    }

    public static GenderGenderType fromValue(String v) {
        return valueOf(v);
    }

}

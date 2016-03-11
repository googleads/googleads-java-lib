
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpGender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrpGender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="GENDER_UNKNOWN"/>
 *     &lt;enumeration value="GENDER_FEMALE"/>
 *     &lt;enumeration value="GENDER_MALE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrpGender")
@XmlEnum
public enum GrpGender {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 When gender is not available due to low impression levels, GRP privacy thresholds are activated
     *                 and prevent us from specifying gender.
     *               
     * 
     */
    GENDER_UNKNOWN,
    GENDER_FEMALE,
    GENDER_MALE;

    public String value() {
        return name();
    }

    public static GrpGender fromValue(String v) {
        return valueOf(v);
    }

}

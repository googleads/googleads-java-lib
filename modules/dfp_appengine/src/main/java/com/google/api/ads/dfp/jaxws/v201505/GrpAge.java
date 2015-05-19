
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpAge.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrpAge">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="AGE_UNKNOWN"/>
 *     &lt;enumeration value="AGE_0_TO_17"/>
 *     &lt;enumeration value="AGE_18_TO_24"/>
 *     &lt;enumeration value="AGE_25_TO_34"/>
 *     &lt;enumeration value="AGE_35_TO_44"/>
 *     &lt;enumeration value="AGE_45_TO_54"/>
 *     &lt;enumeration value="AGE_55_TO_64"/>
 *     &lt;enumeration value="AGE_65_PLUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrpAge")
@XmlEnum
public enum GrpAge {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 When the age range is not available due to low impression levels, GRP privacy thresholds are
     *                 activated and prevent us from specifying age.
     *               
     * 
     */
    AGE_UNKNOWN,
    AGE_0_TO_17,
    AGE_18_TO_24,
    AGE_25_TO_34,
    AGE_35_TO_44,
    AGE_45_TO_54,
    AGE_55_TO_64,
    AGE_65_PLUS;

    public String value() {
        return name();
    }

    public static GrpAge fromValue(String v) {
        return valueOf(v);
    }

}

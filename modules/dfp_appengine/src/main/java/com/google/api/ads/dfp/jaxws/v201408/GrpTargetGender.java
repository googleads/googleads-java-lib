
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpTargetGender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrpTargetGender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="MALE"/>
 *     &lt;enumeration value="FEMALE"/>
 *     &lt;enumeration value="BOTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrpTargetGender")
@XmlEnum
public enum GrpTargetGender {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Indicates that the GRP target gender is Male.
     *               
     * 
     */
    MALE,

    /**
     * 
     *                 Indicates that the GRP target gender is Female.
     *               
     * 
     */
    FEMALE,

    /**
     * 
     *                 Indicates that the GRP target gender is both male and female.
     *               
     * 
     */
    BOTH;

    public String value() {
        return name();
    }

    public static GrpTargetGender fromValue(String v) {
        return valueOf(v);
    }

}

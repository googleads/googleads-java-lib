
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoBumperType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoBumperType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BEFORE"/>
 *     &lt;enumeration value="AFTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoBumperType")
@XmlEnum
public enum VideoBumperType {


    /**
     * 
     *                 Represents the bumper position before the ad pod.
     *               
     * 
     */
    BEFORE,

    /**
     * 
     *                 Represents the bumper position after the ad pod.
     *               
     * 
     */
    AFTER;

    public String value() {
        return name();
    }

    public static VideoBumperType fromValue(String v) {
        return valueOf(v);
    }

}

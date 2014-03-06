
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoPodPositionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoPodPositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIRST"/>
 *     &lt;enumeration value="LAST"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoPodPositionType")
@XmlEnum
public enum VideoPodPositionType {


    /**
     * 
     *                 Represents the first position in an ad pod.
     *               
     * 
     */
    FIRST,

    /**
     * 
     *                 Represents the last position in an ad pod.
     *               
     * 
     */
    LAST,

    /**
     * 
     *                 The pod position type is unknown, most likely due to an incompatible API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static VideoPodPositionType fromValue(String v) {
        return valueOf(v);
    }

}

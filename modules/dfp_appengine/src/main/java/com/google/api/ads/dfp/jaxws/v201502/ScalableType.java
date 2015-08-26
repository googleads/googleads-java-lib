
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScalableType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScalableType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NOT_SCALABLE"/>
 *     &lt;enumeration value="RATIO_SCALABLE"/>
 *     &lt;enumeration value="STRETCH_SCALABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScalableType")
@XmlEnum
public enum ScalableType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The creative should not be scaled.
     *               
     * 
     */
    NOT_SCALABLE,

    /**
     * 
     *                 The creative can be scaled and its aspect-ratio must be maintained.
     *               
     * 
     */
    RATIO_SCALABLE,

    /**
     * 
     *                 The creative can be scaled and its aspect-ratio can be distorted.
     *               
     * 
     */
    STRETCH_SCALABLE;

    public String value() {
        return name();
    }

    public static ScalableType fromValue(String v) {
        return valueOf(v);
    }

}

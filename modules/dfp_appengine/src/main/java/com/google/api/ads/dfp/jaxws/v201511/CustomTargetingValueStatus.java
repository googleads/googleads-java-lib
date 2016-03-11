
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomTargetingValue.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomTargetingValue.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomTargetingValue.Status")
@XmlEnum
public enum CustomTargetingValueStatus {


    /**
     * 
     *                 The object is active.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 The object is no longer active.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested
     *                 API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CustomTargetingValueStatus fromValue(String v) {
        return valueOf(v);
    }

}

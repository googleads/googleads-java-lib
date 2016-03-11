
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredCollectionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequiredCollectionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUIRED"/>
 *     &lt;enumeration value="TOO_LARGE"/>
 *     &lt;enumeration value="TOO_SMALL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequiredCollectionError.Reason")
@XmlEnum
public enum RequiredCollectionErrorReason {


    /**
     * 
     *                 A required collection is missing.
     *               
     * 
     */
    REQUIRED,

    /**
     * 
     *                 Collection size is too large.
     *               
     * 
     */
    TOO_LARGE,

    /**
     * 
     *                 Collection size is too small.
     *               
     * 
     */
    TOO_SMALL,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static RequiredCollectionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}


package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersistenceError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersistenceError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOAD_FAILED"/>
 *     &lt;enumeration value="SAVE_FAILED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersistenceError.Reason")
@XmlEnum
public enum PersistenceErrorReason {


    /**
     * 
     *                 Loading from the persistence layer timed out or was unable to connect.
     *               
     * 
     */
    LOAD_FAILED,

    /**
     * 
     *                 Write to the persistence layer failed or was unable to connect.
     *               
     * 
     */
    SAVE_FAILED,

    /**
     * 
     *                 Unspecified.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static PersistenceErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

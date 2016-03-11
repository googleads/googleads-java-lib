
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedItemValidationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedItemValidationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNCHECKED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="VALID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedItemValidationStatus")
@XmlEnum
public enum FeedItemValidationStatus {


    /**
     * 
     *                 Validation pending.
     *               
     * 
     */
    UNCHECKED,

    /**
     * 
     *                 An error was found.
     *               
     * 
     */
    ERROR,

    /**
     * 
     *                 FeedItem is semantically well-formed.
     *               
     * 
     */
    VALID;

    public String value() {
        return name();
    }

    public static FeedItemValidationStatus fromValue(String v) {
        return valueOf(v);
    }

}

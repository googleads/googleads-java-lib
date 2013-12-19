
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedItemValidationDetail.ValidationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedItemValidationDetail.ValidationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="UNCHECKED"/>
 *     &lt;enumeration value="VALID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedItemValidationDetail.ValidationStatus")
@XmlEnum
public enum FeedItemValidationDetailValidationStatus {


    /**
     * 
     *                 An error was found.
     *               
     * 
     */
    ERROR,

    /**
     * 
     *                 Validation pending.
     *               
     * 
     */
    UNCHECKED,

    /**
     * 
     *                 Feed item is semantically well-formed.
     *               
     * 
     */
    VALID;

    public String value() {
        return name();
    }

    public static FeedItemValidationDetailValidationStatus fromValue(String v) {
        return valueOf(v);
    }

}

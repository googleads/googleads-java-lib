
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequiredError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequiredError.Reason")
@XmlEnum
public enum RequiredErrorReason {


    /**
     * 
     *                 Missing required field.
     *               
     * 
     */
    REQUIRED;

    public String value() {
        return name();
    }

    public static RequiredErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

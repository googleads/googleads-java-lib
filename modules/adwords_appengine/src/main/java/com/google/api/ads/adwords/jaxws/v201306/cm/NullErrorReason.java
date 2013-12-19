
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NullError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NullError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NULL_CONTENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NullError.Reason")
@XmlEnum
public enum NullErrorReason {


    /**
     * 
     *                 Specified list/container must not contain any null elements
     *               
     * 
     */
    NULL_CONTENT;

    public String value() {
        return name();
    }

    public static NullErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

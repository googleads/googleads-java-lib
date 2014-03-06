
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotWhitelistedError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotWhitelistedError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOMER_NOT_WHITELISTED_FOR_API"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotWhitelistedError.Reason")
@XmlEnum
public enum NotWhitelistedErrorReason {


    /**
     * 
     *                 Customer is not whitelisted for accessing the API.
     *               
     * 
     */
    CUSTOMER_NOT_WHITELISTED_FOR_API;

    public String value() {
        return name();
    }

    public static NotWhitelistedErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

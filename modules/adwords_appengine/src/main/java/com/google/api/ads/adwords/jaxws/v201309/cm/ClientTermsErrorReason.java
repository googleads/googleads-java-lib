
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientTermsError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientTermsError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCOMPLETE_SIGNUP_CURRENT_ADWORDS_TNC_NOT_AGREED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClientTermsError.Reason")
@XmlEnum
public enum ClientTermsErrorReason {


    /**
     * 
     *                 Customer has not agreed to the latest AdWords Terms & Conditions
     *               
     * 
     */
    INCOMPLETE_SIGNUP_CURRENT_ADWORDS_TNC_NOT_AGREED;

    public String value() {
        return name();
    }

    public static ClientTermsErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

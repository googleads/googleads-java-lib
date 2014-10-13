
package com.google.api.ads.adwords.jaxws.v201409.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCodeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyCodeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNSUPPORTED_CURRENCY_CODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCodeError.Reason")
@XmlEnum
public enum CurrencyCodeErrorReason {

    UNSUPPORTED_CURRENCY_CODE;

    public String value() {
        return name();
    }

    public static CurrencyCodeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

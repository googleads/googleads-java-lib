
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdxError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdxError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNSUPPORTED_FEATURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdxError.Reason")
@XmlEnum
public enum AdxErrorReason {


    /**
     * 
     *                 Attempt to use non-AdX feature by AdX customer.
     *               
     * 
     */
    UNSUPPORTED_FEATURE;

    public String value() {
        return name();
    }

    public static AdxErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

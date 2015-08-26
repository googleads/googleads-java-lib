
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentPartnerError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentPartnerError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEATURE_NOT_ENABLED"/>
 *     &lt;enumeration value="INVALID_PARTNER_TYPE"/>
 *     &lt;enumeration value="NO_PARTNER_CATCH_ALL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentPartnerError.Reason")
@XmlEnum
public enum ContentPartnerErrorReason {


    /**
     * 
     *                 Can not assign partner if financial term feature is not enabled.
     *               
     * 
     */
    FEATURE_NOT_ENABLED,

    /**
     * 
     *                 Only {@code CONTENT_PARTNER} type is allowed.
     *               
     * 
     */
    INVALID_PARTNER_TYPE,

    /**
     * 
     *                 The assigned partner does not have a catch-all financial term.
     *               
     * 
     */
    NO_PARTNER_CATCH_ALL,

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

    public static ContentPartnerErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

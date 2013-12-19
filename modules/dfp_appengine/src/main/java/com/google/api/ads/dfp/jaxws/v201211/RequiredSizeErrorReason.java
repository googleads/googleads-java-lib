
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredSizeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequiredSizeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUIRED"/>
 *     &lt;enumeration value="NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequiredSizeError.Reason")
@XmlEnum
public enum RequiredSizeErrorReason {


    /**
     * 
     *                 {@link Creative#size} or {@link LineItem#creativeSizes} is
     *                 missing.
     *               
     * 
     */
    REQUIRED,

    /**
     * 
     *                 {@link LineItemCreativeAssociation#sizes} must be a subset of
     *                 {@link LineItem#creativeSizes}.
     *               
     * 
     */
    NOT_ALLOWED,

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

    public static RequiredSizeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}


package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwiffyConversionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwiffyConversionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SERVER_ERROR"/>
 *     &lt;enumeration value="INVALID_FLASH_FILE"/>
 *     &lt;enumeration value="UNSUPPORTED_FLASH"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SwiffyConversionError.Reason")
@XmlEnum
public enum SwiffyConversionErrorReason {


    /**
     * 
     *                 Indicates the Swiffy service has an internal error that prevents the flash
     *                 asset being converted.
     *               
     * 
     */
    SERVER_ERROR,

    /**
     * 
     *                 Indicates the uploaded flash asset is not a valid flash file.
     *               
     * 
     */
    INVALID_FLASH_FILE,

    /**
     * 
     *                 Indicates the Swiffy service currently does not support converting this
     *                 flash asset.
     *               
     * 
     */
    UNSUPPORTED_FLASH,

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

    public static SwiffyConversionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

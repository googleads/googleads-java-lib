
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativeAssetMacroError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeAssetMacroError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_MACRO_NAME"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativeAssetMacroError.Reason")
@XmlEnum
public enum CreativeAssetMacroErrorReason {


    /**
     * 
     *                 Invalid macro name specified. Macro names must start with an alpha
     *                 character and consist only of alpha-numeric characters and underscores
     *                 and be between 1 and 64 characters.
     *               
     * 
     */
    INVALID_MACRO_NAME,

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

    public static CreativeAssetMacroErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

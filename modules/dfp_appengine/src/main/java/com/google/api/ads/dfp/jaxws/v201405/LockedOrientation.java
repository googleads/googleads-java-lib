
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LockedOrientation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LockedOrientation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="FREE_ORIENTATION"/>
 *     &lt;enumeration value="PORTRAIT_ONLY"/>
 *     &lt;enumeration value="LANDSCAPE_ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LockedOrientation")
@XmlEnum
public enum LockedOrientation {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN,
    FREE_ORIENTATION,
    PORTRAIT_ONLY,
    LANDSCAPE_ONLY;

    public String value() {
        return name();
    }

    public static LockedOrientation fromValue(String v) {
        return valueOf(v);
    }

}

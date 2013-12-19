
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartSizeMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmartSizeMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="SMART_BANNER"/>
 *     &lt;enumeration value="DYNAMIC_SIZE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmartSizeMode")
@XmlEnum
public enum SmartSizeMode {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested
     *                 API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Fixed size mode (default).
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 The height is fixed for the request, the width is a range.
     *               
     * 
     */
    SMART_BANNER,

    /**
     * 
     *                 Height and width are ranges.
     *               
     * 
     */
    DYNAMIC_SIZE;

    public String value() {
        return name();
    }

    public static SmartSizeMode fromValue(String v) {
        return valueOf(v);
    }

}

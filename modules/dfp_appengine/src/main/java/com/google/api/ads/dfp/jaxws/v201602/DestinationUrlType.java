
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestinationUrlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DestinationUrlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CLICK_TO_WEB"/>
 *     &lt;enumeration value="CLICK_TO_APP"/>
 *     &lt;enumeration value="CLICK_TO_CALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DestinationUrlType")
@XmlEnum
public enum DestinationUrlType {


    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Navigate to a web page. (a.k.a. "Click-through URL").
     *               
     * 
     */
    CLICK_TO_WEB,

    /**
     * 
     *                 Start an application.
     *               
     * 
     */
    CLICK_TO_APP,

    /**
     * 
     *                 Make a phone call.
     *               
     * 
     */
    CLICK_TO_CALL;

    public String value() {
        return name();
    }

    public static DestinationUrlType fromValue(String v) {
        return valueOf(v);
    }

}

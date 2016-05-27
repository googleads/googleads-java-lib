
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestContextOperand.ContextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestContextOperand.ContextType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEED_ITEM_ID"/>
 *     &lt;enumeration value="DEVICE_PLATFORM"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestContextOperand.ContextType")
@XmlEnum
public enum RequestContextOperandContextType {


    /**
     * 
     *                 Feed item id in the request context.
     *               
     * 
     */
    FEED_ITEM_ID,

    /**
     * 
     *                 The device's platform (possible values are 'Desktop' or 'Mobile').
     *               
     * 
     */
    DEVICE_PLATFORM,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static RequestContextOperandContextType fromValue(String v) {
        return valueOf(v);
    }

}

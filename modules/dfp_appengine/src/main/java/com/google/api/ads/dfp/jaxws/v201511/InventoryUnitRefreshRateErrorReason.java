
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryUnitRefreshRateError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryUnitRefreshRateError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_RANGE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryUnitRefreshRateError.Reason")
@XmlEnum
public enum InventoryUnitRefreshRateErrorReason {


    /**
     * 
     *                 The refresh rate must be between 30 and 120 seconds.
     *               
     * 
     */
    INVALID_RANGE,

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

    public static InventoryUnitRefreshRateErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

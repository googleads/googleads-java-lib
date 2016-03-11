
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CPM"/>
 *     &lt;enumeration value="CPC"/>
 *     &lt;enumeration value="CPD"/>
 *     &lt;enumeration value="CPU"/>
 *     &lt;enumeration value="FLAT_FEE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateType")
@XmlEnum
public enum RateType {


    /**
     * 
     *                 The rate applies to cost per mille (CPM) revenue.
     *               
     * 
     */
    CPM,

    /**
     * 
     *                 The rate applies to cost per click (CPC) revenue.
     *               
     * 
     */
    CPC,

    /**
     * 
     *                 The rate applies to cost per day (CPD) revenue.
     *               
     * 
     */
    CPD,

    /**
     * 
     *                 The rate applies to cost per unit (CPU) revenue.
     *               
     * 
     */
    CPU,

    /**
     * 
     *                 The rate applies to flat fee revenue.
     *               
     * 
     */
    FLAT_FEE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static RateType fromValue(String v) {
        return valueOf(v);
    }

}

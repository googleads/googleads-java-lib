
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductStatus")
@XmlEnum
public enum ProductStatus {


    /**
     * 
     *                 Accessible to sales person.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Not accessible to sales person.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 Products can no longer be used.
     *               
     * 
     */
    ARCHIVED,

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

    public static ProductStatus fromValue(String v) {
        return valueOf(v);
    }

}

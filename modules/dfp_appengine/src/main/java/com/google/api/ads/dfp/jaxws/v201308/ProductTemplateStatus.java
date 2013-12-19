
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductTemplateStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductTemplateStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="CANCELED"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductTemplateStatus")
@XmlEnum
public enum ProductTemplateStatus {


    /**
     * 
     *                 Product template is active, and all products it generates without status overridden
     *                 are available in product catalog.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Not used.
     *               
     * 
     */
    DRAFT,

    /**
     * 
     *                 Product template is inactive, no product is generated.
     *               
     * 
     */
    CANCELED,

    /**
     * 
     *                 No unarchived proposal should reference this template and report on it.
     *                 All persisted products based on this product template are archived as well.
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

    public static ProductTemplateStatus fromValue(String v) {
        return valueOf(v);
    }

}

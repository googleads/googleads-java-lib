
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArchiveStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArchiveStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARCHIVED"/>
 *     &lt;enumeration value="NOT_ARCHIVED"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE_ARCHIVED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ArchiveStatus")
@XmlEnum
public enum ArchiveStatus {


    /**
     * 
     *                 Product package item is archived
     *               
     * 
     */
    ARCHIVED,

    /**
     * 
     *                 Product package item is not archived
     *               
     * 
     */
    NOT_ARCHIVED,

    /**
     * 
     *                 The corresponding product template of this product package item is archived.
     *               
     * 
     */
    PRODUCT_TEMPLATE_ARCHIVED,

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

    public static ArchiveStatus fromValue(String v) {
        return valueOf(v);
    }

}

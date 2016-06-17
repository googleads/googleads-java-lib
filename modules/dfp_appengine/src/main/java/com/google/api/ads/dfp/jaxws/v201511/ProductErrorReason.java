
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEMPLATE_NOT_FOUND"/>
 *     &lt;enumeration value="MALFORMED_PRODUCT_ID"/>
 *     &lt;enumeration value="BAD_PRODUCT_ID_FEATURE"/>
 *     &lt;enumeration value="BAD_PRODUCT_TEMPLATE_ID"/>
 *     &lt;enumeration value="CANNOT_UPDATE_ARCHIVED_PRODUCT"/>
 *     &lt;enumeration value="QUERY_TOO_LARGE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductError.Reason")
@XmlEnum
public enum ProductErrorReason {


    /**
     * 
     *                 The specified template is not found.
     *               
     * 
     */
    TEMPLATE_NOT_FOUND,

    /**
     * 
     *                 The product ID is not correctly formed.
     *               
     * 
     */
    MALFORMED_PRODUCT_ID,

    /**
     * 
     *                 The product ID does not match the expanded features configured in its product template.
     *               
     * 
     */
    BAD_PRODUCT_ID_FEATURE,

    /**
     * 
     *                 The product template ID specified in the parameters does not match the product template ID
     *                 implied in the product ID.
     *               
     * 
     */
    BAD_PRODUCT_TEMPLATE_ID,

    /**
     * 
     *                 Cannot update an archived product.
     *               
     * 
     */
    CANNOT_UPDATE_ARCHIVED_PRODUCT,

    /**
     * 
     *                 The query is too large to be processed.
     *               
     * 
     */
    QUERY_TOO_LARGE,

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

    public static ProductErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

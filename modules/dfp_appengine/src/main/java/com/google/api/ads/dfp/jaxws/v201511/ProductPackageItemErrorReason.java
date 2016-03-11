
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductPackageItemError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductPackageItemError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARCHIVED_PRODUCT_NOT_ALLOWED"/>
 *     &lt;enumeration value="INACTIVE_MANDATORY_PRODUCT_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductPackageItemError.Reason")
@XmlEnum
public enum ProductPackageItemErrorReason {


    /**
     * 
     *                 Add a archived product to product package is not allowed.
     *               
     * 
     */
    ARCHIVED_PRODUCT_NOT_ALLOWED,

    /**
     * 
     *                 Inactive mandatory product is not allowed in active product package.
     *               
     * 
     */
    INACTIVE_MANDATORY_PRODUCT_NOT_ALLOWED,

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

    public static ProductPackageItemErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

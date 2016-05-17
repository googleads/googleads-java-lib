
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductPackageRateCardAssociationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductPackageRateCardAssociationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_RATE_CARD_ID"/>
 *     &lt;enumeration value="INVALID_PRODUCT_PACKAGE_ID"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductPackageRateCardAssociationError.Reason")
@XmlEnum
public enum ProductPackageRateCardAssociationErrorReason {


    /**
     * 
     *                 The id of associated rate card is invalid or invisible to user.
     *               
     * 
     */
    INVALID_RATE_CARD_ID,

    /**
     * 
     *                 The id of associated package is invalid.
     *               
     * 
     */
    INVALID_PRODUCT_PACKAGE_ID,

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

    public static ProductPackageRateCardAssociationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

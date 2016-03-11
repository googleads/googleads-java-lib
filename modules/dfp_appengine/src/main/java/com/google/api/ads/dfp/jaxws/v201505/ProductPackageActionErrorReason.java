
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductPackageActionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductPackageActionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVATE_WITH_INACTIVE_MANDATORY_PRODUCT"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductPackageActionError.Reason")
@XmlEnum
public enum ProductPackageActionErrorReason {


    /**
     * 
     *                 The activate operation is not applicable if there's any inactive mandatory product.
     *               
     * 
     */
    ACTIVATE_WITH_INACTIVE_MANDATORY_PRODUCT,

    /**
     * 
     *                 The operation is not applicable to the current state.
     *               
     * 
     */
    NOT_APPLICABLE,

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

    public static ProductPackageActionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

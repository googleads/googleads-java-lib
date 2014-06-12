
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateCardCustomizationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateCardCustomizationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_RATE_TYPE"/>
 *     &lt;enumeration value="CANNOT_ADD_TO_GROUP_BY_PRICING_METHOD"/>
 *     &lt;enumeration value="FEATURE_NOT_BELONGS_TO_GROUP"/>
 *     &lt;enumeration value="UNSUPPORTED_OPERATION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateCardCustomizationError.Reason")
@XmlEnum
public enum RateCardCustomizationErrorReason {


    /**
     * 
     *                 The rate type is invalid.
     *               
     * 
     */
    INVALID_RATE_TYPE,

    /**
     * 
     *                 The {@link RateCardCustomization} cannot be added to the
     *                 {@link RateCardCustomizationGroup} because the limitation of
     *                 {@link RateCardCustomizationGroup#pricingMethod}.
     *               
     * 
     */
    CANNOT_ADD_TO_GROUP_BY_PRICING_METHOD,

    /**
     * 
     *                 The {@link RateCardFeature} of this group does not apply to this
     *                 {@link RateCardCustomization}.
     *               
     * 
     */
    FEATURE_NOT_BELONGS_TO_GROUP,

    /**
     * 
     *                 Indicates that the requested operation is not supported.
     *               
     * 
     */
    UNSUPPORTED_OPERATION,

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

    public static RateCardCustomizationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

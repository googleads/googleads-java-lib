
package com.google.api.ads.dfp.jaxws.v201403;

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
 *     &lt;enumeration value="GROUP_FOR_FEATURE_ALREADY_EXISTS"/>
 *     &lt;enumeration value="FEATURE_NOT_BELONGS_TO_GROUP"/>
 *     &lt;enumeration value="SAME_GROUP_DIFFERENT_FEATURE"/>
 *     &lt;enumeration value="DIFFERENT_GROUP_SAME_FEATURE"/>
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
     *                 A group for this {@link RateCardFeature} already exists.
     *               
     * 
     */
    GROUP_FOR_FEATURE_ALREADY_EXISTS,

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
     *                 The {@link RateCardCustomization} objects in the same
     *                 {@link RateCardCustomizationGroup} have different
     *                 {@link RateCardFeature}.
     *               
     * 
     */
    SAME_GROUP_DIFFERENT_FEATURE,

    /**
     * 
     *                 The {@link RateCardCustomization} in the different
     *                 {@link RateCardCustomiationGroup} has the same {@link RateCardFeature}.
     *               
     * 
     */
    DIFFERENT_GROUP_SAME_FEATURE,

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

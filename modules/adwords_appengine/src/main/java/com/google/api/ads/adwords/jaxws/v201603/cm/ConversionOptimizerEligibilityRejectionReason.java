
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionOptimizerEligibility.RejectionReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionOptimizerEligibility.RejectionReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAMPAIGN_IS_NOT_ACTIVE"/>
 *     &lt;enumeration value="NOT_CPC_CAMPAIGN"/>
 *     &lt;enumeration value="CONVERSION_TRACKING_NOT_ENABLED"/>
 *     &lt;enumeration value="NOT_ENOUGH_CONVERSIONS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionOptimizerEligibility.RejectionReason")
@XmlEnum
public enum ConversionOptimizerEligibilityRejectionReason {


    /**
     * 
     *                 Campaign is not active
     *               
     * 
     */
    CAMPAIGN_IS_NOT_ACTIVE,

    /**
     * 
     *                 Conversion optimizer is available to only Manual CPC campaign
     *               
     * 
     */
    NOT_CPC_CAMPAIGN,

    /**
     * 
     *                 Conversion tracking is not enabled for the Campaign
     *               
     * 
     */
    CONVERSION_TRACKING_NOT_ENABLED,

    /**
     * 
     *                 The campaign does not meet the requirement to have a sufficient count
     *                 of conversions.
     *               
     * 
     */
    NOT_ENOUGH_CONVERSIONS,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ConversionOptimizerEligibilityRejectionReason fromValue(String v) {
        return valueOf(v);
    }

}

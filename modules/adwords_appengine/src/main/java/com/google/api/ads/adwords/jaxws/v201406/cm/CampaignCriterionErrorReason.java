
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignCriterionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignCriterionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONCRETE_TYPE_REQUIRED"/>
 *     &lt;enumeration value="INVALID_PLACEMENT_URL"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_CRITERIA_TYPE"/>
 *     &lt;enumeration value="CANNOT_TARGET_AND_EXCLUDE"/>
 *     &lt;enumeration value="TOO_MANY_OPERTAIONS"/>
 *     &lt;enumeration value="OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE"/>
 *     &lt;enumeration value="SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CANNOT_ADD_EXISTING_FIELD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignCriterionError.Reason")
@XmlEnum
public enum CampaignCriterionErrorReason {


    /**
     * 
     *                 Concrete type of criterion (keyword v.s. placement) is required for
     *                 ADD and SET operations.
     *               
     * 
     */
    CONCRETE_TYPE_REQUIRED,

    /**
     * 
     *                 Invalid placement URL.
     *               
     * 
     */
    INVALID_PLACEMENT_URL,

    /**
     * 
     *                 Criteria type can not be excluded for the campaign by the customer.
     *                 like AOL account type cannot target site type criteria
     *               
     * 
     */
    CANNOT_EXCLUDE_CRITERIA_TYPE,

    /**
     * 
     *                 Cannot target and exclude the same criterion.
     *               
     * 
     */
    CANNOT_TARGET_AND_EXCLUDE,

    /**
     * 
     *                 The #mutate operation contained too many operations.
     *               
     * 
     */
    TOO_MANY_OPERTAIONS,

    /**
     * 
     *                 This operator cannot be applied to a criterion of this type.
     *               
     * 
     */
    OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE,

    /**
     * 
     *                 The Shopping campaign sales country is not supported for ProductSalesChannel targeting.
     *               
     * 
     */
    SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL,
    UNKNOWN,

    /**
     * 
     *                 The existing field can't be updated with ADD operation. It can be updated with
     *                 SET operation only.
     *               
     * 
     */
    CANNOT_ADD_EXISTING_FIELD;

    public String value() {
        return name();
    }

    public static CampaignCriterionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

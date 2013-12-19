
package com.google.api.ads.adwords.jaxws.v201306.cm;

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
 *     &lt;enumeration value="CRITERIA_QUOTA_EXCEEDED"/>
 *     &lt;enumeration value="CONCRETE_TYPE_REQUIRED"/>
 *     &lt;enumeration value="ID_FILTERS_HAVE_DIFF_FIELDS_SET"/>
 *     &lt;enumeration value="INVALID_EXCLUDED_CATEGORY"/>
 *     &lt;enumeration value="INVALID_KEYWORD_TEXT"/>
 *     &lt;enumeration value="INVALID_PLACEMENT_URL"/>
 *     &lt;enumeration value="INVALID_VERTICAL_PATH"/>
 *     &lt;enumeration value="LICENSED_USERLISTS_NOT_ALLOWED"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_ALL_PLATFORMS"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_CRITERIA_TYPE"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_PLATFORM_CRITERION"/>
 *     &lt;enumeration value="CANNOT_TARGET_AND_EXCLUDE"/>
 *     &lt;enumeration value="TOO_MANY_OPERTAIONS"/>
 *     &lt;enumeration value="OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
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
     *                 The operation would result in more campaign criteria than allowed.
     *               
     * 
     */
    CRITERIA_QUOTA_EXCEEDED,

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
     *                 Id filters have different combinations of field settings (they
     *                 should all be the same).
     *               
     * 
     */
    ID_FILTERS_HAVE_DIFF_FIELDS_SET,

    /**
     * 
     *                 The category requested for exclusion is invalid.
     *               
     * 
     */
    INVALID_EXCLUDED_CATEGORY,

    /**
     * 
     *                 Invalid keyword criteria text.
     *               
     * 
     */
    INVALID_KEYWORD_TEXT,

    /**
     * 
     *                 Invalid placement URL.
     *               
     * 
     */
    INVALID_PLACEMENT_URL,

    /**
     * 
     *                 Invalid vertical path
     *               
     * 
     */
    INVALID_VERTICAL_PATH,

    /**
     * 
     *                 Not allowed to exclude licensed user list.
     *               
     * 
     */
    LICENSED_USERLISTS_NOT_ALLOWED,

    /**
     * 
     *                 Cannot exclude all platforms.
     *               
     * 
     */
    CANNOT_EXCLUDE_ALL_PLATFORMS,

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
     *                 Cannot exclude platform criterion, i.e. this platform criterion has been already excluded.
     *               
     * 
     */
    CANNOT_EXCLUDE_PLATFORM_CRITERION,

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
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CampaignCriterionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

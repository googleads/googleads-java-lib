
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupCriterionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupCriterionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_ID_FILTER_TYPE"/>
 *     &lt;enumeration value="ID_FILTERS_HAVE_DIFF_FIELDS_SET"/>
 *     &lt;enumeration value="INAPPLICABLE_FOR_NEGATIVE"/>
 *     &lt;enumeration value="INAPPLICABLE_FILTER_SPECIFIED"/>
 *     &lt;enumeration value="TOO_MANY_OPERTAIONS"/>
 *     &lt;enumeration value="CANT_UPDATE_NEGATIVE"/>
 *     &lt;enumeration value="TYPE_MISMATCH"/>
 *     &lt;enumeration value="CONCRETE_TYPE_REQUIRED"/>
 *     &lt;enumeration value="BID_INCOMPATIBLE_WITH_ADGROUP"/>
 *     &lt;enumeration value="NETWORK_NOT_OVERRIDABLE"/>
 *     &lt;enumeration value="CURRENCY_MISMATCH"/>
 *     &lt;enumeration value="CRITERION_NOT_TARGETED"/>
 *     &lt;enumeration value="CANNOT_TARGET_AND_EXCLUDE"/>
 *     &lt;enumeration value="ILLEGAL_URL"/>
 *     &lt;enumeration value="INVALID_VERTICAL_PATH"/>
 *     &lt;enumeration value="NO_EFFECTIVE_BID_FOR_THIS_CRITERION"/>
 *     &lt;enumeration value="INVALID_KEYWORD_TEXT"/>
 *     &lt;enumeration value="INVALID_DESTINATION_URL"/>
 *     &lt;enumeration value="MISSING_DESTINATION_URL_TAG"/>
 *     &lt;enumeration value="KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM"/>
 *     &lt;enumeration value="INVALID_USER_STATUS"/>
 *     &lt;enumeration value="CANNOT_ADD_CRITERIA_TYPE"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_CRITERIA_TYPE"/>
 *     &lt;enumeration value="PRODUCT_FILTER_TOO_LONG"/>
 *     &lt;enumeration value="INVALID_PRODUCT_FILTER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupCriterionError.Reason")
@XmlEnum
public enum AdGroupCriterionErrorReason {


    /**
     * 
     *                 The valid field combinations to set in AdGroupCriterionIdFilter are:
     *                 campaignId only, adGroupId only, criterionId only,
     *                 and combination of (adGroupId, criterionId).
     *               
     * 
     */
    INVALID_ID_FILTER_TYPE,

    /**
     * 
     *                 We require the list of AdGroupCriterionIdFilters all have the
     *                 same set of the fields set.  E.g, if one filter has only campaignId
     *                 set, but another has only adGroupId set, then this error gets triggered.
     *                 ID_FILTERS_HAVE_DIFF_FIELDS_SET,
     *               
     * 
     */
    ID_FILTERS_HAVE_DIFF_FIELDS_SET,

    /**
     * 
     *                 When selecting negative criteria, filters may not be
     *                 applied to biddable criteria.
     *               
     * 
     */
    INAPPLICABLE_FOR_NEGATIVE,

    /**
     * 
     *                 One or more filters specified are not applicable.
     *               
     * 
     */
    INAPPLICABLE_FILTER_SPECIFIED,

    /**
     * 
     *                 Too many operations for a single call.
     *               
     * 
     */
    TOO_MANY_OPERTAIONS,

    /**
     * 
     *                 Negative ad group criteria are not updateable.
     *               
     * 
     */
    CANT_UPDATE_NEGATIVE,

    /**
     * 
     *                 The wrong type (for the operation) was used. For example, if attempting
     *                 to update an AdGroupCriterion of an existing adgroup but with a
     *                 different biddability.
     *               
     * 
     */
    TYPE_MISMATCH,

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
     *                 Bid is incompatible with ad group's bidding settings.
     *               
     * 
     */
    BID_INCOMPATIBLE_WITH_ADGROUP,
    NETWORK_NOT_OVERRIDABLE,

    /**
     * 
     *                 There is a mismatch between the given bid's currency and the account's
     *                 currency.
     *               
     * 
     */
    CURRENCY_MISMATCH,

    /**
     * 
     *                 Tried to do an operation for a targeted criterion.
     *               
     * 
     */
    CRITERION_NOT_TARGETED,

    /**
     * 
     *                 Cannot target and exclude the same criterion at once.
     *               
     * 
     */
    CANNOT_TARGET_AND_EXCLUDE,

    /**
     * 
     *                 The URL of a placement is invalid.
     *               
     * 
     */
    ILLEGAL_URL,

    /**
     * 
     *                 The path specified for the vertical is invalid.
     *               
     * 
     */
    INVALID_VERTICAL_PATH,

    /**
     * 
     *                 Adding a criterion to an ad group would result in that criterion not having
     *                 an effective bid under that ad group.
     *               
     * 
     */
    NO_EFFECTIVE_BID_FOR_THIS_CRITERION,

    /**
     * 
     *                 Keyword text was invalid.
     *               
     * 
     */
    INVALID_KEYWORD_TEXT,

    /**
     * 
     *                 Destination URL was invalid.
     *               
     * 
     */
    INVALID_DESTINATION_URL,

    /**
     * 
     *                 The destination url must contain at least one tag (e.g. {lpurl})
     *               
     * 
     */
    MISSING_DESTINATION_URL_TAG,

    /**
     * 
     *                 Keyword-level cpm bid is not supported
     *               
     * 
     */
    KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM,

    /**
     * 
     *                 For example, cannot add deleted biddable ad group criterion.
     *               
     * 
     */
    INVALID_USER_STATUS,

    /**
     * 
     *                 Criteria type cannot be targeted for the ad group. Either the account
     *                 is restricted to keywords only, the criteria type is incompatible
     *                 with the campaign's bidding strategy, or the criteria type can only
     *                 be applied to campaigns.
     *               
     * 
     */
    CANNOT_ADD_CRITERIA_TYPE,

    /**
     * 
     *                 Criteria type cannot be excluded for the ad group. Refer to the
     *                 documentation for a specific criterion to check if it is excludable.
     *               
     * 
     */
    CANNOT_EXCLUDE_CRITERIA_TYPE,

    /**
     * 
     *                 Product filter in the product criteria is translated to a string as
     *                 operand1==argument1&+operand2==argument2, Maximum allowed length for
     *                 the string is 255 chars.
     *               
     * 
     */
    PRODUCT_FILTER_TOO_LONG,

    /**
     * 
     *                 Product filter in the product criteria is has invalid characters,
     *                 Operand and the argument in the filter cannot have "==" or "&+".
     *               
     * 
     */
    INVALID_PRODUCT_FILTER,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdGroupCriterionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

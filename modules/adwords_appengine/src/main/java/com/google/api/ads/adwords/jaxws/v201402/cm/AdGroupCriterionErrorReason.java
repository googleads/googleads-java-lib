
package com.google.api.ads.adwords.jaxws.v201402.cm;

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
 *     &lt;enumeration value="TOO_MANY_OPERTAIONS"/>
 *     &lt;enumeration value="CANT_UPDATE_NEGATIVE"/>
 *     &lt;enumeration value="CONCRETE_TYPE_REQUIRED"/>
 *     &lt;enumeration value="BID_INCOMPATIBLE_WITH_ADGROUP"/>
 *     &lt;enumeration value="CANNOT_TARGET_AND_EXCLUDE"/>
 *     &lt;enumeration value="ILLEGAL_URL"/>
 *     &lt;enumeration value="INVALID_KEYWORD_TEXT"/>
 *     &lt;enumeration value="INVALID_DESTINATION_URL"/>
 *     &lt;enumeration value="MISSING_DESTINATION_URL_TAG"/>
 *     &lt;enumeration value="KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM"/>
 *     &lt;enumeration value="INVALID_USER_STATUS"/>
 *     &lt;enumeration value="CANNOT_ADD_CRITERIA_TYPE"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_CRITERIA_TYPE"/>
 *     &lt;enumeration value="INVALID_PRODUCT_PARTITION_HIERARCHY"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_UNIT_CANNOT_HAVE_CHILDREN"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_SUBDIVISION_REQUIRES_OTHERS_CASE"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_REQUIRES_SAME_DIMENSION_TYPE_AS_SIBLINGS"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_ALREADY_EXISTS"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_DOES_NOT_EXIST"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_CANNOT_BE_REMOVED"/>
 *     &lt;enumeration value="INVALID_PRODUCT_PARTITION_TYPE"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_ADD_MAY_ONLY_USE_TEMP_ID"/>
 *     &lt;enumeration value="OPERATIONS_FOR_TOO_MANY_SHOPPING_ADGROUPS"/>
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
     *                 Ad group is invalid due to the product partitions it contains.
     *               
     * 
     */
    INVALID_PRODUCT_PARTITION_HIERARCHY,

    /**
     * 
     *                 Product partition unit cannot have children.
     *               
     * 
     */
    PRODUCT_PARTITION_UNIT_CANNOT_HAVE_CHILDREN,

    /**
     * 
     *                 Subdivided product partitions must have an "others" case.
     *               
     * 
     */
    PRODUCT_PARTITION_SUBDIVISION_REQUIRES_OTHERS_CASE,

    /**
     * 
     *                 Dimension type of product partition must be the same as that of its siblings.
     *               
     * 
     */
    PRODUCT_PARTITION_REQUIRES_SAME_DIMENSION_TYPE_AS_SIBLINGS,

    /**
     * 
     *                 Product partition cannot be added to the ad group because it already exists.
     *               
     * 
     */
    PRODUCT_PARTITION_ALREADY_EXISTS,

    /**
     * 
     *                 Product partition referenced in the operation was not found in the ad group.
     *               
     * 
     */
    PRODUCT_PARTITION_DOES_NOT_EXIST,

    /**
     * 
     *                 Recursive removal failed because product partition subdivision is being created or modified
     *                 in this request.
     *               
     * 
     */
    PRODUCT_PARTITION_CANNOT_BE_REMOVED,

    /**
     * 
     *                 Product partition type is not allowed for specified AdGroupCriterion type.
     *               
     * 
     */
    INVALID_PRODUCT_PARTITION_TYPE,

    /**
     * 
     *                 Product partition in an ADD operation specifies a non temporary CriterionId.
     *               
     * 
     */
    PRODUCT_PARTITION_ADD_MAY_ONLY_USE_TEMP_ID,

    /**
     * 
     *                 Operations in the mutate request changes too many shopping ad groups. Please split
     *                 requests for multiple shopping ad groups across multiple requests.
     *               
     * 
     */
    OPERATIONS_FOR_TOO_MANY_SHOPPING_ADGROUPS,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdGroupCriterionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

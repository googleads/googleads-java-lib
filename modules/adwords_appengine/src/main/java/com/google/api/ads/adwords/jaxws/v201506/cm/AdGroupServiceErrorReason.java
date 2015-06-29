
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupServiceError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupServiceError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUPLICATE_ADGROUP_NAME"/>
 *     &lt;enumeration value="INVALID_ADGROUP_NAME"/>
 *     &lt;enumeration value="USE_SET_OPERATOR_AND_MARK_STATUS_TO_REMOVED"/>
 *     &lt;enumeration value="ADVERTISER_NOT_ON_CONTENT_NETWORK"/>
 *     &lt;enumeration value="BID_TOO_BIG"/>
 *     &lt;enumeration value="BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH"/>
 *     &lt;enumeration value="MISSING_ADGROUP_NAME"/>
 *     &lt;enumeration value="ADGROUP_LABEL_DOES_NOT_EXIST"/>
 *     &lt;enumeration value="ADGROUP_LABEL_ALREADY_EXISTS"/>
 *     &lt;enumeration value="INVALID_CONTENT_BID_CRITERION_TYPE_GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupServiceError.Reason")
@XmlEnum
public enum AdGroupServiceErrorReason {


    /**
     * 
     *                 AdGroup with the same name already exists for the campaign.
     *               
     * 
     */
    DUPLICATE_ADGROUP_NAME,

    /**
     * 
     *                 AdGroup name is not valid.
     *               
     * 
     */
    INVALID_ADGROUP_NAME,

    /**
     * 
     *                 Cannot remove an adgroup, adgroup status can be marked removed
     *                 using set operator.
     *               
     * 
     */
    USE_SET_OPERATOR_AND_MARK_STATUS_TO_REMOVED,

    /**
     * 
     *                 Advertiser is not allowed to target sites or set site bids that are
     *                 not on the Google Search Network.
     *               
     * 
     */
    ADVERTISER_NOT_ON_CONTENT_NETWORK,

    /**
     * 
     *                 Bid amount is too big.
     *               
     * 
     */
    BID_TOO_BIG,

    /**
     * 
     *                 AdGroup bid does not match the campaign's bidding strategy.
     *               
     * 
     */
    BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH,

    /**
     * 
     *                 AdGroup name is required for Add.
     *               
     * 
     */
    MISSING_ADGROUP_NAME,

    /**
     * 
     *                 No link found between the ad group and the label.
     *               
     * 
     */
    ADGROUP_LABEL_DOES_NOT_EXIST,

    /**
     * 
     *                 The label has already been attached to the ad group.
     *               
     * 
     */
    ADGROUP_LABEL_ALREADY_EXISTS,

    /**
     * 
     *                 The CriterionTypeGroup is not supported for the content bid dimension.
     *               
     * 
     */
    INVALID_CONTENT_BID_CRITERION_TYPE_GROUP;

    public String value() {
        return name();
    }

    public static AdGroupServiceErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

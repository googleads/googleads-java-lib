
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiddingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BID_AMOUNT_REQUIRED"/>
 *     &lt;enumeration value="BID_TOO_SMALL"/>
 *     &lt;enumeration value="BID_TOO_BIG"/>
 *     &lt;enumeration value="BID_TOO_MANY_FRACTIONAL_DIGITS"/>
 *     &lt;enumeration value="NON_POSITIVE_BID"/>
 *     &lt;enumeration value="BID_TOO_HIGH_FOR_DAILY_BUDGET"/>
 *     &lt;enumeration value="BID_TOO_HIGH_FOR_MONTHLY_BUDGET"/>
 *     &lt;enumeration value="MUST_EXCLUDE_0_TO_17_WITH_OTHER_AGE_EXCLUSIONS"/>
 *     &lt;enumeration value="CAMPAIGN_MUST_HAVE_A_BUDGET_TO_ENABLE_BUDGET_OPTIMIZER"/>
 *     &lt;enumeration value="CANNOT_SET_CONTENT_BID_WITHOUT_SETTING_KEYWORD_MAX_CPC_AS_WELL"/>
 *     &lt;enumeration value="CANNOT_CREATE_CAMPAIGN_WITH_CONVERSION_OPTIMIZER"/>
 *     &lt;enumeration value="PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER"/>
 *     &lt;enumeration value="PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA"/>
 *     &lt;enumeration value="PAY_PER_CONVERSION_NOT_ALLOWED_WITH_MANY_PER_CLICK"/>
 *     &lt;enumeration value="TARGET_CPA_NOT_AVAILABLE_FOR_CUSTOMER"/>
 *     &lt;enumeration value="MANY_PER_CLICK_NOT_AVAILABLE_FOR_CUSTOMER"/>
 *     &lt;enumeration value="CANNOT_SET_SITE_MAX_CPC"/>
 *     &lt;enumeration value="BID_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiddingError.Reason")
@XmlEnum
public enum BiddingErrorReason {


    /**
     * 
     *                 Bid amount can not be null.
     *               
     * 
     */
    BID_AMOUNT_REQUIRED,

    /**
     * 
     *                 Bid amount is too small.
     *               
     * 
     */
    BID_TOO_SMALL,

    /**
     * 
     *                 Bid amount is too big.
     *               
     * 
     */
    BID_TOO_BIG,

    /**
     * 
     *                 Bid has too many fractional digit precision.
     *               
     * 
     */
    BID_TOO_MANY_FRACTIONAL_DIGITS,

    /**
     * 
     *                 Bids must have a positive amount.
     *               
     * 
     */
    NON_POSITIVE_BID,

    /**
     * 
     *                 Bid is too high for the daily budget.
     *               
     * 
     */
    BID_TOO_HIGH_FOR_DAILY_BUDGET,

    /**
     * 
     *                 Bid is too high for the monthly budget.
     *               
     * 
     */
    BID_TOO_HIGH_FOR_MONTHLY_BUDGET,

    /**
     * 
     *                 Demographic targeting: Age 0-17 needs to be excluded for any other
     *                 age to get excluded
     *               
     * 
     */
    MUST_EXCLUDE_0_TO_17_WITH_OTHER_AGE_EXCLUSIONS,

    /**
     * 
     *                 Not allowed to enable budget optimizer, for a campaign with no budget.
     *               
     * 
     */
    CAMPAIGN_MUST_HAVE_A_BUDGET_TO_ENABLE_BUDGET_OPTIMIZER,

    /**
     * 
     *                 Not allowed to set content bid without setting the keyword bid.
     *               
     * 
     */
    CANNOT_SET_CONTENT_BID_WITHOUT_SETTING_KEYWORD_MAX_CPC_AS_WELL,

    /**
     * 
     *                 Campaign can not be created with Conversion Optimizer bidding strategy.
     *                 It can be transitioned to conversion optimizer, once eligible.
     *               
     * 
     */
    CANNOT_CREATE_CAMPAIGN_WITH_CONVERSION_OPTIMIZER,

    /**
     * 
     *                 Pay per conversion is not available to all the customer,
     *                 only few whitelisted customers can use this.
     *               
     * 
     */
    PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER,

    /**
     * 
     *                 Pay per conversion is not allowed with Target CPA
     *               
     * 
     */
    PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA,

    /**
     * 
     *                 Pay per conversion is not allowed with many per click
     *               
     * 
     */
    PAY_PER_CONVERSION_NOT_ALLOWED_WITH_MANY_PER_CLICK,

    /**
     * 
     *                 Customer is not whitelisted to use target cpa
     *               
     * 
     */
    TARGET_CPA_NOT_AVAILABLE_FOR_CUSTOMER,

    /**
     * 
     *                 Customer is not whitelisted to use many per click
     *               
     * 
     */
    MANY_PER_CLICK_NOT_AVAILABLE_FOR_CUSTOMER,

    /**
     * 
     *                 Site cpc bid can not be set
     *               
     * 
     */
    CANNOT_SET_SITE_MAX_CPC,

    /**
     * 
     *                 Default bidding related error
     *               
     * 
     */
    BID_ERROR;

    public String value() {
        return name();
    }

    public static BiddingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

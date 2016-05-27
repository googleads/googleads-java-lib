
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddingStrategySystemStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiddingStrategySystemStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="UNCONSTRAINED"/>
 *     &lt;enumeration value="LEARNING_NEW"/>
 *     &lt;enumeration value="LEARNING_SETTING_CHANGE"/>
 *     &lt;enumeration value="LEARNING_BUDGET_CHANGE"/>
 *     &lt;enumeration value="LEARNING_COMPOSITION_CHANGE"/>
 *     &lt;enumeration value="LEARNING_CONVERSION_TYPE_CHANGE"/>
 *     &lt;enumeration value="LEARNING_CONVERSION_SETTING_CHANGE"/>
 *     &lt;enumeration value="LIMITED_BY_BID_CONSTRAINTS"/>
 *     &lt;enumeration value="LIMITED_BY_MAX_BID_LIMIT"/>
 *     &lt;enumeration value="LIMITED_BY_MIN_BID_LIMIT"/>
 *     &lt;enumeration value="LIMITED_BY_MIN_ROAS_LIMIT"/>
 *     &lt;enumeration value="LIMITED_BY_DATA"/>
 *     &lt;enumeration value="LIMITED_BY_BUDGET"/>
 *     &lt;enumeration value="LIMITED_BY_LOW_PRIORITY_SPEND"/>
 *     &lt;enumeration value="LIMITED_BY_LOW_QUALITY"/>
 *     &lt;enumeration value="MISCONFIGURED_CONVERSION_TYPES"/>
 *     &lt;enumeration value="MISCONFIGURED_CONVERSION_SETTINGS"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *     &lt;enumeration value="MULTIPLE_LEARNING"/>
 *     &lt;enumeration value="MULTIPLE_LIMITED"/>
 *     &lt;enumeration value="MULTIPLE_MISCONFIGURED"/>
 *     &lt;enumeration value="MULTIPLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiddingStrategySystemStatus")
@XmlEnum
public enum BiddingStrategySystemStatus {

    UNKNOWN,

    /**
     * 
     *                 The bid strategy is active, and AdWords cannot find any specific issues with the
     *                 strategy.
     *               
     * 
     */
    UNCONSTRAINED,

    /**
     * 
     *                 The bid strategy is learning because it has been recently created or recently
     *                 reactivated.
     *               
     * 
     */
    LEARNING_NEW,

    /**
     * 
     *                 The bid strategy is learning because of a recent setting change.
     *               
     * 
     */
    LEARNING_SETTING_CHANGE,

    /**
     * 
     *                 The bid strategy is learning because of a recent budget change.
     *               
     * 
     */
    LEARNING_BUDGET_CHANGE,

    /**
     * 
     *                 The bid strategy is learning because of recent change in number of campaigns, ad
     *                 groups or keywords attached to it.
     *               
     * 
     */
    LEARNING_COMPOSITION_CHANGE,

    /**
     * 
     *                 The bid strategy depends on conversion reporting and the customer recently
     *                 modified conversion types that were relevant to the bid strategy.
     *               
     * 
     */
    LEARNING_CONVERSION_TYPE_CHANGE,

    /**
     * 
     *                 The bid strategy depends on conversion reporting and the customer recently
     *                 changed their conversion settings.
     *               
     * 
     */
    LEARNING_CONVERSION_SETTING_CHANGE,

    /**
     * 
     *                 The bid strategy is limited by its bid constraints (bid floor, ceiling, or
     *                 both). Deprecated for the specific LIMITED_BY_*_LIMIT statuses.
     *               
     * 
     */
    LIMITED_BY_BID_CONSTRAINTS,

    /**
     * 
     *                 The bid strategy is limited by its bid ceiling.
     *               
     * 
     */
    LIMITED_BY_MAX_BID_LIMIT,

    /**
     * 
     *                 The bid strategy is limited by its bid floor.
     *               
     * 
     */
    LIMITED_BY_MIN_BID_LIMIT,

    /**
     * 
     *                 The bid strategy is limited by its ROAS floor.
     *               
     * 
     */
    LIMITED_BY_MIN_ROAS_LIMIT,

    /**
     * 
     *                 The bid strategy is limited because there was not enough conversion traffic over
     *                 the past weeks.
     *               
     * 
     */
    LIMITED_BY_DATA,

    /**
     * 
     *                 A significant fraction of keywords in this bid strategy are limited by budget.
     *               
     * 
     */
    LIMITED_BY_BUDGET,

    /**
     * 
     *                 The bid strategy cannot reach its target spend because its spend has been
     *                 de-prioritized.
     *               
     * 
     */
    LIMITED_BY_LOW_PRIORITY_SPEND,

    /**
     * 
     *                 A significant fraction of keywords in this bid strategy have a low Quality
     *                 Score.
     *               
     * 
     */
    LIMITED_BY_LOW_QUALITY,

    /**
     * 
     *                 The bid strategy depends on conversion reporting and the customer is lacking
     *                 conversion types that might be reported against this strategy.
     *               
     * 
     */
    MISCONFIGURED_CONVERSION_TYPES,

    /**
     * 
     *                 The bid strategy depends on conversion reporting and the customer's conversion
     *                 settings are misconfigured.
     *               
     * 
     */
    MISCONFIGURED_CONVERSION_SETTINGS,

    /**
     * 
     *                 The bid strategy is not active. Either there are no active campaigns, ad groups
     *                 or keywords attached to the bid strategy. Or there are no active budgets
     *                 connected to the bid strategy.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 The system status is not currently available for this bid strategy.
     *               
     * 
     */
    UNAVAILABLE,

    /**
     * 
     *                 There were multiple LEARNING_* statuses for this bid strategy during the time in
     *                 question.
     *               
     * 
     */
    MULTIPLE_LEARNING,

    /**
     * 
     *                 There were multiple LIMITED_* statuses for this bid strategy during the time in
     *                 question.
     *               
     * 
     */
    MULTIPLE_LIMITED,

    /**
     * 
     *                 There were multiple MISCONFIGURED_* system statuses for this bid strategy during
     *                 the time in question.
     *               
     * 
     */
    MULTIPLE_MISCONFIGURED,

    /**
     * 
     *                 There were multiple system statuses for this bid strategy during the time in
     *                 question.
     *               
     * 
     */
    MULTIPLE;

    public String value() {
        return name();
    }

    public static BiddingStrategySystemStatus fromValue(String v) {
        return valueOf(v);
    }

}

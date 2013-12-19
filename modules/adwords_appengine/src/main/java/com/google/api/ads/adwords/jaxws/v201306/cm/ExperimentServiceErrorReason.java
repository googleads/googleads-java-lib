
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExperimentServiceError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExperimentServiceError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AFTER_MAXIMUM_ALLOWABLE_DATE"/>
 *     &lt;enumeration value="AOL_PARTNER_CAMPAIGNS_CANT_RUN_EXPERIMENTS"/>
 *     &lt;enumeration value="CANNOT_CREATE_EXPERIMENT_FOR_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="CANNOT_CREATE_EXPERIMENT_FOR_BIDDING_STRATEGY_FEATURE"/>
 *     &lt;enumeration value="CANNOT_SET_DATE_TO_PAST"/>
 *     &lt;enumeration value="CANNOT_SET_END_DATE_WITHOUT_SETTING_START_DATE"/>
 *     &lt;enumeration value="CANNOT_USE_EXPERIMENT_WITH_SHARED_BUDGET"/>
 *     &lt;enumeration value="DATE_OUTSIDE_CAMPAIGN_DATE_RANGE"/>
 *     &lt;enumeration value="EXPERIMENT_ALREADY_STARTED"/>
 *     &lt;enumeration value="EXPERIMENT_ENDED"/>
 *     &lt;enumeration value="EXPERIMENT_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="INVALID_EXPERIMENT_NAME"/>
 *     &lt;enumeration value="INVALID_QUERY_PERCENTAGE"/>
 *     &lt;enumeration value="CANNOT_CHANGE_QUERY_PERCENTAGE_AFTER_EXPERIMENT_HAS_STARTED"/>
 *     &lt;enumeration value="INVALID_STATUS_UPDATE"/>
 *     &lt;enumeration value="START_DATE_AFTER_END_DATE"/>
 *     &lt;enumeration value="NO_VALID_BUDGET"/>
 *     &lt;enumeration value="EXPERIMENT_NOT_ACTIVE"/>
 *     &lt;enumeration value="EXPERIMENT_SERVICE_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExperimentServiceError.Reason")
@XmlEnum
public enum ExperimentServiceErrorReason {


    /**
     * 
     *                 Start/end date is too far in the future
     *               
     * 
     */
    AFTER_MAXIMUM_ALLOWABLE_DATE,

    /**
     * 
     *                 AOL partners are not permitted to run experiments
     *               
     * 
     */
    AOL_PARTNER_CAMPAIGNS_CANT_RUN_EXPERIMENTS,

    /**
     * 
     *                 Cannot create experiment for bidding strategy
     *               
     * 
     */
    CANNOT_CREATE_EXPERIMENT_FOR_BIDDING_STRATEGY,

    /**
     * 
     *                 Cannot create experiment for a bidding strategy feature used in the
     *                 campaign.
     *               
     * 
     */
    CANNOT_CREATE_EXPERIMENT_FOR_BIDDING_STRATEGY_FEATURE,

    /**
     * 
     *                 Specified start/end date for experiment is in the past
     *               
     * 
     */
    CANNOT_SET_DATE_TO_PAST,

    /**
     * 
     *                 Cannot set an end date for an experiment if a start date is not set.
     *               
     * 
     */
    CANNOT_SET_END_DATE_WITHOUT_SETTING_START_DATE,

    /**
     * 
     *                 Cannot use experiment with a campaign that is using a shared budget.
     *               
     * 
     */
    CANNOT_USE_EXPERIMENT_WITH_SHARED_BUDGET,

    /**
     * 
     *                 Start date before campaign start or end date after campaign end
     *               
     * 
     */
    DATE_OUTSIDE_CAMPAIGN_DATE_RANGE,

    /**
     * 
     *                 Can't change start date of experiment once started
     *               
     * 
     */
    EXPERIMENT_ALREADY_STARTED,

    /**
     * 
     *                 Can't edit ended experiments
     *               
     * 
     */
    EXPERIMENT_ENDED,

    /**
     * 
     *                 Adding experiment would exceed maximum allowed experiments in campaign.
     *               
     * 
     */
    EXPERIMENT_LIMIT_EXCEEDED,

    /**
     * 
     *                 Experiment name cannot be used.
     *               
     * 
     */
    INVALID_EXPERIMENT_NAME,

    /**
     * 
     *                 The query percentage is not valid
     *               
     * 
     */
    INVALID_QUERY_PERCENTAGE,

    /**
     * 
     *                 Cannot change query percentage after experiment has started
     *               
     * 
     */
    CANNOT_CHANGE_QUERY_PERCENTAGE_AFTER_EXPERIMENT_HAS_STARTED,

    /**
     * 
     *                 Invalid initial experiment status or transition.
     *               
     * 
     */
    INVALID_STATUS_UPDATE,

    /**
     * 
     *                 The experiment start date was after the experiment end date.
     *               
     * 
     */
    START_DATE_AFTER_END_DATE,

    /**
     * 
     *                 No budget in this campaign
     *               
     * 
     */
    NO_VALID_BUDGET,

    /**
     * 
     *                 An inactive experiment cannot be changed
     *               
     * 
     */
    EXPERIMENT_NOT_ACTIVE,
    EXPERIMENT_SERVICE_ERROR;

    public String value() {
        return name();
    }

    public static ExperimentServiceErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

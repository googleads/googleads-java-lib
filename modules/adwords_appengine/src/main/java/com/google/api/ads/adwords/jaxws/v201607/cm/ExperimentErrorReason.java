
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExperimentError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExperimentError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXPERIMENT_DELTA_STATUS_NOT_SPECIFIED"/>
 *     &lt;enumeration value="EXPERIMENT_DELTA_STATUS_NOT_ALLOWED"/>
 *     &lt;enumeration value="EXPERIMENT_STATUS_NOT_ALLOWED"/>
 *     &lt;enumeration value="EXPERIMENT_NOT_ALLOWED_FOR_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="EXPERIMENT_NOT_ALLOWED_FOR_CRITERION_TYPE"/>
 *     &lt;enumeration value="EXPERIMENT_NOT_ACTIVE"/>
 *     &lt;enumeration value="INVALID_EXPERIMENT_ID"/>
 *     &lt;enumeration value="EXPERIMENT_ID_NOT_SPECIFIED_WITH_SEGMENTATION_CRITERIA"/>
 *     &lt;enumeration value="TOO_MANY_CHANGES_TO_EXPERIMENT"/>
 *     &lt;enumeration value="EXPERIMENT_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExperimentError.Reason")
@XmlEnum
public enum ExperimentErrorReason {


    /**
     * 
     *                 Experiment delta status not specified.
     *               
     * 
     */
    EXPERIMENT_DELTA_STATUS_NOT_SPECIFIED,

    /**
     * 
     *                 Experiment delta status not allowed.
     *               
     * 
     */
    EXPERIMENT_DELTA_STATUS_NOT_ALLOWED,

    /**
     * 
     *                 Cannot create experiment data in REMOVED status
     *               
     * 
     */
    EXPERIMENT_STATUS_NOT_ALLOWED,

    /**
     * 
     *                 Experiments are not allowed for this bidding strategy
     *               
     * 
     */
    EXPERIMENT_NOT_ALLOWED_FOR_BIDDING_STRATEGY,

    /**
     * 
     *                 Experiments are not allowed for this criterion type
     *               
     * 
     */
    EXPERIMENT_NOT_ALLOWED_FOR_CRITERION_TYPE,

    /**
     * 
     *                 Cannot make changes for inactive experiments
     *               
     * 
     */
    EXPERIMENT_NOT_ACTIVE,

    /**
     * 
     *                 Invalid experiment id
     *               
     * 
     */
    INVALID_EXPERIMENT_ID,

    /**
     * 
     *                 Experiment id must be specified for this criterion
     *               
     * 
     */
    EXPERIMENT_ID_NOT_SPECIFIED_WITH_SEGMENTATION_CRITERIA,

    /**
     * 
     *                 This experiment has too many changes
     *               
     * 
     */
    TOO_MANY_CHANGES_TO_EXPERIMENT,
    EXPERIMENT_ERROR;

    public String value() {
        return name();
    }

    public static ExperimentErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

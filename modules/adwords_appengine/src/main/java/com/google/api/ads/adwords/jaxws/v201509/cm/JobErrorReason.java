
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JobError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUPLICATE_JOB_KEY_FOR_CUSTOMER"/>
 *     &lt;enumeration value="JOB_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="PREREQUISITE_JOB_FAILED"/>
 *     &lt;enumeration value="SELECTOR_CANNOT_USE_BOTH_JOB_IDS_AND_JOB_KEYS"/>
 *     &lt;enumeration value="TOO_LATE_TO_CANCEL_JOB"/>
 *     &lt;enumeration value="TOO_MANY_PREREQUISITE_JOBS"/>
 *     &lt;enumeration value="TOO_MANY_JOBS_IN_QUEUE"/>
 *     &lt;enumeration value="USER_CANCELED_JOB"/>
 *     &lt;enumeration value="WORKFLOW_FAILURE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JobError.Reason")
@XmlEnum
public enum JobErrorReason {


    /**
     * 
     *                 The supplied customer job key has already been used for an earlier job.
     *               
     * 
     */
    DUPLICATE_JOB_KEY_FOR_CUSTOMER,

    /**
     * 
     *                 The server does not support the given type of job.
     *               
     * 
     */
    JOB_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 A job specified as a prerequisite to this job has failed.
     *               
     * 
     */
    PREREQUISITE_JOB_FAILED,

    /**
     * 
     *                 Cannot select using both job ids and customer job keys.
     *               
     * 
     */
    SELECTOR_CANNOT_USE_BOTH_JOB_IDS_AND_JOB_KEYS,

    /**
     * 
     *                 Cannot cancel this job as it is an advanced stage of processing;
     *                 See the specific job type to understand when a job may be canceled.
     *               
     * 
     */
    TOO_LATE_TO_CANCEL_JOB,

    /**
     * 
     *                 The limit for the number of prerequisite jobs has been exceeded for this
     *                 job request.
     *               
     * 
     */
    TOO_MANY_PREREQUISITE_JOBS,

    /**
     * 
     *                 The limit for the number of pending jobs has been exceeded for this
     *                 customer.
     *               
     * 
     */
    TOO_MANY_JOBS_IN_QUEUE,

    /**
     * 
     *                 The job was canceled at the request of the user.
     *               
     * 
     */
    USER_CANCELED_JOB,

    /**
     * 
     *                 Encountered a workflow system failure.
     *               
     * 
     */
    WORKFLOW_FAILURE,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static JobErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

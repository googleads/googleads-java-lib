
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowRequestError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowRequestError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUEST_ALREADY_PROCESSED"/>
 *     &lt;enumeration value="WORKFLOW_NOT_IN_PROGRESS"/>
 *     &lt;enumeration value="INVALID_REQUEST_ID"/>
 *     &lt;enumeration value="INVALID_ACTION"/>
 *     &lt;enumeration value="TYPE_REQUIRED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowRequestError.Reason")
@XmlEnum
public enum WorkflowRequestErrorReason {


    /**
     * 
     *                 The request has already been processed.
     *               
     * 
     */
    REQUEST_ALREADY_PROCESSED,

    /**
     * 
     *                 The workflow is not in progress.
     *               
     * 
     */
    WORKFLOW_NOT_IN_PROGRESS,

    /**
     * 
     *                 The request ID is invalid.
     *               
     * 
     */
    INVALID_REQUEST_ID,

    /**
     * 
     *                 The action could not be performed on a request of that type.
     *               
     * 
     */
    INVALID_ACTION,

    /**
     * 
     *                 Querying for workflow requests without specifying type is not allowed.
     *               
     * 
     */
    TYPE_REQUIRED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static WorkflowRequestErrorReason fromValue(String v) {
        return valueOf(v);
    }

}


package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowApprovalRequestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowApprovalRequestStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING_APPROVAL"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="RETRACTED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowApprovalRequestStatus")
@XmlEnum
public enum WorkflowApprovalRequestStatus {


    /**
     * 
     *                 The request is pending approval.
     *               
     * 
     */
    PENDING_APPROVAL,

    /**
     * 
     *                 The workflow approval request has been approved.
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 The workflow approval request has been rejected.
     *               
     * 
     */
    REJECTED,

    /**
     * 
     *                 The workflow request was retracted because the proposal was retracted.
     *               
     * 
     */
    RETRACTED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static WorkflowApprovalRequestStatus fromValue(String v) {
        return valueOf(v);
    }

}

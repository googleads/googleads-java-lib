
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowRequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowRequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WORKFLOW_APPROVAL_REQUEST"/>
 *     &lt;enumeration value="WORKFLOW_EXTERNAL_CONDITION_REQUEST"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowRequestType")
@XmlEnum
public enum WorkflowRequestType {


    /**
     * 
     *                 This is a request for an approval action. Either by a frontend user or an API request.
     *               
     * 
     */
    WORKFLOW_APPROVAL_REQUEST,

    /**
     * 
     *                 This is an external condition request. It is pending an external system to determine whether an
     *                 action should trigger or not.
     *               
     * 
     */
    WORKFLOW_EXTERNAL_CONDITION_REQUEST,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static WorkflowRequestType fromValue(String v) {
        return valueOf(v);
    }

}

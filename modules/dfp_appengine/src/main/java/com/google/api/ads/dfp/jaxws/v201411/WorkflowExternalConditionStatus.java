
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowExternalConditionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowExternalConditionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="TRIGGERED"/>
 *     &lt;enumeration value="NOT_TRIGGERED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowExternalConditionStatus")
@XmlEnum
public enum WorkflowExternalConditionStatus {


    /**
     * 
     *                 The workflow external condition is pending evaluation.
     *               
     * 
     */
    PENDING,

    /**
     * 
     *                 The workflow external condition has been triggered.
     *               
     * 
     */
    TRIGGERED,

    /**
     * 
     *                 The workflow external condition has not been triggered.
     *               
     * 
     */
    NOT_TRIGGERED,

    /**
     * 
     *                 The associated proposal was retracted, this rule is no longer valid.
     *               
     * 
     */
    CANCELLED,

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

    public static WorkflowExternalConditionStatus fromValue(String v) {
        return valueOf(v);
    }

}

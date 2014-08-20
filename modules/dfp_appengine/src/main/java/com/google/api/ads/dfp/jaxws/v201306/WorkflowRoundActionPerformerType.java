
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowRoundActionPerformerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowRoundActionPerformerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="TEAM"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowRoundActionPerformerType")
@XmlEnum
public enum WorkflowRoundActionPerformerType {


    /**
     * 
     *                 Means the performer is a user.
     *               
     * 
     */
    USER,

    /**
     * 
     *                 Means the performer is any user from a team.
     *               
     * 
     */
    TEAM,

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

    public static WorkflowRoundActionPerformerType fromValue(String v) {
        return valueOf(v);
    }

}

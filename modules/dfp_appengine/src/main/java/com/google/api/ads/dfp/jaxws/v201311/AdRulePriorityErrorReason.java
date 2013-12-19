
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRulePriorityError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdRulePriorityError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUPLICATE_PRIORITY"/>
 *     &lt;enumeration value="PRIORITIES_NOT_SEQUENTIAL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdRulePriorityError.Reason")
@XmlEnum
public enum AdRulePriorityErrorReason {


    /**
     * 
     *                 Ad rules must have unique priorities.
     *               
     * 
     */
    DUPLICATE_PRIORITY,

    /**
     * 
     *                 One or more priorities are missing.
     *               
     * 
     */
    PRIORITIES_NOT_SEQUENTIAL,

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

    public static AdRulePriorityErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

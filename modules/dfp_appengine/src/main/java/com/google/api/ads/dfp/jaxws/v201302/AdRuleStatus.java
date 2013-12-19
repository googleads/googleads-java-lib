
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRuleStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdRuleStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdRuleStatus")
@XmlEnum
public enum AdRuleStatus {


    /**
     * 
     *                 Created and ready to be served. Is user-visible.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Paused, user-visible.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 Marked as deleted, not user-visible.
     *               
     * 
     */
    DELETED,

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

    public static AdRuleStatus fromValue(String v) {
        return valueOf(v);
    }

}

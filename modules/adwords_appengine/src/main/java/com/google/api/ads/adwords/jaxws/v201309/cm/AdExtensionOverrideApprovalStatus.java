
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionOverride.ApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdExtensionOverride.ApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="UNCHECKED"/>
 *     &lt;enumeration value="DISAPPROVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdExtensionOverride.ApprovalStatus")
@XmlEnum
public enum AdExtensionOverrideApprovalStatus {


    /**
     * 
     *                 Approved.
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 Unchecked.
     *               
     * 
     */
    UNCHECKED,

    /**
     * 
     *                 Disapproved.
     *               
     * 
     */
    DISAPPROVED;

    public String value() {
        return name();
    }

    public static AdExtensionOverrideApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}

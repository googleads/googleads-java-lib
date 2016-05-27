
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedItemApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedItemApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNCHECKED"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="DISAPPROVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedItemApprovalStatus")
@XmlEnum
public enum FeedItemApprovalStatus {


    /**
     * 
     *                 Pending review
     *               
     * 
     */
    UNCHECKED,

    /**
     * 
     *                 Approved
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 Disapproved
     *               
     * 
     */
    DISAPPROVED;

    public String value() {
        return name();
    }

    public static FeedItemApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}

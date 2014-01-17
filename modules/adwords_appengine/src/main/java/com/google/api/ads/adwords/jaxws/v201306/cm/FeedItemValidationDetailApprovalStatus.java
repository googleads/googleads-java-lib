
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedItemValidationDetail.ApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedItemValidationDetail.ApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="DISAPPROVED"/>
 *     &lt;enumeration value="UNCHECKED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedItemValidationDetail.ApprovalStatus")
@XmlEnum
public enum FeedItemValidationDetailApprovalStatus {


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
    DISAPPROVED,

    /**
     * 
     *                 Pending review
     *               
     * 
     */
    UNCHECKED;

    public String value() {
        return name();
    }

    public static FeedItemValidationDetailApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}

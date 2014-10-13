
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="PENDING_REVIEW"/>
 *     &lt;enumeration value="UNDER_REVIEW"/>
 *     &lt;enumeration value="DISAPPROVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApprovalStatus")
@XmlEnum
public enum ApprovalStatus {


    /**
     * 
     *                 Criterion with no reportable policy problems.
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 Criterion that is yet to be reviewed.
     *               
     * 
     */
    PENDING_REVIEW,

    /**
     * 
     *                 Criterion that is under review.
     *               
     * 
     */
    UNDER_REVIEW,

    /**
     * 
     *                 Criterion disapproved due to policy violation.
     *               
     * 
     */
    DISAPPROVED;

    public String value() {
        return name();
    }

    public static ApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}

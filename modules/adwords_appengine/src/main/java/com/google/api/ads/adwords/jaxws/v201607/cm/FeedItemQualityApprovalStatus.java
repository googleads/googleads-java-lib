
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedItemQualityApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedItemQualityApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="DISAPPROVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedItemQualityApprovalStatus")
@XmlEnum
public enum FeedItemQualityApprovalStatus {


    /**
     * 
     *                 Quality evaluation pending
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Approved for quality
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 Disapproved for quality
     *               
     * 
     */
    DISAPPROVED;

    public String value() {
        return name();
    }

    public static FeedItemQualityApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}

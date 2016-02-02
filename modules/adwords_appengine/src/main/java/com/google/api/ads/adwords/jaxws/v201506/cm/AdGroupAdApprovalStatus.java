
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupAd.ApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupAd.ApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="DISAPPROVED"/>
 *     &lt;enumeration value="FAMILY_SAFE"/>
 *     &lt;enumeration value="NON_FAMILY_SAFE"/>
 *     &lt;enumeration value="PORN"/>
 *     &lt;enumeration value="UNCHECKED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupAd.ApprovalStatus")
@XmlEnum
public enum AdGroupAdApprovalStatus {


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
     *                 Approved - family safe
     *               
     * 
     */
    FAMILY_SAFE,

    /**
     * 
     *                 Approved - non-family safe
     *               
     * 
     */
    NON_FAMILY_SAFE,

    /**
     * 
     *                 Approved - adult content
     *               
     * 
     */
    PORN,

    /**
     * 
     *                 Pending review
     *               
     * 
     */
    UNCHECKED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdGroupAdApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}

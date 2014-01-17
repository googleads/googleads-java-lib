
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignAdExtension.ApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignAdExtension.ApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="UNCHECKED"/>
 *     &lt;enumeration value="DISAPPROVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignAdExtension.ApprovalStatus")
@XmlEnum
public enum CampaignAdExtensionApprovalStatus {


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

    public static CampaignAdExtensionApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}

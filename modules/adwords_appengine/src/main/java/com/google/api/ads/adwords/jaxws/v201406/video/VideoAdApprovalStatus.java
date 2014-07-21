
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoAd.ApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoAd.ApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="APPROVED_LIMITED"/>
 *     &lt;enumeration value="ELIGIBLE"/>
 *     &lt;enumeration value="UNDER_REVIEW"/>
 *     &lt;enumeration value="DISAPPROVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoAd.ApprovalStatus")
@XmlEnum
public enum VideoAdApprovalStatus {

    APPROVED,
    APPROVED_LIMITED,
    ELIGIBLE,
    UNDER_REVIEW,
    DISAPPROVED;

    public String value() {
        return name();
    }

    public static VideoAdApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}

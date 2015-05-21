
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyAudienceSegment.AudienceSegmentApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThirdPartyAudienceSegment.AudienceSegmentApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNAPPROVED"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThirdPartyAudienceSegment.AudienceSegmentApprovalStatus")
@XmlEnum
public enum ThirdPartyAudienceSegmentAudienceSegmentApprovalStatus {


    /**
     * 
     *                 Specifies that this segment is waiting to be approved or rejected. It cannot be targeted.
     *               
     * 
     */
    UNAPPROVED,

    /**
     * 
     *                 Specifies that this segment is approved and can be targeted.
     *               
     * 
     */
    APPROVED,

    /**
     * 
     *                 Specifies that this segment is rejected and cannot be targeted.
     *               
     * 
     */
    REJECTED,

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

    public static ThirdPartyAudienceSegmentAudienceSegmentApprovalStatus fromValue(String v) {
        return valueOf(v);
    }

}

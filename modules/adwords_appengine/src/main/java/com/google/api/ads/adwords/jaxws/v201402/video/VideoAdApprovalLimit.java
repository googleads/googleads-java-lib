
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoAd.ApprovalLimit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoAd.ApprovalLimit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FAMILY_SAFE"/>
 *     &lt;enumeration value="NON_FAMILY_SAFE"/>
 *     &lt;enumeration value="ADULT_CONTENT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoAd.ApprovalLimit")
@XmlEnum
public enum VideoAdApprovalLimit {

    FAMILY_SAFE,
    NON_FAMILY_SAFE,
    ADULT_CONTENT,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static VideoAdApprovalLimit fromValue(String v) {
        return valueOf(v);
    }

}

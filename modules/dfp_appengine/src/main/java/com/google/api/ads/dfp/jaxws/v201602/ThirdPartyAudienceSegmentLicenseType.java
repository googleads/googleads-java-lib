
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyAudienceSegment.LicenseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThirdPartyAudienceSegment.LicenseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIRECT_LICENSE"/>
 *     &lt;enumeration value="GLOBAL_LICENSE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThirdPartyAudienceSegment.LicenseType")
@XmlEnum
public enum ThirdPartyAudienceSegmentLicenseType {


    /**
     * 
     *                 A direct license is the result of a direct contract between the data provider
     *                 and the publisher.
     *               
     * 
     */
    DIRECT_LICENSE,

    /**
     * 
     *                 A global license is the result of an agreement between Google and the data provider, which
     *                 agrees to license their audience segments to all the publishers and/or advertisers
     *                 of the Doubleclick ecosystem.
     *               
     * 
     */
    GLOBAL_LICENSE,

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

    public static ThirdPartyAudienceSegmentLicenseType fromValue(String v) {
        return valueOf(v);
    }

}

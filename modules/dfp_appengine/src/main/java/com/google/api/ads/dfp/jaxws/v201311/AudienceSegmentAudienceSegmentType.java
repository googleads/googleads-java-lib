
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceSegment.AudienceSegmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudienceSegment.AudienceSegmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIRST_PARTY"/>
 *     &lt;enumeration value="SHARED"/>
 *     &lt;enumeration value="THIRD_PARTY"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudienceSegment.AudienceSegmentType")
@XmlEnum
public enum AudienceSegmentAudienceSegmentType {


    /**
     * 
     *                 First party segments created and owned by the publisher.
     *               
     * 
     */
    FIRST_PARTY,

    /**
     * 
     *                 First party segments shared by other clients.
     *               
     * 
     */
    SHARED,

    /**
     * 
     *                 Third party segments licensed by the publisher from data providers. This doesn't include
     *                 Google-provided licensed segments.
     *               
     * 
     */
    THIRD_PARTY,

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

    public static AudienceSegmentAudienceSegmentType fromValue(String v) {
        return valueOf(v);
    }

}


package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceSegment.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudienceSegment.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudienceSegment.Status")
@XmlEnum
public enum AudienceSegmentStatus {


    /**
     * 
     *                 Active status means this audience segment is available for targeting.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Inactive status means this audience segment is not available for targeting.
     *               
     * 
     */
    INACTIVE;

    public String value() {
        return name();
    }

    public static AudienceSegmentStatus fromValue(String v) {
        return valueOf(v);
    }

}


package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriteriaDimension.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriteriaDimension">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGE"/>
 *     &lt;enumeration value="GENDER"/>
 *     &lt;enumeration value="KEYWORD"/>
 *     &lt;enumeration value="PLACEMENT"/>
 *     &lt;enumeration value="TOPIC"/>
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CriteriaDimension")
@XmlEnum
public enum CriteriaDimension {


    /**
     * 
     *                 Dimension for Age criteria.
     *               
     * 
     */
    AGE,

    /**
     * 
     *                 Dimension for Gender criteria.
     *               
     * 
     */
    GENDER,

    /**
     * 
     *                 Dimension for keywords.
     *               
     * 
     */
    KEYWORD,

    /**
     * 
     *                 Dimension for YouTube and non-YouTube placements: Video, Channel, RunOfYouTube, WebSite.
     *               
     * 
     */
    PLACEMENT,

    /**
     * 
     *                 Dimension for Topic/Vertical criteria.
     *               
     * 
     */
    TOPIC,

    /**
     * 
     *                 Dimension for user based criteria: UserList, Interests.
     *               
     * 
     */
    USER,

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

    public static CriteriaDimension fromValue(String v) {
        return valueOf(v);
    }

}

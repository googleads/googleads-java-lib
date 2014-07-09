
package com.google.api.ads.adwords.jaxws.v201406.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IDEAS"/>
 *     &lt;enumeration value="STATS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestType")
@XmlEnum
public enum RequestType {


    /**
     * 
     *                 Request for new ideas based on other entries in selector.
     *                 This {@link RequestType} can be used to request other ideas
     *                 using keyword/placements that the user already has.
     *               
     * 
     */
    IDEAS,

    /**
     * 
     *                 Request for stats for entries in selector.
     *                 This {@link RequestType} can be used to request
     *                 the stats for keywords/placements that the user already has.
     *                 
     *                 <p>Stats are generated once a month (typically on the last week of the
     *                 month) from the historical data of previous months.</p>
     *               
     * 
     */
    STATS;

    public String value() {
        return name();
    }

    public static RequestType fromValue(String v) {
        return valueOf(v);
    }

}

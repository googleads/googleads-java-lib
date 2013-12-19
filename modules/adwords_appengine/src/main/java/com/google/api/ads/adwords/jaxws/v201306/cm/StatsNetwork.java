
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Stats.Network.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Stats.Network">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEARCH"/>
 *     &lt;enumeration value="GOOGLE_SEARCH"/>
 *     &lt;enumeration value="SEARCH_NETWORK"/>
 *     &lt;enumeration value="CONTENT"/>
 *     &lt;enumeration value="CONTENT_KEYWORD_BID"/>
 *     &lt;enumeration value="CONTENT_PLACEMENT_BID"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Stats.Network")
@XmlEnum
public enum StatsNetwork {


    /**
     * 
     *                 Aggregate of {@code GOOGLE_SEARCH} and {@code SEARCH_NETWORK}.
     *               
     * 
     */
    SEARCH,
    GOOGLE_SEARCH,
    SEARCH_NETWORK,

    /**
     * 
     *                 Aggregate of {@code CONTENT_KEYWORD_BID} and {@code CONTENT_PLACEMENT_BID}.
     *               
     * 
     */
    CONTENT,
    CONTENT_KEYWORD_BID,
    CONTENT_PLACEMENT_BID,
    ALL,

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

    public static StatsNetwork fromValue(String v) {
        return valueOf(v);
    }

}

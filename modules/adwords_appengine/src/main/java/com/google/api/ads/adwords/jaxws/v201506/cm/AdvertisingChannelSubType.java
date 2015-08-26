
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvertisingChannelSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdvertisingChannelSubType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="SEARCH_MOBILE_APP"/>
 *     &lt;enumeration value="DISPLAY_MOBILE_APP"/>
 *     &lt;enumeration value="SEARCH_EXPRESS"/>
 *     &lt;enumeration value="DISPLAY_EXPRESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdvertisingChannelSubType")
@XmlEnum
public enum AdvertisingChannelSubType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Mobile App Campaigns for Search
     *               
     * 
     */
    SEARCH_MOBILE_APP,

    /**
     * 
     *                 Mobile App Campaigns for Display
     *               
     * 
     */
    DISPLAY_MOBILE_APP,

    /**
     * 
     *                 AdWords Express campaigns for search.
     *               
     * 
     */
    SEARCH_EXPRESS,

    /**
     * 
     *                 AdWords Express campaigns for display.
     *               
     * 
     */
    DISPLAY_EXPRESS;

    public String value() {
        return name();
    }

    public static AdvertisingChannelSubType fromValue(String v) {
        return valueOf(v);
    }

}

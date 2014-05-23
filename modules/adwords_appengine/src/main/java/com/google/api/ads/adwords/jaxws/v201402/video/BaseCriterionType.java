
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseCriterion.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BaseCriterion.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGE"/>
 *     &lt;enumeration value="CARRIER"/>
 *     &lt;enumeration value="CHANNEL"/>
 *     &lt;enumeration value="CONTENT_KEYWORD"/>
 *     &lt;enumeration value="CONTENT_LABEL"/>
 *     &lt;enumeration value="GENDER"/>
 *     &lt;enumeration value="INTEREST"/>
 *     &lt;enumeration value="KEYWORD"/>
 *     &lt;enumeration value="LANGUAGE"/>
 *     &lt;enumeration value="LOCATION"/>
 *     &lt;enumeration value="MOBILE_APPLICATION"/>
 *     &lt;enumeration value="MOBILE_APP_CATEGORY"/>
 *     &lt;enumeration value="MOBILE_DEVICE"/>
 *     &lt;enumeration value="OPERATING_SYSTEM_VERSION"/>
 *     &lt;enumeration value="PLATFORM"/>
 *     &lt;enumeration value="RUN_OF_YOUTUBE"/>
 *     &lt;enumeration value="SCHEDULE"/>
 *     &lt;enumeration value="SEARCH_KEYWORD"/>
 *     &lt;enumeration value="USER_LIST"/>
 *     &lt;enumeration value="VERTICAL"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="WEB_SITE"/>
 *     &lt;enumeration value="YOUTUBE_PLACEMENT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BaseCriterion.Type")
@XmlEnum
public enum BaseCriterionType {

    AGE,
    CARRIER,
    CHANNEL,
    CONTENT_KEYWORD,
    CONTENT_LABEL,
    GENDER,
    INTEREST,

    /**
     * 
     *                 Usable only at campaign level.
     *               
     * 
     */
    KEYWORD,
    LANGUAGE,
    LOCATION,
    MOBILE_APPLICATION,
    MOBILE_APP_CATEGORY,
    MOBILE_DEVICE,
    OPERATING_SYSTEM_VERSION,
    PLATFORM,
    RUN_OF_YOUTUBE,
    SCHEDULE,
    SEARCH_KEYWORD,
    USER_LIST,
    VERTICAL,
    VIDEO,
    WEB_SITE,
    YOUTUBE_PLACEMENT,

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

    public static BaseCriterionType fromValue(String v) {
        return valueOf(v);
    }

}

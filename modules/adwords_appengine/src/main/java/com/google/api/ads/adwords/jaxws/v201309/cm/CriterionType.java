
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Criterion.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Criterion.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTENT_LABEL"/>
 *     &lt;enumeration value="KEYWORD"/>
 *     &lt;enumeration value="PLACEMENT"/>
 *     &lt;enumeration value="VERTICAL"/>
 *     &lt;enumeration value="USER_LIST"/>
 *     &lt;enumeration value="USER_INTEREST"/>
 *     &lt;enumeration value="MOBILE_APPLICATION"/>
 *     &lt;enumeration value="MOBILE_APP_CATEGORY"/>
 *     &lt;enumeration value="PRODUCT"/>
 *     &lt;enumeration value="WEBPAGE"/>
 *     &lt;enumeration value="LANGUAGE"/>
 *     &lt;enumeration value="LOCATION"/>
 *     &lt;enumeration value="AGE_RANGE"/>
 *     &lt;enumeration value="CARRIER"/>
 *     &lt;enumeration value="OPERATING_SYSTEM_VERSION"/>
 *     &lt;enumeration value="MOBILE_DEVICE"/>
 *     &lt;enumeration value="GENDER"/>
 *     &lt;enumeration value="PROXIMITY"/>
 *     &lt;enumeration value="PLATFORM"/>
 *     &lt;enumeration value="AD_SCHEDULE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Criterion.Type")
@XmlEnum
public enum CriterionType {


    /**
     * 
     *                 Content label for exclusion.
     *               
     * 
     */
    CONTENT_LABEL,

    /**
     * 
     *                 Keyword. e.g. 'mars cruise'
     *               
     * 
     */
    KEYWORD,

    /**
     * 
     *                 Placement. aka Website. e.g. 'www.flowers4sale.com'
     *               
     * 
     */
    PLACEMENT,

    /**
     * 
     *                 Vertical, e.g. 'category::Animals>Pets'  This is for vertical targeting on the content
     *                 network.
     *               
     * 
     */
    VERTICAL,

    /**
     * 
     *                 User lists, are links to sets of users defined by the advertiser.
     *               
     * 
     */
    USER_LIST,

    /**
     * 
     *                 User interests, categories of interests the user is interested in.
     *               
     * 
     */
    USER_INTEREST,

    /**
     * 
     *                 Mobile applications to target.
     *                 <span class="constraint Beta">This is a beta feature.</span>
     *               
     * 
     */
    MOBILE_APPLICATION,

    /**
     * 
     *                 Mobile application categories to target.
     *                 <span class="constraint Beta">This is a beta feature.</span>
     *               
     * 
     */
    MOBILE_APP_CATEGORY,

    /**
     * 
     *                 Filter for products the advertiser wants to target.
     *               
     * 
     */
    PRODUCT,

    /**
     * 
     *                 Webpages of an advertiser's website to target.
     *               
     * 
     */
    WEBPAGE,

    /**
     * 
     *                 Languages to target.
     *               
     * 
     */
    LANGUAGE,

    /**
     * 
     *                 Geographic regions to target.
     *               
     * 
     */
    LOCATION,

    /**
     * 
     *                 Age Range to exclude.
     *               
     * 
     */
    AGE_RANGE,

    /**
     * 
     *                 Mobile carriers to target.
     *               
     * 
     */
    CARRIER,

    /**
     * 
     *                 Mobile operating system versions to target.
     *               
     * 
     */
    OPERATING_SYSTEM_VERSION,

    /**
     * 
     *                 Mobile devices to target.
     *                 <span class="constraint Beta">This is a beta feature.</span>
     *               
     * 
     */
    MOBILE_DEVICE,

    /**
     * 
     *                 Gender to exclude.
     *               
     * 
     */
    GENDER,

    /**
     * 
     *                 Proximity (area within a radius) to target.
     *               
     * 
     */
    PROXIMITY,

    /**
     * 
     *                 Platforms to target.
     *               
     * 
     */
    PLATFORM,

    /**
     * 
     *                 AdSchedule or specific days and time intervals to target.
     *               
     * 
     */
    AD_SCHEDULE,

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

    public static CriterionType fromValue(String v) {
        return valueOf(v);
    }

}

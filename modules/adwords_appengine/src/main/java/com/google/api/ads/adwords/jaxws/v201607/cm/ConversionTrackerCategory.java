
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionTracker.Category.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionTracker.Category">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="PAGE_VIEW"/>
 *     &lt;enumeration value="PURCHASE"/>
 *     &lt;enumeration value="SIGNUP"/>
 *     &lt;enumeration value="LEAD"/>
 *     &lt;enumeration value="REMARKETING"/>
 *     &lt;enumeration value="DOWNLOAD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionTracker.Category")
@XmlEnum
public enum ConversionTrackerCategory {

    DEFAULT,
    PAGE_VIEW,
    PURCHASE,
    SIGNUP,
    LEAD,
    REMARKETING,

    /**
     * 
     *                 Download is applicable only to {@link AppConversion} types,
     *                 and is an error to use in conjunction with other types.
     *                 AppConversions must use download only if they also specify
     *                 {@link AppConversion#appConversionType} as DOWNLOAD or FIRST_OPEN.
     *                 If any other appConversionType is used, then some other category besides
     *                 DOWNLOAD must be used.
     *               
     * 
     */
    DOWNLOAD;

    public String value() {
        return name();
    }

    public static ConversionTrackerCategory fromValue(String v) {
        return valueOf(v);
    }

}

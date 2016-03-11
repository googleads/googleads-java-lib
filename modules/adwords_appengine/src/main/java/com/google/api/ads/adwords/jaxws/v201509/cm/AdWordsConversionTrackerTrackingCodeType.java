
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdWordsConversionTracker.TrackingCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdWordsConversionTracker.TrackingCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEBPAGE"/>
 *     &lt;enumeration value="WEBPAGE_ONCLICK"/>
 *     &lt;enumeration value="CLICK_TO_CALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdWordsConversionTracker.TrackingCodeType")
@XmlEnum
public enum AdWordsConversionTrackerTrackingCodeType {


    /**
     * 
     *                 The snippet that is fired as a result of a website page loading.
     *               
     * 
     */
    WEBPAGE,

    /**
     * 
     *                 The snippet contains a JavaScript function which fires the tag. This function is typically
     *                 called from an onClick handler added to a link or button element on the page.
     *               
     * 
     */
    WEBPAGE_ONCLICK,

    /**
     * 
     *                 For embedding on a (mobile) webpage. The snippet contains a JavaScript function which fires
     *                 the tag. This function is typically called from an onClick handler added to a link or button
     *                 element on the page that also instructs a mobile device to dial the advertiser's phone
     *                 number.
     *               
     * 
     */
    CLICK_TO_CALL;

    public String value() {
        return name();
    }

    public static AdWordsConversionTrackerTrackingCodeType fromValue(String v) {
        return valueOf(v);
    }

}

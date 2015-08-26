
package com.google.api.ads.adwords.jaxws.v201506.cm;

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
 *     &lt;enumeration value="CLICK_TO_CALL"/>
 *     &lt;enumeration value="ANDROID_REMARKETING"/>
 *     &lt;enumeration value="APPLE_IOS_REMARKETING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdWordsConversionTracker.TrackingCodeType")
@XmlEnum
public enum AdWordsConversionTrackerTrackingCodeType {

    WEBPAGE,
    CLICK_TO_CALL,
    ANDROID_REMARKETING,
    APPLE_IOS_REMARKETING;

    public String value() {
        return name();
    }

    public static AdWordsConversionTrackerTrackingCodeType fromValue(String v) {
        return valueOf(v);
    }

}


package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetingScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetingScope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRUE_VIEW_IN_SEARCH_ON_YOUTUBE_SEARCH"/>
 *     &lt;enumeration value="TRUE_VIEW_IN_SLATE_ON_YOUTUBE_WATCH"/>
 *     &lt;enumeration value="TRUE_VIEW_IN_DISPLAY_ON_YOUTUBE_WATCH"/>
 *     &lt;enumeration value="TRUE_VIEW_IN_STREAM_ON_YOUTUBE_WATCH"/>
 *     &lt;enumeration value="TRUE_VIEW_IN_SLATE_ON_GOOGLE_DISPLAY_NETWORK"/>
 *     &lt;enumeration value="TRUE_VIEW_IN_DISPLAY_ON_GOOGLE_DISPLAY_NETWORK"/>
 *     &lt;enumeration value="TRUE_VIEW_IN_STREAM_ON_GOOGLE_DISPLAY_NETWORK"/>
 *     &lt;enumeration value="TRUE_VIEW_IN_SEARCH_ON_GOOGLE_SEARCH"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetingScope")
@XmlEnum
public enum TargetingScope {

    TRUE_VIEW_IN_SEARCH_ON_YOUTUBE_SEARCH,
    TRUE_VIEW_IN_SLATE_ON_YOUTUBE_WATCH,
    TRUE_VIEW_IN_DISPLAY_ON_YOUTUBE_WATCH,
    TRUE_VIEW_IN_STREAM_ON_YOUTUBE_WATCH,
    TRUE_VIEW_IN_SLATE_ON_GOOGLE_DISPLAY_NETWORK,
    TRUE_VIEW_IN_DISPLAY_ON_GOOGLE_DISPLAY_NETWORK,
    TRUE_VIEW_IN_STREAM_ON_GOOGLE_DISPLAY_NETWORK,
    TRUE_VIEW_IN_SEARCH_ON_GOOGLE_SEARCH,

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

    public static TargetingScope fromValue(String v) {
        return valueOf(v);
    }

}

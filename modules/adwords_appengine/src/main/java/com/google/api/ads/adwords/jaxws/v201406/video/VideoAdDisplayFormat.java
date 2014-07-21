
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoAdDisplayFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoAdDisplayFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRUE_VIEW_IN_SEARCH"/>
 *     &lt;enumeration value="TRUE_VIEW_IN_SLATE"/>
 *     &lt;enumeration value="TRUE_VIEW_IN_DISPLAY"/>
 *     &lt;enumeration value="TRUE_VIEW_IN_STREAM"/>
 *     &lt;enumeration value="STANDARD_IN_STREAM"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoAdDisplayFormat")
@XmlEnum
public enum VideoAdDisplayFormat {

    TRUE_VIEW_IN_SEARCH,
    TRUE_VIEW_IN_SLATE,
    TRUE_VIEW_IN_DISPLAY,
    TRUE_VIEW_IN_STREAM,
    STANDARD_IN_STREAM,
    ALL;

    public String value() {
        return name();
    }

    public static VideoAdDisplayFormat fromValue(String v) {
        return valueOf(v);
    }

}

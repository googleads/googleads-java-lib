
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoAdDisplayFormat.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoAdDisplayFormat.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRUE_VIEW"/>
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoAdDisplayFormat.Type")
@XmlEnum
public enum VideoAdDisplayFormatType {

    TRUE_VIEW,
    STANDARD,
    ALL;

    public String value() {
        return name();
    }

    public static VideoAdDisplayFormatType fromValue(String v) {
        return valueOf(v);
    }

}

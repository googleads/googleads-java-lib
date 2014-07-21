
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoSearchSelector.SearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoSearchSelector.SearchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="CHANNEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoSearchSelector.SearchType")
@XmlEnum
public enum VideoSearchSelectorSearchType {

    VIDEO,
    CHANNEL;

    public String value() {
        return name();
    }

    public static VideoSearchSelectorSearchType fromValue(String v) {
        return valueOf(v);
    }

}

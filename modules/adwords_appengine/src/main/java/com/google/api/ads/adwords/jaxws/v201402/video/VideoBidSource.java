
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoBid.Source.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoBid.Source">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TARGETING_GROUP"/>
 *     &lt;enumeration value="CRITERION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoBid.Source")
@XmlEnum
public enum VideoBidSource {

    TARGETING_GROUP,
    CRITERION;

    public String value() {
        return name();
    }

    public static VideoBidSource fromValue(String v) {
        return valueOf(v);
    }

}

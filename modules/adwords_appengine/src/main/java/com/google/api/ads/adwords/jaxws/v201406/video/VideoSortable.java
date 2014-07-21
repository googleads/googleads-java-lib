
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoSortable.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoSortable">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TITLE"/>
 *     &lt;enumeration value="DATE_UPLOADED"/>
 *     &lt;enumeration value="DURATION"/>
 *     &lt;enumeration value="CHANNEL"/>
 *     &lt;enumeration value="VIEW_COUNT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoSortable")
@XmlEnum
public enum VideoSortable {

    TITLE,
    DATE_UPLOADED,
    DURATION,
    CHANNEL,
    VIEW_COUNT,

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

    public static VideoSortable fromValue(String v) {
        return valueOf(v);
    }

}


package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoImage.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoImage.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MEDIA"/>
 *     &lt;enumeration value="DEFAULT_THUMBNAIL"/>
 *     &lt;enumeration value="THUMBNAIL1"/>
 *     &lt;enumeration value="THUMBNAIL2"/>
 *     &lt;enumeration value="THUMBNAIL3"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoImage.Type")
@XmlEnum
public enum VideoImageType {

    MEDIA("MEDIA"),
    DEFAULT_THUMBNAIL("DEFAULT_THUMBNAIL"),
    @XmlEnumValue("THUMBNAIL1")
    THUMBNAIL_1("THUMBNAIL1"),
    @XmlEnumValue("THUMBNAIL2")
    THUMBNAIL_2("THUMBNAIL2"),
    @XmlEnumValue("THUMBNAIL3")
    THUMBNAIL_3("THUMBNAIL3"),

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    VideoImageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoImageType fromValue(String v) {
        for (VideoImageType c: VideoImageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

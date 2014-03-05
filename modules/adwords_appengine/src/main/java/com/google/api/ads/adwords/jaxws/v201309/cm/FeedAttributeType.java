
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedAttribute.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedAttribute.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INT64"/>
 *     &lt;enumeration value="FLOAT"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="URL"/>
 *     &lt;enumeration value="DATE_TIME"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedAttribute.Type")
@XmlEnum
public enum FeedAttributeType {

    @XmlEnumValue("INT64")
    INT_64("INT64"),
    FLOAT("FLOAT"),
    STRING("STRING"),
    BOOLEAN("BOOLEAN"),
    URL("URL"),
    DATE_TIME("DATE_TIME"),

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    FeedAttributeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedAttributeType fromValue(String v) {
        for (FeedAttributeType c: FeedAttributeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

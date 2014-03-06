
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="TOGGLE"/>
 *     &lt;enumeration value="DROP_DOWN"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomFieldDataType")
@XmlEnum
public enum CustomFieldDataType {


    /**
     * 
     *                 A string field. The max length is 255 characters.
     *               
     * 
     */
    STRING,

    /**
     * 
     *                 A number field.
     *               
     * 
     */
    NUMBER,

    /**
     * 
     *                 A boolean field. Values may be "true", "false",
     *                 or empty.
     *               
     * 
     */
    TOGGLE,

    /**
     * 
     *                 A drop-down field. Values may only be the ids
     *                 of {@link CustomFieldOption} objects.
     *               
     * 
     */
    DROP_DOWN,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CustomFieldDataType fromValue(String v) {
        return valueOf(v);
    }

}
